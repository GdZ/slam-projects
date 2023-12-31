/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.roadsurface;

public enum RoadSurfacePolygonPhysicalType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    UNKNOWN(0),
    PAVED(1),
    UNPAVED(2),
    GRAVEL(3),
    MANHOLE(4),
    POTHOLE(5),
    DITCH(6);

    private RoadSurfacePolygonPhysicalType(int value)
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

    public static RoadSurfacePolygonPhysicalType readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum(in.readVarUInt32());
    }

    public static RoadSurfacePolygonPhysicalType readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.IntArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get());
    }

    public static RoadSurfacePolygonPhysicalType toEnum(int value)
    {
        switch (value)
        {
            case 0:
                return UNKNOWN;
            case 1:
                return PAVED;
            case 2:
                return UNPAVED;
            case 3:
                return GRAVEL;
            case 4:
                return MANHOLE;
            case 5:
                return POTHOLE;
            case 6:
                return DITCH;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration RoadSurfacePolygonPhysicalType: " + value + "!");
        }
    }

    public static RoadSurfacePolygonPhysicalType toEnum(java.lang.String itemName)
    {
        if (itemName.equals("UNKNOWN"))
            return UNKNOWN;
        if (itemName.equals("PAVED"))
            return PAVED;
        if (itemName.equals("UNPAVED"))
            return UNPAVED;
        if (itemName.equals("GRAVEL"))
            return GRAVEL;
        if (itemName.equals("MANHOLE"))
            return MANHOLE;
        if (itemName.equals("POTHOLE"))
            return POTHOLE;
        if (itemName.equals("DITCH"))
            return DITCH;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration RoadSurfacePolygonPhysicalType!");
    }

    private int value;
}
