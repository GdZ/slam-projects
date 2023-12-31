/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.characteristics.types;

public class RoadMedian implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            width_ = new zserio.runtime.array.DeltaContext();
            shape_ = new zserio.runtime.array.DeltaContext();
            surface_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getWidth()
        {
            return width_;
        }

        public zserio.runtime.array.DeltaContext getShape()
        {
            return shape_;
        }

        public zserio.runtime.array.DeltaContext getSurface()
        {
            return surface_;
        }

        private zserio.runtime.array.DeltaContext width_;
        private zserio.runtime.array.DeltaContext shape_;
        private zserio.runtime.array.DeltaContext surface_;
    };

    public RoadMedian()
    {
    }

    public RoadMedian(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public RoadMedian(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public RoadMedian(
            short width_,
            nds.characteristics.types.RoadMedianShape shape_,
            nds.characteristics.types.RoadMedianSurface surface_)
    {
        setWidth(width_);
        setShape(shape_);
        setSurface(surface_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getWidth().init(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(width_));
        shape_.initPackingContext(zserioContext.getShape());
        surface_.initPackingContext(zserioContext.getSurface());
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(width_);
        endBitPosition += shape_.bitSizeOf(endBitPosition);
        endBitPosition += surface_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getWidth().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(width_));
        endBitPosition += shape_.bitSizeOf(zserioContext.getShape(), endBitPosition);
        endBitPosition += surface_.bitSizeOf(zserioContext.getSurface(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public short getWidth()
    {
        return width_;
    }

    public void setWidth(short width_)
    {
        this.width_ = width_;
    }

    public nds.characteristics.types.RoadMedianShape getShape()
    {
        return shape_;
    }

    public void setShape(nds.characteristics.types.RoadMedianShape shape_)
    {
        this.shape_ = shape_;
    }

    public nds.characteristics.types.RoadMedianSurface getSurface()
    {
        return surface_;
    }

    public void setSurface(nds.characteristics.types.RoadMedianSurface surface_)
    {
        this.surface_ = surface_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RoadMedian)
        {
            final RoadMedian that = (RoadMedian)obj;

            return
                    width_ == that.width_ &&
                    ((shape_ == null) ? that.shape_ == null : shape_.getValue() == that.shape_.getValue()) &&
                    ((surface_ == null) ? that.surface_ == null : surface_.getValue() == that.surface_.getValue());
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, width_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, shape_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, surface_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        width_ = in.readVarUInt16();

        shape_ = nds.characteristics.types.RoadMedianShape.readEnum(in);

        surface_ = nds.characteristics.types.RoadMedianSurface.readEnum(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        width_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                zserioContext.getWidth().read(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), in)).get();

        shape_ = nds.characteristics.types.RoadMedianShape.readEnum(zserioContext.getShape(), in);

        surface_ = nds.characteristics.types.RoadMedianSurface.readEnum(zserioContext.getSurface(), in);
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt16(width_);
        endBitPosition += shape_.bitSizeOf(endBitPosition);
        endBitPosition += surface_.bitSizeOf(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getWidth().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(),
                new zserio.runtime.array.ArrayElement.ShortArrayElement(width_));
        endBitPosition = shape_.initializeOffsets(zserioContext.getShape(), endBitPosition);
        endBitPosition = surface_.initializeOffsets(zserioContext.getSurface(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarUInt16(width_);

        shape_.write(out);

        surface_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getWidth().write(new zserio.runtime.array.ArrayTraits.VarUInt16ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.ShortArrayElement(width_));

        shape_.write(zserioContext.getShape(), out);

        surface_.write(zserioContext.getSurface(), out);
    }

    private short width_;
    private nds.characteristics.types.RoadMedianShape shape_;
    private nds.characteristics.types.RoadMedianSurface surface_;
}
