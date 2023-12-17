/*!

# Roads and Intersections

This package defines roads and intersections of the Road module.

**Dependencies**

!*/

package road.road;

import core.types.*;
import core.geometry.*;

import road.reference.types.*;


/*!

Roads and intersections form the basic topology, which is then attributed.
In their most basic appearance, roads only have an identifier and a length.
In addition, they may have road geometry and attributes assigned.
The road geometry includes the intersection positions so that roads
can be used on their own without having to add positions from intersections.

Roads are tile independent, they are split on tile borders. This is done
by introducing artificial intersections on the tile borders. The application
loads roads from multiple tiles and uses the artificial intersections to
stitch the roads together. The artificial intersections are placed directly on
the tile border. Two corresponding artificial intersections in adjacent tiles
are identified based on their position.

As an exception, the general south-west rule for tiles does not apply to
intersections. By the south-west rule, positions are only stored
in one tile, but intersections on tile borders are explicitly stored in two
adjacent tiles.

Artificial intersections also contain an arbitrary z-level, which is not used for
rendering. The z-level is required to distinguish two overlaying artificial
intersections that have the same 2-dimensional coordinates. This is the case if
two roads cross the tile border at the same position but do not cross each other,
that is, the roads have a different elevation.

The following figure shows two roads that cross the tile border at the same
position but do not have a common intersection in the real world. For the tiles
B and C, both artificial intersections are stored with the same 2-dimensional
coordinates but with different z-levels.

![Artificial intersection with different z-levels per tile](assets/artificial_intersection_zlevel.png)

Intersection and road identifiers are unique within the tile in which they are stored.

The start intersection and the end intersection of a road can be determined by
looking at the intersection list. The `connectedRoads` list contains
directed references. A reference in positive direction indicates the start
intersection of the road. A reference in negative direction indicates the end
intersection of that road.

The following figure shows how roads are connected to artificial intersections
and real intersections.

![Intersections with connected roads](assets/road_start_end_intersection.png)

!*/

rule_group RoadAndIntersectionRules
{
  /*!
  Splitting of Roads at Tile Borders:

  Roads shall be artificially split at tile borders. An artificial
  intersection shall be added on the tile border. Artificial intersections
  shall only be added on tile borders.
  !*/

  rule "road-26o75q";

  /*!
  Roads Along Tile Borders:

  If a road runs along a tile border and is connected to two real intersections
  on the same tile border, then the road shall only be stored in one of the
  neighboring tiles according to the south-west rule.
  !*/

  rule "road-2amgnu";

  /*!
  Intersections on Tile Borders:

  If an intersection is located on a tile border, then the intersection shall be
  stored in both tiles. This rule applies to real-world intersections that are
  located on the tile border and artificial intersections that are created
  because a road crosses the tile border. If a real-world intersection is
  located on a tile border but has no road in the adjacent tile, then an
  artificial intersection with no connected roads shall be created in the
  adjacent tile.

  The following figure demonstrates these three scenarios:

  ![Intersections on tile border](assets/intersections_on_tile_border.png)
  !*/

  rule "road-2b2p2w";

  /*!
  No Intersections with Identical Positions:

  There shall be no two intersections that have the same `position` and `zLevel`
  values.
  !*/

  rule "road-2jb6eo";
};

/** Definition of a road.*/
struct Road
{
    /** Identifier of the road. */
    RoadId      id;

    /** Real-world length of the road in centimeters. */
    RoadLength  length;
};

/** Definition of an intersection.*/
struct Intersection(CoordShift coordShift)
{
    /** Identifier of the intersection. */
    IntersectionId id;

   /**
     * Set to `true` if the intersection is artificially added on a tile
     * border. Set to `false` if a real intersection is located on a tile border.
     */
    bool isArtificial;

    /** z-level of the intersection.*/
    IntersectionZLevel zLevel;

    /** Number of roads that are connected to the intersection within the tile. */
    uint8 numRoads : (numRoads < 181) && (numRoads > 0 || isArtificial);

    /** Position of the intersection.*/
    Position2D(coordShift) position;

align(8):
    /** Directed references to the roads connected to the intersection. */
    IntersectionRoadReference(isArtificial) connectedRoads[numRoads];
};

/*!

## Road and Intersection Lists

Roads and intersections are stored in lists, which are part of
feature or geometry layers in the Road module.

!*/

