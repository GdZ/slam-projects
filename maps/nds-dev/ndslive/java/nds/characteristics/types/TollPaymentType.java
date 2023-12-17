/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.characteristics.types;

public enum TollPaymentType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    VARIABLE((short)0),
    CASH_COINS_AND_BILLS((short)1),
    CASH_BILLS_ONLY((short)2),
    CASH_COINS_ONLY((short)3),
    CASH_EXACT_CHANGE((short)4),
    CREDIT_CARD((short)5),
    DEBIT_CARD((short)6),
    TRAVEL_CARD((short)7),
    ETC((short)8),
    ETC_TRANSPONDER((short)9),
    ETC_VIDEO_CAMERA((short)10),
    SUBSCRIPTION((short)11);

    private TollPaymentType(short value)
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

    public static TollPaymentType readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum(in.readVarUInt16());
    }

    public static TollPaymentType readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ShortArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get());
    }

    public static TollPaymentType toEnum(short value)
    {
        switch (value)
        {
            case (short)0:
                return VARIABLE;
            case (short)1:
                return CASH_COINS_AND_BILLS;
            case (short)2:
                return CASH_BILLS_ONLY;
            case (short)3:
                return CASH_COINS_ONLY;
            case (short)4:
                return CASH_EXACT_CHANGE;
            case (short)5:
                return CREDIT_CARD;
            case (short)6:
                return DEBIT_CARD;
            case (short)7:
                return TRAVEL_CARD;
            case (short)8:
                return ETC;
            case (short)9:
                return ETC_TRANSPONDER;
            case (short)10:
                return ETC_VIDEO_CAMERA;
            case (short)11:
                return SUBSCRIPTION;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration TollPaymentType: " + value + "!");
        }
    }

    public static TollPaymentType toEnum(java.lang.String itemName)
    {
        if (itemName.equals("VARIABLE"))
            return VARIABLE;
        if (itemName.equals("CASH_COINS_AND_BILLS"))
            return CASH_COINS_AND_BILLS;
        if (itemName.equals("CASH_BILLS_ONLY"))
            return CASH_BILLS_ONLY;
        if (itemName.equals("CASH_COINS_ONLY"))
            return CASH_COINS_ONLY;
        if (itemName.equals("CASH_EXACT_CHANGE"))
            return CASH_EXACT_CHANGE;
        if (itemName.equals("CREDIT_CARD"))
            return CREDIT_CARD;
        if (itemName.equals("DEBIT_CARD"))
            return DEBIT_CARD;
        if (itemName.equals("TRAVEL_CARD"))
            return TRAVEL_CARD;
        if (itemName.equals("ETC"))
            return ETC;
        if (itemName.equals("ETC_TRANSPONDER"))
            return ETC_TRANSPONDER;
        if (itemName.equals("ETC_VIDEO_CAMERA"))
            return ETC_VIDEO_CAMERA;
        if (itemName.equals("SUBSCRIPTION"))
            return SUBSCRIPTION;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration TollPaymentType!");
    }

    private short value;
}
