/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.geometry;

public class LineRangeOffset2D implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            offsetType_ = new zserio.runtime.array.DeltaContext();
            numBits_ = new zserio.runtime.array.DeltaContext();
            startPosition_ = new zserio.runtime.array.DeltaContext();
            endPosition_ = new zserio.runtime.array.DeltaContext();
            startOffset_ = new nds.core.geometry.PositionOffset2D.ZserioPackingContext();
            endOffset_ = new nds.core.geometry.PositionOffset2D.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getOffsetType()
        {
            return offsetType_;
        }

        public zserio.runtime.array.DeltaContext getNumBits()
        {
            return numBits_;
        }

        public zserio.runtime.array.DeltaContext getStartPosition()
        {
            return startPosition_;
        }

        public zserio.runtime.array.DeltaContext getEndPosition()
        {
            return endPosition_;
        }

        public nds.core.geometry.PositionOffset2D.ZserioPackingContext getStartOffset()
        {
            return startOffset_;
        }

        public nds.core.geometry.PositionOffset2D.ZserioPackingContext getEndOffset()
        {
            return endOffset_;
        }

        private zserio.runtime.array.DeltaContext offsetType_;
        private zserio.runtime.array.DeltaContext numBits_;
        private zserio.runtime.array.DeltaContext startPosition_;
        private zserio.runtime.array.DeltaContext endPosition_;
        private nds.core.geometry.PositionOffset2D.ZserioPackingContext startOffset_;
        private nds.core.geometry.PositionOffset2D.ZserioPackingContext endOffset_;
    };

    public LineRangeOffset2D(
            byte shift_)
    {
        this.shift_ = shift_;
    }

    public LineRangeOffset2D(zserio.runtime.io.BitStreamReader in,
            byte shift_)
            throws java.io.IOException
    {
        this.shift_ = shift_;

        read(in);
    }

    public LineRangeOffset2D(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            byte shift_)
            throws java.io.IOException
    {
        this.shift_ = shift_;

        read(context, in);
    }

    public LineRangeOffset2D(
            byte shift_,
            nds.core.geometry.RangeOffsetType offsetType_,
            byte numBits_,
            int startPosition_,
            int endPosition_,
            nds.core.geometry.PositionOffset2D startOffset_,
            nds.core.geometry.PositionOffset2D endOffset_)
    {
        this(shift_);

        setOffsetType(offsetType_);
        setNumBits(numBits_);
        setStartPosition(startPosition_);
        setEndPosition(endPosition_);
        setStartOffset(startOffset_);
        setEndOffset(endOffset_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        offsetType_.initPackingContext(zserioContext.getOffsetType());
        zserioContext.getNumBits().init(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(numBits_));
        zserioContext.getStartPosition().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(startPosition_));
        zserioContext.getEndPosition().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(endPosition_));
        if (isStartOffsetUsed())
        {
            startOffset_.initPackingContext(zserioContext.getStartOffset());
        }
        if (isEndOffsetUsed())
        {
            endOffset_.initPackingContext(zserioContext.getEndOffset());
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

        endBitPosition += offsetType_.bitSizeOf(endBitPosition);
        endBitPosition += 5;
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(startPosition_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(endPosition_);
        if (isStartOffsetUsed())
        {
            endBitPosition += startOffset_.bitSizeOf(endBitPosition);
        }
        if (isEndOffsetUsed())
        {
            endBitPosition += endOffset_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += offsetType_.bitSizeOf(zserioContext.getOffsetType(), endBitPosition);
        endBitPosition += zserioContext.getNumBits().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(numBits_));
        endBitPosition += zserioContext.getStartPosition().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(startPosition_));
        endBitPosition += zserioContext.getEndPosition().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(endPosition_));
        if (isStartOffsetUsed())
        {
            endBitPosition += startOffset_.bitSizeOf(zserioContext.getStartOffset(), endBitPosition);
        }
        if (isEndOffsetUsed())
        {
            endBitPosition += endOffset_.bitSizeOf(zserioContext.getEndOffset(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public byte getShift()
    {
        return this.shift_;
    }

    public nds.core.geometry.RangeOffsetType getOffsetType()
    {
        return offsetType_;
    }

    public void setOffsetType(nds.core.geometry.RangeOffsetType offsetType_)
    {
        this.offsetType_ = offsetType_;
    }

    public byte getNumBits()
    {
        return numBits_;
    }

    public void setNumBits(byte numBits_)
    {
        this.numBits_ = numBits_;
    }

    public int getStartPosition()
    {
        return startPosition_;
    }

    public void setStartPosition(int startPosition_)
    {
        this.startPosition_ = startPosition_;
    }

    public int getEndPosition()
    {
        return endPosition_;
    }

    public void setEndPosition(int endPosition_)
    {
        this.endPosition_ = endPosition_;
    }

    public nds.core.geometry.PositionOffset2D getStartOffset()
    {
        return startOffset_;
    }

    public void setStartOffset(nds.core.geometry.PositionOffset2D startOffset_)
    {
        this.startOffset_ = startOffset_;
    }

    public boolean isStartOffsetUsed()
    {
        return (getOffsetType() == nds.core.geometry.RangeOffsetType.START || getOffsetType() == nds.core.geometry.RangeOffsetType.START_AND_END);
    }

    public boolean isStartOffsetSet()
    {
        return (startOffset_ != null);
    }

    public void resetStartOffset()
    {
        this.startOffset_ = null;
    }

    public nds.core.geometry.PositionOffset2D getEndOffset()
    {
        return endOffset_;
    }

    public void setEndOffset(nds.core.geometry.PositionOffset2D endOffset_)
    {
        this.endOffset_ = endOffset_;
    }

    public boolean isEndOffsetUsed()
    {
        return (getOffsetType() == nds.core.geometry.RangeOffsetType.END || getOffsetType() == nds.core.geometry.RangeOffsetType.START_AND_END);
    }

    public boolean isEndOffsetSet()
    {
        return (endOffset_ != null);
    }

    public void resetEndOffset()
    {
        this.endOffset_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LineRangeOffset2D)
        {
            final LineRangeOffset2D that = (LineRangeOffset2D)obj;

            return
                    this.shift_ == that.shift_ &&
                    ((offsetType_ == null) ? that.offsetType_ == null : offsetType_.getValue() == that.offsetType_.getValue()) &&
                    numBits_ == that.numBits_ &&
                    startPosition_ == that.startPosition_ &&
                    endPosition_ == that.endPosition_ &&
                    ((!isStartOffsetUsed()) ? !that.isStartOffsetUsed() :
                        ((startOffset_ == null) ? that.startOffset_ == null : startOffset_.equals(that.startOffset_))) &&
                    ((!isEndOffsetUsed()) ? !that.isEndOffsetUsed() :
                        ((endOffset_ == null) ? that.endOffset_ == null : endOffset_.equals(that.endOffset_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getShift());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, offsetType_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numBits_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, startPosition_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, endPosition_);
        if (isStartOffsetUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, startOffset_);
        if (isEndOffsetUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, endOffset_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        offsetType_ = nds.core.geometry.RangeOffsetType.readEnum(in);

        numBits_ = (byte)in.readBits(5);

        startPosition_ = in.readVarSize();

        endPosition_ = in.readVarSize();

        if (getOffsetType() == nds.core.geometry.RangeOffsetType.START || getOffsetType() == nds.core.geometry.RangeOffsetType.START_AND_END)
        {
            startOffset_ = new nds.core.geometry.PositionOffset2D(in, (byte)(getNumBits()), (byte)(getShift()));
        }

        if (getOffsetType() == nds.core.geometry.RangeOffsetType.END || getOffsetType() == nds.core.geometry.RangeOffsetType.START_AND_END)
        {
            endOffset_ = new nds.core.geometry.PositionOffset2D(in, (byte)(getNumBits()), (byte)(getShift()));
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        offsetType_ = nds.core.geometry.RangeOffsetType.readEnum(zserioContext.getOffsetType(), in);

        numBits_ = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                zserioContext.getNumBits().read(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), in)).get();

        startPosition_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getStartPosition().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        endPosition_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getEndPosition().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        if (getOffsetType() == nds.core.geometry.RangeOffsetType.START || getOffsetType() == nds.core.geometry.RangeOffsetType.START_AND_END)
        {
            startOffset_ = new nds.core.geometry.PositionOffset2D(zserioContext.getStartOffset(), in, (byte)(getNumBits()), (byte)(getShift()));
        }

        if (getOffsetType() == nds.core.geometry.RangeOffsetType.END || getOffsetType() == nds.core.geometry.RangeOffsetType.START_AND_END)
        {
            endOffset_ = new nds.core.geometry.PositionOffset2D(zserioContext.getEndOffset(), in, (byte)(getNumBits()), (byte)(getShift()));
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

        endBitPosition += offsetType_.bitSizeOf(endBitPosition);
        endBitPosition += 5;
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(startPosition_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(endPosition_);
        if (isStartOffsetUsed())
        {
            endBitPosition = startOffset_.initializeOffsets(endBitPosition);
        }
        if (isEndOffsetUsed())
        {
            endBitPosition = endOffset_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = offsetType_.initializeOffsets(zserioContext.getOffsetType(), endBitPosition);
        endBitPosition += zserioContext.getNumBits().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(numBits_));
        endBitPosition += zserioContext.getStartPosition().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(startPosition_));
        endBitPosition += zserioContext.getEndPosition().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(endPosition_));
        if (isStartOffsetUsed())
        {
            endBitPosition = startOffset_.initializeOffsets(zserioContext.getStartOffset(), endBitPosition);
        }
        if (isEndOffsetUsed())
        {
            endBitPosition = endOffset_.initializeOffsets(zserioContext.getEndOffset(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        offsetType_.write(out);

        out.writeBits(numBits_, 5);

        out.writeVarSize(startPosition_);

        out.writeVarSize(endPosition_);

        if (isStartOffsetUsed())
        {
            // check parameters
            if (startOffset_.getNumBits() != (byte)(getNumBits()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter numBits for field LineRangeOffset2D.startOffset: " +
                        startOffset_.getNumBits() + " != " + (byte)(getNumBits()) + "!");
            }
            if (startOffset_.getShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field LineRangeOffset2D.startOffset: " +
                        startOffset_.getShift() + " != " + (byte)(getShift()) + "!");
            }
            startOffset_.write(out);
        }

        if (isEndOffsetUsed())
        {
            // check parameters
            if (endOffset_.getNumBits() != (byte)(getNumBits()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter numBits for field LineRangeOffset2D.endOffset: " +
                        endOffset_.getNumBits() + " != " + (byte)(getNumBits()) + "!");
            }
            if (endOffset_.getShift() != (byte)(getShift()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field LineRangeOffset2D.endOffset: " +
                        endOffset_.getShift() + " != " + (byte)(getShift()) + "!");
            }
            endOffset_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        offsetType_.write(zserioContext.getOffsetType(), out);

        zserioContext.getNumBits().write(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), out,
                new zserio.runtime.array.ArrayElement.ByteArrayElement(numBits_));

        zserioContext.getStartPosition().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(startPosition_));

        zserioContext.getEndPosition().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(endPosition_));

        if (isStartOffsetUsed())
        {
            startOffset_.write(zserioContext.getStartOffset(), out);
        }

        if (isEndOffsetUsed())
        {
            endOffset_.write(zserioContext.getEndOffset(), out);
        }
    }

    private final byte shift_;
    private nds.core.geometry.RangeOffsetType offsetType_;
    private byte numBits_;
    private int startPosition_;
    private int endPosition_;
    private nds.core.geometry.PositionOffset2D startOffset_;
    private nds.core.geometry.PositionOffset2D endOffset_;
}
