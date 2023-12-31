/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.lanegroups;

public class LaneGroupConnector implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            position_ = new nds.core.geometry.Position3D.ZserioPackingContext();
            connectedLaneGroupId_ = new nds.core.types.Var4ByteId.ZserioPackingContext();
            borderIndicator_ = new zserio.runtime.array.DeltaContext();
        }

        public nds.core.geometry.Position3D.ZserioPackingContext getPosition()
        {
            return position_;
        }

        public nds.core.types.Var4ByteId.ZserioPackingContext getConnectedLaneGroupId()
        {
            return connectedLaneGroupId_;
        }

        public zserio.runtime.array.DeltaContext getBorderIndicator()
        {
            return borderIndicator_;
        }

        private nds.core.geometry.Position3D.ZserioPackingContext position_;
        private nds.core.types.Var4ByteId.ZserioPackingContext connectedLaneGroupId_;
        private zserio.runtime.array.DeltaContext borderIndicator_;
    };

    public LaneGroupConnector(
            boolean onBorder_)
    {
        this.onBorder_ = onBorder_;
    }

    public LaneGroupConnector(zserio.runtime.io.BitStreamReader in,
            boolean onBorder_)
            throws java.io.IOException
    {
        this.onBorder_ = onBorder_;

        read(in);
    }

    public LaneGroupConnector(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            boolean onBorder_)
            throws java.io.IOException
    {
        this.onBorder_ = onBorder_;

        read(context, in);
    }

    public LaneGroupConnector(
            boolean onBorder_,
            nds.core.geometry.Position3D position_,
            nds.core.types.Var4ByteId connectedLaneGroupId_,
            nds.lane.types.TileBorderIndicator borderIndicator_)
    {
        this(onBorder_);

        setPosition(position_);
        setConnectedLaneGroupId(connectedLaneGroupId_);
        setBorderIndicator(borderIndicator_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        position_.initPackingContext(zserioContext.getPosition());
        if (isConnectedLaneGroupIdUsed())
        {
            connectedLaneGroupId_.initPackingContext(zserioContext.getConnectedLaneGroupId());
        }
        if (isBorderIndicatorUsed())
        {
            borderIndicator_.initPackingContext(zserioContext.getBorderIndicator());
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

        endBitPosition += position_.bitSizeOf(endBitPosition);
        if (isConnectedLaneGroupIdUsed())
        {
            endBitPosition += connectedLaneGroupId_.bitSizeOf(endBitPosition);
        }
        if (isBorderIndicatorUsed())
        {
            endBitPosition += borderIndicator_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += position_.bitSizeOf(zserioContext.getPosition(), endBitPosition);
        if (isConnectedLaneGroupIdUsed())
        {
            endBitPosition += connectedLaneGroupId_.bitSizeOf(zserioContext.getConnectedLaneGroupId(), endBitPosition);
        }
        if (isBorderIndicatorUsed())
        {
            endBitPosition += borderIndicator_.bitSizeOf(zserioContext.getBorderIndicator(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public boolean getOnBorder()
    {
        return this.onBorder_;
    }

    public nds.core.geometry.Position3D getPosition()
    {
        return position_;
    }

    public void setPosition(nds.core.geometry.Position3D position_)
    {
        this.position_ = position_;
    }

    public nds.core.types.Var4ByteId getConnectedLaneGroupId()
    {
        return connectedLaneGroupId_;
    }

    public void setConnectedLaneGroupId(nds.core.types.Var4ByteId connectedLaneGroupId_)
    {
        this.connectedLaneGroupId_ = connectedLaneGroupId_;
    }

    public boolean isConnectedLaneGroupIdUsed()
    {
        return (!getOnBorder());
    }

    public boolean isConnectedLaneGroupIdSet()
    {
        return (connectedLaneGroupId_ != null);
    }

    public void resetConnectedLaneGroupId()
    {
        this.connectedLaneGroupId_ = null;
    }

    public nds.lane.types.TileBorderIndicator getBorderIndicator()
    {
        return borderIndicator_;
    }

    public void setBorderIndicator(nds.lane.types.TileBorderIndicator borderIndicator_)
    {
        this.borderIndicator_ = borderIndicator_;
    }

    public boolean isBorderIndicatorUsed()
    {
        return (getOnBorder());
    }

    public boolean isBorderIndicatorSet()
    {
        return (borderIndicator_ != null);
    }

    public void resetBorderIndicator()
    {
        this.borderIndicator_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LaneGroupConnector)
        {
            final LaneGroupConnector that = (LaneGroupConnector)obj;

            return
                    this.onBorder_ == that.onBorder_ &&
                    ((position_ == null) ? that.position_ == null : position_.equals(that.position_)) &&
                    ((!isConnectedLaneGroupIdUsed()) ? !that.isConnectedLaneGroupIdUsed() :
                        ((connectedLaneGroupId_ == null) ? that.connectedLaneGroupId_ == null : connectedLaneGroupId_.equals(that.connectedLaneGroupId_))) &&
                    ((!isBorderIndicatorUsed()) ? !that.isBorderIndicatorUsed() :
                        ((borderIndicator_ == null) ? that.borderIndicator_ == null : borderIndicator_.getValue() == that.borderIndicator_.getValue()));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getOnBorder());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, position_);
        if (isConnectedLaneGroupIdUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, connectedLaneGroupId_);
        if (isBorderIndicatorUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, borderIndicator_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        position_ = new nds.core.geometry.Position3D(in, (byte)(0), (byte)(0));

        if (!getOnBorder())
        {
            connectedLaneGroupId_ = new nds.core.types.Var4ByteId(in);
        }

        if (getOnBorder())
        {
            borderIndicator_ = nds.lane.types.TileBorderIndicator.readEnum(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        position_ = new nds.core.geometry.Position3D(zserioContext.getPosition(), in, (byte)(0), (byte)(0));

        if (!getOnBorder())
        {
            connectedLaneGroupId_ = new nds.core.types.Var4ByteId(zserioContext.getConnectedLaneGroupId(), in);
        }

        if (getOnBorder())
        {
            borderIndicator_ = nds.lane.types.TileBorderIndicator.readEnum(zserioContext.getBorderIndicator(), in);
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

        endBitPosition = position_.initializeOffsets(endBitPosition);
        if (isConnectedLaneGroupIdUsed())
        {
            endBitPosition = connectedLaneGroupId_.initializeOffsets(endBitPosition);
        }
        if (isBorderIndicatorUsed())
        {
            endBitPosition += borderIndicator_.bitSizeOf(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = position_.initializeOffsets(zserioContext.getPosition(), endBitPosition);
        if (isConnectedLaneGroupIdUsed())
        {
            endBitPosition = connectedLaneGroupId_.initializeOffsets(zserioContext.getConnectedLaneGroupId(), endBitPosition);
        }
        if (isBorderIndicatorUsed())
        {
            endBitPosition = borderIndicator_.initializeOffsets(zserioContext.getBorderIndicator(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        // check parameters
        if (position_.getShiftXY() != (byte)(0))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter shiftXY for field LaneGroupConnector.position: " +
                    position_.getShiftXY() + " != " + (byte)(0) + "!");
        }
        if (position_.getShiftZ() != (byte)(0))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter shiftZ for field LaneGroupConnector.position: " +
                    position_.getShiftZ() + " != " + (byte)(0) + "!");
        }
        position_.write(out);

        if (isConnectedLaneGroupIdUsed())
        {
            connectedLaneGroupId_.write(out);
        }

        if (isBorderIndicatorUsed())
        {
            borderIndicator_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        position_.write(zserioContext.getPosition(), out);

        if (isConnectedLaneGroupIdUsed())
        {
            connectedLaneGroupId_.write(zserioContext.getConnectedLaneGroupId(), out);
        }

        if (isBorderIndicatorUsed())
        {
            borderIndicator_.write(zserioContext.getBorderIndicator(), out);
        }
    }

    private final boolean onBorder_;
    private nds.core.geometry.Position3D position_;
    private nds.core.types.Var4ByteId connectedLaneGroupId_;
    private nds.lane.types.TileBorderIndicator borderIndicator_;
}
