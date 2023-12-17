/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.object;

public class DataLayerObjectVersionRequest implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            objectReference_ = new nds.smart.object.SmartLayerObjectReference.ZserioPackingContext();
            layerId_ = new zserio.runtime.array.DeltaContext();
            lifetimeInfo_ = new nds.smart.types.DataLayerLifetime.ZserioPackingContext();
        }

        public nds.smart.object.SmartLayerObjectReference.ZserioPackingContext getObjectReference()
        {
            return objectReference_;
        }

        public zserio.runtime.array.DeltaContext getLayerId()
        {
            return layerId_;
        }

        public nds.smart.types.DataLayerLifetime.ZserioPackingContext getLifetimeInfo()
        {
            return lifetimeInfo_;
        }

        private nds.smart.object.SmartLayerObjectReference.ZserioPackingContext objectReference_;
        private zserio.runtime.array.DeltaContext layerId_;
        private nds.smart.types.DataLayerLifetime.ZserioPackingContext lifetimeInfo_;
    };

    public DataLayerObjectVersionRequest()
    {
    }

    public DataLayerObjectVersionRequest(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public DataLayerObjectVersionRequest(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public DataLayerObjectVersionRequest(
            nds.smart.object.SmartLayerObjectReference objectReference_,
            short layerId_,
            nds.smart.types.DataLayerLifetime lifetimeInfo_)
    {
        setObjectReference(objectReference_);
        setLayerId(layerId_);
        setLifetimeInfo(lifetimeInfo_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        objectReference_.initPackingContext(zserioContext.getObjectReference());
        zserioContext.getLayerId().init(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(layerId_));
        lifetimeInfo_.initPackingContext(zserioContext.getLifetimeInfo());
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

        endBitPosition += objectReference_.bitSizeOf(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(layerId_);
        endBitPosition += lifetimeInfo_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += objectReference_.bitSizeOf(zserioContext.getObjectReference(), endBitPosition);
        endBitPosition += zserioContext.getLayerId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(layerId_));
        endBitPosition += lifetimeInfo_.bitSizeOf(zserioContext.getLifetimeInfo(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.smart.object.SmartLayerObjectReference getObjectReference()
    {
        return objectReference_;
    }

    public void setObjectReference(nds.smart.object.SmartLayerObjectReference objectReference_)
    {
        this.objectReference_ = objectReference_;
    }

    public short getLayerId()
    {
        return layerId_;
    }

    public void setLayerId(short layerId_)
    {
        this.layerId_ = layerId_;
    }

    public nds.smart.types.DataLayerLifetime getLifetimeInfo()
    {
        return lifetimeInfo_;
    }

    public void setLifetimeInfo(nds.smart.types.DataLayerLifetime lifetimeInfo_)
    {
        this.lifetimeInfo_ = lifetimeInfo_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof DataLayerObjectVersionRequest)
        {
            final DataLayerObjectVersionRequest that = (DataLayerObjectVersionRequest)obj;

            return
                    ((objectReference_ == null) ? that.objectReference_ == null : objectReference_.equals(that.objectReference_)) &&
                    layerId_ == that.layerId_ &&
                    ((lifetimeInfo_ == null) ? that.lifetimeInfo_ == null : lifetimeInfo_.equals(that.lifetimeInfo_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, objectReference_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, layerId_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, lifetimeInfo_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        objectReference_ = new nds.smart.object.SmartLayerObjectReference(in);

        layerId_ = in.readVarUInt16();

        lifetimeInfo_ = new nds.smart.types.DataLayerLifetime(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        objectReference_ = new nds.smart.object.SmartLayerObjectReference(zserioContext.getObjectReference(), in);

        layerId_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getLayerId().read(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();

        lifetimeInfo_ = new nds.smart.types.DataLayerLifetime(zserioContext.getLifetimeInfo(), in);
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

        endBitPosition = objectReference_.initializeOffsets(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(layerId_);
        endBitPosition = lifetimeInfo_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = objectReference_.initializeOffsets(zserioContext.getObjectReference(), endBitPosition);
        endBitPosition += zserioContext.getLayerId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(layerId_));
        endBitPosition = lifetimeInfo_.initializeOffsets(zserioContext.getLifetimeInfo(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        objectReference_.write(out);

        out.writeVarUInt16(layerId_);

        lifetimeInfo_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        objectReference_.write(zserioContext.getObjectReference(), out);

        zserioContext.getLayerId().write(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(layerId_));

        lifetimeInfo_.write(zserioContext.getLifetimeInfo(), out);
    }

    private nds.smart.object.SmartLayerObjectReference objectReference_;
    private short layerId_;
    private nds.smart.types.DataLayerLifetime lifetimeInfo_;
}