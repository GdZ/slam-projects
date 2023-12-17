/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.poi.types;

public class AccessPointDetails implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            accessPointMethod_ = new zserio.runtime.array.DeltaContext();
            accessPointLevel_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getAccessPointMethod()
        {
            return accessPointMethod_;
        }

        public zserio.runtime.array.DeltaContext getAccessPointLevel()
        {
            return accessPointLevel_;
        }

        private zserio.runtime.array.DeltaContext accessPointMethod_;
        private zserio.runtime.array.DeltaContext accessPointLevel_;
    };

    public AccessPointDetails()
    {
    }

    public AccessPointDetails(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public AccessPointDetails(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public AccessPointDetails(
            nds.poi.types.AccessPointMethod accessPointMethod_,
            nds.poi.types.AccessPointLevel accessPointLevel_)
    {
        setAccessPointMethod(accessPointMethod_);
        setAccessPointLevel(accessPointLevel_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        accessPointMethod_.initPackingContext(zserioContext.getAccessPointMethod());
        accessPointLevel_.initPackingContext(zserioContext.getAccessPointLevel());
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

        endBitPosition += accessPointMethod_.bitSizeOf(endBitPosition);
        endBitPosition += accessPointLevel_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += accessPointMethod_.bitSizeOf(zserioContext.getAccessPointMethod(), endBitPosition);
        endBitPosition += accessPointLevel_.bitSizeOf(zserioContext.getAccessPointLevel(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.poi.types.AccessPointMethod getAccessPointMethod()
    {
        return accessPointMethod_;
    }

    public void setAccessPointMethod(nds.poi.types.AccessPointMethod accessPointMethod_)
    {
        this.accessPointMethod_ = accessPointMethod_;
    }

    public nds.poi.types.AccessPointLevel getAccessPointLevel()
    {
        return accessPointLevel_;
    }

    public void setAccessPointLevel(nds.poi.types.AccessPointLevel accessPointLevel_)
    {
        this.accessPointLevel_ = accessPointLevel_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof AccessPointDetails)
        {
            final AccessPointDetails that = (AccessPointDetails)obj;

            return
                    ((accessPointMethod_ == null) ? that.accessPointMethod_ == null : accessPointMethod_.getValue() == that.accessPointMethod_.getValue()) &&
                    ((accessPointLevel_ == null) ? that.accessPointLevel_ == null : accessPointLevel_.getValue() == that.accessPointLevel_.getValue());
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, accessPointMethod_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, accessPointLevel_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        accessPointMethod_ = nds.poi.types.AccessPointMethod.readEnum(in);

        accessPointLevel_ = nds.poi.types.AccessPointLevel.readEnum(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        accessPointMethod_ = nds.poi.types.AccessPointMethod.readEnum(zserioContext.getAccessPointMethod(), in);

        accessPointLevel_ = nds.poi.types.AccessPointLevel.readEnum(zserioContext.getAccessPointLevel(), in);
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

        endBitPosition += accessPointMethod_.bitSizeOf(endBitPosition);
        endBitPosition += accessPointLevel_.bitSizeOf(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = accessPointMethod_.initializeOffsets(zserioContext.getAccessPointMethod(), endBitPosition);
        endBitPosition = accessPointLevel_.initializeOffsets(zserioContext.getAccessPointLevel(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        accessPointMethod_.write(out);

        accessPointLevel_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        accessPointMethod_.write(zserioContext.getAccessPointMethod(), out);

        accessPointLevel_.write(zserioContext.getAccessPointLevel(), out);
    }

    private nds.poi.types.AccessPointMethod accessPointMethod_;
    private nds.poi.types.AccessPointLevel accessPointLevel_;
}
