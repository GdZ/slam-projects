/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.system.types;

public class NdsNodeToken implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            nodeId_ = new nds.system.types.UUID.ZserioPackingContext();
        }

        public nds.system.types.UUID.ZserioPackingContext getNodeId()
        {
            return nodeId_;
        }

        private nds.system.types.UUID.ZserioPackingContext nodeId_;
    };

    public NdsNodeToken()
    {
    }

    public NdsNodeToken(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public NdsNodeToken(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public NdsNodeToken(
            nds.system.types.UUID nodeId_)
    {
        setNodeId(nodeId_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        nodeId_.initPackingContext(zserioContext.getNodeId());
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

        endBitPosition += nodeId_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += nodeId_.bitSizeOf(zserioContext.getNodeId(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.system.types.UUID getNodeId()
    {
        return nodeId_;
    }

    public void setNodeId(nds.system.types.UUID nodeId_)
    {
        this.nodeId_ = nodeId_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof NdsNodeToken)
        {
            final NdsNodeToken that = (NdsNodeToken)obj;

            return
                    ((nodeId_ == null) ? that.nodeId_ == null : nodeId_.equals(that.nodeId_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, nodeId_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        nodeId_ = new nds.system.types.UUID(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        nodeId_ = new nds.system.types.UUID(zserioContext.getNodeId(), in);
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

        endBitPosition = nodeId_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = nodeId_.initializeOffsets(zserioContext.getNodeId(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        nodeId_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        nodeId_.write(zserioContext.getNodeId(), out);
    }

    private nds.system.types.UUID nodeId_;
}
