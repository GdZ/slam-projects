/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.reference.types;

public class LaneValidityPosition implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            position_ = new nds.core.geometry.Position3D.ZserioPackingContext();
        }

        public nds.core.geometry.Position3D.ZserioPackingContext getPosition()
        {
            return position_;
        }

        private nds.core.geometry.Position3D.ZserioPackingContext position_;
    };

    public LaneValidityPosition()
    {
    }

    public LaneValidityPosition(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public LaneValidityPosition(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public LaneValidityPosition(
            nds.core.geometry.Position3D position_,
            java.lang.Float positionIndication_)
    {
        setPosition(position_);
        setPositionIndication(positionIndication_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        position_.initPackingContext(zserioContext.getPosition());
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
        endBitPosition += 1;
        if (isPositionIndicationUsed())
        {
            endBitPosition += 16;
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += position_.bitSizeOf(zserioContext.getPosition(), endBitPosition);
        endBitPosition += 1;
        if (isPositionIndicationUsed())
        {
            endBitPosition += 16;
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.geometry.Position3D getPosition()
    {
        return position_;
    }

    public void setPosition(nds.core.geometry.Position3D position_)
    {
        this.position_ = position_;
    }

    public java.lang.Float getPositionIndication()
    {
        return positionIndication_;
    }

    public void setPositionIndication(java.lang.Float positionIndication_)
    {
        this.positionIndication_ = positionIndication_;
    }

    public boolean isPositionIndicationUsed()
    {
        return isPositionIndicationSet();
    }

    public boolean isPositionIndicationSet()
    {
        return (positionIndication_ != null);
    }

    public void resetPositionIndication()
    {
        this.positionIndication_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LaneValidityPosition)
        {
            final LaneValidityPosition that = (LaneValidityPosition)obj;

            return
                    ((position_ == null) ? that.position_ == null : position_.equals(that.position_)) &&
                    ((!isPositionIndicationUsed()) ? !that.isPositionIndicationUsed() :
                        ((positionIndication_ == null) ? that.positionIndication_ == null : positionIndication_.equals(that.positionIndication_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, position_);
        if (isPositionIndicationUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, positionIndication_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        position_ = new nds.core.geometry.Position3D(in, (byte)(0), (byte)(0));

        if (in.readBool())
        {
            positionIndication_ = in.readFloat16();
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        position_ = new nds.core.geometry.Position3D(zserioContext.getPosition(), in, (byte)(0), (byte)(0));

        if (in.readBool())
        {
            positionIndication_ = in.readFloat16();
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
        endBitPosition += 1;
        if (isPositionIndicationUsed())
        {
            endBitPosition += 16;
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = position_.initializeOffsets(zserioContext.getPosition(), endBitPosition);
        endBitPosition += 1;
        if (isPositionIndicationUsed())
        {
            endBitPosition += 16;
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        // check parameters
        if (position_.getShiftXY() != (byte)(0))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter shiftXY for field LaneValidityPosition.position: " +
                    position_.getShiftXY() + " != " + (byte)(0) + "!");
        }
        if (position_.getShiftZ() != (byte)(0))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter shiftZ for field LaneValidityPosition.position: " +
                    position_.getShiftZ() + " != " + (byte)(0) + "!");
        }
        position_.write(out);

        if (isPositionIndicationUsed())
        {
            out.writeBool(true);
            out.writeFloat16(positionIndication_);
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
        position_.write(zserioContext.getPosition(), out);

        if (isPositionIndicationUsed())
        {
            out.writeBool(true);
            out.writeFloat16(positionIndication_);
        }
        else
        {
            out.writeBool(false);
        }
    }

    private nds.core.geometry.Position3D position_;
    private java.lang.Float positionIndication_;
}
