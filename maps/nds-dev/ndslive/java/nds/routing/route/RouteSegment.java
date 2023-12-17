/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routing.route;

public class RouteSegment implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            startPosition_ = new zserio.runtime.array.DeltaContext();
            startPositionWithOffset_ = new nds.core.geometry.LinePositionOffset2D.ZserioPackingContext();
            endPosition_ = new zserio.runtime.array.DeltaContext();
            endPositionWithOffset_ = new nds.core.geometry.LinePositionOffset2D.ZserioPackingContext();
            length_ = new zserio.runtime.array.DeltaContext();
            travelTime_ = new zserio.runtime.array.DeltaContext();
            type_ = new zserio.runtime.array.DeltaContext();
            segmentDetails_ = new nds.routing.route.RouteSegmentDetails.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getStartPosition()
        {
            return startPosition_;
        }

        public nds.core.geometry.LinePositionOffset2D.ZserioPackingContext getStartPositionWithOffset()
        {
            return startPositionWithOffset_;
        }

        public zserio.runtime.array.DeltaContext getEndPosition()
        {
            return endPosition_;
        }

        public nds.core.geometry.LinePositionOffset2D.ZserioPackingContext getEndPositionWithOffset()
        {
            return endPositionWithOffset_;
        }

        public zserio.runtime.array.DeltaContext getLength()
        {
            return length_;
        }

        public zserio.runtime.array.DeltaContext getTravelTime()
        {
            return travelTime_;
        }

        public zserio.runtime.array.DeltaContext getType()
        {
            return type_;
        }

        public nds.routing.route.RouteSegmentDetails.ZserioPackingContext getSegmentDetails()
        {
            return segmentDetails_;
        }

        private zserio.runtime.array.DeltaContext startPosition_;
        private nds.core.geometry.LinePositionOffset2D.ZserioPackingContext startPositionWithOffset_;
        private zserio.runtime.array.DeltaContext endPosition_;
        private nds.core.geometry.LinePositionOffset2D.ZserioPackingContext endPositionWithOffset_;
        private zserio.runtime.array.DeltaContext length_;
        private zserio.runtime.array.DeltaContext travelTime_;
        private zserio.runtime.array.DeltaContext type_;
        private nds.routing.route.RouteSegmentDetails.ZserioPackingContext segmentDetails_;
    };

    public RouteSegment()
    {
    }

    public RouteSegment(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RouteSegment(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RouteSegment(
            boolean hasStartOffset_,
            boolean hasEndOffset_,
            java.lang.Integer startPosition_,
            nds.core.geometry.LinePositionOffset2D startPositionWithOffset_,
            java.lang.Integer endPosition_,
            nds.core.geometry.LinePositionOffset2D endPositionWithOffset_,
            int length_,
            java.math.BigInteger travelTime_,
            nds.routing.types.RouteSegmentType type_,
            nds.routing.route.RouteSegmentDetails segmentDetails_)
    {
        setHasStartOffset(hasStartOffset_);
        setHasEndOffset(hasEndOffset_);
        setStartPosition(startPosition_);
        setStartPositionWithOffset(startPositionWithOffset_);
        setEndPosition(endPosition_);
        setEndPositionWithOffset(endPositionWithOffset_);
        setLength(length_);
        setTravelTime(travelTime_);
        setType(type_);
        setSegmentDetails(segmentDetails_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        if (isStartPositionUsed())
        {
            zserioContext.getStartPosition().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startPosition_));
        }
        if (isStartPositionWithOffsetUsed())
        {
            startPositionWithOffset_.initPackingContext(zserioContext.getStartPositionWithOffset());
        }
        if (isEndPositionUsed())
        {
            zserioContext.getEndPosition().init(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(endPosition_));
        }
        if (isEndPositionWithOffsetUsed())
        {
            endPositionWithOffset_.initPackingContext(zserioContext.getEndPositionWithOffset());
        }
        zserioContext.getLength().init(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(length_));
        zserioContext.getTravelTime().init(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(travelTime_));
        type_.initPackingContext(zserioContext.getType());
        segmentDetails_.initPackingContext(zserioContext.getSegmentDetails());
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

        endBitPosition += 1;
        endBitPosition += 1;
        if (isStartPositionUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(startPosition_);
        }
        if (isStartPositionWithOffsetUsed())
        {
            endBitPosition += startPositionWithOffset_.bitSizeOf(endBitPosition);
        }
        if (isEndPositionUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(endPosition_);
        }
        if (isEndPositionWithOffsetUsed())
        {
            endBitPosition += endPositionWithOffset_.bitSizeOf(endBitPosition);
        }
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(length_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(travelTime_);
        endBitPosition += type_.bitSizeOf(endBitPosition);
        endBitPosition += segmentDetails_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        endBitPosition += 1;
        if (isStartPositionUsed())
        {
            endBitPosition += zserioContext.getStartPosition().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startPosition_));
        }
        if (isStartPositionWithOffsetUsed())
        {
            endBitPosition += startPositionWithOffset_.bitSizeOf(zserioContext.getStartPositionWithOffset(), endBitPosition);
        }
        if (isEndPositionUsed())
        {
            endBitPosition += zserioContext.getEndPosition().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(endPosition_));
        }
        if (isEndPositionWithOffsetUsed())
        {
            endBitPosition += endPositionWithOffset_.bitSizeOf(zserioContext.getEndPositionWithOffset(), endBitPosition);
        }
        endBitPosition += zserioContext.getLength().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(length_));
        endBitPosition += zserioContext.getTravelTime().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(travelTime_));
        endBitPosition += type_.bitSizeOf(zserioContext.getType(), endBitPosition);
        endBitPosition += segmentDetails_.bitSizeOf(zserioContext.getSegmentDetails(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public boolean getHasStartOffset()
    {
        return hasStartOffset_;
    }

    public void setHasStartOffset(boolean hasStartOffset_)
    {
        this.hasStartOffset_ = hasStartOffset_;
    }

    public boolean getHasEndOffset()
    {
        return hasEndOffset_;
    }

    public void setHasEndOffset(boolean hasEndOffset_)
    {
        this.hasEndOffset_ = hasEndOffset_;
    }

    public java.lang.Integer getStartPosition()
    {
        return startPosition_;
    }

    public void setStartPosition(java.lang.Integer startPosition_)
    {
        this.startPosition_ = startPosition_;
    }

    public boolean isStartPositionUsed()
    {
        return (!getHasStartOffset());
    }

    public boolean isStartPositionSet()
    {
        return (startPosition_ != null);
    }

    public void resetStartPosition()
    {
        this.startPosition_ = null;
    }

    public nds.core.geometry.LinePositionOffset2D getStartPositionWithOffset()
    {
        return startPositionWithOffset_;
    }

    public void setStartPositionWithOffset(nds.core.geometry.LinePositionOffset2D startPositionWithOffset_)
    {
        this.startPositionWithOffset_ = startPositionWithOffset_;
    }

    public boolean isStartPositionWithOffsetUsed()
    {
        return (getHasStartOffset());
    }

    public boolean isStartPositionWithOffsetSet()
    {
        return (startPositionWithOffset_ != null);
    }

    public void resetStartPositionWithOffset()
    {
        this.startPositionWithOffset_ = null;
    }

    public java.lang.Integer getEndPosition()
    {
        return endPosition_;
    }

    public void setEndPosition(java.lang.Integer endPosition_)
    {
        this.endPosition_ = endPosition_;
    }

    public boolean isEndPositionUsed()
    {
        return (!getHasEndOffset());
    }

    public boolean isEndPositionSet()
    {
        return (endPosition_ != null);
    }

    public void resetEndPosition()
    {
        this.endPosition_ = null;
    }

    public nds.core.geometry.LinePositionOffset2D getEndPositionWithOffset()
    {
        return endPositionWithOffset_;
    }

    public void setEndPositionWithOffset(nds.core.geometry.LinePositionOffset2D endPositionWithOffset_)
    {
        this.endPositionWithOffset_ = endPositionWithOffset_;
    }

    public boolean isEndPositionWithOffsetUsed()
    {
        return (getHasEndOffset());
    }

    public boolean isEndPositionWithOffsetSet()
    {
        return (endPositionWithOffset_ != null);
    }

    public void resetEndPositionWithOffset()
    {
        this.endPositionWithOffset_ = null;
    }

    public int getLength()
    {
        return length_;
    }

    public void setLength(int length_)
    {
        this.length_ = length_;
    }

    public java.math.BigInteger getTravelTime()
    {
        return travelTime_;
    }

    public void setTravelTime(java.math.BigInteger travelTime_)
    {
        this.travelTime_ = travelTime_;
    }

    public nds.routing.types.RouteSegmentType getType()
    {
        return type_;
    }

    public void setType(nds.routing.types.RouteSegmentType type_)
    {
        this.type_ = type_;
    }

    public nds.routing.route.RouteSegmentDetails getSegmentDetails()
    {
        return segmentDetails_;
    }

    public void setSegmentDetails(nds.routing.route.RouteSegmentDetails segmentDetails_)
    {
        this.segmentDetails_ = segmentDetails_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RouteSegment)
        {
            final RouteSegment that = (RouteSegment)obj;

            return
                    hasStartOffset_ == that.hasStartOffset_ &&
                    hasEndOffset_ == that.hasEndOffset_ &&
                    ((!isStartPositionUsed()) ? !that.isStartPositionUsed() :
                        ((startPosition_ == null) ? that.startPosition_ == null : startPosition_.equals(that.startPosition_))) &&
                    ((!isStartPositionWithOffsetUsed()) ? !that.isStartPositionWithOffsetUsed() :
                        ((startPositionWithOffset_ == null) ? that.startPositionWithOffset_ == null : startPositionWithOffset_.equals(that.startPositionWithOffset_))) &&
                    ((!isEndPositionUsed()) ? !that.isEndPositionUsed() :
                        ((endPosition_ == null) ? that.endPosition_ == null : endPosition_.equals(that.endPosition_))) &&
                    ((!isEndPositionWithOffsetUsed()) ? !that.isEndPositionWithOffsetUsed() :
                        ((endPositionWithOffset_ == null) ? that.endPositionWithOffset_ == null : endPositionWithOffset_.equals(that.endPositionWithOffset_))) &&
                    length_ == that.length_ &&
                    ((travelTime_ == null) ? that.travelTime_ == null : travelTime_.equals(that.travelTime_)) &&
                    ((type_ == null) ? that.type_ == null : type_.getValue() == that.type_.getValue()) &&
                    ((segmentDetails_ == null) ? that.segmentDetails_ == null : segmentDetails_.equals(that.segmentDetails_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, hasStartOffset_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, hasEndOffset_);
        if (isStartPositionUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, startPosition_);
        if (isStartPositionWithOffsetUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, startPositionWithOffset_);
        if (isEndPositionUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, endPosition_);
        if (isEndPositionWithOffsetUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, endPositionWithOffset_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, length_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, travelTime_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, type_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, segmentDetails_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        hasStartOffset_ = in.readBool();

        hasEndOffset_ = in.readBool();

        if (!getHasStartOffset())
        {
            startPosition_ = in.readVarSize();
        }

        if (getHasStartOffset())
        {
            startPositionWithOffset_ = new nds.core.geometry.LinePositionOffset2D(in, (byte)(0));
        }

        if (!getHasEndOffset())
        {
            endPosition_ = in.readVarSize();
        }

        if (getHasEndOffset())
        {
            endPositionWithOffset_ = new nds.core.geometry.LinePositionOffset2D(in, (byte)(0));
        }

        length_ = in.readVarUInt32();

        travelTime_ = in.readVarUInt();

        type_ = nds.routing.types.RouteSegmentType.readEnum(in);

        segmentDetails_ = new nds.routing.route.RouteSegmentDetails(in, getType());
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        hasStartOffset_ = in.readBool();

        hasEndOffset_ = in.readBool();

        if (!getHasStartOffset())
        {
            startPosition_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                    zserioContext.getStartPosition().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();
        }

        if (getHasStartOffset())
        {
            startPositionWithOffset_ = new nds.core.geometry.LinePositionOffset2D(zserioContext.getStartPositionWithOffset(), in, (byte)(0));
        }

        if (!getHasEndOffset())
        {
            endPosition_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                    zserioContext.getEndPosition().read(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), in)).get();
        }

        if (getHasEndOffset())
        {
            endPositionWithOffset_ = new nds.core.geometry.LinePositionOffset2D(zserioContext.getEndPositionWithOffset(), in, (byte)(0));
        }

        length_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getLength().read(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();

        travelTime_ = ((zserio.runtime.array.ArrayElement.BigIntegerArrayElement)
                zserioContext.getTravelTime().read(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), in)).get();

        type_ = nds.routing.types.RouteSegmentType.readEnum(zserioContext.getType(), in);

        segmentDetails_ = new nds.routing.route.RouteSegmentDetails(zserioContext.getSegmentDetails(), in, getType());
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

        endBitPosition += 1;
        endBitPosition += 1;
        if (isStartPositionUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(startPosition_);
        }
        if (isStartPositionWithOffsetUsed())
        {
            endBitPosition = startPositionWithOffset_.initializeOffsets(endBitPosition);
        }
        if (isEndPositionUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarSize(endPosition_);
        }
        if (isEndPositionWithOffsetUsed())
        {
            endBitPosition = endPositionWithOffset_.initializeOffsets(endBitPosition);
        }
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(length_);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(travelTime_);
        endBitPosition += type_.bitSizeOf(endBitPosition);
        endBitPosition = segmentDetails_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        endBitPosition += 1;
        if (isStartPositionUsed())
        {
            endBitPosition += zserioContext.getStartPosition().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startPosition_));
        }
        if (isStartPositionWithOffsetUsed())
        {
            endBitPosition = startPositionWithOffset_.initializeOffsets(zserioContext.getStartPositionWithOffset(), endBitPosition);
        }
        if (isEndPositionUsed())
        {
            endBitPosition += zserioContext.getEndPosition().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(endPosition_));
        }
        if (isEndPositionWithOffsetUsed())
        {
            endBitPosition = endPositionWithOffset_.initializeOffsets(zserioContext.getEndPositionWithOffset(), endBitPosition);
        }
        endBitPosition += zserioContext.getLength().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(length_));
        endBitPosition += zserioContext.getTravelTime().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(travelTime_));
        endBitPosition = type_.initializeOffsets(zserioContext.getType(), endBitPosition);
        endBitPosition = segmentDetails_.initializeOffsets(zserioContext.getSegmentDetails(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBool(hasStartOffset_);

        out.writeBool(hasEndOffset_);

        if (isStartPositionUsed())
        {
            out.writeVarSize(startPosition_);
        }

        if (isStartPositionWithOffsetUsed())
        {
            // check parameters
            if (startPositionWithOffset_.getShift() != (byte)(0))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field RouteSegment.startPositionWithOffset: " +
                        startPositionWithOffset_.getShift() + " != " + (byte)(0) + "!");
            }
            startPositionWithOffset_.write(out);
        }

        if (isEndPositionUsed())
        {
            out.writeVarSize(endPosition_);
        }

        if (isEndPositionWithOffsetUsed())
        {
            // check parameters
            if (endPositionWithOffset_.getShift() != (byte)(0))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field RouteSegment.endPositionWithOffset: " +
                        endPositionWithOffset_.getShift() + " != " + (byte)(0) + "!");
            }
            endPositionWithOffset_.write(out);
        }

        out.writeVarUInt32(length_);

        out.writeVarUInt(travelTime_);

        type_.write(out);

        // check parameters
        if (segmentDetails_.getType() != (getType()))
        {
            throw new zserio.runtime.ZserioError("Write: Inconsistent parameter type for field RouteSegment.segmentDetails!");
        }
        segmentDetails_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        out.writeBool(hasStartOffset_);

        out.writeBool(hasEndOffset_);

        if (isStartPositionUsed())
        {
            zserioContext.getStartPosition().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.IntArrayElement(startPosition_));
        }

        if (isStartPositionWithOffsetUsed())
        {
            startPositionWithOffset_.write(zserioContext.getStartPositionWithOffset(), out);
        }

        if (isEndPositionUsed())
        {
            zserioContext.getEndPosition().write(new zserio.runtime.array.ArrayTraits.VarSizeArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.IntArrayElement(endPosition_));
        }

        if (isEndPositionWithOffsetUsed())
        {
            endPositionWithOffset_.write(zserioContext.getEndPositionWithOffset(), out);
        }

        zserioContext.getLength().write(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(length_));

        zserioContext.getTravelTime().write(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(travelTime_));

        type_.write(zserioContext.getType(), out);

        segmentDetails_.write(zserioContext.getSegmentDetails(), out);
    }

    private boolean hasStartOffset_;
    private boolean hasEndOffset_;
    private java.lang.Integer startPosition_;
    private nds.core.geometry.LinePositionOffset2D startPositionWithOffset_;
    private java.lang.Integer endPosition_;
    private nds.core.geometry.LinePositionOffset2D endPositionWithOffset_;
    private int length_;
    private java.math.BigInteger travelTime_;
    private nds.routing.types.RouteSegmentType type_;
    private nds.routing.route.RouteSegmentDetails segmentDetails_;
}