/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.name.metadata;

public class RoadNameLayerMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            roadRangeAttributeMetadata_ = new nds.name.instantiations.NameRoadRangeAttributeMetadata.ZserioPackingContext();
            roadPositionAttributeMetadata_ = new nds.name.instantiations.NameRoadPositionAttributeMetadata.ZserioPackingContext();
            transitionAttributeMetadata_ = new nds.name.instantiations.NameTransitionAttributeMetadata.ZserioPackingContext();
            availableLanguages_ = new nds.core.language.AvailableLanguages.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public nds.name.instantiations.NameRoadRangeAttributeMetadata.ZserioPackingContext getRoadRangeAttributeMetadata()
        {
            return roadRangeAttributeMetadata_;
        }

        public nds.name.instantiations.NameRoadPositionAttributeMetadata.ZserioPackingContext getRoadPositionAttributeMetadata()
        {
            return roadPositionAttributeMetadata_;
        }

        public nds.name.instantiations.NameTransitionAttributeMetadata.ZserioPackingContext getTransitionAttributeMetadata()
        {
            return transitionAttributeMetadata_;
        }

        public nds.core.language.AvailableLanguages.ZserioPackingContext getAvailableLanguages()
        {
            return availableLanguages_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private nds.name.instantiations.NameRoadRangeAttributeMetadata.ZserioPackingContext roadRangeAttributeMetadata_;
        private nds.name.instantiations.NameRoadPositionAttributeMetadata.ZserioPackingContext roadPositionAttributeMetadata_;
        private nds.name.instantiations.NameTransitionAttributeMetadata.ZserioPackingContext transitionAttributeMetadata_;
        private nds.core.language.AvailableLanguages.ZserioPackingContext availableLanguages_;
    };

    public RoadNameLayerMetadata()
    {
    }

    public RoadNameLayerMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoadNameLayerMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoadNameLayerMetadata(
            nds.name.metadata.RoadNameLayerContent content_,
            nds.name.instantiations.NameRoadRangeAttributeMetadata roadRangeAttributeMetadata_,
            nds.name.instantiations.NameRoadPositionAttributeMetadata roadPositionAttributeMetadata_,
            nds.name.instantiations.NameTransitionAttributeMetadata transitionAttributeMetadata_,
            nds.core.language.AvailableLanguages availableLanguages_)
    {
        setContent(content_);
        setRoadRangeAttributeMetadata(roadRangeAttributeMetadata_);
        setRoadPositionAttributeMetadata(roadPositionAttributeMetadata_);
        setTransitionAttributeMetadata(transitionAttributeMetadata_);
        setAvailableLanguages(availableLanguages_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        if (isRoadRangeAttributeMetadataUsed())
        {
            roadRangeAttributeMetadata_.initPackingContext(zserioContext.getRoadRangeAttributeMetadata());
        }
        if (isRoadPositionAttributeMetadataUsed())
        {
            roadPositionAttributeMetadata_.initPackingContext(zserioContext.getRoadPositionAttributeMetadata());
        }
        if (isTransitionAttributeMetadataUsed())
        {
            transitionAttributeMetadata_.initPackingContext(zserioContext.getTransitionAttributeMetadata());
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
        if (isRoadRangeAttributeMetadataUsed())
        {
            endBitPosition += roadRangeAttributeMetadata_.bitSizeOf(endBitPosition);
        }
        if (isRoadPositionAttributeMetadataUsed())
        {
            endBitPosition += roadPositionAttributeMetadata_.bitSizeOf(endBitPosition);
        }
        if (isTransitionAttributeMetadataUsed())
        {
            endBitPosition += transitionAttributeMetadata_.bitSizeOf(endBitPosition);
        }
        endBitPosition += availableLanguages_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        if (isRoadRangeAttributeMetadataUsed())
        {
            endBitPosition += roadRangeAttributeMetadata_.bitSizeOf(zserioContext.getRoadRangeAttributeMetadata(), endBitPosition);
        }
        if (isRoadPositionAttributeMetadataUsed())
        {
            endBitPosition += roadPositionAttributeMetadata_.bitSizeOf(zserioContext.getRoadPositionAttributeMetadata(), endBitPosition);
        }
        if (isTransitionAttributeMetadataUsed())
        {
            endBitPosition += transitionAttributeMetadata_.bitSizeOf(zserioContext.getTransitionAttributeMetadata(), endBitPosition);
        }
        endBitPosition += availableLanguages_.bitSizeOf(zserioContext.getAvailableLanguages(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.name.metadata.RoadNameLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.name.metadata.RoadNameLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.name.instantiations.NameRoadRangeAttributeMetadata getRoadRangeAttributeMetadata()
    {
        return roadRangeAttributeMetadata_;
    }

    public void setRoadRangeAttributeMetadata(nds.name.instantiations.NameRoadRangeAttributeMetadata roadRangeAttributeMetadata_)
    {
        this.roadRangeAttributeMetadata_ = roadRangeAttributeMetadata_;
    }

    public boolean isRoadRangeAttributeMetadataUsed()
    {
        return ((getContent().and(nds.name.metadata.RoadNameLayerContent.Values.ROAD_RANGE_MAPS)).equals(nds.name.metadata.RoadNameLayerContent.Values.ROAD_RANGE_MAPS) || (getContent().and(nds.name.metadata.RoadNameLayerContent.Values.ROAD_RANGE_SETS)).equals(nds.name.metadata.RoadNameLayerContent.Values.ROAD_RANGE_SETS));
    }

    public boolean isRoadRangeAttributeMetadataSet()
    {
        return (roadRangeAttributeMetadata_ != null);
    }

    public void resetRoadRangeAttributeMetadata()
    {
        this.roadRangeAttributeMetadata_ = null;
    }

    public nds.name.instantiations.NameRoadPositionAttributeMetadata getRoadPositionAttributeMetadata()
    {
        return roadPositionAttributeMetadata_;
    }

    public void setRoadPositionAttributeMetadata(nds.name.instantiations.NameRoadPositionAttributeMetadata roadPositionAttributeMetadata_)
    {
        this.roadPositionAttributeMetadata_ = roadPositionAttributeMetadata_;
    }

    public boolean isRoadPositionAttributeMetadataUsed()
    {
        return ((getContent().and(nds.name.metadata.RoadNameLayerContent.Values.ROAD_POSITION_MAPS)).equals(nds.name.metadata.RoadNameLayerContent.Values.ROAD_POSITION_MAPS) || (getContent().and(nds.name.metadata.RoadNameLayerContent.Values.ROAD_POSITION_SETS)).equals(nds.name.metadata.RoadNameLayerContent.Values.ROAD_POSITION_SETS));
    }

    public boolean isRoadPositionAttributeMetadataSet()
    {
        return (roadPositionAttributeMetadata_ != null);
    }

    public void resetRoadPositionAttributeMetadata()
    {
        this.roadPositionAttributeMetadata_ = null;
    }

    public nds.name.instantiations.NameTransitionAttributeMetadata getTransitionAttributeMetadata()
    {
        return transitionAttributeMetadata_;
    }

    public void setTransitionAttributeMetadata(nds.name.instantiations.NameTransitionAttributeMetadata transitionAttributeMetadata_)
    {
        this.transitionAttributeMetadata_ = transitionAttributeMetadata_;
    }

    public boolean isTransitionAttributeMetadataUsed()
    {
        return ((getContent().and(nds.name.metadata.RoadNameLayerContent.Values.TRANSITION_MAPS)).equals(nds.name.metadata.RoadNameLayerContent.Values.TRANSITION_MAPS) || (getContent().and(nds.name.metadata.RoadNameLayerContent.Values.TRANSITION_SETS)).equals(nds.name.metadata.RoadNameLayerContent.Values.TRANSITION_SETS));
    }

    public boolean isTransitionAttributeMetadataSet()
    {
        return (transitionAttributeMetadata_ != null);
    }

    public void resetTransitionAttributeMetadata()
    {
        this.transitionAttributeMetadata_ = null;
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
        if (obj instanceof RoadNameLayerMetadata)
        {
            final RoadNameLayerMetadata that = (RoadNameLayerMetadata)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((!isRoadRangeAttributeMetadataUsed()) ? !that.isRoadRangeAttributeMetadataUsed() :
                        ((roadRangeAttributeMetadata_ == null) ? that.roadRangeAttributeMetadata_ == null : roadRangeAttributeMetadata_.equals(that.roadRangeAttributeMetadata_))) &&
                    ((!isRoadPositionAttributeMetadataUsed()) ? !that.isRoadPositionAttributeMetadataUsed() :
                        ((roadPositionAttributeMetadata_ == null) ? that.roadPositionAttributeMetadata_ == null : roadPositionAttributeMetadata_.equals(that.roadPositionAttributeMetadata_))) &&
                    ((!isTransitionAttributeMetadataUsed()) ? !that.isTransitionAttributeMetadataUsed() :
                        ((transitionAttributeMetadata_ == null) ? that.transitionAttributeMetadata_ == null : transitionAttributeMetadata_.equals(that.transitionAttributeMetadata_))) &&
                    ((availableLanguages_ == null) ? that.availableLanguages_ == null : availableLanguages_.equals(that.availableLanguages_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        if (isRoadRangeAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadRangeAttributeMetadata_);
        if (isRoadPositionAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadPositionAttributeMetadata_);
        if (isTransitionAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, transitionAttributeMetadata_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, availableLanguages_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.name.metadata.RoadNameLayerContent(in);

        if ((getContent().and(nds.name.metadata.RoadNameLayerContent.Values.ROAD_RANGE_MAPS)).equals(nds.name.metadata.RoadNameLayerContent.Values.ROAD_RANGE_MAPS) || (getContent().and(nds.name.metadata.RoadNameLayerContent.Values.ROAD_RANGE_SETS)).equals(nds.name.metadata.RoadNameLayerContent.Values.ROAD_RANGE_SETS))
        {
            roadRangeAttributeMetadata_ = new nds.name.instantiations.NameRoadRangeAttributeMetadata(in);
        }

        if ((getContent().and(nds.name.metadata.RoadNameLayerContent.Values.ROAD_POSITION_MAPS)).equals(nds.name.metadata.RoadNameLayerContent.Values.ROAD_POSITION_MAPS) || (getContent().and(nds.name.metadata.RoadNameLayerContent.Values.ROAD_POSITION_SETS)).equals(nds.name.metadata.RoadNameLayerContent.Values.ROAD_POSITION_SETS))
        {
            roadPositionAttributeMetadata_ = new nds.name.instantiations.NameRoadPositionAttributeMetadata(in);
        }

        if ((getContent().and(nds.name.metadata.RoadNameLayerContent.Values.TRANSITION_MAPS)).equals(nds.name.metadata.RoadNameLayerContent.Values.TRANSITION_MAPS) || (getContent().and(nds.name.metadata.RoadNameLayerContent.Values.TRANSITION_SETS)).equals(nds.name.metadata.RoadNameLayerContent.Values.TRANSITION_SETS))
        {
            transitionAttributeMetadata_ = new nds.name.instantiations.NameTransitionAttributeMetadata(in);
        }

        availableLanguages_ = new nds.core.language.AvailableLanguages(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.name.metadata.RoadNameLayerContent(zserioContext.getContent(), in);

        if ((getContent().and(nds.name.metadata.RoadNameLayerContent.Values.ROAD_RANGE_MAPS)).equals(nds.name.metadata.RoadNameLayerContent.Values.ROAD_RANGE_MAPS) || (getContent().and(nds.name.metadata.RoadNameLayerContent.Values.ROAD_RANGE_SETS)).equals(nds.name.metadata.RoadNameLayerContent.Values.ROAD_RANGE_SETS))
        {
            roadRangeAttributeMetadata_ = new nds.name.instantiations.NameRoadRangeAttributeMetadata(zserioContext.getRoadRangeAttributeMetadata(), in);
        }

        if ((getContent().and(nds.name.metadata.RoadNameLayerContent.Values.ROAD_POSITION_MAPS)).equals(nds.name.metadata.RoadNameLayerContent.Values.ROAD_POSITION_MAPS) || (getContent().and(nds.name.metadata.RoadNameLayerContent.Values.ROAD_POSITION_SETS)).equals(nds.name.metadata.RoadNameLayerContent.Values.ROAD_POSITION_SETS))
        {
            roadPositionAttributeMetadata_ = new nds.name.instantiations.NameRoadPositionAttributeMetadata(zserioContext.getRoadPositionAttributeMetadata(), in);
        }

        if ((getContent().and(nds.name.metadata.RoadNameLayerContent.Values.TRANSITION_MAPS)).equals(nds.name.metadata.RoadNameLayerContent.Values.TRANSITION_MAPS) || (getContent().and(nds.name.metadata.RoadNameLayerContent.Values.TRANSITION_SETS)).equals(nds.name.metadata.RoadNameLayerContent.Values.TRANSITION_SETS))
        {
            transitionAttributeMetadata_ = new nds.name.instantiations.NameTransitionAttributeMetadata(zserioContext.getTransitionAttributeMetadata(), in);
        }

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
        if (isRoadRangeAttributeMetadataUsed())
        {
            endBitPosition = roadRangeAttributeMetadata_.initializeOffsets(endBitPosition);
        }
        if (isRoadPositionAttributeMetadataUsed())
        {
            endBitPosition = roadPositionAttributeMetadata_.initializeOffsets(endBitPosition);
        }
        if (isTransitionAttributeMetadataUsed())
        {
            endBitPosition = transitionAttributeMetadata_.initializeOffsets(endBitPosition);
        }
        endBitPosition = availableLanguages_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        if (isRoadRangeAttributeMetadataUsed())
        {
            endBitPosition = roadRangeAttributeMetadata_.initializeOffsets(zserioContext.getRoadRangeAttributeMetadata(), endBitPosition);
        }
        if (isRoadPositionAttributeMetadataUsed())
        {
            endBitPosition = roadPositionAttributeMetadata_.initializeOffsets(zserioContext.getRoadPositionAttributeMetadata(), endBitPosition);
        }
        if (isTransitionAttributeMetadataUsed())
        {
            endBitPosition = transitionAttributeMetadata_.initializeOffsets(zserioContext.getTransitionAttributeMetadata(), endBitPosition);
        }
        endBitPosition = availableLanguages_.initializeOffsets(zserioContext.getAvailableLanguages(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        if (isRoadRangeAttributeMetadataUsed())
        {
            roadRangeAttributeMetadata_.write(out);
        }

        if (isRoadPositionAttributeMetadataUsed())
        {
            roadPositionAttributeMetadata_.write(out);
        }

        if (isTransitionAttributeMetadataUsed())
        {
            transitionAttributeMetadata_.write(out);
        }

        availableLanguages_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(zserioContext.getContent(), out);

        if (isRoadRangeAttributeMetadataUsed())
        {
            roadRangeAttributeMetadata_.write(zserioContext.getRoadRangeAttributeMetadata(), out);
        }

        if (isRoadPositionAttributeMetadataUsed())
        {
            roadPositionAttributeMetadata_.write(zserioContext.getRoadPositionAttributeMetadata(), out);
        }

        if (isTransitionAttributeMetadataUsed())
        {
            transitionAttributeMetadata_.write(zserioContext.getTransitionAttributeMetadata(), out);
        }

        availableLanguages_.write(zserioContext.getAvailableLanguages(), out);
    }

    private nds.name.metadata.RoadNameLayerContent content_;
    private nds.name.instantiations.NameRoadRangeAttributeMetadata roadRangeAttributeMetadata_;
    private nds.name.instantiations.NameRoadPositionAttributeMetadata roadPositionAttributeMetadata_;
    private nds.name.instantiations.NameTransitionAttributeMetadata transitionAttributeMetadata_;
    private nds.core.language.AvailableLanguages availableLanguages_;
}