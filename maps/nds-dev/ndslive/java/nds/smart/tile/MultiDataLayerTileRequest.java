/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.tile;

public class MultiDataLayerTileRequest implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            id_ = new nds.core.types.TileId.ZserioPackingContext();
            numDataLayers_ = new zserio.runtime.array.DeltaContext();
        }

        public nds.core.types.TileId.ZserioPackingContext getId()
        {
            return id_;
        }

        public zserio.runtime.array.DeltaContext getNumDataLayers()
        {
            return numDataLayers_;
        }

        private nds.core.types.TileId.ZserioPackingContext id_;
        private zserio.runtime.array.DeltaContext numDataLayers_;
    };

    public MultiDataLayerTileRequest()
    {
    }

    public MultiDataLayerTileRequest(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public MultiDataLayerTileRequest(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public MultiDataLayerTileRequest(
            nds.core.types.TileId id_,
            short numDataLayers_,
            short[] layerIds_,
            nds.smart.types.DataLayerLifetime[] lifetimeInfo_)
    {
        setId(id_);
        setNumDataLayers(numDataLayers_);
        setLayerIds(layerIds_);
        setLifetimeInfo(lifetimeInfo_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        id_.initPackingContext(zserioContext.getId());
        zserioContext.getNumDataLayers().init(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numDataLayers_));
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

        endBitPosition += id_.bitSizeOf(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(numDataLayers_);
        endBitPosition += layerIds_.bitSizeOf(endBitPosition);
        endBitPosition += lifetimeInfo_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += id_.bitSizeOf(zserioContext.getId(), endBitPosition);
        endBitPosition += zserioContext.getNumDataLayers().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numDataLayers_));
        endBitPosition += layerIds_.bitSizeOfPacked(endBitPosition);
        endBitPosition += lifetimeInfo_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.types.TileId getId()
    {
        return id_;
    }

    public void setId(nds.core.types.TileId id_)
    {
        this.id_ = id_;
    }

    public short getNumDataLayers()
    {
        return numDataLayers_;
    }

    public void setNumDataLayers(short numDataLayers_)
    {
        this.numDataLayers_ = numDataLayers_;
    }

    public short[] getLayerIds()
    {
        return (layerIds_ == null) ? null : layerIds_.getRawArray();
    }

    public void setLayerIds(short[] layerIds_)
    {
        this.layerIds_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ShortRawArray(layerIds_),
                new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public nds.smart.types.DataLayerLifetime[] getLifetimeInfo()
    {
        return (lifetimeInfo_ == null) ? null : lifetimeInfo_.getRawArray();
    }

    public void setLifetimeInfo(nds.smart.types.DataLayerLifetime[] lifetimeInfo_)
    {
        this.lifetimeInfo_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.types.DataLayerLifetime.class, lifetimeInfo_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.types.DataLayerLifetime>(new ZserioElementFactory_lifetimeInfo()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof MultiDataLayerTileRequest)
        {
            final MultiDataLayerTileRequest that = (MultiDataLayerTileRequest)obj;

            return
                    ((id_ == null) ? that.id_ == null : id_.equals(that.id_)) &&
                    numDataLayers_ == that.numDataLayers_ &&
                    ((layerIds_ == null) ? that.layerIds_ == null : layerIds_.equals(that.layerIds_)) &&
                    ((lifetimeInfo_ == null) ? that.lifetimeInfo_ == null : lifetimeInfo_.equals(that.lifetimeInfo_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, id_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numDataLayers_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, layerIds_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, lifetimeInfo_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        id_ = new nds.core.types.TileId(in);

        numDataLayers_ = in.readVarUInt16();

        layerIds_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ShortRawArray(),
                new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
        layerIds_.read(in, (int)(getNumDataLayers()));

        lifetimeInfo_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.types.DataLayerLifetime.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.types.DataLayerLifetime>(new ZserioElementFactory_lifetimeInfo()),
                zserio.runtime.array.ArrayType.NORMAL);
        lifetimeInfo_.read(in, (int)(getNumDataLayers()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        id_ = new nds.core.types.TileId(zserioContext.getId(), in);

        numDataLayers_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getNumDataLayers().read(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();

        layerIds_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ShortRawArray(),
                new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
        layerIds_.readPacked(in, (int)(getNumDataLayers()));

        lifetimeInfo_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.types.DataLayerLifetime.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.types.DataLayerLifetime>(new ZserioElementFactory_lifetimeInfo()),
                zserio.runtime.array.ArrayType.NORMAL);
        lifetimeInfo_.readPacked(in, (int)(getNumDataLayers()));
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

        endBitPosition = id_.initializeOffsets(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(numDataLayers_);
        endBitPosition = layerIds_.initializeOffsets(endBitPosition);
        endBitPosition = lifetimeInfo_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = id_.initializeOffsets(zserioContext.getId(), endBitPosition);
        endBitPosition += zserioContext.getNumDataLayers().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numDataLayers_));
        endBitPosition = layerIds_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = lifetimeInfo_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        id_.write(out);

        out.writeVarUInt16(numDataLayers_);

        if (layerIds_.size() != (int)(getNumDataLayers()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field MultiDataLayerTileRequest.layerIds: " +
                    layerIds_.size() + " != " + (int)(getNumDataLayers()) + "!");
        }
        layerIds_.write(out);

        if (lifetimeInfo_.size() != (int)(getNumDataLayers()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field MultiDataLayerTileRequest.lifetimeInfo: " +
                    lifetimeInfo_.size() + " != " + (int)(getNumDataLayers()) + "!");
        }
        lifetimeInfo_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        id_.write(zserioContext.getId(), out);

        zserioContext.getNumDataLayers().write(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numDataLayers_));

        if (layerIds_.size() != (int)(getNumDataLayers()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field MultiDataLayerTileRequest.layerIds: " +
                    layerIds_.size() + " != " + (int)(getNumDataLayers()) + "!");
        }
        layerIds_.writePacked(out);

        if (lifetimeInfo_.size() != (int)(getNumDataLayers()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field MultiDataLayerTileRequest.lifetimeInfo: " +
                    lifetimeInfo_.size() + " != " + (int)(getNumDataLayers()) + "!");
        }
        lifetimeInfo_.writePacked(out);
    }

    private static final class ZserioElementFactory_lifetimeInfo implements zserio.runtime.array.PackableElementFactory<nds.smart.types.DataLayerLifetime>
    {
        @Override
        public nds.smart.types.DataLayerLifetime create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.smart.types.DataLayerLifetime(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.smart.types.DataLayerLifetime.ZserioPackingContext();
        }

        @Override
        public nds.smart.types.DataLayerLifetime create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.smart.types.DataLayerLifetime(context, in);
        }
    }

    private nds.core.types.TileId id_;
    private short numDataLayers_;
    private zserio.runtime.array.Array layerIds_;
    private zserio.runtime.array.Array lifetimeInfo_;
}