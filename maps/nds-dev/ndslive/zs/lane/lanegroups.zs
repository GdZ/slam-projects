/*!

# Lane Groups

This package defines lane groups. Lane groups are used to order lanes. They act
as containers for lanes and as topology elements.

**Dependencies**

!*/

package lane.lanegroups;

import lane.reference.types.*;
import core.geometry.*;
import core.types.*;

import lane.types.*;
import lane.lanes.*;

/*!

## Lane Group Types

There are different types of lane groups. Each type is used to model a
certain aspect of real-world road topology. The following types are available:

- [Road lane groups](#road-lane-groups)
- [Intersection lane groups](#intersection-lane-groups)
- [Border lane groups](#border-lane-groups)
- [Fork lane groups](#fork-lane-groups)
- [Artificial road lane groups](#artificial-road-lane-groups)
- [Artificial intersection lane groups](#artificial-intersection-lane-groups)

Every lane group definition has an identifier and a type, as well as the information
whether the lane group uses boundary geometry or not.

!*/

rule_group LaneGroupRules
{
  /*!
  Unique Lane Group ID:

  The lane group ID shall be unique per tile.
  !*/

  rule "lane-056h7o";

  /*!
  Lane Group ID Not with Value 0:

  `LaneGroup.LaneGroupId` shall not have the value 0. It is a special value
  reserved for lane group connectors that are terminators.
  !*/

  rule "lane-xnvp6h";
};

/**
  * Container for lanes including a type and additional information, for example,
  * whether the lane group has boundary geometries.
  */
struct LaneGroup
{
    /** Identifier of the lane group. */
    LaneGroupId   id;

    /** Type of the lane group. */
    LaneGroupType type;

    /** Indicator whether the lane group has boundary geometries. */
    bool hasBoundaryGeometry;

    /** Lane group choice based on the lane group type. */
    LaneGroupChoice(type, hasBoundaryGeometry) laneGroup;
};

/** Type of lane group that represents a certain aspect of real-world topology. */
enum uint8 LaneGroupType
{
  /** Road lane group. */
  ROAD,

  /** Intersection lane group. */
  INTERSECTION,

  /** Border lane group. */
  BORDER,

  /** Fork lane group. */
  FORK,

  /** Artificial road lane group. */
  ARTIFICIAL_ROAD,

  /** Artificial intersection lane group. */
  ARTIFICIAL_INTERSECTION,
};

choice LaneGroupChoice(LaneGroupType type, bool hasBoundaryGeometry) on type
{
  case ROAD:
        RoadLaneGroup(hasBoundaryGeometry) road;
  case INTERSECTION:
        IntersectionLaneGroup(hasBoundaryGeometry) intersection;
  case BORDER:
        BorderLaneGroup border;
  case FORK:
        ForkLaneGroup fork;
  case ARTIFICIAL_ROAD:
        ArtificialRoadLaneGroup(hasBoundaryGeometry) artificialRoad;
  case ARTIFICIAL_INTERSECTION:
        ArtificialIntersectionLaneGroup artificialIntersection;
};

/*!

## Road Lane Groups

Road lane groups order adjacent lanes that can be physically traversed. A
road lane group spans the entire road surface from curb to curb. Independent
of their travel direction, all existing lanes between the two curbs are
contained in one lane group.

Road lane groups have a digitization direction that helps ordering the lanes.
A road lane group can be connected to all other lane group types and has one
connection at the start and one at the end. If the layout of lanes changes, a
new road lane group is introduced. There are no splits and merges within a road
lane group.

Road lane groups are digitized from their start connector to their end connector.

The following figure shows the logical layout of two road lane groups. Road
lane group 1 is cut because the lane layout changes, that is,
the bottom lane splits into two lanes.

__Note:__
The figure represents logical entities only, it does not show any
geometries.

![Road lane groups](assets/road_lane_groups.png)

The following figure shows the logical layout of two road lane groups that are
connected at a tile border. Because the lane layout is the same on both sides
of the tile border, no border lane group or fork lane group is required. The
digitization direction of the two lane groups can differ, the application is
responsible for connecting the lane groups across the tile border.

__Note:__
The figure represents logical entities only, it does not show any
geometries.

![Road lane groups at tile borders](assets/road_lane_groups_at_tile_border.png)

In general, road lane groups are cut when crossing a tile border. However,
to avoid very short lane groups, this cutting does not follow strict rules.
Instead, road lane groups should be cut within a meaningful vicinity of the
tile border.

The following figure shows the cut between two road lane groups that is made
in the vicinity of the tile border. Even though a logical cut is possible
in tile B, it would generate a very short lane group in that tile.
To avoid this, the road lane group is only cut in tile C.
Road lane group 1 is stored in tile A and road lane group 2 is stored in tile C.
The lane group connectors are positioned on the intersection of the four
tile borders.

![Road lane group cut on tile corner](assets/road_lane_group_cut_border_corner.png)

!*/

