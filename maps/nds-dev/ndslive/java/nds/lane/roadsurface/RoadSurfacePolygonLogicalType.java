/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.roadsurface;

public enum RoadSurfacePolygonLogicalType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    UNKNOWN(0),
    CROSSWALK(1),
    BICYCLE_CROSSING(2),
    INTERSECTION(3),
    MARKING_POLYGON(4),
    GORE(5),
    WALKING_AREA(6),
    DRIVEWAY(7),
    ROUNDABOUT(8),
    PEDESTRIAN_WAITING_AREA(9),
    BICYCLE_WAITING_AREA(10),
    PARKING(11),
    CONSTRUCTION_AREA(12),
    BUS_STOP(13),
    TRAM_STOP(14),
    TRAM_CROSSING(15),
    TRAM_TRACK(16),
    NO_STOP_ZONE(17),
    DRIVABLE(18),
    NON_DRIVABLE(19),
    UNDESIRABLE(20);

    private RoadSurfacePolygonLogicalType(int value)
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

    public static RoadSurfacePolygonLogicalType readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum(in.readVarUInt32());
    }

    public static RoadSurfacePolygonLogicalType readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.IntArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get());
    }

    public static RoadSurfacePolygonLogicalType toEnum(int value)
    {
        switch (value)
        {
            case 0:
                return UNKNOWN;
            case 1:
                return CROSSWALK;
            case 2:
                return BICYCLE_CROSSING;
            case 3:
                return INTERSECTION;
            case 4:
                return MARKING_POLYGON;
            case 5:
                return GORE;
            case 6:
                return WALKING_AREA;
            case 7:
                return DRIVEWAY;
            case 8:
                return ROUNDABOUT;
            case 9:
                return PEDESTRIAN_WAITING_AREA;
            case 10:
                return BICYCLE_WAITING_AREA;
            case 11:
                return PARKING;
            case 12:
                return CONSTRUCTION_AREA;
            case 13:
                return BUS_STOP;
            case 14:
                return TRAM_STOP;
            case 15:
                return TRAM_CROSSING;
            case 16:
                return TRAM_TRACK;
            case 17:
                return NO_STOP_ZONE;
            case 18:
                return DRIVABLE;
            case 19:
                return NON_DRIVABLE;
            case 20:
                return UNDESIRABLE;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration RoadSurfacePolygonLogicalType: " + value + "!");
        }
    }

    public static RoadSurfacePolygonLogicalType toEnum(java.lang.String itemName)
    {
        if (itemName.equals("UNKNOWN"))
            return UNKNOWN;
        if (itemName.equals("CROSSWALK"))
            return CROSSWALK;
        if (itemName.equals("BICYCLE_CROSSING"))
            return BICYCLE_CROSSING;
        if (itemName.equals("INTERSECTION"))
            return INTERSECTION;
        if (itemName.equals("MARKING_POLYGON"))
            return MARKING_POLYGON;
        if (itemName.equals("GORE"))
            return GORE;
        if (itemName.equals("WALKING_AREA"))
            return WALKING_AREA;
        if (itemName.equals("DRIVEWAY"))
            return DRIVEWAY;
        if (itemName.equals("ROUNDABOUT"))
            return ROUNDABOUT;
        if (itemName.equals("PEDESTRIAN_WAITING_AREA"))
            return PEDESTRIAN_WAITING_AREA;
        if (itemName.equals("BICYCLE_WAITING_AREA"))
            return BICYCLE_WAITING_AREA;
        if (itemName.equals("PARKING"))
            return PARKING;
        if (itemName.equals("CONSTRUCTION_AREA"))
            return CONSTRUCTION_AREA;
        if (itemName.equals("BUS_STOP"))
            return BUS_STOP;
        if (itemName.equals("TRAM_STOP"))
            return TRAM_STOP;
        if (itemName.equals("TRAM_CROSSING"))
            return TRAM_CROSSING;
        if (itemName.equals("TRAM_TRACK"))
            return TRAM_TRACK;
        if (itemName.equals("NO_STOP_ZONE"))
            return NO_STOP_ZONE;
        if (itemName.equals("DRIVABLE"))
            return DRIVABLE;
        if (itemName.equals("NON_DRIVABLE"))
            return NON_DRIVABLE;
        if (itemName.equals("UNDESIRABLE"))
            return UNDESIRABLE;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration RoadSurfacePolygonLogicalType!");
    }

    private int value;
}