/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.name.metadata;

public class RoadNameLayerContent implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public RoadNameLayerContent()
    {
        this((int)0);
    }

    public RoadNameLayerContent(int value)
    {
        if (value < 0 || value > 536870911)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'RoadNameLayerContent' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public RoadNameLayerContent(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readVarUInt32();
    }

    public RoadNameLayerContent(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
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
        if (!(other instanceof RoadNameLayerContent))
            return false;

        final RoadNameLayerContent otherRoadNameLayerContent = (RoadNameLayerContent)other;
        return value == otherRoadNameLayerContent.value;
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

        if (this.and(RoadNameLayerContent.Values.ROAD_RANGE_MAPS).equals(RoadNameLayerContent.Values.ROAD_RANGE_MAPS))
            builder.append(builder.length() == 0 ? "ROAD_RANGE_MAPS" : " | ROAD_RANGE_MAPS");
        if (this.and(RoadNameLayerContent.Values.ROAD_RANGE_SETS).equals(RoadNameLayerContent.Values.ROAD_RANGE_SETS))
            builder.append(builder.length() == 0 ? "ROAD_RANGE_SETS" : " | ROAD_RANGE_SETS");
        if (this.and(RoadNameLayerContent.Values.ROAD_POSITION_MAPS).equals(RoadNameLayerContent.Values.ROAD_POSITION_MAPS))
            builder.append(builder.length() == 0 ? "ROAD_POSITION_MAPS" : " | ROAD_POSITION_MAPS");
        if (this.and(RoadNameLayerContent.Values.ROAD_POSITION_SETS).equals(RoadNameLayerContent.Values.ROAD_POSITION_SETS))
            builder.append(builder.length() == 0 ? "ROAD_POSITION_SETS" : " | ROAD_POSITION_SETS");
        if (this.and(RoadNameLayerContent.Values.TRANSITION_MAPS).equals(RoadNameLayerContent.Values.TRANSITION_MAPS))
            builder.append(builder.length() == 0 ? "TRANSITION_MAPS" : " | TRANSITION_MAPS");
        if (this.and(RoadNameLayerContent.Values.TRANSITION_SETS).equals(RoadNameLayerContent.Values.TRANSITION_SETS))
            builder.append(builder.length() == 0 ? "TRANSITION_SETS" : " | TRANSITION_SETS");
        if (this.and(RoadNameLayerContent.Values.ADMIN_HIERARCHY).equals(RoadNameLayerContent.Values.ADMIN_HIERARCHY))
            builder.append(builder.length() == 0 ? "ADMIN_HIERARCHY" : " | ADMIN_HIERARCHY");
        if (this.and(RoadNameLayerContent.Values.ADDRESS_FORMAT).equals(RoadNameLayerContent.Values.ADDRESS_FORMAT))
            builder.append(builder.length() == 0 ? "ADDRESS_FORMAT" : " | ADDRESS_FORMAT");

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

    public RoadNameLayerContent or(RoadNameLayerContent other)
    {
        return new RoadNameLayerContent((int)(value | other.value));
    }

    public RoadNameLayerContent and(RoadNameLayerContent other)
    {
        return new RoadNameLayerContent((int)(value & other.value));
    }

    public RoadNameLayerContent xor(RoadNameLayerContent other)
    {
        return new RoadNameLayerContent((int)(value ^ other.value));
    }

    public RoadNameLayerContent not()
    {
        return new RoadNameLayerContent((int)(~value & 536870911));
    }

    public static final class Values
    {
        public static final RoadNameLayerContent ROAD_RANGE_MAPS = new RoadNameLayerContent(1);
        public static final RoadNameLayerContent ROAD_RANGE_SETS = new RoadNameLayerContent(2);
        public static final RoadNameLayerContent ROAD_POSITION_MAPS = new RoadNameLayerContent(4);
        public static final RoadNameLayerContent ROAD_POSITION_SETS = new RoadNameLayerContent(8);
        public static final RoadNameLayerContent TRANSITION_MAPS = new RoadNameLayerContent(16);
        public static final RoadNameLayerContent TRANSITION_SETS = new RoadNameLayerContent(32);
        public static final RoadNameLayerContent ADMIN_HIERARCHY = new RoadNameLayerContent(64);
        public static final RoadNameLayerContent ADDRESS_FORMAT = new RoadNameLayerContent(128);
    }

    private int value;
}
