/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.tile;

public class MultiDataLayerMultiTileRequest implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            numTiles_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getNumTiles()
        {
            return numTiles_;
        }

        private zserio.runtime.array.DeltaContext numTiles_;
    };

    public MultiDataLayerMultiTileRequest()
    {
    }

    public MultiDataLayerMultiTileRequest(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public MultiDataLayerMultiTileRequest(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public MultiDataLayerMultiTileRequest(
            int numTiles_,
            nds.smart.tile.MultiDataLayerTileRequest[] tileVersionRequests_)
    {
        setNumTiles(numTiles_);
        setTileVersionRequests(tileVersionRequests_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumTiles().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numTiles_));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numTiles_);
        endBitPosition += tileVersionRequests_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumTiles().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numTiles_));
        endBitPosition += tileVersionRequests_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public int getNumTiles()
    {
        return numTiles_;
    }

    public void setNumTiles(int numTiles_)
    {
        this.numTiles_ = numTiles_;
    }

    public nds.smart.tile.MultiDataLayerTileRequest[] getTileVersionRequests()
    {
        return (tileVersionRequests_ == null) ? null : tileVersionRequests_.getRawArray();
    }

    public void setTileVersionRequests(nds.smart.tile.MultiDataLayerTileRequest[] tileVersionRequests_)
    {
        this.tileVersionRequests_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.tile.MultiDataLayerTileRequest.class, tileVersionRequests_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.tile.MultiDataLayerTileRequest>(new ZserioElementFactory_tileVersionRequests()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof MultiDataLayerMultiTileRequest)
        {
            final MultiDataLayerMultiTileRequest that = (MultiDataLayerMultiTileRequest)obj;

            return
                    numTiles_ == that.numTiles_ &&
                    ((tileVersionRequests_ == null) ? that.tileVersionRequests_ == null : tileVersionRequests_.equals(that.tileVersionRequests_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numTiles_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, tileVersionRequests_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        numTiles_ = in.readVarSize();

        tileVersionRequests_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.tile.MultiDataLayerTileRequest.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.tile.MultiDataLayerTileRequest>(new ZserioElementFactory_tileVersionRequests()),
                zserio.runtime.array.ArrayType.NORMAL);
        tileVersionRequests_.read(in, (int)(getNumTiles()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        numTiles_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getNumTiles().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        tileVersionRequests_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.tile.MultiDataLayerTileRequest.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.tile.MultiDataLayerTileRequest>(new ZserioElementFactory_tileVersionRequests()),
                zserio.runtime.array.ArrayType.NORMAL);
        tileVersionRequests_.readPacked(in, (int)(getNumTiles()));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numTiles_);
        endBitPosition = tileVersionRequests_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumTiles().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numTiles_));
        endBitPosition = tileVersionRequests_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarSize(numTiles_);

        if (tileVersionRequests_.size() != (int)(getNumTiles()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field MultiDataLayerMultiTileRequest.tileVersionRequests: " +
                    tileVersionRequests_.size() + " != " + (int)(getNumTiles()) + "!");
        }
        tileVersionRequests_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumTiles().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(numTiles_));

        if (tileVersionRequests_.size() != (int)(getNumTiles()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field MultiDataLayerMultiTileRequest.tileVersionRequests: " +
                    tileVersionRequests_.size() + " != " + (int)(getNumTiles()) + "!");
        }
        tileVersionRequests_.writePacked(out);
    }

    private static final class ZserioElementFactory_tileVersionRequests implements zserio.runtime.array.PackableElementFactory<nds.smart.tile.MultiDataLayerTileRequest>
    {
        @Override
        public nds.smart.tile.MultiDataLayerTileRequest create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.smart.tile.MultiDataLayerTileRequest(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.smart.tile.MultiDataLayerTileRequest.ZserioPackingContext();
        }

        @Override
        public nds.smart.tile.MultiDataLayerTileRequest create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.smart.tile.MultiDataLayerTileRequest(context, in);
        }
    }

    private int numTiles_;
    private zserio.runtime.array.Array tileVersionRequests_;
}
