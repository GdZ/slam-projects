/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.poi.types;

public enum AccessPointLevel implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    ABOVE_STREET_LEVEL((byte)0),
    BELOW_STREET_LEVEL((byte)1),
    AT_STREET_LEVEL((byte)2);

    private AccessPointLevel(byte value)
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

    public static AccessPointLevel readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum((byte)in.readBits(4));
    }

    public static AccessPointLevel readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ByteArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(4), in)).get());
    }

    public static AccessPointLevel toEnum(byte value)
    {
        switch (value)
        {
            case (byte)0:
                return ABOVE_STREET_LEVEL;
            case (byte)1:
                return BELOW_STREET_LEVEL;
            case (byte)2:
                return AT_STREET_LEVEL;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration AccessPointLevel: " + value + "!");
        }
    }

    public static AccessPointLevel toEnum(java.lang.String itemName)
    {
        if (itemName.equals("ABOVE_STREET_LEVEL"))
            return ABOVE_STREET_LEVEL;
        if (itemName.equals("BELOW_STREET_LEVEL"))
            return BELOW_STREET_LEVEL;
        if (itemName.equals("AT_STREET_LEVEL"))
            return AT_STREET_LEVEL;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration AccessPointLevel!");
    }

    private byte value;
}
