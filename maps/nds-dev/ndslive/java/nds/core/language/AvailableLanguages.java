/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.language;

public class AvailableLanguages implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
    };

    public AvailableLanguages()
    {
    }

    public AvailableLanguages(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public AvailableLanguages(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public AvailableLanguages(
            nds.core.language.LanguageMapping[] availableLanguages_)
    {
        setAvailableLanguages(availableLanguages_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
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

        endBitPosition += availableLanguages_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += availableLanguages_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.language.LanguageMapping[] getAvailableLanguages()
    {
        return (availableLanguages_ == null) ? null : availableLanguages_.getRawArray();
    }

    public void setAvailableLanguages(nds.core.language.LanguageMapping[] availableLanguages_)
    {
        this.availableLanguages_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.language.LanguageMapping.class, availableLanguages_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.language.LanguageMapping>(new ZserioElementFactory_availableLanguages()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof AvailableLanguages)
        {
            final AvailableLanguages that = (AvailableLanguages)obj;

            return
                    ((availableLanguages_ == null) ? that.availableLanguages_ == null : availableLanguages_.equals(that.availableLanguages_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, availableLanguages_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        availableLanguages_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.language.LanguageMapping.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.language.LanguageMapping>(new ZserioElementFactory_availableLanguages()),
                zserio.runtime.array.ArrayType.AUTO);
        availableLanguages_.read(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        availableLanguages_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.language.LanguageMapping.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.language.LanguageMapping>(new ZserioElementFactory_availableLanguages()),
                zserio.runtime.array.ArrayType.AUTO);
        availableLanguages_.readPacked(in);
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

        endBitPosition = availableLanguages_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition = availableLanguages_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        availableLanguages_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        availableLanguages_.writePacked(out);
    }

    private static final class ZserioElementFactory_availableLanguages implements zserio.runtime.array.PackableElementFactory<nds.core.language.LanguageMapping>
    {
        @Override
        public nds.core.language.LanguageMapping create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.language.LanguageMapping(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.language.LanguageMapping.ZserioPackingContext();
        }

        @Override
        public nds.core.language.LanguageMapping create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.language.LanguageMapping(context, in);
        }
    }

    private zserio.runtime.array.Array availableLanguages_;
}