rule_group RoadLaneGroupRules
{
  /*!
  Lane Traversability in Road Lane Groups:

  Lanes of a road lane group shall be physically traversable. They shall not
  be separated by physical dividers, which means that no lane shall have a
  physical divider boundary element to an adjacent lane. Physical divider
  boundaries shall only be used on the outermost lane boundaries.
  !*/

  rule "lane-07o2e7";

  /*!
  Lane Ordering in Road Lane Groups:

  Lanes of a road lane group shall be ordered from right to left in
  digitization direction of the lane group.
  !*/

  rule "lane-08fsvu-I";

  /*!
  No Lane Crossing in Road Lane Groups:

  Lanes of a road lane group shall not cross each other.
  !*/

  rule "lane-0a4w62";

  /*!
  Road Lane Groups Starting or Ending at Tile Borders:

  If a road lane group starts or ends at a tile border, it shall have the same
  number of lanes as the adjacent lane group on the other side of the tile border.
  !*/

  rule "lane-0apb5s";

  /*!
  Cutting of Road Lane Group at Tile Borders:

  Road lane groups shall be cut directly at tile borders or in the near
  vicinity of the tile border to avoid unnecessary small lane groups.
  !*/

  rule "lane-2kjtnf-I";

  /*!
  Road Lane Groups Overlapping Tile Borders:

  If a road lane group briefly overlaps a tile border but does not clearly cross it,
  the road lane group shall not be cut. The road lane group shall be stored in
  the tile that contains the biggest portion of the road lane group.
  !*/

  rule "lane-2mbbv3-I";

  /*!
  Perpendicular Cutting of Road Lane Groups:

  If possible, road lane groups shall be cut nearly perpendicular to the flow of
  the road surface, that is, perpendicular to both curbs or end of roads
  that are the natural boundaries of the road.
  !*/

  rule "lane-2mbiiw-I";
};

/**
  * Lane group that spans the entire road surface from curb to curb and
  * independent of the travel direction of the existing lanes between the two
  * curbs.
  */
struct RoadLaneGroup(bool hasBoundaryGeometry)
{
  /** Set to `true` if the lane group starts at a tile border. */
  bool startOnBorder;

  /** Set to `true` if the lane group ends at a tile border. */
  bool endOnBorder;

  /** Lane group connector at the start of the lane group. */
  LaneGroupConnector(startOnBorder) startConnector;

  /** Lane group connector at the end of the lane group. */
  LaneGroupConnector(endOnBorder) endConnector;

  /**
    * List of lanes within the lane group, ordered from right to left in
    * digitization direction of the lane group.
    */
  Lane(LaneLayoutType.ORDERED, hasBoundaryGeometry) lanes[];
};

/*!

## Intersection Lane Groups

Intersection lane groups contain lanes within an intersection. An intersection
lane group always covers a complete intersection. It is mainly used to model urban
intersections of any type. Lanes within an intersection lane group do not follow
a specific order, but have dedicated relations to other lanes within
the lane group. These relations indicate whether lanes are adjacent or cross each
other. Lanes within an intersection lane group may split and merge as well as
cross each other.

The following figure shows an intersection lane group that is connected to five
road lane groups. The lanes within the intersection lane group cross each other.
The left side shows all lanes in the intersection. The right side only shows
lanes that are relevant for road lane group 5, including the corresponding
lane IDs.

__Note:__
The figure represents logical entities only, it does not show any
geometries.

![Intersection lane group](assets/intersection_lane_group.png)

To simplify the layout of lane groups, intersection lane groups are generated
in such a way that they encompass all special cases that can occur in the
vicinity of an intersection. For example, this includes staggered or diagonal
stop lines or waiting lines as well as U-turn paths or lanes being only separated
by gore, rather than being physically divided from each other.

The following figure shows a situation where the intersection lane group is extended
beyond its natural boundaries to include all the staggered stop lines of the
approaching lanes.

![Intersection lane group with staggered stop lines](assets/intersection_staggered_stop_lines.png)

!*/

