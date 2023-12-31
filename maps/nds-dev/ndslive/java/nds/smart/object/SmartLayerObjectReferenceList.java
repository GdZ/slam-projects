/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.object;

public class SmartLayerObjectReferenceList implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            numObjects_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getNumObjects()
        {
            return numObjects_;
        }

        private zserio.runtime.array.DeltaContext numObjects_;
    };

    public SmartLayerObjectReferenceList()
    {
    }

    public SmartLayerObjectReferenceList(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public SmartLayerObjectReferenceList(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public SmartLayerObjectReferenceList(
            int numObjects_,
            nds.smart.object.SmartLayerObjectReference[] list_,
            nds.core.geometry.SpatialExtent[] extent_)
    {
        setNumObjects(numObjects_);
        setList(list_);
        setExtent(extent_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumObjects().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numObjects_));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numObjects_);
        endBitPosition += list_.bitSizeOf(endBitPosition);
        endBitPosition += 1;
        if (isExtentUsed())
        {
            endBitPosition += extent_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumObjects().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numObjects_));
        endBitPosition += list_.bitSizeOfPacked(endBitPosition);
        endBitPosition += 1;
        if (isExtentUsed())
        {
            endBitPosition += extent_.bitSizeOfPacked(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public int getNumObjects()
    {
        return numObjects_;
    }

    public void setNumObjects(int numObjects_)
    {
        this.numObjects_ = numObjects_;
    }

    public nds.smart.object.SmartLayerObjectReference[] getList()
    {
        return (list_ == null) ? null : list_.getRawArray();
    }

    public void setList(nds.smart.object.SmartLayerObjectReference[] list_)
    {
        this.list_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.object.SmartLayerObjectReference.class, list_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.object.SmartLayerObjectReference>(new ZserioElementFactory_list()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public nds.core.geometry.SpatialExtent[] getExtent()
    {
        return (extent_ == null) ? null : extent_.getRawArray();
    }

    public void setExtent(nds.core.geometry.SpatialExtent[] extent_)
    {
        if (extent_ == null)
        {
            this.extent_ = null;
        }
        else
        {
            this.extent_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.geometry.SpatialExtent.class, extent_),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.geometry.SpatialExtent>(new ZserioElementFactory_extent()),
                    zserio.runtime.array.ArrayType.NORMAL);
        }
    }

    public boolean isExtentUsed()
    {
        return isExtentSet();
    }

    public boolean isExtentSet()
    {
        return (extent_ != null);
    }

    public void resetExtent()
    {
        this.extent_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof SmartLayerObjectReferenceList)
        {
            final SmartLayerObjectReferenceList that = (SmartLayerObjectReferenceList)obj;

            return
                    numObjects_ == that.numObjects_ &&
                    ((list_ == null) ? that.list_ == null : list_.equals(that.list_)) &&
                    ((!isExtentUsed()) ? !that.isExtentUsed() :
                        ((extent_ == null) ? that.extent_ == null : extent_.equals(that.extent_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numObjects_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, list_);
        if (isExtentUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, extent_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        numObjects_ = in.readVarSize();

        list_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.object.SmartLayerObjectReference.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.object.SmartLayerObjectReference>(new ZserioElementFactory_list()),
                zserio.runtime.array.ArrayType.NORMAL);
        list_.read(in, (int)(getNumObjects()));

        if (in.readBool())
        {
            extent_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.geometry.SpatialExtent.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.geometry.SpatialExtent>(new ZserioElementFactory_extent()),
                    zserio.runtime.array.ArrayType.NORMAL);
            extent_.read(in, (int)(getNumObjects()));
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        numObjects_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getNumObjects().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        list_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.object.SmartLayerObjectReference.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.object.SmartLayerObjectReference>(new ZserioElementFactory_list()),
                zserio.runtime.array.ArrayType.NORMAL);
        list_.readPacked(in, (int)(getNumObjects()));

        if (in.readBool())
        {
            extent_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.geometry.SpatialExtent.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.geometry.SpatialExtent>(new ZserioElementFactory_extent()),
                    zserio.runtime.array.ArrayType.NORMAL);
            extent_.readPacked(in, (int)(getNumObjects()));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numObjects_);
        endBitPosition = list_.initializeOffsets(endBitPosition);
        endBitPosition += 1;
        if (isExtentUsed())
        {
            endBitPosition = extent_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumObjects().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numObjects_));
        endBitPosition = list_.initializeOffsetsPacked(endBitPosition);
        endBitPosition += 1;
        if (isExtentUsed())
        {
            endBitPosition = extent_.initializeOffsetsPacked(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarSize(numObjects_);

        if (list_.size() != (int)(getNumObjects()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field SmartLayerObjectReferenceList.list: " +
                    list_.size() + " != " + (int)(getNumObjects()) + "!");
        }
        list_.write(out);

        if (isExtentUsed())
        {
            out.writeBool(true);
            if (extent_.size() != (int)(getNumObjects()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong array length for field SmartLayerObjectReferenceList.extent: " +
                        extent_.size() + " != " + (int)(getNumObjects()) + "!");
            }
            extent_.write(out);
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
        zserioContext.getNumObjects().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(numObjects_));

        if (list_.size() != (int)(getNumObjects()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field SmartLayerObjectReferenceList.list: " +
                    list_.size() + " != " + (int)(getNumObjects()) + "!");
        }
        list_.writePacked(out);

        if (isExtentUsed())
        {
            out.writeBool(true);
            if (extent_.size() != (int)(getNumObjects()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong array length for field SmartLayerObjectReferenceList.extent: " +
                        extent_.size() + " != " + (int)(getNumObjects()) + "!");
            }
            extent_.writePacked(out);
        }
        else
        {
            out.writeBool(false);
        }
    }

    private static final class ZserioElementFactory_list implements zserio.runtime.array.PackableElementFactory<nds.smart.object.SmartLayerObjectReference>
    {
        @Override
        public nds.smart.object.SmartLayerObjectReference create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.smart.object.SmartLayerObjectReference(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.smart.object.SmartLayerObjectReference.ZserioPackingContext();
        }

        @Override
        public nds.smart.object.SmartLayerObjectReference create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.smart.object.SmartLayerObjectReference(context, in);
        }
    }

    private static final class ZserioElementFactory_extent implements zserio.runtime.array.PackableElementFactory<nds.core.geometry.SpatialExtent>
    {
        @Override
        public nds.core.geometry.SpatialExtent create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.geometry.SpatialExtent(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.geometry.SpatialExtent.ZserioPackingContext();
        }

        @Override
        public nds.core.geometry.SpatialExtent create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.geometry.SpatialExtent(context, in);
        }
    }

    private int numObjects_;
    private zserio.runtime.array.Array list_;
    private zserio.runtime.array.Array extent_;
}
