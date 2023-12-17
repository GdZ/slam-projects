/*!

# Characteristics Metadata

This package defines the metadata of the characteristics attribute layers. The
metadata provides information about the content of the attribute layers.

**Dependencies**

!*/

package characteristics.metadata;

import core.types.*;
import characteristics.instantiations.*;

/*!

## Characteristics Attribute Layers for Roads

!*/

rule_group RoadCharacteristicsLayerMetadataRules
{
  /*!
  Metadata of Characteristics Attribute Layer for Roads using Direct References:

  `RoadCharacteristicsLayerMetadata` shall be used for `RoadCharacteristicsLayer`.
  !*/

  rule "characteristics-chdkwn";

  /*!
  Metadata of Characteristics Attribute Layer for Roads using Indirect References:

  `RoadCharacteristicsLayerIndirectMetadata` shall be used for `RoadCharacteristicsLayerIndirect`.
  !*/

  rule "characteristics-n3o70t";
};


/** Metadata of the characteristics attribute layer for roads using direct references. */
struct RoadCharacteristicsLayerMetadata
{
  /** Content of the road characteristics layer. */
  RoadCharacsLayerContent content;

  /** Metadata for road range attributes. */
  CharacsRoadRangeAttributeMetadata roadRangeAttributeMetadata
        if (content & RoadCharacsLayerContent.ROAD_RANGE_MAPS)
                   == RoadCharacsLayerContent.ROAD_RANGE_MAPS ||
           (content & RoadCharacsLayerContent.ROAD_RANGE_SETS)
                   == RoadCharacsLayerContent.ROAD_RANGE_SETS;

  /** Metadata for road position attributes. */
  CharacsRoadPositionAttributeMetadata roadPositionAttributeMetadata
        if (content & RoadCharacsLayerContent.ROAD_POSITION_MAPS)
                   == RoadCharacsLayerContent.ROAD_POSITION_MAPS ||
           (content & RoadCharacsLayerContent.ROAD_POSITION_SETS)
                   == RoadCharacsLayerContent.ROAD_POSITION_SETS;

  /** Road types for which characteristics attributes are provided. */
  RoadType coveredRoadTypes[];

  /**
    * Provider details for road locations if the layer contains the
    * `ROAD_LOCATION_ID` attribute.
    */
  optional RoadLocationProviderDetails roadLocationProviderDetails;

  /** Metadata for transition attributes. */
  CharacsTransitionAttributeMetadata transitionAttributeMetadata
        if (content & RoadCharacsLayerContent.TRANSITION_MAPS)
                   == RoadCharacsLayerContent.TRANSITION_MAPS ||
           (content & RoadCharacsLayerContent.TRANSITION_SETS)
                   == RoadCharacsLayerContent.TRANSITION_SETS;
};

/** Metadata of the characteristics attribute layer for roads using indirect references. */
struct RoadCharacteristicsLayerIndirectMetadata
{
  /** Content of the road characteristics layer. */
  RoadCharacsLayerContent content;

  /** Metadata for road range attributes. */
  CharacsRoadRangeAttributeMetadata roadRangeAttributeMetadata
        if (content & RoadCharacsLayerContent.ROAD_RANGE_MAPS)
                   == RoadCharacsLayerContent.ROAD_RANGE_MAPS ||
           (content & RoadCharacsLayerContent.ROAD_RANGE_SETS)
                   == RoadCharacsLayerContent.ROAD_RANGE_SETS;

  /** Metadata for road position attributes. */
  CharacsRoadPositionAttributeMetadata roadPositionAttributeMetadata
        if (content & RoadCharacsLayerContent.ROAD_POSITION_MAPS)
                   == RoadCharacsLayerContent.ROAD_POSITION_MAPS ||
           (content & RoadCharacsLayerContent.ROAD_POSITION_SETS)
                   == RoadCharacsLayerContent.ROAD_POSITION_SETS;

  /** Road types for which characteristics attributes are provided. */
  RoadType coveredRoadTypes[];

  /**
    * Provider details for road locations if the layer contains the
    * `ROAD_LOCATION_ID` attribute.
    */
  optional RoadLocationProviderDetails roadLocationProviderDetails;
};

/** Content bitmask of the characteristics attribute layers for roads. */
bitmask varuint32 RoadCharacsLayerContent
{
  /** Layer contains attribute maps containing road range attributes. */
  ROAD_RANGE_MAPS,

  /** Layer contains attribute sets containing road range attributes. */
  ROAD_RANGE_SETS,

  /** Layer contains attribute maps containing road position attributes. */
  ROAD_POSITION_MAPS,

  /** Layer contains attribute sets containing road position attributes. */
  ROAD_POSITION_SETS,

  /** Layer contains attribute maps containing transition attributes. */
  TRANSITION_MAPS,

  /** Layer contains attribute sets containing transition attributes. */
  TRANSITION_SETS,
};

/*!

## Characteristics Attribute Layer for Road Locations

!*/

rule_group RoadLocationCharacteristicsLayerMetadataRules
{
  /*!
  Metadata of Characteristics Attribute Layer for Road Locations:

  `RoadLocationCharacteristicsLayerMetadata` shall be used for `RoadLocationCharacteristicsLayer`.
  !*/

  rule "characteristics-kkod4j";
};


/** Metadata of the characteristics attribute layer for road locations. */
struct RoadLocationCharacteristicsLayerMetadata
{
  /** Content of the road location characteristics layer. */
  RoadLocationCharacsLayerContent content;

  /** Metadata for road location attributes. */
  CharacsRoadRangeAttributeMetadata roadLocationAttributeMetadata;

