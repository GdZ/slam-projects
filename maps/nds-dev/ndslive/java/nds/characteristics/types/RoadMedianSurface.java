/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.characteristics.types;

public enum RoadMedianSurface implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    PAVED((short)0),
    UNPAVED((short)1);

    private RoadMedianSurface(short value)
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

    public static RoadMedianSurface readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum(in.readUnsignedByte());
    }

    public static RoadMedianSurface readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ShortArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits(8), in)).get());
    }

    public static RoadMedianSurface toEnum(short value)
    {
        switch (value)
        {
            case (short)0:
                return PAVED;
            case (short)1:
                return UNPAVED;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration RoadMedianSurface: " + value + "!");
        }
    }

    public static RoadMedianSurface toEnum(java.lang.String itemName)
    {
        if (itemName.equals("PAVED"))
            return PAVED;
        if (itemName.equals("UNPAVED"))
            return UNPAVED;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration RoadMedianSurface!");
    }

    private short value;
}
