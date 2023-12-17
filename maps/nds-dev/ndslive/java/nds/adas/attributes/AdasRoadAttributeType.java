/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.adas.attributes;

public enum AdasRoadAttributeType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    CURVATURE((short)0),
    SLOPE_ARRAY((short)1),
    CLOTHOID((short)2),
    GRADIENT((short)3),
    ENHANCED_GEOMETRY((short)4),
    CURVATURE_PATH((short)5),
    COMFORTABLE_SPEED_CURVE((short)6),
    COMFORTABLE_SPEED_PATH((short)7),
    ELEVATION_ARRAY((short)8);

    private AdasRoadAttributeType(short value)
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
                new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
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
        return zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(value);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return deltaContext.bitSizeOf(
                new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
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
        out.writeVarUInt16(getValue());
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.write(
                new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(value));
    }

    public static AdasRoadAttributeType readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum(in.readVarUInt16());
    }

    public static AdasRoadAttributeType readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ShortArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get());
    }

    public static AdasRoadAttributeType toEnum(short value)
    {
        switch (value)
        {
            case (short)0:
                return CURVATURE;
            case (short)1:
                return SLOPE_ARRAY;
            case (short)2:
                return CLOTHOID;
            case (short)3:
                return GRADIENT;
            case (short)4:
                return ENHANCED_GEOMETRY;
            case (short)5:
                return CURVATURE_PATH;
            case (short)6:
                return COMFORTABLE_SPEED_CURVE;
            case (short)7:
                return COMFORTABLE_SPEED_PATH;
            case (short)8:
                return ELEVATION_ARRAY;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration AdasRoadAttributeType: " + value + "!");
        }
    }

    public static AdasRoadAttributeType toEnum(java.lang.String itemName)
    {
        if (itemName.equals("CURVATURE"))
            return CURVATURE;
        if (itemName.equals("SLOPE_ARRAY"))
            return SLOPE_ARRAY;
        if (itemName.equals("CLOTHOID"))
            return CLOTHOID;
        if (itemName.equals("GRADIENT"))
            return GRADIENT;
        if (itemName.equals("ENHANCED_GEOMETRY"))
            return ENHANCED_GEOMETRY;
        if (itemName.equals("CURVATURE_PATH"))
            return CURVATURE_PATH;
        if (itemName.equals("COMFORTABLE_SPEED_CURVE"))
            return COMFORTABLE_SPEED_CURVE;
        if (itemName.equals("COMFORTABLE_SPEED_PATH"))
            return COMFORTABLE_SPEED_PATH;
        if (itemName.equals("ELEVATION_ARRAY"))
            return ELEVATION_ARRAY;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration AdasRoadAttributeType!");
    }

    private short value;
}
