/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.conditions;

public class CalendarWeek implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            week_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getWeek()
        {
            return week_;
        }

        private zserio.runtime.array.DeltaContext week_;
    };

    public CalendarWeek()
    {
    }

    public CalendarWeek(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public CalendarWeek(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public CalendarWeek(
            byte week_)
    {
        setWeek(week_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getWeek().init(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(6)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(week_));
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

        endBitPosition += 6;

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getWeek().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(6)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(week_));

        return (int)(endBitPosition - bitPosition);
    }

    public byte getWeek()
    {
        return week_;
    }

    public void setWeek(byte week_)
    {
        this.week_ = week_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof CalendarWeek)
        {
            final CalendarWeek that = (CalendarWeek)obj;

            return
                    week_ == that.week_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, week_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        week_ = (byte)in.readBits(6);

        checkConstraints();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        week_ = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                zserioContext.getWeek().read(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(6)), in)).get();

        checkConstraints();
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

        endBitPosition += 6;

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getWeek().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(6)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(week_));

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        checkConstraints();

        out.writeBits(week_, 6);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        checkConstraints();

        zserioContext.getWeek().write(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(6)), out,
                new zserio.runtime.array.ArrayElement.ByteArrayElement(week_));
    }

    private void checkConstraints()
    {
        if (!(getWeek() > 0 && getWeek() <= 53))
            throw new zserio.runtime.ConstraintError("Constraint violated at CalendarWeek.week!");
    }

    private byte week_;
}
