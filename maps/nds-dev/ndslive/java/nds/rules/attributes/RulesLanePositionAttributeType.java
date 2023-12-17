/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.attributes;

public enum RulesLanePositionAttributeType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    TRAFFIC_LIGHTS((short)0),
    TRAFFIC_ENFORCEMENT_CAMERA((short)1),
    WARNING_SIGN((short)2),
    MOVABLE_WARNING_SIGN((short)3),
    RIGHT_OF_WAY_REGULATION((short)4);

    private RulesLanePositionAttributeType(short value)
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

    public static RulesLanePositionAttributeType readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum(in.readVarUInt16());
    }

    public static RulesLanePositionAttributeType readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ShortArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get());
    }

    public static RulesLanePositionAttributeType toEnum(short value)
    {
        switch (value)
        {
            case (short)0:
                return TRAFFIC_LIGHTS;
            case (short)1:
                return TRAFFIC_ENFORCEMENT_CAMERA;
            case (short)2:
                return WARNING_SIGN;
            case (short)3:
                return MOVABLE_WARNING_SIGN;
            case (short)4:
                return RIGHT_OF_WAY_REGULATION;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration RulesLanePositionAttributeType: " + value + "!");
        }
    }

    public static RulesLanePositionAttributeType toEnum(java.lang.String itemName)
    {
        if (itemName.equals("TRAFFIC_LIGHTS"))
            return TRAFFIC_LIGHTS;
        if (itemName.equals("TRAFFIC_ENFORCEMENT_CAMERA"))
            return TRAFFIC_ENFORCEMENT_CAMERA;
        if (itemName.equals("WARNING_SIGN"))
            return WARNING_SIGN;
        if (itemName.equals("MOVABLE_WARNING_SIGN"))
            return MOVABLE_WARNING_SIGN;
        if (itemName.equals("RIGHT_OF_WAY_REGULATION"))
            return RIGHT_OF_WAY_REGULATION;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration RulesLanePositionAttributeType!");
    }

    private short value;
}