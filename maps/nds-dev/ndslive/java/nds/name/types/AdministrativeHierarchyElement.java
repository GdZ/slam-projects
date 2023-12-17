/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.name.types;

public class AdministrativeHierarchyElement implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            id_ = new zserio.runtime.array.DeltaContext();
            type_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getId()
        {
            return id_;
        }

        public zserio.runtime.array.DeltaContext getType()
        {
            return type_;
        }

        private zserio.runtime.array.DeltaContext id_;
        private zserio.runtime.array.DeltaContext type_;
    };

    public AdministrativeHierarchyElement()
    {
    }

    public AdministrativeHierarchyElement(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public AdministrativeHierarchyElement(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public AdministrativeHierarchyElement(
            int id_,
            nds.name.types.AdminHierarchyElementType type_,
            java.lang.String name_)
    {
        setId(id_);
        setType(type_);
        setName(name_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getId().init(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(id_));
        type_.initPackingContext(zserioContext.getType());
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(id_);
        endBitPosition += type_.bitSizeOf(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(name_);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(id_));
        endBitPosition += type_.bitSizeOf(zserioContext.getType(), endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(name_);

        return (int)(endBitPosition - bitPosition);
    }

    public int getId()
    {
        return id_;
    }

    public void setId(int id_)
    {
        this.id_ = id_;
    }

    public nds.name.types.AdminHierarchyElementType getType()
    {
        return type_;
    }

    public void setType(nds.name.types.AdminHierarchyElementType type_)
    {
        this.type_ = type_;
    }

    public java.lang.String getName()
    {
        return name_;
    }

    public void setName(java.lang.String name_)
    {
        this.name_ = name_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof AdministrativeHierarchyElement)
        {
            final AdministrativeHierarchyElement that = (AdministrativeHierarchyElement)obj;

            return
                    id_ == that.id_ &&
                    ((type_ == null) ? that.type_ == null : type_.getValue() == that.type_.getValue()) &&
                    ((name_ == null) ? that.name_ == null : name_.equals(that.name_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, id_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, type_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, name_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        id_ = in.readVarUInt32();

        type_ = nds.name.types.AdminHierarchyElementType.readEnum(in);

        name_ = in.readString();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        id_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getId().read(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();

        type_ = nds.name.types.AdminHierarchyElementType.readEnum(zserioContext.getType(), in);

        name_ = in.readString();
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(id_);
        endBitPosition += type_.bitSizeOf(endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(name_);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(id_));
        endBitPosition = type_.initializeOffsets(zserioContext.getType(), endBitPosition);
        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfString(name_);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarUInt32(id_);

        type_.write(out);

        out.writeString(name_);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getId().write(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(id_));

        type_.write(zserioContext.getType(), out);

        out.writeString(name_);
    }

    private int id_;
    private nds.name.types.AdminHierarchyElementType type_;
    private java.lang.String name_;
}
