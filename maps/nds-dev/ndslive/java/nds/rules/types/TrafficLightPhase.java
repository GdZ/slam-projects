/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.types;

public class TrafficLightPhase implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            meaning_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getMeaning()
        {
            return meaning_;
        }

        private zserio.runtime.array.DeltaContext meaning_;
    };

    public TrafficLightPhase(
            byte numLenses_)
    {
        this.numLenses_ = numLenses_;
    }

    public TrafficLightPhase(zserio.runtime.io.BitStreamReader in,
            byte numLenses_)
            throws java.io.IOException
    {
        this.numLenses_ = numLenses_;

        read(in);
    }

    public TrafficLightPhase(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            byte numLenses_)
            throws java.io.IOException
    {
        this.numLenses_ = numLenses_;

        read(context, in);
    }

    public TrafficLightPhase(
            byte numLenses_,
            boolean[] activeLense_,
            boolean[] blinkingLense_,
            nds.rules.types.TrafficLightPhaseMeaning meaning_)
    {
        this(numLenses_);

        setActiveLense(activeLense_);
        setBlinkingLense(blinkingLense_);
        setMeaning(meaning_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        meaning_.initPackingContext(zserioContext.getMeaning());
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

        endBitPosition += activeLense_.bitSizeOf(endBitPosition);
        endBitPosition += blinkingLense_.bitSizeOf(endBitPosition);
        endBitPosition += meaning_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += activeLense_.bitSizeOf(endBitPosition);
        endBitPosition += blinkingLense_.bitSizeOf(endBitPosition);
        endBitPosition += meaning_.bitSizeOf(zserioContext.getMeaning(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public byte getNumLenses()
    {
        return this.numLenses_;
    }

    public boolean[] getActiveLense()
    {
        return (activeLense_ == null) ? null : activeLense_.getRawArray();
    }

    public void setActiveLense(boolean[] activeLense_)
    {
        this.activeLense_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.BooleanRawArray(activeLense_),
                new zserio.runtime.array.ArrayTraits.BoolArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public boolean[] getBlinkingLense()
    {
        return (blinkingLense_ == null) ? null : blinkingLense_.getRawArray();
    }

    public void setBlinkingLense(boolean[] blinkingLense_)
    {
        this.blinkingLense_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.BooleanRawArray(blinkingLense_),
                new zserio.runtime.array.ArrayTraits.BoolArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public nds.rules.types.TrafficLightPhaseMeaning getMeaning()
    {
        return meaning_;
    }

    public void setMeaning(nds.rules.types.TrafficLightPhaseMeaning meaning_)
    {
        this.meaning_ = meaning_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof TrafficLightPhase)
        {
            final TrafficLightPhase that = (TrafficLightPhase)obj;

            return
                    this.numLenses_ == that.numLenses_ &&
                    ((activeLense_ == null) ? that.activeLense_ == null : activeLense_.equals(that.activeLense_)) &&
                    ((blinkingLense_ == null) ? that.blinkingLense_ == null : blinkingLense_.equals(that.blinkingLense_)) &&
                    ((meaning_ == null) ? that.meaning_ == null : meaning_.getValue() == that.meaning_.getValue());
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getNumLenses());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, activeLense_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, blinkingLense_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, meaning_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        activeLense_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.BooleanRawArray(),
                new zserio.runtime.array.ArrayTraits.BoolArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
        activeLense_.read(in, (int)(getNumLenses()));

        blinkingLense_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.BooleanRawArray(),
                new zserio.runtime.array.ArrayTraits.BoolArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
        blinkingLense_.read(in, (int)(getNumLenses()));

        meaning_ = nds.rules.types.TrafficLightPhaseMeaning.readEnum(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        activeLense_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.BooleanRawArray(),
                new zserio.runtime.array.ArrayTraits.BoolArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
        activeLense_.read(in, (int)(getNumLenses()));

        blinkingLense_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.BooleanRawArray(),
                new zserio.runtime.array.ArrayTraits.BoolArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
        blinkingLense_.read(in, (int)(getNumLenses()));

        meaning_ = nds.rules.types.TrafficLightPhaseMeaning.readEnum(zserioContext.getMeaning(), in);
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

        endBitPosition = activeLense_.initializeOffsets(endBitPosition);
        endBitPosition = blinkingLense_.initializeOffsets(endBitPosition);
        endBitPosition += meaning_.bitSizeOf(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = activeLense_.initializeOffsets(endBitPosition);
        endBitPosition = blinkingLense_.initializeOffsets(endBitPosition);
        endBitPosition = meaning_.initializeOffsets(zserioContext.getMeaning(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        if (activeLense_.size() != (int)(getNumLenses()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field TrafficLightPhase.activeLense: " +
                    activeLense_.size() + " != " + (int)(getNumLenses()) + "!");
        }
        activeLense_.write(out);

        if (blinkingLense_.size() != (int)(getNumLenses()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field TrafficLightPhase.blinkingLense: " +
                    blinkingLense_.size() + " != " + (int)(getNumLenses()) + "!");
        }
        blinkingLense_.write(out);

        meaning_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        if (activeLense_.size() != (int)(getNumLenses()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field TrafficLightPhase.activeLense: " +
                    activeLense_.size() + " != " + (int)(getNumLenses()) + "!");
        }
        activeLense_.write(out);

        if (blinkingLense_.size() != (int)(getNumLenses()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field TrafficLightPhase.blinkingLense: " +
                    blinkingLense_.size() + " != " + (int)(getNumLenses()) + "!");
        }
        blinkingLense_.write(out);

        meaning_.write(zserioContext.getMeaning(), out);
    }

    private final byte numLenses_;
    private zserio.runtime.array.Array activeLense_;
    private zserio.runtime.array.Array blinkingLense_;
    private nds.rules.types.TrafficLightPhaseMeaning meaning_;
}
