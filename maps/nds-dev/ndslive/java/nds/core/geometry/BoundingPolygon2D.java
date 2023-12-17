/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.core.geometry;

public class BoundingPolygon2D implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            outline_ = new nds.core.geometry.Line2D.ZserioPackingContext();
        }

        public nds.core.geometry.Line2D.ZserioPackingContext getOutline()
        {
            return outline_;
        }

        private nds.core.geometry.Line2D.ZserioPackingContext outline_;
    };

    public BoundingPolygon2D(
            byte shift_)
    {
        this.shift_ = shift_;
    }

    public BoundingPolygon2D(zserio.runtime.io.BitStreamReader in,
            byte shift_)
            throws java.io.IOException
    {
        this.shift_ = shift_;

        read(in);
    }

    public BoundingPolygon2D(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            byte shift_)
            throws java.io.IOException
    {
        this.shift_ = shift_;

        read(context, in);
    }

    public BoundingPolygon2D(
            byte shift_,
            nds.core.geometry.Line2D outline_,
            boolean hasHoles_,
            nds.core.geometry.Line2D[] holes_)
    {
        this(shift_);

        setOutline(outline_);
        setHasHoles(hasHoles_);
        setHoles(holes_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        outline_.initPackingContext(zserioContext.getOutline());
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

        endBitPosition += outline_.bitSizeOf(endBitPosition);
        endBitPosition += 1;
        if (isHolesUsed())
        {
            endBitPosition += holes_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += outline_.bitSizeOf(zserioContext.getOutline(), endBitPosition);
        endBitPosition += 1;
        if (isHolesUsed())
        {
            endBitPosition += holes_.bitSizeOfPacked(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public byte getShift()
    {
        return this.shift_;
    }

    public nds.core.geometry.Line2D getOutline()
    {
        return outline_;
    }

    public void setOutline(nds.core.geometry.Line2D outline_)
    {
        this.outline_ = outline_;
    }

    public boolean getHasHoles()
    {
        return hasHoles_;
    }

    public void setHasHoles(boolean hasHoles_)
    {
        this.hasHoles_ = hasHoles_;
    }

    public nds.core.geometry.Line2D[] getHoles()
    {
        return (holes_ == null) ? null : holes_.getRawArray();
    }

    public void setHoles(nds.core.geometry.Line2D[] holes_)
    {
        if (holes_ == null)
        {
            this.holes_ = null;
        }
        else
        {
            this.holes_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.geometry.Line2D.class, holes_),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.geometry.Line2D>(new ZserioElementFactory_holes()),
                    zserio.runtime.array.ArrayType.AUTO);
        }
    }

    public boolean isHolesUsed()
    {
        return (getHasHoles());
    }

    public boolean isHolesSet()
    {
        return (holes_ != null);
    }

    public void resetHoles()
    {
        this.holes_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof BoundingPolygon2D)
        {
            final BoundingPolygon2D that = (BoundingPolygon2D)obj;

            return
                    this.shift_ == that.shift_ &&
                    ((outline_ == null) ? that.outline_ == null : outline_.equals(that.outline_)) &&
                    hasHoles_ == that.hasHoles_ &&
                    ((!isHolesUsed()) ? !that.isHolesUsed() :
                        ((holes_ == null) ? that.holes_ == null : holes_.equals(that.holes_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getShift());
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, outline_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, hasHoles_);
        if (isHolesUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, holes_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        outline_ = new nds.core.geometry.Line2D(in, (byte)(getShift()));

        hasHoles_ = in.readBool();

        if (getHasHoles())
        {
            holes_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.geometry.Line2D.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.geometry.Line2D>(new ZserioElementFactory_holes()),
                    zserio.runtime.array.ArrayType.AUTO);
            holes_.read(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        outline_ = new nds.core.geometry.Line2D(zserioContext.getOutline(), in, (byte)(getShift()));

        hasHoles_ = in.readBool();

        if (getHasHoles())
        {
            holes_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.geometry.Line2D.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.geometry.Line2D>(new ZserioElementFactory_holes()),
                    zserio.runtime.array.ArrayType.AUTO);
            holes_.readPacked(in);
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

        endBitPosition = outline_.initializeOffsets(endBitPosition);
        endBitPosition += 1;
        if (isHolesUsed())
        {
            endBitPosition = holes_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = outline_.initializeOffsets(zserioContext.getOutline(), endBitPosition);
        endBitPosition += 1;
        if (isHolesUsed())
        {
            endBitPosition = holes_.initializeOffsetsPacked(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        // check parameters
        if (outline_.getShift() != (byte)(getShift()))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field BoundingPolygon2D.outline: " +
                    outline_.getShift() + " != " + (byte)(getShift()) + "!");
        }
        outline_.write(out);

        out.writeBool(hasHoles_);

        if (isHolesUsed())
        {
            holes_.write(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        outline_.write(zserioContext.getOutline(), out);

        out.writeBool(hasHoles_);

        if (isHolesUsed())
        {
            holes_.writePacked(out);
        }
    }

    private final class ZserioElementFactory_holes implements zserio.runtime.array.PackableElementFactory<nds.core.geometry.Line2D>
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
    private nds.core.geometry.Line2D outline_;
    private boolean hasHoles_;
    private zserio.runtime.array.Array holes_;
}
