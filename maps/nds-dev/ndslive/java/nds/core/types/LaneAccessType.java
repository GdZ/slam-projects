/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.types;

public class LaneAccessType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public LaneAccessType()
    {
        this((int)0);
    }

    public LaneAccessType(int value)
    {
        if (value < 0 || value > 536870911)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'LaneAccessType' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public LaneAccessType(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readVarUInt32();
    }

    public LaneAccessType(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
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
        if (!(other instanceof LaneAccessType))
            return false;

        final LaneAccessType otherLaneAccessType = (LaneAccessType)other;
        return value == otherLaneAccessType.value;
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

        if (this.and(LaneAccessType.Values.EXPRESS_LANE).equals(LaneAccessType.Values.EXPRESS_LANE))
            builder.append(builder.length() == 0 ? "EXPRESS_LANE" : " | EXPRESS_LANE");
        if (this.and(LaneAccessType.Values.TOLL_LANE).equals(LaneAccessType.Values.TOLL_LANE))
            builder.append(builder.length() == 0 ? "TOLL_LANE" : " | TOLL_LANE");
        if (this.and(LaneAccessType.Values.SLOW_LANE).equals(LaneAccessType.Values.SLOW_LANE))
            builder.append(builder.length() == 0 ? "SLOW_LANE" : " | SLOW_LANE");
        if (this.and(LaneAccessType.Values.CARPOOL_LANE).equals(LaneAccessType.Values.CARPOOL_LANE))
            builder.append(builder.length() == 0 ? "CARPOOL_LANE" : " | CARPOOL_LANE");
        if (this.and(LaneAccessType.Values.REGULATED_ACCESS_LANE).equals(LaneAccessType.Values.REGULATED_ACCESS_LANE))
            builder.append(builder.length() == 0 ? "REGULATED_ACCESS_LANE" : " | REGULATED_ACCESS_LANE");
        if (this.and(LaneAccessType.Values.BICYCLE_LANE).equals(LaneAccessType.Values.BICYCLE_LANE))
            builder.append(builder.length() == 0 ? "BICYCLE_LANE" : " | BICYCLE_LANE");
        if (this.and(LaneAccessType.Values.BUS_LANE).equals(LaneAccessType.Values.BUS_LANE))
            builder.append(builder.length() == 0 ? "BUS_LANE" : " | BUS_LANE");
        if (this.and(LaneAccessType.Values.TRAM_LANE).equals(LaneAccessType.Values.TRAM_LANE))
            builder.append(builder.length() == 0 ? "TRAM_LANE" : " | TRAM_LANE");
        if (this.and(LaneAccessType.Values.PASSING_LANE).equals(LaneAccessType.Values.PASSING_LANE))
            builder.append(builder.length() == 0 ? "PASSING_LANE" : " | PASSING_LANE");
        if (this.and(LaneAccessType.Values.DRIVABLE_SHOULDER_LANE).equals(LaneAccessType.Values.DRIVABLE_SHOULDER_LANE))
            builder.append(builder.length() == 0 ? "DRIVABLE_SHOULDER_LANE" : " | DRIVABLE_SHOULDER_LANE");
        if (this.and(LaneAccessType.Values.SOFT_SHOULDER_LANE).equals(LaneAccessType.Values.SOFT_SHOULDER_LANE))
            builder.append(builder.length() == 0 ? "SOFT_SHOULDER_LANE" : " | SOFT_SHOULDER_LANE");
        if (this.and(LaneAccessType.Values.EMERGENCY_SHOULDER_LANE).equals(LaneAccessType.Values.EMERGENCY_SHOULDER_LANE))
            builder.append(builder.length() == 0 ? "EMERGENCY_SHOULDER_LANE" : " | EMERGENCY_SHOULDER_LANE");
        if (this.and(LaneAccessType.Values.EMERGENCY_SHOULDER_PARKING_BAY).equals(LaneAccessType.Values.EMERGENCY_SHOULDER_PARKING_BAY))
            builder.append(builder.length() == 0 ? "EMERGENCY_SHOULDER_PARKING_BAY" : " | EMERGENCY_SHOULDER_PARKING_BAY");
        if (this.and(LaneAccessType.Values.TAXI_LANE).equals(LaneAccessType.Values.TAXI_LANE))
            builder.append(builder.length() == 0 ? "TAXI_LANE" : " | TAXI_LANE");
        if (this.and(LaneAccessType.Values.REVERSIBLE_LANE).equals(LaneAccessType.Values.REVERSIBLE_LANE))
            builder.append(builder.length() == 0 ? "REVERSIBLE_LANE" : " | REVERSIBLE_LANE");

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

    public LaneAccessType or(LaneAccessType other)
    {
        return new LaneAccessType((int)(value | other.value));
    }

    public LaneAccessType and(LaneAccessType other)
    {
        return new LaneAccessType((int)(value & other.value));
    }

    public LaneAccessType xor(LaneAccessType other)
    {
        return new LaneAccessType((int)(value ^ other.value));
    }

    public LaneAccessType not()
    {
        return new LaneAccessType((int)(~value & 536870911));
    }

    public static final class Values
    {
        public static final LaneAccessType EXPRESS_LANE = new LaneAccessType(1);
        public static final LaneAccessType TOLL_LANE = new LaneAccessType(2);
        public static final LaneAccessType SLOW_LANE = new LaneAccessType(4);
        public static final LaneAccessType CARPOOL_LANE = new LaneAccessType(8);
        public static final LaneAccessType REGULATED_ACCESS_LANE = new LaneAccessType(16);
        public static final LaneAccessType BICYCLE_LANE = new LaneAccessType(32);
        public static final LaneAccessType BUS_LANE = new LaneAccessType(64);
        public static final LaneAccessType TRAM_LANE = new LaneAccessType(128);
        public static final LaneAccessType PASSING_LANE = new LaneAccessType(256);
        public static final LaneAccessType DRIVABLE_SHOULDER_LANE = new LaneAccessType(512);
        public static final LaneAccessType SOFT_SHOULDER_LANE = new LaneAccessType(1024);
        public static final LaneAccessType EMERGENCY_SHOULDER_LANE = new LaneAccessType(2048);
        public static final LaneAccessType EMERGENCY_SHOULDER_PARKING_BAY = new LaneAccessType(4096);
        public static final LaneAccessType TAXI_LANE = new LaneAccessType(8192);
        public static final LaneAccessType REVERSIBLE_LANE = new LaneAccessType(16384);
    }

    private int value;
}
