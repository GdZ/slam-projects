/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.name.metadata;

public class AddressSearchMetadata implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            supportedFilter_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getSupportedFilter()
        {
            return supportedFilter_;
        }

        private zserio.runtime.array.DeltaContext supportedFilter_;
    };

    public AddressSearchMetadata()
    {
    }

    public AddressSearchMetadata(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public AddressSearchMetadata(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public AddressSearchMetadata(
            nds.name.metadata.AddressSearchFilterOptions supportedFilter_,
            nds.name.types.AddressFormat[] addressFormats_)
    {
        setSupportedFilter(supportedFilter_);
        setAddressFormats(addressFormats_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        supportedFilter_.initPackingContext(zserioContext.getSupportedFilter());
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

        endBitPosition += supportedFilter_.bitSizeOf(endBitPosition);
        endBitPosition += addressFormats_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += supportedFilter_.bitSizeOf(zserioContext.getSupportedFilter(), endBitPosition);
        endBitPosition += addressFormats_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.name.metadata.AddressSearchFilterOptions getSupportedFilter()
    {
        return supportedFilter_;
    }

    public void setSupportedFilter(nds.name.metadata.AddressSearchFilterOptions supportedFilter_)
    {
        this.supportedFilter_ = supportedFilter_;
    }

    public nds.name.types.AddressFormat[] getAddressFormats()
    {
        return (addressFormats_ == null) ? null : addressFormats_.getRawArray();
    }

    public void setAddressFormats(nds.name.types.AddressFormat[] addressFormats_)
    {
        this.addressFormats_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.name.types.AddressFormat.class, addressFormats_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.name.types.AddressFormat>(new ZserioElementFactory_addressFormats()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof AddressSearchMetadata)
        {
            final AddressSearchMetadata that = (AddressSearchMetadata)obj;

            return
                    ((supportedFilter_ == null) ? that.supportedFilter_ == null : supportedFilter_.equals(that.supportedFilter_)) &&
                    ((addressFormats_ == null) ? that.addressFormats_ == null : addressFormats_.equals(that.addressFormats_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, supportedFilter_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, addressFormats_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        supportedFilter_ = new nds.name.metadata.AddressSearchFilterOptions(in);

        addressFormats_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.name.types.AddressFormat.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.name.types.AddressFormat>(new ZserioElementFactory_addressFormats()),
                zserio.runtime.array.ArrayType.AUTO);
        addressFormats_.read(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        supportedFilter_ = new nds.name.metadata.AddressSearchFilterOptions(zserioContext.getSupportedFilter(), in);

        addressFormats_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.name.types.AddressFormat.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.name.types.AddressFormat>(new ZserioElementFactory_addressFormats()),
                zserio.runtime.array.ArrayType.AUTO);
        addressFormats_.readPacked(in);
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

        endBitPosition += supportedFilter_.bitSizeOf(endBitPosition);
        endBitPosition = addressFormats_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = supportedFilter_.initializeOffsets(zserioContext.getSupportedFilter(), endBitPosition);
        endBitPosition = addressFormats_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        supportedFilter_.write(out);

        addressFormats_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        supportedFilter_.write(zserioContext.getSupportedFilter(), out);

        addressFormats_.writePacked(out);
    }

    private static final class ZserioElementFactory_addressFormats implements zserio.runtime.array.PackableElementFactory<nds.name.types.AddressFormat>
    {
        @Override
        public nds.name.types.AddressFormat create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.name.types.AddressFormat(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.name.types.AddressFormat.ZserioPackingContext();
        }

        @Override
        public nds.name.types.AddressFormat create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.name.types.AddressFormat(context, in);
        }
    }

    private nds.name.metadata.AddressSearchFilterOptions supportedFilter_;
    private zserio.runtime.array.Array addressFormats_;
}