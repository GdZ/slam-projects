/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.characteristics.layer;

public class RoadLocationCharacteristicsLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            shift_ = new zserio.runtime.array.DeltaContext();
            characsRoadLocationRangeMaps_ = new nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeMapList.ZserioPackingContext();
            characsRoadLocationRangeSets_ = new nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeSetList.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public zserio.runtime.array.DeltaContext getShift()
        {
            return shift_;
        }

        public nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeMapList.ZserioPackingContext getCharacsRoadLocationRangeMaps()
        {
            return characsRoadLocationRangeMaps_;
        }

        public nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeSetList.ZserioPackingContext getCharacsRoadLocationRangeSets()
        {
            return characsRoadLocationRangeSets_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private zserio.runtime.array.DeltaContext shift_;
        private nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeMapList.ZserioPackingContext characsRoadLocationRangeMaps_;
        private nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeSetList.ZserioPackingContext characsRoadLocationRangeSets_;
    };

    public RoadLocationCharacteristicsLayer()
    {
    }

    public RoadLocationCharacteristicsLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoadLocationCharacteristicsLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoadLocationCharacteristicsLayer(
            nds.characteristics.metadata.RoadLocationCharacsLayerContent content_,
            byte shift_,
            nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeMapList characsRoadLocationRangeMaps_,
            nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeSetList characsRoadLocationRangeSets_)
    {
        setContent(content_);
        setShift(shift_);
        setCharacsRoadLocationRangeMaps(characsRoadLocationRangeMaps_);
        setCharacsRoadLocationRangeSets(characsRoadLocationRangeSets_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        zserioContext.getShift().init(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));
        if (isCharacsRoadLocationRangeMapsUsed())
        {
            characsRoadLocationRangeMaps_.initPackingContext(zserioContext.getCharacsRoadLocationRangeMaps());
        }
        if (isCharacsRoadLocationRangeSetsUsed())
        {
            characsRoadLocationRangeSets_.initPackingContext(zserioContext.getCharacsRoadLocationRangeSets());
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
        if (isCharacsRoadLocationRangeMapsUsed())
        {
            endBitPosition += characsRoadLocationRangeMaps_.bitSizeOf(endBitPosition);
        }
        if (isCharacsRoadLocationRangeSetsUsed())
        {
            endBitPosition += characsRoadLocationRangeSets_.bitSizeOf(endBitPosition);
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
        if (isCharacsRoadLocationRangeMapsUsed())
        {
            endBitPosition += characsRoadLocationRangeMaps_.bitSizeOf(zserioContext.getCharacsRoadLocationRangeMaps(), endBitPosition);
        }
        if (isCharacsRoadLocationRangeSetsUsed())
        {
            endBitPosition += characsRoadLocationRangeSets_.bitSizeOf(zserioContext.getCharacsRoadLocationRangeSets(), endBitPosition);
        }

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

    public byte getShift()
    {
        return shift_;
    }

    public void setShift(byte shift_)
    {
        this.shift_ = shift_;
    }

    public nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeMapList getCharacsRoadLocationRangeMaps()
    {
        return characsRoadLocationRangeMaps_;
    }

    public void setCharacsRoadLocationRangeMaps(nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeMapList characsRoadLocationRangeMaps_)
    {
        this.characsRoadLocationRangeMaps_ = characsRoadLocationRangeMaps_;
    }

    public boolean isCharacsRoadLocationRangeMapsUsed()
    {
        return ((getContent().and(nds.characteristics.metadata.RoadLocationCharacsLayerContent.Values.ROAD_LOCATION_MAPS)).equals(nds.characteristics.metadata.RoadLocationCharacsLayerContent.Values.ROAD_LOCATION_MAPS));
    }

    public boolean isCharacsRoadLocationRangeMapsSet()
    {
        return (characsRoadLocationRangeMaps_ != null);
    }

    public void resetCharacsRoadLocationRangeMaps()
    {
        this.characsRoadLocationRangeMaps_ = null;
    }

    public nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeSetList getCharacsRoadLocationRangeSets()
    {
        return characsRoadLocationRangeSets_;
    }

    public void setCharacsRoadLocationRangeSets(nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeSetList characsRoadLocationRangeSets_)
    {
        this.characsRoadLocationRangeSets_ = characsRoadLocationRangeSets_;
    }

    public boolean isCharacsRoadLocationRangeSetsUsed()
    {
        return ((getContent().and(nds.characteristics.metadata.RoadLocationCharacsLayerContent.Values.ROAD_LOCATION_SETS)).equals(nds.characteristics.metadata.RoadLocationCharacsLayerContent.Values.ROAD_LOCATION_SETS));
    }

    public boolean isCharacsRoadLocationRangeSetsSet()
    {
        return (characsRoadLocationRangeSets_ != null);
    }

    public void resetCharacsRoadLocationRangeSets()
    {
        this.characsRoadLocationRangeSets_ = null;
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.ATTRIBUTE);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoadLocationCharacteristicsLayer)
        {
            final RoadLocationCharacteristicsLayer that = (RoadLocationCharacteristicsLayer)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    shift_ == that.shift_ &&
                    ((!isCharacsRoadLocationRangeMapsUsed()) ? !that.isCharacsRoadLocationRangeMapsUsed() :
                        ((characsRoadLocationRangeMaps_ == null) ? that.characsRoadLocationRangeMaps_ == null : characsRoadLocationRangeMaps_.equals(that.characsRoadLocationRangeMaps_))) &&
                    ((!isCharacsRoadLocationRangeSetsUsed()) ? !that.isCharacsRoadLocationRangeSetsUsed() :
                        ((characsRoadLocationRangeSets_ == null) ? that.characsRoadLocationRangeSets_ == null : characsRoadLocationRangeSets_.equals(that.characsRoadLocationRangeSets_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, shift_);
        if (isCharacsRoadLocationRangeMapsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, characsRoadLocationRangeMaps_);
        if (isCharacsRoadLocationRangeSetsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, characsRoadLocationRangeSets_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.characteristics.metadata.RoadLocationCharacsLayerContent(in);

        shift_ = (byte)in.readBits(5);

        if ((getContent().and(nds.characteristics.metadata.RoadLocationCharacsLayerContent.Values.ROAD_LOCATION_MAPS)).equals(nds.characteristics.metadata.RoadLocationCharacsLayerContent.Values.ROAD_LOCATION_MAPS))
        {
            characsRoadLocationRangeMaps_ = new nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeMapList(in, (byte)(getShift()));
        }

        if ((getContent().and(nds.characteristics.metadata.RoadLocationCharacsLayerContent.Values.ROAD_LOCATION_SETS)).equals(nds.characteristics.metadata.RoadLocationCharacsLayerContent.Values.ROAD_LOCATION_SETS))
        {
            characsRoadLocationRangeSets_ = new nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeSetList(in, (byte)(getShift()));
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.characteristics.metadata.RoadLocationCharacsLayerContent(zserioContext.getContent(), in);

        shift_ = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                zserioContext.getShift().read(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), in)).get();

        if ((getContent().and(nds.characteristics.metadata.RoadLocationCharacsLayerContent.Values.ROAD_LOCATION_MAPS)).equals(nds.characteristics.metadata.RoadLocationCharacsLayerContent.Values.ROAD_LOCATION_MAPS))
        {
            characsRoadLocationRangeMaps_ = new nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeMapList(zserioContext.getCharacsRoadLocationRangeMaps(), in, (byte)(getShift()));
        }

        if ((getContent().and(nds.characteristics.metadata.RoadLocationCharacsLayerContent.Values.ROAD_LOCATION_SETS)).equals(nds.characteristics.metadata.RoadLocationCharacsLayerContent.Values.ROAD_LOCATION_SETS))
        {
            characsRoadLocationRangeSets_ = new nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeSetList(zserioContext.getCharacsRoadLocationRangeSets(), in, (byte)(getShift()));
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
        if (isCharacsRoadLocationRangeMapsUsed())
        {
            endBitPosition = characsRoadLocationRangeMaps_.initializeOffsets(endBitPosition);
        }
        if (isCharacsRoadLocationRangeSetsUsed())
        {
            endBitPosition = characsRoadLocationRangeSets_.initializeOffsets(endBitPosition);
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
        if (isCharacsRoadLocationRangeMapsUsed())
        {
            endBitPosition = characsRoadLocationRangeMaps_.initializeOffsets(zserioContext.getCharacsRoadLocationRangeMaps(), endBitPosition);
        }
        if (isCharacsRoadLocationRangeSetsUsed())
        {
            endBitPosition = characsRoadLocationRangeSets_.initializeOffsets(zserioContext.getCharacsRoadLocationRangeSets(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        out.writeBits(shift_, 5);

        if (isCharacsRoadLocationRangeMapsUsed())
        {
            // check parameters
            if (characsRoadLocationRangeMaps_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadLocationCharacteristicsLayer.characsRoadLocationRangeMaps: " +
                        characsRoadLocationRangeMaps_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            characsRoadLocationRangeMaps_.write(out);
        }

        if (isCharacsRoadLocationRangeSetsUsed())
        {
            // check parameters
            if (characsRoadLocationRangeSets_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadLocationCharacteristicsLayer.characsRoadLocationRangeSets: " +
                        characsRoadLocationRangeSets_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            characsRoadLocationRangeSets_.write(out);
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

        if (isCharacsRoadLocationRangeMapsUsed())
        {
            characsRoadLocationRangeMaps_.write(zserioContext.getCharacsRoadLocationRangeMaps(), out);
        }

        if (isCharacsRoadLocationRangeSetsUsed())
        {
            characsRoadLocationRangeSets_.write(zserioContext.getCharacsRoadLocationRangeSets(), out);
        }
    }

    private nds.characteristics.metadata.RoadLocationCharacsLayerContent content_;
    private byte shift_;
    private nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeMapList characsRoadLocationRangeMaps_;
    private nds.characteristics.instantiations.CharacsRoadLocationRangeAttributeSetList characsRoadLocationRangeSets_;
}
