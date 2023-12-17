/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.metadata;

public class BoundaryGeometryUsage implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf,
        zserio.runtime.ZserioBitmask
{
    public BoundaryGeometryUsage()
    {
        this((int)0);
    }

    public BoundaryGeometryUsage(int value)
    {
        if (value < 0 || value > 536870911)
        {
            throw new java.lang.IllegalArgumentException(
                    "Value for bitmask 'BoundaryGeometryUsage' out of bounds: " + value + "!");
        }
        this.value = value;
    }

    public BoundaryGeometryUsage(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        value = in.readVarUInt32();
    }

    public BoundaryGeometryUsage(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
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
        if (!(other instanceof BoundaryGeometryUsage))
            return false;

        final BoundaryGeometryUsage otherBoundaryGeometryUsage = (BoundaryGeometryUsage)other;
        return value == otherBoundaryGeometryUsage.value;
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

        if (this.and(BoundaryGeometryUsage.Values.NOT_USED).equals(BoundaryGeometryUsage.Values.NOT_USED))
            builder.append(builder.length() == 0 ? "NOT_USED" : " | NOT_USED");
        if (this.and(BoundaryGeometryUsage.Values.DISTINCT).equals(BoundaryGeometryUsage.Values.DISTINCT))
            builder.append(builder.length() == 0 ? "DISTINCT" : " | DISTINCT");
        if (this.and(BoundaryGeometryUsage.Values.SHARED).equals(BoundaryGeometryUsage.Values.SHARED))
            builder.append(builder.length() == 0 ? "SHARED" : " | SHARED");

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

    public BoundaryGeometryUsage or(BoundaryGeometryUsage other)
    {
        return new BoundaryGeometryUsage((int)(value | other.value));
    }

    public BoundaryGeometryUsage and(BoundaryGeometryUsage other)
    {
        return new BoundaryGeometryUsage((int)(value & other.value));
    }

    public BoundaryGeometryUsage xor(BoundaryGeometryUsage other)
    {
        return new BoundaryGeometryUsage((int)(value ^ other.value));
    }

    public BoundaryGeometryUsage not()
    {
        return new BoundaryGeometryUsage((int)(~value & 536870911));
    }

    public static final class Values
    {
        public static final BoundaryGeometryUsage NOT_USED = new BoundaryGeometryUsage(1);
        public static final BoundaryGeometryUsage DISTINCT = new BoundaryGeometryUsage(2);
        public static final BoundaryGeometryUsage SHARED = new BoundaryGeometryUsage(4);
    }

    private int value;
}