rule_group RoadAndIntersectionListRules
{
  /*!
  Ordering Lists along Smart Layer Paths:

  If lists are stored in layers that are supplied through a smart layer path
  interface, then the lists shall be ordered from the start to the end of
  the path.
  !*/

  rule "road-2dfpns";

  /*!
  Including Intersection Positions in Road Geometries:

  Road geometries shall include the position of their start and end intersection.
  !*/

  rule "road-2ebabs";

  /*!
  Connectivity of Roads in Matched Road Segment:

  The roads that are referenced in a `MatchedRoadSegment` shall be connected,
  that is, there shall be no gaps between the roads.
  !*/

  rule "road-9fww9m";
};

/** Stores a list of roads. */
struct RoadList
{
    /** List of roads. */
    packed Road    roads[];
};


/** Stores a list of intersections. */
struct IntersectionList(CoordShift shift)
{
    /** List of intersections. */
    packed Intersection(shift)  intersections[];
};

/*!

## Matched Road Segment

A matched road segment is a list of matched roads that form a segment of a
matched road path.

!*/

/** List of matched roads that form a segment of a matched road path. */
struct MatchedRoadSegment
{
  /** Road references to the matched roads.*/
  packed DirectedRoadReference matchedRoads[];
};

/*!

## Routing Information in Road Tiles

Road tiles can contain routing information on different levels. Each level provides a
different degree of detail of the road network. For example, the road network on
level 13 is more detailed than the road network on level 11.
This allows to aggregate roads on upper levels (for example, 0-8) and to minimize
the amount of data that routing applications need to read.

Intersections connect different levels of a road tile. If the position of an
aggregated intersection on an upper level equals the position of an
intersection on a lower level, then they both represent the same
real-world intersection and a routing algorithm can change between the levels.

This mechanism requires the same coordinate shift on all levels of the
road layer, which means that upper levels need the same coordinate
precision for intersections as lower levels.

An application can connect the intersections of two or more tiles on
different levels by comparing their intersection lists. The application can create
virtual upward and downward references by relating all intersections that have
the same position on different levels. Therefore, all intersections that are
required for virtual upward and downward references are stored on all relevant levels.

__Note:__
If a lower level contains an artificial intersection on the tile border, then
this intersection is stored as a normal intersection on the upper level, unless
it is still located on the tile border on that level.

The following figure shows different levels with routing information. The
road network on level 13 is more detailed than the road network on levels 12 and 11.
On levels 12 and level 11, several lower-level roads and intersections are
aggregated to a single feature. The first and the last intersection of an
aggregated road on level 12 have the same positions as the related intersections
on level 13.

![Aggregated roads and intersections](assets/aggregation_intersections_3levels.png)

To correctly resolve the downward references of an aggregated road,
an application needs to do the following:

1. Identify the start and end intersection of an aggregated road on the upper level.
1. On the lower level, find the intersection with the same position as the start intersection.
1. Evaluate the connected roads of that intersection and find the road with the
   same functional road class as the aggregated road on the upper level.
1. Follow that road to the next intersection and evaluate the connected roads
   to find the next road with this functional road class.
1. Continue until the intersection on the lower level matches the end intersection
   on the upper level.

To ensure stable topological connections, it can be necessary to never change the
position of intersections over the map lifetime even if the coordinates change slightly
in reality. This does not influence attribution because the coordinates of
the intersection structure itself are not used for that purpose. The real
position of the intersection is redundantly stored in the road geometry.

!*/

rule_group RoadTilesRoutingLevelsRules
{
  /*!
  No Aggregation of Roads with Different Functional Road Class:

  Two roads shall not be aggregated if they belong to different functional
  road classes.

  !*/

  rule "road-mcvvb2";

  /*!
  No Loops in Aggregated Roads:

  To maintain the correct topology of the routing network, the two intersections
  of a road shall not be aggregated if the result would form a loop.

  !*/

  rule "road-pbwh2c-I";

  /*!
  Same Coordinate Shift on All Levels of the Road Tile:

  All levels of a road tile shall have the same coordinate shift.

  !*/

  rule "road-020ekf";

  /*!
  Identical Angles for Roads Referenced in `connectedRoads` on All Levels:

  To resolve downward references, the angles of the roads that are referenced in
  `connectedRoads` shall be identical on all levels.

  !*/

  rule "road-zghfbb";
};