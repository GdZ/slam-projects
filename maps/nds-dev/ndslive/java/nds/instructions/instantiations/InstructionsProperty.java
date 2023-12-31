/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.instructions.instantiations;

public class InstructionsProperty implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            propertyTypeCode_ = new nds.instructions.properties.InstructionsPropertyType.ZserioPackingContext();
            propertyValue_ = new nds.instructions.properties.InstructionsPropertyValue.ZserioPackingContext();
        }

        public nds.instructions.properties.InstructionsPropertyType.ZserioPackingContext getPropertyTypeCode()
        {
            return propertyTypeCode_;
        }

        public nds.instructions.properties.InstructionsPropertyValue.ZserioPackingContext getPropertyValue()
        {
            return propertyValue_;
        }

        private nds.instructions.properties.InstructionsPropertyType.ZserioPackingContext propertyTypeCode_;
        private nds.instructions.properties.InstructionsPropertyValue.ZserioPackingContext propertyValue_;
    };

    public InstructionsProperty()
    {
    }

    public InstructionsProperty(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public InstructionsProperty(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public InstructionsProperty(
            nds.instructions.properties.InstructionsPropertyType propertyTypeCode_,
            nds.instructions.properties.InstructionsPropertyValue propertyValue_)
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

    public nds.instructions.properties.InstructionsPropertyType getPropertyTypeCode()
    {
        return propertyTypeCode_;
    }

    public void setPropertyTypeCode(nds.instructions.properties.InstructionsPropertyType propertyTypeCode_)
    {
        this.propertyTypeCode_ = propertyTypeCode_;
    }

    public nds.instructions.properties.InstructionsPropertyValue getPropertyValue()
    {
        return propertyValue_;
    }

    public void setPropertyValue(nds.instructions.properties.InstructionsPropertyValue propertyValue_)
    {
        this.propertyValue_ = propertyValue_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof InstructionsProperty)
        {
            final InstructionsProperty that = (InstructionsProperty)obj;

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
        propertyTypeCode_ = new nds.instructions.properties.InstructionsPropertyType(in);

        propertyValue_ = new nds.instructions.properties.InstructionsPropertyValue(in, getPropertyTypeCode());
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        propertyTypeCode_ = new nds.instructions.properties.InstructionsPropertyType(zserioContext.getPropertyTypeCode(), in);

        propertyValue_ = new nds.instructions.properties.InstructionsPropertyValue(zserioContext.getPropertyValue(), in, getPropertyTypeCode());
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
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter type for field InstructionsProperty.propertyValue!");
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

    private nds.instructions.properties.InstructionsPropertyType propertyTypeCode_;
    private nds.instructions.properties.InstructionsPropertyValue propertyValue_;
}
