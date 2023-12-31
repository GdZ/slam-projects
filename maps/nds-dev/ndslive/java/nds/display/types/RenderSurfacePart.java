/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.types;

public class RenderSurfacePart implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            material_ = new nds.display.types.Material.ZserioPackingContext();
        }

        public nds.display.types.Material.ZserioPackingContext getMaterial()
        {
            return material_;
        }

        private nds.display.types.Material.ZserioPackingContext material_;
    };

    public RenderSurfacePart(
            byte numIndexBits_)
    {
        this.numIndexBits_ = numIndexBits_;
    }

    public RenderSurfacePart(zserio.runtime.io.BitStreamReader in,
            byte numIndexBits_)
            throws java.io.IOException
    {
        this.numIndexBits_ = numIndexBits_;

        read(in);
    }

    public RenderSurfacePart(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            byte numIndexBits_)
            throws java.io.IOException
    {
        this.numIndexBits_ = numIndexBits_;

        read(context, in);
    }

    public RenderSurfacePart(
            byte numIndexBits_,
            nds.display.types.Material material_,
            long[] indices_)
    {
        this(numIndexBits_);

        setMaterial(material_);
        setIndices(indices_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        if (isMaterialUsed())
        {
            material_.initPackingContext(zserioContext.getMaterial());
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

        endBitPosition += 1;
        if (isMaterialUsed())
        {
            endBitPosition += material_.bitSizeOf(endBitPosition);
        }
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += indices_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        if (isMaterialUsed())
        {
            endBitPosition += material_.bitSizeOf(zserioContext.getMaterial(), endBitPosition);
        }
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition += indices_.bitSizeOfPacked(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public byte getNumIndexBits()
    {
        return this.numIndexBits_;
    }

    public nds.display.types.Material getMaterial()
    {
        return material_;
    }

    public void setMaterial(nds.display.types.Material material_)
    {
        this.material_ = material_;
    }

    public boolean isMaterialUsed()
    {
        return isMaterialSet();
    }

    public boolean isMaterialSet()
    {
        return (material_ != null);
    }

    public void resetMaterial()
    {
        this.material_ = null;
    }

    public long[] getIndices()
    {
        return (indices_ == null) ? null : indices_.getRawArray();
    }

    public void setIndices(long[] indices_)
    {
        this.indices_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.LongRawArray(indices_),
                new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(getNumIndexBits() + 1)),
                zserio.runtime.array.ArrayType.AUTO);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof RenderSurfacePart)
        {
            final RenderSurfacePart that = (RenderSurfacePart)obj;

            return
                    this.numIndexBits_ == that.numIndexBits_ &&
                    ((!isMaterialUsed()) ? !that.isMaterialUsed() :
                        ((material_ == null) ? that.material_ == null : material_.equals(that.material_))) &&
                    ((indices_ == null) ? that.indices_ == null : indices_.equals(that.indices_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getNumIndexBits());
        if (isMaterialUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, material_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, indices_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        if (in.readBool())
        {
            material_ = new nds.display.types.Material(in);
        }

        in.alignTo(8);
        indices_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.LongRawArray(),
                new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(getNumIndexBits() + 1)),
                zserio.runtime.array.ArrayType.AUTO);
        indices_.readPacked(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        if (in.readBool())
        {
            material_ = new nds.display.types.Material(zserioContext.getMaterial(), in);
        }

        in.alignTo(8);
        indices_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.LongRawArray(),
                new zserio.runtime.array.ArrayTraits.BitFieldLongArrayTraits((int)(getNumIndexBits() + 1)),
                zserio.runtime.array.ArrayType.AUTO);
        indices_.readPacked(in);
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
        if (isMaterialUsed())
        {
            endBitPosition = material_.initializeOffsets(endBitPosition);
        }
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition = indices_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        if (isMaterialUsed())
        {
            endBitPosition = material_.initializeOffsets(zserioContext.getMaterial(), endBitPosition);
        }
        endBitPosition = zserio.runtime.BitPositionUtil.alignTo(8, endBitPosition);
        endBitPosition = indices_.initializeOffsetsPacked(endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        if (isMaterialUsed())
        {
            out.writeBool(true);
            material_.write(out);
        }
        else
        {
            out.writeBool(false);
        }

        out.alignTo(8);
        indices_.writePacked(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        if (isMaterialUsed())
        {
            out.writeBool(true);
            material_.write(zserioContext.getMaterial(), out);
        }
        else
        {
            out.writeBool(false);
        }

        out.alignTo(8);
        indices_.writePacked(out);
    }

    private final byte numIndexBits_;
    private nds.display.types.Material material_;
    private zserio.runtime.array.Array indices_;
}
