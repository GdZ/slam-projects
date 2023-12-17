/*!

# ADAS Metadata

This package defines the metadata of the ADAS attribute layers. The metadata provides
information about the content of the attribute layers.


**Dependencies**

!*/

package adas.metadata;

import core.types.*;
import adas.instantiations.*;


/*!

## ADAS Attribute Layer for Roads

!*/

rule_group AdasRoadLayerMetadataRules
{
  /*!
  Metadata of ADAS Attribute Layer for Roads:

  `AdasRoadLayerMetadata` shall be used for `AdasRoadLayer`.
  !*/

  rule "adas-vdhxnw";
};


/** Metadata of the ADAS attribute layer for roads. */
struct AdasRoadLayerMetadata
{
  /** Contained attribute maps or sets. */
  AdasRoadLayerContent content;

  /** Metadata for roads. */
  AdasRoadAttributeMetadata roadAttributeMetadata
        if (content & AdasRoadLayerContent.ROAD_MAPS) == AdasRoadLayerContent.ROAD_MAPS ||
           (content & AdasRoadLayerContent.ROAD_SETS) == AdasRoadLayerContent.ROAD_SETS;

  /** Metadata for transitions. */
  AdasTransitionAttributeMetadata transitionAttributeMetadata
        if (content & AdasRoadLayerContent.TRANSITION_MAPS) == AdasRoadLayerContent.TRANSITION_MAPS ||
           (content & AdasRoadLayerContent.TRANSITION_SETS) == AdasRoadLayerContent.TRANSITION_SETS;

  /** Road types for which ADAS attributes are provided. */
  RoadType coveredRoadTypes[];
};

/** Content bitmask for the ADAS attribute layer for roads. */
bitmask varuint32 AdasRoadLayerContent
{
  /** Layer contains attribute maps for road attributes. */
  ROAD_MAPS,

  /** Layer contains attribute sets for road attributes. */
  ROAD_SETS,

  /** Layer contains attribute maps for transition attributes. */
  TRANSITION_MAPS,

  /** Layer contains attribute sets for transition attributes. */
  TRANSITION_SETS,
};

/** Metadata of the ADAS attribute layer for road locations. */
struct AdasRoadLocationLayerMetadata
{
  /** Contained attribute maps or sets. */
  AdasRoadLocationLayerContent content;

  /**
    * Metadata for roads. Reused from roads because the ADAS attribute layer for
    * road locations uses the same attributes.
    */
  AdasRoadAttributeMetadata roadLocationAttributeMetadata
        if (content & AdasRoadLocationLayerContent.ROAD_LOCATION_MAPS)
                   == AdasRoadLocationLayerContent.ROAD_LOCATION_MAPS ||
           (content & AdasRoadLocationLayerContent.ROAD_LOCATION_SETS)
                   == AdasRoadLocationLayerContent.ROAD_LOCATION_SETS;

  /**
    * Metadata for transitions. Reused from roads because the ADAS attribute layer
    * for road locations uses the same attributes.
    */
  AdasTransitionAttributeMetadata roadLocationTransitionAttributeMetadata
        if (content & AdasRoadLocationLayerContent.ROAD_LOCATION_TRANSITION_MAPS)
                   == AdasRoadLocationLayerContent.ROAD_LOCATION_TRANSITION_MAPS ||
           (content & AdasRoadLocationLayerContent.ROAD_LOCATION_TRANSITION_SETS)
                   == AdasRoadLocationLayerContent.ROAD_LOCATION_TRANSITION_SETS;

  /** Road types for which ADAS attributes are provided. */
  RoadType coveredRoadTypes[];
};

/*!

## ADAS Attribute Layer for Road Locations

!*/

rule_group AdasRoadLocationLayerMetadataRules
{
  /*!
  Metadata of ADAS Attribute Layer for Road Locations:

  `AdasRoadLocationLayerMetadata` shall be used for `AdasRoadLocationLayer`.
  !*/

  rule "adas-862ohc";
};

/** Content bitmask for the ADAS attribute layer for road locations. */
bitmask varuint32 AdasRoadLocationLayerContent
{
  /** Layer contains attribute maps for road attributes. */
  ROAD_LOCATION_MAPS,

  /** Layer contains attribute sets for road attributes. */
  ROAD_LOCATION_SETS,

  /** Layer contains attribute maps for transition attributes. */
  ROAD_LOCATION_TRANSITION_MAPS,

  /** Layer contains attribute sets for transition attributes. */
  ROAD_LOCATION_TRANSITION_SETS,
};

/*!

## ADAS Attribute Layer for Lanes

!*/

rule_group AdasLaneLayerMetadataRules
{
  /*!
  Metadata of ADAS Attribute Layer for Lanes:

  `AdasLaneLayerMetadata` shall be used for `AdasLaneLayer`.
  !*/

  rule "adas-nro43c";
};

/** Metadata of the ADAS attribute layer for lanes. */
struct AdasLaneLayerMetadata
{
  /** Contained attribute maps or sets. */
  AdasLaneLayerContent content;

  /** Metadata for lanes. */
  AdasLaneAttributeMetadata laneAttributeMetadata;

  /** Lane types for which ADAS attributes are provided. */
  LaneType coveredLaneTypes[];
};

/** Content bitmask for the ADAS attribute layer for lanes. */
bitmask varuint32 AdasLaneLayerContent
{
  /** Layer contains attribute maps for lane attributes. */
  LANE_MAPS,

  /** Layer contains attribute sets for lane attributes. */
  LANE_SETS,
};
