/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.metadata;

public class RegionRulesLayerMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            regionAttributeMetadata_ = new nds.rules.instantiations.RulesRegionAttributeMetadata.ZserioPackingContext();
            availableLanguages_ = new nds.core.language.AvailableLanguages.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public nds.rules.instantiations.RulesRegionAttributeMetadata.ZserioPackingContext getRegionAttributeMetadata()
        {
            return regionAttributeMetadata_;
        }

        public nds.core.language.AvailableLanguages.ZserioPackingContext getAvailableLanguages()
        {
            return availableLanguages_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private nds.rules.instantiations.RulesRegionAttributeMetadata.ZserioPackingContext regionAttributeMetadata_;
        private nds.core.language.AvailableLanguages.ZserioPackingContext availableLanguages_;
    };

    public RegionRulesLayerMetadata()
    {
    }

    public RegionRulesLayerMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RegionRulesLayerMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RegionRulesLayerMetadata(
            nds.rules.metadata.RegionRulesLayerContent content_,
            nds.rules.instantiations.RulesRegionAttributeMetadata regionAttributeMetadata_,
            nds.core.types.RoadType[] coveredRoadTypes_,
            nds.core.language.AvailableLanguages availableLanguages_)
    {
        setContent(content_);
        setRegionAttributeMetadata(regionAttributeMetadata_);
        setCoveredRoadTypes(coveredRoadTypes_);
        setAvailableLanguages(availableLanguages_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        if (isRegionAttributeMetadataUsed())
        {
            regionAttributeMetadata_.initPackingContext(zserioContext.getRegionAttributeMetadata());
        }
        availableLanguages_.initPackingContext(zserioContext.getAvailableLanguages());
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
        if (isRegionAttributeMetadataUsed())
        {
            endBitPosition += regionAttributeMetadata_.bitSizeOf(endBitPosition);
        }
        endBitPosition += coveredRoadTypes_.bitSizeOf(endBitPosition);
        endBitPosition += availableLanguages_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        if (isRegionAttributeMetadataUsed())
        {
            endBitPosition += regionAttributeMetadata_.bitSizeOf(zserioContext.getRegionAttributeMetadata(), endBitPosition);
        }
        endBitPosition += coveredRoadTypes_.bitSizeOfPacked(endBitPosition);
        endBitPosition += availableLanguages_.bitSizeOf(zserioContext.getAvailableLanguages(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.rules.metadata.RegionRulesLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.rules.metadata.RegionRulesLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.rules.instantiations.RulesRegionAttributeMetadata getRegionAttributeMetadata()
    {
        return regionAttributeMetadata_;
    }

    public void setRegionAttributeMetadata(nds.rules.instantiations.RulesRegionAttributeMetadata regionAttributeMetadata_)
    {
        this.regionAttributeMetadata_ = regionAttributeMetadata_;
    }

    public boolean isRegionAttributeMetadataUsed()
    {
        return ((getContent().and(nds.rules.metadata.RegionRulesLayerContent.Values.REGION_MAPS)).equals(nds.rules.metadata.RegionRulesLayerContent.Values.REGION_MAPS) || (getContent().and(nds.rules.metadata.RegionRulesLayerContent.Values.REGION_SETS)).equals(nds.rules.metadata.RegionRulesLayerContent.Values.REGION_SETS));
    }

    public boolean isRegionAttributeMetadataSet()
    {
        return (regionAttributeMetadata_ != null);
    }

    public void resetRegionAttributeMetadata()
    {
        this.regionAttributeMetadata_ = null;
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

    public nds.core.language.AvailableLanguages getAvailableLanguages()
    {
        return availableLanguages_;
    }

    public void setAvailableLanguages(nds.core.language.AvailableLanguages availableLanguages_)
    {
        this.availableLanguages_ = availableLanguages_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RegionRulesLayerMetadata)
        {
            final RegionRulesLayerMetadata that = (RegionRulesLayerMetadata)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((!isRegionAttributeMetadataUsed()) ? !that.isRegionAttributeMetadataUsed() :
                        ((regionAttributeMetadata_ == null) ? that.regionAttributeMetadata_ == null : regionAttributeMetadata_.equals(that.regionAttributeMetadata_))) &&
                    ((coveredRoadTypes_ == null) ? that.coveredRoadTypes_ == null : coveredRoadTypes_.equals(that.coveredRoadTypes_)) &&
                    ((availableLanguages_ == null) ? that.availableLanguages_ == null : availableLanguages_.equals(that.availableLanguages_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        if (isRegionAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, regionAttributeMetadata_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, coveredRoadTypes_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, availableLanguages_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.rules.metadata.RegionRulesLayerContent(in);

        if ((getContent().and(nds.rules.metadata.RegionRulesLayerContent.Values.REGION_MAPS)).equals(nds.rules.metadata.RegionRulesLayerContent.Values.REGION_MAPS) || (getContent().and(nds.rules.metadata.RegionRulesLayerContent.Values.REGION_SETS)).equals(nds.rules.metadata.RegionRulesLayerContent.Values.REGION_SETS))
        {
            regionAttributeMetadata_ = new nds.rules.instantiations.RulesRegionAttributeMetadata(in);
        }

        coveredRoadTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.RoadType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.RoadType>(new ZserioElementFactory_coveredRoadTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        coveredRoadTypes_.read(in);

        availableLanguages_ = new nds.core.language.AvailableLanguages(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.rules.metadata.RegionRulesLayerContent(zserioContext.getContent(), in);

        if ((getContent().and(nds.rules.metadata.RegionRulesLayerContent.Values.REGION_MAPS)).equals(nds.rules.metadata.RegionRulesLayerContent.Values.REGION_MAPS) || (getContent().and(nds.rules.metadata.RegionRulesLayerContent.Values.REGION_SETS)).equals(nds.rules.metadata.RegionRulesLayerContent.Values.REGION_SETS))
        {
            regionAttributeMetadata_ = new nds.rules.instantiations.RulesRegionAttributeMetadata(zserioContext.getRegionAttributeMetadata(), in);
        }

        coveredRoadTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.RoadType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.RoadType>(new ZserioElementFactory_coveredRoadTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        coveredRoadTypes_.readPacked(in);

        availableLanguages_ = new nds.core.language.AvailableLanguages(zserioContext.getAvailableLanguages(), in);
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
        if (isRegionAttributeMetadataUsed())
        {
            endBitPosition = regionAttributeMetadata_.initializeOffsets(endBitPosition);
        }
        endBitPosition = coveredRoadTypes_.initializeOffsets(endBitPosition);
        endBitPosition = availableLanguages_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        if (isRegionAttributeMetadataUsed())
        {
            endBitPosition = regionAttributeMetadata_.initializeOffsets(zserioContext.getRegionAttributeMetadata(), endBitPosition);
        }
        endBitPosition = coveredRoadTypes_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = availableLanguages_.initializeOffsets(zserioContext.getAvailableLanguages(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        if (isRegionAttributeMetadataUsed())
        {
            regionAttributeMetadata_.write(out);
        }

        coveredRoadTypes_.write(out);

        availableLanguages_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(zserioContext.getContent(), out);

        if (isRegionAttributeMetadataUsed())
        {
            regionAttributeMetadata_.write(zserioContext.getRegionAttributeMetadata(), out);
        }

        coveredRoadTypes_.writePacked(out);

        availableLanguages_.write(zserioContext.getAvailableLanguages(), out);
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

    private nds.rules.metadata.RegionRulesLayerContent content_;
    private nds.rules.instantiations.RulesRegionAttributeMetadata regionAttributeMetadata_;
    private zserio.runtime.array.Array coveredRoadTypes_;
    private nds.core.language.AvailableLanguages availableLanguages_;
}