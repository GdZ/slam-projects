/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routing.guidance;

public class GuidanceLanes implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            numLanes_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getNumLanes()
        {
            return numLanes_;
        }

        private zserio.runtime.array.DeltaContext numLanes_;
    };

    public GuidanceLanes()
    {
    }

    public GuidanceLanes(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public GuidanceLanes(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public GuidanceLanes(
            short numLanes_,
            boolean[] active_,
            nds.routing.guidance.GuidanceLaneMarking[] markings_)
    {
        setNumLanes(numLanes_);
        setActive(active_);
        setMarkings(markings_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getNumLanes().init(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numLanes_));
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

        endBitPosition += 8;
        endBitPosition += active_.bitSizeOf(endBitPosition);
        endBitPosition += 1;
        if (isMarkingsUsed())
        {
            endBitPosition += markings_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumLanes().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numLanes_));
        endBitPosition += active_.bitSizeOf(endBitPosition);
        endBitPosition += 1;
        if (isMarkingsUsed())
        {
            endBitPosition += markings_.bitSizeOfPacked(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public short getNumLanes()
    {
        return numLanes_;
    }

    public void setNumLanes(short numLanes_)
    {
        this.numLanes_ = numLanes_;
    }

    public boolean[] getActive()
    {
        return (active_ == null) ? null : active_.getRawArray();
    }

    public void setActive(boolean[] active_)
    {
        this.active_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.BooleanRawArray(active_),
                new zserio.runtime.array.ArrayTraits.BoolArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
    }

    public nds.routing.guidance.GuidanceLaneMarking[] getMarkings()
    {
        return (markings_ == null) ? null : markings_.getRawArray();
    }

    public void setMarkings(nds.routing.guidance.GuidanceLaneMarking[] markings_)
    {
        if (markings_ == null)
        {
            this.markings_ = null;
        }
        else
        {
            this.markings_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.routing.guidance.GuidanceLaneMarking.class, markings_),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.routing.guidance.GuidanceLaneMarking>(new ZserioElementFactory_markings()),
                    zserio.runtime.array.ArrayType.NORMAL);
        }
    }

    public boolean isMarkingsUsed()
    {
        return isMarkingsSet();
    }

    public boolean isMarkingsSet()
    {
        return (markings_ != null);
    }

    public void resetMarkings()
    {
        this.markings_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof GuidanceLanes)
        {
            final GuidanceLanes that = (GuidanceLanes)obj;

            return
                    numLanes_ == that.numLanes_ &&
                    ((active_ == null) ? that.active_ == null : active_.equals(that.active_)) &&
                    ((!isMarkingsUsed()) ? !that.isMarkingsUsed() :
                        ((markings_ == null) ? that.markings_ == null : markings_.equals(that.markings_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, numLanes_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, active_);
        if (isMarkingsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, markings_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        numLanes_ = in.readUnsignedByte();

        active_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.BooleanRawArray(),
                new zserio.runtime.array.ArrayTraits.BoolArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
        active_.read(in, (int)(getNumLanes()));

        if (in.readBool())
        {
            markings_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.routing.guidance.GuidanceLaneMarking.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.routing.guidance.GuidanceLaneMarking>(new ZserioElementFactory_markings()),
                    zserio.runtime.array.ArrayType.NORMAL);
            markings_.read(in, (int)(getNumLanes()));
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        numLanes_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getNumLanes().read(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), in)).get();

        active_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.BooleanRawArray(),
                new zserio.runtime.array.ArrayTraits.BoolArrayTraits(),
                zserio.runtime.array.ArrayType.NORMAL);
        active_.read(in, (int)(getNumLanes()));

        if (in.readBool())
        {
            markings_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.routing.guidance.GuidanceLaneMarking.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.routing.guidance.GuidanceLaneMarking>(new ZserioElementFactory_markings()),
                    zserio.runtime.array.ArrayType.NORMAL);
            markings_.readPacked(in, (int)(getNumLanes()));
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

        endBitPosition += 8;
        endBitPosition = active_.initializeOffsets(endBitPosition);
        endBitPosition += 1;
        if (isMarkingsUsed())
        {
            endBitPosition = markings_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getNumLanes().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numLanes_));
        endBitPosition = active_.initializeOffsets(endBitPosition);
        endBitPosition += 1;
        if (isMarkingsUsed())
        {
            endBitPosition = markings_.initializeOffsetsPacked(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeUnsignedByte(numLanes_);

        if (active_.size() != (int)(getNumLanes()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field GuidanceLanes.active: " +
                    active_.size() + " != " + (int)(getNumLanes()) + "!");
        }
        active_.write(out);

        if (isMarkingsUsed())
        {
            out.writeBool(true);
            if (markings_.size() != (int)(getNumLanes()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong array length for field GuidanceLanes.markings: " +
                        markings_.size() + " != " + (int)(getNumLanes()) + "!");
            }
            markings_.write(out);
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
        zserioContext.getNumLanes().write(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(numLanes_));

        if (active_.size() != (int)(getNumLanes()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong array length for field GuidanceLanes.active: " +
                    active_.size() + " != " + (int)(getNumLanes()) + "!");
        }
        active_.write(out);

        if (isMarkingsUsed())
        {
            out.writeBool(true);
            if (markings_.size() != (int)(getNumLanes()))
            {
                throw new zserio.runtime.ZserioError("Write: Wrong array length for field GuidanceLanes.markings: " +
                        markings_.size() + " != " + (int)(getNumLanes()) + "!");
            }
            markings_.writePacked(out);
        }
        else
        {
            out.writeBool(false);
        }
    }

    private static final class ZserioElementFactory_markings implements zserio.runtime.array.PackableElementFactory<nds.routing.guidance.GuidanceLaneMarking>
    {
        @Override
        public nds.routing.guidance.GuidanceLaneMarking create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.routing.guidance.GuidanceLaneMarking(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new zserio.runtime.array.DeltaContext();
        }

        @Override
        public nds.routing.guidance.GuidanceLaneMarking create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.routing.guidance.GuidanceLaneMarking(context, in);
        }
    }

    private short numLanes_;
    private zserio.runtime.array.Array active_;
    private zserio.runtime.array.Array markings_;
}