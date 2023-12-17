/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.traffic.instantiations;

public class TrafficDisplayLineRangeAttributeMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
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

    public TrafficDisplayLineRangeAttributeMetadata()
    {
    }

    public TrafficDisplayLineRangeAttributeMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public TrafficDisplayLineRangeAttributeMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public TrafficDisplayLineRangeAttributeMetadata(
            nds.traffic.attributes.TrafficDisplayLineRangeAttributeType[] availableAttributes_,
            nds.traffic.properties.TrafficPropertyType[] availableProperties_,
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

    public nds.traffic.attributes.TrafficDisplayLineRangeAttributeType[] getAvailableAttributes()
    {
        return (availableAttributes_ == null) ? null : availableAttributes_.getRawArray();
    }

    public void setAvailableAttributes(nds.traffic.attributes.TrafficDisplayLineRangeAttributeType[] availableAttributes_)
    {
        this.availableAttributes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.traffic.attributes.TrafficDisplayLineRangeAttributeType.class, availableAttributes_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.traffic.attributes.TrafficDisplayLineRangeAttributeType>(new ZserioElementFactory_availableAttributes()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.traffic.properties.TrafficPropertyType[] getAvailableProperties()
    {
        return (availableProperties_ == null) ? null : availableProperties_.getRawArray();
    }

    public void setAvailableProperties(nds.traffic.properties.TrafficPropertyType[] availableProperties_)
    {
        this.availableProperties_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.traffic.properties.TrafficPropertyType.class, availableProperties_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.traffic.properties.TrafficPropertyType>(new ZserioElementFactory_availableProperties()),
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
        if (obj instanceof TrafficDisplayLineRangeAttributeMetadata)
        {
            final TrafficDisplayLineRangeAttributeMetadata that = (TrafficDisplayLineRangeAttributeMetadata)obj;

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
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.traffic.attributes.TrafficDisplayLineRangeAttributeType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.traffic.attributes.TrafficDisplayLineRangeAttributeType>(new ZserioElementFactory_availableAttributes()),
                zserio.runtime.array.ArrayType.AUTO);
        availableAttributes_.readPacked(in);

        availableProperties_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.traffic.properties.TrafficPropertyType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.traffic.properties.TrafficPropertyType>(new ZserioElementFactory_availableProperties()),
                zserio.runtime.array.ArrayType.AUTO);
        availableProperties_.readPacked(in);

        availableConditions_ = new nds.core.attributemap.ConditionTypeCodeCollection(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        availableAttributes_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.EnumRawArray<>(nds.traffic.attributes.TrafficDisplayLineRangeAttributeType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.traffic.attributes.TrafficDisplayLineRangeAttributeType>(new ZserioElementFactory_availableAttributes()),
                zserio.runtime.array.ArrayType.AUTO);
        availableAttributes_.readPacked(in);

        availableProperties_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.traffic.properties.TrafficPropertyType.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.traffic.properties.TrafficPropertyType>(new ZserioElementFactory_availableProperties()),
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

    private static final class ZserioElementFactory_availableAttributes implements zserio.runtime.array.PackableElementFactory<nds.traffic.attributes.TrafficDisplayLineRangeAttributeType>
    {
        @Override
        public nds.traffic.attributes.TrafficDisplayLineRangeAttributeType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return nds.traffic.attributes.TrafficDisplayLineRangeAttributeType.readEnum(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.traffic.attributes.TrafficDisplayLineRangeAttributeType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return nds.traffic.attributes.TrafficDisplayLineRangeAttributeType.readEnum(context, in);
        }
    }

    private static final class ZserioElementFactory_availableProperties implements zserio.runtime.array.PackableElementFactory<nds.traffic.properties.TrafficPropertyType>
    {
        @Override
        public nds.traffic.properties.TrafficPropertyType create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.traffic.properties.TrafficPropertyType(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.traffic.properties.TrafficPropertyType.ZserioPackingContext();
        }

        @Override
        public nds.traffic.properties.TrafficPropertyType create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.traffic.properties.TrafficPropertyType(context, in);
        }
    }

    private zserio.runtime.array.Array availableAttributes_;
    private zserio.runtime.array.Array availableProperties_;
    private nds.core.attributemap.ConditionTypeCodeCollection availableConditions_;
}