/*!

# Rules Metadata

This package defines the metadata of the Rules attribute layers. The metadata
provides information about the content of the attribute layers.

**Dependencies**

!*/

package rules.metadata;

import core.types.*;
import core.language.*;
import rules.instantiations.*;

/*!

## Region Rules Attribute Layers

!*/

rule_group RegionRulesLayerMetadataRules
{
  /*!
  Metadata of Region Rules Attribute Layer for Roads:

  `RegionRulesLayerRoadsMetadata` shall be used for `RegionRulesRoadsLayer`.
  !*/

  rule "rules-xzp0vc";

  /*!
  Metadata of Region Rules Attribute Layer for Lanes:

  `RegionRulesLayerLanesMetadata` shall be used for `RegionRulesLanesLayer`.
  !*/

  rule "rules-xzp1vc";
};

/** Metadata of the region rules attribute layers. */
struct RegionRulesLayerMetadata
{
  /** Contained attribute maps or sets. */
  RegionRulesLayerContent content;

  /** Attribute types contained in the attribute maps/sets for region attributes. */
  RulesRegionAttributeMetadata regionAttributeMetadata
        if(content & RegionRulesLayerContent.REGION_MAPS)
                  == RegionRulesLayerContent.REGION_MAPS ||
          (content & RegionRulesLayerContent.REGION_SETS)
                  == RegionRulesLayerContent.REGION_SETS;

  /** Road types for which rules attributes are provided. */
  RoadType coveredRoadTypes[];

  /** Available languages for regions. */
  AvailableLanguages availableLanguages;
};

/** Metadata of the region rules attribute layer for roads. */
subtype RegionRulesLayerMetadata RegionRulesLayerRoadsMetadata;

/** Metadata of the region rules attribute layer for lanes. */
subtype RegionRulesLayerMetadata RegionRulesLayerLanesMetadata;

/** Content bitmask of the region rules attribute layer. */
bitmask varuint16 RegionRulesLayerContent
{
  /** Layer contains attribute maps for regions. */
  REGION_MAPS,

  /** Layer contains attribute sets for regions. */
  REGION_SETS,
};

/*!

## Rules Attribute Layers for Roads

!*/

rule_group RoadRulesLayerMetadataRules
{
  /*!
  Metadata of Rules Attribute Layer for Roads using Direct References:

  `RoadRulesLayerMetadata` shall be used for `RoadRulesLayer`.
  !*/

  rule "rules-xxdjej";

  /*!
  Metadata of Rules Attribute Layer for Roads using Indirect References:

  `RoadRulesLayerIndirectMetadata` shall be used for `RoadRulesLayerIndirect`.
  !*/

  rule "rules-4vhij5";
};

/** Metadata of the rules attribute layer for roads using direct references. */
struct RoadRulesLayerMetadata
{
  /** Contained attribute maps or sets. */
  RoadRulesLayerContent content;

  /** Attribute types contained in the attribute maps/sets for road range attributes. */
  RulesRoadRangeAttributeMetadata roadRangeAttributeMetadata
        if(content & RoadRulesLayerContent.ROAD_RANGE_MAPS)
                  == RoadRulesLayerContent.ROAD_RANGE_MAPS ||
          (content & RoadRulesLayerContent.ROAD_RANGE_SETS)
                  == RoadRulesLayerContent.ROAD_RANGE_SETS;

  /** Attribute types contained in the attribute maps/sets for road position attributes. */
  RulesRoadPositionAttributeMetadata roadPositionAttributeMetadata
        if(content & RoadRulesLayerContent.ROAD_POSITION_MAPS)
                  == RoadRulesLayerContent.ROAD_POSITION_MAPS ||
          (content & RoadRulesLayerContent.ROAD_POSITION_SETS)
                  == RoadRulesLayerContent.ROAD_POSITION_SETS;

  /** Attribute types contained in the attribute maps/sets for transition attributes. */
  RulesTransitionAttributeMetadata transitionAttributeMetadata
        if(content & RoadRulesLayerContent.TRANSITION_MAPS)
                  == RoadRulesLayerContent.TRANSITION_MAPS ||
          (content & RoadRulesLayerContent.TRANSITION_SETS)
                  == RoadRulesLayerContent.TRANSITION_SETS;

