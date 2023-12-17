/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.metadata;

public class LaneRulesLayerContent implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public LaneRulesLayerContent()
    {
        this((int)0);
    }

    public LaneRulesLayerContent(int value)
    {
        if (value < 0 || value > 536870911)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'LaneRulesLayerContent' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public LaneRulesLayerContent(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readVarUInt32();
    }

    public LaneRulesLayerContent(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
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
        if (!(other instanceof LaneRulesLayerContent))
            return false;

        final LaneRulesLayerContent otherLaneRulesLayerContent = (LaneRulesLayerContent)other;
        return value == otherLaneRulesLayerContent.value;
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

        if (this.and(LaneRulesLayerContent.Values.LANE_RANGE_MAPS).equals(LaneRulesLayerContent.Values.LANE_RANGE_MAPS))
            builder.append(builder.length() == 0 ? "LANE_RANGE_MAPS" : " | LANE_RANGE_MAPS");
        if (this.and(LaneRulesLayerContent.Values.LANE_RANGE_SETS).equals(LaneRulesLayerContent.Values.LANE_RANGE_SETS))
            builder.append(builder.length() == 0 ? "LANE_RANGE_SETS" : " | LANE_RANGE_SETS");
        if (this.and(LaneRulesLayerContent.Values.LANE_POSITION_MAPS).equals(LaneRulesLayerContent.Values.LANE_POSITION_MAPS))
            builder.append(builder.length() == 0 ? "LANE_POSITION_MAPS" : " | LANE_POSITION_MAPS");
        if (this.and(LaneRulesLayerContent.Values.LANE_POSITION_SETS).equals(LaneRulesLayerContent.Values.LANE_POSITION_SETS))
            builder.append(builder.length() == 0 ? "LANE_POSITION_SETS" : " | LANE_POSITION_SETS");
        if (this.and(LaneRulesLayerContent.Values.LANE_TRANSITION_MAPS).equals(LaneRulesLayerContent.Values.LANE_TRANSITION_MAPS))
            builder.append(builder.length() == 0 ? "LANE_TRANSITION_MAPS" : " | LANE_TRANSITION_MAPS");
        if (this.and(LaneRulesLayerContent.Values.LANE_TRANSITION_SETS).equals(LaneRulesLayerContent.Values.LANE_TRANSITION_SETS))
            builder.append(builder.length() == 0 ? "LANE_TRANSITION_SETS" : " | LANE_TRANSITION_SETS");
        if (this.and(LaneRulesLayerContent.Values.LANGUAGES).equals(LaneRulesLayerContent.Values.LANGUAGES))
            builder.append(builder.length() == 0 ? "LANGUAGES" : " | LANGUAGES");

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

    public LaneRulesLayerContent or(LaneRulesLayerContent other)
    {
        return new LaneRulesLayerContent((int)(value | other.value));
    }

    public LaneRulesLayerContent and(LaneRulesLayerContent other)
    {
        return new LaneRulesLayerContent((int)(value & other.value));
    }

    public LaneRulesLayerContent xor(LaneRulesLayerContent other)
    {
        return new LaneRulesLayerContent((int)(value ^ other.value));
    }

    public LaneRulesLayerContent not()
    {
        return new LaneRulesLayerContent((int)(~value & 536870911));
    }

    public static final class Values
    {
        public static final LaneRulesLayerContent LANE_RANGE_MAPS = new LaneRulesLayerContent(1);
        public static final LaneRulesLayerContent LANE_RANGE_SETS = new LaneRulesLayerContent(2);
        public static final LaneRulesLayerContent LANE_POSITION_MAPS = new LaneRulesLayerContent(4);
        public static final LaneRulesLayerContent LANE_POSITION_SETS = new LaneRulesLayerContent(8);
        public static final LaneRulesLayerContent LANE_TRANSITION_MAPS = new LaneRulesLayerContent(16);
        public static final LaneRulesLayerContent LANE_TRANSITION_SETS = new LaneRulesLayerContent(32);
        public static final LaneRulesLayerContent LANGUAGES = new LaneRulesLayerContent(64);
    }

    private int value;
}
