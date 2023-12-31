/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routingdata.metadata;

public class RoadRoutingLayerContent implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public RoadRoutingLayerContent()
    {
        this((int)0);
    }

    public RoadRoutingLayerContent(int value)
    {
        if (value < 0 || value > 536870911)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'RoadRoutingLayerContent' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public RoadRoutingLayerContent(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readVarUInt32();
    }

    public RoadRoutingLayerContent(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
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
        if (!(other instanceof RoadRoutingLayerContent))
            return false;

        final RoadRoutingLayerContent otherRoadRoutingLayerContent = (RoadRoutingLayerContent)other;
        return value == otherRoadRoutingLayerContent.value;
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

        if (this.and(RoadRoutingLayerContent.Values.ROAD_RANGE_MAPS).equals(RoadRoutingLayerContent.Values.ROAD_RANGE_MAPS))
            builder.append(builder.length() == 0 ? "ROAD_RANGE_MAPS" : " | ROAD_RANGE_MAPS");
        if (this.and(RoadRoutingLayerContent.Values.ROAD_RANGE_SETS).equals(RoadRoutingLayerContent.Values.ROAD_RANGE_SETS))
            builder.append(builder.length() == 0 ? "ROAD_RANGE_SETS" : " | ROAD_RANGE_SETS");
        if (this.and(RoadRoutingLayerContent.Values.ROAD_TRANSITION_MAPS).equals(RoadRoutingLayerContent.Values.ROAD_TRANSITION_MAPS))
            builder.append(builder.length() == 0 ? "ROAD_TRANSITION_MAPS" : " | ROAD_TRANSITION_MAPS");
        if (this.and(RoadRoutingLayerContent.Values.ROAD_TRANSITION_SETS).equals(RoadRoutingLayerContent.Values.ROAD_TRANSITION_SETS))
            builder.append(builder.length() == 0 ? "ROAD_TRANSITION_SETS" : " | ROAD_TRANSITION_SETS");
        if (this.and(RoadRoutingLayerContent.Values.SPEED_PROFILES).equals(RoadRoutingLayerContent.Values.SPEED_PROFILES))
            builder.append(builder.length() == 0 ? "SPEED_PROFILES" : " | SPEED_PROFILES");

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

    public RoadRoutingLayerContent or(RoadRoutingLayerContent other)
    {
        return new RoadRoutingLayerContent((int)(value | other.value));
    }

    public RoadRoutingLayerContent and(RoadRoutingLayerContent other)
    {
        return new RoadRoutingLayerContent((int)(value & other.value));
    }

    public RoadRoutingLayerContent xor(RoadRoutingLayerContent other)
    {
        return new RoadRoutingLayerContent((int)(value ^ other.value));
    }

    public RoadRoutingLayerContent not()
    {
        return new RoadRoutingLayerContent((int)(~value & 536870911));
    }

    public static final class Values
    {
        public static final RoadRoutingLayerContent ROAD_RANGE_MAPS = new RoadRoutingLayerContent(1);
        public static final RoadRoutingLayerContent ROAD_RANGE_SETS = new RoadRoutingLayerContent(2);
        public static final RoadRoutingLayerContent ROAD_TRANSITION_MAPS = new RoadRoutingLayerContent(4);
        public static final RoadRoutingLayerContent ROAD_TRANSITION_SETS = new RoadRoutingLayerContent(8);
        public static final RoadRoutingLayerContent SPEED_PROFILES = new RoadRoutingLayerContent(16);
    }

    private int value;
}
