/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.venue.details.attributes;

public enum ParkingSpotAttributeType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioEnum
{
    PARKING_SPOT_NUMBER((short)0),
    PARKING_SPOT_AVAILABLE((short)1),
    PARKING_RESTRICTIONS((short)2),
    PARKING_SPOT_PRIVATE_PARKING_DETAILS((short)3);

    private ParkingSpotAttributeType(short value)
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

    public static ParkingSpotAttributeType readEnum(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        return toEnum(in.readVarUInt16());
    }

    public static ParkingSpotAttributeType readEnum(zserio.runtime.array.PackingContext context,
            zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return toEnum(((zserio.runtime.array.ArrayElement.ShortArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get());
    }

    public static ParkingSpotAttributeType toEnum(short value)
    {
        switch (value)
        {
            case (short)0:
                return PARKING_SPOT_NUMBER;
            case (short)1:
                return PARKING_SPOT_AVAILABLE;
            case (short)2:
                return PARKING_RESTRICTIONS;
            case (short)3:
                return PARKING_SPOT_PRIVATE_PARKING_DETAILS;
            default:
                throw new java.lang.IllegalArgumentException(
                        "Unknown value for enumeration ParkingSpotAttributeType: " + value + "!");
        }
    }

    public static ParkingSpotAttributeType toEnum(java.lang.String itemName)
    {
        if (itemName.equals("PARKING_SPOT_NUMBER"))
            return PARKING_SPOT_NUMBER;
        if (itemName.equals("PARKING_SPOT_AVAILABLE"))
            return PARKING_SPOT_AVAILABLE;
        if (itemName.equals("PARKING_RESTRICTIONS"))
            return PARKING_RESTRICTIONS;
        if (itemName.equals("PARKING_SPOT_PRIVATE_PARKING_DETAILS"))
            return PARKING_SPOT_PRIVATE_PARKING_DETAILS;
        throw new java.lang.IllegalArgumentException(
                "Enum item '" + itemName + "' doesn't exist in enumeration ParkingSpotAttributeType!");
    }

    private short value;
}
