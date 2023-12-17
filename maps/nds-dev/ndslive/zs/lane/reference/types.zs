/*!

# Lane Reference Types

This package defines identifiers and references for the Lane module. Lane
references allow to assign attributes from attribute modules to lane features
in the Lane module. This package also contains validity information on lanes
for these attributes as well as other identifiers, for example, lane groups
and road surfaces.

**Dependencies**

!*/

package lane.reference.types;

import core.types.*;
import core.geometry.*;
import core.location.*;

/*!

## Directed Lane Reference

Lane references are described by an identifier and the direction on the lane.

!*/

/** Directed reference to a lane. */
subtype Var4ByteDirectedReference DirectedLaneReference;

/*!

## Identifiers for Lanes, Lane Groups, and Road Surfaces

Lanes, lane groups, and road surfaces can be uniquely identified
following the rules below.

!*/

rule_group LaneIdentifierRules
{
  /*!
  Unique Lane IDs:

  Lane IDs shall be unique per tile or object defined by the smart layer service.
  !*/

  rule "lane.reference-0wtrnr";

  /*!
  Unique Lane IDs across Lane Groups:

  Lane IDs shall not be reused in multiple lane groups within a tile or object defined by the smart layer service.
  !*/

  rule "lane.reference-0wwe2r";

  /*!
  Unique Lane Group IDs:

  Lane group IDs shall be unique per tile or object defined by the smart layer service.
  !*/

  rule "lane.reference-0xfpwu";

  /*!
  Sharing Lane Group ID Ranges:

  The lane group ID range shall be shared by road lane groups and intersection
  lane groups.
  !*/

  rule "lane.reference-0xxtgt";
};


/** Identifier of a lane.*/
subtype Var4ByteId LaneId;

/** Identifier of a lane group.*/
subtype Var4ByteId LaneGroupId;

/** Identifier of a road surface. */
subtype Var4ByteId RoadSurfaceId;

/*!

## Indirect References to Lane Groups

Indirect references to lane groups can be used to assign attributes to lanes
without using explicit identifiers.

Each indirect reference carries one reference geometry, which can be used to
match to existing lane groups. It is not defined which lane is represented by
this reference geometry. The reference geometry can correspond to any geometry
on the road surface, for example, a road center line, lane center line, or
lane boundary.

An indirect reference can have multiple lane group location segments.
This is useful if the indirect reference spans multiple lane groups.
A lane group location segment enhances a road-based location segment with lane
attributes, such as the number of lanes and available lane types.

To assign attributes to specific lanes, an indirect reference
can be combined with a validity. If the indirect reference contains more than
one segment, then this validity only applies to the first location segment
in the list. Validities in further segments can be derived based on lane
connectivity information.

**Example**

Speed limit attributes are to be assigned to two fully formed lanes.
The speed limits apply to three continuous location segments.
Segment 2 has a forming lane, bringing the number of lanes up to 3:

- Lane group location segment 1 has 2 lanes.
- Lane group location segment 2 has 3 lanes.
- Lane group location segment 3 has 2 lanes.

The indirect reference is used together with `LaneGroupRangeValidity` in an
attribute map, where `LaneGroupRangeValidity` has 2 lanes.
The reading/matching application needs to correctly apply the attribute
values to the correct 2 lanes in segment 2 by taking the lane connectivity from the
target lane groups into account.

The following figure shows the real-world scenario at the top and simplified
road lane groups in the middle (fork lane group omitted). The bottom part
shows the lane group location segments that are mapped to the lane groups.

![Indirect reference with lane group location segments](assets/reference-lane-group-location-segments.png)

!*/

