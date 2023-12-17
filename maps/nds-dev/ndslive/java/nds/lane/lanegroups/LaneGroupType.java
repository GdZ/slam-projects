/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.lanegroups;

public enum LaneGroupType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    ROAD((short)0),
    INTERSECTION((short)1),
    BORDER((short)2),
    FORK((short)3),
    ARTIFICIAL_ROAD((short)4),
    ARTIFICIAL_INTERSECTION((short)5);

    private LaneGroupType(short value)
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

    public static LaneGroupType readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum(in.readUnsignedByte());
    }

    public static LaneGroupType readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ShortArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits(8), in)).get());
    }

    public static LaneGroupType toEnum(short value)
    {
        switch (value)
        {
            case (short)0:
                return ROAD;
            case (short)1:
                return INTERSECTION;
            case (short)2:
                return BORDER;
            case (short)3:
                return FORK;
            case (short)4:
                return ARTIFICIAL_ROAD;
            case (short)5:
                return ARTIFICIAL_INTERSECTION;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration LaneGroupType: " + value + "!");
        }
    }

    public static LaneGroupType toEnum(java.lang.String itemName)
    {
        if (itemName.equals("ROAD"))
            return ROAD;
        if (itemName.equals("INTERSECTION"))
            return INTERSECTION;
        if (itemName.equals("BORDER"))
            return BORDER;
        if (itemName.equals("FORK"))
            return FORK;
        if (itemName.equals("ARTIFICIAL_ROAD"))
            return ARTIFICIAL_ROAD;
        if (itemName.equals("ARTIFICIAL_INTERSECTION"))
            return ARTIFICIAL_INTERSECTION;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration LaneGroupType!");
    }

    private short value;
}
