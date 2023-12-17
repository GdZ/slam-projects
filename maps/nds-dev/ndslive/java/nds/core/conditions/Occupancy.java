/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.conditions;

public class Occupancy implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            occupancyCount_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getOccupancyCount()
        {
            return occupancyCount_;
        }

        private zserio.runtime.array.DeltaContext occupancyCount_;
    };

    public Occupancy()
    {
    }

    public Occupancy(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public Occupancy(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public Occupancy(
            nds.core.conditions.OccupancyCount occupancyCount_,
            boolean isInclusive_)
    {
        setOccupancyCount(occupancyCount_);
        setIsInclusive(isInclusive_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        occupancyCount_.initPackingContext(zserioContext.getOccupancyCount());
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

        endBitPosition += occupancyCount_.bitSizeOf(endBitPosition);
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += occupancyCount_.bitSizeOf(zserioContext.getOccupancyCount(), endBitPosition);
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.conditions.OccupancyCount getOccupancyCount()
    {
        return occupancyCount_;
    }

    public void setOccupancyCount(nds.core.conditions.OccupancyCount occupancyCount_)
    {
        this.occupancyCount_ = occupancyCount_;
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
        if (obj instanceof Occupancy)
        {
            final Occupancy that = (Occupancy)obj;

            return
                    ((occupancyCount_ == null) ? that.occupancyCount_ == null : occupancyCount_.getValue() == that.occupancyCount_.getValue()) &&
                    isInclusive_ == that.isInclusive_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, occupancyCount_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, isInclusive_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        occupancyCount_ = nds.core.conditions.OccupancyCount.readEnum(in);

        isInclusive_ = in.readBool();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        occupancyCount_ = nds.core.conditions.OccupancyCount.readEnum(zserioContext.getOccupancyCount(), in);

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

        endBitPosition += occupancyCount_.bitSizeOf(endBitPosition);
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = occupancyCount_.initializeOffsets(zserioContext.getOccupancyCount(), endBitPosition);
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        occupancyCount_.write(out);

        out.writeBool(isInclusive_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        occupancyCount_.write(zserioContext.getOccupancyCount(), out);

        out.writeBool(isInclusive_);
    }

    private nds.core.conditions.OccupancyCount occupancyCount_;
    private boolean isInclusive_;
}
