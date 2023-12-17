/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.geometry;

public class PositionOffset2D implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            deltaLongitude_ = new zserio.runtime.array.DeltaContext();
            deltaLatitude_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getDeltaLongitude()
        {
            return deltaLongitude_;
        }

        public zserio.runtime.array.DeltaContext getDeltaLatitude()
        {
            return deltaLatitude_;
        }

        private zserio.runtime.array.DeltaContext deltaLongitude_;
        private zserio.runtime.array.DeltaContext deltaLatitude_;
    };

    public PositionOffset2D(
            byte numBits_,
            byte shift_)
    {
        this.numBits_ = numBits_;
        this.shift_ = shift_;
    }

    public PositionOffset2D(zserio.runtime.io.BitStreamReader in,
            byte numBits_,
            byte shift_)
            throws java.io.IOException
    {
        this.numBits_ = numBits_;
        this.shift_ = shift_;

        read(in);
    }

    public PositionOffset2D(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            byte numBits_,
            byte shift_)
            throws java.io.IOException
    {
        this.numBits_ = numBits_;
        this.shift_ = shift_;

        read(context, in);
    }

    public PositionOffset2D(
            byte numBits_,
            byte shift_,
            int deltaLongitude_,
            int deltaLatitude_)
    {
        this(numBits_, shift_);

        setDeltaLongitude(deltaLongitude_);
        setDeltaLatitude(deltaLatitude_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getDeltaLongitude().init(new zserio.runtime.array.ArrayTraits.SignedBitFieldIntArrayTraits((int)(getNumBits() + 1)),
                new zserio.runtime.array.ArrayElement.IntArrayElement(deltaLongitude_));
        zserioContext.getDeltaLatitude().init(new zserio.runtime.array.ArrayTraits.SignedBitFieldIntArrayTraits((int)(getNumBits() + 1)),
                new zserio.runtime.array.ArrayElement.IntArrayElement(deltaLatitude_));
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

        endBitPosition += getNumBits() + 1;
        endBitPosition += getNumBits() + 1;

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getDeltaLongitude().bitSizeOf(new zserio.runtime.array.ArrayTraits.SignedBitFieldIntArrayTraits((int)(getNumBits() + 1)),
                new zserio.runtime.array.ArrayElement.IntArrayElement(deltaLongitude_));
        endBitPosition += zserioContext.getDeltaLatitude().bitSizeOf(new zserio.runtime.array.ArrayTraits.SignedBitFieldIntArrayTraits((int)(getNumBits() + 1)),
                new zserio.runtime.array.ArrayElement.IntArrayElement(deltaLatitude_));

        return (int)(endBitPosition - bitPosition);
    }

    public byte getNumBits()
    {
        return this.numBits_;
    }

    public byte getShift()
    {
        return this.shift_;
    }

    public int getDeltaLongitude()
    {
        return deltaLongitude_;
    }

    public void setDeltaLongitude(int deltaLongitude_)
    {
        this.deltaLongitude_ = deltaLongitude_;
    }

    public int getDeltaLatitude()
    {
        return deltaLatitude_;
    }

    public void setDeltaLatitude(int deltaLatitude_)
    {
        this.deltaLatitude_ = deltaLatitude_;
    }

    public int funcLon()
    {
        return (int)(getDeltaLongitude() << getShift());
    }

    public int funcLat()
    {
        return (int)(getDeltaLatitude() << getShift());
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof PositionOffset2D)
        {
            final PositionOffset2D that = (PositionOffset2D)obj;

            return
                    this.numBits_ == that.numBits_ &&
                    this.shift_ == that.shift_ &&
                    deltaLongitude_ == that.deltaLongitude_ &&
                    deltaLatitude_ == that.deltaLatitude_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getNumBits());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getShift());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, deltaLongitude_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, deltaLatitude_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        deltaLongitude_ = (int)in.readSignedBits((int)(getNumBits() + 1));

        deltaLatitude_ = (int)in.readSignedBits((int)(getNumBits() + 1));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        deltaLongitude_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getDeltaLongitude().read(new zserio.runtime.array.ArrayTraits.SignedBitFieldIntArrayTraits((int)(getNumBits() + 1)), in)).get();

        deltaLatitude_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getDeltaLatitude().read(new zserio.runtime.array.ArrayTraits.SignedBitFieldIntArrayTraits((int)(getNumBits() + 1)), in)).get();
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

        endBitPosition += getNumBits() + 1;
        endBitPosition += getNumBits() + 1;

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getDeltaLongitude().bitSizeOf(new zserio.runtime.array.ArrayTraits.SignedBitFieldIntArrayTraits((int)(getNumBits() + 1)),
                new zserio.runtime.array.ArrayElement.IntArrayElement(deltaLongitude_));
        endBitPosition += zserioContext.getDeltaLatitude().bitSizeOf(new zserio.runtime.array.ArrayTraits.SignedBitFieldIntArrayTraits((int)(getNumBits() + 1)),
                new zserio.runtime.array.ArrayElement.IntArrayElement(deltaLatitude_));

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeSignedBits(deltaLongitude_, (int)(getNumBits() + 1));

        out.writeSignedBits(deltaLatitude_, (int)(getNumBits() + 1));
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getDeltaLongitude().write(new zserio.runtime.array.ArrayTraits.SignedBitFieldIntArrayTraits((int)(getNumBits() + 1)), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(deltaLongitude_));

        zserioContext.getDeltaLatitude().write(new zserio.runtime.array.ArrayTraits.SignedBitFieldIntArrayTraits((int)(getNumBits() + 1)), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(deltaLatitude_));
    }

    private final byte numBits_;
    private final byte shift_;
    private int deltaLongitude_;
    private int deltaLatitude_;
}