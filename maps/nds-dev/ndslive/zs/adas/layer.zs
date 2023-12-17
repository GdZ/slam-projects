/*!

# ADAS Attribute Layers

This package defines the ADAS attribute layers.

**Dependencies**

!*/

package adas.layer;

import system.types.*;
import core.geometry.*;
import adas.instantiations.*;
import adas.types.*;
import adas.metadata.*;

/*!

## ADAS Attribute Layer for Roads

The ADAS attribute layer for roads contains road and transition attributes for use
with Advanced Driver Assistance Systems.

!*/

/** ADAS attribute layer for roads. */
struct AdasRoadLayer
{
  /** Content bitmask indicating which attribute maps or sets are available. */
  AdasRoadLayerContent content;

  /** Coordinate shift. */
  CoordShift shift;

  /** ADAS geometries that act as the base for ADAS attributes. */
  AdasGeometryList(shift) adasGeometryList;

  /** Attribute maps for road attributes. */
  AdasRoadAttributeMapList(shift) adasRoadAttributeMaps
                  if (content & AdasRoadLayerContent.ROAD_MAPS) == AdasRoadLayerContent.ROAD_MAPS;

  /** Attribute sets for road attributes. */
  AdasRoadAttributeSetList(shift) adasRoadAttributeSets
                  if (content & AdasRoadLayerContent.ROAD_SETS) == AdasRoadLayerContent.ROAD_SETS;

  /** Attribute maps for transitions. */
  AdasTransitionAttributeMapList(shift) adasTransitionAttributeMaps
                  if (content & AdasRoadLayerContent.TRANSITION_MAPS) == AdasRoadLayerContent.TRANSITION_MAPS;

  /** Attribute sets for transition attributes. */
  AdasTransitionAttributeSetList(shift) adasTransitionAttributeSets
                  if (content & AdasRoadLayerContent.TRANSITION_SETS) == AdasRoadLayerContent.TRANSITION_SETS;

  /** Returns the layer type descriptor. */
  function LayerType getLayerType()
  {
    return LayerType.ATTRIBUTE;
  }
};

/*!

## ADAS Attribute Layer for Road Locations

The ADAS attribute layer for road locations contains road attributes for use
with Advanced Driver Assistance Systems.
This layer uses the same attributes as the ADAS attribute layer for roads, but
instead of using references to NDS.Live roads it uses road location references.


__Note:__
Using road location references, ADAS attributes can also be assigned to NDS.Classic
map features. In this case, source location IDs from the Location
extension are used instead of road location IDs.

!*/

/** ADAS attribute layer for road locations. */
struct AdasRoadLocationLayer
{
  /** Content bitmask indicating which attribute maps or sets are available. */
  AdasRoadLocationLayerContent content;

  /** Coordinate shift. */
  CoordShift shift;

  /** ADAS geometries that act as the base for ADAS attributes. */
  AdasGeometryList(shift) adasGeometryList;

  /** Attribute maps for road attributes assigned to road locations. */
  AdasRoadLocationAttributeMapList(shift) adasRoadLocationAttributeMaps
                  if (content & AdasRoadLocationLayerContent.ROAD_LOCATION_MAPS)
                             == AdasRoadLocationLayerContent.ROAD_LOCATION_MAPS;

  /** Attribute sets for road attributes assigned to road locations. */
  AdasRoadLocationAttributeSetList(shift) adasRoadLocationAttributeSets
                  if (content & AdasRoadLocationLayerContent.ROAD_LOCATION_SETS)
                             == AdasRoadLocationLayerContent.ROAD_LOCATION_SETS;

  /** Attribute maps for transition attributes assigned to road locations. */
  AdasRoadLocationTransitionAttributeMapList(shift) adasRoadLocationTransitionAttributeMaps
                  if (content & AdasRoadLocationLayerContent.ROAD_LOCATION_TRANSITION_MAPS)
                             == AdasRoadLocationLayerContent.ROAD_LOCATION_TRANSITION_MAPS;

  /** Attribute sets for transition attributes assigned to road locations. */
  AdasRoadLocationTransitionAttributeSetList(shift) adasRoadLocationTransitionAttributeSets
                  if (content & AdasRoadLocationLayerContent.ROAD_LOCATION_TRANSITION_SETS)
                             == AdasRoadLocationLayerContent.ROAD_LOCATION_TRANSITION_SETS;

  /** Returns the layer type descriptor. */
  function LayerType getLayerType()
  {
    return LayerType.ATTRIBUTE;
  }
};

/*!

## ADAS Attribute Layer for Lanes

The ADAS attribute layer for lanes contains lane attributes
for use with Advanced Driver Assistance Systems.

!*/

/** ADAS attribute layer for lanes. */
struct AdasLaneLayer
{
  /** Content bitmask indicating which attribute maps or sets are available. */
  AdasLaneLayerContent content;

  /** Attribute maps for lane attributes. */
  AdasLaneAttributeMapList(0) adasLaneAttributeMaps
              if (content & AdasLaneLayerContent.LANE_MAPS) == AdasLaneLayerContent.LANE_MAPS;

  /** Attribute sets for lane attributes. */
  AdasLaneAttributeSetList(0) adasLaneAttributeSets
                  if (content & AdasLaneLayerContent.LANE_SETS) == AdasLaneLayerContent.LANE_SETS;

  /** Returns the layer type descriptor. */
  function LayerType getLayerType()
  {
    return LayerType.ATTRIBUTE;
  }
};
