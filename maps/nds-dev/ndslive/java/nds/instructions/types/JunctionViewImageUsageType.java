/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.instructions.types;

public class JunctionViewImageUsageType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public JunctionViewImageUsageType()
    {
        this((int)0);
    }

    public JunctionViewImageUsageType(int value)
    {
        if (value < 0 || value > 536870911)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'JunctionViewImageUsageType' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public JunctionViewImageUsageType(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readVarUInt32();
    }

    public JunctionViewImageUsageType(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
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
        if (!(other instanceof JunctionViewImageUsageType))
            return false;

        final JunctionViewImageUsageType otherJunctionViewImageUsageType = (JunctionViewImageUsageType)other;
        return value == otherJunctionViewImageUsageType.value;
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

        if (this.and(JunctionViewImageUsageType.Values.DAY).equals(JunctionViewImageUsageType.Values.DAY))
            builder.append(builder.length() == 0 ? "DAY" : " | DAY");
        if (this.and(JunctionViewImageUsageType.Values.NIGHT).equals(JunctionViewImageUsageType.Values.NIGHT))
            builder.append(builder.length() == 0 ? "NIGHT" : " | NIGHT");
        if (this.and(JunctionViewImageUsageType.Values.SUNSHINE).equals(JunctionViewImageUsageType.Values.SUNSHINE))
            builder.append(builder.length() == 0 ? "SUNSHINE" : " | SUNSHINE");
        if (this.and(JunctionViewImageUsageType.Values.RAIN).equals(JunctionViewImageUsageType.Values.RAIN))
            builder.append(builder.length() == 0 ? "RAIN" : " | RAIN");
        if (this.and(JunctionViewImageUsageType.Values.SNOW).equals(JunctionViewImageUsageType.Values.SNOW))
            builder.append(builder.length() == 0 ? "SNOW" : " | SNOW");

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

    public JunctionViewImageUsageType or(JunctionViewImageUsageType other)
    {
        return new JunctionViewImageUsageType((int)(value | other.value));
    }

    public JunctionViewImageUsageType and(JunctionViewImageUsageType other)
    {
        return new JunctionViewImageUsageType((int)(value & other.value));
    }

    public JunctionViewImageUsageType xor(JunctionViewImageUsageType other)
    {
        return new JunctionViewImageUsageType((int)(value ^ other.value));
    }

    public JunctionViewImageUsageType not()
    {
        return new JunctionViewImageUsageType((int)(~value & 536870911));
    }

    public static final class Values
    {
        public static final JunctionViewImageUsageType DAY = new JunctionViewImageUsageType(1);
        public static final JunctionViewImageUsageType NIGHT = new JunctionViewImageUsageType(2);
        public static final JunctionViewImageUsageType SUNSHINE = new JunctionViewImageUsageType(4);
        public static final JunctionViewImageUsageType RAIN = new JunctionViewImageUsageType(8);
        public static final JunctionViewImageUsageType SNOW = new JunctionViewImageUsageType(16);
    }

    private int value;
}
