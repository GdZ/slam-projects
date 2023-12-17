/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.lanegroups;

public class ForkLaneGroup implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
    };

    public ForkLaneGroup()
    {
    }

    public ForkLaneGroup(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public ForkLaneGroup(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public ForkLaneGroup(
            nds.lane.lanegroups.LaneGroupConnector[] startConnector_,
            nds.lane.lanegroups.LaneGroupConnector[] endConnector_,
            nds.lane.lanes.ZeroLengthLane[] lanes_)
    {
        setStartConnector(startConnector_);
        setEndConnector(endConnector_);
        setLanes(lanes_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
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

        endBitPosition += startConnector_.bitSizeOf(endBitPosition);
        endBitPosition += endConnector_.bitSizeOf(endBitPosition);
        endBitPosition += lanes_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += startConnector_.bitSizeOfPacked(endBitPosition);
        endBitPosition += endConnector_.bitSizeOfPacked(endBitPosition);
        endBitPosition += lanes_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.lane.lanegroups.LaneGroupConnector[] getStartConnector()
    {
        return (startConnector_ == null) ? null : startConnector_.getRawArray();
    }

    public void setStartConnector(nds.lane.lanegroups.LaneGroupConnector[] startConnector_)
    {
        this.startConnector_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.lanegroups.LaneGroupConnector.class, startConnector_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanegroups.LaneGroupConnector>(new ZserioElementFactory_startConnector()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.lane.lanegroups.LaneGroupConnector[] getEndConnector()
    {
        return (endConnector_ == null) ? null : endConnector_.getRawArray();
    }

    public void setEndConnector(nds.lane.lanegroups.LaneGroupConnector[] endConnector_)
    {
        this.endConnector_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.lanegroups.LaneGroupConnector.class, endConnector_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanegroups.LaneGroupConnector>(new ZserioElementFactory_endConnector()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.lane.lanes.ZeroLengthLane[] getLanes()
    {
        return (lanes_ == null) ? null : lanes_.getRawArray();
    }

    public void setLanes(nds.lane.lanes.ZeroLengthLane[] lanes_)
    {
        this.lanes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.lanes.ZeroLengthLane.class, lanes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanes.ZeroLengthLane>(new ZserioElementFactory_lanes()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof ForkLaneGroup)
        {
            final ForkLaneGroup that = (ForkLaneGroup)obj;

            return
                    ((startConnector_ == null) ? that.startConnector_ == null : startConnector_.equals(that.startConnector_)) &&
                    ((endConnector_ == null) ? that.endConnector_ == null : endConnector_.equals(that.endConnector_)) &&
                    ((lanes_ == null) ? that.lanes_ == null : lanes_.equals(that.lanes_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, startConnector_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, endConnector_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, lanes_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        startConnector_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.lanegroups.LaneGroupConnector.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanegroups.LaneGroupConnector>(new ZserioElementFactory_startConnector()),
                zserio.runtime.array.ArrayType.AUTO);
        startConnector_.read(in);

        endConnector_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.lanegroups.LaneGroupConnector.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanegroups.LaneGroupConnector>(new ZserioElementFactory_endConnector()),
                zserio.runtime.array.ArrayType.AUTO);
        endConnector_.read(in);

        lanes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.lanes.ZeroLengthLane.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanes.ZeroLengthLane>(new ZserioElementFactory_lanes()),
                zserio.runtime.array.ArrayType.AUTO);
        lanes_.read(in);

        checkConstraints();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        startConnector_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.lanegroups.LaneGroupConnector.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanegroups.LaneGroupConnector>(new ZserioElementFactory_startConnector()),
                zserio.runtime.array.ArrayType.AUTO);
        startConnector_.readPacked(in);

        endConnector_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.lanegroups.LaneGroupConnector.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanegroups.LaneGroupConnector>(new ZserioElementFactory_endConnector()),
                zserio.runtime.array.ArrayType.AUTO);
        endConnector_.readPacked(in);

        lanes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.lanes.ZeroLengthLane.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanes.ZeroLengthLane>(new ZserioElementFactory_lanes()),
                zserio.runtime.array.ArrayType.AUTO);
        lanes_.readPacked(in);

        checkConstraints();
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

        endBitPosition = startConnector_.initializeOffsets(endBitPosition);
        endBitPosition = endConnector_.initializeOffsets(endBitPosition);
        endBitPosition = lanes_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition = startConnector_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = endConnector_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = lanes_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        checkConstraints();

        startConnector_.write(out);

        endConnector_.write(out);

        lanes_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        checkConstraints();

        startConnector_.writePacked(out);

        endConnector_.writePacked(out);

        lanes_.writePacked(out);
    }

    private void checkConstraints()
    {
        if (!(getStartConnector().length > 0))
            throw new zserio.runtime.ConstraintError("Constraint violated at ForkLaneGroup.startConnector!");
        if (!(getEndConnector().length > 0 && (getStartConnector().length > 1 || getEndConnector().length > 1)))
            throw new zserio.runtime.ConstraintError("Constraint violated at ForkLaneGroup.endConnector!");
    }

    private static final class ZserioElementFactory_startConnector implements zserio.runtime.array.PackableElementFactory<nds.lane.lanegroups.LaneGroupConnector>
    {
        @Override
        public nds.lane.lanegroups.LaneGroupConnector create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.lane.lanegroups.LaneGroupConnector(in, (boolean)(false));
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.lane.lanegroups.LaneGroupConnector.ZserioPackingContext();
        }

        @Override
        public nds.lane.lanegroups.LaneGroupConnector create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.lane.lanegroups.LaneGroupConnector(context, in, (boolean)(false));
        }
    }

    private static final class ZserioElementFactory_endConnector implements zserio.runtime.array.PackableElementFactory<nds.lane.lanegroups.LaneGroupConnector>
    {
        @Override
        public nds.lane.lanegroups.LaneGroupConnector create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.lane.lanegroups.LaneGroupConnector(in, (boolean)(false));
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.lane.lanegroups.LaneGroupConnector.ZserioPackingContext();
        }

        @Override
        public nds.lane.lanegroups.LaneGroupConnector create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.lane.lanegroups.LaneGroupConnector(context, in, (boolean)(false));
        }
    }

    private static final class ZserioElementFactory_lanes implements zserio.runtime.array.PackableElementFactory<nds.lane.lanes.ZeroLengthLane>
    {
        @Override
        public nds.lane.lanes.ZeroLengthLane create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.lane.lanes.ZeroLengthLane(in, (boolean)(false));
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.lane.lanes.ZeroLengthLane.ZserioPackingContext();
        }

        @Override
        public nds.lane.lanes.ZeroLengthLane create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.lane.lanes.ZeroLengthLane(context, in, (boolean)(false));
        }
    }

    private zserio.runtime.array.Array startConnector_;
    private zserio.runtime.array.Array endConnector_;
    private zserio.runtime.array.Array lanes_;
}