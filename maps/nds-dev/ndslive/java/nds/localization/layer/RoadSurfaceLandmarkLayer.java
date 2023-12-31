/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.localization.layer;

public class RoadSurfaceLandmarkLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            roadSurfaceAttributeMaps_ = new nds.localization.instantiations.LandmarkRoadSurfaceAttributeMapList.ZserioPackingContext();
        }

        public nds.localization.instantiations.LandmarkRoadSurfaceAttributeMapList.ZserioPackingContext getRoadSurfaceAttributeMaps()
        {
            return roadSurfaceAttributeMaps_;
        }

        private nds.localization.instantiations.LandmarkRoadSurfaceAttributeMapList.ZserioPackingContext roadSurfaceAttributeMaps_;
    };

    public RoadSurfaceLandmarkLayer()
    {
    }

    public RoadSurfaceLandmarkLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoadSurfaceLandmarkLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoadSurfaceLandmarkLayer(
            nds.localization.instantiations.LandmarkRoadSurfaceAttributeMapList roadSurfaceAttributeMaps_)
    {
        setRoadSurfaceAttributeMaps(roadSurfaceAttributeMaps_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        roadSurfaceAttributeMaps_.initPackingContext(zserioContext.getRoadSurfaceAttributeMaps());
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

        endBitPosition += roadSurfaceAttributeMaps_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += roadSurfaceAttributeMaps_.bitSizeOf(zserioContext.getRoadSurfaceAttributeMaps(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.localization.instantiations.LandmarkRoadSurfaceAttributeMapList getRoadSurfaceAttributeMaps()
    {
        return roadSurfaceAttributeMaps_;
    }

    public void setRoadSurfaceAttributeMaps(nds.localization.instantiations.LandmarkRoadSurfaceAttributeMapList roadSurfaceAttributeMaps_)
    {
        this.roadSurfaceAttributeMaps_ = roadSurfaceAttributeMaps_;
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.RELATION);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoadSurfaceLandmarkLayer)
        {
            final RoadSurfaceLandmarkLayer that = (RoadSurfaceLandmarkLayer)obj;

            return
                    ((roadSurfaceAttributeMaps_ == null) ? that.roadSurfaceAttributeMaps_ == null : roadSurfaceAttributeMaps_.equals(that.roadSurfaceAttributeMaps_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadSurfaceAttributeMaps_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        roadSurfaceAttributeMaps_ = new nds.localization.instantiations.LandmarkRoadSurfaceAttributeMapList(in, (byte)(0));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        roadSurfaceAttributeMaps_ = new nds.localization.instantiations.LandmarkRoadSurfaceAttributeMapList(zserioContext.getRoadSurfaceAttributeMaps(), in, (byte)(0));
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

        endBitPosition = roadSurfaceAttributeMaps_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = roadSurfaceAttributeMaps_.initializeOffsets(zserioContext.getRoadSurfaceAttributeMaps(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        // check parameters
        if (roadSurfaceAttributeMaps_.getCoordShift() != (byte)(0))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadSurfaceLandmarkLayer.roadSurfaceAttributeMaps: " +
                    roadSurfaceAttributeMaps_.getCoordShift() + " != " + (byte)(0) + "!");
        }
        roadSurfaceAttributeMaps_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        roadSurfaceAttributeMaps_.write(zserioContext.getRoadSurfaceAttributeMaps(), out);
    }

    private nds.localization.instantiations.LandmarkRoadSurfaceAttributeMapList roadSurfaceAttributeMaps_;
}