  /** Road types for which rules attributes are provided. */
  RoadType coveredRoadTypes[];

  /** Available languages in the layer. */
  AvailableLanguages availableLanguages
        if(content & RoadRulesLayerContent.LANGUAGES)
                  == RoadRulesLayerContent.LANGUAGES;
};

/** Metadata of the rules attribute layer for roads using indirect references. */
struct RoadRulesLayerIndirectMetadata
{
  /** Contained attribute maps or sets. */
  RoadRulesLayerContent content;

  /** Attribute types contained in the attribute maps for road range attributes. */
  RulesRoadRangeAttributeMetadata roadRangeAttributeMetadata
        if(content & RoadRulesLayerContent.ROAD_RANGE_MAPS)
                  == RoadRulesLayerContent.ROAD_RANGE_MAPS ||
          (content & RoadRulesLayerContent.ROAD_RANGE_SETS)
                  == RoadRulesLayerContent.ROAD_RANGE_SETS;

  /** Attribute types contained in the attribute maps for road position attributes. */
  RulesRoadPositionAttributeMetadata roadPositionAttributeMetadata
        if(content & RoadRulesLayerContent.ROAD_POSITION_MAPS)
                  == RoadRulesLayerContent.ROAD_POSITION_MAPS ||
          (content & RoadRulesLayerContent.ROAD_POSITION_SETS)
                  == RoadRulesLayerContent.ROAD_POSITION_SETS;

  /** Attribute types contained in the attribute maps for transition attributes. */
  RulesTransitionAttributeMetadata transitionAttributeMetadata
        if(content & RoadRulesLayerContent.TRANSITION_MAPS)
                  == RoadRulesLayerContent.TRANSITION_MAPS ||
          (content & RoadRulesLayerContent.TRANSITION_SETS)
                  == RoadRulesLayerContent.TRANSITION_SETS;

  /** Road types for which rules attributes are provided. */
  RoadType coveredRoadTypes[];

  /** Available languages in the layer. */
  AvailableLanguages availableLanguages
        if(content & RoadRulesLayerContent.LANGUAGES)
                  == RoadRulesLayerContent.LANGUAGES;
};

/** Content bitmask of the rules attribute layers for roads. */
bitmask varuint32 RoadRulesLayerContent
{
  /** Layer contains attribute maps for road range attributes. */
  ROAD_RANGE_MAPS,

 /** Layer contains attribute sets for road range attributes. */
  ROAD_RANGE_SETS,

  /** Layer contains attribute maps for road position attributes. */
  ROAD_POSITION_MAPS,

  /** Layer contains attribute sets for road position attributes. */
  ROAD_POSITION_SETS,

  /** Layer contains attribute maps for transition attributes. */
  TRANSITION_MAPS,

  /** Layer contains attribute sets for transition attributes. */
  TRANSITION_SETS,

  /** Layer contains text in one or more languages. */
  LANGUAGES,
};

/*!

## Rules Attribute Layer for Road Locations

!*/

rule_group RoadLocationRulesLayerMetadataRules
{
  /*!
  Metadata of Rules Attribute Layer for Road Locations:

  `RoadLocationRulesLayerMetadata` shall be used for `RoadLocationRulesLayer`.
  !*/

  rule "rules-74ised";
};

/** Metadata of the rules attribute layer for road locations. */
struct RoadLocationRulesLayerMetadata
{
  /** Contained attribute maps or sets. */
  RoadLocationRulesLayerContent content;

  /** Attribute types contained in the attribute maps/sets for road range attributes. */
  RulesRoadRangeAttributeMetadata roadRangeAttributeMetadata
        if(content & RoadLocationRulesLayerContent.ROAD_LOCATION_MAPS)
                  == RoadLocationRulesLayerContent.ROAD_LOCATION_MAPS ||
          (content & RoadLocationRulesLayerContent.ROAD_LOCATION_SETS)
                  == RoadLocationRulesLayerContent.ROAD_LOCATION_SETS;

  /** Attribute types contained in the attribute maps/sets for transition attributes. */
  RulesTransitionAttributeMetadata transitionAttributeMetadata
        if(content & RoadLocationRulesLayerContent.ROAD_LOCATION_TRANSITION_MAPS)
                  == RoadLocationRulesLayerContent.ROAD_LOCATION_TRANSITION_MAPS ||
          (content & RoadLocationRulesLayerContent.ROAD_LOCATION_TRANSITION_SETS)
                  == RoadLocationRulesLayerContent.ROAD_LOCATION_TRANSITION_SETS;

