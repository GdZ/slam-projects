/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.characteristics.types;

public enum ComplexIntersectionType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    STANDARD_INTERSECTION((byte)0),
    CONTROLLED_ACCESS_INTERSECTION((byte)1),
    COMBINED_INTERSECTION((byte)2);

    private ComplexIntersectionType(byte value)
    {
        this.value = value;
    }

    public byte getValue()
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
                new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(2),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(value));
    }

    @Override
    public int bitSizeOf()
    {
        return bitSizeOf(0);
    }

    @Override
    public int bitSizeOf(long bitPosition)
    {
        return 2;
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return deltaContext.bitSizeOf(
                new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(2),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(value));
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
        out.writeBits(getValue(), 2);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.write(
                new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(2), out,
                new zserio.runtime.array.ArrayElement.ByteArrayElement(value));
    }

    public static ComplexIntersectionType readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum((byte)in.readBits(2));
    }

    public static ComplexIntersectionType readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ByteArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(2), in)).get());
    }

    public static ComplexIntersectionType toEnum(byte value)
    {
        switch (value)
        {
            case (byte)0:
                return STANDARD_INTERSECTION;
            case (byte)1:
                return CONTROLLED_ACCESS_INTERSECTION;
            case (byte)2:
                return COMBINED_INTERSECTION;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration ComplexIntersectionType: " + value + "!");
        }
    }

    public static ComplexIntersectionType toEnum(java.lang.String itemName)
    {
        if (itemName.equals("STANDARD_INTERSECTION"))
            return STANDARD_INTERSECTION;
        if (itemName.equals("CONTROLLED_ACCESS_INTERSECTION"))
            return CONTROLLED_ACCESS_INTERSECTION;
        if (itemName.equals("COMBINED_INTERSECTION"))
            return COMBINED_INTERSECTION;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration ComplexIntersectionType!");
    }

    private byte value;
}
