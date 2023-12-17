/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.layer;

public class LaneGeometryLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            centerLineGeometryLayer_ = new nds.lane.instantiations.CenterLineGeometryLayer.ZserioPackingContext();
            boundaryGeometryLayer_ = new nds.lane.instantiations.BoundaryGeometryLayer.ZserioPackingContext();
        }

        public nds.lane.instantiations.CenterLineGeometryLayer.ZserioPackingContext getCenterLineGeometryLayer()
        {
            return centerLineGeometryLayer_;
        }

        public nds.lane.instantiations.BoundaryGeometryLayer.ZserioPackingContext getBoundaryGeometryLayer()
        {
            return boundaryGeometryLayer_;
        }

        private nds.lane.instantiations.CenterLineGeometryLayer.ZserioPackingContext centerLineGeometryLayer_;
        private nds.lane.instantiations.BoundaryGeometryLayer.ZserioPackingContext boundaryGeometryLayer_;
    };

    public LaneGeometryLayer()
    {
    }

    public LaneGeometryLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public LaneGeometryLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public LaneGeometryLayer(
            nds.lane.instantiations.CenterLineGeometryLayer centerLineGeometryLayer_,
            nds.lane.instantiations.BoundaryGeometryLayer boundaryGeometryLayer_)
    {
        setCenterLineGeometryLayer(centerLineGeometryLayer_);
        setBoundaryGeometryLayer(boundaryGeometryLayer_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        centerLineGeometryLayer_.initPackingContext(zserioContext.getCenterLineGeometryLayer());
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

        endBitPosition += centerLineGeometryLayer_.bitSizeOf(endBitPosition);
        endBitPosition += boundaryGeometryLayer_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += centerLineGeometryLayer_.bitSizeOf(zserioContext.getCenterLineGeometryLayer(), endBitPosition);
        endBitPosition += boundaryGeometryLayer_.bitSizeOf(zserioContext.getBoundaryGeometryLayer(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.lane.instantiations.CenterLineGeometryLayer getCenterLineGeometryLayer()
    {
        return centerLineGeometryLayer_;
    }

    public void setCenterLineGeometryLayer(nds.lane.instantiations.CenterLineGeometryLayer centerLineGeometryLayer_)
    {
        this.centerLineGeometryLayer_ = centerLineGeometryLayer_;
    }

    public nds.lane.instantiations.BoundaryGeometryLayer getBoundaryGeometryLayer()
    {
        return boundaryGeometryLayer_;
    }

    public void setBoundaryGeometryLayer(nds.lane.instantiations.BoundaryGeometryLayer boundaryGeometryLayer_)
    {
        this.boundaryGeometryLayer_ = boundaryGeometryLayer_;
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.GEOMETRY);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LaneGeometryLayer)
        {
            final LaneGeometryLayer that = (LaneGeometryLayer)obj;

            return
                    ((centerLineGeometryLayer_ == null) ? that.centerLineGeometryLayer_ == null : centerLineGeometryLayer_.equals(that.centerLineGeometryLayer_)) &&
                    ((boundaryGeometryLayer_ == null) ? that.boundaryGeometryLayer_ == null : boundaryGeometryLayer_.equals(that.boundaryGeometryLayer_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, centerLineGeometryLayer_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, boundaryGeometryLayer_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        centerLineGeometryLayer_ = new nds.lane.instantiations.CenterLineGeometryLayer(in, nds.core.geometry.GeometryLayerType.LINE_3D, (boolean)(true), (boolean)(false));

        boundaryGeometryLayer_ = new nds.lane.instantiations.BoundaryGeometryLayer(in, nds.core.geometry.GeometryLayerType.LINE_3D, (boolean)(true), (boolean)(false));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        centerLineGeometryLayer_ = new nds.lane.instantiations.CenterLineGeometryLayer(zserioContext.getCenterLineGeometryLayer(), in, nds.core.geometry.GeometryLayerType.LINE_3D, (boolean)(true), (boolean)(false));

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

        endBitPosition = centerLineGeometryLayer_.initializeOffsets(endBitPosition);
        endBitPosition = boundaryGeometryLayer_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = centerLineGeometryLayer_.initializeOffsets(zserioContext.getCenterLineGeometryLayer(), endBitPosition);
        endBitPosition = boundaryGeometryLayer_.initializeOffsets(zserioContext.getBoundaryGeometryLayer(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        // check parameters
        if (centerLineGeometryLayer_.getType() != (nds.core.geometry.GeometryLayerType.LINE_3D))
        {
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter type for field LaneGeometryLayer.centerLineGeometryLayer!");
        }
        if (centerLineGeometryLayer_.getHasIds() != (boolean)(true))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter hasIds for field LaneGeometryLayer.centerLineGeometryLayer: " +
                    centerLineGeometryLayer_.getHasIds() + " != " + (boolean)(true) + "!");
        }
        if (centerLineGeometryLayer_.getHasTypes() != (boolean)(false))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter hasTypes for field LaneGeometryLayer.centerLineGeometryLayer: " +
                    centerLineGeometryLayer_.getHasTypes() + " != " + (boolean)(false) + "!");
        }
        centerLineGeometryLayer_.write(out);

        // check parameters
        if (boundaryGeometryLayer_.getType() != (nds.core.geometry.GeometryLayerType.LINE_3D))
        {
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter type for field LaneGeometryLayer.boundaryGeometryLayer!");
        }
        if (boundaryGeometryLayer_.getHasIds() != (boolean)(true))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter hasIds for field LaneGeometryLayer.boundaryGeometryLayer: " +
                    boundaryGeometryLayer_.getHasIds() + " != " + (boolean)(true) + "!");
        }
        if (boundaryGeometryLayer_.getHasTypes() != (boolean)(false))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter hasTypes for field LaneGeometryLayer.boundaryGeometryLayer: " +
                    boundaryGeometryLayer_.getHasTypes() + " != " + (boolean)(false) + "!");
        }
        boundaryGeometryLayer_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        centerLineGeometryLayer_.write(zserioContext.getCenterLineGeometryLayer(), out);

        boundaryGeometryLayer_.write(zserioContext.getBoundaryGeometryLayer(), out);
    }

    private nds.lane.instantiations.CenterLineGeometryLayer centerLineGeometryLayer_;
    private nds.lane.instantiations.BoundaryGeometryLayer boundaryGeometryLayer_;
}
