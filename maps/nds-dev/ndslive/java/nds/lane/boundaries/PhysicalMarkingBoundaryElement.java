/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.lane.boundaries;

public class PhysicalMarkingBoundaryElement implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            type_ = new zserio.runtime.array.DeltaContext();
            material_ = new zserio.runtime.array.DeltaContext();
            width_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getType()
        {
            return type_;
        }

        public zserio.runtime.array.DeltaContext getMaterial()
        {
            return material_;
        }

        public zserio.runtime.array.DeltaContext getWidth()
        {
            return width_;
        }

        private zserio.runtime.array.DeltaContext type_;
        private zserio.runtime.array.DeltaContext material_;
        private zserio.runtime.array.DeltaContext width_;
    };

    public PhysicalMarkingBoundaryElement()
    {
    }

    public PhysicalMarkingBoundaryElement(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public PhysicalMarkingBoundaryElement(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public PhysicalMarkingBoundaryElement(
            nds.lane.types.PhysicalMarkingBoundaryType type_,
            nds.lane.types.PhysicalBoundaryMaterial material_,
            int width_)
    {
        setType(type_);
        setMaterial(material_);
        setWidth(width_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_.initPackingContext(zserioContext.getType());
        material_.initPackingContext(zserioContext.getMaterial());
        zserioContext.getWidth().init(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(width_));
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
        endBitPosition += material_.bitSizeOf(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(width_);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += type_.bitSizeOf(zserioContext.getType(), endBitPosition);
        endBitPosition += material_.bitSizeOf(zserioContext.getMaterial(), endBitPosition);
        endBitPosition += zserioContext.getWidth().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(width_));

        return (int)(endBitPosition - bitPosition);
    }

    public nds.lane.types.PhysicalMarkingBoundaryType getType()
    {
        return type_;
    }

    public void setType(nds.lane.types.PhysicalMarkingBoundaryType type_)
    {
        this.type_ = type_;
    }

    public nds.lane.types.PhysicalBoundaryMaterial getMaterial()
    {
        return material_;
    }

    public void setMaterial(nds.lane.types.PhysicalBoundaryMaterial material_)
    {
        this.material_ = material_;
    }

    public int getWidth()
    {
        return width_;
    }

    public void setWidth(int width_)
    {
        this.width_ = width_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof PhysicalMarkingBoundaryElement)
        {
            final PhysicalMarkingBoundaryElement that = (PhysicalMarkingBoundaryElement)obj;

            return
                    ((type_ == null) ? that.type_ == null : type_.getValue() == that.type_.getValue()) &&
                    ((material_ == null) ? that.material_ == null : material_.getValue() == that.material_.getValue()) &&
                    width_ == that.width_;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, type_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, material_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, width_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        type_ = nds.lane.types.PhysicalMarkingBoundaryType.readEnum(in);

        material_ = nds.lane.types.PhysicalBoundaryMaterial.readEnum(in);

        width_ = in.readVarUInt32();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_ = nds.lane.types.PhysicalMarkingBoundaryType.readEnum(zserioContext.getType(), in);

        material_ = nds.lane.types.PhysicalBoundaryMaterial.readEnum(zserioContext.getMaterial(), in);

        width_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getWidth().read(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();
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
        endBitPosition += material_.bitSizeOf(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(width_);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = type_.initializeOffsets(zserioContext.getType(), endBitPosition);
        endBitPosition = material_.initializeOffsets(zserioContext.getMaterial(), endBitPosition);
        endBitPosition += zserioContext.getWidth().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(width_));

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        type_.write(out);

        material_.write(out);

        out.writeVarUInt32(width_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_.write(zserioContext.getType(), out);

        material_.write(zserioContext.getMaterial(), out);

        zserioContext.getWidth().write(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(width_));
    }

    private nds.lane.types.PhysicalMarkingBoundaryType type_;
    private nds.lane.types.PhysicalBoundaryMaterial material_;
    private int width_;
}