  /** Road types for which characteristics attributes are provided. */
  RoadType coveredRoadTypes[];
};

/** Content bitmask of the characteristics attribute layer for road locations. */
bitmask varuint32 RoadLocationCharacsLayerContent
{
  /** Layer contains attribute maps containing road range attributes. */
  ROAD_LOCATION_MAPS,

  /** Layer contains attribute sets containing road range attributes. */
  ROAD_LOCATION_SETS,
};

/*!

## Characteristics Attribute Layer for Lanes

!*/

rule_group LaneCharacteristicsLayerMetadataRules
{
  /*!
  Metadata of Characteristics Attribute Layer for Lanes:

  `LaneCharacteristicsLayerMetadata` shall be used for `LaneCharacteristicsLayer`.
  !*/

  rule "characteristics-ep3m2c";
};


/** Metadata of the characteristics attribute layer for lanes. */
struct LaneCharacteristicsLayerMetadata
{
  /** Content of the lane characteristics layer. */
  LaneCharacsLayerContent content;

  /** Metadata for lane range attributes. */
  CharacsLaneRangeAttributeMetadata laneRangeAttributeMetadata
        if (content & LaneCharacsLayerContent.LANE_RANGE_MAPS)
                   == LaneCharacsLayerContent.LANE_RANGE_MAPS ||
           (content & LaneCharacsLayerContent.LANE_RANGE_SETS)
                   == LaneCharacsLayerContent.LANE_RANGE_SETS;

  /** Metadata for lane position attributes. */
  CharacsLanePositionAttributeMetadata lanePositionAttributeMetadata
        if (content & LaneCharacsLayerContent.LANE_POSITION_MAPS)
                   == LaneCharacsLayerContent.LANE_POSITION_MAPS ||
           (content & LaneCharacsLayerContent.LANE_POSITION_SETS)
                   == LaneCharacsLayerContent.LANE_POSITION_SETS;

  /** Lane types for which additional characteristics attributes are provided. */
  LaneType coveredLaneTypes[];

  /**
    * Provider details for road locations if the layer contains the
    * `ROAD_LOCATION_ID` attribute.
    */
  optional RoadLocationProviderDetails roadLocationProviderDetails;
};


/** Content bitmask of the characteristics attribute layer for lanes. */
bitmask varuint32 LaneCharacsLayerContent
{
  /** Layer contains attribute maps containing lane range attributes. */
  LANE_RANGE_MAPS,

  /** Layer contains attribute sets containing lane range attributes. */
  LANE_RANGE_SETS,

  /** Layer contains attribute maps containing lane position attributes. */
  LANE_POSITION_MAPS,

  /** Layer contains attribute sets containing lane position attributes. */
  LANE_POSITION_SETS,
};

/*!

## Characteristics Attribute Layer for Display Lines

!*/

rule_group DisplayLineCharacteristicsLayerMetadataRules
{
  /*! Metadata of Characteristics Attribute Layer for Display Lines:

  `DisplayLineCharacteristicsLayerMetadata` shall be used for `DisplayLineCharacteristicsLayer`.
  !*/

  rule "characteristics-4ykhav";
};


/** Metadata of the characteristics attribute layer for display lines. */
struct DisplayLineCharacteristicsLayerMetadata
{
  /** Content of the display line characteristics layer. */
  DisplayLineCharacsLayerContent content;

  /** Metadata for display line range attributes. */
  CharacsDisplayLineRangeAttributeMetadata displayLineRangeAttributeMetadata
        if (content & DisplayLineCharacsLayerContent.DISPLAY_LINE_RANGE_MAPS)
                   == DisplayLineCharacsLayerContent.DISPLAY_LINE_RANGE_MAPS ||
           (content & DisplayLineCharacsLayerContent.DISPLAY_LINE_RANGE_SETS)
                   == DisplayLineCharacsLayerContent.DISPLAY_LINE_RANGE_SETS;

  /** Metadata for display line position attributes. */
  CharacsDisplayLinePositionAttributeMetadata displayLinePositionAttributeMetadata
        if (content & DisplayLineCharacsLayerContent.DISPLAY_LINE_POSITION_MAPS)
                   == DisplayLineCharacsLayerContent.DISPLAY_LINE_POSITION_MAPS ||
           (content & DisplayLineCharacsLayerContent.DISPLAY_LINE_POSITION_SETS)
                   == DisplayLineCharacsLayerContent.DISPLAY_LINE_POSITION_SETS;

  /**
    * Provider details for road locations if the layer contains the
    * `ROAD_LOCATION_ID` attribute.
    */
  optional RoadLocationProviderDetails roadLocationProviderDetails;
};


/** Content bitmask of the characteristics attribute layer for display lines. */
bitmask varuint32 DisplayLineCharacsLayerContent
{
  /** Layer contains attribute maps containing display line range attributes. */
  DISPLAY_LINE_RANGE_MAPS,

  /** Layer contains attribute sets containing display line range attributes. */
  DISPLAY_LINE_RANGE_SETS,

  /** Layer contains attribute maps containing display line position attributes. */
  DISPLAY_LINE_POSITION_MAPS,

  /** Layer contains attribute sets containing display line position attributes. */
  DISPLAY_LINE_POSITION_SETS,
};

/** Provider details for all road locations stored in a layer. */
struct RoadLocationProviderDetails
{
  /** Name of the road locations provider. */
  string providerName;

  /** Version of the road locations. */
  string locationVersion;

  /** Creation time of the road locations. */
  TimeStamp creationTime;
};
