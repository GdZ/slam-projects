/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.rules.types;

public class SupplementaryWarningSignText implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            languageCode_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getLanguageCode()
        {
            return languageCode_;
        }

        private zserio.runtime.array.DeltaContext languageCode_;
    };

    public SupplementaryWarningSignText()
    {
    }

    public SupplementaryWarningSignText(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public SupplementaryWarningSignText(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public SupplementaryWarningSignText(
            java.lang.Short languageCode_,
            java.lang.String text_)
    {
        setLanguageCode(languageCode_);
        setText(text_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        if (isLanguageCodeUsed())
        {
            zserioContext.getLanguageCode().init(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(languageCode_));
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

        endBitPosition += 1;
        if (isLanguageCodeUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(languageCode_);
        }
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(text_);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        if (isLanguageCodeUsed())
        {
            endBitPosition += zserioContext.getLanguageCode().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(languageCode_));
        }
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(text_);

        return (int)(endBitPosition - bitPosition);
    }

    public java.lang.Short getLanguageCode()
    {
        return languageCode_;
    }

    public void setLanguageCode(java.lang.Short languageCode_)
    {
        this.languageCode_ = languageCode_;
    }

    public boolean isLanguageCodeUsed()
    {
        return isLanguageCodeSet();
    }

    public boolean isLanguageCodeSet()
    {
        return (languageCode_ != null);
    }

    public void resetLanguageCode()
    {
        this.languageCode_ = null;
    }

    public java.lang.String getText()
    {
        return text_;
    }

    public void setText(java.lang.String text_)
    {
        this.text_ = text_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof SupplementaryWarningSignText)
        {
            final SupplementaryWarningSignText that = (SupplementaryWarningSignText)obj;

            return
                    ((!isLanguageCodeUsed()) ? !that.isLanguageCodeUsed() :
                        ((languageCode_ == null) ? that.languageCode_ == null : languageCode_.equals(that.languageCode_))) &&
                    ((text_ == null) ? that.text_ == null : text_.equals(that.text_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        if (isLanguageCodeUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, languageCode_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, text_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        if (in.readBool())
        {
            languageCode_ = in.readVarUInt16();
        }

        text_ = in.readString();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        if (in.readBool())
        {
            languageCode_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                    zserioContext.getLanguageCode().read(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();
        }

        text_ = in.readString();
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

        endBitPosition += 1;
        if (isLanguageCodeUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(languageCode_);
        }
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(text_);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        if (isLanguageCodeUsed())
        {
            endBitPosition += zserioContext.getLanguageCode().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(languageCode_));
        }
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(text_);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        if (isLanguageCodeUsed())
        {
            out.writeBool(true);
            out.writeVarUInt16(languageCode_);
        }
        else
        {
            out.writeBool(false);
        }

        out.writeString(text_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        if (isLanguageCodeUsed())
        {
            out.writeBool(true);
            zserioContext.getLanguageCode().write(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(languageCode_));
        }
        else
        {
            out.writeBool(false);
        }

        out.writeString(text_);
    }

    private java.lang.Short languageCode_;
    private java.lang.String text_;
}
