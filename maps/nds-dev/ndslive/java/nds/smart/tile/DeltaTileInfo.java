/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.tile;

public class DeltaTileInfo implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            tileId_ = new nds.core.types.TileId.ZserioPackingContext();
            sourceLayerInfo_ = new nds.smart.tile.SourceLayerInfo.ZserioPackingContext();
        }

        public nds.core.types.TileId.ZserioPackingContext getTileId()
        {
            return tileId_;
        }

        public nds.smart.tile.SourceLayerInfo.ZserioPackingContext getSourceLayerInfo()
        {
            return sourceLayerInfo_;
        }

        private nds.core.types.TileId.ZserioPackingContext tileId_;
        private nds.smart.tile.SourceLayerInfo.ZserioPackingContext sourceLayerInfo_;
    };

    public DeltaTileInfo()
    {
    }

    public DeltaTileInfo(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public DeltaTileInfo(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public DeltaTileInfo(
            nds.core.types.TileId tileId_,
            nds.smart.tile.SourceLayerInfo sourceLayerInfo_)
    {
        setTileId(tileId_);
        setSourceLayerInfo(sourceLayerInfo_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        tileId_.initPackingContext(zserioContext.getTileId());
        sourceLayerInfo_.initPackingContext(zserioContext.getSourceLayerInfo());
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

        endBitPosition += tileId_.bitSizeOf(endBitPosition);
        endBitPosition += sourceLayerInfo_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += tileId_.bitSizeOf(zserioContext.getTileId(), endBitPosition);
        endBitPosition += sourceLayerInfo_.bitSizeOf(zserioContext.getSourceLayerInfo(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.types.TileId getTileId()
    {
        return tileId_;
    }

    public void setTileId(nds.core.types.TileId tileId_)
    {
        this.tileId_ = tileId_;
    }

    public nds.smart.tile.SourceLayerInfo getSourceLayerInfo()
    {
        return sourceLayerInfo_;
    }

    public void setSourceLayerInfo(nds.smart.tile.SourceLayerInfo sourceLayerInfo_)
    {
        this.sourceLayerInfo_ = sourceLayerInfo_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof DeltaTileInfo)
        {
            final DeltaTileInfo that = (DeltaTileInfo)obj;

            return
                    ((tileId_ == null) ? that.tileId_ == null : tileId_.equals(that.tileId_)) &&
                    ((sourceLayerInfo_ == null) ? that.sourceLayerInfo_ == null : sourceLayerInfo_.equals(that.sourceLayerInfo_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, tileId_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, sourceLayerInfo_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        tileId_ = new nds.core.types.TileId(in);

        sourceLayerInfo_ = new nds.smart.tile.SourceLayerInfo(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        tileId_ = new nds.core.types.TileId(zserioContext.getTileId(), in);

        sourceLayerInfo_ = new nds.smart.tile.SourceLayerInfo(zserioContext.getSourceLayerInfo(), in);
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

        endBitPosition = tileId_.initializeOffsets(endBitPosition);
        endBitPosition = sourceLayerInfo_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = tileId_.initializeOffsets(zserioContext.getTileId(), endBitPosition);
        endBitPosition = sourceLayerInfo_.initializeOffsets(zserioContext.getSourceLayerInfo(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        tileId_.write(out);

        sourceLayerInfo_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        tileId_.write(zserioContext.getTileId(), out);

        sourceLayerInfo_.write(zserioContext.getSourceLayerInfo(), out);
    }

    private nds.core.types.TileId tileId_;
    private nds.smart.tile.SourceLayerInfo sourceLayerInfo_;
}
