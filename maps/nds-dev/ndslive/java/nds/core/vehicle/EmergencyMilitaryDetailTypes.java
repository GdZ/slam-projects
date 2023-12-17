/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.vehicle;

public class EmergencyMilitaryDetailTypes implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public EmergencyMilitaryDetailTypes()
    {
        this((int)0);
    }

    public EmergencyMilitaryDetailTypes(int value)
    {
        if (value < 0 || value > 536870911)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'EmergencyMilitaryDetailTypes' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public EmergencyMilitaryDetailTypes(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readVarUInt32();
    }

    public EmergencyMilitaryDetailTypes(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
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
        if (!(other instanceof EmergencyMilitaryDetailTypes))
            return false;

        final EmergencyMilitaryDetailTypes otherEmergencyMilitaryDetailTypes = (EmergencyMilitaryDetailTypes)other;
        return value == otherEmergencyMilitaryDetailTypes.value;
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

        if (this.and(EmergencyMilitaryDetailTypes.Values.POLICE).equals(EmergencyMilitaryDetailTypes.Values.POLICE))
            builder.append(builder.length() == 0 ? "POLICE" : " | POLICE");
        if (this.and(EmergencyMilitaryDetailTypes.Values.FIRE_DEPARTMENT).equals(EmergencyMilitaryDetailTypes.Values.FIRE_DEPARTMENT))
            builder.append(builder.length() == 0 ? "FIRE_DEPARTMENT" : " | FIRE_DEPARTMENT");
        if (this.and(EmergencyMilitaryDetailTypes.Values.AMBULANCE).equals(EmergencyMilitaryDetailTypes.Values.AMBULANCE))
            builder.append(builder.length() == 0 ? "AMBULANCE" : " | AMBULANCE");
        if (this.and(EmergencyMilitaryDetailTypes.Values.MILITARY_PERSONAL_CAR).equals(EmergencyMilitaryDetailTypes.Values.MILITARY_PERSONAL_CAR))
            builder.append(builder.length() == 0 ? "MILITARY_PERSONAL_CAR" : " | MILITARY_PERSONAL_CAR");
        if (this.and(EmergencyMilitaryDetailTypes.Values.MILITARY_TRUCK).equals(EmergencyMilitaryDetailTypes.Values.MILITARY_TRUCK))
            builder.append(builder.length() == 0 ? "MILITARY_TRUCK" : " | MILITARY_TRUCK");
        if (this.and(EmergencyMilitaryDetailTypes.Values.MILITARY_TANK).equals(EmergencyMilitaryDetailTypes.Values.MILITARY_TANK))
            builder.append(builder.length() == 0 ? "MILITARY_TANK" : " | MILITARY_TANK");

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

    public EmergencyMilitaryDetailTypes or(EmergencyMilitaryDetailTypes other)
    {
        return new EmergencyMilitaryDetailTypes((int)(value | other.value));
    }

    public EmergencyMilitaryDetailTypes and(EmergencyMilitaryDetailTypes other)
    {
        return new EmergencyMilitaryDetailTypes((int)(value & other.value));
    }

    public EmergencyMilitaryDetailTypes xor(EmergencyMilitaryDetailTypes other)
    {
        return new EmergencyMilitaryDetailTypes((int)(value ^ other.value));
    }

    public EmergencyMilitaryDetailTypes not()
    {
        return new EmergencyMilitaryDetailTypes((int)(~value & 536870911));
    }

    public static final class Values
    {
        public static final EmergencyMilitaryDetailTypes POLICE = new EmergencyMilitaryDetailTypes(1);
        public static final EmergencyMilitaryDetailTypes FIRE_DEPARTMENT = new EmergencyMilitaryDetailTypes(2);
        public static final EmergencyMilitaryDetailTypes AMBULANCE = new EmergencyMilitaryDetailTypes(4);
        public static final EmergencyMilitaryDetailTypes MILITARY_PERSONAL_CAR = new EmergencyMilitaryDetailTypes(8);
        public static final EmergencyMilitaryDetailTypes MILITARY_TRUCK = new EmergencyMilitaryDetailTypes(16);
        public static final EmergencyMilitaryDetailTypes MILITARY_TANK = new EmergencyMilitaryDetailTypes(32);
    }

    private int value;
}