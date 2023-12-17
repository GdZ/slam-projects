/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.localization.instantiations;

public class LocalizationProperty implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            propertyTypeCode_ = new nds.localization.properties.LocalizationPropertyType.ZserioPackingContext();
            propertyValue_ = new nds.localization.properties.LocalizationPropertyValue.ZserioPackingContext();
        }

        public nds.localization.properties.LocalizationPropertyType.ZserioPackingContext getPropertyTypeCode()
        {
            return propertyTypeCode_;
        }

        public nds.localization.properties.LocalizationPropertyValue.ZserioPackingContext getPropertyValue()
        {
            return propertyValue_;
        }

        private nds.localization.properties.LocalizationPropertyType.ZserioPackingContext propertyTypeCode_;
        private nds.localization.properties.LocalizationPropertyValue.ZserioPackingContext propertyValue_;
    };

    public LocalizationProperty()
    {
    }

    public LocalizationProperty(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public LocalizationProperty(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public LocalizationProperty(
            nds.localization.properties.LocalizationPropertyType propertyTypeCode_,
            nds.localization.properties.LocalizationPropertyValue propertyValue_)
    {
        setPropertyTypeCode(propertyTypeCode_);
        setPropertyValue(propertyValue_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        propertyTypeCode_.initPackingContext(zserioContext.getPropertyTypeCode());
        propertyValue_.initPackingContext(zserioContext.getPropertyValue());
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

        endBitPosition += propertyTypeCode_.bitSizeOf(endBitPosition);
        endBitPosition += propertyValue_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += propertyTypeCode_.bitSizeOf(zserioContext.getPropertyTypeCode(), endBitPosition);
        endBitPosition += propertyValue_.bitSizeOf(zserioContext.getPropertyValue(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.localization.properties.LocalizationPropertyType getPropertyTypeCode()
    {
        return propertyTypeCode_;
    }

    public void setPropertyTypeCode(nds.localization.properties.LocalizationPropertyType propertyTypeCode_)
    {
        this.propertyTypeCode_ = propertyTypeCode_;
    }

    public nds.localization.properties.LocalizationPropertyValue getPropertyValue()
    {
        return propertyValue_;
    }

    public void setPropertyValue(nds.localization.properties.LocalizationPropertyValue propertyValue_)
    {
        this.propertyValue_ = propertyValue_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LocalizationProperty)
        {
            final LocalizationProperty that = (LocalizationProperty)obj;

            return
                    ((propertyTypeCode_ == null) ? that.propertyTypeCode_ == null : propertyTypeCode_.equals(that.propertyTypeCode_)) &&
                    ((propertyValue_ == null) ? that.propertyValue_ == null : propertyValue_.equals(that.propertyValue_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, propertyTypeCode_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, propertyValue_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        propertyTypeCode_ = new nds.localization.properties.LocalizationPropertyType(in);

        propertyValue_ = new nds.localization.properties.LocalizationPropertyValue(in, getPropertyTypeCode());
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        propertyTypeCode_ = new nds.localization.properties.LocalizationPropertyType(zserioContext.getPropertyTypeCode(), in);

        propertyValue_ = new nds.localization.properties.LocalizationPropertyValue(zserioContext.getPropertyValue(), in, getPropertyTypeCode());
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

        endBitPosition = propertyTypeCode_.initializeOffsets(endBitPosition);
        endBitPosition = propertyValue_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = propertyTypeCode_.initializeOffsets(zserioContext.getPropertyTypeCode(), endBitPosition);
        endBitPosition = propertyValue_.initializeOffsets(zserioContext.getPropertyValue(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        propertyTypeCode_.write(out);

        // check parameters
        if (propertyValue_.getType() != (getPropertyTypeCode()))
        {
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter type for field LocalizationProperty.propertyValue!");
        }
        propertyValue_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        propertyTypeCode_.write(zserioContext.getPropertyTypeCode(), out);

        propertyValue_.write(zserioContext.getPropertyValue(), out);
    }

    private nds.localization.properties.LocalizationPropertyType propertyTypeCode_;
    private nds.localization.properties.LocalizationPropertyValue propertyValue_;
}