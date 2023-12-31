/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.search.services;

public class AroundPositionSearchRequestDetails implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            origin_ = new nds.core.geometry.Position2D.ZserioPackingContext();
            maxDistance_ = new zserio.runtime.array.DeltaContext();
        }

        public nds.core.geometry.Position2D.ZserioPackingContext getOrigin()
        {
            return origin_;
        }

        public zserio.runtime.array.DeltaContext getMaxDistance()
        {
            return maxDistance_;
        }

        private nds.core.geometry.Position2D.ZserioPackingContext origin_;
        private zserio.runtime.array.DeltaContext maxDistance_;
    };

    public AroundPositionSearchRequestDetails()
    {
    }

    public AroundPositionSearchRequestDetails(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public AroundPositionSearchRequestDetails(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public AroundPositionSearchRequestDetails(
            nds.core.geometry.Position2D origin_,
            java.lang.Integer maxDistance_)
    {
        setOrigin(origin_);
        setMaxDistance(maxDistance_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        origin_.initPackingContext(zserioContext.getOrigin());
        if (isMaxDistanceUsed())
        {
            zserioContext.getMaxDistance().init(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(maxDistance_));
        }
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

        endBitPosition += origin_.bitSizeOf(endBitPosition);
        endBitPosition += 1;
        if (isMaxDistanceUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(maxDistance_);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += origin_.bitSizeOf(zserioContext.getOrigin(), endBitPosition);
        endBitPosition += 1;
        if (isMaxDistanceUsed())
        {
            endBitPosition += zserioContext.getMaxDistance().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(maxDistance_));
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.geometry.Position2D getOrigin()
    {
        return origin_;
    }

    public void setOrigin(nds.core.geometry.Position2D origin_)
    {
        this.origin_ = origin_;
    }

    public java.lang.Integer getMaxDistance()
    {
        return maxDistance_;
    }

    public void setMaxDistance(java.lang.Integer maxDistance_)
    {
        this.maxDistance_ = maxDistance_;
    }

    public boolean isMaxDistanceUsed()
    {
        return isMaxDistanceSet();
    }

    public boolean isMaxDistanceSet()
    {
        return (maxDistance_ != null);
    }

    public void resetMaxDistance()
    {
        this.maxDistance_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof AroundPositionSearchRequestDetails)
        {
            final AroundPositionSearchRequestDetails that = (AroundPositionSearchRequestDetails)obj;

            return
                    ((origin_ == null) ? that.origin_ == null : origin_.equals(that.origin_)) &&
                    ((!isMaxDistanceUsed()) ? !that.isMaxDistanceUsed() :
                        ((maxDistance_ == null) ? that.maxDistance_ == null : maxDistance_.equals(that.maxDistance_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, origin_);
        if (isMaxDistanceUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, maxDistance_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        origin_ = new nds.core.geometry.Position2D(in, (byte)(0));

        if (in.readBool())
        {
            maxDistance_ = in.readVarUInt32();
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        origin_ = new nds.core.geometry.Position2D(zserioContext.getOrigin(), in, (byte)(0));

        if (in.readBool())
        {
            maxDistance_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                    zserioContext.getMaxDistance().read(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();
        }
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

        endBitPosition = origin_.initializeOffsets(endBitPosition);
        endBitPosition += 1;
        if (isMaxDistanceUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(maxDistance_);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = origin_.initializeOffsets(zserioContext.getOrigin(), endBitPosition);
        endBitPosition += 1;
        if (isMaxDistanceUsed())
        {
            endBitPosition += zserioContext.getMaxDistance().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(maxDistance_));
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        // check parameters
        if (origin_.getShift() != (byte)(0))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field AroundPositionSearchRequestDetails.origin: " +
                    origin_.getShift() + " != " + (byte)(0) + "!");
        }
        origin_.write(out);

        if (isMaxDistanceUsed())
        {
            out.writeBool(true);
            out.writeVarUInt32(maxDistance_);
        }
        else
        {
            out.writeBool(false);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        origin_.write(zserioContext.getOrigin(), out);

        if (isMaxDistanceUsed())
        {
            out.writeBool(true);
            zserioContext.getMaxDistance().write(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.IntArrayElement(maxDistance_));
        }
        else
        {
            out.writeBool(false);
        }
    }

    private nds.core.geometry.Position2D origin_;
    private java.lang.Integer maxDistance_;
}
