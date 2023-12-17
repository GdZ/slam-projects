/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.characteristics.layer;

public class RoadCharacteristicsLayerIndirect implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            shift_ = new zserio.runtime.array.DeltaContext();
            content_ = new zserio.runtime.array.DeltaContext();
            characsRoadRangeMaps_ = new nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeMapList.ZserioPackingContext();
            characsRoadPositionMaps_ = new nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeMapList.ZserioPackingContext();
            characsRoadRangeSets_ = new nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeSetList.ZserioPackingContext();
            characsRoadPositionSets_ = new nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeSetList.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getShift()
        {
            return shift_;
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeMapList.ZserioPackingContext getCharacsRoadRangeMaps()
        {
            return characsRoadRangeMaps_;
        }

        public nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeMapList.ZserioPackingContext getCharacsRoadPositionMaps()
        {
            return characsRoadPositionMaps_;
        }

        public nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeSetList.ZserioPackingContext getCharacsRoadRangeSets()
        {
            return characsRoadRangeSets_;
        }

        public nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeSetList.ZserioPackingContext getCharacsRoadPositionSets()
        {
            return characsRoadPositionSets_;
        }

        private zserio.runtime.array.DeltaContext shift_;
        private zserio.runtime.array.DeltaContext content_;
        private nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeMapList.ZserioPackingContext characsRoadRangeMaps_;
        private nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeMapList.ZserioPackingContext characsRoadPositionMaps_;
        private nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeSetList.ZserioPackingContext characsRoadRangeSets_;
        private nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeSetList.ZserioPackingContext characsRoadPositionSets_;
    };

    public RoadCharacteristicsLayerIndirect()
    {
    }

    public RoadCharacteristicsLayerIndirect(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoadCharacteristicsLayerIndirect(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoadCharacteristicsLayerIndirect(
            byte shift_,
            nds.characteristics.metadata.RoadCharacsLayerContent content_,
            nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeMapList characsRoadRangeMaps_,
            nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeMapList characsRoadPositionMaps_,
            nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeSetList characsRoadRangeSets_,
            nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeSetList characsRoadPositionSets_)
    {
        setShift(shift_);
        setContent(content_);
        setCharacsRoadRangeMaps(characsRoadRangeMaps_);
        setCharacsRoadPositionMaps(characsRoadPositionMaps_);
        setCharacsRoadRangeSets(characsRoadRangeSets_);
        setCharacsRoadPositionSets(characsRoadPositionSets_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getShift().init(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));
        content_.initPackingContext(zserioContext.getContent());
        if (isCharacsRoadRangeMapsUsed())
        {
            characsRoadRangeMaps_.initPackingContext(zserioContext.getCharacsRoadRangeMaps());
        }
        if (isCharacsRoadPositionMapsUsed())
        {
            characsRoadPositionMaps_.initPackingContext(zserioContext.getCharacsRoadPositionMaps());
        }
        if (isCharacsRoadRangeSetsUsed())
        {
            characsRoadRangeSets_.initPackingContext(zserioContext.getCharacsRoadRangeSets());
        }
        if (isCharacsRoadPositionSetsUsed())
        {
            characsRoadPositionSets_.initPackingContext(zserioContext.getCharacsRoadPositionSets());
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

        endBitPosition += 5;
        endBitPosition += content_.bitSizeOf(endBitPosition);
        if (isCharacsRoadRangeMapsUsed())
        {
            endBitPosition += characsRoadRangeMaps_.bitSizeOf(endBitPosition);
        }
        if (isCharacsRoadPositionMapsUsed())
        {
            endBitPosition += characsRoadPositionMaps_.bitSizeOf(endBitPosition);
        }
        if (isCharacsRoadRangeSetsUsed())
        {
            endBitPosition += characsRoadRangeSets_.bitSizeOf(endBitPosition);
        }
        if (isCharacsRoadPositionSetsUsed())
        {
            endBitPosition += characsRoadPositionSets_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getShift().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));
        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        if (isCharacsRoadRangeMapsUsed())
        {
            endBitPosition += characsRoadRangeMaps_.bitSizeOf(zserioContext.getCharacsRoadRangeMaps(), endBitPosition);
        }
        if (isCharacsRoadPositionMapsUsed())
        {
            endBitPosition += characsRoadPositionMaps_.bitSizeOf(zserioContext.getCharacsRoadPositionMaps(), endBitPosition);
        }
        if (isCharacsRoadRangeSetsUsed())
        {
            endBitPosition += characsRoadRangeSets_.bitSizeOf(zserioContext.getCharacsRoadRangeSets(), endBitPosition);
        }
        if (isCharacsRoadPositionSetsUsed())
        {
            endBitPosition += characsRoadPositionSets_.bitSizeOf(zserioContext.getCharacsRoadPositionSets(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public byte getShift()
    {
        return shift_;
    }

    public void setShift(byte shift_)
    {
        this.shift_ = shift_;
    }

    public nds.characteristics.metadata.RoadCharacsLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.characteristics.metadata.RoadCharacsLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeMapList getCharacsRoadRangeMaps()
    {
        return characsRoadRangeMaps_;
    }

    public void setCharacsRoadRangeMaps(nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeMapList characsRoadRangeMaps_)
    {
        this.characsRoadRangeMaps_ = characsRoadRangeMaps_;
    }

    public boolean isCharacsRoadRangeMapsUsed()
    {
        return ((getContent().and(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_RANGE_MAPS)).equals(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_RANGE_MAPS));
    }

    public boolean isCharacsRoadRangeMapsSet()
    {
        return (characsRoadRangeMaps_ != null);
    }

    public void resetCharacsRoadRangeMaps()
    {
        this.characsRoadRangeMaps_ = null;
    }

    public nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeMapList getCharacsRoadPositionMaps()
    {
        return characsRoadPositionMaps_;
    }

    public void setCharacsRoadPositionMaps(nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeMapList characsRoadPositionMaps_)
    {
        this.characsRoadPositionMaps_ = characsRoadPositionMaps_;
    }

    public boolean isCharacsRoadPositionMapsUsed()
    {
        return ((getContent().and(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_POSITION_MAPS)).equals(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_POSITION_MAPS));
    }

    public boolean isCharacsRoadPositionMapsSet()
    {
        return (characsRoadPositionMaps_ != null);
    }

    public void resetCharacsRoadPositionMaps()
    {
        this.characsRoadPositionMaps_ = null;
    }

    public nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeSetList getCharacsRoadRangeSets()
    {
        return characsRoadRangeSets_;
    }

    public void setCharacsRoadRangeSets(nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeSetList characsRoadRangeSets_)
    {
        this.characsRoadRangeSets_ = characsRoadRangeSets_;
    }

    public boolean isCharacsRoadRangeSetsUsed()
    {
        return ((getContent().and(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_RANGE_SETS)).equals(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_RANGE_SETS));
    }

    public boolean isCharacsRoadRangeSetsSet()
    {
        return (characsRoadRangeSets_ != null);
    }

    public void resetCharacsRoadRangeSets()
    {
        this.characsRoadRangeSets_ = null;
    }

    public nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeSetList getCharacsRoadPositionSets()
    {
        return characsRoadPositionSets_;
    }

    public void setCharacsRoadPositionSets(nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeSetList characsRoadPositionSets_)
    {
        this.characsRoadPositionSets_ = characsRoadPositionSets_;
    }

    public boolean isCharacsRoadPositionSetsUsed()
    {
        return ((getContent().and(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_POSITION_SETS)).equals(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_POSITION_SETS));
    }

    public boolean isCharacsRoadPositionSetsSet()
    {
        return (characsRoadPositionSets_ != null);
    }

    public void resetCharacsRoadPositionSets()
    {
        this.characsRoadPositionSets_ = null;
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.ATTRIBUTE);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoadCharacteristicsLayerIndirect)
        {
            final RoadCharacteristicsLayerIndirect that = (RoadCharacteristicsLayerIndirect)obj;

            return
                    shift_ == that.shift_ &&
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((!isCharacsRoadRangeMapsUsed()) ? !that.isCharacsRoadRangeMapsUsed() :
                        ((characsRoadRangeMaps_ == null) ? that.characsRoadRangeMaps_ == null : characsRoadRangeMaps_.equals(that.characsRoadRangeMaps_))) &&
                    ((!isCharacsRoadPositionMapsUsed()) ? !that.isCharacsRoadPositionMapsUsed() :
                        ((characsRoadPositionMaps_ == null) ? that.characsRoadPositionMaps_ == null : characsRoadPositionMaps_.equals(that.characsRoadPositionMaps_))) &&
                    ((!isCharacsRoadRangeSetsUsed()) ? !that.isCharacsRoadRangeSetsUsed() :
                        ((characsRoadRangeSets_ == null) ? that.characsRoadRangeSets_ == null : characsRoadRangeSets_.equals(that.characsRoadRangeSets_))) &&
                    ((!isCharacsRoadPositionSetsUsed()) ? !that.isCharacsRoadPositionSetsUsed() :
                        ((characsRoadPositionSets_ == null) ? that.characsRoadPositionSets_ == null : characsRoadPositionSets_.equals(that.characsRoadPositionSets_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, shift_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        if (isCharacsRoadRangeMapsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, characsRoadRangeMaps_);
        if (isCharacsRoadPositionMapsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, characsRoadPositionMaps_);
        if (isCharacsRoadRangeSetsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, characsRoadRangeSets_);
        if (isCharacsRoadPositionSetsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, characsRoadPositionSets_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        shift_ = (byte)in.readBits(5);

        content_ = new nds.characteristics.metadata.RoadCharacsLayerContent(in);

        if ((getContent().and(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_RANGE_MAPS)).equals(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_RANGE_MAPS))
        {
            characsRoadRangeMaps_ = new nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeMapList(in, (byte)(getShift()));
        }

        if ((getContent().and(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_POSITION_MAPS)).equals(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_POSITION_MAPS))
        {
            characsRoadPositionMaps_ = new nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeMapList(in, (byte)(getShift()));
        }

        if ((getContent().and(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_RANGE_SETS)).equals(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_RANGE_SETS))
        {
            characsRoadRangeSets_ = new nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeSetList(in, (byte)(getShift()));
        }

        if ((getContent().and(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_POSITION_SETS)).equals(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_POSITION_SETS))
        {
            characsRoadPositionSets_ = new nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeSetList(in, (byte)(getShift()));
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        shift_ = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                zserioContext.getShift().read(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), in)).get();

        content_ = new nds.characteristics.metadata.RoadCharacsLayerContent(zserioContext.getContent(), in);

        if ((getContent().and(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_RANGE_MAPS)).equals(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_RANGE_MAPS))
        {
            characsRoadRangeMaps_ = new nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeMapList(zserioContext.getCharacsRoadRangeMaps(), in, (byte)(getShift()));
        }

        if ((getContent().and(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_POSITION_MAPS)).equals(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_POSITION_MAPS))
        {
            characsRoadPositionMaps_ = new nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeMapList(zserioContext.getCharacsRoadPositionMaps(), in, (byte)(getShift()));
        }

        if ((getContent().and(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_RANGE_SETS)).equals(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_RANGE_SETS))
        {
            characsRoadRangeSets_ = new nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeSetList(zserioContext.getCharacsRoadRangeSets(), in, (byte)(getShift()));
        }

        if ((getContent().and(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_POSITION_SETS)).equals(nds.characteristics.metadata.RoadCharacsLayerContent.Values.ROAD_POSITION_SETS))
        {
            characsRoadPositionSets_ = new nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeSetList(zserioContext.getCharacsRoadPositionSets(), in, (byte)(getShift()));
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

        endBitPosition += 5;
        endBitPosition += content_.bitSizeOf(endBitPosition);
        if (isCharacsRoadRangeMapsUsed())
        {
            endBitPosition = characsRoadRangeMaps_.initializeOffsets(endBitPosition);
        }
        if (isCharacsRoadPositionMapsUsed())
        {
            endBitPosition = characsRoadPositionMaps_.initializeOffsets(endBitPosition);
        }
        if (isCharacsRoadRangeSetsUsed())
        {
            endBitPosition = characsRoadRangeSets_.initializeOffsets(endBitPosition);
        }
        if (isCharacsRoadPositionSetsUsed())
        {
            endBitPosition = characsRoadPositionSets_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getShift().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));
        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        if (isCharacsRoadRangeMapsUsed())
        {
            endBitPosition = characsRoadRangeMaps_.initializeOffsets(zserioContext.getCharacsRoadRangeMaps(), endBitPosition);
        }
        if (isCharacsRoadPositionMapsUsed())
        {
            endBitPosition = characsRoadPositionMaps_.initializeOffsets(zserioContext.getCharacsRoadPositionMaps(), endBitPosition);
        }
        if (isCharacsRoadRangeSetsUsed())
        {
            endBitPosition = characsRoadRangeSets_.initializeOffsets(zserioContext.getCharacsRoadRangeSets(), endBitPosition);
        }
        if (isCharacsRoadPositionSetsUsed())
        {
            endBitPosition = characsRoadPositionSets_.initializeOffsets(zserioContext.getCharacsRoadPositionSets(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBits(shift_, 5);

        content_.write(out);

        if (isCharacsRoadRangeMapsUsed())
        {
            // check parameters
            if (characsRoadRangeMaps_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadCharacteristicsLayerIndirect.characsRoadRangeMaps: " +
                        characsRoadRangeMaps_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            characsRoadRangeMaps_.write(out);
        }

        if (isCharacsRoadPositionMapsUsed())
        {
            // check parameters
            if (characsRoadPositionMaps_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadCharacteristicsLayerIndirect.characsRoadPositionMaps: " +
                        characsRoadPositionMaps_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            characsRoadPositionMaps_.write(out);
        }

        if (isCharacsRoadRangeSetsUsed())
        {
            // check parameters
            if (characsRoadRangeSets_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadCharacteristicsLayerIndirect.characsRoadRangeSets: " +
                        characsRoadRangeSets_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            characsRoadRangeSets_.write(out);
        }

        if (isCharacsRoadPositionSetsUsed())
        {
            // check parameters
            if (characsRoadPositionSets_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadCharacteristicsLayerIndirect.characsRoadPositionSets: " +
                        characsRoadPositionSets_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            characsRoadPositionSets_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getShift().write(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), out,
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));

        content_.write(zserioContext.getContent(), out);

        if (isCharacsRoadRangeMapsUsed())
        {
            characsRoadRangeMaps_.write(zserioContext.getCharacsRoadRangeMaps(), out);
        }

        if (isCharacsRoadPositionMapsUsed())
        {
            characsRoadPositionMaps_.write(zserioContext.getCharacsRoadPositionMaps(), out);
        }

        if (isCharacsRoadRangeSetsUsed())
        {
            characsRoadRangeSets_.write(zserioContext.getCharacsRoadRangeSets(), out);
        }

        if (isCharacsRoadPositionSetsUsed())
        {
            characsRoadPositionSets_.write(zserioContext.getCharacsRoadPositionSets(), out);
        }
    }

    private byte shift_;
    private nds.characteristics.metadata.RoadCharacsLayerContent content_;
    private nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeMapList characsRoadRangeMaps_;
    private nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeMapList characsRoadPositionMaps_;
    private nds.characteristics.instantiations.CharacsIndirectRoadRangeAttributeSetList characsRoadRangeSets_;
    private nds.characteristics.instantiations.CharacsIndirectRoadPositionAttributeSetList characsRoadPositionSets_;
}
