/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.details.types;

public enum Population implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    POPULATION_SMALL((byte)0),
    POPULATION_5K((byte)1),
    POPULATION_10K((byte)2),
    POPULATION_50K((byte)3),
    POPULATION_100K((byte)4),
    POPULATION_500K((byte)5),
    POPULATION_1M((byte)6),
    POPULATION_5M((byte)7),
    POPULATION_10M((byte)8),
    POPULATION_15M((byte)9),
    POPULATION_20M((byte)10),
    POPULATION_25M((byte)11),
    POPULATION_30M((byte)12),
    POPULATION_35M((byte)13),
    POPULATION_40M((byte)14);

    private Population(byte value)
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

    public static Population readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum((byte)in.readBits(4));
    }

    public static Population readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ByteArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(4), in)).get());
    }

    public static Population toEnum(byte value)
    {
        switch (value)
        {
            case (byte)0:
                return POPULATION_SMALL;
            case (byte)1:
                return POPULATION_5K;
            case (byte)2:
                return POPULATION_10K;
            case (byte)3:
                return POPULATION_50K;
            case (byte)4:
                return POPULATION_100K;
            case (byte)5:
                return POPULATION_500K;
            case (byte)6:
                return POPULATION_1M;
            case (byte)7:
                return POPULATION_5M;
            case (byte)8:
                return POPULATION_10M;
            case (byte)9:
                return POPULATION_15M;
            case (byte)10:
                return POPULATION_20M;
            case (byte)11:
                return POPULATION_25M;
            case (byte)12:
                return POPULATION_30M;
            case (byte)13:
                return POPULATION_35M;
            case (byte)14:
                return POPULATION_40M;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration Population: " + value + "!");
        }
    }

    public static Population toEnum(java.lang.String itemName)
    {
        if (itemName.equals("POPULATION_SMALL"))
            return POPULATION_SMALL;
        if (itemName.equals("POPULATION_5K"))
            return POPULATION_5K;
        if (itemName.equals("POPULATION_10K"))
            return POPULATION_10K;
        if (itemName.equals("POPULATION_50K"))
            return POPULATION_50K;
        if (itemName.equals("POPULATION_100K"))
            return POPULATION_100K;
        if (itemName.equals("POPULATION_500K"))
            return POPULATION_500K;
        if (itemName.equals("POPULATION_1M"))
            return POPULATION_1M;
        if (itemName.equals("POPULATION_5M"))
            return POPULATION_5M;
        if (itemName.equals("POPULATION_10M"))
            return POPULATION_10M;
        if (itemName.equals("POPULATION_15M"))
            return POPULATION_15M;
        if (itemName.equals("POPULATION_20M"))
            return POPULATION_20M;
        if (itemName.equals("POPULATION_25M"))
            return POPULATION_25M;
        if (itemName.equals("POPULATION_30M"))
            return POPULATION_30M;
        if (itemName.equals("POPULATION_35M"))
            return POPULATION_35M;
        if (itemName.equals("POPULATION_40M"))
            return POPULATION_40M;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration Population!");
    }

    private byte value;
}