/*!

# Road Reference Types

This packages defines references for roads and transitions.
These references allow to link attributes to road features.
This package also defines validities for these references.

!*/

package road.reference.types;

import core.types.*;
import core.geometry.*;
import core.location.*;

/*!

## Road References

A road reference can be directed or undirected. If a reference is undirected,
the road is affected in both directions, that is, in digitization direction and
against digitization direction.

Road references can either refer to a road by road ID or by geometry using an
indirect approach that requires map matching. For exact map matching, an
application can use the unique combination of coordinate and intersection z-level.
If no intersection z-level values are available or if road references originate from a
different map, the application can use the reference geometry to match maps
based on the distance of roads.

Road references on intersections use a directed road reference. The direction of
the reference indicates whether the intersection is the start or the end of the
road. An intersection road reference also includes an intersection sector. The
intersection sector is the angle at which the road is connected to the intersection
in 256 sectors of ~1.4 degrees each, counting clockwise from north.
The point for determining the intersection sector should be located 15 meters
from the start or end of the road. If a road is shorter
than 15 meters, then the last point of the road may be used.

The following figure illustrates the calculation of the intersection sector.
The angle alpha (α) at the start intersection of the road has 55 degrees, which
corresponds to intersection sector 39. The angle beta (β) at the end
intersection of the road has 305 degrees, which corresponds to intersection
sector 216.

![Intersection Sector](assets/types-intersection-sector.png)

!*/

rule_group IndirectRoadReferenceRules
{
  /*!
  Indirect Road Reference Contained in Single Tile:

  The reference geometry of an indirect road reference shall be limited to one tile.
  Therefore, reference geometries shall be cut at tile borders.
  This ensures that indirect road references can be used in smart layer tiles
  and smart layer path segments, because they are also partitioned in tiles.
!*/

rule "road.reference-597who";
};

/** Road reference using a road ID. */
struct RoadReference
{
  /** Set to `true` if the road reference has a direction. */
  bool isDirected;

  /** Reference to a road including the direction. */
  DirectedRoadReference directedRoadReference if isDirected;

  /** Reference to a road without direction. Both directions are affected. */
  RoadId roadId if !isDirected;
};

/** Indirect road reference using geometry. */
struct RoadReferenceIndirect
{
  /**
    * Set to `true` to indicate that the reference is in the same direction as
    * the geometry.
    * Set to `false` to indicate that the reference is valid for both directions
    * on the geometry.
    * There is no way to indicate that the reference is against the geometry's
    * direction.
    */
  bool isDirected;

  /** Geometry of the reference. */
  LocationGeometry referenceGeometry;

  /** Segments of the reference. */
  LocationSegment(referenceGeometry) referenceSegments[];

  /** z-level information of positions on the reference geometry. */
  optional ReferenceGeometryIntersectionZLevel intersectionZLevel[referenceGeometry.line.numPositions];
};

/**
  * z-level information of positions on the reference geometry. Includes
  * intersections with z-level and additional positions without z-level.
  *
  * z-level information of intersections can be used for exact map matching.
  */
struct ReferenceGeometryIntersectionZLevel
{
  /**
    * Set to `true` if the referenced position on the geometry is an
    * intersection, for example, an artificial intersection.
    * Set to `false` if the referenced position is no intersection.
    */
  bool hasValue;

  /** z-level of the intersection. */
  IntersectionZLevel value if hasValue;
};

/** Road reference on an intersection. */
struct IntersectionRoadReference(bool isArtificial)
{
  /**
    * Directed reference to a road that is attached to the intersection.
    * Positive direction means that the intersection is the start of the
    * road. Negative direction means that this intersection is the end of the
    * road.
    */
  DirectedRoadReference       road;

  /**
    * The angle at which the road is connected to the intersection in sectors of
    * ~1.4 degrees. Value 0 indicates north; values increase clockwise.
    */
  IntersectionSector          angle if !isArtificial;
};

