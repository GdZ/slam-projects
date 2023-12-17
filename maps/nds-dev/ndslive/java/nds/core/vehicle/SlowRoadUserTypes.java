/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.vehicle;

public class SlowRoadUserTypes implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public SlowRoadUserTypes()
    {
        this((int)0);
    }

    public SlowRoadUserTypes(int value)
    {
        if (value < 0 || value > 536870911)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'SlowRoadUserTypes' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public SlowRoadUserTypes(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readVarUInt32();
    }

    public SlowRoadUserTypes(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
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
        if (!(other instanceof SlowRoadUserTypes))
            return false;

        final SlowRoadUserTypes otherSlowRoadUserTypes = (SlowRoadUserTypes)other;
        return value == otherSlowRoadUserTypes.value;
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

        if (this.and(SlowRoadUserTypes.Values.PEDESTRIAN).equals(SlowRoadUserTypes.Values.PEDESTRIAN))
            builder.append(builder.length() == 0 ? "PEDESTRIAN" : " | PEDESTRIAN");
        if (this.and(SlowRoadUserTypes.Values.PEDESTRIAN_WITH_HANDCART).equals(SlowRoadUserTypes.Values.PEDESTRIAN_WITH_HANDCART))
            builder.append(builder.length() == 0 ? "PEDESTRIAN_WITH_HANDCART" : " | PEDESTRIAN_WITH_HANDCART");
        if (this.and(SlowRoadUserTypes.Values.HORSE_DRIVEN_CARRIAGE).equals(SlowRoadUserTypes.Values.HORSE_DRIVEN_CARRIAGE))
            builder.append(builder.length() == 0 ? "HORSE_DRIVEN_CARRIAGE" : " | HORSE_DRIVEN_CARRIAGE");
        if (this.and(SlowRoadUserTypes.Values.BICYCLE).equals(SlowRoadUserTypes.Values.BICYCLE))
            builder.append(builder.length() == 0 ? "BICYCLE" : " | BICYCLE");
        if (this.and(SlowRoadUserTypes.Values.SCOOTER).equals(SlowRoadUserTypes.Values.SCOOTER))
            builder.append(builder.length() == 0 ? "SCOOTER" : " | SCOOTER");
        if (this.and(SlowRoadUserTypes.Values.MOTORIZED_RICKSHAW).equals(SlowRoadUserTypes.Values.MOTORIZED_RICKSHAW))
            builder.append(builder.length() == 0 ? "MOTORIZED_RICKSHAW" : " | MOTORIZED_RICKSHAW");
        if (this.and(SlowRoadUserTypes.Values.MOPED).equals(SlowRoadUserTypes.Values.MOPED))
            builder.append(builder.length() == 0 ? "MOPED" : " | MOPED");
        if (this.and(SlowRoadUserTypes.Values.RIDER).equals(SlowRoadUserTypes.Values.RIDER))
            builder.append(builder.length() == 0 ? "RIDER" : " | RIDER");
        if (this.and(SlowRoadUserTypes.Values.TRACTOR).equals(SlowRoadUserTypes.Values.TRACTOR))
            builder.append(builder.length() == 0 ? "TRACTOR" : " | TRACTOR");

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

    public SlowRoadUserTypes or(SlowRoadUserTypes other)
    {
        return new SlowRoadUserTypes((int)(value | other.value));
    }

    public SlowRoadUserTypes and(SlowRoadUserTypes other)
    {
        return new SlowRoadUserTypes((int)(value & other.value));
    }

    public SlowRoadUserTypes xor(SlowRoadUserTypes other)
    {
        return new SlowRoadUserTypes((int)(value ^ other.value));
    }

    public SlowRoadUserTypes not()
    {
        return new SlowRoadUserTypes((int)(~value & 536870911));
    }

    public static final class Values
    {
        public static final SlowRoadUserTypes PEDESTRIAN = new SlowRoadUserTypes(1);
        public static final SlowRoadUserTypes PEDESTRIAN_WITH_HANDCART = new SlowRoadUserTypes(2);
        public static final SlowRoadUserTypes HORSE_DRIVEN_CARRIAGE = new SlowRoadUserTypes(4);
        public static final SlowRoadUserTypes BICYCLE = new SlowRoadUserTypes(8);
        public static final SlowRoadUserTypes SCOOTER = new SlowRoadUserTypes(16);
        public static final SlowRoadUserTypes MOTORIZED_RICKSHAW = new SlowRoadUserTypes(32);
        public static final SlowRoadUserTypes MOPED = new SlowRoadUserTypes(64);
        public static final SlowRoadUserTypes RIDER = new SlowRoadUserTypes(128);
        public static final SlowRoadUserTypes TRACTOR = new SlowRoadUserTypes(256);
    }

    private int value;
}
