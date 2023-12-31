/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.characteristics.metadata;

public class DisplayLineCharacteristicsLayerMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            displayLineRangeAttributeMetadata_ = new nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMetadata.ZserioPackingContext();
            displayLinePositionAttributeMetadata_ = new nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMetadata.ZserioPackingContext();
            roadLocationProviderDetails_ = new nds.characteristics.metadata.RoadLocationProviderDetails.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMetadata.ZserioPackingContext getDisplayLineRangeAttributeMetadata()
        {
            return displayLineRangeAttributeMetadata_;
        }

        public nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMetadata.ZserioPackingContext getDisplayLinePositionAttributeMetadata()
        {
            return displayLinePositionAttributeMetadata_;
        }

        public nds.characteristics.metadata.RoadLocationProviderDetails.ZserioPackingContext getRoadLocationProviderDetails()
        {
            return roadLocationProviderDetails_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMetadata.ZserioPackingContext displayLineRangeAttributeMetadata_;
        private nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMetadata.ZserioPackingContext displayLinePositionAttributeMetadata_;
        private nds.characteristics.metadata.RoadLocationProviderDetails.ZserioPackingContext roadLocationProviderDetails_;
    };

    public DisplayLineCharacteristicsLayerMetadata()
    {
    }

    public DisplayLineCharacteristicsLayerMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public DisplayLineCharacteristicsLayerMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public DisplayLineCharacteristicsLayerMetadata(
            nds.characteristics.metadata.DisplayLineCharacsLayerContent content_,
            nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMetadata displayLineRangeAttributeMetadata_,
            nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMetadata displayLinePositionAttributeMetadata_,
            nds.characteristics.metadata.RoadLocationProviderDetails roadLocationProviderDetails_)
    {
        setContent(content_);
        setDisplayLineRangeAttributeMetadata(displayLineRangeAttributeMetadata_);
        setDisplayLinePositionAttributeMetadata(displayLinePositionAttributeMetadata_);
        setRoadLocationProviderDetails(roadLocationProviderDetails_);
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
        if (isRoadLocationProviderDetailsUsed())
        {
            roadLocationProviderDetails_.initPackingContext(zserioContext.getRoadLocationProviderDetails());
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
        endBitPosition += 1;
        if (isRoadLocationProviderDetailsUsed())
        {
            endBitPosition += roadLocationProviderDetails_.bitSizeOf(endBitPosition);
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
        endBitPosition += 1;
        if (isRoadLocationProviderDetailsUsed())
        {
            endBitPosition += roadLocationProviderDetails_.bitSizeOf(zserioContext.getRoadLocationProviderDetails(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.characteristics.metadata.DisplayLineCharacsLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.characteristics.metadata.DisplayLineCharacsLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMetadata getDisplayLineRangeAttributeMetadata()
    {
        return displayLineRangeAttributeMetadata_;
    }

    public void setDisplayLineRangeAttributeMetadata(nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMetadata displayLineRangeAttributeMetadata_)
    {
        this.displayLineRangeAttributeMetadata_ = displayLineRangeAttributeMetadata_;
    }

    public boolean isDisplayLineRangeAttributeMetadataUsed()
    {
        return ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS) || (getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS));
    }

    public boolean isDisplayLineRangeAttributeMetadataSet()
    {
        return (displayLineRangeAttributeMetadata_ != null);
    }

    public void resetDisplayLineRangeAttributeMetadata()
    {
        this.displayLineRangeAttributeMetadata_ = null;
    }

    public nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMetadata getDisplayLinePositionAttributeMetadata()
    {
        return displayLinePositionAttributeMetadata_;
    }

    public void setDisplayLinePositionAttributeMetadata(nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMetadata displayLinePositionAttributeMetadata_)
    {
        this.displayLinePositionAttributeMetadata_ = displayLinePositionAttributeMetadata_;
    }

    public boolean isDisplayLinePositionAttributeMetadataUsed()
    {
        return ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS) || (getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS));
    }

    public boolean isDisplayLinePositionAttributeMetadataSet()
    {
        return (displayLinePositionAttributeMetadata_ != null);
    }

    public void resetDisplayLinePositionAttributeMetadata()
    {
        this.displayLinePositionAttributeMetadata_ = null;
    }

    public nds.characteristics.metadata.RoadLocationProviderDetails getRoadLocationProviderDetails()
    {
        return roadLocationProviderDetails_;
    }

    public void setRoadLocationProviderDetails(nds.characteristics.metadata.RoadLocationProviderDetails roadLocationProviderDetails_)
    {
        this.roadLocationProviderDetails_ = roadLocationProviderDetails_;
    }

    public boolean isRoadLocationProviderDetailsUsed()
    {
        return isRoadLocationProviderDetailsSet();
    }

    public boolean isRoadLocationProviderDetailsSet()
    {
        return (roadLocationProviderDetails_ != null);
    }

    public void resetRoadLocationProviderDetails()
    {
        this.roadLocationProviderDetails_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof DisplayLineCharacteristicsLayerMetadata)
        {
            final DisplayLineCharacteristicsLayerMetadata that = (DisplayLineCharacteristicsLayerMetadata)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((!isDisplayLineRangeAttributeMetadataUsed()) ? !that.isDisplayLineRangeAttributeMetadataUsed() :
                        ((displayLineRangeAttributeMetadata_ == null) ? that.displayLineRangeAttributeMetadata_ == null : displayLineRangeAttributeMetadata_.equals(that.displayLineRangeAttributeMetadata_))) &&
                    ((!isDisplayLinePositionAttributeMetadataUsed()) ? !that.isDisplayLinePositionAttributeMetadataUsed() :
                        ((displayLinePositionAttributeMetadata_ == null) ? that.displayLinePositionAttributeMetadata_ == null : displayLinePositionAttributeMetadata_.equals(that.displayLinePositionAttributeMetadata_))) &&
                    ((!isRoadLocationProviderDetailsUsed()) ? !that.isRoadLocationProviderDetailsUsed() :
                        ((roadLocationProviderDetails_ == null) ? that.roadLocationProviderDetails_ == null : roadLocationProviderDetails_.equals(that.roadLocationProviderDetails_)));
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
        if (isRoadLocationProviderDetailsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadLocationProviderDetails_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.characteristics.metadata.DisplayLineCharacsLayerContent(in);

        if ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS) || (getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS))
        {
            displayLineRangeAttributeMetadata_ = new nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMetadata(in);
        }

        if ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS) || (getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS))
        {
            displayLinePositionAttributeMetadata_ = new nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMetadata(in);
        }

        if (in.readBool())
        {
            roadLocationProviderDetails_ = new nds.characteristics.metadata.RoadLocationProviderDetails(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.characteristics.metadata.DisplayLineCharacsLayerContent(zserioContext.getContent(), in);

        if ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS) || (getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS))
        {
            displayLineRangeAttributeMetadata_ = new nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMetadata(zserioContext.getDisplayLineRangeAttributeMetadata(), in);
        }

        if ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS) || (getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS))
        {
            displayLinePositionAttributeMetadata_ = new nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMetadata(zserioContext.getDisplayLinePositionAttributeMetadata(), in);
        }

        if (in.readBool())
        {
            roadLocationProviderDetails_ = new nds.characteristics.metadata.RoadLocationProviderDetails(zserioContext.getRoadLocationProviderDetails(), in);
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
        endBitPosition += 1;
        if (isRoadLocationProviderDetailsUsed())
        {
            endBitPosition = roadLocationProviderDetails_.initializeOffsets(endBitPosition);
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
        endBitPosition += 1;
        if (isRoadLocationProviderDetailsUsed())
        {
            endBitPosition = roadLocationProviderDetails_.initializeOffsets(zserioContext.getRoadLocationProviderDetails(), endBitPosition);
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

        if (isRoadLocationProviderDetailsUsed())
        {
            out.writeBool(true);
            roadLocationProviderDetails_.write(out);
        }
        else
        {
            out.writeBool(false);
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

        if (isRoadLocationProviderDetailsUsed())
        {
            out.writeBool(true);
            roadLocationProviderDetails_.write(zserioContext.getRoadLocationProviderDetails(), out);
        }
        else
        {
            out.writeBool(false);
        }
    }

    private nds.characteristics.metadata.DisplayLineCharacsLayerContent content_;
    private nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMetadata displayLineRangeAttributeMetadata_;
    private nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMetadata displayLinePositionAttributeMetadata_;
    private nds.characteristics.metadata.RoadLocationProviderDetails roadLocationProviderDetails_;
}
