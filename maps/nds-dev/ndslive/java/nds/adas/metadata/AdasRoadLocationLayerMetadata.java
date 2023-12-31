/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.adas.metadata;

public class AdasRoadLocationLayerMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            roadLocationAttributeMetadata_ = new nds.adas.instantiations.AdasRoadAttributeMetadata.ZserioPackingContext();
            roadLocationTransitionAttributeMetadata_ = new nds.adas.instantiations.AdasTransitionAttributeMetadata.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public nds.adas.instantiations.AdasRoadAttributeMetadata.ZserioPackingContext getRoadLocationAttributeMetadata()
        {
            return roadLocationAttributeMetadata_;
        }

        public nds.adas.instantiations.AdasTransitionAttributeMetadata.ZserioPackingContext getRoadLocationTransitionAttributeMetadata()
        {
            return roadLocationTransitionAttributeMetadata_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private nds.adas.instantiations.AdasRoadAttributeMetadata.ZserioPackingContext roadLocationAttributeMetadata_;
        private nds.adas.instantiations.AdasTransitionAttributeMetadata.ZserioPackingContext roadLocationTransitionAttributeMetadata_;
    };

    public AdasRoadLocationLayerMetadata()
    {
    }

    public AdasRoadLocationLayerMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public AdasRoadLocationLayerMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public AdasRoadLocationLayerMetadata(
            nds.adas.metadata.AdasRoadLocationLayerContent content_,
            nds.adas.instantiations.AdasRoadAttributeMetadata roadLocationAttributeMetadata_,
            nds.adas.instantiations.AdasTransitionAttributeMetadata roadLocationTransitionAttributeMetadata_,
            nds.core.types.RoadType[] coveredRoadTypes_)
    {
        setContent(content_);
        setRoadLocationAttributeMetadata(roadLocationAttributeMetadata_);
        setRoadLocationTransitionAttributeMetadata(roadLocationTransitionAttributeMetadata_);
        setCoveredRoadTypes(coveredRoadTypes_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        if (isRoadLocationAttributeMetadataUsed())
        {
            roadLocationAttributeMetadata_.initPackingContext(zserioContext.getRoadLocationAttributeMetadata());
        }
        if (isRoadLocationTransitionAttributeMetadataUsed())
        {
            roadLocationTransitionAttributeMetadata_.initPackingContext(zserioContext.getRoadLocationTransitionAttributeMetadata());
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
        if (isRoadLocationAttributeMetadataUsed())
        {
            endBitPosition += roadLocationAttributeMetadata_.bitSizeOf(endBitPosition);
        }
        if (isRoadLocationTransitionAttributeMetadataUsed())
        {
            endBitPosition += roadLocationTransitionAttributeMetadata_.bitSizeOf(endBitPosition);
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
        if (isRoadLocationAttributeMetadataUsed())
        {
            endBitPosition += roadLocationAttributeMetadata_.bitSizeOf(zserioContext.getRoadLocationAttributeMetadata(), endBitPosition);
        }
        if (isRoadLocationTransitionAttributeMetadataUsed())
        {
            endBitPosition += roadLocationTransitionAttributeMetadata_.bitSizeOf(zserioContext.getRoadLocationTransitionAttributeMetadata(), endBitPosition);
        }
        endBitPosition += coveredRoadTypes_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.adas.metadata.AdasRoadLocationLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.adas.metadata.AdasRoadLocationLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.adas.instantiations.AdasRoadAttributeMetadata getRoadLocationAttributeMetadata()
    {
        return roadLocationAttributeMetadata_;
    }

    public void setRoadLocationAttributeMetadata(nds.adas.instantiations.AdasRoadAttributeMetadata roadLocationAttributeMetadata_)
    {
        this.roadLocationAttributeMetadata_ = roadLocationAttributeMetadata_;
    }

    public boolean isRoadLocationAttributeMetadataUsed()
    {
        return ((getContent().and(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_MAPS)).equals(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_MAPS) || (getContent().and(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_SETS)).equals(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_SETS));
    }

    public boolean isRoadLocationAttributeMetadataSet()
    {
        return (roadLocationAttributeMetadata_ != null);
    }

    public void resetRoadLocationAttributeMetadata()
    {
        this.roadLocationAttributeMetadata_ = null;
    }

    public nds.adas.instantiations.AdasTransitionAttributeMetadata getRoadLocationTransitionAttributeMetadata()
    {
        return roadLocationTransitionAttributeMetadata_;
    }

    public void setRoadLocationTransitionAttributeMetadata(nds.adas.instantiations.AdasTransitionAttributeMetadata roadLocationTransitionAttributeMetadata_)
    {
        this.roadLocationTransitionAttributeMetadata_ = roadLocationTransitionAttributeMetadata_;
    }

    public boolean isRoadLocationTransitionAttributeMetadataUsed()
    {
        return ((getContent().and(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_TRANSITION_MAPS)).equals(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_TRANSITION_MAPS) || (getContent().and(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_TRANSITION_SETS)).equals(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_TRANSITION_SETS));
    }

    public boolean isRoadLocationTransitionAttributeMetadataSet()
    {
        return (roadLocationTransitionAttributeMetadata_ != null);
    }

    public void resetRoadLocationTransitionAttributeMetadata()
    {
        this.roadLocationTransitionAttributeMetadata_ = null;
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
        if (obj instanceof AdasRoadLocationLayerMetadata)
        {
            final AdasRoadLocationLayerMetadata that = (AdasRoadLocationLayerMetadata)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((!isRoadLocationAttributeMetadataUsed()) ? !that.isRoadLocationAttributeMetadataUsed() :
                        ((roadLocationAttributeMetadata_ == null) ? that.roadLocationAttributeMetadata_ == null : roadLocationAttributeMetadata_.equals(that.roadLocationAttributeMetadata_))) &&
                    ((!isRoadLocationTransitionAttributeMetadataUsed()) ? !that.isRoadLocationTransitionAttributeMetadataUsed() :
                        ((roadLocationTransitionAttributeMetadata_ == null) ? that.roadLocationTransitionAttributeMetadata_ == null : roadLocationTransitionAttributeMetadata_.equals(that.roadLocationTransitionAttributeMetadata_))) &&
                    ((coveredRoadTypes_ == null) ? that.coveredRoadTypes_ == null : coveredRoadTypes_.equals(that.coveredRoadTypes_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        if (isRoadLocationAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadLocationAttributeMetadata_);
        if (isRoadLocationTransitionAttributeMetadataUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadLocationTransitionAttributeMetadata_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, coveredRoadTypes_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.adas.metadata.AdasRoadLocationLayerContent(in);

        if ((getContent().and(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_MAPS)).equals(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_MAPS) || (getContent().and(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_SETS)).equals(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_SETS))
        {
            roadLocationAttributeMetadata_ = new nds.adas.instantiations.AdasRoadAttributeMetadata(in);
        }

        if ((getContent().and(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_TRANSITION_MAPS)).equals(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_TRANSITION_MAPS) || (getContent().and(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_TRANSITION_SETS)).equals(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_TRANSITION_SETS))
        {
            roadLocationTransitionAttributeMetadata_ = new nds.adas.instantiations.AdasTransitionAttributeMetadata(in);
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
        content_ = new nds.adas.metadata.AdasRoadLocationLayerContent(zserioContext.getContent(), in);

        if ((getContent().and(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_MAPS)).equals(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_MAPS) || (getContent().and(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_SETS)).equals(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_SETS))
        {
            roadLocationAttributeMetadata_ = new nds.adas.instantiations.AdasRoadAttributeMetadata(zserioContext.getRoadLocationAttributeMetadata(), in);
        }

        if ((getContent().and(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_TRANSITION_MAPS)).equals(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_TRANSITION_MAPS) || (getContent().and(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_TRANSITION_SETS)).equals(nds.adas.metadata.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_TRANSITION_SETS))
        {
            roadLocationTransitionAttributeMetadata_ = new nds.adas.instantiations.AdasTransitionAttributeMetadata(zserioContext.getRoadLocationTransitionAttributeMetadata(), in);
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
        if (isRoadLocationAttributeMetadataUsed())
        {
            endBitPosition = roadLocationAttributeMetadata_.initializeOffsets(endBitPosition);
        }
        if (isRoadLocationTransitionAttributeMetadataUsed())
        {
            endBitPosition = roadLocationTransitionAttributeMetadata_.initializeOffsets(endBitPosition);
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
        if (isRoadLocationAttributeMetadataUsed())
        {
            endBitPosition = roadLocationAttributeMetadata_.initializeOffsets(zserioContext.getRoadLocationAttributeMetadata(), endBitPosition);
        }
        if (isRoadLocationTransitionAttributeMetadataUsed())
        {
            endBitPosition = roadLocationTransitionAttributeMetadata_.initializeOffsets(zserioContext.getRoadLocationTransitionAttributeMetadata(), endBitPosition);
        }
        endBitPosition = coveredRoadTypes_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        if (isRoadLocationAttributeMetadataUsed())
        {
            roadLocationAttributeMetadata_.write(out);
        }

        if (isRoadLocationTransitionAttributeMetadataUsed())
        {
            roadLocationTransitionAttributeMetadata_.write(out);
        }

        coveredRoadTypes_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(zserioContext.getContent(), out);

        if (isRoadLocationAttributeMetadataUsed())
        {
            roadLocationAttributeMetadata_.write(zserioContext.getRoadLocationAttributeMetadata(), out);
        }

        if (isRoadLocationTransitionAttributeMetadataUsed())
        {
            roadLocationTransitionAttributeMetadata_.write(zserioContext.getRoadLocationTransitionAttributeMetadata(), out);
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

    private nds.adas.metadata.AdasRoadLocationLayerContent content_;
    private nds.adas.instantiations.AdasRoadAttributeMetadata roadLocationAttributeMetadata_;
    private nds.adas.instantiations.AdasTransitionAttributeMetadata roadLocationTransitionAttributeMetadata_;
    private zserio.runtime.array.Array coveredRoadTypes_;
}
