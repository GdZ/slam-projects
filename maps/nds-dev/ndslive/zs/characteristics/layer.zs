/*!

# Characteristics Attribute Layers

This package defines the characteristics attribute layers.

**Dependencies**

!*/

package characteristics.layer;

import system.types.*;
import core.geometry.*;
import characteristics.instantiations.*;
import characteristics.metadata.*;

/*!

## Characteristics Attribute Layers for Roads

The characteristics attribute layers for roads contain all attributes for roads
defined in the Characteristics module. The layers use direct references to roads
or indirect references to roads.

!*/

/** Characteristics attribute layer for roads using direct references. */
struct RoadCharacteristicsLayer
{
  /** Coordinate shift. */
  CoordShift shift;

  /** Content bitmask indicating which attribute maps or sets are available. */
  RoadCharacsLayerContent content;

  /** Attribute maps for road range attributes. */
  CharacsRoadRangeAttributeMapList(shift) characsRoadRangeMaps
              if (content & RoadCharacsLayerContent.ROAD_RANGE_MAPS) == RoadCharacsLayerContent.ROAD_RANGE_MAPS;

  /** Attribute maps for road position attributes. */
  CharacsRoadPositionAttributeMapList(shift) characsRoadPositionMaps
              if (content & RoadCharacsLayerContent.ROAD_POSITION_MAPS) == RoadCharacsLayerContent.ROAD_POSITION_MAPS;

  /** Attribute sets for road range attributes. */
  CharacsRoadRangeAttributeSetList(shift) characsRoadRangeSets
              if (content & RoadCharacsLayerContent.ROAD_RANGE_SETS) == RoadCharacsLayerContent.ROAD_RANGE_SETS;

  /** Attribute sets for road position attributes. */
  CharacsRoadPositionAttributeSetList(shift) characsRoadPositionSets
              if (content & RoadCharacsLayerContent.ROAD_POSITION_SETS) == RoadCharacsLayerContent.ROAD_POSITION_SETS;

  /** Attribute maps for transitions. */
  CharacsTransitionAttributeMapList(shift) characsTransitionMaps
              if (content & RoadCharacsLayerContent.TRANSITION_MAPS) == RoadCharacsLayerContent.TRANSITION_MAPS;

  /** Attribute sets for transitions. */
  CharacsTransitionAttributeSetList(shift) characsTransitionSets
              if (content & RoadCharacsLayerContent.TRANSITION_SETS) == RoadCharacsLayerContent.TRANSITION_SETS;


  /** Returns the layer type descriptor. */
  function LayerType getLayerType()
  {
    return LayerType.ATTRIBUTE;
  }
};

/** Characteristics attribute layer for roads using indirect references. */
struct RoadCharacteristicsLayerIndirect
{
  /** Coordinate shift. */
  CoordShift shift;

  /** Content bitmask indicating which attribute maps or sets are available. */
  RoadCharacsLayerContent content;

  /** Attribute maps for road range attributes. */
  CharacsIndirectRoadRangeAttributeMapList(shift) characsRoadRangeMaps
              if (content & RoadCharacsLayerContent.ROAD_RANGE_MAPS) == RoadCharacsLayerContent.ROAD_RANGE_MAPS;

  /** Attribute maps for road position attributes. */
  CharacsIndirectRoadPositionAttributeMapList(shift) characsRoadPositionMaps
              if (content & RoadCharacsLayerContent.ROAD_POSITION_MAPS) == RoadCharacsLayerContent.ROAD_POSITION_MAPS;

  /** Attribute sets for road range attributes. */
  CharacsIndirectRoadRangeAttributeSetList(shift) characsRoadRangeSets
              if (content & RoadCharacsLayerContent.ROAD_RANGE_SETS) == RoadCharacsLayerContent.ROAD_RANGE_SETS;

  /** Attribute sets for road position attributes. */
  CharacsIndirectRoadPositionAttributeSetList(shift) characsRoadPositionSets
              if (content & RoadCharacsLayerContent.ROAD_POSITION_SETS) == RoadCharacsLayerContent.ROAD_POSITION_SETS;

  /** Returns the layer type descriptor. */
  function LayerType getLayerType()
  {
    return LayerType.ATTRIBUTE;
  }
};

/*!

## Characteristics Attribute Layer for Road Locations

The characteristics attribute layer for road locations contains all attributes
for roads defined in the Characteristics module.
Instead of using references to NDS.Live roads, it uses road location references.


__Note:__
Using road location references, characteristics attributes can also be assigned to
NDS.Classic map features. In this case, source location IDs from the Location
extension are used instead of road location IDs.

!*/

rule_group RoadLocationCharacteristicsLayerRules
{
  /*!
  No Road Location ID in Characteristics Attribute Layer for Road Locations:

  The `ROAD_LOCATION_ID` attribute shall not be used in the
  `RoadLocationCharacteristicsLayer`.
  !*/

  rule "characteristics-8ntahs";
};

