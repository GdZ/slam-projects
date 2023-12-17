/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routing.route;

public class RoutePoint implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            type_ = new zserio.runtime.array.DeltaContext();
            waypointType_ = new zserio.runtime.array.DeltaContext();
            departureTime_ = new nds.core.types.TimeWithZone.ZserioPackingContext();
            arrivalTime_ = new nds.core.types.TimeWithZone.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getType()
        {
            return type_;
        }

        public zserio.runtime.array.DeltaContext getWaypointType()
        {
            return waypointType_;
        }

        public nds.core.types.TimeWithZone.ZserioPackingContext getDepartureTime()
        {
            return departureTime_;
        }

        public nds.core.types.TimeWithZone.ZserioPackingContext getArrivalTime()
        {
            return arrivalTime_;
        }

        private zserio.runtime.array.DeltaContext type_;
        private zserio.runtime.array.DeltaContext waypointType_;
        private nds.core.types.TimeWithZone.ZserioPackingContext departureTime_;
        private nds.core.types.TimeWithZone.ZserioPackingContext arrivalTime_;
    };

    public RoutePoint()
    {
    }

    public RoutePoint(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoutePoint(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoutePoint(
            nds.routing.types.RoutePointType type_,
            nds.routing.types.WaypointType waypointType_,
            nds.core.types.TimeWithZone departureTime_,
            nds.core.types.TimeWithZone arrivalTime_)
    {
        setType(type_);
        setWaypointType(waypointType_);
        setDepartureTime(departureTime_);
        setArrivalTime(arrivalTime_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_.initPackingContext(zserioContext.getType());
        if (isWaypointTypeUsed())
        {
            waypointType_.initPackingContext(zserioContext.getWaypointType());
        }
        if (isDepartureTimeUsed())
        {
            departureTime_.initPackingContext(zserioContext.getDepartureTime());
        }
        if (isArrivalTimeUsed())
        {
            arrivalTime_.initPackingContext(zserioContext.getArrivalTime());
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
        endBitPosition += 1;
        if (isWaypointTypeUsed())
        {
            endBitPosition += waypointType_.bitSizeOf(endBitPosition);
        }
        endBitPosition += 1;
        if (isDepartureTimeUsed())
        {
            endBitPosition += departureTime_.bitSizeOf(endBitPosition);
        }
        endBitPosition += 1;
        if (isArrivalTimeUsed())
        {
            endBitPosition += arrivalTime_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += type_.bitSizeOf(zserioContext.getType(), endBitPosition);
        endBitPosition += 1;
        if (isWaypointTypeUsed())
        {
            endBitPosition += waypointType_.bitSizeOf(zserioContext.getWaypointType(), endBitPosition);
        }
        endBitPosition += 1;
        if (isDepartureTimeUsed())
        {
            endBitPosition += departureTime_.bitSizeOf(zserioContext.getDepartureTime(), endBitPosition);
        }
        endBitPosition += 1;
        if (isArrivalTimeUsed())
        {
            endBitPosition += arrivalTime_.bitSizeOf(zserioContext.getArrivalTime(), endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.routing.types.RoutePointType getType()
    {
        return type_;
    }

    public void setType(nds.routing.types.RoutePointType type_)
    {
        this.type_ = type_;
    }

    public nds.routing.types.WaypointType getWaypointType()
    {
        return waypointType_;
    }

    public void setWaypointType(nds.routing.types.WaypointType waypointType_)
    {
        this.waypointType_ = waypointType_;
    }

    public boolean isWaypointTypeUsed()
    {
        return isWaypointTypeSet();
    }

    public boolean isWaypointTypeSet()
    {
        return (waypointType_ != null);
    }

    public void resetWaypointType()
    {
        this.waypointType_ = null;
    }

    public nds.core.types.TimeWithZone getDepartureTime()
    {
        return departureTime_;
    }

    public void setDepartureTime(nds.core.types.TimeWithZone departureTime_)
    {
        this.departureTime_ = departureTime_;
    }

    public boolean isDepartureTimeUsed()
    {
        return isDepartureTimeSet();
    }

    public boolean isDepartureTimeSet()
    {
        return (departureTime_ != null);
    }

    public void resetDepartureTime()
    {
        this.departureTime_ = null;
    }

    public nds.core.types.TimeWithZone getArrivalTime()
    {
        return arrivalTime_;
    }

    public void setArrivalTime(nds.core.types.TimeWithZone arrivalTime_)
    {
        this.arrivalTime_ = arrivalTime_;
    }

    public boolean isArrivalTimeUsed()
    {
        return isArrivalTimeSet();
    }

    public boolean isArrivalTimeSet()
    {
        return (arrivalTime_ != null);
    }

    public void resetArrivalTime()
    {
        this.arrivalTime_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoutePoint)
        {
            final RoutePoint that = (RoutePoint)obj;

            return
                    ((type_ == null) ? that.type_ == null : type_.getValue() == that.type_.getValue()) &&
                    ((!isWaypointTypeUsed()) ? !that.isWaypointTypeUsed() :
                        ((waypointType_ == null) ? that.waypointType_ == null : waypointType_.getValue() == that.waypointType_.getValue())) &&
                    ((!isDepartureTimeUsed()) ? !that.isDepartureTimeUsed() :
                        ((departureTime_ == null) ? that.departureTime_ == null : departureTime_.equals(that.departureTime_))) &&
                    ((!isArrivalTimeUsed()) ? !that.isArrivalTimeUsed() :
                        ((arrivalTime_ == null) ? that.arrivalTime_ == null : arrivalTime_.equals(that.arrivalTime_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, type_);
        if (isWaypointTypeUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, waypointType_);
        if (isDepartureTimeUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, departureTime_);
        if (isArrivalTimeUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, arrivalTime_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        type_ = nds.routing.types.RoutePointType.readEnum(in);

        if (in.readBool())
        {
            waypointType_ = nds.routing.types.WaypointType.readEnum(in);
        }

        if (in.readBool())
        {
            departureTime_ = new nds.core.types.TimeWithZone(in);
        }

        if (in.readBool())
        {
            arrivalTime_ = new nds.core.types.TimeWithZone(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_ = nds.routing.types.RoutePointType.readEnum(zserioContext.getType(), in);

        if (in.readBool())
        {
            waypointType_ = nds.routing.types.WaypointType.readEnum(zserioContext.getWaypointType(), in);
        }

        if (in.readBool())
        {
            departureTime_ = new nds.core.types.TimeWithZone(zserioContext.getDepartureTime(), in);
        }

        if (in.readBool())
        {
            arrivalTime_ = new nds.core.types.TimeWithZone(zserioContext.getArrivalTime(), in);
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
        endBitPosition += 1;
        if (isWaypointTypeUsed())
        {
            endBitPosition += waypointType_.bitSizeOf(endBitPosition);
        }
        endBitPosition += 1;
        if (isDepartureTimeUsed())
        {
            endBitPosition = departureTime_.initializeOffsets(endBitPosition);
        }
        endBitPosition += 1;
        if (isArrivalTimeUsed())
        {
            endBitPosition = arrivalTime_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = type_.initializeOffsets(zserioContext.getType(), endBitPosition);
        endBitPosition += 1;
        if (isWaypointTypeUsed())
        {
            endBitPosition = waypointType_.initializeOffsets(zserioContext.getWaypointType(), endBitPosition);
        }
        endBitPosition += 1;
        if (isDepartureTimeUsed())
        {
            endBitPosition = departureTime_.initializeOffsets(zserioContext.getDepartureTime(), endBitPosition);
        }
        endBitPosition += 1;
        if (isArrivalTimeUsed())
        {
            endBitPosition = arrivalTime_.initializeOffsets(zserioContext.getArrivalTime(), endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        type_.write(out);

        if (isWaypointTypeUsed())
        {
            out.writeBool(true);
            waypointType_.write(out);
        }
        else
        {
            out.writeBool(false);
        }

        if (isDepartureTimeUsed())
        {
            out.writeBool(true);
            departureTime_.write(out);
        }
        else
        {
            out.writeBool(false);
        }

        if (isArrivalTimeUsed())
        {
            out.writeBool(true);
            arrivalTime_.write(out);
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
        type_.write(zserioContext.getType(), out);

        if (isWaypointTypeUsed())
        {
            out.writeBool(true);
            waypointType_.write(zserioContext.getWaypointType(), out);
        }
        else
        {
            out.writeBool(false);
        }

        if (isDepartureTimeUsed())
        {
            out.writeBool(true);
            departureTime_.write(zserioContext.getDepartureTime(), out);
        }
        else
        {
            out.writeBool(false);
        }

        if (isArrivalTimeUsed())
        {
            out.writeBool(true);
            arrivalTime_.write(zserioContext.getArrivalTime(), out);
        }
        else
        {
            out.writeBool(false);
        }
    }

    private nds.routing.types.RoutePointType type_;
    private nds.routing.types.WaypointType waypointType_;
    private nds.core.types.TimeWithZone departureTime_;
    private nds.core.types.TimeWithZone arrivalTime_;
}
