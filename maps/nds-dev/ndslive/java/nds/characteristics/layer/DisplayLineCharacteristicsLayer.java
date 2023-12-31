/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.characteristics.layer;

public class DisplayLineCharacteristicsLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            shift_ = new zserio.runtime.array.DeltaContext();
            characsDisplayLineRangeMaps_ = new nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMapList.ZserioPackingContext();
            characsDisplayLinePositionMaps_ = new nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMapList.ZserioPackingContext();
            characsDisplayLineRangeSets_ = new nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeSetList.ZserioPackingContext();
            characsDisplayLinePositionSets_ = new nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeSetList.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public zserio.runtime.array.DeltaContext getShift()
        {
            return shift_;
        }

        public nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMapList.ZserioPackingContext getCharacsDisplayLineRangeMaps()
        {
            return characsDisplayLineRangeMaps_;
        }

        public nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMapList.ZserioPackingContext getCharacsDisplayLinePositionMaps()
        {
            return characsDisplayLinePositionMaps_;
        }

        public nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeSetList.ZserioPackingContext getCharacsDisplayLineRangeSets()
        {
            return characsDisplayLineRangeSets_;
        }

        public nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeSetList.ZserioPackingContext getCharacsDisplayLinePositionSets()
        {
            return characsDisplayLinePositionSets_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private zserio.runtime.array.DeltaContext shift_;
        private nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMapList.ZserioPackingContext characsDisplayLineRangeMaps_;
        private nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMapList.ZserioPackingContext characsDisplayLinePositionMaps_;
        private nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeSetList.ZserioPackingContext characsDisplayLineRangeSets_;
        private nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeSetList.ZserioPackingContext characsDisplayLinePositionSets_;
    };

    public DisplayLineCharacteristicsLayer()
    {
    }

    public DisplayLineCharacteristicsLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public DisplayLineCharacteristicsLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public DisplayLineCharacteristicsLayer(
            nds.characteristics.metadata.DisplayLineCharacsLayerContent content_,
            byte shift_,
            nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMapList characsDisplayLineRangeMaps_,
            nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMapList characsDisplayLinePositionMaps_,
            nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeSetList characsDisplayLineRangeSets_,
            nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeSetList characsDisplayLinePositionSets_)
    {
        setContent(content_);
        setShift(shift_);
        setCharacsDisplayLineRangeMaps(characsDisplayLineRangeMaps_);
        setCharacsDisplayLinePositionMaps(characsDisplayLinePositionMaps_);
        setCharacsDisplayLineRangeSets(characsDisplayLineRangeSets_);
        setCharacsDisplayLinePositionSets(characsDisplayLinePositionSets_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        zserioContext.getShift().init(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));
        if (isCharacsDisplayLineRangeMapsUsed())
        {
            characsDisplayLineRangeMaps_.initPackingContext(zserioContext.getCharacsDisplayLineRangeMaps());
        }
        if (isCharacsDisplayLinePositionMapsUsed())
        {
            characsDisplayLinePositionMaps_.initPackingContext(zserioContext.getCharacsDisplayLinePositionMaps());
        }
        if (isCharacsDisplayLineRangeSetsUsed())
        {
            characsDisplayLineRangeSets_.initPackingContext(zserioContext.getCharacsDisplayLineRangeSets());
        }
        if (isCharacsDisplayLinePositionSetsUsed())
        {
            characsDisplayLinePositionSets_.initPackingContext(zserioContext.getCharacsDisplayLinePositionSets());
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
        endBitPosition += 5;
        if (isCharacsDisplayLineRangeMapsUsed())
        {
            endBitPosition += characsDisplayLineRangeMaps_.bitSizeOf(endBitPosition);
        }
        if (isCharacsDisplayLinePositionMapsUsed())
        {
            endBitPosition += characsDisplayLinePositionMaps_.bitSizeOf(endBitPosition);
        }
        if (isCharacsDisplayLineRangeSetsUsed())
        {
            endBitPosition += characsDisplayLineRangeSets_.bitSizeOf(endBitPosition);
        }
        if (isCharacsDisplayLinePositionSetsUsed())
        {
            endBitPosition += characsDisplayLinePositionSets_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        endBitPosition += zserioContext.getShift().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));
        if (isCharacsDisplayLineRangeMapsUsed())
        {
            endBitPosition += characsDisplayLineRangeMaps_.bitSizeOf(zserioContext.getCharacsDisplayLineRangeMaps(), endBitPosition);
        }
        if (isCharacsDisplayLinePositionMapsUsed())
        {
            endBitPosition += characsDisplayLinePositionMaps_.bitSizeOf(zserioContext.getCharacsDisplayLinePositionMaps(), endBitPosition);
        }
        if (isCharacsDisplayLineRangeSetsUsed())
        {
            endBitPosition += characsDisplayLineRangeSets_.bitSizeOf(zserioContext.getCharacsDisplayLineRangeSets(), endBitPosition);
        }
        if (isCharacsDisplayLinePositionSetsUsed())
        {
            endBitPosition += characsDisplayLinePositionSets_.bitSizeOf(zserioContext.getCharacsDisplayLinePositionSets(), endBitPosition);
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

    public byte getShift()
    {
        return shift_;
    }

    public void setShift(byte shift_)
    {
        this.shift_ = shift_;
    }

    public nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMapList getCharacsDisplayLineRangeMaps()
    {
        return characsDisplayLineRangeMaps_;
    }

    public void setCharacsDisplayLineRangeMaps(nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMapList characsDisplayLineRangeMaps_)
    {
        this.characsDisplayLineRangeMaps_ = characsDisplayLineRangeMaps_;
    }

    public boolean isCharacsDisplayLineRangeMapsUsed()
    {
        return ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS));
    }

    public boolean isCharacsDisplayLineRangeMapsSet()
    {
        return (characsDisplayLineRangeMaps_ != null);
    }

    public void resetCharacsDisplayLineRangeMaps()
    {
        this.characsDisplayLineRangeMaps_ = null;
    }

    public nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMapList getCharacsDisplayLinePositionMaps()
    {
        return characsDisplayLinePositionMaps_;
    }

    public void setCharacsDisplayLinePositionMaps(nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMapList characsDisplayLinePositionMaps_)
    {
        this.characsDisplayLinePositionMaps_ = characsDisplayLinePositionMaps_;
    }

    public boolean isCharacsDisplayLinePositionMapsUsed()
    {
        return ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS));
    }

    public boolean isCharacsDisplayLinePositionMapsSet()
    {
        return (characsDisplayLinePositionMaps_ != null);
    }

    public void resetCharacsDisplayLinePositionMaps()
    {
        this.characsDisplayLinePositionMaps_ = null;
    }

    public nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeSetList getCharacsDisplayLineRangeSets()
    {
        return characsDisplayLineRangeSets_;
    }

    public void setCharacsDisplayLineRangeSets(nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeSetList characsDisplayLineRangeSets_)
    {
        this.characsDisplayLineRangeSets_ = characsDisplayLineRangeSets_;
    }

    public boolean isCharacsDisplayLineRangeSetsUsed()
    {
        return ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS));
    }

    public boolean isCharacsDisplayLineRangeSetsSet()
    {
        return (characsDisplayLineRangeSets_ != null);
    }

    public void resetCharacsDisplayLineRangeSets()
    {
        this.characsDisplayLineRangeSets_ = null;
    }

    public nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeSetList getCharacsDisplayLinePositionSets()
    {
        return characsDisplayLinePositionSets_;
    }

    public void setCharacsDisplayLinePositionSets(nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeSetList characsDisplayLinePositionSets_)
    {
        this.characsDisplayLinePositionSets_ = characsDisplayLinePositionSets_;
    }

    public boolean isCharacsDisplayLinePositionSetsUsed()
    {
        return ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS));
    }

    public boolean isCharacsDisplayLinePositionSetsSet()
    {
        return (characsDisplayLinePositionSets_ != null);
    }

    public void resetCharacsDisplayLinePositionSets()
    {
        this.characsDisplayLinePositionSets_ = null;
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.ATTRIBUTE);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof DisplayLineCharacteristicsLayer)
        {
            final DisplayLineCharacteristicsLayer that = (DisplayLineCharacteristicsLayer)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    shift_ == that.shift_ &&
                    ((!isCharacsDisplayLineRangeMapsUsed()) ? !that.isCharacsDisplayLineRangeMapsUsed() :
                        ((characsDisplayLineRangeMaps_ == null) ? that.characsDisplayLineRangeMaps_ == null : characsDisplayLineRangeMaps_.equals(that.characsDisplayLineRangeMaps_))) &&
                    ((!isCharacsDisplayLinePositionMapsUsed()) ? !that.isCharacsDisplayLinePositionMapsUsed() :
                        ((characsDisplayLinePositionMaps_ == null) ? that.characsDisplayLinePositionMaps_ == null : characsDisplayLinePositionMaps_.equals(that.characsDisplayLinePositionMaps_))) &&
                    ((!isCharacsDisplayLineRangeSetsUsed()) ? !that.isCharacsDisplayLineRangeSetsUsed() :
                        ((characsDisplayLineRangeSets_ == null) ? that.characsDisplayLineRangeSets_ == null : characsDisplayLineRangeSets_.equals(that.characsDisplayLineRangeSets_))) &&
                    ((!isCharacsDisplayLinePositionSetsUsed()) ? !that.isCharacsDisplayLinePositionSetsUsed() :
                        ((characsDisplayLinePositionSets_ == null) ? that.characsDisplayLinePositionSets_ == null : characsDisplayLinePositionSets_.equals(that.characsDisplayLinePositionSets_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, shift_);
        if (isCharacsDisplayLineRangeMapsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, characsDisplayLineRangeMaps_);
        if (isCharacsDisplayLinePositionMapsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, characsDisplayLinePositionMaps_);
        if (isCharacsDisplayLineRangeSetsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, characsDisplayLineRangeSets_);
        if (isCharacsDisplayLinePositionSetsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, characsDisplayLinePositionSets_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.characteristics.metadata.DisplayLineCharacsLayerContent(in);

        shift_ = (byte)in.readBits(5);

        if ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS))
        {
            characsDisplayLineRangeMaps_ = new nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMapList(in, (byte)(getShift()));
        }

        if ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS))
        {
            characsDisplayLinePositionMaps_ = new nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMapList(in, (byte)(getShift()));
        }

        if ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS))
        {
            characsDisplayLineRangeSets_ = new nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeSetList(in, (byte)(getShift()));
        }

        if ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS))
        {
            characsDisplayLinePositionSets_ = new nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeSetList(in, (byte)(0));
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.characteristics.metadata.DisplayLineCharacsLayerContent(zserioContext.getContent(), in);

        shift_ = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                zserioContext.getShift().read(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), in)).get();

        if ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS))
        {
            characsDisplayLineRangeMaps_ = new nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMapList(zserioContext.getCharacsDisplayLineRangeMaps(), in, (byte)(getShift()));
        }

        if ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS))
        {
            characsDisplayLinePositionMaps_ = new nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMapList(zserioContext.getCharacsDisplayLinePositionMaps(), in, (byte)(getShift()));
        }

        if ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS))
        {
            characsDisplayLineRangeSets_ = new nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeSetList(zserioContext.getCharacsDisplayLineRangeSets(), in, (byte)(getShift()));
        }

        if ((getContent().and(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS)).equals(nds.characteristics.metadata.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS))
        {
            characsDisplayLinePositionSets_ = new nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeSetList(zserioContext.getCharacsDisplayLinePositionSets(), in, (byte)(0));
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
        endBitPosition += 5;
        if (isCharacsDisplayLineRangeMapsUsed())
        {
            endBitPosition = characsDisplayLineRangeMaps_.initializeOffsets(endBitPosition);
        }
        if (isCharacsDisplayLinePositionMapsUsed())
        {
            endBitPosition = characsDisplayLinePositionMaps_.initializeOffsets(endBitPosition);
        }
        if (isCharacsDisplayLineRangeSetsUsed())
        {
            endBitPosition = characsDisplayLineRangeSets_.initializeOffsets(endBitPosition);
        }
        if (isCharacsDisplayLinePositionSetsUsed())
        {
            endBitPosition = characsDisplayLinePositionSets_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        endBitPosition += zserioContext.getShift().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));
        if (isCharacsDisplayLineRangeMapsUsed())
        {
            endBitPosition = characsDisplayLineRangeMaps_.initializeOffsets(zserioContext.getCharacsDisplayLineRangeMaps(), endBitPosition);
        }
        if (isCharacsDisplayLinePositionMapsUsed())
        {
            endBitPosition = characsDisplayLinePositionMaps_.initializeOffsets(zserioContext.getCharacsDisplayLinePositionMaps(), endBitPosition);
        }
        if (isCharacsDisplayLineRangeSetsUsed())
        {
            endBitPosition = characsDisplayLineRangeSets_.initializeOffsets(zserioContext.getCharacsDisplayLineRangeSets(), endBitPosition);
        }
        if (isCharacsDisplayLinePositionSetsUsed())
        {
            endBitPosition = characsDisplayLinePositionSets_.initializeOffsets(zserioContext.getCharacsDisplayLinePositionSets(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        out.writeBits(shift_, 5);

        if (isCharacsDisplayLineRangeMapsUsed())
        {
            // check parameters
            if (characsDisplayLineRangeMaps_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field DisplayLineCharacteristicsLayer.characsDisplayLineRangeMaps: " +
                        characsDisplayLineRangeMaps_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            characsDisplayLineRangeMaps_.write(out);
        }

        if (isCharacsDisplayLinePositionMapsUsed())
        {
            // check parameters
            if (characsDisplayLinePositionMaps_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field DisplayLineCharacteristicsLayer.characsDisplayLinePositionMaps: " +
                        characsDisplayLinePositionMaps_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            characsDisplayLinePositionMaps_.write(out);
        }

        if (isCharacsDisplayLineRangeSetsUsed())
        {
            // check parameters
            if (characsDisplayLineRangeSets_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field DisplayLineCharacteristicsLayer.characsDisplayLineRangeSets: " +
                        characsDisplayLineRangeSets_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            characsDisplayLineRangeSets_.write(out);
        }

        if (isCharacsDisplayLinePositionSetsUsed())
        {
            // check parameters
            if (characsDisplayLinePositionSets_.getCoordShift() != (byte)(0))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field DisplayLineCharacteristicsLayer.characsDisplayLinePositionSets: " +
                        characsDisplayLinePositionSets_.getCoordShift() + " != " + (byte)(0) + "!");
            }
            characsDisplayLinePositionSets_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(zserioContext.getContent(), out);

        zserioContext.getShift().write(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), out,
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));

        if (isCharacsDisplayLineRangeMapsUsed())
        {
            characsDisplayLineRangeMaps_.write(zserioContext.getCharacsDisplayLineRangeMaps(), out);
        }

        if (isCharacsDisplayLinePositionMapsUsed())
        {
            characsDisplayLinePositionMaps_.write(zserioContext.getCharacsDisplayLinePositionMaps(), out);
        }

        if (isCharacsDisplayLineRangeSetsUsed())
        {
            characsDisplayLineRangeSets_.write(zserioContext.getCharacsDisplayLineRangeSets(), out);
        }

        if (isCharacsDisplayLinePositionSetsUsed())
        {
            characsDisplayLinePositionSets_.write(zserioContext.getCharacsDisplayLinePositionSets(), out);
        }
    }

    private nds.characteristics.metadata.DisplayLineCharacsLayerContent content_;
    private byte shift_;
    private nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeMapList characsDisplayLineRangeMaps_;
    private nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeMapList characsDisplayLinePositionMaps_;
    private nds.characteristics.instantiations.CharacsDisplayLineRangeAttributeSetList characsDisplayLineRangeSets_;
    private nds.characteristics.instantiations.CharacsDisplayLinePositionAttributeSetList characsDisplayLinePositionSets_;
}
