/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.metadata;

public class PathServiceCapabilitiesResponse implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            capabilities_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getCapabilities()
        {
            return capabilities_;
        }

        private zserio.runtime.array.DeltaContext capabilities_;
    };

    public PathServiceCapabilitiesResponse()
    {
    }

    public PathServiceCapabilitiesResponse(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public PathServiceCapabilitiesResponse(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public PathServiceCapabilitiesResponse(
            nds.smart.metadata.PathServiceCapabilities capabilities_)
    {
        setCapabilities(capabilities_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        capabilities_.initPackingContext(zserioContext.getCapabilities());
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

        endBitPosition += capabilities_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += capabilities_.bitSizeOf(zserioContext.getCapabilities(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.smart.metadata.PathServiceCapabilities getCapabilities()
    {
        return capabilities_;
    }

    public void setCapabilities(nds.smart.metadata.PathServiceCapabilities capabilities_)
    {
        this.capabilities_ = capabilities_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof PathServiceCapabilitiesResponse)
        {
            final PathServiceCapabilitiesResponse that = (PathServiceCapabilitiesResponse)obj;

            return
                    ((capabilities_ == null) ? that.capabilities_ == null : capabilities_.equals(that.capabilities_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, capabilities_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        capabilities_ = new nds.smart.metadata.PathServiceCapabilities(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        capabilities_ = new nds.smart.metadata.PathServiceCapabilities(zserioContext.getCapabilities(), in);
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

        endBitPosition += capabilities_.bitSizeOf(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = capabilities_.initializeOffsets(zserioContext.getCapabilities(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        capabilities_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        capabilities_.write(zserioContext.getCapabilities(), out);
    }

    private nds.smart.metadata.PathServiceCapabilities capabilities_;
}