rule_group RoadIdentifierRules
{
  /*!
  Unique Road ID:

  Road IDs shall be unique per tile or object defined by the smart layer service.
  !*/

  rule "road.reference-32xshy";

  /*!
  Unique Intersection ID:

  Intersection IDs shall be unique per tile or object defined by the smart layer service.
  !*/

  rule "road.reference-8q8cvq";
};


/** Identifier of a road. */
subtype Var4ByteId RoadId;

/** Reference to a directed road. */
subtype Var4ByteDirectedReference DirectedRoadReference;

/** z-level of an intersection. */
subtype bit:7 IntersectionZLevel;

/*!

## Transition References

A transition reference describes selected transitions or all transitions of
an intersection.

Transitions are referenced by the ID of the intersection they belong to and a
transition number within the intersection. Transition numbers are assigned
according to a transition matrix of the roads where the transitions start
and the roads where the transitions end.

To form the transition matrix, the roads that are connected to the intersection
are sorted in ascending order by their respective angle against north in
clockwise direction. The first road is always the road with the smallest
angle against north. The rows in the transition matrix correspond to the roads
where the transitions start ("From") and the columns correspond to the roads
where the transitions end ("To").

Transition 0 in the matrix is the transition from the first "From" road to the
first "To" road, that is, a U-turn. Transition 1 is the transition from the
first "From" road to the second "To" road. The last transition is from the last
"From" road to the last "To" road, again describing a U-turn.

The following figure illustrates how the matrix is formed to derive the
transition numbers. In this example, the transition from "From" road 4 to
"To" road 0 has the transition number 4.

![Transition numbers](assets/types-transition-number.png)

For complex intersections, transition path references can be used to point
to a transition across roads or to a transition between geographic
positions.
Transition path references that cross tile borders can only be modeled with
with geographic positions.

!*/

rule_group TransitionReferencesRules
{
  /*!
  Direction of Transition Path Reference:

  `TransitionPathReference` shall be defined in forward direction.
!*/

rule "road.reference-0yp67f";

  /*!
  Start of Directed Road Reference in Transition Paths:

  The `DirectedRoadReference` list of a `TransitionPathReference` shall start
  (idx=0) with the first road of the transition.
!*/

rule "road.reference-0ytkv2";

  /*!
  Transition Paths Crossing Tile Borders:

  If a transition path crosses a tile border, it shall be modeled with
  `TransitionGeoPathReference`.
!*/

rule "road.reference-20bbe8-I";

  /*!
  Storage Location of `TransitionGeoPathReference`:

  If a transition path crosses a tile border, `TransitionGeoPathReference`
  shall only be stored in the tile where the start point of the transition lies.
!*/

rule "road.reference-22969u-I";

  /*!
  Range of `PercentageIndication`:

  Values for `PercentageIndication` shall be between 0.xxxx and 100.0.
!*/

rule "road.reference-2b042k";

  /*!
  No `TransitionReferenceType.TRANSITION` on Tile Borders:

  If a real intersection is located on a tile border, references of type
  `TransitionReferenceType.TRANSITION` shall not be used on that intersection.
  These transitions shall be modelled using `TransitionGeoPathReference` instead.
!*/

rule "road.reference-7hgjr0";

  /*!
  Matching `TransitionGeoPathReference.path` to Road Geometry:

  If `TransitionGeoPathReference` is used to reference a transition, the path
  describing the transition shall be matched to road geometry by the application.
!*/

rule "road.reference-hhowya";

  /*!
  Sorting of Roads for Transition Numbers:

  When deriving transition numbers, the roads connected to an intersection
  shall be sorted in ascending order by their respective angle against north
  in clockwise direction.
!*/

rule "road.reference-erf0qb";
};

/**
  * Reference to one or more transitions of an intersection or to a
  * complete intersection.
  */
struct TransitionReference
{
  /** Type of transition reference. */
  TransitionReferenceType type;

  /**
    * Intersection and transition reference using intersection ID and transition
    * numbers.
    */
  IntersectionTransition(type) intersectionTransition if type == TransitionReferenceType.INTERSECTION
                                                      || type == TransitionReferenceType.TRANSITION;

