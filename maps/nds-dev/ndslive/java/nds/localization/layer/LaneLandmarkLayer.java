/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.localization.layer;

public class LaneLandmarkLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            laneAttributeMaps_ = new nds.localization.instantiations.LandmarkLaneAttributeMapList.ZserioPackingContext();
        }

        public nds.localization.instantiations.LandmarkLaneAttributeMapList.ZserioPackingContext getLaneAttributeMaps()
        {
            return laneAttributeMaps_;
        }

        private nds.localization.instantiations.LandmarkLaneAttributeMapList.ZserioPackingContext laneAttributeMaps_;
    };

    public LaneLandmarkLayer()
    {
    }

    public LaneLandmarkLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public LaneLandmarkLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public LaneLandmarkLayer(
            nds.localization.instantiations.LandmarkLaneAttributeMapList laneAttributeMaps_)
    {
        setLaneAttributeMaps(laneAttributeMaps_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        laneAttributeMaps_.initPackingContext(zserioContext.getLaneAttributeMaps());
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

        endBitPosition += laneAttributeMaps_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += laneAttributeMaps_.bitSizeOf(zserioContext.getLaneAttributeMaps(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.localization.instantiations.LandmarkLaneAttributeMapList getLaneAttributeMaps()
    {
        return laneAttributeMaps_;
    }

    public void setLaneAttributeMaps(nds.localization.instantiations.LandmarkLaneAttributeMapList laneAttributeMaps_)
    {
        this.laneAttributeMaps_ = laneAttributeMaps_;
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.RELATION);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LaneLandmarkLayer)
        {
            final LaneLandmarkLayer that = (LaneLandmarkLayer)obj;

            return
                    ((laneAttributeMaps_ == null) ? that.laneAttributeMaps_ == null : laneAttributeMaps_.equals(that.laneAttributeMaps_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, laneAttributeMaps_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        laneAttributeMaps_ = new nds.localization.instantiations.LandmarkLaneAttributeMapList(in, (byte)(0));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        laneAttributeMaps_ = new nds.localization.instantiations.LandmarkLaneAttributeMapList(zserioContext.getLaneAttributeMaps(), in, (byte)(0));
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

        endBitPosition = laneAttributeMaps_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = laneAttributeMaps_.initializeOffsets(zserioContext.getLaneAttributeMaps(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        // check parameters
        if (laneAttributeMaps_.getCoordShift() != (byte)(0))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field LaneLandmarkLayer.laneAttributeMaps: " +
                    laneAttributeMaps_.getCoordShift() + " != " + (byte)(0) + "!");
        }
        laneAttributeMaps_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        laneAttributeMaps_.write(zserioContext.getLaneAttributeMaps(), out);
    }

    private nds.localization.instantiations.LandmarkLaneAttributeMapList laneAttributeMaps_;
}
