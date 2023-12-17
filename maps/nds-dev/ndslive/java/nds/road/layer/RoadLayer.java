/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.road.layer;

public class RoadLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            coordShift_ = new zserio.runtime.array.DeltaContext();
            roadList_ = new nds.road.road.RoadList.ZserioPackingContext();
            intersectionList_ = new nds.road.road.IntersectionList.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getCoordShift()
        {
            return coordShift_;
        }

        public nds.road.road.RoadList.ZserioPackingContext getRoadList()
        {
            return roadList_;
        }

        public nds.road.road.IntersectionList.ZserioPackingContext getIntersectionList()
        {
            return intersectionList_;
        }

        private zserio.runtime.array.DeltaContext coordShift_;
        private nds.road.road.RoadList.ZserioPackingContext roadList_;
        private nds.road.road.IntersectionList.ZserioPackingContext intersectionList_;
    };

    public RoadLayer()
    {
    }

    public RoadLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoadLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoadLayer(
            byte coordShift_,
            nds.road.road.RoadList roadList_,
            nds.road.road.IntersectionList intersectionList_)
    {
        setCoordShift(coordShift_);
        setRoadList(roadList_);
        setIntersectionList(intersectionList_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getCoordShift().init(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(coordShift_));
        roadList_.initPackingContext(zserioContext.getRoadList());
        intersectionList_.initPackingContext(zserioContext.getIntersectionList());
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
        endBitPosition += roadList_.bitSizeOf(endBitPosition);
        endBitPosition += intersectionList_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getCoordShift().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(coordShift_));
        endBitPosition += roadList_.bitSizeOf(zserioContext.getRoadList(), endBitPosition);
        endBitPosition += intersectionList_.bitSizeOf(zserioContext.getIntersectionList(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public byte getCoordShift()
    {
        return coordShift_;
    }

    public void setCoordShift(byte coordShift_)
    {
        this.coordShift_ = coordShift_;
    }

    public nds.road.road.RoadList getRoadList()
    {
        return roadList_;
    }

    public void setRoadList(nds.road.road.RoadList roadList_)
    {
        this.roadList_ = roadList_;
    }

    public nds.road.road.IntersectionList getIntersectionList()
    {
        return intersectionList_;
    }

    public void setIntersectionList(nds.road.road.IntersectionList intersectionList_)
    {
        this.intersectionList_ = intersectionList_;
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.FEATURE);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoadLayer)
        {
            final RoadLayer that = (RoadLayer)obj;

            return
                    coordShift_ == that.coordShift_ &&
                    ((roadList_ == null) ? that.roadList_ == null : roadList_.equals(that.roadList_)) &&
                    ((intersectionList_ == null) ? that.intersectionList_ == null : intersectionList_.equals(that.intersectionList_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, coordShift_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, roadList_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, intersectionList_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        coordShift_ = (byte)in.readBits(5);

        roadList_ = new nds.road.road.RoadList(in);

        intersectionList_ = new nds.road.road.IntersectionList(in, (byte)(getCoordShift()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        coordShift_ = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                zserioContext.getCoordShift().read(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), in)).get();

        roadList_ = new nds.road.road.RoadList(zserioContext.getRoadList(), in);

        intersectionList_ = new nds.road.road.IntersectionList(zserioContext.getIntersectionList(), in, (byte)(getCoordShift()));
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
        endBitPosition = roadList_.initializeOffsets(endBitPosition);
        endBitPosition = intersectionList_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getCoordShift().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(coordShift_));
        endBitPosition = roadList_.initializeOffsets(zserioContext.getRoadList(), endBitPosition);
        endBitPosition = intersectionList_.initializeOffsets(zserioContext.getIntersectionList(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBits(coordShift_, 5);

        roadList_.write(out);

        // check parameters
        if (intersectionList_.getShift() != (byte)(getCoordShift()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field RoadLayer.intersectionList: " +
                    intersectionList_.getShift() + " != " + (byte)(getCoordShift()) + "!");
        }
        intersectionList_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getCoordShift().write(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), out,
                new zserio.runtime.array.ArrayElement.ByteArrayElement(coordShift_));

        roadList_.write(zserioContext.getRoadList(), out);

        intersectionList_.write(zserioContext.getIntersectionList(), out);
    }

    private byte coordShift_;
    private nds.road.road.RoadList roadList_;
    private nds.road.road.IntersectionList intersectionList_;
}