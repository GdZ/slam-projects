/*!

# Venue Attribute Layers

This package defines the attribute layers that are available in the Venue Details
module.


**Dependencies**

!*/

package venue.details.layer;

import system.types.*;
import venue.details.metadata.*;
import venue.details.instantiations.*;


/**
  * Parking facility attribute layer. Contains all attributes that are
  * assigned to parking facility elements.
  */
struct ParkingFacilityAttributeLayer
{
  /** Content bitmask indicating which attribute maps or sets are available. */
  ParkingFacilityAttributeLayerContent content;

  /** Attribute maps for parking facility attributes. */
  ParkingFacilityAttributeMapList(0) parkingFacilityAttributeMaps
    if (content & ParkingFacilityAttributeLayerContent.PARKING_FACILITY_MAPS)
    == ParkingFacilityAttributeLayerContent.PARKING_FACILITY_MAPS;

  /** Attribute sets for parking facility attributes. */
  ParkingFacilityAttributeSetList(0) parkingFacilityAttributeSets
    if (content & ParkingFacilityAttributeLayerContent.PARKING_FACILITY_SETS)
    == ParkingFacilityAttributeLayerContent.PARKING_FACILITY_SETS;

  /** Attribute maps for parking level attributes. */
  ParkingLevelAttributeMapList(0) parkingLevelAttributeMaps
    if (content & ParkingFacilityAttributeLayerContent.PARKING_LEVEL_MAPS)
    == ParkingFacilityAttributeLayerContent.PARKING_LEVEL_MAPS;

  /** Attribute sets for parking level attributes. */
  ParkingLevelAttributeSetList(0) parkingLevelAttributeSets
    if (content & ParkingFacilityAttributeLayerContent.PARKING_LEVEL_SETS)
    == ParkingFacilityAttributeLayerContent.PARKING_LEVEL_SETS;

  /** Attribute maps for parking section attributes. */
  ParkingSectionAttributeMapList(0) parkingSectionAttributeMaps
    if (content & ParkingFacilityAttributeLayerContent.PARKING_SECTION_MAPS)
    == ParkingFacilityAttributeLayerContent.PARKING_SECTION_MAPS;

  /** Attribute sets for parking section attributes. */
  ParkingSectionAttributeSetList(0) parkingSectionAttributeSets
    if (content & ParkingFacilityAttributeLayerContent.PARKING_SECTION_SETS)
    == ParkingFacilityAttributeLayerContent.PARKING_SECTION_SETS;

  /** Attribute maps for parking row attributes. */
  ParkingRowAttributeMapList(0) parkingRowAttributeMaps
    if (content & ParkingFacilityAttributeLayerContent.PARKING_ROW_MAPS)
    == ParkingFacilityAttributeLayerContent.PARKING_ROW_MAPS;

  /** Attribute sets for parking row attributes. */
  ParkingRowAttributeSetList(0) parkingRowAttributeSets
    if (content & ParkingFacilityAttributeLayerContent.PARKING_ROW_SETS)
    == ParkingFacilityAttributeLayerContent.PARKING_ROW_SETS;

  /** Attribute maps for parking spot attributes. */
  ParkingSpotAttributeMapList(0) parkingSpotAttributeMaps
    if (content & ParkingFacilityAttributeLayerContent.PARKING_SPOT_MAPS)
    == ParkingFacilityAttributeLayerContent.PARKING_SPOT_MAPS;

  /** Attribute sets for parking spot attributes. */
  ParkingSpotAttributeSetList(0) parkingSpotAttributeSets
    if (content & ParkingFacilityAttributeLayerContent.PARKING_SPOT_SETS)
    == ParkingFacilityAttributeLayerContent.PARKING_SPOT_SETS;

  /** Returns the layer type descriptor. */
  function LayerType getLayerType()
  {
    return LayerType.ATTRIBUTE;
  }
};