rule_group IndirectLaneGroupReferenceRules
{
  /*!
  Usage of `RoadType` in `LaneGroupReferenceIndirect`:

  If `LaneGroupLocationSegment.laneTypes[]` is used, the optional
  `RoadType` in `LaneGroupLocationSegment.locationSegment` shall not be set.
  !*/

  rule "lane.reference-hftsfd";

  /*!
  Indirect Lane Reference Contained in Single Tile:

  The road location geometry in `LaneGroupReferenceIndirect.referenceGeometry`
  shall be limited to one tile. Reference geometries shall be cut at tile
  borders. This ensures that indirect lane references can be used in smart layer
  tiles and smart layer path segments, which are also partitioned in tiles.
  !*/

  rule "lane.reference-b9633j";
};

/** Indirect reference to lane groups. */
struct LaneGroupReferenceIndirect
{
  /** Geometry of the indirect reference. Used to match to an existing lane group. */
  LocationGeometry referenceGeometry;

  /** List of segments on the reference geometry. */
  LaneGroupLocationSegment(referenceGeometry) referenceSegments[];
};

/**
  * Lane group location segment, which adds lane information to an existing
  * location segment from the Core module.
  */
struct LaneGroupLocationSegment(LocationGeometry pathGeometry)
{
  /**
    * Reused location segment that is matched to a lane group. Any applicable
    * lane geometry can be used.
    */
  LocationSegment(pathGeometry) locationSegment;

  /** Number of lanes on the location segment. */
  LanesInMask numLanes;

  /** Types of lanes on the location segment.
    * Ordered from left to right in direction of the location's geometry.
    */
  optional LaneType laneTypes[numLanes];
};

/*!

## Transition References for Lane Groups

Transition references for lane groups can be used to assign attributes to
transitions over multiple lanes in a single intersection lane group or across
multiple lane groups. For example, such references can be used to describe
 turn restrictions or similar attributes that are valid across multiple
transitions.

!*/

rule_group LaneGroupTransitionReferenceRules
{
  /*!
  No References to Fork or Border Lane Groups in Lane Group Transition Path:

  `LaneGroupTransitionPath` shall not contain references to fork or border lane
  groups.
  !*/

  rule "lane.reference-t728kx";

  /*!
  Lane Group Transition References of Type Intersection:

  If the type of a `LaneGroupTransitionReference` is set to `INTERSECTION`,
  then `LaneGroupTransition` shall refer to an intersection lane group.
  !*/

  rule "lane.reference-5tvs6g";

  /*!
  Lane IDs in Lane Group Transition Reference Contain Valid References:

  The lane IDs of the transition lanes within `LaneGroupTransitionReference` shall
  correspond to a lane ID that is valid in the lane group to which the
  `LaneGroupTransitionReference` applies.

  !*/

  rule "lane.reference-ib4qhu";
};

/** Reference to a transition path over lanes or lane groups. */
struct LaneGroupTransitionReference
{
  /** Type of transition. */
  LaneGroupTransitionReferenceType type;

  /** Transition path within one intersection lane group. */
  LaneGroupTransition intersectionTransition
      if type == LaneGroupTransitionReferenceType.INTERSECTION;

  /** Transition path over multiple lane groups using direct references. */
  LaneGroupTransitionPath pathTransition
      if type == LaneGroupTransitionReferenceType.TRANSITION_PATH;

  /** Transition path over multiple lane groups using an indirect reference. */
  LaneGroupTransitionGeoPath geoPathTransition
      if type == LaneGroupTransitionReferenceType.TRANSITION_GEO_PATH;

};

/** Type of lane group transition reference. */
enum uint8 LaneGroupTransitionReferenceType
{
  /** References a transition within a single intersection lane group. */
  INTERSECTION,

  /** References a transition across multiple road and intersection lane groups. */
  TRANSITION_PATH,

  /** References a transition across multiple lane groups using an indirect reference. */
  TRANSITION_GEO_PATH,
};

/** Transition path within one intersection lane group. */
struct LaneGroupTransition
{
  /** Identifier of the lane group. */
  LaneGroupId laneGroupId;

  /** Number of lanes affected by the transition path. */
  LanesInTransition numLanes;

