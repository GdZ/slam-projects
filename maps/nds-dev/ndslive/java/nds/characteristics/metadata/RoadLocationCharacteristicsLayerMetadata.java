/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.characteristics.metadata;

public class RoadLocationCharacteristicsLayerMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            roadLocationAttributeMetadata_ = new nds.characteristics.instantiations.CharacsRoadRangeAttributeMetadata.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public nds.characteristics.instantiations.CharacsRoadRangeAttributeMetadata.ZserioPackingContext getRoadLocationAttributeMetadata()
        {
            return roadLocationAttributeMetadata_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private nds.characteristics.instantiations.CharacsRoadRangeAttributeMetadata.ZserioPackingContext roadLocationAttributeMetadata_;
    };

    public RoadLocationCharacteristicsLayerMetadata()
    {
    }

    public RoadLocationCharacteristicsLayerMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoadLocationCharacteristicsLayerMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoadLocationCharacteristicsLayerMetadata(
            nds.characteristics.metadata.RoadLocationCharacsLayerContent content_,
            nds.characteristics.instantiations.CharacsRoadRangeAttributeMetadata roadLocationAttributeMetadata_,
            nds.core.types.RoadType[] coveredRoadTypes_)
    {
        setContent(content_);
        setRoadLocationAttributeMetadata(roadLocationAttributeMetadata_);
        setCoveredRoadTypes(coveredRoadTypes_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        roadLocationAttributeMetadata_.initPackingContext(zserioContext.getRoadLocationAttributeMetadata());
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
        endBitPosition += roadLocationAttributeMetadata_.bitSizeOf(endBitPosition);
        endBitPosition += coveredRoadTypes_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        endBitPosition += roadLocationAttributeMetadata_.bitSizeOf(zserioContext.getRoadLocationAttributeMetadata(), endBitPosition);
        endBitPosition += coveredRoadTypes_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.characteristics.metadata.RoadLocationCharacsLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.characteristics.metadata.RoadLocationCharacsLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.characteristics.instantiations.CharacsRoadRangeAttributeMetadata getRoadLocationAttributeMetadata()
    {
        return roadLocationAttributeMetadata_;
    }

    public void setRoadLocationAttributeMetadata(nds.characteristics.instantiations.CharacsRoadRangeAttributeMetadata roadLocationAttributeMetadata_)
    {
        this.roadLocationAttributeMetadata_ = roadLocationAttributeMetadata_;
    }

    public nds.core.types.RoadType[] getCoveredRoadTypes()
    {
        return (coveredRoadTypes_ == null) ? null : coveredRoadTypes_.getRawArray();
    }

    public void setCoveredRoadTypes(nds.core.types.RoadType[] coveredRoadTypes_)
    {
        this.coveredRoadTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.RoadType.class, coveredRoadTypes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.RoadType>(new ZserioElementFactory_coveredRoadTypes()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoadLocationCharacteristicsLayerMetadata)
        {
            final RoadLocationCharacteristicsLayerMetadata that = (RoadLocationCharacteristicsLayerMetadata)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((roadLocationAttributeMetadata_ == null) ? that.roadLocationAttributeMetadata_ == null : roadLocationAttributeMetadata_.equals(that.roadLocationAttributeMetadata_)) &&
                    ((coveredRoadTypes_ == null) ? that.coveredRoadTypes_ == null : coveredRoadTypes_.equals(that.coveredRoadTypes_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadLocationAttributeMetadata_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, coveredRoadTypes_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.characteristics.metadata.RoadLocationCharacsLayerContent(in);

        roadLocationAttributeMetadata_ = new nds.characteristics.instantiations.CharacsRoadRangeAttributeMetadata(in);

        coveredRoadTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.RoadType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.RoadType>(new ZserioElementFactory_coveredRoadTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        coveredRoadTypes_.read(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.characteristics.metadata.RoadLocationCharacsLayerContent(zserioContext.getContent(), in);

        roadLocationAttributeMetadata_ = new nds.characteristics.instantiations.CharacsRoadRangeAttributeMetadata(zserioContext.getRoadLocationAttributeMetadata(), in);

        coveredRoadTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.RoadType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.RoadType>(new ZserioElementFactory_coveredRoadTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        coveredRoadTypes_.readPacked(in);
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
        endBitPosition = roadLocationAttributeMetadata_.initializeOffsets(endBitPosition);
        endBitPosition = coveredRoadTypes_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        endBitPosition = roadLocationAttributeMetadata_.initializeOffsets(zserioContext.getRoadLocationAttributeMetadata(), endBitPosition);
        endBitPosition = coveredRoadTypes_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        roadLocationAttributeMetadata_.write(out);

        coveredRoadTypes_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(zserioContext.getContent(), out);

        roadLocationAttributeMetadata_.write(zserioContext.getRoadLocationAttributeMetadata(), out);

        coveredRoadTypes_.writePacked(out);
    }

    private static final class ZserioElementFactory_coveredRoadTypes implements zserio.runtime.array.PackableElementFactory<nds.core.types.RoadType>
    {
        @Override
        public nds.core.types.RoadType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.types.RoadType(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.types.RoadType.ZserioPackingContext();
        }

        @Override
        public nds.core.types.RoadType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.types.RoadType(context, in);
        }
    }

    private nds.characteristics.metadata.RoadLocationCharacsLayerContent content_;
    private nds.characteristics.instantiations.CharacsRoadRangeAttributeMetadata roadLocationAttributeMetadata_;
    private zserio.runtime.array.Array coveredRoadTypes_;
}
