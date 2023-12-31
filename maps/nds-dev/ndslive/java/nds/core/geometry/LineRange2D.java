/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.geometry;

public class LineRange2D implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            start_ = new zserio.runtime.array.DeltaContext();
            end_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getStart()
        {
            return start_;
        }

        public zserio.runtime.array.DeltaContext getEnd()
        {
            return end_;
        }

        private zserio.runtime.array.DeltaContext start_;
        private zserio.runtime.array.DeltaContext end_;
    };

    public LineRange2D(
            nds.core.geometry.Line2D line_)
    {
        this.line_ = line_;
    }

    public LineRange2D(zserio.runtime.io.BitStreamReader in,
            nds.core.geometry.Line2D line_)
            throws java.io.IOException
    {
        this.line_ = line_;

        read(in);
    }

    public LineRange2D(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.core.geometry.Line2D line_)
            throws java.io.IOException
    {
        this.line_ = line_;

        read(context, in);
    }

    public LineRange2D(
            nds.core.geometry.Line2D line_,
            int start_,
            int end_)
    {
        this(line_);

        setStart(start_);
        setEnd(end_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getStart().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(start_));
        zserioContext.getEnd().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(end_));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(start_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(end_);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getStart().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(start_));
        endBitPosition += zserioContext.getEnd().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(end_));

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.geometry.Line2D getLine()
    {
        return this.line_;
    }

    public int getStart()
    {
        return start_;
    }

    public void setStart(int start_)
    {
        this.start_ = start_;
    }

    public int getEnd()
    {
        return end_;
    }

    public void setEnd(int end_)
    {
        this.end_ = end_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LineRange2D)
        {
            final LineRange2D that = (LineRange2D)obj;

            return
                    ((this.line_ == null) ? that.line_ == null : this.line_.equals(that.line_)) &&
                    start_ == that.start_ &&
                    end_ == that.end_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getLine());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, start_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, end_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        start_ = in.readVarSize();

        end_ = in.readVarSize();

        checkConstraints();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        start_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getStart().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        end_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getEnd().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(start_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(end_);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getStart().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(start_));
        endBitPosition += zserioContext.getEnd().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(end_));

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        checkConstraints();

        out.writeVarSize(start_);

        out.writeVarSize(end_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        checkConstraints();

        zserioContext.getStart().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(start_));

        zserioContext.getEnd().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(end_));
    }

    private void checkConstraints()
    {
        if (!(getEnd() > getStart() && getEnd() <= getLine().funcLastPositionIdx()))
            throw new zserio.runtime.ConstraintError("Constraint violated at LineRange2D.end!");
    }

    private final nds.core.geometry.Line2D line_;
    private int start_;
    private int end_;
}
