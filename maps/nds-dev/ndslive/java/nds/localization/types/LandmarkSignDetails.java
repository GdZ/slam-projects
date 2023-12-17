/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.localization.types;

public class LandmarkSignDetails implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            detailType_ = new zserio.runtime.array.DeltaContext();
            meaning_ = new zserio.runtime.array.DeltaContext();
            diameter_ = new zserio.runtime.array.DeltaContext();
            number_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getDetailType()
        {
            return detailType_;
        }

        public zserio.runtime.array.DeltaContext getMeaning()
        {
            return meaning_;
        }

        public zserio.runtime.array.DeltaContext getDiameter()
        {
            return diameter_;
        }

        public zserio.runtime.array.DeltaContext getNumber()
        {
            return number_;
        }

        private zserio.runtime.array.DeltaContext detailType_;
        private zserio.runtime.array.DeltaContext meaning_;
        private zserio.runtime.array.DeltaContext diameter_;
        private zserio.runtime.array.DeltaContext number_;
    };

    public LandmarkSignDetails()
    {
    }

    public LandmarkSignDetails(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public LandmarkSignDetails(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public LandmarkSignDetails(
            nds.localization.types.LandmarkSignDetailsType detailType_,
            nds.signs.warning.WarningSign meaning_,
            java.lang.Integer diameter_,
            java.lang.Long number_,
            java.lang.String text_)
    {
        setDetailType(detailType_);
        setMeaning(meaning_);
        setDiameter(diameter_);
        setNumber(number_);
        setText(text_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        detailType_.initPackingContext(zserioContext.getDetailType());
        if (isMeaningUsed())
        {
            meaning_.initPackingContext(zserioContext.getMeaning());
        }
        if (isDiameterUsed())
        {
            zserioContext.getDiameter().init(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(diameter_));
        }
        if (isNumberUsed())
        {
            zserioContext.getNumber().init(new zserio.runtime.array.ArrayTraits.VarUInt64ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.LongArrayElement(number_));
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

        endBitPosition += detailType_.bitSizeOf(endBitPosition);
        if (isMeaningUsed())
        {
            endBitPosition += meaning_.bitSizeOf(endBitPosition);
        }
        if (isDiameterUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(diameter_);
        }
        if (isNumberUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt64(number_);
        }
        if (isTextUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(text_);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += detailType_.bitSizeOf(zserioContext.getDetailType(), endBitPosition);
        if (isMeaningUsed())
        {
            endBitPosition += meaning_.bitSizeOf(zserioContext.getMeaning(), endBitPosition);
        }
        if (isDiameterUsed())
        {
            endBitPosition += zserioContext.getDiameter().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(diameter_));
        }
        if (isNumberUsed())
        {
            endBitPosition += zserioContext.getNumber().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt64ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.LongArrayElement(number_));
        }
        if (isTextUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(text_);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.localization.types.LandmarkSignDetailsType getDetailType()
    {
        return detailType_;
    }

    public void setDetailType(nds.localization.types.LandmarkSignDetailsType detailType_)
    {
        this.detailType_ = detailType_;
    }

    public nds.signs.warning.WarningSign getMeaning()
    {
        return meaning_;
    }

    public void setMeaning(nds.signs.warning.WarningSign meaning_)
    {
        this.meaning_ = meaning_;
    }

    public boolean isMeaningUsed()
    {
        return ((getDetailType().and(nds.localization.types.LandmarkSignDetailsType.Values.MEANING)).equals(nds.localization.types.LandmarkSignDetailsType.Values.MEANING));
    }

    public boolean isMeaningSet()
    {
        return (meaning_ != null);
    }

    public void resetMeaning()
    {
        this.meaning_ = null;
    }

    public java.lang.Integer getDiameter()
    {
        return diameter_;
    }

    public void setDiameter(java.lang.Integer diameter_)
    {
        this.diameter_ = diameter_;
    }

    public boolean isDiameterUsed()
    {
        return ((getDetailType().and(nds.localization.types.LandmarkSignDetailsType.Values.DIAMETER)).equals(nds.localization.types.LandmarkSignDetailsType.Values.DIAMETER));
    }

    public boolean isDiameterSet()
    {
        return (diameter_ != null);
    }

    public void resetDiameter()
    {
        this.diameter_ = null;
    }

    public java.lang.Long getNumber()
    {
        return number_;
    }

    public void setNumber(java.lang.Long number_)
    {
        this.number_ = number_;
    }

    public boolean isNumberUsed()
    {
        return ((getDetailType().and(nds.localization.types.LandmarkSignDetailsType.Values.NUMBER)).equals(nds.localization.types.LandmarkSignDetailsType.Values.NUMBER));
    }

    public boolean isNumberSet()
    {
        return (number_ != null);
    }

    public void resetNumber()
    {
        this.number_ = null;
    }

    public java.lang.String getText()
    {
        return text_;
    }

    public void setText(java.lang.String text_)
    {
        this.text_ = text_;
    }

    public boolean isTextUsed()
    {
        return ((getDetailType().and(nds.localization.types.LandmarkSignDetailsType.Values.TEXT)).equals(nds.localization.types.LandmarkSignDetailsType.Values.TEXT));
    }

    public boolean isTextSet()
    {
        return (text_ != null);
    }

    public void resetText()
    {
        this.text_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LandmarkSignDetails)
        {
            final LandmarkSignDetails that = (LandmarkSignDetails)obj;

            return
                    ((detailType_ == null) ? that.detailType_ == null : detailType_.equals(that.detailType_)) &&
                    ((!isMeaningUsed()) ? !that.isMeaningUsed() :
                        ((meaning_ == null) ? that.meaning_ == null : meaning_.getValue() == that.meaning_.getValue())) &&
                    ((!isDiameterUsed()) ? !that.isDiameterUsed() :
                        ((diameter_ == null) ? that.diameter_ == null : diameter_.equals(that.diameter_))) &&
                    ((!isNumberUsed()) ? !that.isNumberUsed() :
                        ((number_ == null) ? that.number_ == null : number_.equals(that.number_))) &&
                    ((!isTextUsed()) ? !that.isTextUsed() :
                        ((text_ == null) ? that.text_ == null : text_.equals(that.text_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, detailType_);
        if (isMeaningUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, meaning_);
        if (isDiameterUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, diameter_);
        if (isNumberUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, number_);
        if (isTextUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, text_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        detailType_ = new nds.localization.types.LandmarkSignDetailsType(in);

        if ((getDetailType().and(nds.localization.types.LandmarkSignDetailsType.Values.MEANING)).equals(nds.localization.types.LandmarkSignDetailsType.Values.MEANING))
        {
            meaning_ = nds.signs.warning.WarningSign.readEnum(in);
        }

        if ((getDetailType().and(nds.localization.types.LandmarkSignDetailsType.Values.DIAMETER)).equals(nds.localization.types.LandmarkSignDetailsType.Values.DIAMETER))
        {
            diameter_ = in.readVarUInt32();
        }

        if ((getDetailType().and(nds.localization.types.LandmarkSignDetailsType.Values.NUMBER)).equals(nds.localization.types.LandmarkSignDetailsType.Values.NUMBER))
        {
            number_ = in.readVarUInt64();
        }

        if ((getDetailType().and(nds.localization.types.LandmarkSignDetailsType.Values.TEXT)).equals(nds.localization.types.LandmarkSignDetailsType.Values.TEXT))
        {
            text_ = in.readString();
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        detailType_ = new nds.localization.types.LandmarkSignDetailsType(zserioContext.getDetailType(), in);

        if ((getDetailType().and(nds.localization.types.LandmarkSignDetailsType.Values.MEANING)).equals(nds.localization.types.LandmarkSignDetailsType.Values.MEANING))
        {
            meaning_ = nds.signs.warning.WarningSign.readEnum(zserioContext.getMeaning(), in);
        }

        if ((getDetailType().and(nds.localization.types.LandmarkSignDetailsType.Values.DIAMETER)).equals(nds.localization.types.LandmarkSignDetailsType.Values.DIAMETER))
        {
            diameter_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                    zserioContext.getDiameter().read(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();
        }

        if ((getDetailType().and(nds.localization.types.LandmarkSignDetailsType.Values.NUMBER)).equals(nds.localization.types.LandmarkSignDetailsType.Values.NUMBER))
        {
            number_ = ((zserio.runtime.array.ArrayElement.LongArrayElement)
                    zserioContext.getNumber().read(new zserio.runtime.array.ArrayTraits.VarUInt64ArrayTraits(), in)).get();
        }

        if ((getDetailType().and(nds.localization.types.LandmarkSignDetailsType.Values.TEXT)).equals(nds.localization.types.LandmarkSignDetailsType.Values.TEXT))
        {
            text_ = in.readString();
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

        endBitPosition += detailType_.bitSizeOf(endBitPosition);
        if (isMeaningUsed())
        {
            endBitPosition += meaning_.bitSizeOf(endBitPosition);
        }
        if (isDiameterUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(diameter_);
        }
        if (isNumberUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt64(number_);
        }
        if (isTextUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(text_);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = detailType_.initializeOffsets(zserioContext.getDetailType(), endBitPosition);
        if (isMeaningUsed())
        {
            endBitPosition = meaning_.initializeOffsets(zserioContext.getMeaning(), endBitPosition);
        }
        if (isDiameterUsed())
        {
            endBitPosition += zserioContext.getDiameter().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(diameter_));
        }
        if (isNumberUsed())
        {
            endBitPosition += zserioContext.getNumber().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt64ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.LongArrayElement(number_));
        }
        if (isTextUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(text_);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        detailType_.write(out);

        if (isMeaningUsed())
        {
            meaning_.write(out);
        }

        if (isDiameterUsed())
        {
            out.writeVarUInt32(diameter_);
        }

        if (isNumberUsed())
        {
            out.writeVarUInt64(number_);
        }

        if (isTextUsed())
        {
            out.writeString(text_);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        detailType_.write(zserioContext.getDetailType(), out);

        if (isMeaningUsed())
        {
            meaning_.write(zserioContext.getMeaning(), out);
        }

        if (isDiameterUsed())
        {
            zserioContext.getDiameter().write(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.IntArrayElement(diameter_));
        }

        if (isNumberUsed())
        {
            zserioContext.getNumber().write(new zserio.runtime.array.ArrayTraits.VarUInt64ArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.LongArrayElement(number_));
        }

        if (isTextUsed())
        {
            out.writeString(text_);
        }
    }

    private nds.localization.types.LandmarkSignDetailsType detailType_;
    private nds.signs.warning.WarningSign meaning_;
    private java.lang.Integer diameter_;
    private java.lang.Long number_;
    private java.lang.String text_;
}