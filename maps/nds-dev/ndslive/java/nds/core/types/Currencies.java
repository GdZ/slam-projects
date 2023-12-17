/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.types;

public class Currencies implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            numCurrencies_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getNumCurrencies()
        {
            return numCurrencies_;
        }

        private zserio.runtime.array.DeltaContext numCurrencies_;
    };

    public Currencies()
    {
    }

    public Currencies(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public Currencies(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public Currencies(
            short numCurrencies_,
            nds.core.types.Currency[] currencies_)
    {
        setNumCurrencies(numCurrencies_);
        setCurrencies(currencies_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumCurrencies().init(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numCurrencies_));
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
        endBitPosition += currencies_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumCurrencies().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numCurrencies_));
        endBitPosition += currencies_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public short getNumCurrencies()
    {
        return numCurrencies_;
    }

    public void setNumCurrencies(short numCurrencies_)
    {
        this.numCurrencies_ = numCurrencies_;
    }

    public nds.core.types.Currency[] getCurrencies()
    {
        return (currencies_ == null) ? null : currencies_.getRawArray();
    }

    public void setCurrencies(nds.core.types.Currency[] currencies_)
    {
        this.currencies_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.core.types.Currency.class, currencies_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Currency>(new ZserioElementFactory_currencies()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof Currencies)
        {
            final Currencies that = (Currencies)obj;

            return
                    numCurrencies_ == that.numCurrencies_ &&
                    ((currencies_ == null) ? that.currencies_ == null : currencies_.equals(that.currencies_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numCurrencies_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, currencies_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        numCurrencies_ = in.readUnsignedByte();

        currencies_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.core.types.Currency.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Currency>(new ZserioElementFactory_currencies()),
                zserio.runtime.array.ArrayType.NORMAL);
        currencies_.readPacked(in, (int)(getNumCurrencies()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        numCurrencies_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getNumCurrencies().read(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), in)).get();

        currencies_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.core.types.Currency.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Currency>(new ZserioElementFactory_currencies()),
                zserio.runtime.array.ArrayType.NORMAL);
        currencies_.readPacked(in, (int)(getNumCurrencies()));
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
        endBitPosition = currencies_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumCurrencies().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numCurrencies_));
        endBitPosition = currencies_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeUnsignedByte(numCurrencies_);

        if (currencies_.size() != (int)(getNumCurrencies()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field Currencies.currencies: " +
                    currencies_.size() + " != " + (int)(getNumCurrencies()) + "!");
        }
        currencies_.writePacked(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumCurrencies().write(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numCurrencies_));

        if (currencies_.size() != (int)(getNumCurrencies()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field Currencies.currencies: " +
                    currencies_.size() + " != " + (int)(getNumCurrencies()) + "!");
        }
        currencies_.writePacked(out);
    }

    private static final class ZserioElementFactory_currencies implements zserio.runtime.array.PackableElementFactory<nds.core.types.Currency>
    {
        @Override
        public nds.core.types.Currency create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return nds.core.types.Currency.readEnum(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.core.types.Currency create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return nds.core.types.Currency.readEnum(context, in);
        }
    }

    private short numCurrencies_;
    private zserio.runtime.array.Array currencies_;
}
