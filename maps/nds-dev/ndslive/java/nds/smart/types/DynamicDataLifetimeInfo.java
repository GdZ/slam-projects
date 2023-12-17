/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.types;

public class DynamicDataLifetimeInfo implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            collectionTime_ = new nds.core.types.TimeStamp.ZserioPackingContext();
            expirationTime_ = new nds.core.types.TimeStamp.ZserioPackingContext();
        }

        public nds.core.types.TimeStamp.ZserioPackingContext getCollectionTime()
        {
            return collectionTime_;
        }

        public nds.core.types.TimeStamp.ZserioPackingContext getExpirationTime()
        {
            return expirationTime_;
        }

        private nds.core.types.TimeStamp.ZserioPackingContext collectionTime_;
        private nds.core.types.TimeStamp.ZserioPackingContext expirationTime_;
    };

    public DynamicDataLifetimeInfo()
    {
    }

    public DynamicDataLifetimeInfo(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public DynamicDataLifetimeInfo(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public DynamicDataLifetimeInfo(
            nds.core.types.TimeStamp collectionTime_,
            nds.core.types.TimeStamp expirationTime_)
    {
        setCollectionTime(collectionTime_);
        setExpirationTime(expirationTime_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        collectionTime_.initPackingContext(zserioContext.getCollectionTime());
        expirationTime_.initPackingContext(zserioContext.getExpirationTime());
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

        endBitPosition += collectionTime_.bitSizeOf(endBitPosition);
        endBitPosition += expirationTime_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += collectionTime_.bitSizeOf(zserioContext.getCollectionTime(), endBitPosition);
        endBitPosition += expirationTime_.bitSizeOf(zserioContext.getExpirationTime(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.types.TimeStamp getCollectionTime()
    {
        return collectionTime_;
    }

    public void setCollectionTime(nds.core.types.TimeStamp collectionTime_)
    {
        this.collectionTime_ = collectionTime_;
    }

    public nds.core.types.TimeStamp getExpirationTime()
    {
        return expirationTime_;
    }

    public void setExpirationTime(nds.core.types.TimeStamp expirationTime_)
    {
        this.expirationTime_ = expirationTime_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof DynamicDataLifetimeInfo)
        {
            final DynamicDataLifetimeInfo that = (DynamicDataLifetimeInfo)obj;

            return
                    ((collectionTime_ == null) ? that.collectionTime_ == null : collectionTime_.equals(that.collectionTime_)) &&
                    ((expirationTime_ == null) ? that.expirationTime_ == null : expirationTime_.equals(that.expirationTime_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, collectionTime_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, expirationTime_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        collectionTime_ = new nds.core.types.TimeStamp(in);

        expirationTime_ = new nds.core.types.TimeStamp(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        collectionTime_ = new nds.core.types.TimeStamp(zserioContext.getCollectionTime(), in);

        expirationTime_ = new nds.core.types.TimeStamp(zserioContext.getExpirationTime(), in);
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

        endBitPosition = collectionTime_.initializeOffsets(endBitPosition);
        endBitPosition = expirationTime_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = collectionTime_.initializeOffsets(zserioContext.getCollectionTime(), endBitPosition);
        endBitPosition = expirationTime_.initializeOffsets(zserioContext.getExpirationTime(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        collectionTime_.write(out);

        expirationTime_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        collectionTime_.write(zserioContext.getCollectionTime(), out);

        expirationTime_.write(zserioContext.getExpirationTime(), out);
    }

    private nds.core.types.TimeStamp collectionTime_;
    private nds.core.types.TimeStamp expirationTime_;
}
