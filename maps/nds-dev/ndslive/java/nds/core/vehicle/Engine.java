/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.vehicle;

public class Engine implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            energyType_ = new zserio.runtime.array.DeltaContext();
            euroEmissionClass_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getEnergyType()
        {
            return energyType_;
        }

        public zserio.runtime.array.DeltaContext getEuroEmissionClass()
        {
            return euroEmissionClass_;
        }

        private zserio.runtime.array.DeltaContext energyType_;
        private zserio.runtime.array.DeltaContext euroEmissionClass_;
    };

    public Engine()
    {
    }

    public Engine(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public Engine(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public Engine(
            nds.core.vehicle.EnergyType energyType_,
            nds.core.vehicle.VehicleEuroEmissionClass euroEmissionClass_)
    {
        setEnergyType(energyType_);
        setEuroEmissionClass(euroEmissionClass_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        energyType_.initPackingContext(zserioContext.getEnergyType());
        euroEmissionClass_.initPackingContext(zserioContext.getEuroEmissionClass());
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

        endBitPosition += energyType_.bitSizeOf(endBitPosition);
        endBitPosition += euroEmissionClass_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += energyType_.bitSizeOf(zserioContext.getEnergyType(), endBitPosition);
        endBitPosition += euroEmissionClass_.bitSizeOf(zserioContext.getEuroEmissionClass(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.vehicle.EnergyType getEnergyType()
    {
        return energyType_;
    }

    public void setEnergyType(nds.core.vehicle.EnergyType energyType_)
    {
        this.energyType_ = energyType_;
    }

    public nds.core.vehicle.VehicleEuroEmissionClass getEuroEmissionClass()
    {
        return euroEmissionClass_;
    }

    public void setEuroEmissionClass(nds.core.vehicle.VehicleEuroEmissionClass euroEmissionClass_)
    {
        this.euroEmissionClass_ = euroEmissionClass_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof Engine)
        {
            final Engine that = (Engine)obj;

            return
                    ((energyType_ == null) ? that.energyType_ == null : energyType_.equals(that.energyType_)) &&
                    ((euroEmissionClass_ == null) ? that.euroEmissionClass_ == null : euroEmissionClass_.equals(that.euroEmissionClass_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, energyType_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, euroEmissionClass_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        energyType_ = new nds.core.vehicle.EnergyType(in);

        euroEmissionClass_ = new nds.core.vehicle.VehicleEuroEmissionClass(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        energyType_ = new nds.core.vehicle.EnergyType(zserioContext.getEnergyType(), in);

        euroEmissionClass_ = new nds.core.vehicle.VehicleEuroEmissionClass(zserioContext.getEuroEmissionClass(), in);
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

        endBitPosition += energyType_.bitSizeOf(endBitPosition);
        endBitPosition += euroEmissionClass_.bitSizeOf(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = energyType_.initializeOffsets(zserioContext.getEnergyType(), endBitPosition);
        endBitPosition = euroEmissionClass_.initializeOffsets(zserioContext.getEuroEmissionClass(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        energyType_.write(out);

        euroEmissionClass_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        energyType_.write(zserioContext.getEnergyType(), out);

        euroEmissionClass_.write(zserioContext.getEuroEmissionClass(), out);
    }

    private nds.core.vehicle.EnergyType energyType_;
    private nds.core.vehicle.VehicleEuroEmissionClass euroEmissionClass_;
}