/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.conditions;

public class BigVehiclesCondition implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            bigVehicles_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getBigVehicles()
        {
            return bigVehicles_;
        }

        private zserio.runtime.array.DeltaContext bigVehicles_;
    };

    public BigVehiclesCondition()
    {
    }

    public BigVehiclesCondition(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public BigVehiclesCondition(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public BigVehiclesCondition(
            nds.core.vehicle.BigVehicleTypes bigVehicles_,
            boolean isInclusive_)
    {
        setBigVehicles(bigVehicles_);
        setIsInclusive(isInclusive_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        bigVehicles_.initPackingContext(zserioContext.getBigVehicles());
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

        endBitPosition += bigVehicles_.bitSizeOf(endBitPosition);
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += bigVehicles_.bitSizeOf(zserioContext.getBigVehicles(), endBitPosition);
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.vehicle.BigVehicleTypes getBigVehicles()
    {
        return bigVehicles_;
    }

    public void setBigVehicles(nds.core.vehicle.BigVehicleTypes bigVehicles_)
    {
        this.bigVehicles_ = bigVehicles_;
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
        if (obj instanceof BigVehiclesCondition)
        {
            final BigVehiclesCondition that = (BigVehiclesCondition)obj;

            return
                    ((bigVehicles_ == null) ? that.bigVehicles_ == null : bigVehicles_.equals(that.bigVehicles_)) &&
                    isInclusive_ == that.isInclusive_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, bigVehicles_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, isInclusive_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        bigVehicles_ = new nds.core.vehicle.BigVehicleTypes(in);

        isInclusive_ = in.readBool();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        bigVehicles_ = new nds.core.vehicle.BigVehicleTypes(zserioContext.getBigVehicles(), in);

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

        endBitPosition += bigVehicles_.bitSizeOf(endBitPosition);
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = bigVehicles_.initializeOffsets(zserioContext.getBigVehicles(), endBitPosition);
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        bigVehicles_.write(out);

        out.writeBool(isInclusive_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        bigVehicles_.write(zserioContext.getBigVehicles(), out);

        out.writeBool(isInclusive_);
    }

    private nds.core.vehicle.BigVehicleTypes bigVehicles_;
    private boolean isInclusive_;
}
