/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.characteristics.metadata;

public class RoadLocationCharacsLayerContent implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public RoadLocationCharacsLayerContent()
    {
        this((int)0);
    }

    public RoadLocationCharacsLayerContent(int value)
    {
        if (value < 0 || value > 536870911)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'RoadLocationCharacsLayerContent' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public RoadLocationCharacsLayerContent(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readVarUInt32();
    }

    public RoadLocationCharacsLayerContent(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
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
        if (!(other instanceof RoadLocationCharacsLayerContent))
            return false;

        final RoadLocationCharacsLayerContent otherRoadLocationCharacsLayerContent = (RoadLocationCharacsLayerContent)other;
        return value == otherRoadLocationCharacsLayerContent.value;
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

        if (this.and(RoadLocationCharacsLayerContent.Values.ROAD_LOCATION_MAPS).equals(RoadLocationCharacsLayerContent.Values.ROAD_LOCATION_MAPS))
            builder.append(builder.length() == 0 ? "ROAD_LOCATION_MAPS" : " | ROAD_LOCATION_MAPS");
        if (this.and(RoadLocationCharacsLayerContent.Values.ROAD_LOCATION_SETS).equals(RoadLocationCharacsLayerContent.Values.ROAD_LOCATION_SETS))
            builder.append(builder.length() == 0 ? "ROAD_LOCATION_SETS" : " | ROAD_LOCATION_SETS");

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

    public RoadLocationCharacsLayerContent or(RoadLocationCharacsLayerContent other)
    {
        return new RoadLocationCharacsLayerContent((int)(value | other.value));
    }

    public RoadLocationCharacsLayerContent and(RoadLocationCharacsLayerContent other)
    {
        return new RoadLocationCharacsLayerContent((int)(value & other.value));
    }

    public RoadLocationCharacsLayerContent xor(RoadLocationCharacsLayerContent other)
    {
        return new RoadLocationCharacsLayerContent((int)(value ^ other.value));
    }

    public RoadLocationCharacsLayerContent not()
    {
        return new RoadLocationCharacsLayerContent((int)(~value & 536870911));
    }

    public static final class Values
    {
        public static final RoadLocationCharacsLayerContent ROAD_LOCATION_MAPS = new RoadLocationCharacsLayerContent(1);
        public static final RoadLocationCharacsLayerContent ROAD_LOCATION_SETS = new RoadLocationCharacsLayerContent(2);
    }

    private int value;
}