  /** Transition reference using a path. */
  TransitionPathReference transitionPathReference if type == TransitionReferenceType.TRANSITION_PATH;

  /**
    * Transition reference using a path of geographic positions for use on tile
    * borders.
    */
  TransitionGeoPathReference transitionGeoPathReference if type == TransitionReferenceType.TRANSITION_GEO_PATH;
};

/** Type of transition reference. */
enum uint8 TransitionReferenceType
{
  /** Complete intersection is affected. */
  INTERSECTION,

  /** One or more transitions of the intersection are affected. */
  TRANSITION,

  /**
    * A path over more than one intersection is affected. The path is based
    * on a list of directed road references.
    */
  TRANSITION_PATH,

  /**
    * A path over more than one intersection that goes across tile borders is
    * affected. The path is based on geographic positions that are matched to
    * the road network.
    */
  TRANSITION_GEO_PATH,
};


/**
  * Reference to one or more transitions of an intersection.
  * If the transition reference is of type `TRANSITION`, the reference
  * includes one or more transitions of the intersection. For the other
  * types, only the intersection ID is provided, which means that all
  * transitions of the intersection are affected.
  */
struct IntersectionTransition(TransitionReferenceType type)
{
  /** Identifier of the intersection. */
  IntersectionId    intersectionId;

  /** Number of transitions affected inside the intersection. */
  varsize numTransitions if type == TransitionReferenceType.TRANSITION;

  /** Ordinal number of the transitions of the intersection. */
  TransitionNumber  transitionNumber[numTransitions] if type == TransitionReferenceType.TRANSITION;
};

/** Reference to a transition path across roads. */
struct TransitionPathReference
{
    /** Number of roads that the transition spans across. */
    uint8   numRoads;

    /**
      * List of directed road references ordered from the beginning to the end
      * of the transition.
      */
    DirectedRoadReference   roads[numRoads];
};

/** Reference to a transition path between absolute coordinates. */
struct TransitionGeoPathReference
{
  /** Directed road reference to the road where the transition starts. */
  DirectedRoadReference startRoad;

  /** Full precision path describing the transition. */
  Line2D(0) path;
};

/** Identifier of an intersection. */
subtype varuint32   IntersectionId;

/** Identifier of a transition inside an intersection. */
subtype varuint16   TransitionNumber;

/*!

## Validities of References

A road reference is either valid for a complete road, for a position related to
the road, or for a range between two geographic positions.

Validities either use positions on the road geometry, match independent positions
to the road geometry, refer to a range on the road length, or only describe a
proportional extent on the road.

!*/

/** Validity on a road using positions. */
struct RoadPositionValidity(CoordShift shift)
{
    /** Type of validity. */
    RoadValidityType type : type != RoadValidityType.COMPLETE;

    /** Number of validity positions on the road. */
    varsize numPositions if type != RoadValidityType.COMPLETE
                      : numPositions > 0;

    /** Validity positions on the road. */
    RoadPositionChoice(type, shift) positions[numPositions]
                      if type != RoadValidityType.COMPLETE;
};

/** Validity on a road using one or more ranges. */
struct RoadRangeValidity(CoordShift shift)
{
  /** Type of validity used. */
  RoadValidityType type;

  /** Number of ranges on the road that are affected. */
  varsize numRanges if type != RoadValidityType.COMPLETE
                      : numRanges > 0;

  /** Validity ranges on the road. */
  RoadRangeChoice(type, shift) ranges[numRanges]
                      if type != RoadValidityType.COMPLETE;
};


/**
  * Transition validity is empty since sub-transition validity is impossible.
  */
struct TransitionValidity
{
};

/** Type of validity on a road. */
enum uint8 RoadValidityType
{
  /** The complete road is affected. */
  COMPLETE,

  /**
    * Validity is described by independent positions that are matched onto
    * the road geometry.
    */
  POSITION,

  /** Validity is described by increments of the road length. */
  LENGTH,