/** Characteristics attribute layer for road locations. */
struct RoadLocationCharacteristicsLayer
{
  /** Content bitmask indicating which attribute maps or sets are available. */
  RoadLocationCharacsLayerContent content;

  /** Coordinate shift. */
  CoordShift shift;

  /** Attribute maps for road range attributes assigned to road locations. */
  CharacsRoadLocationRangeAttributeMapList(shift) characsRoadLocationRangeMaps
              if (content & RoadLocationCharacsLayerContent.ROAD_LOCATION_MAPS)
                         == RoadLocationCharacsLayerContent.ROAD_LOCATION_MAPS;

  /** Attribute sets for road range attributes assigned to road locations. */
  CharacsRoadLocationRangeAttributeSetList(shift) characsRoadLocationRangeSets
              if (content & RoadLocationCharacsLayerContent.ROAD_LOCATION_SETS)
                         == RoadLocationCharacsLayerContent.ROAD_LOCATION_SETS;

  /** Returns the layer type descriptor. */
  function LayerType getLayerType()
  {
    return LayerType.ATTRIBUTE;
  }
};

/*!

## Characteristics Attribute Layer for Lanes

The characteristics attribute layer for lanes contains all attributes for lanes
defined in the Characteristics module.

!*/

/** Characteristics attribute layer for lanes. */
struct LaneCharacteristicsLayer
{
  /** Content bitmask indicating which attribute maps or sets are available. */
  LaneCharacsLayerContent content;

  /** Attribute maps for lane range attributes. */
  CharacsLaneRangeAttributeMapList(0) characsLaneRangeMaps
          if (content & LaneCharacsLayerContent.LANE_RANGE_MAPS) == LaneCharacsLayerContent.LANE_RANGE_MAPS;

  /** Attribute maps for lane position attributes. */
  CharacsLanePositionAttributeMapList(0) characsLanePositionMaps
          if (content & LaneCharacsLayerContent.LANE_POSITION_MAPS) == LaneCharacsLayerContent.LANE_POSITION_MAPS;

  /** Attribute sets for lane range attributes. */
  CharacsLaneRangeAttributeSetList(0) characsLaneRangeSets
          if (content & LaneCharacsLayerContent.LANE_RANGE_SETS) == LaneCharacsLayerContent.LANE_RANGE_SETS;

  /** Attribute sets for lane position attributes. */
  CharacsLanePositionAttributeSetList(0) characsLanePositionSets
          if (content & LaneCharacsLayerContent.LANE_POSITION_SETS) == LaneCharacsLayerContent.LANE_POSITION_SETS;

  /** Returns the layer type descriptor. */
  function LayerType getLayerType()
  {
    return LayerType.ATTRIBUTE;
  }
};

/*!

## Characteristics Attribute Layer for Display Lines

The characteristics attribute layer for display lines contains all attributes for display lines
defined in the Characteristics module.

!*/

/** Characteristics attribute layer for display lines. */
struct DisplayLineCharacteristicsLayer
{
  /** Content bitmask indicating which attribute maps or sets are available. */
  DisplayLineCharacsLayerContent content;

  /** Coordinate shift. */
  CoordShift shift;

  /** Attribute maps for display line range attributes. */
  CharacsDisplayLineRangeAttributeMapList(shift) characsDisplayLineRangeMaps
          if (content & DisplayLineCharacsLayerContent.DISPLAY_LINE_RANGE_MAPS)
          == DisplayLineCharacsLayerContent.DISPLAY_LINE_RANGE_MAPS;

  /** Attribute maps for display line position attributes. */
  CharacsDisplayLinePositionAttributeMapList(shift) characsDisplayLinePositionMaps
          if (content & DisplayLineCharacsLayerContent.DISPLAY_LINE_POSITION_MAPS)
          == DisplayLineCharacsLayerContent.DISPLAY_LINE_POSITION_MAPS;

  /** Attribute sets for display line range attributes. */
  CharacsDisplayLineRangeAttributeSetList(shift) characsDisplayLineRangeSets
          if (content & DisplayLineCharacsLayerContent.DISPLAY_LINE_RANGE_SETS)
          == DisplayLineCharacsLayerContent.DISPLAY_LINE_RANGE_SETS;

  /** Attribute sets for display line position attributes. */
  CharacsDisplayLinePositionAttributeSetList(0) characsDisplayLinePositionSets
          if (content & DisplayLineCharacsLayerContent.DISPLAY_LINE_POSITION_SETS)
          == DisplayLineCharacsLayerContent.DISPLAY_LINE_POSITION_SETS;

  /** Returns the layer type descriptor. */
  function LayerType getLayerType()
  {
    return LayerType.ATTRIBUTE;
  }
};
