/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.localization.types;

public enum LandmarkSignType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    DETAILED_SHAPE((short)0),
    TRIANGLE_TIP_UP((short)1),
    TRIANGLE_TIP_DOWN((short)2),
    RECTANGLE((short)3),
    ROUND((short)4),
    OCTAGON((short)5),
    DIAMOND((short)6),
    CROSSBUCK((short)7),
    ELLIPSE((short)8),
    UNKNOWN((short)9);

    private LandmarkSignType(short value)
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

    public static LandmarkSignType readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum(in.readUnsignedByte());
    }

    public static LandmarkSignType readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ShortArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits(8), in)).get());
    }

    public static LandmarkSignType toEnum(short value)
    {
        switch (value)
        {
            case (short)0:
                return DETAILED_SHAPE;
            case (short)1:
                return TRIANGLE_TIP_UP;
            case (short)2:
                return TRIANGLE_TIP_DOWN;
            case (short)3:
                return RECTANGLE;
            case (short)4:
                return ROUND;
            case (short)5:
                return OCTAGON;
            case (short)6:
                return DIAMOND;
            case (short)7:
                return CROSSBUCK;
            case (short)8:
                return ELLIPSE;
            case (short)9:
                return UNKNOWN;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration LandmarkSignType: " + value + "!");
        }
    }

    public static LandmarkSignType toEnum(java.lang.String itemName)
    {
        if (itemName.equals("DETAILED_SHAPE"))
            return DETAILED_SHAPE;
        if (itemName.equals("TRIANGLE_TIP_UP"))
            return TRIANGLE_TIP_UP;
        if (itemName.equals("TRIANGLE_TIP_DOWN"))
            return TRIANGLE_TIP_DOWN;
        if (itemName.equals("RECTANGLE"))
            return RECTANGLE;
        if (itemName.equals("ROUND"))
            return ROUND;
        if (itemName.equals("OCTAGON"))
            return OCTAGON;
        if (itemName.equals("DIAMOND"))
            return DIAMOND;
        if (itemName.equals("CROSSBUCK"))
            return CROSSBUCK;
        if (itemName.equals("ELLIPSE"))
            return ELLIPSE;
        if (itemName.equals("UNKNOWN"))
            return UNKNOWN;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration LandmarkSignType!");
    }

    private short value;
}