  /** Validity is described using the road shape.*/
  GEOMETRY,

  /** Validity is described using the road shape plus offsets. */
  GEOMETRY_OFFSET,

  /**
    * Validity is described using a start and end position percentage value
    * based on the road geometry.
    */
  PERCENTAGE,

  /** Covered extent of the road without describing a start and end position. */
  EXTENT,
};

choice RoadPositionChoice(RoadValidityType type, CoordShift shift) on type
{
  case COMPLETE:
          ;
  case POSITION:
          RoadValidityPosition(shift) validityPosition;
  case LENGTH:
          RoadLengthPosition lengthPosition;
  case GEOMETRY:
          RoadGeometryPosition geometryPosition;
  case GEOMETRY_OFFSET:
          RoadGeometryOffsetPosition(shift) geometryOffsetPosition;
  case PERCENTAGE:
          RoadPercentagePosition percentagePosition;
};

choice RoadRangeChoice(RoadValidityType type, CoordShift shift) on type
{
  case COMPLETE:
          ;
  case POSITION:
          RoadValidityRange(shift) validityRange;
  case LENGTH:
          RoadLengthRange lengthRange;
  case GEOMETRY:
          RoadGeometryRange geometryRange;
  case GEOMETRY_OFFSET:
          RoadGeometryOffsetRange(shift) geometryOffsetRange;
  case PERCENTAGE:
          RoadPercentageRange percentageRange;
  case EXTENT:
          RoadLengthExtent roadLengthExtent;
};

/**
  * Validity position that is matched onto the road geometry. The validity
  * position does not have to be part of the road geometry.
  */
struct RoadValidityPosition(CoordShift shift)
{
  /** Position on the road. */
  Position2D(shift) position;

  /**
    * Optional hint on where the start coordinate is positioned on the road.
    * Helps to correctly identify the position on the target feature in rare
    * cases like zigzag curves.
    */
  optional PercentageIndication positionIndication;
};

/**
  * Validity range on a road using additional positions that are matched to
  * the road geometry.
  */
struct RoadValidityRange(CoordShift shift)
{
  /** Start of the validity. */
  RoadValidityPosition(shift) start;

  /** End of the validity. */
  RoadValidityPosition(shift) end;
};

/** Position on a road based on the provided length of the road. */
struct RoadLengthPosition
{
  /**
    * Road length that was used for the calculation of the position.
    * Can be used to cross check with the road that the attributes are
    * assigned to, for example, to normalize road lengths.
    */
  RoadLength length;

  /** Position on the road. */
  RangePosition(length) position;
};

/** Range on a road based on the provided length of the road. */
struct RoadLengthRange
{
  /**
    * Road length that was used for the calculation of the range.
    * Can be used to cross check with the road that the attributes are
    * assigned to, for example, to normalize ranges.
    */
  RoadLength length;

  /** Range on the road based on the provided length. */
  Range(length) range;
};

/** Length of a road in centimeters. */
subtype LengthCentimeters    RoadLength;

/** Position on a road geometry. */
subtype LinePosition RoadGeometryPosition;

/** Range on a road geometry. */
subtype LineRangeUnchecked RoadGeometryRange;

/** Position on a road geometry with an offset to the underlying geometry. */
subtype LinePositionOffset2D RoadGeometryOffsetPosition;

/** Range on a road geometry with an offset from the underlying geometry. */
subtype LineRangeOffset2D RoadGeometryOffsetRange;

/**
  * Percentage indication for a point on a feature based on the feature length.
  * Allowed value range is between 0.xxxx and 100.0
  */
subtype float16   PercentageIndication;

/** Percentage position on a road geometry. */
subtype PercentagePosition RoadPercentagePosition;

/** Percentage range on a road geometry. */
subtype PercentageRange RoadPercentageRange;

/**
  * Extent on a road. The exact position or range is not described, but only
  * how much extent on the road is covered by the attribute.
  */
subtype LengthCentimeters RoadLengthExtent;