  /** Road types for which rules attributes are provided. */
  RoadType coveredRoadTypes[];

  /** Available languages in the layer. */
  AvailableLanguages availableLanguages
        if(content & RoadLocationRulesLayerContent.LANGUAGES)
                  == RoadLocationRulesLayerContent.LANGUAGES;
};

/** Content bitmask of the rules attribute layers for road locations. */
bitmask varuint32 RoadLocationRulesLayerContent
{
  /** Layer contains attribute maps for road range attributes. */
  ROAD_LOCATION_MAPS,

 /** Layer contains attribute sets for road range attributes. */
  ROAD_LOCATION_SETS,

  /** Layer contains attribute maps for transition attributes. */
  ROAD_LOCATION_TRANSITION_MAPS,

  /** Layer contains attribute sets for transition attributes. */
  ROAD_LOCATION_TRANSITION_SETS,

  /** Layer contains text in one or more languages. */
  LANGUAGES,
};

/*!

## Rules Attribute Layers for Lanes

!*/

rule_group LaneRulesLayerMetadataRules
{
  /*!
  Metadata of Rules Attribute Layer for Lanes using Direct References:

  `LaneRulesLayerMetadata` shall be used for `LaneRulesLayer`.
  !*/

  rule "rules-aib5py";

  /*!
  Metadata of Rules Attribute Layer for Lanes using Indirect References:

  `LaneRulesLayerIndirectMetadata` shall be used for `LaneRulesLayerIndirect`.
  !*/

  rule "rules-7g3qmj";
};

/** Metadata of the rules attribute layer for lanes using direct references. */
struct LaneRulesLayerMetadata
{
  /** Contained attribute maps or sets. */
  LaneRulesLayerContent content;

  /** Attribute types contained in the attribute maps/sets for lane range attributes. */
  RulesLaneRangeAttributeMetadata laneRangeAttributeMetadata
        if(content & LaneRulesLayerContent.LANE_RANGE_MAPS)
                  == LaneRulesLayerContent.LANE_RANGE_MAPS ||
          (content & LaneRulesLayerContent.LANE_RANGE_SETS)
                  == LaneRulesLayerContent.LANE_RANGE_SETS;

  /** Attribute types contained in the attribute maps/sets for lane position attributes. */
  RulesLanePositionAttributeMetadata lanePositionAttributeMetadata
        if(content & LaneRulesLayerContent.LANE_POSITION_MAPS)
                  == LaneRulesLayerContent.LANE_POSITION_MAPS ||
          (content & LaneRulesLayerContent.LANE_POSITION_SETS)
                  == LaneRulesLayerContent.LANE_POSITION_SETS;
  
  /** Attribute types contained in the attribute maps/sets for lane transition attributes. */
  RulesLaneTransitionAttributeMetadata laneTransitionAttributeMetadata
        if(content & LaneRulesLayerContent.LANE_TRANSITION_MAPS)
                  == LaneRulesLayerContent.LANE_TRANSITION_MAPS ||
          (content & LaneRulesLayerContent.LANE_TRANSITION_SETS)
                  == LaneRulesLayerContent.LANE_TRANSITION_SETS;

  /** Lane types for which rules attributes are provided. */
  LaneType coveredLaneTypes[];

  /** Available languages in the layer. */
  AvailableLanguages availableLanguages
        if(content & LaneRulesLayerContent.LANGUAGES)
                  == LaneRulesLayerContent.LANGUAGES;
};

/** Metadata of the rules attribute layer for lanes using indirect references. */
struct LaneRulesLayerIndirectMetadata
{
  /** Contained attribute maps or sets. */
  LaneRulesLayerContent content;

  /** Attribute types contained in the attribute maps/sets for lane range attributes. */
  RulesLaneRangeAttributeMetadata laneRangeAttributeMetadata
        if(content & LaneRulesLayerContent.LANE_RANGE_MAPS)
                  == LaneRulesLayerContent.LANE_RANGE_MAPS ||
          (content & LaneRulesLayerContent.LANE_RANGE_SETS)
                  == LaneRulesLayerContent.LANE_RANGE_SETS;

