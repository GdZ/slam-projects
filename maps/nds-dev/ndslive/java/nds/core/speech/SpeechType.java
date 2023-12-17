/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.speech;

public enum SpeechType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    NOT_AVAILABLE((short)0),
    FIRST_APPROPRIATE((short)1),
    STANDARD((short)2),
    FLUENT((short)3),
    FOREIGN((short)4),
    LOCAL((short)5),
    LITERAL((short)6);

    private SpeechType(short value)
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

    public static SpeechType readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum(in.readUnsignedByte());
    }

    public static SpeechType readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ShortArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits(8), in)).get());
    }

    public static SpeechType toEnum(short value)
    {
        switch (value)
        {
            case (short)0:
                return NOT_AVAILABLE;
            case (short)1:
                return FIRST_APPROPRIATE;
            case (short)2:
                return STANDARD;
            case (short)3:
                return FLUENT;
            case (short)4:
                return FOREIGN;
            case (short)5:
                return LOCAL;
            case (short)6:
                return LITERAL;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration SpeechType: " + value + "!");
        }
    }

    public static SpeechType toEnum(java.lang.String itemName)
    {
        if (itemName.equals("NOT_AVAILABLE"))
            return NOT_AVAILABLE;
        if (itemName.equals("FIRST_APPROPRIATE"))
            return FIRST_APPROPRIATE;
        if (itemName.equals("STANDARD"))
            return STANDARD;
        if (itemName.equals("FLUENT"))
            return FLUENT;
        if (itemName.equals("FOREIGN"))
            return FOREIGN;
        if (itemName.equals("LOCAL"))
            return LOCAL;
        if (itemName.equals("LITERAL"))
            return LITERAL;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration SpeechType!");
    }

    private short value;
}
