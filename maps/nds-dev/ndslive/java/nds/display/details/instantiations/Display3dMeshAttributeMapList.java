/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.details.instantiations;

public class Display3dMeshAttributeMapList implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            numMaps_ = new zserio.runtime.array.DeltaContext();
            header_ = new nds.display.details.instantiations.Display3dMeshAttributeMapListHeader.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getNumMaps()
        {
            return numMaps_;
        }

        public nds.display.details.instantiations.Display3dMeshAttributeMapListHeader.ZserioPackingContext getHeader()
        {
            return header_;
        }

        private zserio.runtime.array.DeltaContext numMaps_;
        private nds.display.details.instantiations.Display3dMeshAttributeMapListHeader.ZserioPackingContext header_;
    };

    public Display3dMeshAttributeMapList(
            byte coordShift_)
    {
        this.coordShift_ = coordShift_;
    }

    public Display3dMeshAttributeMapList(zserio.runtime.io.BitStreamReader in,
            byte coordShift_)
            throws java.io.IOException
    {
        this.coordShift_ = coordShift_;

        read(in);
    }

    public Display3dMeshAttributeMapList(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            byte coordShift_)
            throws java.io.IOException
    {
        this.coordShift_ = coordShift_;

        read(context, in);
    }

    public Display3dMeshAttributeMapList(
            byte coordShift_,
            int numMaps_,
            nds.display.details.instantiations.Display3dMeshAttributeMapListHeader header_,
            nds.display.details.instantiations.Display3dMeshAttributeMap[] maps_)
    {
        this(coordShift_);

        setNumMaps(numMaps_);
        setHeader(header_);
        setMaps(maps_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumMaps().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numMaps_));
        header_.initPackingContext(zserioContext.getHeader());
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numMaps_);
        endBitPosition += header_.bitSizeOf(endBitPosition);
        endBitPosition += maps_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumMaps().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numMaps_));
        endBitPosition += header_.bitSizeOf(zserioContext.getHeader(), endBitPosition);
        endBitPosition += maps_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public byte getCoordShift()
    {
        return this.coordShift_;
    }

    public int getNumMaps()
    {
        return numMaps_;
    }

    public void setNumMaps(int numMaps_)
    {
        this.numMaps_ = numMaps_;
    }

    public nds.display.details.instantiations.Display3dMeshAttributeMapListHeader getHeader()
    {
        return header_;
    }

    public void setHeader(nds.display.details.instantiations.Display3dMeshAttributeMapListHeader header_)
    {
        this.header_ = header_;
    }

    public nds.display.details.instantiations.Display3dMeshAttributeMap[] getMaps()
    {
        return (maps_ == null) ? null : maps_.getRawArray();
    }

    public void setMaps(nds.display.details.instantiations.Display3dMeshAttributeMap[] maps_)
    {
        this.maps_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.details.instantiations.Display3dMeshAttributeMap.class, maps_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.details.instantiations.Display3dMeshAttributeMap>(new ZserioElementFactory_maps()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof Display3dMeshAttributeMapList)
        {
            final Display3dMeshAttributeMapList that = (Display3dMeshAttributeMapList)obj;

            return
                    this.coordShift_ == that.coordShift_ &&
                    numMaps_ == that.numMaps_ &&
                    ((header_ == null) ? that.header_ == null : header_.equals(that.header_)) &&
                    ((maps_ == null) ? that.maps_ == null : maps_.equals(that.maps_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getCoordShift());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numMaps_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, header_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, maps_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        numMaps_ = in.readVarSize();

        header_ = new nds.display.details.instantiations.Display3dMeshAttributeMapListHeader(in, (short)(getNumMaps()));

        maps_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.details.instantiations.Display3dMeshAttributeMap.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.details.instantiations.Display3dMeshAttributeMap>(new ZserioElementFactory_maps()),
                zserio.runtime.array.ArrayType.NORMAL);
        maps_.readPacked(in, (int)(getNumMaps()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        numMaps_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getNumMaps().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        header_ = new nds.display.details.instantiations.Display3dMeshAttributeMapListHeader(zserioContext.getHeader(), in, (short)(getNumMaps()));

        maps_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.details.instantiations.Display3dMeshAttributeMap.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.details.instantiations.Display3dMeshAttributeMap>(new ZserioElementFactory_maps()),
                zserio.runtime.array.ArrayType.NORMAL);
        maps_.readPacked(in, (int)(getNumMaps()));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numMaps_);
        endBitPosition = header_.initializeOffsets(endBitPosition);
        endBitPosition = maps_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumMaps().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numMaps_));
        endBitPosition = header_.initializeOffsets(zserioContext.getHeader(), endBitPosition);
        endBitPosition = maps_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarSize(numMaps_);

        // check parameters
        if (header_.getNumMaps() != (short)(getNumMaps()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter numMaps for field Display3dMeshAttributeMapList.header: " +
                    header_.getNumMaps() + " != " + (short)(getNumMaps()) + "!");
        }
        header_.write(out);

        if (maps_.size() != (int)(getNumMaps()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field Display3dMeshAttributeMapList.maps: " +
                    maps_.size() + " != " + (int)(getNumMaps()) + "!");
        }
        maps_.writePacked(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumMaps().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(numMaps_));

        header_.write(zserioContext.getHeader(), out);

        if (maps_.size() != (int)(getNumMaps()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field Display3dMeshAttributeMapList.maps: " +
                    maps_.size() + " != " + (int)(getNumMaps()) + "!");
        }
        maps_.writePacked(out);
    }

    private final class ZserioElementFactory_maps implements zserio.runtime.array.PackableElementFactory<nds.display.details.instantiations.Display3dMeshAttributeMap>
    {
        @Override
        public nds.display.details.instantiations.Display3dMeshAttributeMap create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.display.details.instantiations.Display3dMeshAttributeMap(in, (byte)(getCoordShift()));
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.display.details.instantiations.Display3dMeshAttributeMap.ZserioPackingContext();
        }

        @Override
        public nds.display.details.instantiations.Display3dMeshAttributeMap create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.display.details.instantiations.Display3dMeshAttributeMap(context, in, (byte)(getCoordShift()));
        }
    }

    private final byte coordShift_;
    private int numMaps_;
    private nds.display.details.instantiations.Display3dMeshAttributeMapListHeader header_;
    private zserio.runtime.array.Array maps_;
}
