/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routingdata.types;

public class SpeedProfile implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            id_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getId()
        {
            return id_;
        }

        private zserio.runtime.array.DeltaContext id_;
    };

    public SpeedProfile()
    {
    }

    public SpeedProfile(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public SpeedProfile(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public SpeedProfile(
            short id_,
            short[] values_)
    {
        setId(id_);
        setValues(values_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getId().init(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(id_));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(id_);
        endBitPosition += values_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(id_));
        endBitPosition += values_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public short getId()
    {
        return id_;
    }

    public void setId(short id_)
    {
        this.id_ = id_;
    }

    public short[] getValues()
    {
        return (values_ == null) ? null : values_.getRawArray();
    }

    public void setValues(short[] values_)
    {
        this.values_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ShortRawArray(values_),
                new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof SpeedProfile)
        {
            final SpeedProfile that = (SpeedProfile)obj;

            return
                    id_ == that.id_ &&
                    ((values_ == null) ? that.values_ == null : values_.equals(that.values_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, id_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, values_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        id_ = in.readVarUInt16();

        values_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ShortRawArray(),
                new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                zserio.runtime.array.ArrayType.AUTO);
        values_.readPacked(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        id_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getId().read(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();

        values_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ShortRawArray(),
                new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                zserio.runtime.array.ArrayType.AUTO);
        values_.readPacked(in);
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(id_);
        endBitPosition = values_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(id_));
        endBitPosition = values_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarUInt16(id_);

        values_.writePacked(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getId().write(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(id_));

        values_.writePacked(out);
    }

    private short id_;
    private zserio.runtime.array.Array values_;
}