rule_group IntersectionLaneGroupRules
{
  /*!
  Connection of Intersection Lane Groups to Lane Group Types:

  Intersection lane groups shall only be connected to lane groups of the types
  `ROAD`, `ARTIFICIAL_ROAD`, `FORK`, or `BORDER`.
  !*/

  rule "lane-0c5b48";

  /*!
  Cutting of Intersection Lane Groups:

  Intersection lane groups shall be big enough so that all incoming road lane groups
  can be cut at a nearly perpendicular angle. All staggered or diagonal stop lines as
  well as gore areas shall be part of the intersection.
  !*/

  rule "lane-2mk7e8-I";
};

/** Container for all lanes that belong to an intersection. */
struct IntersectionLaneGroup(bool hasBoundaryGeometry)
{
  /**
    * Unordered list of lane group connectors that are attached to the
    * intersection.
    */
  LaneGroupConnector(false) intersectionConnectors[];

  /** Unordered list of lanes within the intersection. */
  Lane(LaneLayoutType.UNORDERED, hasBoundaryGeometry) lanes[];
};

/*!

## Border Lane Groups

Border lane groups are connector lane groups that are artificially introduced to
keep the lane model self-contained in each tile. Border lane groups only contain
logical lane connections, that is, an ordered list of zero-length lanes.

Border lane groups are used at tile borders to fulfill the rule that connected
lane groups at tile borders shall have the same lane layout: Both lane
groups have the same number of lanes and these lanes have a logical one-to-one
connection to their counterparts on the other tile border based on their position
in the lane list. The digitization direction of the connected lane groups may differ.

A border lane group shares its border coordinate with the connected lane group
in the adjacent tile to ensure connectivity of the lane groups.
The lanes within the lane groups are connected based on their position in the
lane list.

For example, border lane groups are required in the following situations:

- An intersection lane group spanning over a tile border must be connected to a
  road lane group in the adjacent tile. A border lane group is added to the end
  of the intersection lane group to match the lane layouts.

- A road lane group or artificial lane group whose lanes merge or split exactly
  at the tile border must be split. A border lane group is introduced to connect
  the adjacent road lane groups.

The following figure shows a scenario where a lane split occurs at the tile border.
The road lane group in tile A has only two lanes, while the road lane group in
tile B has three lanes. The border lane group is introduced to ensure logical
one-to-one connections between the lanes in the two road lane groups. Because
lane 92 in tile A splits into lanes 46 and 47 in tile B, the border lane group
contains three zero-length lanes to match the lane layout in tile B.

__Note:__
The figure represents logical entities only, it does not show any
geometries.

![Border lane group](assets/border_lane_group.png)

The following figure shows an intersection that crosses a tile border in the real
world. To ensure connectivity to road lane group 34 in the other tile, the complete
intersection lane group plus a border lane group are stored on the left side of
the tile border.

![Intersection at tile border](assets/border_lane_group_intersection.png)

Additional characteristics of border lane groups:

- A border lane group is always directed towards the tile border, that is, its
  start is connected to one or more intersection lane groups or road lane groups
  in the tile that contains the border lane group.
- References to the lanes in the adjacent tiles are not stored explicitly.
- No attributes can be assigned to zero-length lanes.

**Additional examples**

The following figure shows a scenario where two road lane groups in tile A
need to be matched to one road lane group in tile B. Additionally, there is a lane
split.

![Border lane group simple examples](assets/border_lane_group_examples.png)

The same scenario can be modeled with just two zero-length lanes in the border
lane group. In that case, a further border lane group has to be introduced in the
other tile so that the lane layout is the same across the tile border.
This modeling solution is shown in the following figure:

![Border lane group simple examples](assets/border_lane_group_examples_2.png)

When a road lane group splits into two other road lane groups, introducing a
fork lane group is usually sufficient to model the connectivity. However, if one
of the connected road lane groups is stored in another tile, it is necessary to
introduce a fork lane group as well as a border lane group.

In the following example, road lane group A1 splits into road lane groups A2 and
B7. Because there is a tile border between the fork lane group and the road lane
group B7, a border lane group has to be introduced to fulfill the rule that the
end connector of a fork lane group must not be located directly on a tile
border. The border lane group then connects the fork lane group to road lane
group B7.

![Fork lane group connected to border lane group](assets/border_and_fork_lane_group.png)

Sometimes it is not just optional, but necessary to add border lane groups on
both sides of the tile border, for example, if no logical one-to-one connections
are possible even though the number of lanes in the two road lane groups is
identical. In the following figure both road lane groups have 5 lanes each,
but both road lane groups also have merging lanes. By introducing border lane
groups on both sides of the tile border, an application can connect lanes 30 and
31 to lane 62 from left to right, and it can connect lanes 63 and 64 to lane 32
from right to left. The lane layout is the same on both sides of the tile border
because both border lane groups contain four zero-length lanes.

![Border lane groups on both sides of tile border](assets/border_lane_group_corner_case.png)

!*/

