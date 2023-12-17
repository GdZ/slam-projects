/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.path;

public class SmartLayerPathList implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            numPaths_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getNumPaths()
        {
            return numPaths_;
        }

        private zserio.runtime.array.DeltaContext numPaths_;
    };

    public SmartLayerPathList()
    {
    }

    public SmartLayerPathList(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public SmartLayerPathList(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public SmartLayerPathList(
            int numPaths_,
            nds.smart.path.SmartLayerPath[] pathList_)
    {
        setNumPaths(numPaths_);
        setPathList(pathList_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumPaths().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numPaths_));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numPaths_);
        endBitPosition += pathList_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumPaths().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numPaths_));
        endBitPosition += pathList_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public int getNumPaths()
    {
        return numPaths_;
    }

    public void setNumPaths(int numPaths_)
    {
        this.numPaths_ = numPaths_;
    }

    public nds.smart.path.SmartLayerPath[] getPathList()
    {
        return (pathList_ == null) ? null : pathList_.getRawArray();
    }

    public void setPathList(nds.smart.path.SmartLayerPath[] pathList_)
    {
        this.pathList_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.path.SmartLayerPath.class, pathList_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.path.SmartLayerPath>(new ZserioElementFactory_pathList()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof SmartLayerPathList)
        {
            final SmartLayerPathList that = (SmartLayerPathList)obj;

            return
                    numPaths_ == that.numPaths_ &&
                    ((pathList_ == null) ? that.pathList_ == null : pathList_.equals(that.pathList_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numPaths_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, pathList_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        numPaths_ = in.readVarSize();

        pathList_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.path.SmartLayerPath.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.path.SmartLayerPath>(new ZserioElementFactory_pathList()),
                zserio.runtime.array.ArrayType.NORMAL);
        pathList_.read(in, (int)(getNumPaths()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        numPaths_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getNumPaths().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        pathList_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.smart.path.SmartLayerPath.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.smart.path.SmartLayerPath>(new ZserioElementFactory_pathList()),
                zserio.runtime.array.ArrayType.NORMAL);
        pathList_.readPacked(in, (int)(getNumPaths()));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numPaths_);
        endBitPosition = pathList_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumPaths().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numPaths_));
        endBitPosition = pathList_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarSize(numPaths_);

        if (pathList_.size() != (int)(getNumPaths()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field SmartLayerPathList.pathList: " +
                    pathList_.size() + " != " + (int)(getNumPaths()) + "!");
        }
        pathList_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumPaths().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(numPaths_));

        if (pathList_.size() != (int)(getNumPaths()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field SmartLayerPathList.pathList: " +
                    pathList_.size() + " != " + (int)(getNumPaths()) + "!");
        }
        pathList_.writePacked(out);
    }

    private static final class ZserioElementFactory_pathList implements zserio.runtime.array.PackableElementFactory<nds.smart.path.SmartLayerPath>
    {
        @Override
        public nds.smart.path.SmartLayerPath create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.smart.path.SmartLayerPath(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.smart.path.SmartLayerPath.ZserioPackingContext();
        }

        @Override
        public nds.smart.path.SmartLayerPath create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.smart.path.SmartLayerPath(context, in);
        }
    }

    private int numPaths_;
    private zserio.runtime.array.Array pathList_;
}
