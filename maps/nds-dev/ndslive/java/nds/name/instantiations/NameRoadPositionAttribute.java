/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.name.instantiations;

public class NameRoadPositionAttribute implements zserio.runtime.io.Writer, zserio.runtime.SizeOf
{
    public NameRoadPositionAttribute(
            nds.name.attributes.NameRoadPositionAttributeType attributeTypeCode_)
    {
        this.attributeTypeCode_ = attributeTypeCode_;
    }

    public NameRoadPositionAttribute(zserio.runtime.io.BitStreamReader in,
            nds.name.attributes.NameRoadPositionAttributeType attributeTypeCode_)
            throws java.io.IOException
    {
        this.attributeTypeCode_ = attributeTypeCode_;

        read(in);
    }

    public NameRoadPositionAttribute(
            nds.name.attributes.NameRoadPositionAttributeType attributeTypeCode_,
            nds.name.attributes.NameRoadPositionAttributeValue attributeValue_)
    {
        this(attributeTypeCode_);

        setAttributeValue(attributeValue_);
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

        endBitPosition += attributeValue_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.name.attributes.NameRoadPositionAttributeType getAttributeTypeCode()
    {
        return this.attributeTypeCode_;
    }

    public nds.name.attributes.NameRoadPositionAttributeValue getAttributeValue()
    {
        return attributeValue_;
    }

    public void setAttributeValue(nds.name.attributes.NameRoadPositionAttributeValue attributeValue_)
    {
        this.attributeValue_ = attributeValue_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof NameRoadPositionAttribute)
        {
            final NameRoadPositionAttribute that = (NameRoadPositionAttribute)obj;

            return
                    ((this.attributeTypeCode_ == null) ? that.attributeTypeCode_ == null : this.attributeTypeCode_.getValue() == that.attributeTypeCode_.getValue()) &&
                    ((attributeValue_ == null) ? that.attributeValue_ == null : attributeValue_.equals(that.attributeValue_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getAttributeTypeCode());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, attributeValue_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        attributeValue_ = new nds.name.attributes.NameRoadPositionAttributeValue(in, getAttributeTypeCode());
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

        endBitPosition = attributeValue_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        // check parameters
        if (attributeValue_.getType() != (getAttributeTypeCode()))
        {
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter type for field NameRoadPositionAttribute.attributeValue!");
        }
        attributeValue_.write(out);
    }

    private final nds.name.attributes.NameRoadPositionAttributeType attributeTypeCode_;
    private nds.name.attributes.NameRoadPositionAttributeValue attributeValue_;
}
