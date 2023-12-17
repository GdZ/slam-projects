/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.vehicle;

public class PublicServiceVehicleTypes implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public PublicServiceVehicleTypes()
    {
        this((int)0);
    }

    public PublicServiceVehicleTypes(int value)
    {
        if (value < 0 || value > 536870911)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'PublicServiceVehicleTypes' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public PublicServiceVehicleTypes(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readVarUInt32();
    }

    public PublicServiceVehicleTypes(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        value = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();
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
    public long initializeOffsets(long bitPosition)
    {
        return bitPosition + bitSizeOf(bitPosition);
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        return bitPosition + bitSizeOf(context, bitPosition);
    }

    @Override
    public boolean equals(java.lang.Object other)
    {
        if (!(other instanceof PublicServiceVehicleTypes))
            return false;

        final PublicServiceVehicleTypes otherPublicServiceVehicleTypes = (PublicServiceVehicleTypes)other;
        return value == otherPublicServiceVehicleTypes.value;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, value);
        return result;
    }

    @Override
    public java.lang.String toString()
    {
        final java.lang.StringBuilder builder = new java.lang.StringBuilder();

        if (this.and(PublicServiceVehicleTypes.Values.PUBLIC_BUS).equals(PublicServiceVehicleTypes.Values.PUBLIC_BUS))
            builder.append(builder.length() == 0 ? "PUBLIC_BUS" : " | PUBLIC_BUS");
        if (this.and(PublicServiceVehicleTypes.Values.SCHOOL_BUS).equals(PublicServiceVehicleTypes.Values.SCHOOL_BUS))
            builder.append(builder.length() == 0 ? "SCHOOL_BUS" : " | SCHOOL_BUS");
        if (this.and(PublicServiceVehicleTypes.Values.TROLLEY).equals(PublicServiceVehicleTypes.Values.TROLLEY))
            builder.append(builder.length() == 0 ? "TROLLEY" : " | TROLLEY");
        if (this.and(PublicServiceVehicleTypes.Values.TRAM).equals(PublicServiceVehicleTypes.Values.TRAM))
            builder.append(builder.length() == 0 ? "TRAM" : " | TRAM");
        if (this.and(PublicServiceVehicleTypes.Values.TAXI).equals(PublicServiceVehicleTypes.Values.TAXI))
            builder.append(builder.length() == 0 ? "TAXI" : " | TAXI");
        if (this.and(PublicServiceVehicleTypes.Values.EMERGENCY).equals(PublicServiceVehicleTypes.Values.EMERGENCY))
            builder.append(builder.length() == 0 ? "EMERGENCY" : " | EMERGENCY");
        if (this.and(PublicServiceVehicleTypes.Values.MAIL).equals(PublicServiceVehicleTypes.Values.MAIL))
            builder.append(builder.length() == 0 ? "MAIL" : " | MAIL");

        return java.lang.String.valueOf(value) + "[" + builder.toString() + "]";
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarUInt32(value);
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

    public int getValue()
    {
        return value;
    }

    @Override
    public java.lang.Number getGenericValue()
    {
        return value;
    }

    public PublicServiceVehicleTypes or(PublicServiceVehicleTypes other)
    {
        return new PublicServiceVehicleTypes((int)(value | other.value));
    }

    public PublicServiceVehicleTypes and(PublicServiceVehicleTypes other)
    {
        return new PublicServiceVehicleTypes((int)(value & other.value));
    }

    public PublicServiceVehicleTypes xor(PublicServiceVehicleTypes other)
    {
        return new PublicServiceVehicleTypes((int)(value ^ other.value));
    }

    public PublicServiceVehicleTypes not()
    {
        return new PublicServiceVehicleTypes((int)(~value & 536870911));
    }

    public static final class Values
    {
        public static final PublicServiceVehicleTypes PUBLIC_BUS = new PublicServiceVehicleTypes(1);
        public static final PublicServiceVehicleTypes SCHOOL_BUS = new PublicServiceVehicleTypes(2);
        public static final PublicServiceVehicleTypes TROLLEY = new PublicServiceVehicleTypes(4);
        public static final PublicServiceVehicleTypes TRAM = new PublicServiceVehicleTypes(8);
        public static final PublicServiceVehicleTypes TAXI = new PublicServiceVehicleTypes(16);
        public static final PublicServiceVehicleTypes EMERGENCY = new PublicServiceVehicleTypes(32);
        public static final PublicServiceVehicleTypes MAIL = new PublicServiceVehicleTypes(64);
    }

    private int value;
}