  /**
    * Lane IDs of the lanes that are part of the transition path.
    * Ordered in direction of the transition path, that is, the start lane of the
    * transition path is the first entry in the list and the end lane of the
    * transition path is the last entry in the list.
    */
  LaneId transitionLanes[numLanes];
};

/** Transition path spanning across multiple lane groups. */
struct LaneGroupTransitionPath
{
  /** Number of lane groups that are part of the transition path. */
  uint8 numLaneGroups;

  /**
    * List of lane group transitions ordered from the beginning to
    * the end of the transition path.
    */
  LaneGroupTransition laneGroupTransition[numLaneGroups];
};

/** Transition path spanning across multiple lane groups using an indirect reference. */
struct LaneGroupTransitionGeoPath
{
  /** Lane group transition where the transition path begins. */
  LaneGroupTransition startTransition;

  /** Path of the transition defined by an indirect lane group reference. */
  LaneGroupReferenceIndirect transitionPath;
};

/*!

## Attribute Validities on Lanes

Attributes for lanes are either valid for a complete lane, a position on the lane,
or a range on the lane. The validity information needs to be stored
in combination with the lane reference.

For transitions over multiple lanes in an intersection lane group, a dedicated
lane group transition reference of type `intersectionReference` is provided.

!*/

rule_group LaneAttributeValidityRules
{
  /*!
  Value of `LanesInMask`:

  The value of `LanesInMask` shall match the number of lanes in the lane group.
  !*/

  rule "lane.reference-23am4j";

  /*!
  Usage of `LaneGroupPositionValidity`:

  `LaneGroupPositionValidity` shall only be used for position attributes.
  !*/

  rule "lane.reference-23fski";

  /*!
  Usage of `LaneGroupRangeValidity`:

  `LaneGroupRangeValidity` shall only be used for segment attributes.
  !*/

  rule "lane.reference-23wa9e";

  /*!
  Range of `PercentageIndication`:

  Values for `PercentageIndication` shall be between 0.xxxx and 100.0.
  !*/

  rule "lane.reference-2a729k";

  /*! `LaneGroupRange` Contains Valid Reference:

  The lane ID of the `referenceLaneId` in `LaneGroupRange` shall point to a
  lane ID that is valid in the lane group to which the `LaneGroupRange` applies.
  !*/

  rule "lane.reference-2njak5";

  /*!
  No Lane Validity Type `NONE`in `LaneGroupRange`:

  The enum value `LaneValidityType.NONE` shall not be used in the substructure
  `range.type` of `LaneGroupRange`.
  !*/

  rule "lane.reference-yep07k";
};


/**
  * Defines the validity positions of an attribute on the lanes of a lane group.
  * Only used for position attributes.
  */
struct LaneGroupPositionValidity(CoordShift coordShift)
{
  /** Number of lanes in the mask. Matches the number of lanes in the lane group. */
  LanesInMask numLanes;

  /** Validity positions on the lanes. */
  LanePosition lanes[numLanes];

  /**
    * Validity directions on the lanes. Is used to indicate in which digitization
    * direction of the lane the attribute is valid, for example, a traffic sign
    * is typically valid in only one direction.
    * If the direction is irrelevant for the attribute on a lane or it is unknown
    * in which direction the attribute applies, this field is set to
    * `IN_BOTH_DIRECTIONS`.
    * For example, a crosswalk is not influenced by the digitization direction
    * or the validity direction of a traffic sign is unknown.
    */
  LaneValidityDirection directions[numLanes];

};

/**
  * Defines the validity ranges and direction of an attribute on the lanes of a
  * lane group.
  * Only used for segment attributes.
  *
  * If the `completeGroup` flag is not used, the size of the lane mask matches the
  * lane layout list of the corresponding lane group.
  *
  * If the `completeGroup` flag is used, the validity applies to all lanes and
  * all directions in the lane group and is only constrained by the range
  * described in `completeGroupRange`.
  */
struct LaneGroupRangeValidity(CoordShift coordShift)
{
  /** Specifies whether an attribute is valid for all lanes in the lane group. */
  bool completeGroup;

