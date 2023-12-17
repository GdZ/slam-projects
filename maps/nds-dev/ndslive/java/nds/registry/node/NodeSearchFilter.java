/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.registry.node;

public class NodeSearchFilter implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            systemId_ = new nds.system.types.NdsSystemToken.ZserioPackingContext();
            nodeType_ = new zserio.runtime.array.DeltaContext();
            serviceInfoFilter_ = new nds.registry.node.ServiceInformationFilter.ZserioPackingContext();
        }

        public nds.system.types.NdsSystemToken.ZserioPackingContext getSystemId()
        {
            return systemId_;
        }

        public zserio.runtime.array.DeltaContext getNodeType()
        {
            return nodeType_;
        }

        public nds.registry.node.ServiceInformationFilter.ZserioPackingContext getServiceInfoFilter()
        {
            return serviceInfoFilter_;
        }

        private nds.system.types.NdsSystemToken.ZserioPackingContext systemId_;
        private zserio.runtime.array.DeltaContext nodeType_;
        private nds.registry.node.ServiceInformationFilter.ZserioPackingContext serviceInfoFilter_;
    };

    public NodeSearchFilter()
    {
    }

    public NodeSearchFilter(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public NodeSearchFilter(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public NodeSearchFilter(
            nds.system.types.NdsSystemToken systemId_,
            nds.registry.node.NodeType nodeType_,
            nds.registry.node.ServiceInformationFilter serviceInfoFilter_)
    {
        setSystemId(systemId_);
        setNodeType(nodeType_);
        setServiceInfoFilter(serviceInfoFilter_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        systemId_.initPackingContext(zserioContext.getSystemId());
        nodeType_.initPackingContext(zserioContext.getNodeType());
        if (isServiceInfoFilterUsed())
        {
            serviceInfoFilter_.initPackingContext(zserioContext.getServiceInfoFilter());
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

        endBitPosition += systemId_.bitSizeOf(endBitPosition);
        endBitPosition += nodeType_.bitSizeOf(endBitPosition);
        if (isServiceInfoFilterUsed())
        {
            endBitPosition += serviceInfoFilter_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += systemId_.bitSizeOf(zserioContext.getSystemId(), endBitPosition);
        endBitPosition += nodeType_.bitSizeOf(zserioContext.getNodeType(), endBitPosition);
        if (isServiceInfoFilterUsed())
        {
            endBitPosition += serviceInfoFilter_.bitSizeOf(zserioContext.getServiceInfoFilter(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.system.types.NdsSystemToken getSystemId()
    {
        return systemId_;
    }

    public void setSystemId(nds.system.types.NdsSystemToken systemId_)
    {
        this.systemId_ = systemId_;
    }

    public nds.registry.node.NodeType getNodeType()
    {
        return nodeType_;
    }

    public void setNodeType(nds.registry.node.NodeType nodeType_)
    {
        this.nodeType_ = nodeType_;
    }

    public nds.registry.node.ServiceInformationFilter getServiceInfoFilter()
    {
        return serviceInfoFilter_;
    }

    public void setServiceInfoFilter(nds.registry.node.ServiceInformationFilter serviceInfoFilter_)
    {
        this.serviceInfoFilter_ = serviceInfoFilter_;
    }

    public boolean isServiceInfoFilterUsed()
    {
        return (getNodeType() == nds.registry.node.NodeType.SERVICE);
    }

    public boolean isServiceInfoFilterSet()
    {
        return (serviceInfoFilter_ != null);
    }

    public void resetServiceInfoFilter()
    {
        this.serviceInfoFilter_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof NodeSearchFilter)
        {
            final NodeSearchFilter that = (NodeSearchFilter)obj;

            return
                    ((systemId_ == null) ? that.systemId_ == null : systemId_.equals(that.systemId_)) &&
                    ((nodeType_ == null) ? that.nodeType_ == null : nodeType_.getValue() == that.nodeType_.getValue()) &&
                    ((!isServiceInfoFilterUsed()) ? !that.isServiceInfoFilterUsed() :
                        ((serviceInfoFilter_ == null) ? that.serviceInfoFilter_ == null : serviceInfoFilter_.equals(that.serviceInfoFilter_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, systemId_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, nodeType_);
        if (isServiceInfoFilterUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, serviceInfoFilter_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        systemId_ = new nds.system.types.NdsSystemToken(in);

        nodeType_ = nds.registry.node.NodeType.readEnum(in);

        if (getNodeType() == nds.registry.node.NodeType.SERVICE)
        {
            serviceInfoFilter_ = new nds.registry.node.ServiceInformationFilter(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        systemId_ = new nds.system.types.NdsSystemToken(zserioContext.getSystemId(), in);

        nodeType_ = nds.registry.node.NodeType.readEnum(zserioContext.getNodeType(), in);

        if (getNodeType() == nds.registry.node.NodeType.SERVICE)
        {
            serviceInfoFilter_ = new nds.registry.node.ServiceInformationFilter(zserioContext.getServiceInfoFilter(), in);
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

        endBitPosition = systemId_.initializeOffsets(endBitPosition);
        endBitPosition += nodeType_.bitSizeOf(endBitPosition);
        if (isServiceInfoFilterUsed())
        {
            endBitPosition = serviceInfoFilter_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = systemId_.initializeOffsets(zserioContext.getSystemId(), endBitPosition);
        endBitPosition = nodeType_.initializeOffsets(zserioContext.getNodeType(), endBitPosition);
        if (isServiceInfoFilterUsed())
        {
            endBitPosition = serviceInfoFilter_.initializeOffsets(zserioContext.getServiceInfoFilter(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        systemId_.write(out);

        nodeType_.write(out);

        if (isServiceInfoFilterUsed())
        {
            serviceInfoFilter_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        systemId_.write(zserioContext.getSystemId(), out);

        nodeType_.write(zserioContext.getNodeType(), out);

        if (isServiceInfoFilterUsed())
        {
            serviceInfoFilter_.write(zserioContext.getServiceInfoFilter(), out);
        }
    }

    private nds.system.types.NdsSystemToken systemId_;
    private nds.registry.node.NodeType nodeType_;
    private nds.registry.node.ServiceInformationFilter serviceInfoFilter_;
}