/*!

# Rules Attribute Properties

This package defines attribute properties for the attributes provided by the Rules module.
Attribute properties are used to annotate attributes with supplementary metadata.

The Rules module either uses locally defined attribute property types or
attribute property types that are imported from the Core module.

**Dependencies**

!*/

package rules.properties;

import core.properties.*;
import signs.warning.*;
import rules.types.*;

rule_group RulesPropertyRules
{
  /*!
  Usage of `ROADWORKS_TYPE`:

  The attribute property `ROADWORKS_TYPE` shall only be used in combination with
  the attribute `ROADWORKS`.
  !*/

  rule "rules-xab1m7";

  /*!
  Usage of `TRAFFIC_LIGHTS_LAYOUT`:

  The attribute property `TRAFFIC_LIGHTS_LAYOUT` shall only be used in
  combination with the attribute `TRAFFIC_LIGHTS`.
  !*/

  rule "rules-j72ykj";

  /*!
  Usage of `TRAFFIC_LIGHTS_FACES`:

  The attribute property `TRAFFIC_LIGHTS_FACES` shall only be used in
  combination with the attribute `TRAFFIC_LIGHTS`.
  !*/

  rule "rules-ixcx2j";

  /*!
  Usage of `TRAFFIC_LIGHTS_USAGE_TYPE`:

  The attribute property `TRAFFIC_LIGHTS_USAGE_TYPE` shall only be used in
  combination with the attribute `TRAFFIC_LIGHTS`.
  !*/

  rule "rules-7neqew";

  /*!
  Usage of `TRAFFIC_LIGHTS_TARGET_GROUP`:

  The attribute property `TRAFFIC_LIGHTS_TARGET_GROUP` shall only be used in
  combination with the attribute `TRAFFIC_LIGHTS`.
  !*/

  rule "rules-8n47i4";

  /*!
  Usage of `TRAFFIC_LIGHTS_CYCLE`:

  The attribute property `TRAFFIC_LIGHTS_CYCLE` shall only be used in
  combination with the attribute `TRAFFIC_LIGHTS`.
  !*/

  rule "rules-wdzy3x";

};

/** Defines which attribute property type is used. */
struct RulesPropertyType
{
  /**
    * Type of attribute property. If set to `CORE`, then an attribute property type from the
    * Core module is used.
    */
  PropertyType type;

  /** Attribute property type imported from the Core module. */
  CorePropertyType coreType if type == PropertyType.CORE;
};

/**
  * Value of the attribute property. The values are either locally defined
  * or the attribute property uses a globally defined value from the Core module.
  */
struct RulesPropertyValue(RulesPropertyType type)
{
  /** Value of the attribute property if locally defined. */
  PropertyValue(type.type) value if type.type != PropertyType.CORE;

  /** Value of the attribute property if globally defined in the Core module. */
  CorePropertyValue(type.coreType) coreValue if type.type == PropertyType.CORE;
};

/** Type of attribute property. */
enum varuint16 PropertyType
{
  /** Attribute property types from Core module are used. */
  CORE = 0,

  /**
  * A supplementary warning sign can exist in addition to a main sign.
  * For example, the supplementary sign can indicate the distance to or the extent
  * of the hazard.
  */
  SUPPLEMENTARY_WARNING_SIGN,

  /**
  * Variable warning signs can change their display and validity dynamically.
  * A variable warning sign can use mechanical or light elements.
  */
  VARIABLE_WARNING_SIGN_PROPERTIES,

  /** Provides details about the type of roadworks. */
  ROADWORKS_TYPE,

  /**
    * Detailed layout of one or more traffic lights.
    * Includes orientation and lens definition. */
  TRAFFIC_LIGHTS_LAYOUT,

  /**
    * Faces of traffic lights. Contains the planar polygons of the traffic lights
    * that are part of the attribute this property is attached to.
    * May contain more than one face if there are multiple traffic lights with same
    * layout.
    * Example: An intersection has two simple traffic lights on the left
    * and right side of the road. Both traffic lights are included in one attribute
    * and the two faces are included in this attribute property.
    */
  TRAFFIC_LIGHTS_FACES,

  /** Detailed usage type of traffic lights. */
  TRAFFIC_LIGHTS_USAGE_TYPE,

  /**
    * Target group of traffic lights. Determines for whom the traffic lights
    * are valid, that is, which party has to adhere to them.
    */
  TRAFFIC_LIGHTS_TARGET_GROUP,

  /** Switching cycle details of traffic lights. */
  TRAFFIC_LIGHTS_CYCLE,

  /** Text on a supplementary warning sign. */
  SUPPLEMENTARY_WARNING_SIGN_TEXT,
};

choice PropertyValue(PropertyType type) on type
{
  case CORE:
    ;
  case SUPPLEMENTARY_WARNING_SIGN:
    SupplementaryWarningSign supplementaryWarningSign;
  case VARIABLE_WARNING_SIGN_PROPERTIES:
    VariableWarningSignProperties variableWarningSignProperties;
  case ROADWORKS_TYPE:
    RoadworksType roadworksType;
  case TRAFFIC_LIGHTS_LAYOUT:
    TrafficLightLayout trafficLightLayout;
  case TRAFFIC_LIGHTS_FACES:
    TrafficLightFaceList trafficLightFaces;
  case TRAFFIC_LIGHTS_USAGE_TYPE:
    TrafficLightUsageType trafficLightUsageType;
  case TRAFFIC_LIGHTS_TARGET_GROUP:
    TrafficLightTargetGroup trafficLightTargetGroup;
  case TRAFFIC_LIGHTS_CYCLE:
    TrafficLightCycle trafficLightCycle;
  case SUPPLEMENTARY_WARNING_SIGN_TEXT:
    SupplementaryWarningSignText supplementaryWarningSignText;
};
