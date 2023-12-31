/*!

# Characteristics Attribute Properties

This package defines attribute properties of characteristics attributes.

**Dependencies**

!*/

package characteristics.properties;

import core.properties.*;
import characteristics.types.*;

/*!

Depending on the attribute property type, the Characteristics module uses either
attribute property types that are defined in the Core module or attribute
property types that are locally defined in the Characteristics module.

!*/

/** Defines which attribute property type is used. */
struct CharacsPropertyType
{
  /**
    * Type of attribute property. If set to `CORE`, then an attribute
    * property from the Core module is used.
    */
  PropertyType type;

  /** Attribute property type imported from the Core module. */
  CorePropertyType coreType if type == PropertyType.CORE;
};

/**
  * Value of the attribute property. The values are either locally defined
  * or the attribute property uses a globally defined value from the Core module.
  */
struct CharacsPropertyValue(CharacsPropertyType type)
{
  /** Value of the attribute property if locally defined. */
  PropertyValue(type.type) value if type.type != PropertyType.CORE;

  /**
    * Value of the attribute property if globally defined in the Core module.
    */
  CorePropertyValue(type.coreType) coreValue if type.type == PropertyType.CORE;
};

rule_group CharacteristicsPropertyTypeRules
{
  /*!
  Usage of `STATION_STOP_TYPE`:

  The property `STATION_STOP_TYPE` shall only be used with the attribute `STATION`.
  !*/

  rule "characteristics-8wfh8p";

  /*!
  Usage of `STATION_TEMPORARY`:

  The property `STATION_TEMPORARY` shall only be used with the attribute `STATION`.
  !*/

  rule "characteristics-mcfd5f";

  /*!
  Usage of `STATION_TOLL_BOOTHS`:

  The property `STATION_TOLL_BOOTHS` shall only be used with the attribute `STATION`.
  !*/

  rule "characteristics-mf8d5f";
};

/** Type of attribute property. */
enum varuint16 PropertyType
{
  /** Attribute property types from Core module are used. */
  CORE = 0,

  /**
    * DEPRECATED. Use attribute property `TOLL_PAYMENT` from the Core module instead.
    */
  TOLL_PAYMENT,

  /**
    * Stop type at a station, for example, whether a vehicle has to slow down or
    * stop.
    */
  STATION_STOP_TYPE,

  /**
    * Station is temporary, for example, movable toll booths or movable checkpoints.
    * Construction characteristics are different from those of fixed stations.
    */
  STATION_TEMPORARY,

  /** Number of toll booths at a toll station. */
  STATION_TOLL_BOOTHS,
};

choice PropertyValue(PropertyType type) on type
{
  case CORE:
    ;
  case TOLL_PAYMENT:
    TollPayment tollPayment[];
  case STATION_STOP_TYPE:
    StationStopType stationStopType;
  case STATION_TEMPORARY:
    StationTemporary stationTemporary;
  case STATION_TOLL_BOOTHS:
    StationTollBooths stationTollBooths;
};