rule_group BorderLaneGroupRules
{
  /*!
  Ordering of Zero-Length Lanes in Border Lane Groups:

  Zero-length lanes in a border lane group shall be ordered from right to left
  in digitization direction of the lane group.
  !*/

  rule "lane-0cvq72-I";

  /*!
  Lane Number in Border Lane Groups:

  A border lane group shall have the same number of lanes as the lane group on
  the other side of the tile border.
  !*/

  rule "lane-0dbx6w";

  /*!
  Intersection Lane Group Crossing Tile Border:

  If an intersection lane group crosses a tile border, then a border lane
  group shall be added to the end of the intersection lane group to ensure
  connectivity to a road lane group in the adjacent tile.
  !*/

  rule "lane-0f6q3n";

  /*!
  No Assignment of Attributes to Border Lane Groups:

  No attributes shall be assigned to border lane groups because such lane groups
  contain only zero-length lanes.
  !*/

  rule "lane-7tcxtz";
};

/**
  * Artificially introduced lane group to keep the lane model self-contained in
  * each tile. Contains only zero-length lanes.
  */
struct BorderLaneGroup
{
  /** Start connectors of the border lane group (one or more). */
  LaneGroupConnector(false) startConnector[] : lengthof(startConnector) > 0;

  /** End connector of the border lane group, located on the tile border. */
  LaneGroupConnector(true) endConnectorBorder;

  /** List of zero-length lanes in the border lane group. */
  ZeroLengthLane(true) lanes[];
};

/*!

## Fork Lane Groups

Fork lane groups are artificially introduced when the lane group topology needs
to be forked and no intersection lane group is required. This applies to
bifurcations and cases where lane groups merge or split, but their lanes keep a
clear order of adjacency, for example, at motorway entries or exits. Without
introducing a fork lane group, such lane groups would violate the rule that lanes
within one road lane group shall not be separated by physical dividers.
In addition, fork lane groups can be used if one lane group needs to be connected
to two other lane groups of different types, for example, in a bypass scenario.

Fork lane groups are topological connector lane groups that have no spatial extent
in reality. They only store lane connectivity information, but no geometry. Fork
lane groups only provide logical lane connections using zero-length lanes. These
lanes are ordered and do not cross each other.

Fork lane groups have a digitization direction and can have multiple lane
groups of different types attached on each side.

Zero-length lanes may split and merge at the start-connector side and at the
end-connector side of the fork lane group.
No attributes can be assigned to zero-length lanes.

The following figure shows an exit scenario on a motorway. Vehicles cannot travel
from lane 32 to 17 and vice versa. Therefore, lane 17 is modeled as a separate
lane group. Because road lane group 3 is connected to two other road lane groups,
a zero-length fork lane group is introduced in between.

__Note:__
The figure represents logical entities only, it does not show any
geometries.

![Fork lane group](assets/fork_lane_group.png)

The following figure shows schematic examples of scenarios where fork lane groups
are required or forbidden, or at least not recommended.

- Examples A2, B2, and C2 violate the rule that only one lane group can be
  connected to the start and end of a road lane group.
- Example B3 violates the rule that no splits or merges may occur within a fork
  lane group (see `#lane-0nv2fi`).

![Fork lane group examples](assets/fork_lane_group_examples.png)

!*/

