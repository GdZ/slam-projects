/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.conditions;

public class TimeRangeOfWeek implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            startTime_ = new zserio.runtime.array.DeltaContext();
            endTime_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getStartTime()
        {
            return startTime_;
        }

        public zserio.runtime.array.DeltaContext getEndTime()
        {
            return endTime_;
        }

        private zserio.runtime.array.DeltaContext startTime_;
        private zserio.runtime.array.DeltaContext endTime_;
    };

    public TimeRangeOfWeek()
    {
    }

    public TimeRangeOfWeek(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public TimeRangeOfWeek(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public TimeRangeOfWeek(
            short startTime_,
            short endTime_)
    {
        setStartTime(startTime_);
        setEndTime(endTime_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getStartTime().init(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(14)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(startTime_));
        zserioContext.getEndTime().init(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(14)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(endTime_));
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

        endBitPosition += 14;
        endBitPosition += 14;

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getStartTime().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(14)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(startTime_));
        endBitPosition += zserioContext.getEndTime().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(14)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(endTime_));

        return (int)(endBitPosition - bitPosition);
    }

    public short getStartTime()
    {
        return startTime_;
    }

    public void setStartTime(short startTime_)
    {
        this.startTime_ = startTime_;
    }

    public short getEndTime()
    {
        return endTime_;
    }

    public void setEndTime(short endTime_)
    {
        this.endTime_ = endTime_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof TimeRangeOfWeek)
        {
            final TimeRangeOfWeek that = (TimeRangeOfWeek)obj;

            return
                    startTime_ == that.startTime_ &&
                    endTime_ == that.endTime_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, startTime_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, endTime_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        startTime_ = (short)in.readBits(14);

        endTime_ = (short)in.readBits(14);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        startTime_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getStartTime().read(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(14)), in)).get();

        endTime_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getEndTime().read(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(14)), in)).get();
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

        endBitPosition += 14;
        endBitPosition += 14;

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getStartTime().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(14)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(startTime_));
        endBitPosition += zserioContext.getEndTime().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(14)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(endTime_));

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBits(startTime_, 14);

        out.writeBits(endTime_, 14);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getStartTime().write(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(14)), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(startTime_));

        zserioContext.getEndTime().write(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(14)), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(endTime_));
    }

    private short startTime_;
    private short endTime_;
}