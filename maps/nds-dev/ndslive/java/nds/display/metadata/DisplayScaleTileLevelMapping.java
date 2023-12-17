/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.metadata;

public class DisplayScaleTileLevelMapping implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            numLevels_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getNumLevels()
        {
            return numLevels_;
        }

        private zserio.runtime.array.DeltaContext numLevels_;
    };

    public DisplayScaleTileLevelMapping()
    {
    }

    public DisplayScaleTileLevelMapping(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public DisplayScaleTileLevelMapping(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public DisplayScaleTileLevelMapping(
            byte numLevels_,
            byte[] tileLevel_,
            nds.core.types.ScaleRange[] scaleRange_)
    {
        setNumLevels(numLevels_);
        setTileLevel(tileLevel_);
        setScaleRange(scaleRange_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumLevels().init(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(4)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(numLevels_));
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

        endBitPosition += 4;
        endBitPosition += tileLevel_.bitSizeOf(endBitPosition);
        endBitPosition += scaleRange_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumLevels().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(4)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(numLevels_));
        endBitPosition += tileLevel_.bitSizeOfPacked(endBitPosition);
        endBitPosition += scaleRange_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public byte getNumLevels()
    {
        return numLevels_;
    }

    public void setNumLevels(byte numLevels_)
    {
        this.numLevels_ = numLevels_;
    }

    public byte[] getTileLevel()
    {
        return (tileLevel_ == null) ? null : tileLevel_.getRawArray();
    }

    public void setTileLevel(byte[] tileLevel_)
    {
        this.tileLevel_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ByteRawArray(tileLevel_),
                new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(4)),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public nds.core.types.ScaleRange[] getScaleRange()
    {
        return (scaleRange_ == null) ? null : scaleRange_.getRawArray();
    }

    public void setScaleRange(nds.core.types.ScaleRange[] scaleRange_)
    {
        this.scaleRange_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.ScaleRange.class, scaleRange_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.ScaleRange>(new ZserioElementFactory_scaleRange()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof DisplayScaleTileLevelMapping)
        {
            final DisplayScaleTileLevelMapping that = (DisplayScaleTileLevelMapping)obj;

            return
                    numLevels_ == that.numLevels_ &&
                    ((tileLevel_ == null) ? that.tileLevel_ == null : tileLevel_.equals(that.tileLevel_)) &&
                    ((scaleRange_ == null) ? that.scaleRange_ == null : scaleRange_.equals(that.scaleRange_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numLevels_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, tileLevel_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, scaleRange_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        numLevels_ = (byte)in.readBits(4);

        tileLevel_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ByteRawArray(),
                new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(4)),
                zserio.runtime.array.ArrayType.NORMAL);
        tileLevel_.read(in, (int)(getNumLevels()));

        scaleRange_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.ScaleRange.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.ScaleRange>(new ZserioElementFactory_scaleRange()),
                zserio.runtime.array.ArrayType.NORMAL);
        scaleRange_.readPacked(in, (int)(getNumLevels()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        numLevels_ = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                zserioContext.getNumLevels().read(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(4)), in)).get();

        tileLevel_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ByteRawArray(),
                new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(4)),
                zserio.runtime.array.ArrayType.NORMAL);
        tileLevel_.readPacked(in, (int)(getNumLevels()));

        scaleRange_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.ScaleRange.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.ScaleRange>(new ZserioElementFactory_scaleRange()),
                zserio.runtime.array.ArrayType.NORMAL);
        scaleRange_.readPacked(in, (int)(getNumLevels()));
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

        endBitPosition += 4;
        endBitPosition = tileLevel_.initializeOffsets(endBitPosition);
        endBitPosition = scaleRange_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumLevels().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(4)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(numLevels_));
        endBitPosition = tileLevel_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = scaleRange_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBits(numLevels_, 4);

        if (tileLevel_.size() != (int)(getNumLevels()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field DisplayScaleTileLevelMapping.tileLevel: " +
                    tileLevel_.size() + " != " + (int)(getNumLevels()) + "!");
        }
        tileLevel_.write(out);

        if (scaleRange_.size() != (int)(getNumLevels()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field DisplayScaleTileLevelMapping.scaleRange: " +
                    scaleRange_.size() + " != " + (int)(getNumLevels()) + "!");
        }
        scaleRange_.writePacked(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumLevels().write(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(4)), out,
                new zserio.runtime.array.ArrayElement.ByteArrayElement(numLevels_));

        if (tileLevel_.size() != (int)(getNumLevels()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field DisplayScaleTileLevelMapping.tileLevel: " +
                    tileLevel_.size() + " != " + (int)(getNumLevels()) + "!");
        }
        tileLevel_.writePacked(out);

        if (scaleRange_.size() != (int)(getNumLevels()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field DisplayScaleTileLevelMapping.scaleRange: " +
                    scaleRange_.size() + " != " + (int)(getNumLevels()) + "!");
        }
        scaleRange_.writePacked(out);
    }

    private static final class ZserioElementFactory_scaleRange implements zserio.runtime.array.PackableElementFactory<nds.core.types.ScaleRange>
    {
        @Override
        public nds.core.types.ScaleRange create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.types.ScaleRange(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.types.ScaleRange.ZserioPackingContext();
        }

        @Override
        public nds.core.types.ScaleRange create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.types.ScaleRange(context, in);
        }
    }

    private byte numLevels_;
    private zserio.runtime.array.Array tileLevel_;
    private zserio.runtime.array.Array scaleRange_;
}