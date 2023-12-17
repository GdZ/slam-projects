/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.reference.types;

public class LaneGroupTransitionReference implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            type_ = new zserio.runtime.array.DeltaContext();
            intersectionTransition_ = new nds.lane.reference.types.LaneGroupTransition.ZserioPackingContext();
            pathTransition_ = new nds.lane.reference.types.LaneGroupTransitionPath.ZserioPackingContext();
            geoPathTransition_ = new nds.lane.reference.types.LaneGroupTransitionGeoPath.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getType()
        {
            return type_;
        }

        public nds.lane.reference.types.LaneGroupTransition.ZserioPackingContext getIntersectionTransition()
        {
            return intersectionTransition_;
        }

        public nds.lane.reference.types.LaneGroupTransitionPath.ZserioPackingContext getPathTransition()
        {
            return pathTransition_;
        }

        public nds.lane.reference.types.LaneGroupTransitionGeoPath.ZserioPackingContext getGeoPathTransition()
        {
            return geoPathTransition_;
        }

        private zserio.runtime.array.DeltaContext type_;
        private nds.lane.reference.types.LaneGroupTransition.ZserioPackingContext intersectionTransition_;
        private nds.lane.reference.types.LaneGroupTransitionPath.ZserioPackingContext pathTransition_;
        private nds.lane.reference.types.LaneGroupTransitionGeoPath.ZserioPackingContext geoPathTransition_;
    };

    public LaneGroupTransitionReference()
    {
    }

    public LaneGroupTransitionReference(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public LaneGroupTransitionReference(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public LaneGroupTransitionReference(
            nds.lane.reference.types.LaneGroupTransitionReferenceType type_,
            nds.lane.reference.types.LaneGroupTransition intersectionTransition_,
            nds.lane.reference.types.LaneGroupTransitionPath pathTransition_,
            nds.lane.reference.types.LaneGroupTransitionGeoPath geoPathTransition_)
    {
        setType(type_);
        setIntersectionTransition(intersectionTransition_);
        setPathTransition(pathTransition_);
        setGeoPathTransition(geoPathTransition_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_.initPackingContext(zserioContext.getType());
        if (isIntersectionTransitionUsed())
        {
            intersectionTransition_.initPackingContext(zserioContext.getIntersectionTransition());
        }
        if (isPathTransitionUsed())
        {
            pathTransition_.initPackingContext(zserioContext.getPathTransition());
        }
        if (isGeoPathTransitionUsed())
        {
            geoPathTransition_.initPackingContext(zserioContext.getGeoPathTransition());
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

        endBitPosition += type_.bitSizeOf(endBitPosition);
        if (isIntersectionTransitionUsed())
        {
            endBitPosition += intersectionTransition_.bitSizeOf(endBitPosition);
        }
        if (isPathTransitionUsed())
        {
            endBitPosition += pathTransition_.bitSizeOf(endBitPosition);
        }
        if (isGeoPathTransitionUsed())
        {
            endBitPosition += geoPathTransition_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += type_.bitSizeOf(zserioContext.getType(), endBitPosition);
        if (isIntersectionTransitionUsed())
        {
            endBitPosition += intersectionTransition_.bitSizeOf(zserioContext.getIntersectionTransition(), endBitPosition);
        }
        if (isPathTransitionUsed())
        {
            endBitPosition += pathTransition_.bitSizeOf(zserioContext.getPathTransition(), endBitPosition);
        }
        if (isGeoPathTransitionUsed())
        {
            endBitPosition += geoPathTransition_.bitSizeOf(zserioContext.getGeoPathTransition(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.lane.reference.types.LaneGroupTransitionReferenceType getType()
    {
        return type_;
    }

    public void setType(nds.lane.reference.types.LaneGroupTransitionReferenceType type_)
    {
        this.type_ = type_;
    }

    public nds.lane.reference.types.LaneGroupTransition getIntersectionTransition()
    {
        return intersectionTransition_;
    }

    public void setIntersectionTransition(nds.lane.reference.types.LaneGroupTransition intersectionTransition_)
    {
        this.intersectionTransition_ = intersectionTransition_;
    }

    public boolean isIntersectionTransitionUsed()
    {
        return (getType() == nds.lane.reference.types.LaneGroupTransitionReferenceType.INTERSECTION);
    }

    public boolean isIntersectionTransitionSet()
    {
        return (intersectionTransition_ != null);
    }

    public void resetIntersectionTransition()
    {
        this.intersectionTransition_ = null;
    }

    public nds.lane.reference.types.LaneGroupTransitionPath getPathTransition()
    {
        return pathTransition_;
    }

    public void setPathTransition(nds.lane.reference.types.LaneGroupTransitionPath pathTransition_)
    {
        this.pathTransition_ = pathTransition_;
    }

    public boolean isPathTransitionUsed()
    {
        return (getType() == nds.lane.reference.types.LaneGroupTransitionReferenceType.TRANSITION_PATH);
    }

    public boolean isPathTransitionSet()
    {
        return (pathTransition_ != null);
    }

    public void resetPathTransition()
    {
        this.pathTransition_ = null;
    }

    public nds.lane.reference.types.LaneGroupTransitionGeoPath getGeoPathTransition()
    {
        return geoPathTransition_;
    }

    public void setGeoPathTransition(nds.lane.reference.types.LaneGroupTransitionGeoPath geoPathTransition_)
    {
        this.geoPathTransition_ = geoPathTransition_;
    }

    public boolean isGeoPathTransitionUsed()
    {
        return (getType() == nds.lane.reference.types.LaneGroupTransitionReferenceType.TRANSITION_GEO_PATH);
    }

    public boolean isGeoPathTransitionSet()
    {
        return (geoPathTransition_ != null);
    }

    public void resetGeoPathTransition()
    {
        this.geoPathTransition_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LaneGroupTransitionReference)
        {
            final LaneGroupTransitionReference that = (LaneGroupTransitionReference)obj;

            return
                    ((type_ == null) ? that.type_ == null : type_.getValue() == that.type_.getValue()) &&
                    ((!isIntersectionTransitionUsed()) ? !that.isIntersectionTransitionUsed() :
                        ((intersectionTransition_ == null) ? that.intersectionTransition_ == null : intersectionTransition_.equals(that.intersectionTransition_))) &&
                    ((!isPathTransitionUsed()) ? !that.isPathTransitionUsed() :
                        ((pathTransition_ == null) ? that.pathTransition_ == null : pathTransition_.equals(that.pathTransition_))) &&
                    ((!isGeoPathTransitionUsed()) ? !that.isGeoPathTransitionUsed() :
                        ((geoPathTransition_ == null) ? that.geoPathTransition_ == null : geoPathTransition_.equals(that.geoPathTransition_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, type_);
        if (isIntersectionTransitionUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, intersectionTransition_);
        if (isPathTransitionUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, pathTransition_);
        if (isGeoPathTransitionUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, geoPathTransition_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        type_ = nds.lane.reference.types.LaneGroupTransitionReferenceType.readEnum(in);

        if (getType() == nds.lane.reference.types.LaneGroupTransitionReferenceType.INTERSECTION)
        {
            intersectionTransition_ = new nds.lane.reference.types.LaneGroupTransition(in);
        }

        if (getType() == nds.lane.reference.types.LaneGroupTransitionReferenceType.TRANSITION_PATH)
        {
            pathTransition_ = new nds.lane.reference.types.LaneGroupTransitionPath(in);
        }

        if (getType() == nds.lane.reference.types.LaneGroupTransitionReferenceType.TRANSITION_GEO_PATH)
        {
            geoPathTransition_ = new nds.lane.reference.types.LaneGroupTransitionGeoPath(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_ = nds.lane.reference.types.LaneGroupTransitionReferenceType.readEnum(zserioContext.getType(), in);

        if (getType() == nds.lane.reference.types.LaneGroupTransitionReferenceType.INTERSECTION)
        {
            intersectionTransition_ = new nds.lane.reference.types.LaneGroupTransition(zserioContext.getIntersectionTransition(), in);
        }

        if (getType() == nds.lane.reference.types.LaneGroupTransitionReferenceType.TRANSITION_PATH)
        {
            pathTransition_ = new nds.lane.reference.types.LaneGroupTransitionPath(zserioContext.getPathTransition(), in);
        }

        if (getType() == nds.lane.reference.types.LaneGroupTransitionReferenceType.TRANSITION_GEO_PATH)
        {
            geoPathTransition_ = new nds.lane.reference.types.LaneGroupTransitionGeoPath(zserioContext.getGeoPathTransition(), in);
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

        endBitPosition += type_.bitSizeOf(endBitPosition);
        if (isIntersectionTransitionUsed())
        {
            endBitPosition = intersectionTransition_.initializeOffsets(endBitPosition);
        }
        if (isPathTransitionUsed())
        {
            endBitPosition = pathTransition_.initializeOffsets(endBitPosition);
        }
        if (isGeoPathTransitionUsed())
        {
            endBitPosition = geoPathTransition_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = type_.initializeOffsets(zserioContext.getType(), endBitPosition);
        if (isIntersectionTransitionUsed())
        {
            endBitPosition = intersectionTransition_.initializeOffsets(zserioContext.getIntersectionTransition(), endBitPosition);
        }
        if (isPathTransitionUsed())
        {
            endBitPosition = pathTransition_.initializeOffsets(zserioContext.getPathTransition(), endBitPosition);
        }
        if (isGeoPathTransitionUsed())
        {
            endBitPosition = geoPathTransition_.initializeOffsets(zserioContext.getGeoPathTransition(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        type_.write(out);

        if (isIntersectionTransitionUsed())
        {
            intersectionTransition_.write(out);
        }

        if (isPathTransitionUsed())
        {
            pathTransition_.write(out);
        }

        if (isGeoPathTransitionUsed())
        {
            geoPathTransition_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_.write(zserioContext.getType(), out);

        if (isIntersectionTransitionUsed())
        {
            intersectionTransition_.write(zserioContext.getIntersectionTransition(), out);
        }

        if (isPathTransitionUsed())
        {
            pathTransition_.write(zserioContext.getPathTransition(), out);
        }

        if (isGeoPathTransitionUsed())
        {
            geoPathTransition_.write(zserioContext.getGeoPathTransition(), out);
        }
    }

    private nds.lane.reference.types.LaneGroupTransitionReferenceType type_;
    private nds.lane.reference.types.LaneGroupTransition intersectionTransition_;
    private nds.lane.reference.types.LaneGroupTransitionPath pathTransition_;
    private nds.lane.reference.types.LaneGroupTransitionGeoPath geoPathTransition_;
}
