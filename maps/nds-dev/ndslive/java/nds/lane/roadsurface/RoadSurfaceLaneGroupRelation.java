/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.roadsurface;

public class RoadSurfaceLaneGroupRelation implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            laneGroupId_ = new nds.core.types.Var4ByteId.ZserioPackingContext();
            numSurfaces_ = new zserio.runtime.array.DeltaContext();
        }

        public nds.core.types.Var4ByteId.ZserioPackingContext getLaneGroupId()
        {
            return laneGroupId_;
        }

        public zserio.runtime.array.DeltaContext getNumSurfaces()
        {
            return numSurfaces_;
        }

        private nds.core.types.Var4ByteId.ZserioPackingContext laneGroupId_;
        private zserio.runtime.array.DeltaContext numSurfaces_;
    };

    public RoadSurfaceLaneGroupRelation()
    {
    }

    public RoadSurfaceLaneGroupRelation(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoadSurfaceLaneGroupRelation(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoadSurfaceLaneGroupRelation(
            nds.core.types.Var4ByteId laneGroupId_,
            boolean hasLaneRelation_,
            nds.core.types.Var4ByteId[] laneId_,
            int numSurfaces_,
            nds.core.types.Var4ByteId[] relatedSurfaces_)
    {
        setLaneGroupId(laneGroupId_);
        setHasLaneRelation(hasLaneRelation_);
        setLaneId(laneId_);
        setNumSurfaces(numSurfaces_);
        setRelatedSurfaces(relatedSurfaces_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        laneGroupId_.initPackingContext(zserioContext.getLaneGroupId());
        zserioContext.getNumSurfaces().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numSurfaces_));
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

        endBitPosition += laneGroupId_.bitSizeOf(endBitPosition);
        endBitPosition += 1;
        if (isLaneIdUsed())
        {
            endBitPosition += laneId_.bitSizeOf(endBitPosition);
        }
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numSurfaces_);
        endBitPosition += relatedSurfaces_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += laneGroupId_.bitSizeOf(zserioContext.getLaneGroupId(), endBitPosition);
        endBitPosition += 1;
        if (isLaneIdUsed())
        {
            endBitPosition += laneId_.bitSizeOfPacked(endBitPosition);
        }
        endBitPosition += zserioContext.getNumSurfaces().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numSurfaces_));
        endBitPosition += relatedSurfaces_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.types.Var4ByteId getLaneGroupId()
    {
        return laneGroupId_;
    }

    public void setLaneGroupId(nds.core.types.Var4ByteId laneGroupId_)
    {
        this.laneGroupId_ = laneGroupId_;
    }

    public boolean getHasLaneRelation()
    {
        return hasLaneRelation_;
    }

    public void setHasLaneRelation(boolean hasLaneRelation_)
    {
        this.hasLaneRelation_ = hasLaneRelation_;
    }

    public nds.core.types.Var4ByteId[] getLaneId()
    {
        return (laneId_ == null) ? null : laneId_.getRawArray();
    }

    public void setLaneId(nds.core.types.Var4ByteId[] laneId_)
    {
        if (laneId_ == null)
        {
            this.laneId_ = null;
        }
        else
        {
            this.laneId_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class, laneId_),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_laneId()),
                    zserio.runtime.array.ArrayType.AUTO);
        }
    }

    public boolean isLaneIdUsed()
    {
        return (getHasLaneRelation());
    }

    public boolean isLaneIdSet()
    {
        return (laneId_ != null);
    }

    public void resetLaneId()
    {
        this.laneId_ = null;
    }

    public int getNumSurfaces()
    {
        return numSurfaces_;
    }

    public void setNumSurfaces(int numSurfaces_)
    {
        this.numSurfaces_ = numSurfaces_;
    }

    public nds.core.types.Var4ByteId[] getRelatedSurfaces()
    {
        return (relatedSurfaces_ == null) ? null : relatedSurfaces_.getRawArray();
    }

    public void setRelatedSurfaces(nds.core.types.Var4ByteId[] relatedSurfaces_)
    {
        this.relatedSurfaces_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class, relatedSurfaces_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_relatedSurfaces()),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoadSurfaceLaneGroupRelation)
        {
            final RoadSurfaceLaneGroupRelation that = (RoadSurfaceLaneGroupRelation)obj;

            return
                    ((laneGroupId_ == null) ? that.laneGroupId_ == null : laneGroupId_.equals(that.laneGroupId_)) &&
                    hasLaneRelation_ == that.hasLaneRelation_ &&
                    ((!isLaneIdUsed()) ? !that.isLaneIdUsed() :
                        ((laneId_ == null) ? that.laneId_ == null : laneId_.equals(that.laneId_))) &&
                    numSurfaces_ == that.numSurfaces_ &&
                    ((relatedSurfaces_ == null) ? that.relatedSurfaces_ == null : relatedSurfaces_.equals(that.relatedSurfaces_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, laneGroupId_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, hasLaneRelation_);
        if (isLaneIdUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, laneId_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numSurfaces_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, relatedSurfaces_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        laneGroupId_ = new nds.core.types.Var4ByteId(in);

        hasLaneRelation_ = in.readBool();

        if (getHasLaneRelation())
        {
            laneId_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_laneId()),
                    zserio.runtime.array.ArrayType.AUTO);
            laneId_.read(in);
        }

        numSurfaces_ = in.readVarSize();

        relatedSurfaces_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_relatedSurfaces()),
                zserio.runtime.array.ArrayType.NORMAL);
        relatedSurfaces_.read(in, (int)(getNumSurfaces()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        laneGroupId_ = new nds.core.types.Var4ByteId(zserioContext.getLaneGroupId(), in);

        hasLaneRelation_ = in.readBool();

        if (getHasLaneRelation())
        {
            laneId_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_laneId()),
                    zserio.runtime.array.ArrayType.AUTO);
            laneId_.readPacked(in);
        }

        numSurfaces_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getNumSurfaces().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();

        relatedSurfaces_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.types.Var4ByteId.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.types.Var4ByteId>(new ZserioElementFactory_relatedSurfaces()),
                zserio.runtime.array.ArrayType.NORMAL);
        relatedSurfaces_.readPacked(in, (int)(getNumSurfaces()));
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

        endBitPosition = laneGroupId_.initializeOffsets(endBitPosition);
        endBitPosition += 1;
        if (isLaneIdUsed())
        {
            endBitPosition = laneId_.initializeOffsets(endBitPosition);
        }
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(numSurfaces_);
        endBitPosition = relatedSurfaces_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = laneGroupId_.initializeOffsets(zserioContext.getLaneGroupId(), endBitPosition);
        endBitPosition += 1;
        if (isLaneIdUsed())
        {
            endBitPosition = laneId_.initializeOffsetsPacked(endBitPosition);
        }
        endBitPosition += zserioContext.getNumSurfaces().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(numSurfaces_));
        endBitPosition = relatedSurfaces_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        laneGroupId_.write(out);

        out.writeBool(hasLaneRelation_);

        if (isLaneIdUsed())
        {
            laneId_.write(out);
        }

        out.writeVarSize(numSurfaces_);

        if (relatedSurfaces_.size() != (int)(getNumSurfaces()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoadSurfaceLaneGroupRelation.relatedSurfaces: " +
                    relatedSurfaces_.size() + " != " + (int)(getNumSurfaces()) + "!");
        }
        relatedSurfaces_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        laneGroupId_.write(zserioContext.getLaneGroupId(), out);

        out.writeBool(hasLaneRelation_);

        if (isLaneIdUsed())
        {
            laneId_.writePacked(out);
        }

        zserioContext.getNumSurfaces().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(numSurfaces_));

        if (relatedSurfaces_.size() != (int)(getNumSurfaces()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field RoadSurfaceLaneGroupRelation.relatedSurfaces: " +
                    relatedSurfaces_.size() + " != " + (int)(getNumSurfaces()) + "!");
        }
        relatedSurfaces_.writePacked(out);
    }

    private static final class ZserioElementFactory_laneId implements zserio.runtime.array.PackableElementFactory<nds.core.types.Var4ByteId>
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

    private static final class ZserioElementFactory_relatedSurfaces implements zserio.runtime.array.PackableElementFactory<nds.core.types.Var4ByteId>
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

    private nds.core.types.Var4ByteId laneGroupId_;
    private boolean hasLaneRelation_;
    private zserio.runtime.array.Array laneId_;
    private int numSurfaces_;
    private zserio.runtime.array.Array relatedSurfaces_;
}