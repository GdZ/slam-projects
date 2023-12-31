/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.traffic.types;

public enum TrafficEventReason implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    UNKNOWN((short)0),
    TRAFFIC_CONGESTION((short)1),
    ACCIDENT((short)2),
    ROADWORKS((short)3),
    NARROW_LANES((short)4),
    IMPASSIBILITY((short)5),
    SLIPPERY_ROAD((short)6),
    AQUAPLANING((short)7),
    FIRE((short)8),
    HAZARDOUS_DRIVING_CONDITIONS((short)9),
    OBJECTS_ON_THE_ROAD((short)10),
    ANIMALS_ON_ROADWAY((short)11),
    PEOPLE_ON_ROADWAY((short)12),
    BROKEN_DOWN_VEHICLES((short)13),
    VEHICLE_ON_WRONG_CARRIAGE_WAY_GHOSTDRIVER((short)14),
    RESCUE_RECOVERY_IN_PROGRESS((short)15),
    REGULATORY_MEASURE((short)16),
    EXTREME_WEATHER_CONDITIONS((short)17),
    VISIBILITY_REDUCED((short)18),
    PRECIPITATION((short)19),
    RECKLESS_PERSONS((short)20),
    OVERHEIGHT_WARNING_SYSTEM_TRIGGERED((short)21),
    TRAFFIC_REGULATIONS_CHANGED((short)22),
    MAJOR_EVENT((short)23),
    SERVICE_NOT_OPERATING((short)24),
    SERVICE_NOT_USABLE((short)25),
    SLOW_MOVING_VEHICLES((short)26),
    DANGEROUS_END_OF_QUEUE((short)27),
    RISK_OF_FIRE((short)28),
    TIME_DELAY((short)29),
    POLICE_CHECKPOINT((short)30),
    MALFUNCTIONING_ROADSIDE_EQUIPMENT((short)31),
    SERIOUS_ACCIDENT((short)32),
    EARLIER_ACCIDENT((short)33),
    ACCIDENT_REPORTED((short)34),
    ACCIDENT_INVESTIGATION_WORK((short)35),
    MULTI_VEHICLE_ACCIDENT((short)36),
    ACCIDENT_INVOLVING_LORRY((short)37),
    ACCIDENT_TRAFFIC_BEING_DIRECTED_AROUND((short)38),
    LONG_TERM_ROADWORKS((short)39),
    CONSTRUCTION_WORK((short)40),
    BRIDGE_MAINTENANCE_WORK((short)41),
    RESURFACING_WORK((short)42),
    MAJOR_ROADWORKS((short)43),
    ROAD_MAINTENANCE_WORKS((short)44),
    ROADWORKS_DURING_NIGHT((short)45),
    ROADWORKS_SINGLE_LINE_TRAFFIC_ALTERNATE_DIRECTIONS((short)46),
    FLOODING((short)47),
    SNOW_ON_ROAD((short)48),
    ICE_ON_ROAD((short)49),
    BLACK_ICE_ON_ROAD((short)50),
    GRASS_FIRE((short)51),
    FOREST_FIRE((short)52),
    OVERTURNED_VEHICLE((short)53),
    BROKEN_DOWN_LORRY((short)54),
    VEHICLE_SPUN_AROUND((short)55),
    VEHICLE_ON_FIRE((short)56),
    GUSTY_WINDS((short)57),
    STRONG_WINDS((short)58),
    THUNDERSTORM((short)59),
    VISIBILITY_REDUCED_BY_FOG((short)60),
    VISIBILITY_REDUCED_BY_LOW_SUN_GLARE((short)61),
    SNOW((short)62),
    RAIN((short)63),
    HAIL((short)64),
    SPORTS_EVENT((short)65),
    TRAFFIC_CONTROL_SIGNALS_NOT_WORKING((short)66),
    TRAFFIC_CONTROL_SIGNALS_WORKING_INCORRECTLY((short)67),
    CLOSURE((short)68);

    private TrafficEventReason(short value)
    {
        this.value = value;
    }

    public short getValue()
    {
        return value;
    }

    @Override
    public java.lang.Number getGenericValue()
    {
        return value;
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.init(
                new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(value));
    }

    @Override
    public int bitSizeOf()
    {
        return bitSizeOf(0);
    }

    @Override
    public int bitSizeOf(long bitPosition)
    {
        return zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(value);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return deltaContext.bitSizeOf(
                new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(value));
    }

    @Override
    public long initializeOffsets()
    {
        return initializeOffsets(0);
    }

    @Override
    public long initializeOffsets(long bitPosition) throws zserio.runtime.ZserioError
    {
        return bitPosition + bitSizeOf(bitPosition);
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        return bitPosition + bitSizeOf(context, bitPosition);
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarUInt16(getValue());
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.write(
                new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(value));
    }

    public static TrafficEventReason readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum(in.readVarUInt16());
    }

    public static TrafficEventReason readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ShortArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get());
    }

    public static TrafficEventReason toEnum(short value)
    {
        switch (value)
        {
            case (short)0:
                return UNKNOWN;
            case (short)1:
                return TRAFFIC_CONGESTION;
            case (short)2:
                return ACCIDENT;
            case (short)3:
                return ROADWORKS;
            case (short)4:
                return NARROW_LANES;
            case (short)5:
                return IMPASSIBILITY;
            case (short)6:
                return SLIPPERY_ROAD;
            case (short)7:
                return AQUAPLANING;
            case (short)8:
                return FIRE;
            case (short)9:
                return HAZARDOUS_DRIVING_CONDITIONS;
            case (short)10:
                return OBJECTS_ON_THE_ROAD;
            case (short)11:
                return ANIMALS_ON_ROADWAY;
            case (short)12:
                return PEOPLE_ON_ROADWAY;
            case (short)13:
                return BROKEN_DOWN_VEHICLES;
            case (short)14:
                return VEHICLE_ON_WRONG_CARRIAGE_WAY_GHOSTDRIVER;
            case (short)15:
                return RESCUE_RECOVERY_IN_PROGRESS;
            case (short)16:
                return REGULATORY_MEASURE;
            case (short)17:
                return EXTREME_WEATHER_CONDITIONS;
            case (short)18:
                return VISIBILITY_REDUCED;
            case (short)19:
                return PRECIPITATION;
            case (short)20:
                return RECKLESS_PERSONS;
            case (short)21:
                return OVERHEIGHT_WARNING_SYSTEM_TRIGGERED;
            case (short)22:
                return TRAFFIC_REGULATIONS_CHANGED;
            case (short)23:
                return MAJOR_EVENT;
            case (short)24:
                return SERVICE_NOT_OPERATING;
            case (short)25:
                return SERVICE_NOT_USABLE;
            case (short)26:
                return SLOW_MOVING_VEHICLES;
            case (short)27:
                return DANGEROUS_END_OF_QUEUE;
            case (short)28:
                return RISK_OF_FIRE;
            case (short)29:
                return TIME_DELAY;
            case (short)30:
                return POLICE_CHECKPOINT;
            case (short)31:
                return MALFUNCTIONING_ROADSIDE_EQUIPMENT;
            case (short)32:
                return SERIOUS_ACCIDENT;
            case (short)33:
                return EARLIER_ACCIDENT;
            case (short)34:
                return ACCIDENT_REPORTED;
            case (short)35:
                return ACCIDENT_INVESTIGATION_WORK;
            case (short)36:
                return MULTI_VEHICLE_ACCIDENT;
            case (short)37:
                return ACCIDENT_INVOLVING_LORRY;
            case (short)38:
                return ACCIDENT_TRAFFIC_BEING_DIRECTED_AROUND;
            case (short)39:
                return LONG_TERM_ROADWORKS;
            case (short)40:
                return CONSTRUCTION_WORK;
            case (short)41:
                return BRIDGE_MAINTENANCE_WORK;
            case (short)42:
                return RESURFACING_WORK;
            case (short)43:
                return MAJOR_ROADWORKS;
            case (short)44:
                return ROAD_MAINTENANCE_WORKS;
            case (short)45:
                return ROADWORKS_DURING_NIGHT;
            case (short)46:
                return ROADWORKS_SINGLE_LINE_TRAFFIC_ALTERNATE_DIRECTIONS;
            case (short)47:
                return FLOODING;
            case (short)48:
                return SNOW_ON_ROAD;
            case (short)49:
                return ICE_ON_ROAD;
            case (short)50:
                return BLACK_ICE_ON_ROAD;
            case (short)51:
                return GRASS_FIRE;
            case (short)52:
                return FOREST_FIRE;
            case (short)53:
                return OVERTURNED_VEHICLE;
            case (short)54:
                return BROKEN_DOWN_LORRY;
            case (short)55:
                return VEHICLE_SPUN_AROUND;
            case (short)56:
                return VEHICLE_ON_FIRE;
            case (short)57:
                return GUSTY_WINDS;
            case (short)58:
                return STRONG_WINDS;
            case (short)59:
                return THUNDERSTORM;
            case (short)60:
                return VISIBILITY_REDUCED_BY_FOG;
            case (short)61:
                return VISIBILITY_REDUCED_BY_LOW_SUN_GLARE;
            case (short)62:
                return SNOW;
            case (short)63:
                return RAIN;
            case (short)64:
                return HAIL;
            case (short)65:
                return SPORTS_EVENT;
            case (short)66:
                return TRAFFIC_CONTROL_SIGNALS_NOT_WORKING;
            case (short)67:
                return TRAFFIC_CONTROL_SIGNALS_WORKING_INCORRECTLY;
            case (short)68:
                return CLOSURE;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration TrafficEventReason: " + value + "!");
        }
    }

    public static TrafficEventReason toEnum(java.lang.String itemName)
    {
        if (itemName.equals("UNKNOWN"))
            return UNKNOWN;
        if (itemName.equals("TRAFFIC_CONGESTION"))
            return TRAFFIC_CONGESTION;
        if (itemName.equals("ACCIDENT"))
            return ACCIDENT;
        if (itemName.equals("ROADWORKS"))
            return ROADWORKS;
        if (itemName.equals("NARROW_LANES"))
            return NARROW_LANES;
        if (itemName.equals("IMPASSIBILITY"))
            return IMPASSIBILITY;
        if (itemName.equals("SLIPPERY_ROAD"))
            return SLIPPERY_ROAD;
        if (itemName.equals("AQUAPLANING"))
            return AQUAPLANING;
        if (itemName.equals("FIRE"))
            return FIRE;
        if (itemName.equals("HAZARDOUS_DRIVING_CONDITIONS"))
            return HAZARDOUS_DRIVING_CONDITIONS;
        if (itemName.equals("OBJECTS_ON_THE_ROAD"))
            return OBJECTS_ON_THE_ROAD;
        if (itemName.equals("ANIMALS_ON_ROADWAY"))
            return ANIMALS_ON_ROADWAY;
        if (itemName.equals("PEOPLE_ON_ROADWAY"))
            return PEOPLE_ON_ROADWAY;
        if (itemName.equals("BROKEN_DOWN_VEHICLES"))
            return BROKEN_DOWN_VEHICLES;
        if (itemName.equals("VEHICLE_ON_WRONG_CARRIAGE_WAY_GHOSTDRIVER"))
            return VEHICLE_ON_WRONG_CARRIAGE_WAY_GHOSTDRIVER;
        if (itemName.equals("RESCUE_RECOVERY_IN_PROGRESS"))
            return RESCUE_RECOVERY_IN_PROGRESS;
        if (itemName.equals("REGULATORY_MEASURE"))
            return REGULATORY_MEASURE;
        if (itemName.equals("EXTREME_WEATHER_CONDITIONS"))
            return EXTREME_WEATHER_CONDITIONS;
        if (itemName.equals("VISIBILITY_REDUCED"))
            return VISIBILITY_REDUCED;
        if (itemName.equals("PRECIPITATION"))
            return PRECIPITATION;
        if (itemName.equals("RECKLESS_PERSONS"))
            return RECKLESS_PERSONS;
        if (itemName.equals("OVERHEIGHT_WARNING_SYSTEM_TRIGGERED"))
            return OVERHEIGHT_WARNING_SYSTEM_TRIGGERED;
        if (itemName.equals("TRAFFIC_REGULATIONS_CHANGED"))
            return TRAFFIC_REGULATIONS_CHANGED;
        if (itemName.equals("MAJOR_EVENT"))
            return MAJOR_EVENT;
        if (itemName.equals("SERVICE_NOT_OPERATING"))
            return SERVICE_NOT_OPERATING;
        if (itemName.equals("SERVICE_NOT_USABLE"))
            return SERVICE_NOT_USABLE;
        if (itemName.equals("SLOW_MOVING_VEHICLES"))
            return SLOW_MOVING_VEHICLES;
        if (itemName.equals("DANGEROUS_END_OF_QUEUE"))
            return DANGEROUS_END_OF_QUEUE;
        if (itemName.equals("RISK_OF_FIRE"))
            return RISK_OF_FIRE;
        if (itemName.equals("TIME_DELAY"))
            return TIME_DELAY;
        if (itemName.equals("POLICE_CHECKPOINT"))
            return POLICE_CHECKPOINT;
        if (itemName.equals("MALFUNCTIONING_ROADSIDE_EQUIPMENT"))
            return MALFUNCTIONING_ROADSIDE_EQUIPMENT;
        if (itemName.equals("SERIOUS_ACCIDENT"))
            return SERIOUS_ACCIDENT;
        if (itemName.equals("EARLIER_ACCIDENT"))
            return EARLIER_ACCIDENT;
        if (itemName.equals("ACCIDENT_REPORTED"))
            return ACCIDENT_REPORTED;
        if (itemName.equals("ACCIDENT_INVESTIGATION_WORK"))
            return ACCIDENT_INVESTIGATION_WORK;
        if (itemName.equals("MULTI_VEHICLE_ACCIDENT"))
            return MULTI_VEHICLE_ACCIDENT;
        if (itemName.equals("ACCIDENT_INVOLVING_LORRY"))
            return ACCIDENT_INVOLVING_LORRY;
        if (itemName.equals("ACCIDENT_TRAFFIC_BEING_DIRECTED_AROUND"))
            return ACCIDENT_TRAFFIC_BEING_DIRECTED_AROUND;
        if (itemName.equals("LONG_TERM_ROADWORKS"))
            return LONG_TERM_ROADWORKS;
        if (itemName.equals("CONSTRUCTION_WORK"))
            return CONSTRUCTION_WORK;
        if (itemName.equals("BRIDGE_MAINTENANCE_WORK"))
            return BRIDGE_MAINTENANCE_WORK;
        if (itemName.equals("RESURFACING_WORK"))
            return RESURFACING_WORK;
        if (itemName.equals("MAJOR_ROADWORKS"))
            return MAJOR_ROADWORKS;
        if (itemName.equals("ROAD_MAINTENANCE_WORKS"))
            return ROAD_MAINTENANCE_WORKS;
        if (itemName.equals("ROADWORKS_DURING_NIGHT"))
            return ROADWORKS_DURING_NIGHT;
        if (itemName.equals("ROADWORKS_SINGLE_LINE_TRAFFIC_ALTERNATE_DIRECTIONS"))
            return ROADWORKS_SINGLE_LINE_TRAFFIC_ALTERNATE_DIRECTIONS;
        if (itemName.equals("FLOODING"))
            return FLOODING;
        if (itemName.equals("SNOW_ON_ROAD"))
            return SNOW_ON_ROAD;
        if (itemName.equals("ICE_ON_ROAD"))
            return ICE_ON_ROAD;
        if (itemName.equals("BLACK_ICE_ON_ROAD"))
            return BLACK_ICE_ON_ROAD;
        if (itemName.equals("GRASS_FIRE"))
            return GRASS_FIRE;
        if (itemName.equals("FOREST_FIRE"))
            return FOREST_FIRE;
        if (itemName.equals("OVERTURNED_VEHICLE"))
            return OVERTURNED_VEHICLE;
        if (itemName.equals("BROKEN_DOWN_LORRY"))
            return BROKEN_DOWN_LORRY;
        if (itemName.equals("VEHICLE_SPUN_AROUND"))
            return VEHICLE_SPUN_AROUND;
        if (itemName.equals("VEHICLE_ON_FIRE"))
            return VEHICLE_ON_FIRE;
        if (itemName.equals("GUSTY_WINDS"))
            return GUSTY_WINDS;
        if (itemName.equals("STRONG_WINDS"))
            return STRONG_WINDS;
        if (itemName.equals("THUNDERSTORM"))
            return THUNDERSTORM;
        if (itemName.equals("VISIBILITY_REDUCED_BY_FOG"))
            return VISIBILITY_REDUCED_BY_FOG;
        if (itemName.equals("VISIBILITY_REDUCED_BY_LOW_SUN_GLARE"))
            return VISIBILITY_REDUCED_BY_LOW_SUN_GLARE;
        if (itemName.equals("SNOW"))
            return SNOW;
        if (itemName.equals("RAIN"))
            return RAIN;
        if (itemName.equals("HAIL"))
            return HAIL;
        if (itemName.equals("SPORTS_EVENT"))
            return SPORTS_EVENT;
        if (itemName.equals("TRAFFIC_CONTROL_SIGNALS_NOT_WORKING"))
            return TRAFFIC_CONTROL_SIGNALS_NOT_WORKING;
        if (itemName.equals("TRAFFIC_CONTROL_SIGNALS_WORKING_INCORRECTLY"))
            return TRAFFIC_CONTROL_SIGNALS_WORKING_INCORRECTLY;
        if (itemName.equals("CLOSURE"))
            return CLOSURE;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration TrafficEventReason!");
    }

    private short value;
}