rule_group ForkLaneGroupRules
{
  /*!
  Connection of Fork Lane Groups to Lane Group Types:

  Fork lane groups shall only be connected to lane groups of type
  `ROAD`, `ARTIFICIAL_ROAD`, `BORDER`, `INTERSECTION`, or `ARTIFICIAL_INTERSECTION`.
  !*/

  rule "lane-0ggtpp";

  /*!
  Ordering of Zero-length Lanes in Fork Lane Groups:

  Zero-length lanes in a fork lane group shall be ordered from right to left
  in digitization direction of the lane group.
  !*/

  rule "lane-0h0nvm-I";

  /*!
  No Lane Crossing in Fork Lane Groups:

  Lanes in a fork lane group shall not cross each other.
  !*/

  rule "lane-0h8ky7";

  /*!
  Location of Connectors in Fork Lane Groups:

  The end connectors of fork lane groups shall not be located on tile borders.
  !*/

  rule "lane-0hggga";

  /*!
  Number of Connectors in Fork Lane Groups:

  A fork lane group shall have at least two start connectors or two end
  connectors, that is, it shall never have only one start and one end connector.
  For example, a fork lane group can have one start connector and two end connectors.
  !*/

  rule "lane-0kv32h";

  /*!
  Lane Connection in Fork Lane Groups:

  All lanes of the fork lane group shall be connected to lanes of connected
  lane groups, that is, no lane shall start or end within the fork lane group.
  !*/

  rule "lane-0m8j6f";

  /*!
  No Lane Splitting and Merging in Fork Lane Groups

  All lane connectors in `lanes.previousLanes` and `lanes.nextLanes` of a fork lane
  group shall be distinct, that is, each lane ID shall be unique across the two
  arrays.
  !*/

  rule "lane-0nv2fi";

  /*!
  No Assignment of Attributes in Fork Lane Groups:

  No attributes shall be assigned to fork lane groups because such lane groups
  contain only zero-length lanes.
  !*/

  rule "lane-rpxa5q";
};

/**
  * Artificially introduced lane group when the lane group topology needs to be
  * forked and no intersection lane group is required. For example, this applies
  * to bifurcations. Contains only zero-length lanes.
  */
struct ForkLaneGroup
{
  /** Start connectors of fork lane group (one or more). */
  LaneGroupConnector(false) startConnector[] : lengthof(startConnector) > 0;

  /** End connectors of fork lane group (one or more). */
  LaneGroupConnector(false) endConnector[] : lengthof(endConnector) > 0
                                                         &&
                                                         (lengthof(startConnector) > 1
                                                          ||
                                                          lengthof(endConnector) > 1);

  /** List of zero-length lanes in the fork lane group. */
  ZeroLengthLane(false) lanes[];
};

/*!

## Artificial Road Lane Groups

Artificial road lane groups ensure full lane group coverage even in areas where
no detailed lane information is available in the source data. To keep lane
groups and lane topology in the same model, other data such as road geometry,
number of lanes, or lane width, is used to populate lanes and lane groups.

The center line of a lane can be derived from the road geometry. For example, all
center line references point to one geometry.

An artificial road lane group is similar to a road lane group, but applications do
not treat it as a real lane group because its data is purely derived. Artificial
road lane groups are almost in all cases too inaccurate for lane use cases
other than to maintain overall connectivity in the lane group topology.

To realize complete parts of a topology network with artificial lane groups only,
artificial road lane groups that cross real-world intersections may be connected
to [artificial intersection lane groups](#artificial-intersection-lane-groups).

Artificial road lane groups are digitized from their start connector to their
end connector.

!*/

rule_group ArtificialLaneGroupRules
{
  /*!
  Lane Ordering in Artificial Lane Groups:

  Lanes in artificial lane groups shall be ordered from right to left in
  digitization direction of the lane group.
  !*/

  rule "lane-0nx34g-I";

  /*!
  No Lane Crossing in Artificial Lane Groups:

  Lanes in artificial lane groups shall not cross each other.
  !*/

  rule "lane-0pi7ak";

  /*!
  Artificial Lane Groups Starting or Ending at Tile Border

  If an artificial lane group starts or ends at a tile border, then it shall
  have the same number of lanes as the adjacent lane group on the other side
  of the tile border.
  !*/

  rule "lane-0qayop";

  /*!
  Connection of Artificial Road Lane Groups to Fork Lane Groups:

  If an artificial road lane group is connected to a fork lane group, all
  lanes of the road lane groups shall only have one-to-one lane connections
  into the respective fork lane group.
  !*/

  rule "lane-0qst3r";
};

