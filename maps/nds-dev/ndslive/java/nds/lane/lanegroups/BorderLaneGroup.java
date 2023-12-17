/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.lanegroups;

public class BorderLaneGroup implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            endConnectorBorder_ = new nds.lane.lanegroups.LaneGroupConnector.ZserioPackingContext();
        }

        public nds.lane.lanegroups.LaneGroupConnector.ZserioPackingContext getEndConnectorBorder()
        {
            return endConnectorBorder_;
        }

        private nds.lane.lanegroups.LaneGroupConnector.ZserioPackingContext endConnectorBorder_;
    };

    public BorderLaneGroup()
    {
    }

    public BorderLaneGroup(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public BorderLaneGroup(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public BorderLaneGroup(
            nds.lane.lanegroups.LaneGroupConnector[] startConnector_,
            nds.lane.lanegroups.LaneGroupConnector endConnectorBorder_,
            nds.lane.lanes.ZeroLengthLane[] lanes_)
    {
        setStartConnector(startConnector_);
        setEndConnectorBorder(endConnectorBorder_);
        setLanes(lanes_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        endConnectorBorder_.initPackingContext(zserioContext.getEndConnectorBorder());
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
        endBitPosition += endConnectorBorder_.bitSizeOf(endBitPosition);
        endBitPosition += lanes_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += startConnector_.bitSizeOfPacked(endBitPosition);
        endBitPosition += endConnectorBorder_.bitSizeOf(zserioContext.getEndConnectorBorder(), endBitPosition);
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

    public nds.lane.lanegroups.LaneGroupConnector getEndConnectorBorder()
    {
        return endConnectorBorder_;
    }

    public void setEndConnectorBorder(nds.lane.lanegroups.LaneGroupConnector endConnectorBorder_)
    {
        this.endConnectorBorder_ = endConnectorBorder_;
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
        if (obj instanceof BorderLaneGroup)
        {
            final BorderLaneGroup that = (BorderLaneGroup)obj;

            return
                    ((startConnector_ == null) ? that.startConnector_ == null : startConnector_.equals(that.startConnector_)) &&
                    ((endConnectorBorder_ == null) ? that.endConnectorBorder_ == null : endConnectorBorder_.equals(that.endConnectorBorder_)) &&
                    ((lanes_ == null) ? that.lanes_ == null : lanes_.equals(that.lanes_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, startConnector_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, endConnectorBorder_);
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

        endConnectorBorder_ = new nds.lane.lanegroups.LaneGroupConnector(in, (boolean)(true));

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
        final ZserioPackingContext zserioContext = context.cast();
        startConnector_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.lane.lanegroups.LaneGroupConnector.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.lane.lanegroups.LaneGroupConnector>(new ZserioElementFactory_startConnector()),
                zserio.runtime.array.ArrayType.AUTO);
        startConnector_.readPacked(in);

        endConnectorBorder_ = new nds.lane.lanegroups.LaneGroupConnector(zserioContext.getEndConnectorBorder(), in, (boolean)(true));

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
        endBitPosition = endConnectorBorder_.initializeOffsets(endBitPosition);
        endBitPosition = lanes_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = startConnector_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = endConnectorBorder_.initializeOffsets(zserioContext.getEndConnectorBorder(), endBitPosition);
        endBitPosition = lanes_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        checkConstraints();

        startConnector_.write(out);

        // check parameters
        if (endConnectorBorder_.getOnBorder() != (boolean)(true))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter onBorder for field BorderLaneGroup.endConnectorBorder: " +
                    endConnectorBorder_.getOnBorder() + " != " + (boolean)(true) + "!");
        }
        endConnectorBorder_.write(out);

        lanes_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        checkConstraints();

        startConnector_.writePacked(out);

        endConnectorBorder_.write(zserioContext.getEndConnectorBorder(), out);

        lanes_.writePacked(out);
    }

    private void checkConstraints()
    {
        if (!(getStartConnector().length > 0))
            throw new zserio.runtime.ConstraintError("Constraint violated at BorderLaneGroup.startConnector!");
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

    private static final class ZserioElementFactory_lanes implements zserio.runtime.array.PackableElementFactory<nds.lane.lanes.ZeroLengthLane>
    {
        @Override
        public nds.lane.lanes.ZeroLengthLane create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.lane.lanes.ZeroLengthLane(in, (boolean)(true));
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
            return new nds.lane.lanes.ZeroLengthLane(context, in, (boolean)(true));
        }
    }

    private zserio.runtime.array.Array startConnector_;
    private nds.lane.lanegroups.LaneGroupConnector endConnectorBorder_;
    private zserio.runtime.array.Array lanes_;
}
