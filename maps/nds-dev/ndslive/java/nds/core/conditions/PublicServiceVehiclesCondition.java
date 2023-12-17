/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.conditions;

public class PublicServiceVehiclesCondition implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            vehicles_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getVehicles()
        {
            return vehicles_;
        }

        private zserio.runtime.array.DeltaContext vehicles_;
    };

    public PublicServiceVehiclesCondition()
    {
    }

    public PublicServiceVehiclesCondition(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public PublicServiceVehiclesCondition(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public PublicServiceVehiclesCondition(
            nds.core.vehicle.PublicServiceVehicleTypes vehicles_,
            boolean isInclusive_)
    {
        setVehicles(vehicles_);
        setIsInclusive(isInclusive_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        vehicles_.initPackingContext(zserioContext.getVehicles());
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

        endBitPosition += vehicles_.bitSizeOf(endBitPosition);
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += vehicles_.bitSizeOf(zserioContext.getVehicles(), endBitPosition);
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.vehicle.PublicServiceVehicleTypes getVehicles()
    {
        return vehicles_;
    }

    public void setVehicles(nds.core.vehicle.PublicServiceVehicleTypes vehicles_)
    {
        this.vehicles_ = vehicles_;
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
        if (obj instanceof PublicServiceVehiclesCondition)
        {
            final PublicServiceVehiclesCondition that = (PublicServiceVehiclesCondition)obj;

            return
                    ((vehicles_ == null) ? that.vehicles_ == null : vehicles_.equals(that.vehicles_)) &&
                    isInclusive_ == that.isInclusive_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, vehicles_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, isInclusive_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        vehicles_ = new nds.core.vehicle.PublicServiceVehicleTypes(in);

        isInclusive_ = in.readBool();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        vehicles_ = new nds.core.vehicle.PublicServiceVehicleTypes(zserioContext.getVehicles(), in);

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

        endBitPosition += vehicles_.bitSizeOf(endBitPosition);
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = vehicles_.initializeOffsets(zserioContext.getVehicles(), endBitPosition);
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        vehicles_.write(out);

        out.writeBool(isInclusive_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        vehicles_.write(zserioContext.getVehicles(), out);

        out.writeBool(isInclusive_);
    }

    private nds.core.vehicle.PublicServiceVehicleTypes vehicles_;
    private boolean isInclusive_;
}
