/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.search.services;

public class AlongPathSearchRequestDetails implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            path_ = new nds.core.location.RoadLocationPath.ZserioPackingContext();
            maxTravelDistance_ = new zserio.runtime.array.DeltaContext();
        }

        public nds.core.location.RoadLocationPath.ZserioPackingContext getPath()
        {
            return path_;
        }

        public zserio.runtime.array.DeltaContext getMaxTravelDistance()
        {
            return maxTravelDistance_;
        }

        private nds.core.location.RoadLocationPath.ZserioPackingContext path_;
        private zserio.runtime.array.DeltaContext maxTravelDistance_;
    };

    public AlongPathSearchRequestDetails()
    {
    }

    public AlongPathSearchRequestDetails(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public AlongPathSearchRequestDetails(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public AlongPathSearchRequestDetails(
            nds.core.location.RoadLocationPath path_,
            java.lang.Integer maxTravelDistance_)
    {
        setPath(path_);
        setMaxTravelDistance(maxTravelDistance_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        path_.initPackingContext(zserioContext.getPath());
        if (isMaxTravelDistanceUsed())
        {
            zserioContext.getMaxTravelDistance().init(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(maxTravelDistance_));
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

        endBitPosition += path_.bitSizeOf(endBitPosition);
        endBitPosition += 1;
        if (isMaxTravelDistanceUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(maxTravelDistance_);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += path_.bitSizeOf(zserioContext.getPath(), endBitPosition);
        endBitPosition += 1;
        if (isMaxTravelDistanceUsed())
        {
            endBitPosition += zserioContext.getMaxTravelDistance().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(maxTravelDistance_));
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.location.RoadLocationPath getPath()
    {
        return path_;
    }

    public void setPath(nds.core.location.RoadLocationPath path_)
    {
        this.path_ = path_;
    }

    public java.lang.Integer getMaxTravelDistance()
    {
        return maxTravelDistance_;
    }

    public void setMaxTravelDistance(java.lang.Integer maxTravelDistance_)
    {
        this.maxTravelDistance_ = maxTravelDistance_;
    }

    public boolean isMaxTravelDistanceUsed()
    {
        return isMaxTravelDistanceSet();
    }

    public boolean isMaxTravelDistanceSet()
    {
        return (maxTravelDistance_ != null);
    }

    public void resetMaxTravelDistance()
    {
        this.maxTravelDistance_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof AlongPathSearchRequestDetails)
        {
            final AlongPathSearchRequestDetails that = (AlongPathSearchRequestDetails)obj;

            return
                    ((path_ == null) ? that.path_ == null : path_.equals(that.path_)) &&
                    ((!isMaxTravelDistanceUsed()) ? !that.isMaxTravelDistanceUsed() :
                        ((maxTravelDistance_ == null) ? that.maxTravelDistance_ == null : maxTravelDistance_.equals(that.maxTravelDistance_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, path_);
        if (isMaxTravelDistanceUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, maxTravelDistance_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        path_ = new nds.core.location.RoadLocationPath(in);

        if (in.readBool())
        {
            maxTravelDistance_ = in.readVarUInt32();
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        path_ = new nds.core.location.RoadLocationPath(zserioContext.getPath(), in);

        if (in.readBool())
        {
            maxTravelDistance_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                    zserioContext.getMaxTravelDistance().read(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();
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

        endBitPosition = path_.initializeOffsets(endBitPosition);
        endBitPosition += 1;
        if (isMaxTravelDistanceUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(maxTravelDistance_);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = path_.initializeOffsets(zserioContext.getPath(), endBitPosition);
        endBitPosition += 1;
        if (isMaxTravelDistanceUsed())
        {
            endBitPosition += zserioContext.getMaxTravelDistance().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(maxTravelDistance_));
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        path_.write(out);

        if (isMaxTravelDistanceUsed())
        {
            out.writeBool(true);
            out.writeVarUInt32(maxTravelDistance_);
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
        path_.write(zserioContext.getPath(), out);

        if (isMaxTravelDistanceUsed())
        {
            out.writeBool(true);
            zserioContext.getMaxTravelDistance().write(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.IntArrayElement(maxTravelDistance_));
        }
        else
        {
            out.writeBool(false);
        }
    }

    private nds.core.location.RoadLocationPath path_;
    private java.lang.Integer maxTravelDistance_;
}