/**
  * Artificially introduced road lane group that is used to ensure full lane
  * group coverage in areas where no detailed lane information is available in
  * the source data.
  */
struct ArtificialRoadLaneGroup(bool hasBoundaryGeometry)
{
  /** Set to `true` if the artificial road lane group starts at a tile border. */
  bool startOnBorder;

  /** Set to `true` if the artificial road lane group ends at a tile border. */
  bool endOnBorder;

  /** Start connector of the artificial road lane group. */
  LaneGroupConnector(startOnBorder) startConnector;

  /** End connector of the artificial road lane group. */
  LaneGroupConnector(endOnBorder) endConnector;

  /** List of lanes in the artificial road lane group. */
  Lane(LaneLayoutType.ORDERED, hasBoundaryGeometry) lanes[];
};

/*!

## Artificial Intersection Lane Groups

An artificial intersection lane group contains lanes within an intersection. It
always covers a complete intersection.

Artificial intersection lane groups are used to model urban intersections of any
type when no highly accurate data is available. Lanes within an artificial
intersection lane group do not follow a specific order and are stored with
zero-length, which means that lanes are only logically connected across the
intersection.

Lanes within an artificial intersection lane group may split and merge as well
as cross each other, but these lane relations are not expressed within the structure.

!*/

rule_group ArtificialIntersectionLaneGroupRules
{
  /*!
  Connection of Artificial Intersection Lane Groups to Lane Group Types:

  Artificial intersection lane groups shall only be connected to lane groups
  of the types `ARTIFICIAL_ROAD`, `BORDER`, or `ROAD`.
  !*/

  rule "lane-0qt2ek";
};

/**
  * Artificially introduced intersection lane group that is used to model urban
  * intersections of any type when no highly accurate data is available.
  */
struct ArtificialIntersectionLaneGroup
{
  /**
    * Unordered list of lane group connectors in the artificial intersection
    * lane group.
    */
  LaneGroupConnector(false) intersectionConnectors[]
                                                      : lengthof(intersectionConnectors) > 2;

  /**
    * List of zero-length lanes in the artificial intersection lane group.
    */
  ZeroLengthLane(false) lanes[];
};

/*!

## Lane Group Connectors

A lane group connector is an entity at the start and end of a lane group. The lane
group connector contains a position and the identifier of the connected lane
group.

If a lane group connector is located on or moved to a tile border, the identifier of the
connected lane group in the adjacent tile is not referenced.
That way, the lane group connector remains self-contained in each tile.
The connectivity between the two lane groups is achieved by using the same
position in both tiles and by indicating the adjacent tile that contains
the counterpart. Moving a lane group connector to a tile border can be
necessary, for example, if an intersection lane group crosses the tile border and
the connector is located in the adjacent tile.

The following figure shows road lane groups with their start and end connectors.
The start or end connector of a lane group shares the same position with the
start or end connector of the next lane group. Road lane group 5 ends at a tile
border. The lane group's position on the tile border does not correspond to the
exact location of the road lane group.

__Note:__
The figure represents logical entities only, it does not show any
geometries.

![Lane group connectors](assets/lane_group_connectors.png)

!*/

rule_group LaneGroupConnectorRules
{
  /*!
  Connections of Lane Group Connectors:

  A lane group connector shall not connect to the lane group that it is stored in.
  !*/

  rule "lane-0rx88b";

  /*!
  Lane Group Connector as Terminator:

  If a lane group connector is a terminator, meaning that the lane group starts
  or ends, then `connectedLaneGroupId` shall use the value `LaneGroupId.id = 0`.
  !*/

  rule "lane-0tigwk";

  /*!
  Position of Lane Group Connectors in Connected Lane Groups:

  If two lane groups are connected, then the corresponding lane group connectors
  shall be located at the same position. Each of these lane group connectors
  refers to the lane group ID of the other lane group.
  Example: The end of road lane group A is connected to the start of road lane
  group B. The value of `endConnector.position` in road lane group A shall
  correspond to the value of `startConnector.position` in road lane group B.

  !*/

  rule "lane-9zyg70";

  /*!
  Lane Group Connector on Tile Border:

  If the lane group connector is located on or moved to a tile border, it shall
  indicate in which tile the counterpart lane group and its connector can be found.
  The position of both connectors shall be the same and shall lie on the tile
  border or in the vicinity of the shared tile border.
  !*/

  rule "lane-0ubvfp";
};

