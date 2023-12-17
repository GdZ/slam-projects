/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routingdata.properties;

public class RoutingPropertyType implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            type_ = new zserio.runtime.array.DeltaContext();
            coreType_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getType()
        {
            return type_;
        }

        public zserio.runtime.array.DeltaContext getCoreType()
        {
            return coreType_;
        }

        private zserio.runtime.array.DeltaContext type_;
        private zserio.runtime.array.DeltaContext coreType_;
    };

    public RoutingPropertyType()
    {
    }

    public RoutingPropertyType(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoutingPropertyType(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoutingPropertyType(
            nds.routingdata.properties.PropertyType type_,
            nds.core.properties.CorePropertyType coreType_)
    {
        setType(type_);
        setCoreType(coreType_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_.initPackingContext(zserioContext.getType());
        if (isCoreTypeUsed())
        {
            coreType_.initPackingContext(zserioContext.getCoreType());
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

        endBitPosition += type_.bitSizeOf(endBitPosition);
        if (isCoreTypeUsed())
        {
            endBitPosition += coreType_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += type_.bitSizeOf(zserioContext.getType(), endBitPosition);
        if (isCoreTypeUsed())
        {
            endBitPosition += coreType_.bitSizeOf(zserioContext.getCoreType(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.routingdata.properties.PropertyType getType()
    {
        return type_;
    }

    public void setType(nds.routingdata.properties.PropertyType type_)
    {
        this.type_ = type_;
    }

    public nds.core.properties.CorePropertyType getCoreType()
    {
        return coreType_;
    }

    public void setCoreType(nds.core.properties.CorePropertyType coreType_)
    {
        this.coreType_ = coreType_;
    }

    public boolean isCoreTypeUsed()
    {
        return (getType() == nds.routingdata.properties.PropertyType.CORE);
    }

    public boolean isCoreTypeSet()
    {
        return (coreType_ != null);
    }

    public void resetCoreType()
    {
        this.coreType_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoutingPropertyType)
        {
            final RoutingPropertyType that = (RoutingPropertyType)obj;

            return
                    ((type_ == null) ? that.type_ == null : type_.getValue() == that.type_.getValue()) &&
                    ((!isCoreTypeUsed()) ? !that.isCoreTypeUsed() :
                        ((coreType_ == null) ? that.coreType_ == null : coreType_.getValue() == that.coreType_.getValue()));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, type_);
        if (isCoreTypeUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, coreType_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        type_ = nds.routingdata.properties.PropertyType.readEnum(in);

        if (getType() == nds.routingdata.properties.PropertyType.CORE)
        {
            coreType_ = nds.core.properties.CorePropertyType.readEnum(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_ = nds.routingdata.properties.PropertyType.readEnum(zserioContext.getType(), in);

        if (getType() == nds.routingdata.properties.PropertyType.CORE)
        {
            coreType_ = nds.core.properties.CorePropertyType.readEnum(zserioContext.getCoreType(), in);
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

        endBitPosition += type_.bitSizeOf(endBitPosition);
        if (isCoreTypeUsed())
        {
            endBitPosition += coreType_.bitSizeOf(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = type_.initializeOffsets(zserioContext.getType(), endBitPosition);
        if (isCoreTypeUsed())
        {
            endBitPosition = coreType_.initializeOffsets(zserioContext.getCoreType(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        type_.write(out);

        if (isCoreTypeUsed())
        {
            coreType_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_.write(zserioContext.getType(), out);

        if (isCoreTypeUsed())
        {
            coreType_.write(zserioContext.getCoreType(), out);
        }
    }

    private nds.routingdata.properties.PropertyType type_;
    private nds.core.properties.CorePropertyType coreType_;
}
