/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.road.reference.types;

public class IntersectionRoadReference implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            road_ = new nds.core.types.Var4ByteDirectedReference.ZserioPackingContext();
            angle_ = new zserio.runtime.array.DeltaContext();
        }

        public nds.core.types.Var4ByteDirectedReference.ZserioPackingContext getRoad()
        {
            return road_;
        }

        public zserio.runtime.array.DeltaContext getAngle()
        {
            return angle_;
        }

        private nds.core.types.Var4ByteDirectedReference.ZserioPackingContext road_;
        private zserio.runtime.array.DeltaContext angle_;
    };

    public IntersectionRoadReference(
            boolean isArtificial_)
    {
        this.isArtificial_ = isArtificial_;
    }

    public IntersectionRoadReference(zserio.runtime.io.BitStreamReader in,
            boolean isArtificial_)
            throws java.io.IOException
    {
        this.isArtificial_ = isArtificial_;

        read(in);
    }

    public IntersectionRoadReference(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            boolean isArtificial_)
            throws java.io.IOException
    {
        this.isArtificial_ = isArtificial_;

        read(context, in);
    }

    public IntersectionRoadReference(
            boolean isArtificial_,
            nds.core.types.Var4ByteDirectedReference road_,
            java.lang.Short angle_)
    {
        this(isArtificial_);

        setRoad(road_);
        setAngle(angle_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        road_.initPackingContext(zserioContext.getRoad());
        if (isAngleUsed())
        {
            zserioContext.getAngle().init(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(angle_));
        }
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

        endBitPosition += road_.bitSizeOf(endBitPosition);
        if (isAngleUsed())
        {
            endBitPosition += 8;
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += road_.bitSizeOf(zserioContext.getRoad(), endBitPosition);
        if (isAngleUsed())
        {
            endBitPosition += zserioContext.getAngle().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(angle_));
        }

        return (int)(endBitPosition - bitPosition);
    }

    public boolean getIsArtificial()
    {
        return this.isArtificial_;
    }

    public nds.core.types.Var4ByteDirectedReference getRoad()
    {
        return road_;
    }

    public void setRoad(nds.core.types.Var4ByteDirectedReference road_)
    {
        this.road_ = road_;
    }

    public java.lang.Short getAngle()
    {
        return angle_;
    }

    public void setAngle(java.lang.Short angle_)
    {
        this.angle_ = angle_;
    }

    public boolean isAngleUsed()
    {
        return (!getIsArtificial());
    }

    public boolean isAngleSet()
    {
        return (angle_ != null);
    }

    public void resetAngle()
    {
        this.angle_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof IntersectionRoadReference)
        {
            final IntersectionRoadReference that = (IntersectionRoadReference)obj;

            return
                    this.isArtificial_ == that.isArtificial_ &&
                    ((road_ == null) ? that.road_ == null : road_.equals(that.road_)) &&
                    ((!isAngleUsed()) ? !that.isAngleUsed() :
                        ((angle_ == null) ? that.angle_ == null : angle_.equals(that.angle_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getIsArtificial());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, road_);
        if (isAngleUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, angle_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        road_ = new nds.core.types.Var4ByteDirectedReference(in);

        if (!getIsArtificial())
        {
            angle_ = in.readUnsignedByte();
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        road_ = new nds.core.types.Var4ByteDirectedReference(zserioContext.getRoad(), in);

        if (!getIsArtificial())
        {
            angle_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                    zserioContext.getAngle().read(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), in)).get();
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

        endBitPosition = road_.initializeOffsets(endBitPosition);
        if (isAngleUsed())
        {
            endBitPosition += 8;
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = road_.initializeOffsets(zserioContext.getRoad(), endBitPosition);
        if (isAngleUsed())
        {
            endBitPosition += zserioContext.getAngle().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(angle_));
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        road_.write(out);

        if (isAngleUsed())
        {
            out.writeUnsignedByte(angle_);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        road_.write(zserioContext.getRoad(), out);

        if (isAngleUsed())
        {
            zserioContext.getAngle().write(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), out,
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(angle_));
        }
    }

    private final boolean isArtificial_;
    private nds.core.types.Var4ByteDirectedReference road_;
    private java.lang.Short angle_;
}