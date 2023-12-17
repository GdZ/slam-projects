/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.types;

public enum TrafficLightUsageType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    INTERSECTION((short)0),
    RAMP_METER((short)1),
    TOLL_BOOTH((short)2),
    PEDESTRIAN_CROSSING((short)3),
    BICYCLE_CROSSING((short)4),
    TUNNEL((short)5),
    BRIDGE((short)6),
    LANE_CONTROL((short)7),
    RAILWAY_CROSSING((short)8),
    TRAM_CROSSING((short)9),
    SPEED_SIGN((short)10),
    WARNING_LIGHT((short)11),
    ADVANCE_WARNING_LIGHT((short)12),
    PEDESTRIAN((short)13);

    private TrafficLightUsageType(short value)
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
                new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits(8),
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
        return 8;
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return deltaContext.bitSizeOf(
                new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits(8),
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
        out.writeUnsignedByte(getValue());
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.write(
                new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits(8), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(value));
    }

    public static TrafficLightUsageType readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum(in.readUnsignedByte());
    }

    public static TrafficLightUsageType readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ShortArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits(8), in)).get());
    }

    public static TrafficLightUsageType toEnum(short value)
    {
        switch (value)
        {
            case (short)0:
                return INTERSECTION;
            case (short)1:
                return RAMP_METER;
            case (short)2:
                return TOLL_BOOTH;
            case (short)3:
                return PEDESTRIAN_CROSSING;
            case (short)4:
                return BICYCLE_CROSSING;
            case (short)5:
                return TUNNEL;
            case (short)6:
                return BRIDGE;
            case (short)7:
                return LANE_CONTROL;
            case (short)8:
                return RAILWAY_CROSSING;
            case (short)9:
                return TRAM_CROSSING;
            case (short)10:
                return SPEED_SIGN;
            case (short)11:
                return WARNING_LIGHT;
            case (short)12:
                return ADVANCE_WARNING_LIGHT;
            case (short)13:
                return PEDESTRIAN;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration TrafficLightUsageType: " + value + "!");
        }
    }

    public static TrafficLightUsageType toEnum(java.lang.String itemName)
    {
        if (itemName.equals("INTERSECTION"))
            return INTERSECTION;
        if (itemName.equals("RAMP_METER"))
            return RAMP_METER;
        if (itemName.equals("TOLL_BOOTH"))
            return TOLL_BOOTH;
        if (itemName.equals("PEDESTRIAN_CROSSING"))
            return PEDESTRIAN_CROSSING;
        if (itemName.equals("BICYCLE_CROSSING"))
            return BICYCLE_CROSSING;
        if (itemName.equals("TUNNEL"))
            return TUNNEL;
        if (itemName.equals("BRIDGE"))
            return BRIDGE;
        if (itemName.equals("LANE_CONTROL"))
            return LANE_CONTROL;
        if (itemName.equals("RAILWAY_CROSSING"))
            return RAILWAY_CROSSING;
        if (itemName.equals("TRAM_CROSSING"))
            return TRAM_CROSSING;
        if (itemName.equals("SPEED_SIGN"))
            return SPEED_SIGN;
        if (itemName.equals("WARNING_LIGHT"))
            return WARNING_LIGHT;
        if (itemName.equals("ADVANCE_WARNING_LIGHT"))
            return ADVANCE_WARNING_LIGHT;
        if (itemName.equals("PEDESTRIAN"))
            return PEDESTRIAN;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration TrafficLightUsageType!");
    }

    private short value;
}
