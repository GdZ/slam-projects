/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.lanegroups;

public class LaneGroup implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            id_ = new nds.core.types.Var4ByteId.ZserioPackingContext();
            type_ = new zserio.runtime.array.DeltaContext();
            laneGroup_ = new nds.lane.lanegroups.LaneGroupChoice.ZserioPackingContext();
        }

        public nds.core.types.Var4ByteId.ZserioPackingContext getId()
        {
            return id_;
        }

        public zserio.runtime.array.DeltaContext getType()
        {
            return type_;
        }

        public nds.lane.lanegroups.LaneGroupChoice.ZserioPackingContext getLaneGroup()
        {
            return laneGroup_;
        }

        private nds.core.types.Var4ByteId.ZserioPackingContext id_;
        private zserio.runtime.array.DeltaContext type_;
        private nds.lane.lanegroups.LaneGroupChoice.ZserioPackingContext laneGroup_;
    };

    public LaneGroup()
    {
    }

    public LaneGroup(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public LaneGroup(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public LaneGroup(
            nds.core.types.Var4ByteId id_,
            nds.lane.lanegroups.LaneGroupType type_,
            boolean hasBoundaryGeometry_,
            nds.lane.lanegroups.LaneGroupChoice laneGroup_)
    {
        setId(id_);
        setType(type_);
        setHasBoundaryGeometry(hasBoundaryGeometry_);
        setLaneGroup(laneGroup_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        id_.initPackingContext(zserioContext.getId());
        type_.initPackingContext(zserioContext.getType());
        laneGroup_.initPackingContext(zserioContext.getLaneGroup());
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

        endBitPosition += id_.bitSizeOf(endBitPosition);
        endBitPosition += type_.bitSizeOf(endBitPosition);
        endBitPosition += 1;
        endBitPosition += laneGroup_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += id_.bitSizeOf(zserioContext.getId(), endBitPosition);
        endBitPosition += type_.bitSizeOf(zserioContext.getType(), endBitPosition);
        endBitPosition += 1;
        endBitPosition += laneGroup_.bitSizeOf(zserioContext.getLaneGroup(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.types.Var4ByteId getId()
    {
        return id_;
    }

    public void setId(nds.core.types.Var4ByteId id_)
    {
        this.id_ = id_;
    }

    public nds.lane.lanegroups.LaneGroupType getType()
    {
        return type_;
    }

    public void setType(nds.lane.lanegroups.LaneGroupType type_)
    {
        this.type_ = type_;
    }

    public boolean getHasBoundaryGeometry()
    {
        return hasBoundaryGeometry_;
    }

    public void setHasBoundaryGeometry(boolean hasBoundaryGeometry_)
    {
        this.hasBoundaryGeometry_ = hasBoundaryGeometry_;
    }

    public nds.lane.lanegroups.LaneGroupChoice getLaneGroup()
    {
        return laneGroup_;
    }

    public void setLaneGroup(nds.lane.lanegroups.LaneGroupChoice laneGroup_)
    {
        this.laneGroup_ = laneGroup_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LaneGroup)
        {
            final LaneGroup that = (LaneGroup)obj;

            return
                    ((id_ == null) ? that.id_ == null : id_.equals(that.id_)) &&
                    ((type_ == null) ? that.type_ == null : type_.getValue() == that.type_.getValue()) &&
                    hasBoundaryGeometry_ == that.hasBoundaryGeometry_ &&
                    ((laneGroup_ == null) ? that.laneGroup_ == null : laneGroup_.equals(that.laneGroup_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, id_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, type_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, hasBoundaryGeometry_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, laneGroup_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        id_ = new nds.core.types.Var4ByteId(in);

        type_ = nds.lane.lanegroups.LaneGroupType.readEnum(in);

        hasBoundaryGeometry_ = in.readBool();

        laneGroup_ = new nds.lane.lanegroups.LaneGroupChoice(in, getType(), (boolean)(getHasBoundaryGeometry()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        id_ = new nds.core.types.Var4ByteId(zserioContext.getId(), in);

        type_ = nds.lane.lanegroups.LaneGroupType.readEnum(zserioContext.getType(), in);

        hasBoundaryGeometry_ = in.readBool();

        laneGroup_ = new nds.lane.lanegroups.LaneGroupChoice(zserioContext.getLaneGroup(), in, getType(), (boolean)(getHasBoundaryGeometry()));
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

        endBitPosition = id_.initializeOffsets(endBitPosition);
        endBitPosition += type_.bitSizeOf(endBitPosition);
        endBitPosition += 1;
        endBitPosition = laneGroup_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = id_.initializeOffsets(zserioContext.getId(), endBitPosition);
        endBitPosition = type_.initializeOffsets(zserioContext.getType(), endBitPosition);
        endBitPosition += 1;
        endBitPosition = laneGroup_.initializeOffsets(zserioContext.getLaneGroup(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        id_.write(out);

        type_.write(out);

        out.writeBool(hasBoundaryGeometry_);

        // check parameters
        if (laneGroup_.getType() != (getType()))
        {
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter type for field LaneGroup.laneGroup!");
        }
        if (laneGroup_.getHasBoundaryGeometry() != (boolean)(getHasBoundaryGeometry()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter hasBoundaryGeometry for field LaneGroup.laneGroup: " +
                    laneGroup_.getHasBoundaryGeometry() + " != " + (boolean)(getHasBoundaryGeometry()) + "!");
        }
        laneGroup_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        id_.write(zserioContext.getId(), out);

        type_.write(zserioContext.getType(), out);

        out.writeBool(hasBoundaryGeometry_);

        laneGroup_.write(zserioContext.getLaneGroup(), out);
    }

    private nds.core.types.Var4ByteId id_;
    private nds.lane.lanegroups.LaneGroupType type_;
    private boolean hasBoundaryGeometry_;
    private nds.lane.lanegroups.LaneGroupChoice laneGroup_;
}