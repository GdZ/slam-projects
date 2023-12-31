/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.conditions;

public class TimeRangeOfDay implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            startTime_ = new nds.core.conditions.TimeOfDay.ZserioPackingContext();
            endTime_ = new nds.core.conditions.TimeOfDay.ZserioPackingContext();
        }

        public nds.core.conditions.TimeOfDay.ZserioPackingContext getStartTime()
        {
            return startTime_;
        }

        public nds.core.conditions.TimeOfDay.ZserioPackingContext getEndTime()
        {
            return endTime_;
        }

        private nds.core.conditions.TimeOfDay.ZserioPackingContext startTime_;
        private nds.core.conditions.TimeOfDay.ZserioPackingContext endTime_;
    };

    public TimeRangeOfDay()
    {
    }

    public TimeRangeOfDay(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public TimeRangeOfDay(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public TimeRangeOfDay(
            nds.core.conditions.TimeOfDay startTime_,
            nds.core.conditions.TimeOfDay endTime_,
            boolean isInclusive_)
    {
        setStartTime(startTime_);
        setEndTime(endTime_);
        setIsInclusive(isInclusive_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        startTime_.initPackingContext(zserioContext.getStartTime());
        endTime_.initPackingContext(zserioContext.getEndTime());
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

        endBitPosition += startTime_.bitSizeOf(endBitPosition);
        endBitPosition += endTime_.bitSizeOf(endBitPosition);
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += startTime_.bitSizeOf(zserioContext.getStartTime(), endBitPosition);
        endBitPosition += endTime_.bitSizeOf(zserioContext.getEndTime(), endBitPosition);
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.conditions.TimeOfDay getStartTime()
    {
        return startTime_;
    }

    public void setStartTime(nds.core.conditions.TimeOfDay startTime_)
    {
        this.startTime_ = startTime_;
    }

    public nds.core.conditions.TimeOfDay getEndTime()
    {
        return endTime_;
    }

    public void setEndTime(nds.core.conditions.TimeOfDay endTime_)
    {
        this.endTime_ = endTime_;
    }

    public boolean getIsInclusive()
    {
        return isInclusive_;
    }

    public void setIsInclusive(boolean isInclusive_)
    {
        this.isInclusive_ = isInclusive_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof TimeRangeOfDay)
        {
            final TimeRangeOfDay that = (TimeRangeOfDay)obj;

            return
                    ((startTime_ == null) ? that.startTime_ == null : startTime_.equals(that.startTime_)) &&
                    ((endTime_ == null) ? that.endTime_ == null : endTime_.equals(that.endTime_)) &&
                    isInclusive_ == that.isInclusive_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, startTime_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, endTime_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, isInclusive_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        startTime_ = new nds.core.conditions.TimeOfDay(in);

        endTime_ = new nds.core.conditions.TimeOfDay(in);

        isInclusive_ = in.readBool();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        startTime_ = new nds.core.conditions.TimeOfDay(zserioContext.getStartTime(), in);

        endTime_ = new nds.core.conditions.TimeOfDay(zserioContext.getEndTime(), in);

        isInclusive_ = in.readBool();
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

        endBitPosition = startTime_.initializeOffsets(endBitPosition);
        endBitPosition = endTime_.initializeOffsets(endBitPosition);
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = startTime_.initializeOffsets(zserioContext.getStartTime(), endBitPosition);
        endBitPosition = endTime_.initializeOffsets(zserioContext.getEndTime(), endBitPosition);
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        startTime_.write(out);

        endTime_.write(out);

        out.writeBool(isInclusive_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        startTime_.write(zserioContext.getStartTime(), out);

        endTime_.write(zserioContext.getEndTime(), out);

        out.writeBool(isInclusive_);
    }

    private nds.core.conditions.TimeOfDay startTime_;
    private nds.core.conditions.TimeOfDay endTime_;
    private boolean isInclusive_;
}
