/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routing.types;

public class Pollution implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            carbonDioxide_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getCarbonDioxide()
        {
            return carbonDioxide_;
        }

        private zserio.runtime.array.DeltaContext carbonDioxide_;
    };

    public Pollution()
    {
    }

    public Pollution(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public Pollution(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public Pollution(
            java.math.BigInteger carbonDioxide_)
    {
        setCarbonDioxide(carbonDioxide_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getCarbonDioxide().init(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(carbonDioxide_));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(carbonDioxide_);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getCarbonDioxide().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(carbonDioxide_));

        return (int)(endBitPosition - bitPosition);
    }

    public java.math.BigInteger getCarbonDioxide()
    {
        return carbonDioxide_;
    }

    public void setCarbonDioxide(java.math.BigInteger carbonDioxide_)
    {
        this.carbonDioxide_ = carbonDioxide_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof Pollution)
        {
            final Pollution that = (Pollution)obj;

            return
                    ((carbonDioxide_ == null) ? that.carbonDioxide_ == null : carbonDioxide_.equals(that.carbonDioxide_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, carbonDioxide_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        carbonDioxide_ = in.readVarUInt();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        carbonDioxide_ = ((zserio.runtime.array.ArrayElement.BigIntegerArrayElement)
                zserioContext.getCarbonDioxide().read(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), in)).get();
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(carbonDioxide_);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getCarbonDioxide().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(carbonDioxide_));

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarUInt(carbonDioxide_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getCarbonDioxide().write(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(carbonDioxide_));
    }

    private java.math.BigInteger carbonDioxide_;
}
