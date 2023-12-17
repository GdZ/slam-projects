/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routingdata.metadata;

public class LaneRoutingLayerMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            laneRangeAttributeMetadata_ = new nds.routingdata.instantiations.RoutingLaneRangeAttributeMetadata.ZserioPackingContext();
            laneTransitionAttributeMetadata_ = new nds.routingdata.instantiations.RoutingLaneTransitionAttributeMetadata.ZserioPackingContext();
            excessSlopeThreshold_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public nds.routingdata.instantiations.RoutingLaneRangeAttributeMetadata.ZserioPackingContext getLaneRangeAttributeMetadata()
        {
            return laneRangeAttributeMetadata_;
        }

        public nds.routingdata.instantiations.RoutingLaneTransitionAttributeMetadata.ZserioPackingContext getLaneTransitionAttributeMetadata()
        {
            return laneTransitionAttributeMetadata_;
        }

        public zserio.runtime.array.DeltaContext getExcessSlopeThreshold()
        {
            return excessSlopeThreshold_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private nds.routingdata.instantiations.RoutingLaneRangeAttributeMetadata.ZserioPackingContext laneRangeAttributeMetadata_;
        private nds.routingdata.instantiations.RoutingLaneTransitionAttributeMetadata.ZserioPackingContext laneTransitionAttributeMetadata_;
        private zserio.runtime.array.DeltaContext excessSlopeThreshold_;
    };

    public LaneRoutingLayerMetadata()
    {
    }

    public LaneRoutingLayerMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public LaneRoutingLayerMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public LaneRoutingLayerMetadata(
            nds.routingdata.metadata.LaneRoutingLayerContent content_,
            nds.routingdata.instantiations.RoutingLaneRangeAttributeMetadata laneRangeAttributeMetadata_,
            nds.routingdata.instantiations.RoutingLaneTransitionAttributeMetadata laneTransitionAttributeMetadata_,
            nds.core.types.LaneType[] coveredLaneTypes_,
            boolean hasEcoRoutingAttributes_,
            java.lang.Short excessSlopeThreshold_)
    {
        setContent(content_);
        setLaneRangeAttributeMetadata(laneRangeAttributeMetadata_);
        setLaneTransitionAttributeMetadata(laneTransitionAttributeMetadata_);
        setCoveredLaneTypes(coveredLaneTypes_);
        setHasEcoRoutingAttributes(hasEcoRoutingAttributes_);
        setExcessSlopeThreshold(excessSlopeThreshold_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        if (isLaneRangeAttributeMetadataUsed())
        {
            laneRangeAttributeMetadata_.initPackingContext(zserioContext.getLaneRangeAttributeMetadata());
        }
        if (isLaneTransitionAttributeMetadataUsed())
        {
            laneTransitionAttributeMetadata_.initPackingContext(zserioContext.getLaneTransitionAttributeMetadata());
        }
        if (isExcessSlopeThresholdUsed())
        {
            zserioContext.getExcessSlopeThreshold().init(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(excessSlopeThreshold_));
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
        if (isLaneRangeAttributeMetadataUsed())
        {
            endBitPosition += laneRangeAttributeMetadata_.bitSizeOf(endBitPosition);
        }
        if (isLaneTransitionAttributeMetadataUsed())
        {
            endBitPosition += laneTransitionAttributeMetadata_.bitSizeOf(endBitPosition);
        }
        endBitPosition += coveredLaneTypes_.bitSizeOf(endBitPosition);
        endBitPosition += 1;
        if (isExcessSlopeThresholdUsed())
        {
            endBitPosition += 8;
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        if (isLaneRangeAttributeMetadataUsed())
        {
            endBitPosition += laneRangeAttributeMetadata_.bitSizeOf(zserioContext.getLaneRangeAttributeMetadata(), endBitPosition);
        }
        if (isLaneTransitionAttributeMetadataUsed())
        {
            endBitPosition += laneTransitionAttributeMetadata_.bitSizeOf(zserioContext.getLaneTransitionAttributeMetadata(), endBitPosition);
        }
        endBitPosition += coveredLaneTypes_.bitSizeOfPacked(endBitPosition);
        endBitPosition += 1;
        if (isExcessSlopeThresholdUsed())
        {
            endBitPosition += zserioContext.getExcessSlopeThreshold().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(excessSlopeThreshold_));
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.routingdata.metadata.LaneRoutingLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.routingdata.metadata.LaneRoutingLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.routingdata.instantiations.RoutingLaneRangeAttributeMetadata getLaneRangeAttributeMetadata()
    {
        return laneRangeAttributeMetadata_;
    }

    public void setLaneRangeAttributeMetadata(nds.routingdata.instantiations.RoutingLaneRangeAttributeMetadata laneRangeAttributeMetadata_)
    {
        this.laneRangeAttributeMetadata_ = laneRangeAttributeMetadata_;
    }

    public boolean isLaneRangeAttributeMetadataUsed()
    {
        return ((getContent().and(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_RANGE_MAPS)).equals(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_RANGE_MAPS) || (getContent().and(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_RANGE_SETS)).equals(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_RANGE_SETS));
    }

    public boolean isLaneRangeAttributeMetadataSet()
    {
        return (laneRangeAttributeMetadata_ != null);
    }

    public void resetLaneRangeAttributeMetadata()
    {
        this.laneRangeAttributeMetadata_ = null;
    }

    public nds.routingdata.instantiations.RoutingLaneTransitionAttributeMetadata getLaneTransitionAttributeMetadata()
    {
        return laneTransitionAttributeMetadata_;
    }

    public void setLaneTransitionAttributeMetadata(nds.routingdata.instantiations.RoutingLaneTransitionAttributeMetadata laneTransitionAttributeMetadata_)
    {
        this.laneTransitionAttributeMetadata_ = laneTransitionAttributeMetadata_;
    }

    public boolean isLaneTransitionAttributeMetadataUsed()
    {
        return ((getContent().and(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_TRANSITION_MAPS)).equals(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_TRANSITION_MAPS) || (getContent().and(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_TRANSITION_SETS)).equals(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_TRANSITION_SETS));
    }

    public boolean isLaneTransitionAttributeMetadataSet()
    {
        return (laneTransitionAttributeMetadata_ != null);
    }

    public void resetLaneTransitionAttributeMetadata()
    {
        this.laneTransitionAttributeMetadata_ = null;
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

    public boolean getHasEcoRoutingAttributes()
    {
        return hasEcoRoutingAttributes_;
    }

    public void setHasEcoRoutingAttributes(boolean hasEcoRoutingAttributes_)
    {
        this.hasEcoRoutingAttributes_ = hasEcoRoutingAttributes_;
    }

    public java.lang.Short getExcessSlopeThreshold()
    {
        return excessSlopeThreshold_;
    }

    public void setExcessSlopeThreshold(java.lang.Short excessSlopeThreshold_)
    {
        this.excessSlopeThreshold_ = excessSlopeThreshold_;
    }

    public boolean isExcessSlopeThresholdUsed()
    {
        return (getHasEcoRoutingAttributes());
    }

    public boolean isExcessSlopeThresholdSet()
    {
        return (excessSlopeThreshold_ != null);
    }

    public void resetExcessSlopeThreshold()
    {
        this.excessSlopeThreshold_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LaneRoutingLayerMetadata)
        {
            final LaneRoutingLayerMetadata that = (LaneRoutingLayerMetadata)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((!isLaneRangeAttributeMetadataUsed()) ? !that.isLaneRangeAttributeMetadataUsed() :
                        ((laneRangeAttributeMetadata_ == null) ? that.laneRangeAttributeMetadata_ == null : laneRangeAttributeMetadata_.equals(that.laneRangeAttributeMetadata_))) &&
                    ((!isLaneTransitionAttributeMetadataUsed()) ? !that.isLaneTransitionAttributeMetadataUsed() :
                        ((laneTransitionAttributeMetadata_ == null) ? that.laneTransitionAttributeMetadata_ == null : laneTransitionAttributeMetadata_.equals(that.laneTransitionAttributeMetadata_))) &&
                    ((coveredLaneTypes_ == null) ? that.coveredLaneTypes_ == null : coveredLaneTypes_.equals(that.coveredLaneTypes_)) &&
                    hasEcoRoutingAttributes_ == that.hasEcoRoutingAttributes_ &&
                    ((!isExcessSlopeThresholdUsed()) ? !that.isExcessSlopeThresholdUsed() :
                        ((excessSlopeThreshold_ == null) ? that.excessSlopeThreshold_ == null : excessSlopeThreshold_.equals(that.excessSlopeThreshold_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        if (isLaneRangeAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, laneRangeAttributeMetadata_);
        if (isLaneTransitionAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, laneTransitionAttributeMetadata_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, coveredLaneTypes_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, hasEcoRoutingAttributes_);
        if (isExcessSlopeThresholdUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, excessSlopeThreshold_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.routingdata.metadata.LaneRoutingLayerContent(in);

        if ((getContent().and(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_RANGE_MAPS)).equals(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_RANGE_MAPS) || (getContent().and(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_RANGE_SETS)).equals(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_RANGE_SETS))
        {
            laneRangeAttributeMetadata_ = new nds.routingdata.instantiations.RoutingLaneRangeAttributeMetadata(in);
        }

        if ((getContent().and(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_TRANSITION_MAPS)).equals(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_TRANSITION_MAPS) || (getContent().and(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_TRANSITION_SETS)).equals(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_TRANSITION_SETS))
        {
            laneTransitionAttributeMetadata_ = new nds.routingdata.instantiations.RoutingLaneTransitionAttributeMetadata(in);
        }

        coveredLaneTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.LaneType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.LaneType>(new ZserioElementFactory_coveredLaneTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        coveredLaneTypes_.read(in);

        hasEcoRoutingAttributes_ = in.readBool();

        if (getHasEcoRoutingAttributes())
        {
            excessSlopeThreshold_ = in.readUnsignedByte();
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.routingdata.metadata.LaneRoutingLayerContent(zserioContext.getContent(), in);

        if ((getContent().and(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_RANGE_MAPS)).equals(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_RANGE_MAPS) || (getContent().and(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_RANGE_SETS)).equals(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_RANGE_SETS))
        {
            laneRangeAttributeMetadata_ = new nds.routingdata.instantiations.RoutingLaneRangeAttributeMetadata(zserioContext.getLaneRangeAttributeMetadata(), in);
        }

        if ((getContent().and(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_TRANSITION_MAPS)).equals(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_TRANSITION_MAPS) || (getContent().and(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_TRANSITION_SETS)).equals(nds.routingdata.metadata.LaneRoutingLayerContent.Values.LANE_TRANSITION_SETS))
        {
            laneTransitionAttributeMetadata_ = new nds.routingdata.instantiations.RoutingLaneTransitionAttributeMetadata(zserioContext.getLaneTransitionAttributeMetadata(), in);
        }

        coveredLaneTypes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.LaneType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.LaneType>(new ZserioElementFactory_coveredLaneTypes()),
                zserio.runtime.array.ArrayType.AUTO);
        coveredLaneTypes_.readPacked(in);

        hasEcoRoutingAttributes_ = in.readBool();

        if (getHasEcoRoutingAttributes())
        {
            excessSlopeThreshold_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                    zserioContext.getExcessSlopeThreshold().read(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), in)).get();
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
        if (isLaneRangeAttributeMetadataUsed())
        {
            endBitPosition = laneRangeAttributeMetadata_.initializeOffsets(endBitPosition);
        }
        if (isLaneTransitionAttributeMetadataUsed())
        {
            endBitPosition = laneTransitionAttributeMetadata_.initializeOffsets(endBitPosition);
        }
        endBitPosition = coveredLaneTypes_.initializeOffsets(endBitPosition);
        endBitPosition += 1;
        if (isExcessSlopeThresholdUsed())
        {
            endBitPosition += 8;
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        if (isLaneRangeAttributeMetadataUsed())
        {
            endBitPosition = laneRangeAttributeMetadata_.initializeOffsets(zserioContext.getLaneRangeAttributeMetadata(), endBitPosition);
        }
        if (isLaneTransitionAttributeMetadataUsed())
        {
            endBitPosition = laneTransitionAttributeMetadata_.initializeOffsets(zserioContext.getLaneTransitionAttributeMetadata(), endBitPosition);
        }
        endBitPosition = coveredLaneTypes_.initializeOffsetsPacked(endBitPosition);
        endBitPosition += 1;
        if (isExcessSlopeThresholdUsed())
        {
            endBitPosition += zserioContext.getExcessSlopeThreshold().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(excessSlopeThreshold_));
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        if (isLaneRangeAttributeMetadataUsed())
        {
            laneRangeAttributeMetadata_.write(out);
        }

        if (isLaneTransitionAttributeMetadataUsed())
        {
            laneTransitionAttributeMetadata_.write(out);
        }

        coveredLaneTypes_.write(out);

        out.writeBool(hasEcoRoutingAttributes_);

        if (isExcessSlopeThresholdUsed())
        {
            out.writeUnsignedByte(excessSlopeThreshold_);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(zserioContext.getContent(), out);

        if (isLaneRangeAttributeMetadataUsed())
        {
            laneRangeAttributeMetadata_.write(zserioContext.getLaneRangeAttributeMetadata(), out);
        }

        if (isLaneTransitionAttributeMetadataUsed())
        {
            laneTransitionAttributeMetadata_.write(zserioContext.getLaneTransitionAttributeMetadata(), out);
        }

        coveredLaneTypes_.writePacked(out);

        out.writeBool(hasEcoRoutingAttributes_);

        if (isExcessSlopeThresholdUsed())
        {
            zserioContext.getExcessSlopeThreshold().write(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), out,
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(excessSlopeThreshold_));
        }
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

    private nds.routingdata.metadata.LaneRoutingLayerContent content_;
    private nds.routingdata.instantiations.RoutingLaneRangeAttributeMetadata laneRangeAttributeMetadata_;
    private nds.routingdata.instantiations.RoutingLaneTransitionAttributeMetadata laneTransitionAttributeMetadata_;
    private zserio.runtime.array.Array coveredLaneTypes_;
    private boolean hasEcoRoutingAttributes_;
    private java.lang.Short excessSlopeThreshold_;
}
