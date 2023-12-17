/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routingdata.instantiations;

public class RoutingLaneTransitionFullAttribute implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            attributeTypeCode_ = new zserio.runtime.array.DeltaContext();
            attributeValue_ = new nds.routingdata.attributes.RoutingLaneTransitionAttributeValue.ZserioPackingContext();
            properties_ = new nds.routingdata.instantiations.RoutingPropertyList.ZserioPackingContext();
            conditions_ = new nds.core.attributemap.ConditionList.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getAttributeTypeCode()
        {
            return attributeTypeCode_;
        }

        public nds.routingdata.attributes.RoutingLaneTransitionAttributeValue.ZserioPackingContext getAttributeValue()
        {
            return attributeValue_;
        }

        public nds.routingdata.instantiations.RoutingPropertyList.ZserioPackingContext getProperties()
        {
            return properties_;
        }

        public nds.core.attributemap.ConditionList.ZserioPackingContext getConditions()
        {
            return conditions_;
        }

        private zserio.runtime.array.DeltaContext attributeTypeCode_;
        private nds.routingdata.attributes.RoutingLaneTransitionAttributeValue.ZserioPackingContext attributeValue_;
        private nds.routingdata.instantiations.RoutingPropertyList.ZserioPackingContext properties_;
        private nds.core.attributemap.ConditionList.ZserioPackingContext conditions_;
    };

    public RoutingLaneTransitionFullAttribute()
    {
    }

    public RoutingLaneTransitionFullAttribute(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoutingLaneTransitionFullAttribute(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoutingLaneTransitionFullAttribute(
            nds.routingdata.attributes.RoutingLaneTransitionAttributeType attributeTypeCode_,
            nds.routingdata.attributes.RoutingLaneTransitionAttributeValue attributeValue_,
            nds.routingdata.instantiations.RoutingPropertyList properties_,
            nds.core.attributemap.ConditionList conditions_)
    {
        setAttributeTypeCode(attributeTypeCode_);
        setAttributeValue(attributeValue_);
        setProperties(properties_);
        setConditions(conditions_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        attributeTypeCode_.initPackingContext(zserioContext.getAttributeTypeCode());
        attributeValue_.initPackingContext(zserioContext.getAttributeValue());
        if (isPropertiesUsed())
        {
            properties_.initPackingContext(zserioContext.getProperties());
        }
        if (isConditionsUsed())
        {
            conditions_.initPackingContext(zserioContext.getConditions());
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

        endBitPosition += attributeTypeCode_.bitSizeOf(endBitPosition);
        endBitPosition += attributeValue_.bitSizeOf(endBitPosition);
        endBitPosition += 1;
        if (isPropertiesUsed())
        {
            endBitPosition += properties_.bitSizeOf(endBitPosition);
        }
        endBitPosition += 1;
        if (isConditionsUsed())
        {
            endBitPosition += conditions_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += attributeTypeCode_.bitSizeOf(zserioContext.getAttributeTypeCode(), endBitPosition);
        endBitPosition += attributeValue_.bitSizeOf(zserioContext.getAttributeValue(), endBitPosition);
        endBitPosition += 1;
        if (isPropertiesUsed())
        {
            endBitPosition += properties_.bitSizeOf(zserioContext.getProperties(), endBitPosition);
        }
        endBitPosition += 1;
        if (isConditionsUsed())
        {
            endBitPosition += conditions_.bitSizeOf(zserioContext.getConditions(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.routingdata.attributes.RoutingLaneTransitionAttributeType getAttributeTypeCode()
    {
        return attributeTypeCode_;
    }

    public void setAttributeTypeCode(nds.routingdata.attributes.RoutingLaneTransitionAttributeType attributeTypeCode_)
    {
        this.attributeTypeCode_ = attributeTypeCode_;
    }

    public nds.routingdata.attributes.RoutingLaneTransitionAttributeValue getAttributeValue()
    {
        return attributeValue_;
    }

    public void setAttributeValue(nds.routingdata.attributes.RoutingLaneTransitionAttributeValue attributeValue_)
    {
        this.attributeValue_ = attributeValue_;
    }

    public nds.routingdata.instantiations.RoutingPropertyList getProperties()
    {
        return properties_;
    }

    public void setProperties(nds.routingdata.instantiations.RoutingPropertyList properties_)
    {
        this.properties_ = properties_;
    }

    public boolean isPropertiesUsed()
    {
        return isPropertiesSet();
    }

    public boolean isPropertiesSet()
    {
        return (properties_ != null);
    }

    public void resetProperties()
    {
        this.properties_ = null;
    }

    public nds.core.attributemap.ConditionList getConditions()
    {
        return conditions_;
    }

    public void setConditions(nds.core.attributemap.ConditionList conditions_)
    {
        this.conditions_ = conditions_;
    }

    public boolean isConditionsUsed()
    {
        return isConditionsSet();
    }

    public boolean isConditionsSet()
    {
        return (conditions_ != null);
    }

    public void resetConditions()
    {
        this.conditions_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoutingLaneTransitionFullAttribute)
        {
            final RoutingLaneTransitionFullAttribute that = (RoutingLaneTransitionFullAttribute)obj;

            return
                    ((attributeTypeCode_ == null) ? that.attributeTypeCode_ == null : attributeTypeCode_.getValue() == that.attributeTypeCode_.getValue()) &&
                    ((attributeValue_ == null) ? that.attributeValue_ == null : attributeValue_.equals(that.attributeValue_)) &&
                    ((!isPropertiesUsed()) ? !that.isPropertiesUsed() :
                        ((properties_ == null) ? that.properties_ == null : properties_.equals(that.properties_))) &&
                    ((!isConditionsUsed()) ? !that.isConditionsUsed() :
                        ((conditions_ == null) ? that.conditions_ == null : conditions_.equals(that.conditions_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, attributeTypeCode_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, attributeValue_);
        if (isPropertiesUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, properties_);
        if (isConditionsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, conditions_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        attributeTypeCode_ = nds.routingdata.attributes.RoutingLaneTransitionAttributeType.readEnum(in);

        attributeValue_ = new nds.routingdata.attributes.RoutingLaneTransitionAttributeValue(in, getAttributeTypeCode());

        if (in.readBool())
        {
            properties_ = new nds.routingdata.instantiations.RoutingPropertyList(in);
        }

        if (in.readBool())
        {
            conditions_ = new nds.core.attributemap.ConditionList(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        attributeTypeCode_ = nds.routingdata.attributes.RoutingLaneTransitionAttributeType.readEnum(zserioContext.getAttributeTypeCode(), in);

        attributeValue_ = new nds.routingdata.attributes.RoutingLaneTransitionAttributeValue(zserioContext.getAttributeValue(), in, getAttributeTypeCode());

        if (in.readBool())
        {
            properties_ = new nds.routingdata.instantiations.RoutingPropertyList(zserioContext.getProperties(), in);
        }

        if (in.readBool())
        {
            conditions_ = new nds.core.attributemap.ConditionList(zserioContext.getConditions(), in);
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

        endBitPosition += attributeTypeCode_.bitSizeOf(endBitPosition);
        endBitPosition = attributeValue_.initializeOffsets(endBitPosition);
        endBitPosition += 1;
        if (isPropertiesUsed())
        {
            endBitPosition = properties_.initializeOffsets(endBitPosition);
        }
        endBitPosition += 1;
        if (isConditionsUsed())
        {
            endBitPosition = conditions_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = attributeTypeCode_.initializeOffsets(zserioContext.getAttributeTypeCode(), endBitPosition);
        endBitPosition = attributeValue_.initializeOffsets(zserioContext.getAttributeValue(), endBitPosition);
        endBitPosition += 1;
        if (isPropertiesUsed())
        {
            endBitPosition = properties_.initializeOffsets(zserioContext.getProperties(), endBitPosition);
        }
        endBitPosition += 1;
        if (isConditionsUsed())
        {
            endBitPosition = conditions_.initializeOffsets(zserioContext.getConditions(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        attributeTypeCode_.write(out);

        // check parameters
        if (attributeValue_.getType() != (getAttributeTypeCode()))
        {
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter type for field RoutingLaneTransitionFullAttribute.attributeValue!");
        }
        attributeValue_.write(out);

        if (isPropertiesUsed())
        {
            out.writeBool(true);
            properties_.write(out);
        }
        else
        {
            out.writeBool(false);
        }

        if (isConditionsUsed())
        {
            out.writeBool(true);
            conditions_.write(out);
        }
        else
        {
            out.writeBool(false);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        attributeTypeCode_.write(zserioContext.getAttributeTypeCode(), out);

        attributeValue_.write(zserioContext.getAttributeValue(), out);

        if (isPropertiesUsed())
        {
            out.writeBool(true);
            properties_.write(zserioContext.getProperties(), out);
        }
        else
        {
            out.writeBool(false);
        }

        if (isConditionsUsed())
        {
            out.writeBool(true);
            conditions_.write(zserioContext.getConditions(), out);
        }
        else
        {
            out.writeBool(false);
        }
    }

    private nds.routingdata.attributes.RoutingLaneTransitionAttributeType attributeTypeCode_;
    private nds.routingdata.attributes.RoutingLaneTransitionAttributeValue attributeValue_;
    private nds.routingdata.instantiations.RoutingPropertyList properties_;
    private nds.core.attributemap.ConditionList conditions_;
}
