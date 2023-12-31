/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.metadata;

public class RasterTileServiceCapabilities implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public RasterTileServiceCapabilities()
    {
        this((int)0);
    }

    public RasterTileServiceCapabilities(int value)
    {
        if (value < 0 || value > 65535)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'RasterTileServiceCapabilities' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public RasterTileServiceCapabilities(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readUnsignedShort();
    }

    public RasterTileServiceCapabilities(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
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
        if (!(other instanceof RasterTileServiceCapabilities))
            return false;

        final RasterTileServiceCapabilities otherRasterTileServiceCapabilities = (RasterTileServiceCapabilities)other;
        return value == otherRasterTileServiceCapabilities.value;
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

        if (this.and(RasterTileServiceCapabilities.Values.GET_IMAGE).equals(RasterTileServiceCapabilities.Values.GET_IMAGE))
            builder.append(builder.length() == 0 ? "GET_IMAGE" : " | GET_IMAGE");
        if (this.and(RasterTileServiceCapabilities.Values.GET_TILE_METADATA).equals(RasterTileServiceCapabilities.Values.GET_TILE_METADATA))
            builder.append(builder.length() == 0 ? "GET_TILE_METADATA" : " | GET_TILE_METADATA");
        if (this.and(RasterTileServiceCapabilities.Values.GET_IMAGE_VERSIONED).equals(RasterTileServiceCapabilities.Values.GET_IMAGE_VERSIONED))
            builder.append(builder.length() == 0 ? "GET_IMAGE_VERSIONED" : " | GET_IMAGE_VERSIONED");

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

    public RasterTileServiceCapabilities or(RasterTileServiceCapabilities other)
    {
        return new RasterTileServiceCapabilities((int)(value | other.value));
    }

    public RasterTileServiceCapabilities and(RasterTileServiceCapabilities other)
    {
        return new RasterTileServiceCapabilities((int)(value & other.value));
    }

    public RasterTileServiceCapabilities xor(RasterTileServiceCapabilities other)
    {
        return new RasterTileServiceCapabilities((int)(value ^ other.value));
    }

    public RasterTileServiceCapabilities not()
    {
        return new RasterTileServiceCapabilities((int)(~value & 65535));
    }

    public static final class Values
    {
        public static final RasterTileServiceCapabilities GET_IMAGE = new RasterTileServiceCapabilities(1);
        public static final RasterTileServiceCapabilities GET_TILE_METADATA = new RasterTileServiceCapabilities(2);
        public static final RasterTileServiceCapabilities GET_IMAGE_VERSIONED = new RasterTileServiceCapabilities(4);
    }

    private int value;
}
