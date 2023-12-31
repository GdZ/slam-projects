/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.name.attributes;

public enum NamePoiAttributeType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    NAME((short)0),
    ADMINISTRATIVE_HIERARCHY((short)1),
    ROAD_NAME((short)2),
    HOUSE_NUMBER((short)3),
    BUILDING_NAME((short)4),
    FLOOR_NAME((short)5);

    private NamePoiAttributeType(short value)
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

    public static NamePoiAttributeType readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum(in.readVarUInt16());
    }

    public static NamePoiAttributeType readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ShortArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get());
    }

    public static NamePoiAttributeType toEnum(short value)
    {
        switch (value)
        {
            case (short)0:
                return NAME;
            case (short)1:
                return ADMINISTRATIVE_HIERARCHY;
            case (short)2:
                return ROAD_NAME;
            case (short)3:
                return HOUSE_NUMBER;
            case (short)4:
                return BUILDING_NAME;
            case (short)5:
                return FLOOR_NAME;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration NamePoiAttributeType: " + value + "!");
        }
    }

    public static NamePoiAttributeType toEnum(java.lang.String itemName)
    {
        if (itemName.equals("NAME"))
            return NAME;
        if (itemName.equals("ADMINISTRATIVE_HIERARCHY"))
            return ADMINISTRATIVE_HIERARCHY;
        if (itemName.equals("ROAD_NAME"))
            return ROAD_NAME;
        if (itemName.equals("HOUSE_NUMBER"))
            return HOUSE_NUMBER;
        if (itemName.equals("BUILDING_NAME"))
            return BUILDING_NAME;
        if (itemName.equals("FLOOR_NAME"))
            return FLOOR_NAME;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration NamePoiAttributeType!");
    }

    private short value;
}
