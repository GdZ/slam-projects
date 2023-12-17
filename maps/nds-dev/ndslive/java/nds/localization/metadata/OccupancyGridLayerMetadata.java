/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.localization.metadata;

public class OccupancyGridLayerMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            cellSize_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getCellSize()
        {
            return cellSize_;
        }

        private zserio.runtime.array.DeltaContext cellSize_;
    };

    public OccupancyGridLayerMetadata()
    {
    }

    public OccupancyGridLayerMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public OccupancyGridLayerMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public OccupancyGridLayerMetadata(
            int cellSize_,
            boolean hasRelations_)
    {
        setCellSize(cellSize_);
        setHasRelations(hasRelations_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getCellSize().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(cellSize_));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(cellSize_);
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getCellSize().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(cellSize_));
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    public int getCellSize()
    {
        return cellSize_;
    }

    public void setCellSize(int cellSize_)
    {
        this.cellSize_ = cellSize_;
    }

    public boolean getHasRelations()
    {
        return hasRelations_;
    }

    public void setHasRelations(boolean hasRelations_)
    {
        this.hasRelations_ = hasRelations_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof OccupancyGridLayerMetadata)
        {
            final OccupancyGridLayerMetadata that = (OccupancyGridLayerMetadata)obj;

            return
                    cellSize_ == that.cellSize_ &&
                    hasRelations_ == that.hasRelations_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, cellSize_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, hasRelations_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        cellSize_ = in.readVarSize();

        hasRelations_ = in.readBool();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        cellSize_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getCellSize().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        hasRelations_ = in.readBool();
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(cellSize_);
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getCellSize().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(cellSize_));
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarSize(cellSize_);

        out.writeBool(hasRelations_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getCellSize().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(cellSize_));

        out.writeBool(hasRelations_);
    }

    private int cellSize_;
    private boolean hasRelations_;
}