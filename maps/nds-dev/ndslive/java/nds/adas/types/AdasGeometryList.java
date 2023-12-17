/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.adas.types;

public class AdasGeometryList implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            numRoadReferences_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getNumRoadReferences()
        {
            return numRoadReferences_;
        }

        private zserio.runtime.array.DeltaContext numRoadReferences_;
    };

    public AdasGeometryList(
            byte shift_)
    {
        this.shift_ = shift_;
    }

    public AdasGeometryList(zserio.runtime.io.BitStreamReader in,
            byte shift_)
            throws java.io.IOException
    {
        this.shift_ = shift_;

        read(in);
    }

    public AdasGeometryList(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            byte shift_)
            throws java.io.IOException
    {
        this.shift_ = shift_;

        read(context, in);
    }

    public AdasGeometryList(
            byte shift_,
            int numRoadReferences_,
            nds.core.types.Var4ByteId[] road_,
            nds.core.geometry.Line2D[] adasGeometry_)
    {
        this(shift_);

        setNumRoadReferences(numRoadReferences_);
        setRoad(road_);
        setAdasGeometry(adasGeometry_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumRoadReferences().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numRoadReferences_));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numRoadReferences_);
        endBitPosition += road_.bitSizeOf(endBitPosition);
        endBitPosition += adasGeometry_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumRoadReferences().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numRoadReferences_));
        endBitPosition += road_.bitSizeOfPacked(endBitPosition);
        endBitPosition += adasGeometry_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public byte getShift()
    {
        return this.shift_;
    }

    public int getNumRoadReferences()
    {
        return numRoadReferences_;
    }

    public void setNumRoadReferences(int numRoadReferences_)
    {
        this.numRoadReferences_ = numRoadReferences_;
    }

    public nds.core.types.Var4ByteId[] getRoad()
    {
        return (road_ == null) ? null : road_.getRawArray();
    }

    public void setRoad(nds.core.types.Var4ByteId[] road_)
    {
        this.road_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class, road_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_road()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public nds.core.geometry.Line2D[] getAdasGeometry()
    {
        return (adasGeometry_ == null) ? null : adasGeometry_.getRawArray();
    }

    public void setAdasGeometry(nds.core.geometry.Line2D[] adasGeometry_)
    {
        this.adasGeometry_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.geometry.Line2D.class, adasGeometry_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.geometry.Line2D>(new ZserioElementFactory_adasGeometry()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof AdasGeometryList)
        {
            final AdasGeometryList that = (AdasGeometryList)obj;

            return
                    this.shift_ == that.shift_ &&
                    numRoadReferences_ == that.numRoadReferences_ &&
                    ((road_ == null) ? that.road_ == null : road_.equals(that.road_)) &&
                    ((adasGeometry_ == null) ? that.adasGeometry_ == null : adasGeometry_.equals(that.adasGeometry_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getShift());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numRoadReferences_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, road_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, adasGeometry_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        numRoadReferences_ = in.readVarSize();

        road_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_road()),
                zserio.runtime.array.ArrayType.NORMAL);
        road_.read(in, (int)(getNumRoadReferences()));

        adasGeometry_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.geometry.Line2D.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.geometry.Line2D>(new ZserioElementFactory_adasGeometry()),
                zserio.runtime.array.ArrayType.NORMAL);
        adasGeometry_.read(in, (int)(getNumRoadReferences()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        numRoadReferences_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getNumRoadReferences().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        road_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_road()),
                zserio.runtime.array.ArrayType.NORMAL);
        road_.readPacked(in, (int)(getNumRoadReferences()));

        adasGeometry_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.geometry.Line2D.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.geometry.Line2D>(new ZserioElementFactory_adasGeometry()),
                zserio.runtime.array.ArrayType.NORMAL);
        adasGeometry_.readPacked(in, (int)(getNumRoadReferences()));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numRoadReferences_);
        endBitPosition = road_.initializeOffsets(endBitPosition);
        endBitPosition = adasGeometry_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumRoadReferences().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numRoadReferences_));
        endBitPosition = road_.initializeOffsetsPacked(endBitPosition);
        endBitPosition = adasGeometry_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarSize(numRoadReferences_);

        if (road_.size() != (int)(getNumRoadReferences()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field AdasGeometryList.road: " +
                    road_.size() + " != " + (int)(getNumRoadReferences()) + "!");
        }
        road_.write(out);

        if (adasGeometry_.size() != (int)(getNumRoadReferences()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field AdasGeometryList.adasGeometry: " +
                    adasGeometry_.size() + " != " + (int)(getNumRoadReferences()) + "!");
        }
        adasGeometry_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumRoadReferences().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(numRoadReferences_));

        if (road_.size() != (int)(getNumRoadReferences()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field AdasGeometryList.road: " +
                    road_.size() + " != " + (int)(getNumRoadReferences()) + "!");
        }
        road_.writePacked(out);

        if (adasGeometry_.size() != (int)(getNumRoadReferences()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field AdasGeometryList.adasGeometry: " +
                    adasGeometry_.size() + " != " + (int)(getNumRoadReferences()) + "!");
        }
        adasGeometry_.writePacked(out);
    }

    private static final class ZserioElementFactory_road implements zserio.runtime.array.PackableElementFactory<nds.core.types.Var4ByteId>
    {
        @Override
        public nds.core.types.Var4ByteId create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.types.Var4ByteId(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.types.Var4ByteId.ZserioPackingContext();
        }

        @Override
        public nds.core.types.Var4ByteId create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.types.Var4ByteId(context, in);
        }
    }

    private final class ZserioElementFactory_adasGeometry implements zserio.runtime.array.PackableElementFactory<nds.core.geometry.Line2D>
    {
        @Override
        public nds.core.geometry.Line2D create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.geometry.Line2D(in, (byte)(getShift()));
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.geometry.Line2D.ZserioPackingContext();
        }

        @Override
        public nds.core.geometry.Line2D create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.geometry.Line2D(context, in, (byte)(getShift()));
        }
    }

    private final byte shift_;
    private int numRoadReferences_;
    private zserio.runtime.array.Array road_;
    private zserio.runtime.array.Array adasGeometry_;
}
