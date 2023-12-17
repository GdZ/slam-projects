/*!

# Routing Attribute Layers

This package defines attribute layers for routing.

**Dependencies**

!*/

package routingdata.layer;

import system.types.*;
import core.geometry.*;
import routingdata.instantiations.*;
import routingdata.metadata.*;
import routingdata.types.*;



/**
  * Routing attribute layer for roads. Contains routing attributes for roads
  * and transitions.
  */
struct RoadRoutingLayer
{
  /** Coordinate shift. */
  CoordShift shift;

  /** Content bitmask indicating which attribute maps or sets are available. */
  RoadRoutingLayerContent content;

  /** Attribute maps for road range attributes. */
  RoutingRoadRangeAttributeMapList(shift) routingRoadRangeMaps
              if (content & RoadRoutingLayerContent.ROAD_RANGE_MAPS) == RoadRoutingLayerContent.ROAD_RANGE_MAPS;

  /** Attribute maps for road position attributes. */
  RoutingRoadTransitionAttributeMapList(shift) routingTransitionMaps
              if (content & RoadRoutingLayerContent.ROAD_TRANSITION_MAPS) == RoadRoutingLayerContent.ROAD_TRANSITION_MAPS;

  /** Attribute sets for road range attributes. */
  RoutingRoadRangeAttributeSetList(shift) routingRoadRangeSets
              if (content & RoadRoutingLayerContent.ROAD_RANGE_SETS) == RoadRoutingLayerContent.ROAD_RANGE_SETS;

  /** Attribute sets for road position attributes. */
  RoutingRoadTransitionAttributeSetList(shift) routingTransitionSets
              if (content & RoadRoutingLayerContent.ROAD_TRANSITION_SETS) == RoadRoutingLayerContent.ROAD_TRANSITION_SETS;

  /** Speed profiles used by speed profile attributes. */
  SpeedProfile profiles[]
              if (content & RoadRoutingLayerContent.SPEED_PROFILES)
                         == RoadRoutingLayerContent.SPEED_PROFILES;

  /** Returns the layer type descriptor. */
  function LayerType getLayerType()
  {
    return LayerType.ATTRIBUTE;
  }
};


/**
  * Routing attribute layer for lanes. Contains routing attributes for lanes
  * and lane transitions.
  */
struct LaneRoutingLayer
{
  /** Content bitmask indicating which attribute maps or sets are available. */
  LaneRoutingLayerContent content;

  /** Attribute maps for lane range attributes. */
  RoutingLaneRangeAttributeMapList(0) routingLaneRangeMaps
              if (content & LaneRoutingLayerContent.LANE_RANGE_MAPS) == LaneRoutingLayerContent.LANE_RANGE_MAPS;

  /** Attribute maps for lane transition attributes. */
  RoutingLaneTransitionAttributeMapList(0) routingTransitionMaps
              if (content & LaneRoutingLayerContent.LANE_TRANSITION_MAPS) == LaneRoutingLayerContent.LANE_TRANSITION_MAPS;

  /** Attribute sets for lane range attributes. */
  RoutingLaneRangeAttributeSetList(0) routingLaneRangeSets
              if (content & LaneRoutingLayerContent.LANE_RANGE_SETS) == LaneRoutingLayerContent.LANE_RANGE_SETS;

  /** Attribute sets for lane transition attributes. */
  RoutingLaneTransitionAttributeSetList(0) routingTransitionSets
              if (content & LaneRoutingLayerContent.LANE_TRANSITION_SETS) == LaneRoutingLayerContent.LANE_TRANSITION_SETS;

  /** Speed profiles used by speed profile attributes. */
  SpeedProfile profiles[]
              if (content & LaneRoutingLayerContent.SPEED_PROFILES)
                         == LaneRoutingLayerContent.SPEED_PROFILES;

  /** Returns the layer type descriptor. */
  function LayerType getLayerType()
  {
    return LayerType.ATTRIBUTE;
  }
};
