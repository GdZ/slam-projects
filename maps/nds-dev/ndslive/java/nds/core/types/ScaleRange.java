/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.types;

public class ScaleRange implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            scaleRangeId_ = new zserio.runtime.array.DeltaContext();
            minScaleDenominator_ = new zserio.runtime.array.DeltaContext();
            maxScaleDenominator_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getScaleRangeId()
        {
            return scaleRangeId_;
        }

        public zserio.runtime.array.DeltaContext getMinScaleDenominator()
        {
            return minScaleDenominator_;
        }

        public zserio.runtime.array.DeltaContext getMaxScaleDenominator()
        {
            return maxScaleDenominator_;
        }

        private zserio.runtime.array.DeltaContext scaleRangeId_;
        private zserio.runtime.array.DeltaContext minScaleDenominator_;
        private zserio.runtime.array.DeltaContext maxScaleDenominator_;
    };

    public ScaleRange()
    {
    }

    public ScaleRange(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public ScaleRange(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public ScaleRange(
            int scaleRangeId_,
            long minScaleDenominator_,
            long maxScaleDenominator_)
    {
        setScaleRangeId(scaleRangeId_);
        setMinScaleDenominator(minScaleDenominator_);
        setMaxScaleDenominator(maxScaleDenominator_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getScaleRangeId().init(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(scaleRangeId_));
        zserioContext.getMinScaleDenominator().init(new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(32)),
                new zserio.runtime.array.ArrayElement.LongArrayElement(minScaleDenominator_));
        zserioContext.getMaxScaleDenominator().init(new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(32)),
                new zserio.runtime.array.ArrayElement.LongArrayElement(maxScaleDenominator_));
    }

    @Override
    public int bitSizeOf()
    {
        return bitSizeOf(0);
    }

    @Override
    public int bitSizeOf(long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(scaleRangeId_);
        endBitPosition += 32;
        endBitPosition += 32;

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getScaleRangeId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(scaleRangeId_));
        endBitPosition += zserioContext.getMinScaleDenominator().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(32)),
                new zserio.runtime.array.ArrayElement.LongArrayElement(minScaleDenominator_));
        endBitPosition += zserioContext.getMaxScaleDenominator().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(32)),
                new zserio.runtime.array.ArrayElement.LongArrayElement(maxScaleDenominator_));

        return (int)(endBitPosition - bitPosition);
    }

    public int getScaleRangeId()
    {
        return scaleRangeId_;
    }

    public void setScaleRangeId(int scaleRangeId_)
    {
        this.scaleRangeId_ = scaleRangeId_;
    }

    public long getMinScaleDenominator()
    {
        return minScaleDenominator_;
    }

    public void setMinScaleDenominator(long minScaleDenominator_)
    {
        this.minScaleDenominator_ = minScaleDenominator_;
    }

    public long getMaxScaleDenominator()
    {
        return maxScaleDenominator_;
    }

    public void setMaxScaleDenominator(long maxScaleDenominator_)
    {
        this.maxScaleDenominator_ = maxScaleDenominator_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof ScaleRange)
        {
            final ScaleRange that = (ScaleRange)obj;

            return
                    scaleRangeId_ == that.scaleRangeId_ &&
                    minScaleDenominator_ == that.minScaleDenominator_ &&
                    maxScaleDenominator_ == that.maxScaleDenominator_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, scaleRangeId_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, minScaleDenominator_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, maxScaleDenominator_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        scaleRangeId_ = in.readVarUInt32();

        minScaleDenominator_ = in.readUnsignedInt();

        maxScaleDenominator_ = in.readUnsignedInt();

        checkConstraints();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        scaleRangeId_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getScaleRangeId().read(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();

        minScaleDenominator_ = ((zserio.runtime.array.ArrayElement.LongArrayElement)
                zserioContext.getMinScaleDenominator().read(new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(32)), in)).get();

        maxScaleDenominator_ = ((zserio.runtime.array.ArrayElement.LongArrayElement)
                zserioContext.getMaxScaleDenominator().read(new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(32)), in)).get();

        checkConstraints();
    }

    @Override
    public long initializeOffsets()
    {
        return initializeOffsets(0);
    }

    @Override
    public long initializeOffsets(long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(scaleRangeId_);
        endBitPosition += 32;
        endBitPosition += 32;

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getScaleRangeId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(scaleRangeId_));
        endBitPosition += zserioContext.getMinScaleDenominator().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(32)),
                new zserio.runtime.array.ArrayElement.LongArrayElement(minScaleDenominator_));
        endBitPosition += zserioContext.getMaxScaleDenominator().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(32)),
                new zserio.runtime.array.ArrayElement.LongArrayElement(maxScaleDenominator_));

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        checkConstraints();

        out.writeVarUInt32(scaleRangeId_);

        out.writeUnsignedInt(minScaleDenominator_);

        out.writeUnsignedInt(maxScaleDenominator_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        checkConstraints();

        zserioContext.getScaleRangeId().write(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(scaleRangeId_));

        zserioContext.getMinScaleDenominator().write(new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(32)), out,
                new zserio.runtime.array.ArrayElement.LongArrayElement(minScaleDenominator_));

        zserioContext.getMaxScaleDenominator().write(new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(32)), out,
                new zserio.runtime.array.ArrayElement.LongArrayElement(maxScaleDenominator_));
    }

    private void checkConstraints()
    {
        if (!(getMinScaleDenominator() > 0))
            throw new zserio.runtime.ConstraintError("Constraint violated at ScaleRange.minScaleDenominator!");
        if (!(getMaxScaleDenominator() > getMinScaleDenominator()))
            throw new zserio.runtime.ConstraintError("Constraint violated at ScaleRange.maxScaleDenominator!");
    }

    private int scaleRangeId_;
    private long minScaleDenominator_;
    private long maxScaleDenominator_;
}
