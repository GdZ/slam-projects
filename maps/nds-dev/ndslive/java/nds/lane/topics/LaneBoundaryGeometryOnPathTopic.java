/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.topics;

public class LaneBoundaryGeometryOnPathTopic implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            stamp_ = new nds.core.types.TimeStamp.ZserioPackingContext();
            pathId_ = new zserio.runtime.array.DeltaContext();
            boundaryDefinitions_ = new nds.lane.boundaries.BoundaryElementDefinitions.ZserioPackingContext();
            boundaryGeometryLayer_ = new nds.lane.instantiations.BoundaryGeometryLayer.ZserioPackingContext();
        }

        public nds.core.types.TimeStamp.ZserioPackingContext getStamp()
        {
            return stamp_;
        }

        public zserio.runtime.array.DeltaContext getPathId()
        {
            return pathId_;
        }

        public nds.lane.boundaries.BoundaryElementDefinitions.ZserioPackingContext getBoundaryDefinitions()
        {
            return boundaryDefinitions_;
        }

        public nds.lane.instantiations.BoundaryGeometryLayer.ZserioPackingContext getBoundaryGeometryLayer()
        {
            return boundaryGeometryLayer_;
        }

        private nds.core.types.TimeStamp.ZserioPackingContext stamp_;
        private zserio.runtime.array.DeltaContext pathId_;
        private nds.lane.boundaries.BoundaryElementDefinitions.ZserioPackingContext boundaryDefinitions_;
        private nds.lane.instantiations.BoundaryGeometryLayer.ZserioPackingContext boundaryGeometryLayer_;
    };

    public LaneBoundaryGeometryOnPathTopic()
    {
    }

    public LaneBoundaryGeometryOnPathTopic(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public LaneBoundaryGeometryOnPathTopic(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public LaneBoundaryGeometryOnPathTopic(
            nds.core.types.TimeStamp stamp_,
            int pathId_,
            nds.lane.boundaries.BoundaryElementDefinitions boundaryDefinitions_,
            nds.lane.instantiations.BoundaryGeometryLayer boundaryGeometryLayer_)
    {
        setStamp(stamp_);
        setPathId(pathId_);
        setBoundaryDefinitions(boundaryDefinitions_);
        setBoundaryGeometryLayer(boundaryGeometryLayer_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        stamp_.initPackingContext(zserioContext.getStamp());
        zserioContext.getPathId().init(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(pathId_));
        boundaryDefinitions_.initPackingContext(zserioContext.getBoundaryDefinitions());
        boundaryGeometryLayer_.initPackingContext(zserioContext.getBoundaryGeometryLayer());
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

        endBitPosition += stamp_.bitSizeOf(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(pathId_);
        endBitPosition += boundaryDefinitions_.bitSizeOf(endBitPosition);
        endBitPosition += boundaryGeometryLayer_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += stamp_.bitSizeOf(zserioContext.getStamp(), endBitPosition);
        endBitPosition += zserioContext.getPathId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(pathId_));
        endBitPosition += boundaryDefinitions_.bitSizeOf(zserioContext.getBoundaryDefinitions(), endBitPosition);
        endBitPosition += boundaryGeometryLayer_.bitSizeOf(zserioContext.getBoundaryGeometryLayer(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.types.TimeStamp getStamp()
    {
        return stamp_;
    }

    public void setStamp(nds.core.types.TimeStamp stamp_)
    {
        this.stamp_ = stamp_;
    }

    public int getPathId()
    {
        return pathId_;
    }

    public void setPathId(int pathId_)
    {
        this.pathId_ = pathId_;
    }

    public nds.lane.boundaries.BoundaryElementDefinitions getBoundaryDefinitions()
    {
        return boundaryDefinitions_;
    }

    public void setBoundaryDefinitions(nds.lane.boundaries.BoundaryElementDefinitions boundaryDefinitions_)
    {
        this.boundaryDefinitions_ = boundaryDefinitions_;
    }

    public nds.lane.instantiations.BoundaryGeometryLayer getBoundaryGeometryLayer()
    {
        return boundaryGeometryLayer_;
    }

    public void setBoundaryGeometryLayer(nds.lane.instantiations.BoundaryGeometryLayer boundaryGeometryLayer_)
    {
        this.boundaryGeometryLayer_ = boundaryGeometryLayer_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LaneBoundaryGeometryOnPathTopic)
        {
            final LaneBoundaryGeometryOnPathTopic that = (LaneBoundaryGeometryOnPathTopic)obj;

            return
                    ((stamp_ == null) ? that.stamp_ == null : stamp_.equals(that.stamp_)) &&
                    pathId_ == that.pathId_ &&
                    ((boundaryDefinitions_ == null) ? that.boundaryDefinitions_ == null : boundaryDefinitions_.equals(that.boundaryDefinitions_)) &&
                    ((boundaryGeometryLayer_ == null) ? that.boundaryGeometryLayer_ == null : boundaryGeometryLayer_.equals(that.boundaryGeometryLayer_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, stamp_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, pathId_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, boundaryDefinitions_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, boundaryGeometryLayer_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        stamp_ = new nds.core.types.TimeStamp(in);

        pathId_ = in.readVarUInt32();

        boundaryDefinitions_ = new nds.lane.boundaries.BoundaryElementDefinitions(in);

        boundaryGeometryLayer_ = new nds.lane.instantiations.BoundaryGeometryLayer(in, nds.core.geometry.GeometryLayerType.LINE_3D, (boolean)(true), (boolean)(false));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        stamp_ = new nds.core.types.TimeStamp(zserioContext.getStamp(), in);

        pathId_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getPathId().read(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();

        boundaryDefinitions_ = new nds.lane.boundaries.BoundaryElementDefinitions(zserioContext.getBoundaryDefinitions(), in);

        boundaryGeometryLayer_ = new nds.lane.instantiations.BoundaryGeometryLayer(zserioContext.getBoundaryGeometryLayer(), in, nds.core.geometry.GeometryLayerType.LINE_3D, (boolean)(true), (boolean)(false));
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

        endBitPosition = stamp_.initializeOffsets(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(pathId_);
        endBitPosition = boundaryDefinitions_.initializeOffsets(endBitPosition);
        endBitPosition = boundaryGeometryLayer_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = stamp_.initializeOffsets(zserioContext.getStamp(), endBitPosition);
        endBitPosition += zserioContext.getPathId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(pathId_));
        endBitPosition = boundaryDefinitions_.initializeOffsets(zserioContext.getBoundaryDefinitions(), endBitPosition);
        endBitPosition = boundaryGeometryLayer_.initializeOffsets(zserioContext.getBoundaryGeometryLayer(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        stamp_.write(out);

        out.writeVarUInt32(pathId_);

        boundaryDefinitions_.write(out);

        // check parameters
        if (boundaryGeometryLayer_.getType() != (nds.core.geometry.GeometryLayerType.LINE_3D))
        {
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter type for field LaneBoundaryGeometryOnPathTopic.boundaryGeometryLayer!");
        }
        if (boundaryGeometryLayer_.getHasIds() != (boolean)(true))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter hasIds for field LaneBoundaryGeometryOnPathTopic.boundaryGeometryLayer: " +
                    boundaryGeometryLayer_.getHasIds() + " != " + (boolean)(true) + "!");
        }
        if (boundaryGeometryLayer_.getHasTypes() != (boolean)(false))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter hasTypes for field LaneBoundaryGeometryOnPathTopic.boundaryGeometryLayer: " +
                    boundaryGeometryLayer_.getHasTypes() + " != " + (boolean)(false) + "!");
        }
        boundaryGeometryLayer_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        stamp_.write(zserioContext.getStamp(), out);

        zserioContext.getPathId().write(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(pathId_));

        boundaryDefinitions_.write(zserioContext.getBoundaryDefinitions(), out);

        boundaryGeometryLayer_.write(zserioContext.getBoundaryGeometryLayer(), out);
    }

    private nds.core.types.TimeStamp stamp_;
    private int pathId_;
    private nds.lane.boundaries.BoundaryElementDefinitions boundaryDefinitions_;
    private nds.lane.instantiations.BoundaryGeometryLayer boundaryGeometryLayer_;
}
