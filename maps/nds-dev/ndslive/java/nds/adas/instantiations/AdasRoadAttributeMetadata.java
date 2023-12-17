/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.adas.instantiations;

public class AdasRoadAttributeMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            availableConditions_ = new nds.core.attributemap.ConditionTypeCodeCollection.ZserioPackingContext();
        }

        public nds.core.attributemap.ConditionTypeCodeCollection.ZserioPackingContext getAvailableConditions()
        {
            return availableConditions_;
        }

        private nds.core.attributemap.ConditionTypeCodeCollection.ZserioPackingContext availableConditions_;
    };

    public AdasRoadAttributeMetadata()
    {
    }

    public AdasRoadAttributeMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public AdasRoadAttributeMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public AdasRoadAttributeMetadata(
            nds.adas.attributes.AdasRoadAttributeType[] availableAttributes_,
            nds.adas.properties.AdasPropertyType[] availableProperties_,
            nds.core.attributemap.ConditionTypeCodeCollection availableConditions_)
    {
        setAvailableAttributes(availableAttributes_);
        setAvailableProperties(availableProperties_);
        setAvailableConditions(availableConditions_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        availableConditions_.initPackingContext(zserioContext.getAvailableConditions());
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

        endBitPosition += availableAttributes_.bitSizeOfPacked(endBitPosition);
        endBitPosition += availableProperties_.bitSizeOfPacked(endBitPosition);
        endBitPosition += availableConditions_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += availableAttributes_.bitSizeOfPacked(endBitPosition);
        endBitPosition += availableProperties_.bitSizeOfPacked(endBitPosition);
        endBitPosition += availableConditions_.bitSizeOf(zserioContext.getAvailableConditions(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.adas.attributes.AdasRoadAttributeType[] getAvailableAttributes()
    {
        return (availableAttributes_ == null) ? null : availableAttributes_.getRawArray();
    }

    public void setAvailableAttributes(nds.adas.attributes.AdasRoadAttributeType[] availableAttributes_)
    {
        this.availableAttributes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.adas.attributes.AdasRoadAttributeType.class, availableAttributes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.adas.attributes.AdasRoadAttributeType>(new ZserioElementFactory_availableAttributes()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.adas.properties.AdasPropertyType[] getAvailableProperties()
    {
        return (availableProperties_ == null) ? null : availableProperties_.getRawArray();
    }

    public void setAvailableProperties(nds.adas.properties.AdasPropertyType[] availableProperties_)
    {
        this.availableProperties_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.adas.properties.AdasPropertyType.class, availableProperties_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.adas.properties.AdasPropertyType>(new ZserioElementFactory_availableProperties()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.core.attributemap.ConditionTypeCodeCollection getAvailableConditions()
    {
        return availableConditions_;
    }

    public void setAvailableConditions(nds.core.attributemap.ConditionTypeCodeCollection availableConditions_)
    {
        this.availableConditions_ = availableConditions_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof AdasRoadAttributeMetadata)
        {
            final AdasRoadAttributeMetadata that = (AdasRoadAttributeMetadata)obj;

            return
                    ((availableAttributes_ == null) ? that.availableAttributes_ == null : availableAttributes_.equals(that.availableAttributes_)) &&
                    ((availableProperties_ == null) ? that.availableProperties_ == null : availableProperties_.equals(that.availableProperties_)) &&
                    ((availableConditions_ == null) ? that.availableConditions_ == null : availableConditions_.equals(that.availableConditions_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, availableAttributes_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, availableProperties_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, availableConditions_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        availableAttributes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.adas.attributes.AdasRoadAttributeType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.adas.attributes.AdasRoadAttributeType>(new ZserioElementFactory_availableAttributes()),
                zserio.runtime.array.ArrayType.AUTO);
        availableAttributes_.readPacked(in);

        availableProperties_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.adas.properties.AdasPropertyType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.adas.properties.AdasPropertyType>(new ZserioElementFactory_availableProperties()),
                zserio.runtime.array.ArrayType.AUTO);
        availableProperties_.readPacked(in);

        availableConditions_ = new nds.core.attributemap.ConditionTypeCodeCollection(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        availableAttributes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.adas.attributes.AdasRoadAttributeType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.adas.attributes.AdasRoadAttributeType>(new ZserioElementFactory_availableAttributes()),
                zserio.runtime.array.ArrayType.AUTO);
        availableAttributes_.readPacked(in);

        availableProperties_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.adas.properties.AdasPropertyType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.adas.properties.AdasPropertyType>(new ZserioElementFactory_availableProperties()),
                zserio.runtime.array.ArrayType.AUTO);
        availableProperties_.readPacked(in);

        availableConditions_ = new nds.core.attributemap.ConditionTypeCodeCollection(zserioContext.getAvailableConditions(), in);
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

        endBitPosition = availableAttributes_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = availableProperties_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = availableConditions_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = availableAttributes_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = availableProperties_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = availableConditions_.initializeOffsets(zserioContext.getAvailableConditions(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        availableAttributes_.writePacked(out);

        availableProperties_.writePacked(out);

        availableConditions_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        availableAttributes_.writePacked(out);

        availableProperties_.writePacked(out);

        availableConditions_.write(zserioContext.getAvailableConditions(), out);
    }

    private static final class ZserioElementFactory_availableAttributes implements zserio.runtime.array.PackableElementFactory<nds.adas.attributes.AdasRoadAttributeType>
    {
        @Override
        public nds.adas.attributes.AdasRoadAttributeType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return nds.adas.attributes.AdasRoadAttributeType.readEnum(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.adas.attributes.AdasRoadAttributeType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return nds.adas.attributes.AdasRoadAttributeType.readEnum(context, in);
        }
    }

    private static final class ZserioElementFactory_availableProperties implements zserio.runtime.array.PackableElementFactory<nds.adas.properties.AdasPropertyType>
    {
        @Override
        public nds.adas.properties.AdasPropertyType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.adas.properties.AdasPropertyType(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.adas.properties.AdasPropertyType.ZserioPackingContext();
        }

        @Override
        public nds.adas.properties.AdasPropertyType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.adas.properties.AdasPropertyType(context, in);
        }
    }

    private zserio.runtime.array.Array availableAttributes_;
    private zserio.runtime.array.Array availableProperties_;
    private nds.core.attributemap.ConditionTypeCodeCollection availableConditions_;
}
