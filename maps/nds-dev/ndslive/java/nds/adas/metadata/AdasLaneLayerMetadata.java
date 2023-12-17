/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.adas.metadata;

public class AdasLaneLayerMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            laneAttributeMetadata_ = new nds.adas.instantiations.AdasLaneAttributeMetadata.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public nds.adas.instantiations.AdasLaneAttributeMetadata.ZserioPackingContext getLaneAttributeMetadata()
        {
            return laneAttributeMetadata_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private nds.adas.instantiations.AdasLaneAttributeMetadata.ZserioPackingContext laneAttributeMetadata_;
    };

    public AdasLaneLayerMetadata()
    {
    }

    public AdasLaneLayerMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public AdasLaneLayerMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public AdasLaneLayerMetadata(
            nds.adas.metadata.AdasLaneLayerContent content_,
            nds.adas.instantiations.AdasLaneAttributeMetadata laneAttributeMetadata_,
            nds.core.types.LaneType[] coveredLaneTypes_)
    {
        setContent(content_);
        setLaneAttributeMetadata(laneAttributeMetadata_);
        setCoveredLaneTypes(coveredLaneTypes_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        laneAttributeMetadata_.initPackingContext(zserioContext.getLaneAttributeMetadata());
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

        endBitPosition += content_.bitSizeOf(endBitPosition);
        endBitPosition += laneAttributeMetadata_.bitSizeOf(endBitPosition);
        endBitPosition += coveredLaneTypes_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        endBitPosition += laneAttributeMetadata_.bitSizeOf(zserioContext.getLaneAttributeMetadata(), endBitPosition);
        endBitPosition += coveredLaneTypes_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.adas.metadata.AdasLaneLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.adas.metadata.AdasLaneLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.adas.instantiations.AdasLaneAttributeMetadata getLaneAttributeMetadata()
    {
        return laneAttributeMetadata_;
    }

    public void setLaneAttributeMetadata(nds.adas.instantiations.AdasLaneAttributeMetadata laneAttributeMetadata_)
    {
        this.laneAttributeMetadata_ = laneAttributeMetadata_;
    }

    public nds.core.types.LaneType[] getCoveredLaneTypes()
    {
        return (coveredLaneTypes_ == null) ? null : coveredLaneTypes_.getRawArray();
    }

    public void setCoveredLaneTypes(nds.core.types.LaneType[] coveredLaneTypes_)
    {
        this.coveredLaneTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.LaneType.class, coveredLaneTypes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.LaneType>(new ZserioElementFactory_coveredLaneTypes()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof AdasLaneLayerMetadata)
        {
            final AdasLaneLayerMetadata that = (AdasLaneLayerMetadata)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((laneAttributeMetadata_ == null) ? that.laneAttributeMetadata_ == null : laneAttributeMetadata_.equals(that.laneAttributeMetadata_)) &&
                    ((coveredLaneTypes_ == null) ? that.coveredLaneTypes_ == null : coveredLaneTypes_.equals(that.coveredLaneTypes_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, laneAttributeMetadata_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, coveredLaneTypes_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.adas.metadata.AdasLaneLayerContent(in);

        laneAttributeMetadata_ = new nds.adas.instantiations.AdasLaneAttributeMetadata(in);

        coveredLaneTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.LaneType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.LaneType>(new ZserioElementFactory_coveredLaneTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        coveredLaneTypes_.read(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.adas.metadata.AdasLaneLayerContent(zserioContext.getContent(), in);

        laneAttributeMetadata_ = new nds.adas.instantiations.AdasLaneAttributeMetadata(zserioContext.getLaneAttributeMetadata(), in);

        coveredLaneTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.LaneType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.LaneType>(new ZserioElementFactory_coveredLaneTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        coveredLaneTypes_.readPacked(in);
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

        endBitPosition += content_.bitSizeOf(endBitPosition);
        endBitPosition = laneAttributeMetadata_.initializeOffsets(endBitPosition);
        endBitPosition = coveredLaneTypes_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        endBitPosition = laneAttributeMetadata_.initializeOffsets(zserioContext.getLaneAttributeMetadata(), endBitPosition);
        endBitPosition = coveredLaneTypes_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        laneAttributeMetadata_.write(out);

        coveredLaneTypes_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(zserioContext.getContent(), out);

        laneAttributeMetadata_.write(zserioContext.getLaneAttributeMetadata(), out);

        coveredLaneTypes_.writePacked(out);
    }

    private static final class ZserioElementFactory_coveredLaneTypes implements zserio.runtime.array.PackableElementFactory<nds.core.types.LaneType>
    {
        @Override
        public nds.core.types.LaneType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.types.LaneType(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.types.LaneType.ZserioPackingContext();
        }

        @Override
        public nds.core.types.LaneType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.types.LaneType(context, in);
        }
    }

    private nds.adas.metadata.AdasLaneLayerContent content_;
    private nds.adas.instantiations.AdasLaneAttributeMetadata laneAttributeMetadata_;
    private zserio.runtime.array.Array coveredLaneTypes_;
}
