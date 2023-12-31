/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.venue.parking;

public enum ParkingRelationType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    PART_OF_SECTION((short)0),
    PART_OF_ROW((short)1),
    PART_OF_SPOT((short)2),
    IS_SECTION((short)3),
    IS_ROW((short)4),
    IS_SPOT((short)5);

    private ParkingRelationType(short value)
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

    public static ParkingRelationType readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum(in.readUnsignedByte());
    }

    public static ParkingRelationType readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ShortArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits(8), in)).get());
    }

    public static ParkingRelationType toEnum(short value)
    {
        switch (value)
        {
            case (short)0:
                return PART_OF_SECTION;
            case (short)1:
                return PART_OF_ROW;
            case (short)2:
                return PART_OF_SPOT;
            case (short)3:
                return IS_SECTION;
            case (short)4:
                return IS_ROW;
            case (short)5:
                return IS_SPOT;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration ParkingRelationType: " + value + "!");
        }
    }

    public static ParkingRelationType toEnum(java.lang.String itemName)
    {
        if (itemName.equals("PART_OF_SECTION"))
            return PART_OF_SECTION;
        if (itemName.equals("PART_OF_ROW"))
            return PART_OF_ROW;
        if (itemName.equals("PART_OF_SPOT"))
            return PART_OF_SPOT;
        if (itemName.equals("IS_SECTION"))
            return IS_SECTION;
        if (itemName.equals("IS_ROW"))
            return IS_ROW;
        if (itemName.equals("IS_SPOT"))
            return IS_SPOT;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration ParkingRelationType!");
    }

    private short value;
}
