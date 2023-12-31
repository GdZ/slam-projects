/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.roadsurface;

public enum RoadSurfaceLinePhysicalType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    UNKNOWN(0),
    PAVED(1),
    RAIL(2),
    CURB(3);

    private RoadSurfaceLinePhysicalType(int value)
    {
        this.value = value;
    }

    public int getValue()
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
                new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(value));
    }

    @Override
    public int bitSizeOf()
    {
        return bitSizeOf(0);
    }

    @Override
    public int bitSizeOf(long bitPosition)
    {
        return zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(value);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return deltaContext.bitSizeOf(
                new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(value));
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
        out.writeVarUInt32(getValue());
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.write(
                new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(value));
    }

    public static RoadSurfaceLinePhysicalType readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum(in.readVarUInt32());
    }

    public static RoadSurfaceLinePhysicalType readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.IntArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get());
    }

    public static RoadSurfaceLinePhysicalType toEnum(int value)
    {
        switch (value)
        {
            case 0:
                return UNKNOWN;
            case 1:
                return PAVED;
            case 2:
                return RAIL;
            case 3:
                return CURB;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration RoadSurfaceLinePhysicalType: " + value + "!");
        }
    }

    public static RoadSurfaceLinePhysicalType toEnum(java.lang.String itemName)
    {
        if (itemName.equals("UNKNOWN"))
            return UNKNOWN;
        if (itemName.equals("PAVED"))
            return PAVED;
        if (itemName.equals("RAIL"))
            return RAIL;
        if (itemName.equals("CURB"))
            return CURB;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration RoadSurfaceLinePhysicalType!");
    }

    private int value;
}
