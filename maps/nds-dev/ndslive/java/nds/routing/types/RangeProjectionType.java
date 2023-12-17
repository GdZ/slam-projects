/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routing.types;

public class RangeProjectionType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public RangeProjectionType()
    {
        this((short)0);
    }

    public RangeProjectionType(short value)
    {
        if (value < (short)0 || value > (short)255)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'RangeProjectionType' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public RangeProjectionType(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readUnsignedByte();
    }

    public RangeProjectionType(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        value = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                deltaContext.read(
                        new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits(8), in)).get();
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.init(
                new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits(8),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(value));
    }

    @Override
    public int bitSizeOf()
    {
        return bitSizeOf(0);
    }

    @Override
    public int bitSizeOf(long bitPosition)
    {
        return 8;
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        return deltaContext.bitSizeOf(
                new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits(8),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(value));
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
        if (!(other instanceof RangeProjectionType))
            return false;

        final RangeProjectionType otherRangeProjectionType = (RangeProjectionType)other;
        return value == otherRangeProjectionType.value;
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

        if (this.and(RangeProjectionType.Values.DISTANCE).equals(RangeProjectionType.Values.DISTANCE))
            builder.append(builder.length() == 0 ? "DISTANCE" : " | DISTANCE");
        if (this.and(RangeProjectionType.Values.TIME).equals(RangeProjectionType.Values.TIME))
            builder.append(builder.length() == 0 ? "TIME" : " | TIME");
        if (this.and(RangeProjectionType.Values.FUEL).equals(RangeProjectionType.Values.FUEL))
            builder.append(builder.length() == 0 ? "FUEL" : " | FUEL");
        if (this.and(RangeProjectionType.Values.BATTERY).equals(RangeProjectionType.Values.BATTERY))
            builder.append(builder.length() == 0 ? "BATTERY" : " | BATTERY");

        return java.lang.String.valueOf(value) + "[" + builder.toString() + "]";
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeUnsignedByte(value);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final zserio.runtime.array.DeltaContext deltaContext = context.cast();
        deltaContext.write(
                new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits(8), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(value));
    }

    public short getValue()
    {
        return value;
    }

    @Override
    public java.lang.Number getGenericValue()
    {
        return value;
    }

    public RangeProjectionType or(RangeProjectionType other)
    {
        return new RangeProjectionType((short)(value | other.value));
    }

    public RangeProjectionType and(RangeProjectionType other)
    {
        return new RangeProjectionType((short)(value & other.value));
    }

    public RangeProjectionType xor(RangeProjectionType other)
    {
        return new RangeProjectionType((short)(value ^ other.value));
    }

    public RangeProjectionType not()
    {
        return new RangeProjectionType((short)(~value & (short)255));
    }

    public static final class Values
    {
        public static final RangeProjectionType DISTANCE = new RangeProjectionType((short)1);
        public static final RangeProjectionType TIME = new RangeProjectionType((short)2);
        public static final RangeProjectionType FUEL = new RangeProjectionType((short)4);
        public static final RangeProjectionType BATTERY = new RangeProjectionType((short)8);
    }

    private short value;
}
