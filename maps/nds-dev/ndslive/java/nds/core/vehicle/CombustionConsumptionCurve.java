/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.vehicle;

public class CombustionConsumptionCurve implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            numEntries_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getNumEntries()
        {
            return numEntries_;
        }

        private zserio.runtime.array.DeltaContext numEntries_;
    };

    public CombustionConsumptionCurve()
    {
    }

    public CombustionConsumptionCurve(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public CombustionConsumptionCurve(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public CombustionConsumptionCurve(
            short numEntries_,
            short[] speed_,
            float[] consumption_)
    {
        setNumEntries(numEntries_);
        setSpeed(speed_);
        setConsumption(consumption_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumEntries().init(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numEntries_));
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

        endBitPosition += 8;
        endBitPosition += speed_.bitSizeOf(endBitPosition);
        endBitPosition += consumption_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumEntries().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numEntries_));
        endBitPosition += speed_.bitSizeOfPacked(endBitPosition);
        endBitPosition += consumption_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public short getNumEntries()
    {
        return numEntries_;
    }

    public void setNumEntries(short numEntries_)
    {
        this.numEntries_ = numEntries_;
    }

    public short[] getSpeed()
    {
        return (speed_ == null) ? null : speed_.getRawArray();
    }

    public void setSpeed(short[] speed_)
    {
        this.speed_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ShortRawArray(speed_),
                new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public float[] getConsumption()
    {
        return (consumption_ == null) ? null : consumption_.getRawArray();
    }

    public void setConsumption(float[] consumption_)
    {
        this.consumption_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.FloatRawArray(consumption_),
                new zserio.runtime.array.ArrayTraits.Float16ArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof CombustionConsumptionCurve)
        {
            final CombustionConsumptionCurve that = (CombustionConsumptionCurve)obj;

            return
                    numEntries_ == that.numEntries_ &&
                    ((speed_ == null) ? that.speed_ == null : speed_.equals(that.speed_)) &&
                    ((consumption_ == null) ? that.consumption_ == null : consumption_.equals(that.consumption_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numEntries_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, speed_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, consumption_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        numEntries_ = in.readUnsignedByte();

        speed_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ShortRawArray(),
                new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                zserio.runtime.array.ArrayType.NORMAL);
        speed_.read(in, (int)(getNumEntries()));

        consumption_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.FloatRawArray(),
                new zserio.runtime.array.ArrayTraits.Float16ArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
        consumption_.read(in, (int)(getNumEntries()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        numEntries_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getNumEntries().read(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), in)).get();

        speed_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ShortRawArray(),
                new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                zserio.runtime.array.ArrayType.NORMAL);
        speed_.readPacked(in, (int)(getNumEntries()));

        consumption_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.FloatRawArray(),
                new zserio.runtime.array.ArrayTraits.Float16ArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
        consumption_.read(in, (int)(getNumEntries()));
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

        endBitPosition += 8;
        endBitPosition = speed_.initializeOffsets(endBitPosition);
        endBitPosition = consumption_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumEntries().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numEntries_));
        endBitPosition = speed_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = consumption_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeUnsignedByte(numEntries_);

        if (speed_.size() != (int)(getNumEntries()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field CombustionConsumptionCurve.speed: " +
                    speed_.size() + " != " + (int)(getNumEntries()) + "!");
        }
        speed_.write(out);

        if (consumption_.size() != (int)(getNumEntries()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field CombustionConsumptionCurve.consumption: " +
                    consumption_.size() + " != " + (int)(getNumEntries()) + "!");
        }
        consumption_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumEntries().write(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numEntries_));

        if (speed_.size() != (int)(getNumEntries()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field CombustionConsumptionCurve.speed: " +
                    speed_.size() + " != " + (int)(getNumEntries()) + "!");
        }
        speed_.writePacked(out);

        if (consumption_.size() != (int)(getNumEntries()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field CombustionConsumptionCurve.consumption: " +
                    consumption_.size() + " != " + (int)(getNumEntries()) + "!");
        }
        consumption_.write(out);
    }

    private short numEntries_;
    private zserio.runtime.array.Array speed_;
    private zserio.runtime.array.Array consumption_;
}
