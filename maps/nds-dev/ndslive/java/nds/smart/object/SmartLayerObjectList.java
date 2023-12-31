/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.object;

public class SmartLayerObjectList implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
    };

    public SmartLayerObjectList()
    {
    }

    public SmartLayerObjectList(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public SmartLayerObjectList(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public SmartLayerObjectList(
            nds.smart.object.SmartLayerObject[] list_)
    {
        setList(list_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
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

        endBitPosition += list_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += list_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.smart.object.SmartLayerObject[] getList()
    {
        return (list_ == null) ? null : list_.getRawArray();
    }

    public void setList(nds.smart.object.SmartLayerObject[] list_)
    {
        this.list_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.object.SmartLayerObject.class, list_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.object.SmartLayerObject>(new ZserioElementFactory_list()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof SmartLayerObjectList)
        {
            final SmartLayerObjectList that = (SmartLayerObjectList)obj;

            return
                    ((list_ == null) ? that.list_ == null : list_.equals(that.list_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, list_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        list_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.object.SmartLayerObject.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.object.SmartLayerObject>(new ZserioElementFactory_list()),
                zserio.runtime.array.ArrayType.AUTO);
        list_.read(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        list_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.object.SmartLayerObject.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.object.SmartLayerObject>(new ZserioElementFactory_list()),
                zserio.runtime.array.ArrayType.AUTO);
        list_.readPacked(in);
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

        endBitPosition = list_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition = list_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        list_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        list_.writePacked(out);
    }

    private static final class ZserioElementFactory_list implements zserio.runtime.array.PackableElementFactory<nds.smart.object.SmartLayerObject>
    {
        @Override
        public nds.smart.object.SmartLayerObject create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.smart.object.SmartLayerObject(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.smart.object.SmartLayerObject.ZserioPackingContext();
        }

        @Override
        public nds.smart.object.SmartLayerObject create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.smart.object.SmartLayerObject(context, in);
        }
    }

    private zserio.runtime.array.Array list_;
}
