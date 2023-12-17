/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.adas.metadata;

public class AdasRoadLayerMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            roadAttributeMetadata_ = new nds.adas.instantiations.AdasRoadAttributeMetadata.ZserioPackingContext();
            transitionAttributeMetadata_ = new nds.adas.instantiations.AdasTransitionAttributeMetadata.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public nds.adas.instantiations.AdasRoadAttributeMetadata.ZserioPackingContext getRoadAttributeMetadata()
        {
            return roadAttributeMetadata_;
        }

        public nds.adas.instantiations.AdasTransitionAttributeMetadata.ZserioPackingContext getTransitionAttributeMetadata()
        {
            return transitionAttributeMetadata_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private nds.adas.instantiations.AdasRoadAttributeMetadata.ZserioPackingContext roadAttributeMetadata_;
        private nds.adas.instantiations.AdasTransitionAttributeMetadata.ZserioPackingContext transitionAttributeMetadata_;
    };

    public AdasRoadLayerMetadata()
    {
    }

    public AdasRoadLayerMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public AdasRoadLayerMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public AdasRoadLayerMetadata(
            nds.adas.metadata.AdasRoadLayerContent content_,
            nds.adas.instantiations.AdasRoadAttributeMetadata roadAttributeMetadata_,
            nds.adas.instantiations.AdasTransitionAttributeMetadata transitionAttributeMetadata_,
            nds.core.types.RoadType[] coveredRoadTypes_)
    {
        setContent(content_);
        setRoadAttributeMetadata(roadAttributeMetadata_);
        setTransitionAttributeMetadata(transitionAttributeMetadata_);
        setCoveredRoadTypes(coveredRoadTypes_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        if (isRoadAttributeMetadataUsed())
        {
            roadAttributeMetadata_.initPackingContext(zserioContext.getRoadAttributeMetadata());
        }
        if (isTransitionAttributeMetadataUsed())
        {
            transitionAttributeMetadata_.initPackingContext(zserioContext.getTransitionAttributeMetadata());
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
        if (isRoadAttributeMetadataUsed())
        {
            endBitPosition += roadAttributeMetadata_.bitSizeOf(endBitPosition);
        }
        if (isTransitionAttributeMetadataUsed())
        {
            endBitPosition += transitionAttributeMetadata_.bitSizeOf(endBitPosition);
        }
        endBitPosition += coveredRoadTypes_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        if (isRoadAttributeMetadataUsed())
        {
            endBitPosition += roadAttributeMetadata_.bitSizeOf(zserioContext.getRoadAttributeMetadata(), endBitPosition);
        }
        if (isTransitionAttributeMetadataUsed())
        {
            endBitPosition += transitionAttributeMetadata_.bitSizeOf(zserioContext.getTransitionAttributeMetadata(), endBitPosition);
        }
        endBitPosition += coveredRoadTypes_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.adas.metadata.AdasRoadLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.adas.metadata.AdasRoadLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.adas.instantiations.AdasRoadAttributeMetadata getRoadAttributeMetadata()
    {
        return roadAttributeMetadata_;
    }

    public void setRoadAttributeMetadata(nds.adas.instantiations.AdasRoadAttributeMetadata roadAttributeMetadata_)
    {
        this.roadAttributeMetadata_ = roadAttributeMetadata_;
    }

    public boolean isRoadAttributeMetadataUsed()
    {
        return ((getContent().and(nds.adas.metadata.AdasRoadLayerContent.Values.ROAD_MAPS)).equals(nds.adas.metadata.AdasRoadLayerContent.Values.ROAD_MAPS) || (getContent().and(nds.adas.metadata.AdasRoadLayerContent.Values.ROAD_SETS)).equals(nds.adas.metadata.AdasRoadLayerContent.Values.ROAD_SETS));
    }

    public boolean isRoadAttributeMetadataSet()
    {
        return (roadAttributeMetadata_ != null);
    }

    public void resetRoadAttributeMetadata()
    {
        this.roadAttributeMetadata_ = null;
    }

    public nds.adas.instantiations.AdasTransitionAttributeMetadata getTransitionAttributeMetadata()
    {
        return transitionAttributeMetadata_;
    }

    public void setTransitionAttributeMetadata(nds.adas.instantiations.AdasTransitionAttributeMetadata transitionAttributeMetadata_)
    {
        this.transitionAttributeMetadata_ = transitionAttributeMetadata_;
    }

    public boolean isTransitionAttributeMetadataUsed()
    {
        return ((getContent().and(nds.adas.metadata.AdasRoadLayerContent.Values.TRANSITION_MAPS)).equals(nds.adas.metadata.AdasRoadLayerContent.Values.TRANSITION_MAPS) || (getContent().and(nds.adas.metadata.AdasRoadLayerContent.Values.TRANSITION_SETS)).equals(nds.adas.metadata.AdasRoadLayerContent.Values.TRANSITION_SETS));
    }

    public boolean isTransitionAttributeMetadataSet()
    {
        return (transitionAttributeMetadata_ != null);
    }

    public void resetTransitionAttributeMetadata()
    {
        this.transitionAttributeMetadata_ = null;
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
        if (obj instanceof AdasRoadLayerMetadata)
        {
            final AdasRoadLayerMetadata that = (AdasRoadLayerMetadata)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((!isRoadAttributeMetadataUsed()) ? !that.isRoadAttributeMetadataUsed() :
                        ((roadAttributeMetadata_ == null) ? that.roadAttributeMetadata_ == null : roadAttributeMetadata_.equals(that.roadAttributeMetadata_))) &&
                    ((!isTransitionAttributeMetadataUsed()) ? !that.isTransitionAttributeMetadataUsed() :
                        ((transitionAttributeMetadata_ == null) ? that.transitionAttributeMetadata_ == null : transitionAttributeMetadata_.equals(that.transitionAttributeMetadata_))) &&
                    ((coveredRoadTypes_ == null) ? that.coveredRoadTypes_ == null : coveredRoadTypes_.equals(that.coveredRoadTypes_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        if (isRoadAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadAttributeMetadata_);
        if (isTransitionAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, transitionAttributeMetadata_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, coveredRoadTypes_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.adas.metadata.AdasRoadLayerContent(in);

        if ((getContent().and(nds.adas.metadata.AdasRoadLayerContent.Values.ROAD_MAPS)).equals(nds.adas.metadata.AdasRoadLayerContent.Values.ROAD_MAPS) || (getContent().and(nds.adas.metadata.AdasRoadLayerContent.Values.ROAD_SETS)).equals(nds.adas.metadata.AdasRoadLayerContent.Values.ROAD_SETS))
        {
            roadAttributeMetadata_ = new nds.adas.instantiations.AdasRoadAttributeMetadata(in);
        }

        if ((getContent().and(nds.adas.metadata.AdasRoadLayerContent.Values.TRANSITION_MAPS)).equals(nds.adas.metadata.AdasRoadLayerContent.Values.TRANSITION_MAPS) || (getContent().and(nds.adas.metadata.AdasRoadLayerContent.Values.TRANSITION_SETS)).equals(nds.adas.metadata.AdasRoadLayerContent.Values.TRANSITION_SETS))
        {
            transitionAttributeMetadata_ = new nds.adas.instantiations.AdasTransitionAttributeMetadata(in);
        }

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
        content_ = new nds.adas.metadata.AdasRoadLayerContent(zserioContext.getContent(), in);

        if ((getContent().and(nds.adas.metadata.AdasRoadLayerContent.Values.ROAD_MAPS)).equals(nds.adas.metadata.AdasRoadLayerContent.Values.ROAD_MAPS) || (getContent().and(nds.adas.metadata.AdasRoadLayerContent.Values.ROAD_SETS)).equals(nds.adas.metadata.AdasRoadLayerContent.Values.ROAD_SETS))
        {
            roadAttributeMetadata_ = new nds.adas.instantiations.AdasRoadAttributeMetadata(zserioContext.getRoadAttributeMetadata(), in);
        }

        if ((getContent().and(nds.adas.metadata.AdasRoadLayerContent.Values.TRANSITION_MAPS)).equals(nds.adas.metadata.AdasRoadLayerContent.Values.TRANSITION_MAPS) || (getContent().and(nds.adas.metadata.AdasRoadLayerContent.Values.TRANSITION_SETS)).equals(nds.adas.metadata.AdasRoadLayerContent.Values.TRANSITION_SETS))
        {
            transitionAttributeMetadata_ = new nds.adas.instantiations.AdasTransitionAttributeMetadata(zserioContext.getTransitionAttributeMetadata(), in);
        }

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
        if (isRoadAttributeMetadataUsed())
        {
            endBitPosition = roadAttributeMetadata_.initializeOffsets(endBitPosition);
        }
        if (isTransitionAttributeMetadataUsed())
        {
            endBitPosition = transitionAttributeMetadata_.initializeOffsets(endBitPosition);
        }
        endBitPosition = coveredRoadTypes_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        if (isRoadAttributeMetadataUsed())
        {
            endBitPosition = roadAttributeMetadata_.initializeOffsets(zserioContext.getRoadAttributeMetadata(), endBitPosition);
        }
        if (isTransitionAttributeMetadataUsed())
        {
            endBitPosition = transitionAttributeMetadata_.initializeOffsets(zserioContext.getTransitionAttributeMetadata(), endBitPosition);
        }
        endBitPosition = coveredRoadTypes_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        if (isRoadAttributeMetadataUsed())
        {
            roadAttributeMetadata_.write(out);
        }

        if (isTransitionAttributeMetadataUsed())
        {
            transitionAttributeMetadata_.write(out);
        }

        coveredRoadTypes_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(zserioContext.getContent(), out);

        if (isRoadAttributeMetadataUsed())
        {
            roadAttributeMetadata_.write(zserioContext.getRoadAttributeMetadata(), out);
        }

        if (isTransitionAttributeMetadataUsed())
        {
            transitionAttributeMetadata_.write(zserioContext.getTransitionAttributeMetadata(), out);
        }

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

    private nds.adas.metadata.AdasRoadLayerContent content_;
    private nds.adas.instantiations.AdasRoadAttributeMetadata roadAttributeMetadata_;
    private nds.adas.instantiations.AdasTransitionAttributeMetadata transitionAttributeMetadata_;
    private zserio.runtime.array.Array coveredRoadTypes_;
}
