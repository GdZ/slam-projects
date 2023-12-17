/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routingdata.types;

public enum SpecialTransitionCode implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    BEAR((byte)0),
    BEAR_AT_EXIT((byte)1),
    BEAR_STRAIGHT((byte)2),
    ALONG_MAIN_ROAD((byte)3),
    NO_ADVICE((byte)4);

    private SpecialTransitionCode(byte value)
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
                new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(4),
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
        return 4;
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return deltaContext.bitSizeOf(
                new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(4),
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
        out.writeBits(getValue(), 4);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.write(
                new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(4), out,
                new zserio.runtime.array.ArrayElement.ByteArrayElement(value));
    }

    public static SpecialTransitionCode readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum((byte)in.readBits(4));
    }

    public static SpecialTransitionCode readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ByteArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(4), in)).get());
    }

    public static SpecialTransitionCode toEnum(byte value)
    {
        switch (value)
        {
            case (byte)0:
                return BEAR;
            case (byte)1:
                return BEAR_AT_EXIT;
            case (byte)2:
                return BEAR_STRAIGHT;
            case (byte)3:
                return ALONG_MAIN_ROAD;
            case (byte)4:
                return NO_ADVICE;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration SpecialTransitionCode: " + value + "!");
        }
    }

    public static SpecialTransitionCode toEnum(java.lang.String itemName)
    {
        if (itemName.equals("BEAR"))
            return BEAR;
        if (itemName.equals("BEAR_AT_EXIT"))
            return BEAR_AT_EXIT;
        if (itemName.equals("BEAR_STRAIGHT"))
            return BEAR_STRAIGHT;
        if (itemName.equals("ALONG_MAIN_ROAD"))
            return ALONG_MAIN_ROAD;
        if (itemName.equals("NO_ADVICE"))
            return NO_ADVICE;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration SpecialTransitionCode!");
    }

    private byte value;
}
