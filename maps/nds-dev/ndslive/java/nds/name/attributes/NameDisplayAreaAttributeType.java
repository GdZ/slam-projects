/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.name.attributes;

public enum NameDisplayAreaAttributeType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    ROAD_NAME((short)0),
    BRIDGE_NAME((short)1),
    TUNNEL_NAME((short)2),
    AREA_LABEL_NAME((short)3),
    BUILDING_NAME((short)4),
    NATURE_AREA_NAME((short)5),
    WATER_NAME((short)6),
    ADMINISTRATIVE_AREA_NAME((short)7),
    ADMINISTRATIVE_HIERARCHY((short)8),
    SERVICE_AREA_NAME((short)9),
    INTERSECTION_NAME((short)10);

    private NameDisplayAreaAttributeType(short value)
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

    public static NameDisplayAreaAttributeType readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum(in.readVarUInt16());
    }

    public static NameDisplayAreaAttributeType readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ShortArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get());
    }

    public static NameDisplayAreaAttributeType toEnum(short value)
    {
        switch (value)
        {
            case (short)0:
                return ROAD_NAME;
            case (short)1:
                return BRIDGE_NAME;
            case (short)2:
                return TUNNEL_NAME;
            case (short)3:
                return AREA_LABEL_NAME;
            case (short)4:
                return BUILDING_NAME;
            case (short)5:
                return NATURE_AREA_NAME;
            case (short)6:
                return WATER_NAME;
            case (short)7:
                return ADMINISTRATIVE_AREA_NAME;
            case (short)8:
                return ADMINISTRATIVE_HIERARCHY;
            case (short)9:
                return SERVICE_AREA_NAME;
            case (short)10:
                return INTERSECTION_NAME;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration NameDisplayAreaAttributeType: " + value + "!");
        }
    }

    public static NameDisplayAreaAttributeType toEnum(java.lang.String itemName)
    {
        if (itemName.equals("ROAD_NAME"))
            return ROAD_NAME;
        if (itemName.equals("BRIDGE_NAME"))
            return BRIDGE_NAME;
        if (itemName.equals("TUNNEL_NAME"))
            return TUNNEL_NAME;
        if (itemName.equals("AREA_LABEL_NAME"))
            return AREA_LABEL_NAME;
        if (itemName.equals("BUILDING_NAME"))
            return BUILDING_NAME;
        if (itemName.equals("NATURE_AREA_NAME"))
            return NATURE_AREA_NAME;
        if (itemName.equals("WATER_NAME"))
            return WATER_NAME;
        if (itemName.equals("ADMINISTRATIVE_AREA_NAME"))
            return ADMINISTRATIVE_AREA_NAME;
        if (itemName.equals("ADMINISTRATIVE_HIERARCHY"))
            return ADMINISTRATIVE_HIERARCHY;
        if (itemName.equals("SERVICE_AREA_NAME"))
            return SERVICE_AREA_NAME;
        if (itemName.equals("INTERSECTION_NAME"))
            return INTERSECTION_NAME;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration NameDisplayAreaAttributeType!");
    }

    private short value;
}
