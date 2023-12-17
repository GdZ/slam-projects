/*!

# Instructions Attribute Properties

This package defines attribute properties of instructions attributes.

**Dependencies**

!*/

package instructions.properties;

import core.properties.*;
import core.types.*;
import instructions.types.*;

/*!

Depending on the attribute property type, the Instructions module uses either
attribute property types that are defined in the Core module or attribute
property types that are locally defined in the Instructions module.

!*/

/** Defines which attribute property type is used. */
struct InstructionsPropertyType
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
struct InstructionsPropertyValue(InstructionsPropertyType type)
{
  /** Value of the attribute property if locally defined. */
  PropertyValue(type.type) value if type.type != PropertyType.CORE;

  /**
    * Value of the attribute property if globally defined in the Core module.
    */
  CorePropertyValue(type.coreType) coreValue if type.type == PropertyType.CORE;
};

rule_group InstructionsPropertyTypeRules
{

};

/** Type of attribute property. */
enum varuint16 PropertyType
{
  /** Attribute property types from Core module are used. */
  CORE = 0,

  /**
    * Language code of a guidance instruction. Enables applications to filter
    * for different languages.
    */
  LANGUAGE_CODE,

  /** Phonetic transcriptions of a signpost instruction. */
  SIGNPOST_PHONETIC_TRANSCRIPTIONS,

  /**
    * Background color for the simplified graphical representation
    * of a signpost instruction.
    */
  SIGNPOST_GRAPHICS_BACKGROUND_COLOR,

  /**
    * Background icon for the simplified graphical representation of a
    * signpost instruction.
    */
  SIGNPOST_GRAPHICS_BACKGROUND_ICON,

  /**
    * Icon for towards information on the simplified graphical representation of
    * a signpost instruction.
    */
  SIGNPOST_GRAPHICS_TOWARDS_ICON,

  /**
    * Icon for direction information on the simplified graphical representation
    * of a signpost instruction.
    */
  SIGNPOST_GRAPHICS_DIRECTION_ICON,

  /**
    * Text color for the simplified graphical representation of a signpost
    * instruction.
    */
  SIGNPOST_GRAPHICS_TEXT_COLOR,
};

choice PropertyValue(PropertyType type) on type
{
  case CORE:
    ;
  case LANGUAGE_CODE:
    LanguageCode languageCode;
  case SIGNPOST_PHONETIC_TRANSCRIPTIONS:
    SignpostPhoneticTranscriptions signpostPhoneticTranscriptions;
  case SIGNPOST_GRAPHICS_BACKGROUND_COLOR:
    SignpostGraphicsBackgroundColor signpostGraphicsBackgroundColor;
  case SIGNPOST_GRAPHICS_BACKGROUND_ICON:
    SignpostGraphicsBackgroundIcon signpostGraphicsBackgroundIcon;
  case SIGNPOST_GRAPHICS_TOWARDS_ICON:
    SignpostGraphicsTowardsIcon signpostGraphicsTowardsIcon;
  case SIGNPOST_GRAPHICS_DIRECTION_ICON:
    SignpostGraphicsDirectionIcon signpostGraphicsDirectionIcon;
  case SIGNPOST_GRAPHICS_TEXT_COLOR:
    SignpostGraphicsTextColor signpostGraphicsTextColor;
};
