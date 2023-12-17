/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.search.services;

public class GeocodingPosition implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            position_ = new nds.core.geometry.Position2D.ZserioPackingContext();
        }

        public nds.core.geometry.Position2D.ZserioPackingContext getPosition()
        {
            return position_;
        }

        private nds.core.geometry.Position2D.ZserioPackingContext position_;
    };

    public GeocodingPosition()
    {
    }

    public GeocodingPosition(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public GeocodingPosition(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public GeocodingPosition(
            nds.core.geometry.Position2D position_)
    {
        setPosition(position_);
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

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += position_.bitSizeOf(zserioContext.getPosition(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.geometry.Position2D getPosition()
    {
        return position_;
    }

    public void setPosition(nds.core.geometry.Position2D position_)
    {
        this.position_ = position_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof GeocodingPosition)
        {
            final GeocodingPosition that = (GeocodingPosition)obj;

            return
                    ((position_ == null) ? that.position_ == null : position_.equals(that.position_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, position_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        position_ = new nds.core.geometry.Position2D(in, (byte)(0));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        position_ = new nds.core.geometry.Position2D(zserioContext.getPosition(), in, (byte)(0));
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

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = position_.initializeOffsets(zserioContext.getPosition(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        // check parameters
        if (position_.getShift() != (byte)(0))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field GeocodingPosition.position: " +
                    position_.getShift() + " != " + (byte)(0) + "!");
        }
        position_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        position_.write(zserioContext.getPosition(), out);
    }

    private nds.core.geometry.Position2D position_;
}
