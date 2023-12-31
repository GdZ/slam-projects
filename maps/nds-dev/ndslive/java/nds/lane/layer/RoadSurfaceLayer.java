/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.layer;

public class RoadSurfaceLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            roadSurfacePolygonLayer_ = new nds.lane.instantiations.RoadSurfacePolygonGeometryLayer.ZserioPackingContext();
            roadSurfaceLinesLayer_ = new nds.lane.instantiations.RoadSurfaceLineGeometryLayer.ZserioPackingContext();
        }

        public nds.lane.instantiations.RoadSurfacePolygonGeometryLayer.ZserioPackingContext getRoadSurfacePolygonLayer()
        {
            return roadSurfacePolygonLayer_;
        }

        public nds.lane.instantiations.RoadSurfaceLineGeometryLayer.ZserioPackingContext getRoadSurfaceLinesLayer()
        {
            return roadSurfaceLinesLayer_;
        }

        private nds.lane.instantiations.RoadSurfacePolygonGeometryLayer.ZserioPackingContext roadSurfacePolygonLayer_;
        private nds.lane.instantiations.RoadSurfaceLineGeometryLayer.ZserioPackingContext roadSurfaceLinesLayer_;
    };

    public RoadSurfaceLayer()
    {
    }

    public RoadSurfaceLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoadSurfaceLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoadSurfaceLayer(
            nds.lane.instantiations.RoadSurfacePolygonGeometryLayer roadSurfacePolygonLayer_,
            nds.lane.instantiations.RoadSurfaceLineGeometryLayer roadSurfaceLinesLayer_,
            nds.lane.roadsurface.RoadSurfaceLaneGroupRelation[] lanegroupRelations_)
    {
        setRoadSurfacePolygonLayer(roadSurfacePolygonLayer_);
        setRoadSurfaceLinesLayer(roadSurfaceLinesLayer_);
        setLanegroupRelations(lanegroupRelations_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        roadSurfacePolygonLayer_.initPackingContext(zserioContext.getRoadSurfacePolygonLayer());
        roadSurfaceLinesLayer_.initPackingContext(zserioContext.getRoadSurfaceLinesLayer());
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

        endBitPosition += roadSurfacePolygonLayer_.bitSizeOf(endBitPosition);
        endBitPosition += roadSurfaceLinesLayer_.bitSizeOf(endBitPosition);
        endBitPosition += lanegroupRelations_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += roadSurfacePolygonLayer_.bitSizeOf(zserioContext.getRoadSurfacePolygonLayer(), endBitPosition);
        endBitPosition += roadSurfaceLinesLayer_.bitSizeOf(zserioContext.getRoadSurfaceLinesLayer(), endBitPosition);
        endBitPosition += lanegroupRelations_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.lane.instantiations.RoadSurfacePolygonGeometryLayer getRoadSurfacePolygonLayer()
    {
        return roadSurfacePolygonLayer_;
    }

    public void setRoadSurfacePolygonLayer(nds.lane.instantiations.RoadSurfacePolygonGeometryLayer roadSurfacePolygonLayer_)
    {
        this.roadSurfacePolygonLayer_ = roadSurfacePolygonLayer_;
    }

    public nds.lane.instantiations.RoadSurfaceLineGeometryLayer getRoadSurfaceLinesLayer()
    {
        return roadSurfaceLinesLayer_;
    }

    public void setRoadSurfaceLinesLayer(nds.lane.instantiations.RoadSurfaceLineGeometryLayer roadSurfaceLinesLayer_)
    {
        this.roadSurfaceLinesLayer_ = roadSurfaceLinesLayer_;
    }

    public nds.lane.roadsurface.RoadSurfaceLaneGroupRelation[] getLanegroupRelations()
    {
        return (lanegroupRelations_ == null) ? null : lanegroupRelations_.getRawArray();
    }

    public void setLanegroupRelations(nds.lane.roadsurface.RoadSurfaceLaneGroupRelation[] lanegroupRelations_)
    {
        this.lanegroupRelations_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.roadsurface.RoadSurfaceLaneGroupRelation.class, lanegroupRelations_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.roadsurface.RoadSurfaceLaneGroupRelation>(new ZserioElementFactory_lanegroupRelations()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.GEOMETRY);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoadSurfaceLayer)
        {
            final RoadSurfaceLayer that = (RoadSurfaceLayer)obj;

            return
                    ((roadSurfacePolygonLayer_ == null) ? that.roadSurfacePolygonLayer_ == null : roadSurfacePolygonLayer_.equals(that.roadSurfacePolygonLayer_)) &&
                    ((roadSurfaceLinesLayer_ == null) ? that.roadSurfaceLinesLayer_ == null : roadSurfaceLinesLayer_.equals(that.roadSurfaceLinesLayer_)) &&
                    ((lanegroupRelations_ == null) ? that.lanegroupRelations_ == null : lanegroupRelations_.equals(that.lanegroupRelations_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadSurfacePolygonLayer_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadSurfaceLinesLayer_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, lanegroupRelations_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        roadSurfacePolygonLayer_ = new nds.lane.instantiations.RoadSurfacePolygonGeometryLayer(in, nds.core.geometry.GeometryLayerType.MESH_3D, (boolean)(true), (boolean)(true));

        roadSurfaceLinesLayer_ = new nds.lane.instantiations.RoadSurfaceLineGeometryLayer(in, nds.core.geometry.GeometryLayerType.LINE_3D, (boolean)(true), (boolean)(true));

        lanegroupRelations_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.roadsurface.RoadSurfaceLaneGroupRelation.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.roadsurface.RoadSurfaceLaneGroupRelation>(new ZserioElementFactory_lanegroupRelations()),
                zserio.runtime.array.ArrayType.AUTO);
        lanegroupRelations_.readPacked(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        roadSurfacePolygonLayer_ = new nds.lane.instantiations.RoadSurfacePolygonGeometryLayer(zserioContext.getRoadSurfacePolygonLayer(), in, nds.core.geometry.GeometryLayerType.MESH_3D, (boolean)(true), (boolean)(true));

        roadSurfaceLinesLayer_ = new nds.lane.instantiations.RoadSurfaceLineGeometryLayer(zserioContext.getRoadSurfaceLinesLayer(), in, nds.core.geometry.GeometryLayerType.LINE_3D, (boolean)(true), (boolean)(true));

        lanegroupRelations_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.roadsurface.RoadSurfaceLaneGroupRelation.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.roadsurface.RoadSurfaceLaneGroupRelation>(new ZserioElementFactory_lanegroupRelations()),
                zserio.runtime.array.ArrayType.AUTO);
        lanegroupRelations_.readPacked(in);
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

        endBitPosition = roadSurfacePolygonLayer_.initializeOffsets(endBitPosition);
        endBitPosition = roadSurfaceLinesLayer_.initializeOffsets(endBitPosition);
        endBitPosition = lanegroupRelations_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = roadSurfacePolygonLayer_.initializeOffsets(zserioContext.getRoadSurfacePolygonLayer(), endBitPosition);
        endBitPosition = roadSurfaceLinesLayer_.initializeOffsets(zserioContext.getRoadSurfaceLinesLayer(), endBitPosition);
        endBitPosition = lanegroupRelations_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        // check parameters
        if (roadSurfacePolygonLayer_.getType() != (nds.core.geometry.GeometryLayerType.MESH_3D))
        {
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter type for field RoadSurfaceLayer.roadSurfacePolygonLayer!");
        }
        if (roadSurfacePolygonLayer_.getHasIds() != (boolean)(true))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter hasIds for field RoadSurfaceLayer.roadSurfacePolygonLayer: " +
                    roadSurfacePolygonLayer_.getHasIds() + " != " + (boolean)(true) + "!");
        }
        if (roadSurfacePolygonLayer_.getHasTypes() != (boolean)(true))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter hasTypes for field RoadSurfaceLayer.roadSurfacePolygonLayer: " +
                    roadSurfacePolygonLayer_.getHasTypes() + " != " + (boolean)(true) + "!");
        }
        roadSurfacePolygonLayer_.write(out);

        // check parameters
        if (roadSurfaceLinesLayer_.getType() != (nds.core.geometry.GeometryLayerType.LINE_3D))
        {
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter type for field RoadSurfaceLayer.roadSurfaceLinesLayer!");
        }
        if (roadSurfaceLinesLayer_.getHasIds() != (boolean)(true))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter hasIds for field RoadSurfaceLayer.roadSurfaceLinesLayer: " +
                    roadSurfaceLinesLayer_.getHasIds() + " != " + (boolean)(true) + "!");
        }
        if (roadSurfaceLinesLayer_.getHasTypes() != (boolean)(true))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter hasTypes for field RoadSurfaceLayer.roadSurfaceLinesLayer: " +
                    roadSurfaceLinesLayer_.getHasTypes() + " != " + (boolean)(true) + "!");
        }
        roadSurfaceLinesLayer_.write(out);

        lanegroupRelations_.writePacked(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        roadSurfacePolygonLayer_.write(zserioContext.getRoadSurfacePolygonLayer(), out);

        roadSurfaceLinesLayer_.write(zserioContext.getRoadSurfaceLinesLayer(), out);

        lanegroupRelations_.writePacked(out);
    }

    private static final class ZserioElementFactory_lanegroupRelations implements zserio.runtime.array.PackableElementFactory<nds.lane.roadsurface.RoadSurfaceLaneGroupRelation>
    {
        @Override
        public nds.lane.roadsurface.RoadSurfaceLaneGroupRelation create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.lane.roadsurface.RoadSurfaceLaneGroupRelation(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.lane.roadsurface.RoadSurfaceLaneGroupRelation.ZserioPackingContext();
        }

        @Override
        public nds.lane.roadsurface.RoadSurfaceLaneGroupRelation create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.lane.roadsurface.RoadSurfaceLaneGroupRelation(context, in);
        }
    }

    private nds.lane.instantiations.RoadSurfacePolygonGeometryLayer roadSurfacePolygonLayer_;
    private nds.lane.instantiations.RoadSurfaceLineGeometryLayer roadSurfaceLinesLayer_;
    private zserio.runtime.array.Array lanegroupRelations_;
}
