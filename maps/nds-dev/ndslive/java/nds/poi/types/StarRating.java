/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.poi.types;

public enum StarRating implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    RATING_1_STAR((byte)0),
    RATING_2_STAR((byte)1),
    RATING_3_STAR((byte)2),
    RATING_4_STAR((byte)3),
    RATING_5_STAR((byte)4),
    RATING_6_STAR((byte)5),
    RATING_7_STAR((byte)6);

    private StarRating(byte value)
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
                new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(3),
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
        return 3;
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return deltaContext.bitSizeOf(
                new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(3),
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
        out.writeBits(getValue(), 3);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.write(
                new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(3), out,
                new zserio.runtime.array.ArrayElement.ByteArrayElement(value));
    }

    public static StarRating readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum((byte)in.readBits(3));
    }

    public static StarRating readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ByteArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(3), in)).get());
    }

    public static StarRating toEnum(byte value)
    {
        switch (value)
        {
            case (byte)0:
                return RATING_1_STAR;
            case (byte)1:
                return RATING_2_STAR;
            case (byte)2:
                return RATING_3_STAR;
            case (byte)3:
                return RATING_4_STAR;
            case (byte)4:
                return RATING_5_STAR;
            case (byte)5:
                return RATING_6_STAR;
            case (byte)6:
                return RATING_7_STAR;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration StarRating: " + value + "!");
        }
    }

    public static StarRating toEnum(java.lang.String itemName)
    {
        if (itemName.equals("RATING_1_STAR"))
            return RATING_1_STAR;
        if (itemName.equals("RATING_2_STAR"))
            return RATING_2_STAR;
        if (itemName.equals("RATING_3_STAR"))
            return RATING_3_STAR;
        if (itemName.equals("RATING_4_STAR"))
            return RATING_4_STAR;
        if (itemName.equals("RATING_5_STAR"))
            return RATING_5_STAR;
        if (itemName.equals("RATING_6_STAR"))
            return RATING_6_STAR;
        if (itemName.equals("RATING_7_STAR"))
            return RATING_7_STAR;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration StarRating!");
    }

    private byte value;
}
