/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.types;

public class UsedColorModes implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public UsedColorModes()
    {
        this((byte)0);
    }

    public UsedColorModes(byte value)
    {
        if (value < (byte)0 || value > (byte)15)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'UsedColorModes' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public UsedColorModes(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = (byte)in.readBits(4);
    }

    public UsedColorModes(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        value = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(4), in)).get();
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.init(
                new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(4),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(value));
    }

    @Override
    public int bitSizeOf()
    {
        return bitSizeOf(0);
    }

    @Override
    public int bitSizeOf(long bitPosition)
    {
        return 4;
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return deltaContext.bitSizeOf(
                new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(4),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(value));
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
        if (!(other instanceof UsedColorModes))
            return false;

        final UsedColorModes otherUsedColorModes = (UsedColorModes)other;
        return value == otherUsedColorModes.value;
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

        if (this.and(UsedColorModes.Values.COLOR_PER_RENDER_GROUP).equals(UsedColorModes.Values.COLOR_PER_RENDER_GROUP))
            builder.append(builder.length() == 0 ? "COLOR_PER_RENDER_GROUP" : " | COLOR_PER_RENDER_GROUP");
        if (this.and(UsedColorModes.Values.COLOR_PER_VERTEX).equals(UsedColorModes.Values.COLOR_PER_VERTEX))
            builder.append(builder.length() == 0 ? "COLOR_PER_VERTEX" : " | COLOR_PER_VERTEX");

        return java.lang.String.valueOf(value) + "[" + builder.toString() + "]";
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBits(value, 4);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.write(
                new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits(4), out,
                new zserio.runtime.array.ArrayElement.ByteArrayElement(value));
    }

    public byte getValue()
    {
        return value;
    }

    @Override
    public java.lang.Number getGenericValue()
    {
        return value;
    }

    public UsedColorModes or(UsedColorModes other)
    {
        return new UsedColorModes((byte)(value | other.value));
    }

    public UsedColorModes and(UsedColorModes other)
    {
        return new UsedColorModes((byte)(value & other.value));
    }

    public UsedColorModes xor(UsedColorModes other)
    {
        return new UsedColorModes((byte)(value ^ other.value));
    }

    public UsedColorModes not()
    {
        return new UsedColorModes((byte)(~value & (byte)15));
    }

    public static final class Values
    {
        public static final UsedColorModes COLOR_PER_RENDER_GROUP = new UsedColorModes((byte)1);
        public static final UsedColorModes COLOR_PER_VERTEX = new UsedColorModes((byte)2);
    }

    private byte value;
}