/**
  * Connector at the start and end of a lane group that allows to find the
  * previous and next lane groups.
  */
struct LaneGroupConnector(bool onBorder)
{
  /** Full resolution geo position of the lane group connector. */
  Position3D(0,0) position;

  /**
    * Identifier of the connected lane group if the connector is not located on
    * a tile border.
    */
  LaneGroupId connectedLaneGroupId if !onBorder;

  /** Indicator in which adjacent tile a matching border position can be found. */
  TileBorderIndicator borderIndicator if onBorder;
};

/*!

## Matched Lane Group Segment

A matched lane group segment is a list of matched lane groups that form a
segment of a matched lane group path.

!*/

rule_group MatchedLaneGroupSegmentRules
{
  /*!
  Connectivity of Lane Groups in Matched Lane Group Segment:

  The lane groups that are referenced in a `MatchedLaneGroupSegment` shall be
  connected, that is, there shall be no gaps between the lane groups.
  !*/

  rule "lane-gxw3bi";
};

/**
  * Contains a list of matched lane groups that form a segment of a matched lane
  * group path.
  */
struct MatchedLaneGroupSegment
{
  /** Lane group references to the matched lane groups. */
  LaneGroupId matchedLaneGroups[];
};

/*!

## Using Lane Groups for Route Calculation

On different levels, lane tiles contain lane information with different degrees
of detail regarding the underlying road network. On less-detailed levels,
aggregated lane groups can be used for routing purposes. On these levels,
it is likely that the lane layers only contain artificial lane groups because
detailed geometries are not required for routing purposes.

Lane groups are connected across tiles from different levels using their
lane group connectors. If the position of the connector of an aggregated lane
group on an upper level equals the position of a lane group connector on a lower
level, then both connectors represent the same connection in the real world,
allowing the routing algorithm to change between the levels.

An application can connect lane groups across tiles on different levels by
comparing the lane group connectors inside the lane group lists. The application
can create virtual upward and downward references by relating all lane group
connectors that have the same position on different levels. Therefore, all lane
groups that are required for virtual upward and downward references are stored
on all relevant levels.

__Note:__
If a lower level contains a border lane group on the tile border, then
this border lane group is stored as a fork lane group on the upper level, unless
the lane group is still located on the tile border on that level.

The following figure shows a different levels with routing information using lane
groups. The lane group network on level 13 is more detailed than the lane group
network on levels 12 and 11. On levels 12 and level 11, several lower-level road
lane groups and intersection lane groups are aggregated to artificial
road lane groups. The first and the last lane group connectors of an aggregated
road lane group on level 12 have the same positions as the related lane group
connectors on level 13.

__Note:__
The figure is simplified and only indicates where connectors are relevant to
match lane groups between different levels. For example, it does not include any
intersection lane groups, fork lane groups, or border lane groups. The figure
only demonstrates where connectors are relevant for matching lane groups between
levels.

![Aggregated lane groups and intersections](assets/aggregation_lane_groups_3levels.png)

To correctly resolve the downward references of an aggregated artificial road
lane group, an application needs to do the following:

1. Identify the start and end positions of the lane group connectors on the
   road lane group of the upper level and remember the functional road class of the relevant lane(s).
1. On the next lower level, find the lane groups with the same connector position as
   the start connector of the lane group on the upper level.
1. Identify lanes of these lane groups that have the relevant functional road class.
1. Replace the set of considered lanes by the connected ones that have the relevant functional road class
   or which are zero-length lanes (which don't have a functional road class).
1. Continue until the connector position of one of the associated lane groups on the lower level
   matches the position of the end connector on the upper level.

To ensure stable topological connections, it can be necessary to never change the
position of lane group connectors over the map lifetime.

!*/

rule_group LaneTilesRoutingLevelsRules
{
  /*!
  No Aggregation of Road Lane Groups with Different Functional Road Class:

  Two road lane groups shall not be aggregated if they belong to different functional
  road classes.

  !*/

  rule "lane-mcvvb2";

  /*!
  No Loops in Aggregated Road Lane Groups:

  To maintain the correct topology of the routing network, road lane groups
  shall not be aggregated if the result would form a loop.

  !*/

  rule "lane-pbwh2c";

  /*!
  Same Coordinate Shift on All Levels of the Lane Tile:

  All levels of a lane tile shall have the same coordinate shift.

  !*/

  rule "lane-020ekf";
};
