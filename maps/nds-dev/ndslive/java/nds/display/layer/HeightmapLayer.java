/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.layer;

public class HeightmapLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            heightmaps_ = new nds.display.instantiations.HeightMapGridLayer.ZserioPackingContext();
        }

        public nds.display.instantiations.HeightMapGridLayer.ZserioPackingContext getHeightmaps()
        {
            return heightmaps_;
        }

        private nds.display.instantiations.HeightMapGridLayer.ZserioPackingContext heightmaps_;
    };

    public HeightmapLayer()
    {
    }

    public HeightmapLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public HeightmapLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public HeightmapLayer(
            boolean hasIds_,
            boolean completeTile_,
            nds.display.instantiations.HeightMapGridLayer heightmaps_)
    {
        setHasIds(hasIds_);
        setCompleteTile(completeTile_);
        setHeightmaps(heightmaps_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        heightmaps_.initPackingContext(zserioContext.getHeightmaps());
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

        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += heightmaps_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition += heightmaps_.bitSizeOf(zserioContext.getHeightmaps(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public boolean getHasIds()
    {
        return hasIds_;
    }

    public void setHasIds(boolean hasIds_)
    {
        this.hasIds_ = hasIds_;
    }

    public boolean getCompleteTile()
    {
        return completeTile_;
    }

    public void setCompleteTile(boolean completeTile_)
    {
        this.completeTile_ = completeTile_;
    }

    public nds.display.instantiations.HeightMapGridLayer getHeightmaps()
    {
        return heightmaps_;
    }

    public void setHeightmaps(nds.display.instantiations.HeightMapGridLayer heightmaps_)
    {
        this.heightmaps_ = heightmaps_;
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.FEATURE);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof HeightmapLayer)
        {
            final HeightmapLayer that = (HeightmapLayer)obj;

            return
                    hasIds_ == that.hasIds_ &&
                    completeTile_ == that.completeTile_ &&
                    ((heightmaps_ == null) ? that.heightmaps_ == null : heightmaps_.equals(that.heightmaps_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, hasIds_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, completeTile_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, heightmaps_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        hasIds_ = in.readBool();

        completeTile_ = in.readBool();

        heightmaps_ = new nds.display.instantiations.HeightMapGridLayer(in, (boolean)(getHasIds()), (boolean)(false));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        hasIds_ = in.readBool();

        completeTile_ = in.readBool();

        heightmaps_ = new nds.display.instantiations.HeightMapGridLayer(zserioContext.getHeightmaps(), in, (boolean)(getHasIds()), (boolean)(false));
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

        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition = heightmaps_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        endBitPosition += 1;
        endBitPosition = heightmaps_.initializeOffsets(zserioContext.getHeightmaps(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBool(hasIds_);

        out.writeBool(completeTile_);

        // check parameters
        if (heightmaps_.getHasIds() != (boolean)(getHasIds()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter hasIds for field HeightmapLayer.heightmaps: " +
                    heightmaps_.getHasIds() + " != " + (boolean)(getHasIds()) + "!");
        }
        if (heightmaps_.getHasTypes() != (boolean)(false))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter hasTypes for field HeightmapLayer.heightmaps: " +
                    heightmaps_.getHasTypes() + " != " + (boolean)(false) + "!");
        }
        heightmaps_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        out.writeBool(hasIds_);

        out.writeBool(completeTile_);

        heightmaps_.write(zserioContext.getHeightmaps(), out);
    }

    private boolean hasIds_;
    private boolean completeTile_;
    private nds.display.instantiations.HeightMapGridLayer heightmaps_;
}