  /** Range on the complete lane group. */
  LaneGroupRange completeGroupRange if completeGroup;

  /** Number of lanes in the lane mask. Matches the number of lanes in the lane group. */
  LanesInMask numLanes if !completeGroup;

  /** Validity ranges on individual lanes. */
  LaneRange lanes[numLanes] if !completeGroup;

  /** Validity directions on the individual lanes. */
  LaneValidityDirection directions[numLanes] if !completeGroup;
};

/**
  * Range on a complete lane group.
  * When a range on a complete lane group is used, one lane center line geometry
  * is used to describe the range.
  * The application must calculate the validity ranges for the other lanes in
  * the lane group. This can include geometrical calculations taking into account
  * the distance, length, and/or curves of the individual lanes.
  *
  * The lane group range is always defined in the digitization direction of the
  * reference lane.
  */
struct LaneGroupRange
{
  /** Range on the lane group.
    *
    * If not `LaneValidityType.COMPLETE`, then the
    * range is based on the lane geometry of the lane that is referenced in
    * `referenceLaneId`. */
  LaneRange range;

  /** Index of the reference lane within the target lane group's list of lanes. */
  LanesInGroup referenceLaneIdx if range.type != LaneValidityType.COMPLETE;
};


/** Number of lanes in a lane mask. */
subtype LanesInGroup LanesInMask;

/** Number of lanes within a lane group. */
subtype varuint16 LanesInGroup;

/** Number of lanes in a transition reference. */
subtype varuint16 LanesInTransition;

/**
  * Direction of the validity on a lane.
  *
  * Set to `IN_POSITIVE_DIRECTION` if the validity applies in the digitization direction of the lane.
  * Set to `IN_NEGATIVE_DIRECTION` if the validity applies in negative digitization direction of
  * the lane.
  * Set to `IN_BOTH_DIRECTIONS` if the validity applies in both directions.
  */
subtype Direction LaneValidityDirection;

/** Type of validity that is used in lane masks. */
enum uint8 LaneValidityType
{
  /** Lane is not affected. */
  NONE,

  /** Complete lane is affected. */
  COMPLETE,

  /**
    * Validity is described by independent positions that can be matched onto
    * the center line geometry of the lane.
    */
  POSITION,

  /** Validity is described in fractions of the lane length. */
  LENGTH,

  /** Validity is described using the center line geometry of the lane. */
  GEOMETRY,

  /**
    * Validity is described using offsets to the center line geometry of the
    * lane.
    */
  GEOMETRY_OFFSET,

  /** Validity is described using a percentage based on the lane geometry. */
  PERCENTAGE,
};


choice LanePositionChoice(LaneValidityType type) on type
{
  case NONE:
          ;
  case COMPLETE:
          ;
  case POSITION:
          LaneValidityPosition validityPosition;
  case LENGTH:
          LaneLengthPosition lengthPosition;
  case GEOMETRY:
          LaneGeometryPosition geometryPosition;
  case GEOMETRY_OFFSET:
          LaneGeometryPositionOffset(0,0) geometryPositionOffset;
  case PERCENTAGE:
          LanePercentagePosition percentagePosition;
};


choice LaneRangeChoice(LaneValidityType type) on type
{
  case NONE:
          ;
  case COMPLETE:
          ;
  case POSITION:
          LaneValidityRange validityRange;
  case LENGTH:
          LaneLengthRange lengthRange;
  case GEOMETRY:
          LaneGeometryRange geometryRange;
  case GEOMETRY_OFFSET:
          LaneGeometryRangeOffset(0,0) geometryRangeOffset;
  case PERCENTAGE:
          LanePercentageRange percentageRange;
};

/** Validity position, independent of the underlying lane geometry. */
struct LaneValidityPosition
{
  /** Position using full coordinate precision. */
  Position3D(0,0) position;

  /** Optional information on where the position is located on the feature.
    * Helps to correctly identify the position on the target feature in rare
    * cases like zigzag curves.
    */
  optional PercentageIndication positionIndication;
};

