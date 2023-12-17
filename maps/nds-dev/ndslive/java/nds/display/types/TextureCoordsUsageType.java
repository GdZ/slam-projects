/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.types;

public enum TextureCoordsUsageType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    CLAMP((byte)0),
    REPEAT((byte)1),
    MIRROR((byte)2);

    private TextureCoordsUsageType(byte value)
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

    public static TextureCoordsUsageType readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum((byte)in.readBits(2));
    }

    public static TextureCoordsUsageType readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ByteArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(2), in)).get());
    }

    public static TextureCoordsUsageType toEnum(byte value)
    {
        switch (value)
        {
            case (byte)0:
                return CLAMP;
            case (byte)1:
                return REPEAT;
            case (byte)2:
                return MIRROR;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration TextureCoordsUsageType: " + value + "!");
        }
    }

    public static TextureCoordsUsageType toEnum(java.lang.String itemName)
    {
        if (itemName.equals("CLAMP"))
            return CLAMP;
        if (itemName.equals("REPEAT"))
            return REPEAT;
        if (itemName.equals("MIRROR"))
            return MIRROR;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration TextureCoordsUsageType!");
    }

    private byte value;
}