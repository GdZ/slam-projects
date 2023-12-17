/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.conditions;

public class NumTrailersCondition implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            numTrailers_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getNumTrailers()
        {
            return numTrailers_;
        }

        private zserio.runtime.array.DeltaContext numTrailers_;
    };

    public NumTrailersCondition()
    {
    }

    public NumTrailersCondition(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public NumTrailersCondition(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public NumTrailersCondition(
            byte numTrailers_,
            boolean isInclusive_)
    {
        setNumTrailers(numTrailers_);
        setIsInclusive(isInclusive_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumTrailers().init(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(7)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(numTrailers_));
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

        endBitPosition += 7;
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumTrailers().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(7)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(numTrailers_));
        endBitPosition += 1;

        return (int)(endBitPosition - bitPosition);
    }

    public byte getNumTrailers()
    {
        return numTrailers_;
    }

    public void setNumTrailers(byte numTrailers_)
    {
        this.numTrailers_ = numTrailers_;
    }

    public boolean getIsInclusive()
    {
        return isInclusive_;
    }

    public void setIsInclusive(boolean isInclusive_)
    {
        this.isInclusive_ = isInclusive_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof NumTrailersCondition)
        {
            final NumTrailersCondition that = (NumTrailersCondition)obj;

            return
                    numTrailers_ == that.numTrailers_ &&
                    isInclusive_ == that.isInclusive_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numTrailers_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, isInclusive_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        numTrailers_ = (byte)in.readBits(7);

        isInclusive_ = in.readBool();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        numTrailers_ = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                zserioContext.getNumTrailers().read(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(7)), in)).get();

        isInclusive_ = in.readBool();
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

        endBitPosition += 7;
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumTrailers().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(7)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(numTrailers_));
        endBitPosition += 1;

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBits(numTrailers_, 7);

        out.writeBool(isInclusive_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumTrailers().write(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(7)), out,
                new zserio.runtime.array.ArrayElement.ByteArrayElement(numTrailers_));

        out.writeBool(isInclusive_);
    }

    private byte numTrailers_;
    private boolean isInclusive_;
}
