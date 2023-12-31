/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routing.route;

public class RouteGeometry implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            scale_ = new zserio.runtime.array.DeltaContext();
            shift_ = new zserio.runtime.array.DeltaContext();
            geometry_ = new nds.core.geometry.Line2D.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getScale()
        {
            return scale_;
        }

        public zserio.runtime.array.DeltaContext getShift()
        {
            return shift_;
        }

        public nds.core.geometry.Line2D.ZserioPackingContext getGeometry()
        {
            return geometry_;
        }

        private zserio.runtime.array.DeltaContext scale_;
        private zserio.runtime.array.DeltaContext shift_;
        private nds.core.geometry.Line2D.ZserioPackingContext geometry_;
    };

    public RouteGeometry()
    {
    }

    public RouteGeometry(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RouteGeometry(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RouteGeometry(
            long scale_,
            byte shift_,
            nds.core.geometry.Line2D geometry_)
    {
        setScale(scale_);
        setShift(shift_);
        setGeometry(geometry_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getScale().init(new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(32)),
                new zserio.runtime.array.ArrayElement.LongArrayElement(scale_));
        zserioContext.getShift().init(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));
        geometry_.initPackingContext(zserioContext.getGeometry());
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

        endBitPosition += 32;
        endBitPosition += 5;
        endBitPosition += geometry_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getScale().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(32)),
                new zserio.runtime.array.ArrayElement.LongArrayElement(scale_));
        endBitPosition += zserioContext.getShift().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));
        endBitPosition += geometry_.bitSizeOf(zserioContext.getGeometry(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public long getScale()
    {
        return scale_;
    }

    public void setScale(long scale_)
    {
        this.scale_ = scale_;
    }

    public byte getShift()
    {
        return shift_;
    }

    public void setShift(byte shift_)
    {
        this.shift_ = shift_;
    }

    public nds.core.geometry.Line2D getGeometry()
    {
        return geometry_;
    }

    public void setGeometry(nds.core.geometry.Line2D geometry_)
    {
        this.geometry_ = geometry_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RouteGeometry)
        {
            final RouteGeometry that = (RouteGeometry)obj;

            return
                    scale_ == that.scale_ &&
                    shift_ == that.shift_ &&
                    ((geometry_ == null) ? that.geometry_ == null : geometry_.equals(that.geometry_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, scale_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, shift_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, geometry_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        scale_ = in.readUnsignedInt();

        shift_ = (byte)in.readBits(5);

        geometry_ = new nds.core.geometry.Line2D(in, (byte)(getShift()));
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        scale_ = ((zserio.runtime.array.ArrayElement.LongArrayElement)
                zserioContext.getScale().read(new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(32)), in)).get();

        shift_ = ((zserio.runtime.array.ArrayElement.ByteArrayElement)
                zserioContext.getShift().read(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), in)).get();

        geometry_ = new nds.core.geometry.Line2D(zserioContext.getGeometry(), in, (byte)(getShift()));
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

        endBitPosition += 32;
        endBitPosition += 5;
        endBitPosition = geometry_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getScale().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(32)),
                new zserio.runtime.array.ArrayElement.LongArrayElement(scale_));
        endBitPosition += zserioContext.getShift().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)),
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));
        endBitPosition = geometry_.initializeOffsets(zserioContext.getGeometry(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeUnsignedInt(scale_);

        out.writeBits(shift_, 5);

        // check parameters
        if (geometry_.getShift() != (byte)(getShift()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field RouteGeometry.geometry: " +
                    geometry_.getShift() + " != " + (byte)(getShift()) + "!");
        }
        geometry_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getScale().write(new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(32)), out,
                new zserio.runtime.array.ArrayElement.LongArrayElement(scale_));

        zserioContext.getShift().write(new zserio.runtime.array.ArrayTraits.BitFieldByteArrayTraits((int)(5)), out,
                new zserio.runtime.array.ArrayElement.ByteArrayElement(shift_));

        geometry_.write(zserioContext.getGeometry(), out);
    }

    private long scale_;
    private byte shift_;
    private nds.core.geometry.Line2D geometry_;
}
