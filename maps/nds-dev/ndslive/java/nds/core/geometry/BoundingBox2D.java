/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.geometry;

public class BoundingBox2D implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            southWestPosition_ = new nds.core.geometry.Position2D.ZserioPackingContext();
            northEastPosition_ = new nds.core.geometry.Position2D.ZserioPackingContext();
        }

        public nds.core.geometry.Position2D.ZserioPackingContext getSouthWestPosition()
        {
            return southWestPosition_;
        }

        public nds.core.geometry.Position2D.ZserioPackingContext getNorthEastPosition()
        {
            return northEastPosition_;
        }

        private nds.core.geometry.Position2D.ZserioPackingContext southWestPosition_;
        private nds.core.geometry.Position2D.ZserioPackingContext northEastPosition_;
    };

    public BoundingBox2D()
    {
    }

    public BoundingBox2D(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public BoundingBox2D(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public BoundingBox2D(
            nds.core.geometry.Position2D southWestPosition_,
            nds.core.geometry.Position2D northEastPosition_)
    {
        setSouthWestPosition(southWestPosition_);
        setNorthEastPosition(northEastPosition_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        southWestPosition_.initPackingContext(zserioContext.getSouthWestPosition());
        northEastPosition_.initPackingContext(zserioContext.getNorthEastPosition());
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

        endBitPosition += southWestPosition_.bitSizeOf(endBitPosition);
        endBitPosition += northEastPosition_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += southWestPosition_.bitSizeOf(zserioContext.getSouthWestPosition(), endBitPosition);
        endBitPosition += northEastPosition_.bitSizeOf(zserioContext.getNorthEastPosition(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.geometry.Position2D getSouthWestPosition()
    {
        return southWestPosition_;
    }

    public void setSouthWestPosition(nds.core.geometry.Position2D southWestPosition_)
    {
        this.southWestPosition_ = southWestPosition_;
    }

    public nds.core.geometry.Position2D getNorthEastPosition()
    {
        return northEastPosition_;
    }

    public void setNorthEastPosition(nds.core.geometry.Position2D northEastPosition_)
    {
        this.northEastPosition_ = northEastPosition_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof BoundingBox2D)
        {
            final BoundingBox2D that = (BoundingBox2D)obj;

            return
                    ((southWestPosition_ == null) ? that.southWestPosition_ == null : southWestPosition_.equals(that.southWestPosition_)) &&
                    ((northEastPosition_ == null) ? that.northEastPosition_ == null : northEastPosition_.equals(that.northEastPosition_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, southWestPosition_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, northEastPosition_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        southWestPosition_ = new nds.core.geometry.Position2D(in, (byte)(0));

        northEastPosition_ = new nds.core.geometry.Position2D(in, (byte)(0));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        southWestPosition_ = new nds.core.geometry.Position2D(zserioContext.getSouthWestPosition(), in, (byte)(0));

        northEastPosition_ = new nds.core.geometry.Position2D(zserioContext.getNorthEastPosition(), in, (byte)(0));
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

        endBitPosition = southWestPosition_.initializeOffsets(endBitPosition);
        endBitPosition = northEastPosition_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = southWestPosition_.initializeOffsets(zserioContext.getSouthWestPosition(), endBitPosition);
        endBitPosition = northEastPosition_.initializeOffsets(zserioContext.getNorthEastPosition(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        // check parameters
        if (southWestPosition_.getShift() != (byte)(0))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field BoundingBox2D.southWestPosition: " +
                    southWestPosition_.getShift() + " != " + (byte)(0) + "!");
        }
        southWestPosition_.write(out);

        // check parameters
        if (northEastPosition_.getShift() != (byte)(0))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field BoundingBox2D.northEastPosition: " +
                    northEastPosition_.getShift() + " != " + (byte)(0) + "!");
        }
        northEastPosition_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        southWestPosition_.write(zserioContext.getSouthWestPosition(), out);

        northEastPosition_.write(zserioContext.getNorthEastPosition(), out);
    }

    private nds.core.geometry.Position2D southWestPosition_;
    private nds.core.geometry.Position2D northEastPosition_;
}