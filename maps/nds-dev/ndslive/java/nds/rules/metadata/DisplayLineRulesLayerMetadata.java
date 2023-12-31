/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.metadata;

public class DisplayLineRulesLayerMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            displayLineRangeAttributeMetadata_ = new nds.rules.instantiations.RulesDisplayLineRangeAttributeMetadata.ZserioPackingContext();
            displayLinePositionAttributeMetadata_ = new nds.rules.instantiations.RulesDisplayLinePositionAttributeMetadata.ZserioPackingContext();
            availableLanguages_ = new nds.core.language.AvailableLanguages.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public nds.rules.instantiations.RulesDisplayLineRangeAttributeMetadata.ZserioPackingContext getDisplayLineRangeAttributeMetadata()
        {
            return displayLineRangeAttributeMetadata_;
        }

        public nds.rules.instantiations.RulesDisplayLinePositionAttributeMetadata.ZserioPackingContext getDisplayLinePositionAttributeMetadata()
        {
            return displayLinePositionAttributeMetadata_;
        }

        public nds.core.language.AvailableLanguages.ZserioPackingContext getAvailableLanguages()
        {
            return availableLanguages_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private nds.rules.instantiations.RulesDisplayLineRangeAttributeMetadata.ZserioPackingContext displayLineRangeAttributeMetadata_;
        private nds.rules.instantiations.RulesDisplayLinePositionAttributeMetadata.ZserioPackingContext displayLinePositionAttributeMetadata_;
        private nds.core.language.AvailableLanguages.ZserioPackingContext availableLanguages_;
    };

    public DisplayLineRulesLayerMetadata()
    {
    }

    public DisplayLineRulesLayerMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public DisplayLineRulesLayerMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public DisplayLineRulesLayerMetadata(
            nds.rules.metadata.DisplayLineRulesLayerContent content_,
            nds.rules.instantiations.RulesDisplayLineRangeAttributeMetadata displayLineRangeAttributeMetadata_,
            nds.rules.instantiations.RulesDisplayLinePositionAttributeMetadata displayLinePositionAttributeMetadata_,
            nds.core.types.RoadType[] coveredRoadTypes_,
            nds.core.language.AvailableLanguages availableLanguages_)
    {
        setContent(content_);
        setDisplayLineRangeAttributeMetadata(displayLineRangeAttributeMetadata_);
        setDisplayLinePositionAttributeMetadata(displayLinePositionAttributeMetadata_);
        setCoveredRoadTypes(coveredRoadTypes_);
        setAvailableLanguages(availableLanguages_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        if (isDisplayLineRangeAttributeMetadataUsed())
        {
            displayLineRangeAttributeMetadata_.initPackingContext(zserioContext.getDisplayLineRangeAttributeMetadata());
        }
        if (isDisplayLinePositionAttributeMetadataUsed())
        {
            displayLinePositionAttributeMetadata_.initPackingContext(zserioContext.getDisplayLinePositionAttributeMetadata());
        }
        if (isAvailableLanguagesUsed())
        {
            availableLanguages_.initPackingContext(zserioContext.getAvailableLanguages());
        }
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
        if (isDisplayLineRangeAttributeMetadataUsed())
        {
            endBitPosition += displayLineRangeAttributeMetadata_.bitSizeOf(endBitPosition);
        }
        if (isDisplayLinePositionAttributeMetadataUsed())
        {
            endBitPosition += displayLinePositionAttributeMetadata_.bitSizeOf(endBitPosition);
        }
        endBitPosition += coveredRoadTypes_.bitSizeOf(endBitPosition);
        if (isAvailableLanguagesUsed())
        {
            endBitPosition += availableLanguages_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        if (isDisplayLineRangeAttributeMetadataUsed())
        {
            endBitPosition += displayLineRangeAttributeMetadata_.bitSizeOf(zserioContext.getDisplayLineRangeAttributeMetadata(), endBitPosition);
        }
        if (isDisplayLinePositionAttributeMetadataUsed())
        {
            endBitPosition += displayLinePositionAttributeMetadata_.bitSizeOf(zserioContext.getDisplayLinePositionAttributeMetadata(), endBitPosition);
        }
        endBitPosition += coveredRoadTypes_.bitSizeOfPacked(endBitPosition);
        if (isAvailableLanguagesUsed())
        {
            endBitPosition += availableLanguages_.bitSizeOf(zserioContext.getAvailableLanguages(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.rules.metadata.DisplayLineRulesLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.rules.metadata.DisplayLineRulesLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.rules.instantiations.RulesDisplayLineRangeAttributeMetadata getDisplayLineRangeAttributeMetadata()
    {
        return displayLineRangeAttributeMetadata_;
    }

    public void setDisplayLineRangeAttributeMetadata(nds.rules.instantiations.RulesDisplayLineRangeAttributeMetadata displayLineRangeAttributeMetadata_)
    {
        this.displayLineRangeAttributeMetadata_ = displayLineRangeAttributeMetadata_;
    }

    public boolean isDisplayLineRangeAttributeMetadataUsed()
    {
        return ((getContent().and(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_RANGE_MAPS)).equals(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_RANGE_MAPS) || (getContent().and(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_RANGE_SETS)).equals(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_RANGE_SETS));
    }

    public boolean isDisplayLineRangeAttributeMetadataSet()
    {
        return (displayLineRangeAttributeMetadata_ != null);
    }

    public void resetDisplayLineRangeAttributeMetadata()
    {
        this.displayLineRangeAttributeMetadata_ = null;
    }

    public nds.rules.instantiations.RulesDisplayLinePositionAttributeMetadata getDisplayLinePositionAttributeMetadata()
    {
        return displayLinePositionAttributeMetadata_;
    }

    public void setDisplayLinePositionAttributeMetadata(nds.rules.instantiations.RulesDisplayLinePositionAttributeMetadata displayLinePositionAttributeMetadata_)
    {
        this.displayLinePositionAttributeMetadata_ = displayLinePositionAttributeMetadata_;
    }

    public boolean isDisplayLinePositionAttributeMetadataUsed()
    {
        return ((getContent().and(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_POSITION_MAPS)).equals(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_POSITION_MAPS) || (getContent().and(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_POSITION_SETS)).equals(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_POSITION_SETS));
    }

    public boolean isDisplayLinePositionAttributeMetadataSet()
    {
        return (displayLinePositionAttributeMetadata_ != null);
    }

    public void resetDisplayLinePositionAttributeMetadata()
    {
        this.displayLinePositionAttributeMetadata_ = null;
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

    public boolean isAvailableLanguagesUsed()
    {
        return ((getContent().and(nds.rules.metadata.DisplayLineRulesLayerContent.Values.LANGUAGES)).equals(nds.rules.metadata.DisplayLineRulesLayerContent.Values.LANGUAGES));
    }

    public boolean isAvailableLanguagesSet()
    {
        return (availableLanguages_ != null);
    }

    public void resetAvailableLanguages()
    {
        this.availableLanguages_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof DisplayLineRulesLayerMetadata)
        {
            final DisplayLineRulesLayerMetadata that = (DisplayLineRulesLayerMetadata)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((!isDisplayLineRangeAttributeMetadataUsed()) ? !that.isDisplayLineRangeAttributeMetadataUsed() :
                        ((displayLineRangeAttributeMetadata_ == null) ? that.displayLineRangeAttributeMetadata_ == null : displayLineRangeAttributeMetadata_.equals(that.displayLineRangeAttributeMetadata_))) &&
                    ((!isDisplayLinePositionAttributeMetadataUsed()) ? !that.isDisplayLinePositionAttributeMetadataUsed() :
                        ((displayLinePositionAttributeMetadata_ == null) ? that.displayLinePositionAttributeMetadata_ == null : displayLinePositionAttributeMetadata_.equals(that.displayLinePositionAttributeMetadata_))) &&
                    ((coveredRoadTypes_ == null) ? that.coveredRoadTypes_ == null : coveredRoadTypes_.equals(that.coveredRoadTypes_)) &&
                    ((!isAvailableLanguagesUsed()) ? !that.isAvailableLanguagesUsed() :
                        ((availableLanguages_ == null) ? that.availableLanguages_ == null : availableLanguages_.equals(that.availableLanguages_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        if (isDisplayLineRangeAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, displayLineRangeAttributeMetadata_);
        if (isDisplayLinePositionAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, displayLinePositionAttributeMetadata_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, coveredRoadTypes_);
        if (isAvailableLanguagesUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, availableLanguages_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.rules.metadata.DisplayLineRulesLayerContent(in);

        if ((getContent().and(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_RANGE_MAPS)).equals(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_RANGE_MAPS) || (getContent().and(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_RANGE_SETS)).equals(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_RANGE_SETS))
        {
            displayLineRangeAttributeMetadata_ = new nds.rules.instantiations.RulesDisplayLineRangeAttributeMetadata(in);
        }

        if ((getContent().and(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_POSITION_MAPS)).equals(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_POSITION_MAPS) || (getContent().and(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_POSITION_SETS)).equals(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_POSITION_SETS))
        {
            displayLinePositionAttributeMetadata_ = new nds.rules.instantiations.RulesDisplayLinePositionAttributeMetadata(in);
        }

        coveredRoadTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.RoadType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.RoadType>(new ZserioElementFactory_coveredRoadTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        coveredRoadTypes_.read(in);

        if ((getContent().and(nds.rules.metadata.DisplayLineRulesLayerContent.Values.LANGUAGES)).equals(nds.rules.metadata.DisplayLineRulesLayerContent.Values.LANGUAGES))
        {
            availableLanguages_ = new nds.core.language.AvailableLanguages(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.rules.metadata.DisplayLineRulesLayerContent(zserioContext.getContent(), in);

        if ((getContent().and(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_RANGE_MAPS)).equals(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_RANGE_MAPS) || (getContent().and(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_RANGE_SETS)).equals(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_RANGE_SETS))
        {
            displayLineRangeAttributeMetadata_ = new nds.rules.instantiations.RulesDisplayLineRangeAttributeMetadata(zserioContext.getDisplayLineRangeAttributeMetadata(), in);
        }

        if ((getContent().and(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_POSITION_MAPS)).equals(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_POSITION_MAPS) || (getContent().and(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_POSITION_SETS)).equals(nds.rules.metadata.DisplayLineRulesLayerContent.Values.DISPLAY_LINE_POSITION_SETS))
        {
            displayLinePositionAttributeMetadata_ = new nds.rules.instantiations.RulesDisplayLinePositionAttributeMetadata(zserioContext.getDisplayLinePositionAttributeMetadata(), in);
        }

        coveredRoadTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.RoadType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.RoadType>(new ZserioElementFactory_coveredRoadTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        coveredRoadTypes_.readPacked(in);

        if ((getContent().and(nds.rules.metadata.DisplayLineRulesLayerContent.Values.LANGUAGES)).equals(nds.rules.metadata.DisplayLineRulesLayerContent.Values.LANGUAGES))
        {
            availableLanguages_ = new nds.core.language.AvailableLanguages(zserioContext.getAvailableLanguages(), in);
        }
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
        if (isDisplayLineRangeAttributeMetadataUsed())
        {
            endBitPosition = displayLineRangeAttributeMetadata_.initializeOffsets(endBitPosition);
        }
        if (isDisplayLinePositionAttributeMetadataUsed())
        {
            endBitPosition = displayLinePositionAttributeMetadata_.initializeOffsets(endBitPosition);
        }
        endBitPosition = coveredRoadTypes_.initializeOffsets(endBitPosition);
        if (isAvailableLanguagesUsed())
        {
            endBitPosition = availableLanguages_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        if (isDisplayLineRangeAttributeMetadataUsed())
        {
            endBitPosition = displayLineRangeAttributeMetadata_.initializeOffsets(zserioContext.getDisplayLineRangeAttributeMetadata(), endBitPosition);
        }
        if (isDisplayLinePositionAttributeMetadataUsed())
        {
            endBitPosition = displayLinePositionAttributeMetadata_.initializeOffsets(zserioContext.getDisplayLinePositionAttributeMetadata(), endBitPosition);
        }
        endBitPosition = coveredRoadTypes_.initializeOffsetsPacked(endBitPosition);
        if (isAvailableLanguagesUsed())
        {
            endBitPosition = availableLanguages_.initializeOffsets(zserioContext.getAvailableLanguages(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        if (isDisplayLineRangeAttributeMetadataUsed())
        {
            displayLineRangeAttributeMetadata_.write(out);
        }

        if (isDisplayLinePositionAttributeMetadataUsed())
        {
            displayLinePositionAttributeMetadata_.write(out);
        }

        coveredRoadTypes_.write(out);

        if (isAvailableLanguagesUsed())
        {
            availableLanguages_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(zserioContext.getContent(), out);

        if (isDisplayLineRangeAttributeMetadataUsed())
        {
            displayLineRangeAttributeMetadata_.write(zserioContext.getDisplayLineRangeAttributeMetadata(), out);
        }

        if (isDisplayLinePositionAttributeMetadataUsed())
        {
            displayLinePositionAttributeMetadata_.write(zserioContext.getDisplayLinePositionAttributeMetadata(), out);
        }

        coveredRoadTypes_.writePacked(out);

        if (isAvailableLanguagesUsed())
        {
            availableLanguages_.write(zserioContext.getAvailableLanguages(), out);
        }
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

    private nds.rules.metadata.DisplayLineRulesLayerContent content_;
    private nds.rules.instantiations.RulesDisplayLineRangeAttributeMetadata displayLineRangeAttributeMetadata_;
    private nds.rules.instantiations.RulesDisplayLinePositionAttributeMetadata displayLinePositionAttributeMetadata_;
    private zserio.runtime.array.Array coveredRoadTypes_;
    private nds.core.language.AvailableLanguages availableLanguages_;
}