  /** Attribute types contained in the attribute maps/sets for lane position attributes. */
  RulesLanePositionAttributeMetadata lanePositionAttributeMetadata
        if(content & LaneRulesLayerContent.LANE_POSITION_MAPS)
                  == LaneRulesLayerContent.LANE_POSITION_MAPS ||
          (content & LaneRulesLayerContent.LANE_POSITION_SETS)
                  == LaneRulesLayerContent.LANE_POSITION_SETS;

  /** Lane types for which rules attributes are provided. */
  LaneType coveredLaneTypes[];

  /** Available languages in the layer. */
  AvailableLanguages availableLanguages
        if(content & LaneRulesLayerContent.LANGUAGES)
                  == LaneRulesLayerContent.LANGUAGES;
};

/** Content bitmask of the rules attribute layers for lanes. */
bitmask varuint32 LaneRulesLayerContent
{
  /** Layer contains attribute maps for lane range attributes. */
  LANE_RANGE_MAPS,

  /** Layer contains attribute sets for lane range attributes. */
  LANE_RANGE_SETS,

  /** Layer contains attribute maps for lane positions attributes. */
  LANE_POSITION_MAPS,

  /** Layer contains attribute sets for lane position attributes. */
  LANE_POSITION_SETS,

  /** Layer contains attribute maps for lane transition attributes. */
  LANE_TRANSITION_MAPS,

  /** Layer contains attribute sets for lane transition attributes. */
  LANE_TRANSITION_SETS,

  /** Layer contains text in one or more languages. */
  LANGUAGES,
};

/*!

## Rules Attribute Layer for Display Lines

!*/

rule_group DisplayLineRulesLayerMetadataRules
{
  /*!
  Metadata of Rules Attribute Layer for Display Lines using Direct References:

  `DisplayLineRulesLayerMetadata` shall be used for `DisplayLineRulesLayer`.
  !*/

  rule "rules-3h9x5m";
};

/** Metadata of the rules attribute layer for display lines using direct references. */
struct DisplayLineRulesLayerMetadata
{
  /** Contained attribute maps or sets. */
  DisplayLineRulesLayerContent content;

  /** Attribute types contained in the attribute maps or sets for display line range attributes. */
  RulesDisplayLineRangeAttributeMetadata displayLineRangeAttributeMetadata
        if(content & DisplayLineRulesLayerContent.DISPLAY_LINE_RANGE_MAPS)
                  == DisplayLineRulesLayerContent.DISPLAY_LINE_RANGE_MAPS ||
          (content & DisplayLineRulesLayerContent.DISPLAY_LINE_RANGE_SETS)
                  == DisplayLineRulesLayerContent.DISPLAY_LINE_RANGE_SETS;

  /** Attribute types contained in the attribute maps or sets for display line position attributes. */
  RulesDisplayLinePositionAttributeMetadata displayLinePositionAttributeMetadata
        if(content & DisplayLineRulesLayerContent.DISPLAY_LINE_POSITION_MAPS)
                  == DisplayLineRulesLayerContent.DISPLAY_LINE_POSITION_MAPS ||
          (content & DisplayLineRulesLayerContent.DISPLAY_LINE_POSITION_SETS)
                  == DisplayLineRulesLayerContent.DISPLAY_LINE_POSITION_SETS;

  /** Road types for which rules attributes are provided. */
  RoadType coveredRoadTypes[];

  /** Available languages in the layer. */
  AvailableLanguages availableLanguages
        if(content & DisplayLineRulesLayerContent.LANGUAGES)
                  == DisplayLineRulesLayerContent.LANGUAGES;
};

/** Content bitmask of the rules attribute layer for display lines. */
bitmask varuint32 DisplayLineRulesLayerContent
{
  /** Layer contains attribute maps for display line range attributes. */
  DISPLAY_LINE_RANGE_MAPS,

  /** Layer contains attribute sets for display line range attributes. */
  DISPLAY_LINE_RANGE_SETS,

  /** Layer contains attribute maps for display line positions attributes. */
  DISPLAY_LINE_POSITION_MAPS,

  /** Layer contains attribute sets for display line position attributes. */
  DISPLAY_LINE_POSITION_SETS,

  /** Layer contains text in one or more languages. */
  LANGUAGES,
};