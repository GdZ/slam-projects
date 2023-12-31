/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.traffic.layer;

public class RoadTrafficLayerIndirect implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
            shift_ = new zserio.runtime.array.DeltaContext();
            roadRangeAttributeMaps_ = new nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeMapList.ZserioPackingContext();
            roadRangeAttributeSets_ = new nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeSetList.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        public zserio.runtime.array.DeltaContext getShift()
        {
            return shift_;
        }

        public nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeMapList.ZserioPackingContext getRoadRangeAttributeMaps()
        {
            return roadRangeAttributeMaps_;
        }

        public nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeSetList.ZserioPackingContext getRoadRangeAttributeSets()
        {
            return roadRangeAttributeSets_;
        }

        private zserio.runtime.array.DeltaContext content_;
        private zserio.runtime.array.DeltaContext shift_;
        private nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeMapList.ZserioPackingContext roadRangeAttributeMaps_;
        private nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeSetList.ZserioPackingContext roadRangeAttributeSets_;
    };

    public RoadTrafficLayerIndirect()
    {
    }

    public RoadTrafficLayerIndirect(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoadTrafficLayerIndirect(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoadTrafficLayerIndirect(
            nds.traffic.metadata.RoadTrafficLayerContent content_,
            byte shift_,
            nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeMapList roadRangeAttributeMaps_,
            nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeSetList roadRangeAttributeSets_)
    {
        setContent(content_);
        setShift(shift_);
        setRoadRangeAttributeMaps(roadRangeAttributeMaps_);
        setRoadRangeAttributeSets(roadRangeAttributeSets_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
        zserioContext.getShift().init(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));
        if (isRoadRangeAttributeMapsUsed())
        {
            roadRangeAttributeMaps_.initPackingContext(zserioContext.getRoadRangeAttributeMaps());
        }
        if (isRoadRangeAttributeSetsUsed())
        {
            roadRangeAttributeSets_.initPackingContext(zserioContext.getRoadRangeAttributeSets());
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
        if (isRoadRangeAttributeMapsUsed())
        {
            endBitPosition += roadRangeAttributeMaps_.bitSizeOf(endBitPosition);
        }
        if (isRoadRangeAttributeSetsUsed())
        {
            endBitPosition += roadRangeAttributeSets_.bitSizeOf(endBitPosition);
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
        if (isRoadRangeAttributeMapsUsed())
        {
            endBitPosition += roadRangeAttributeMaps_.bitSizeOf(zserioContext.getRoadRangeAttributeMaps(), endBitPosition);
        }
        if (isRoadRangeAttributeSetsUsed())
        {
            endBitPosition += roadRangeAttributeSets_.bitSizeOf(zserioContext.getRoadRangeAttributeSets(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.traffic.metadata.RoadTrafficLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.traffic.metadata.RoadTrafficLayerContent content_)
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

    public nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeMapList getRoadRangeAttributeMaps()
    {
        return roadRangeAttributeMaps_;
    }

    public void setRoadRangeAttributeMaps(nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeMapList roadRangeAttributeMaps_)
    {
        this.roadRangeAttributeMaps_ = roadRangeAttributeMaps_;
    }

    public boolean isRoadRangeAttributeMapsUsed()
    {
        return ((getContent().and(nds.traffic.metadata.RoadTrafficLayerContent.Values.ROAD_RANGE_MAPS)).equals(nds.traffic.metadata.RoadTrafficLayerContent.Values.ROAD_RANGE_MAPS));
    }

    public boolean isRoadRangeAttributeMapsSet()
    {
        return (roadRangeAttributeMaps_ != null);
    }

    public void resetRoadRangeAttributeMaps()
    {
        this.roadRangeAttributeMaps_ = null;
    }

    public nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeSetList getRoadRangeAttributeSets()
    {
        return roadRangeAttributeSets_;
    }

    public void setRoadRangeAttributeSets(nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeSetList roadRangeAttributeSets_)
    {
        this.roadRangeAttributeSets_ = roadRangeAttributeSets_;
    }

    public boolean isRoadRangeAttributeSetsUsed()
    {
        return ((getContent().and(nds.traffic.metadata.RoadTrafficLayerContent.Values.ROAD_RANGE_SETS)).equals(nds.traffic.metadata.RoadTrafficLayerContent.Values.ROAD_RANGE_SETS));
    }

    public boolean isRoadRangeAttributeSetsSet()
    {
        return (roadRangeAttributeSets_ != null);
    }

    public void resetRoadRangeAttributeSets()
    {
        this.roadRangeAttributeSets_ = null;
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.ATTRIBUTE);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoadTrafficLayerIndirect)
        {
            final RoadTrafficLayerIndirect that = (RoadTrafficLayerIndirect)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    shift_ == that.shift_ &&
                    ((!isRoadRangeAttributeMapsUsed()) ? !that.isRoadRangeAttributeMapsUsed() :
                        ((roadRangeAttributeMaps_ == null) ? that.roadRangeAttributeMaps_ == null : roadRangeAttributeMaps_.equals(that.roadRangeAttributeMaps_))) &&
                    ((!isRoadRangeAttributeSetsUsed()) ? !that.isRoadRangeAttributeSetsUsed() :
                        ((roadRangeAttributeSets_ == null) ? that.roadRangeAttributeSets_ == null : roadRangeAttributeSets_.equals(that.roadRangeAttributeSets_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, shift_);
        if (isRoadRangeAttributeMapsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadRangeAttributeMaps_);
        if (isRoadRangeAttributeSetsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadRangeAttributeSets_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.traffic.metadata.RoadTrafficLayerContent(in);

        shift_ = (byte)in.readBits(5);

        if ((getContent().and(nds.traffic.metadata.RoadTrafficLayerContent.Values.ROAD_RANGE_MAPS)).equals(nds.traffic.metadata.RoadTrafficLayerContent.Values.ROAD_RANGE_MAPS))
        {
            roadRangeAttributeMaps_ = new nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeMapList(in, (byte)(getShift()));
        }

        if ((getContent().and(nds.traffic.metadata.RoadTrafficLayerContent.Values.ROAD_RANGE_SETS)).equals(nds.traffic.metadata.RoadTrafficLayerContent.Values.ROAD_RANGE_SETS))
        {
            roadRangeAttributeSets_ = new nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeSetList(in, (byte)(getShift()));
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.traffic.metadata.RoadTrafficLayerContent(zserioContext.getContent(), in);

        shift_ = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                zserioContext.getShift().read(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), in)).get();

        if ((getContent().and(nds.traffic.metadata.RoadTrafficLayerContent.Values.ROAD_RANGE_MAPS)).equals(nds.traffic.metadata.RoadTrafficLayerContent.Values.ROAD_RANGE_MAPS))
        {
            roadRangeAttributeMaps_ = new nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeMapList(zserioContext.getRoadRangeAttributeMaps(), in, (byte)(getShift()));
        }

        if ((getContent().and(nds.traffic.metadata.RoadTrafficLayerContent.Values.ROAD_RANGE_SETS)).equals(nds.traffic.metadata.RoadTrafficLayerContent.Values.ROAD_RANGE_SETS))
        {
            roadRangeAttributeSets_ = new nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeSetList(zserioContext.getRoadRangeAttributeSets(), in, (byte)(getShift()));
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
        if (isRoadRangeAttributeMapsUsed())
        {
            endBitPosition = roadRangeAttributeMaps_.initializeOffsets(endBitPosition);
        }
        if (isRoadRangeAttributeSetsUsed())
        {
            endBitPosition = roadRangeAttributeSets_.initializeOffsets(endBitPosition);
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
        if (isRoadRangeAttributeMapsUsed())
        {
            endBitPosition = roadRangeAttributeMaps_.initializeOffsets(zserioContext.getRoadRangeAttributeMaps(), endBitPosition);
        }
        if (isRoadRangeAttributeSetsUsed())
        {
            endBitPosition = roadRangeAttributeSets_.initializeOffsets(zserioContext.getRoadRangeAttributeSets(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        out.writeBits(shift_, 5);

        if (isRoadRangeAttributeMapsUsed())
        {
            // check parameters
            if (roadRangeAttributeMaps_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadTrafficLayerIndirect.roadRangeAttributeMaps: " +
                        roadRangeAttributeMaps_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            roadRangeAttributeMaps_.write(out);
        }

        if (isRoadRangeAttributeSetsUsed())
        {
            // check parameters
            if (roadRangeAttributeSets_.getCoordShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter coordShift for field RoadTrafficLayerIndirect.roadRangeAttributeSets: " +
                        roadRangeAttributeSets_.getCoordShift() + " != " + (byte)(getShift()) + "!");
            }
            roadRangeAttributeSets_.write(out);
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

        if (isRoadRangeAttributeMapsUsed())
        {
            roadRangeAttributeMaps_.write(zserioContext.getRoadRangeAttributeMaps(), out);
        }

        if (isRoadRangeAttributeSetsUsed())
        {
            roadRangeAttributeSets_.write(zserioContext.getRoadRangeAttributeSets(), out);
        }
    }

    private nds.traffic.metadata.RoadTrafficLayerContent content_;
    private byte shift_;
    private nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeMapList roadRangeAttributeMaps_;
    private nds.traffic.instantiations.TrafficIndirectRoadRangeAttributeSetList roadRangeAttributeSets_;
}
