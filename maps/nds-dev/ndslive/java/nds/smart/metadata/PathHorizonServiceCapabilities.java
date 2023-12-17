/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.metadata;

public class PathHorizonServiceCapabilities implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public PathHorizonServiceCapabilities()
    {
        this((int)0);
    }

    public PathHorizonServiceCapabilities(int value)
    {
        if (value < 0 || value > 65535)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'PathHorizonServiceCapabilities' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public PathHorizonServiceCapabilities(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readUnsignedShort();
    }

    public PathHorizonServiceCapabilities(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        value = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.BitFieldIntArrayTraits(16), in)).get();
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.init(
                new zserio.runtime.array.ArrayTraits.BitFieldIntArrayTraits(16),
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
        return 16;
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return deltaContext.bitSizeOf(
                new zserio.runtime.array.ArrayTraits.BitFieldIntArrayTraits(16),
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
        if (!(other instanceof PathHorizonServiceCapabilities))
            return false;

        final PathHorizonServiceCapabilities otherPathHorizonServiceCapabilities = (PathHorizonServiceCapabilities)other;
        return value == otherPathHorizonServiceCapabilities.value;
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

        if (this.and(PathHorizonServiceCapabilities.Values.GET_HORIZON_DATA_FOR_PATH).equals(PathHorizonServiceCapabilities.Values.GET_HORIZON_DATA_FOR_PATH))
            builder.append(builder.length() == 0 ? "GET_HORIZON_DATA_FOR_PATH" : " | GET_HORIZON_DATA_FOR_PATH");
        if (this.and(PathHorizonServiceCapabilities.Values.GET_HORIZON_DATA_FOR_POSE).equals(PathHorizonServiceCapabilities.Values.GET_HORIZON_DATA_FOR_POSE))
            builder.append(builder.length() == 0 ? "GET_HORIZON_DATA_FOR_POSE" : " | GET_HORIZON_DATA_FOR_POSE");

        return java.lang.String.valueOf(value) + "[" + builder.toString() + "]";
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeUnsignedShort(value);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.write(
                new zserio.runtime.array.ArrayTraits.BitFieldIntArrayTraits(16), out,
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

    public PathHorizonServiceCapabilities or(PathHorizonServiceCapabilities other)
    {
        return new PathHorizonServiceCapabilities((int)(value | other.value));
    }

    public PathHorizonServiceCapabilities and(PathHorizonServiceCapabilities other)
    {
        return new PathHorizonServiceCapabilities((int)(value & other.value));
    }

    public PathHorizonServiceCapabilities xor(PathHorizonServiceCapabilities other)
    {
        return new PathHorizonServiceCapabilities((int)(value ^ other.value));
    }

    public PathHorizonServiceCapabilities not()
    {
        return new PathHorizonServiceCapabilities((int)(~value & 65535));
    }

    public static final class Values
    {
        public static final PathHorizonServiceCapabilities GET_HORIZON_DATA_FOR_PATH = new PathHorizonServiceCapabilities(1);
        public static final PathHorizonServiceCapabilities GET_HORIZON_DATA_FOR_POSE = new PathHorizonServiceCapabilities(2);
    }

    private int value;
}