/**
  * Validity range using positions that are independent of the associated
  * feature.
  */
struct LaneValidityRange
{
  /** Start position. */
  LaneValidityPosition start;

  /** End position. */
  LaneValidityPosition end;
};

/** Position on a lane. Can be described by different mechanisms. */
struct LanePosition
{
  /** Type of validity. */
  LaneValidityType type : type != LaneValidityType.COMPLETE;

  /** Number of validity positions on the lane. */
  varsize numPositions if type != LaneValidityType.NONE
                  : numPositions > 0;

  /** Validity positions on the lane. */
  LanePositionChoice(type) positions[numPositions] if type != LaneValidityType.NONE;
};

/** Range on a lane. Can be described by different mechanisms. */
struct LaneRange
{
  /** Type of validity. */
  LaneValidityType type;

  /** Number of validity ranges on the lane. */
  varsize numRanges if type != LaneValidityType.COMPLETE
                    && type != LaneValidityType.NONE
                    : numRanges > 0;

  /** Ranges on the lane. */
  LaneRangeChoice(type) range[numRanges] if type != LaneValidityType.COMPLETE
                                         && type != LaneValidityType.NONE;
};

/** Position on a lane, based on the lane length. */
struct LaneLengthPosition
{
  /**
    * Lane length that was used for the calculation of the position. Can be used
    * to cross-check with the lane that the attributes are assigned to, for
    * example, to normalize lane lengths.
    */
  LaneLength length;

  /** Position on the lane. */
  RangePosition(length) position;
};

/** Range on a lane, based on the lane length. */
struct LaneLengthRange
{
  /**
    * Lane length that was used for the calculation of the range. Can be used to
    * cross-check with the lane that the attributes are assigned to, for example,
    * to normalize ranges.
    */
  LaneLength length;

  /** Range on the lane. */
  Range(length) range;
};

/** Lane length in centimeters. */
subtype LengthCentimeters   LaneLength;

/** Position on the center line geometry of a lane. */
subtype LinePosition LaneGeometryPosition;

/** Range on the center line geometry of a lane. */
subtype LineRangeUnchecked LaneGeometryRange;

/** Range on a boundary geometry. */
subtype LineRangeUnchecked BoundaryGeometryRange;

/**
  * Position on the center line geometry of a lane with offset from the
  * geometry.
  */
subtype LinePositionOffset3D LaneGeometryPositionOffset;

/** Range on the center line geometry of a lane with offset from the geometry. */
subtype LineRangeOffset3D LaneGeometryRangeOffset;

/**
  * Percentage indication for a point on a feature based on the feature length.
  * Allowed value range is between 0.xxxx and 100.0.
  */
subtype float16   PercentageIndication;

/** Percentage position on a lane center line geometry. */
subtype PercentagePosition LanePercentagePosition;

/** Percentage range on a lane center line geometry. */
subtype PercentageRange LanePercentageRange;

/*!

## Marking Colors

Marking colors that do not match one of the predefined values are stored as the
value of the most similar color.

!*/

/** Predefined colors for markings. */
enum uint8 MarkingColor
{
  /** Color is unknown. */
  UNKNOWN,

  /** RGB = (255, 255, 255) */
  WHITE,

  /** RGB = (192, 192, 192) */
  LIGHT_GRAY,

  /** RGB = (128, 128, 128) */
  GRAY,

  /** RGB = (64, 64, 64) */
  DARK_GRAY,

  /** RGB = (0, 0, 0) */
  BLACK,

  /** RGB = (255, 0, 0) */
  RED,

  /** RGB = (255, 255, 0) */
  YELLOW,

  /** RGB = (0, 255, 0) */
  GREEN,

  /** RGB = (0, 255, 255) */
  CYAN,

  /** RGB = (0, 0, 255) */
  BLUE,

  /** RGB = (255, 165, 0) */
  ORANGE,

  /** RGB = (128, 0, 128) */
  PURPLE,
};
