/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routing.guidance;

public class GuidanceLaneMarking implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public GuidanceLaneMarking()
    {
        this((long)0);
    }

    public GuidanceLaneMarking(long value)
    {
        if (value < 0L || value > 144115188075855871L)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'GuidanceLaneMarking' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public GuidanceLaneMarking(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readVarUInt64();
    }

    public GuidanceLaneMarking(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        value = ((zserio.runtime.array.ArrayElement.LongArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.VarUInt64ArrayTraits(), in)).get();
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.init(
                new zserio.runtime.array.ArrayTraits.VarUInt64ArrayTraits(),
                new zserio.runtime.array.ArrayElement.LongArrayElement(value));
    }

    @Override
    public int bitSizeOf()
    {
        return bitSizeOf(0);
    }

    @Override
    public int bitSizeOf(long bitPosition)
    {
        return zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt64(value);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return deltaContext.bitSizeOf(
                new zserio.runtime.array.ArrayTraits.VarUInt64ArrayTraits(),
                new zserio.runtime.array.ArrayElement.LongArrayElement(value));
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
        if (!(other instanceof GuidanceLaneMarking))
            return false;

        final GuidanceLaneMarking otherGuidanceLaneMarking = (GuidanceLaneMarking)other;
        return value == otherGuidanceLaneMarking.value;
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

        if (this.and(GuidanceLaneMarking.Values.ARROW_STRAIGHT).equals(GuidanceLaneMarking.Values.ARROW_STRAIGHT))
            builder.append(builder.length() == 0 ? "ARROW_STRAIGHT" : " | ARROW_STRAIGHT");
        if (this.and(GuidanceLaneMarking.Values.ARROW_LEFT).equals(GuidanceLaneMarking.Values.ARROW_LEFT))
            builder.append(builder.length() == 0 ? "ARROW_LEFT" : " | ARROW_LEFT");
        if (this.and(GuidanceLaneMarking.Values.ARROW_RIGHT).equals(GuidanceLaneMarking.Values.ARROW_RIGHT))
            builder.append(builder.length() == 0 ? "ARROW_RIGHT" : " | ARROW_RIGHT");
        if (this.and(GuidanceLaneMarking.Values.ARROW_SLIGHT_LEFT).equals(GuidanceLaneMarking.Values.ARROW_SLIGHT_LEFT))
            builder.append(builder.length() == 0 ? "ARROW_SLIGHT_LEFT" : " | ARROW_SLIGHT_LEFT");
        if (this.and(GuidanceLaneMarking.Values.ARROW_SLIGHT_RIGHT).equals(GuidanceLaneMarking.Values.ARROW_SLIGHT_RIGHT))
            builder.append(builder.length() == 0 ? "ARROW_SLIGHT_RIGHT" : " | ARROW_SLIGHT_RIGHT");
        if (this.and(GuidanceLaneMarking.Values.ARROW_SHARP_RIGHT).equals(GuidanceLaneMarking.Values.ARROW_SHARP_RIGHT))
            builder.append(builder.length() == 0 ? "ARROW_SHARP_RIGHT" : " | ARROW_SHARP_RIGHT");
        if (this.and(GuidanceLaneMarking.Values.ARROW_SHARP_LEFT).equals(GuidanceLaneMarking.Values.ARROW_SHARP_LEFT))
            builder.append(builder.length() == 0 ? "ARROW_SHARP_LEFT" : " | ARROW_SHARP_LEFT");
        if (this.and(GuidanceLaneMarking.Values.ARROW_U_TURN_LEFT).equals(GuidanceLaneMarking.Values.ARROW_U_TURN_LEFT))
            builder.append(builder.length() == 0 ? "ARROW_U_TURN_LEFT" : " | ARROW_U_TURN_LEFT");
        if (this.and(GuidanceLaneMarking.Values.ARROW_U_TURN_RIGHT).equals(GuidanceLaneMarking.Values.ARROW_U_TURN_RIGHT))
            builder.append(builder.length() == 0 ? "ARROW_U_TURN_RIGHT" : " | ARROW_U_TURN_RIGHT");
        if (builder.length() == 0 && value == 0)
            builder.append("NONE");

        return java.lang.String.valueOf(value) + "[" + builder.toString() + "]";
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarUInt64(value);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.write(
                new zserio.runtime.array.ArrayTraits.VarUInt64ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.LongArrayElement(value));
    }

    public long getValue()
    {
        return value;
    }

    @Override
    public java.lang.Number getGenericValue()
    {
        return value;
    }

    public GuidanceLaneMarking or(GuidanceLaneMarking other)
    {
        return new GuidanceLaneMarking((long)(value | other.value));
    }

    public GuidanceLaneMarking and(GuidanceLaneMarking other)
    {
        return new GuidanceLaneMarking((long)(value & other.value));
    }

    public GuidanceLaneMarking xor(GuidanceLaneMarking other)
    {
        return new GuidanceLaneMarking((long)(value ^ other.value));
    }

    public GuidanceLaneMarking not()
    {
        return new GuidanceLaneMarking((long)(~value & 144115188075855871L));
    }

    public static final class Values
    {
        public static final GuidanceLaneMarking NONE = new GuidanceLaneMarking(0L);
        public static final GuidanceLaneMarking ARROW_STRAIGHT = new GuidanceLaneMarking(2L);
        public static final GuidanceLaneMarking ARROW_LEFT = new GuidanceLaneMarking(4L);
        public static final GuidanceLaneMarking ARROW_RIGHT = new GuidanceLaneMarking(8L);
        public static final GuidanceLaneMarking ARROW_SLIGHT_LEFT = new GuidanceLaneMarking(16L);
        public static final GuidanceLaneMarking ARROW_SLIGHT_RIGHT = new GuidanceLaneMarking(32L);
        public static final GuidanceLaneMarking ARROW_SHARP_RIGHT = new GuidanceLaneMarking(64L);
        public static final GuidanceLaneMarking ARROW_SHARP_LEFT = new GuidanceLaneMarking(128L);
        public static final GuidanceLaneMarking ARROW_U_TURN_LEFT = new GuidanceLaneMarking(256L);
        public static final GuidanceLaneMarking ARROW_U_TURN_RIGHT = new GuidanceLaneMarking(512L);
    }

    private long value;
}
