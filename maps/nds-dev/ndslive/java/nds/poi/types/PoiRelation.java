/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.poi.types;

public class PoiRelation implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            relatedPoi_ = new zserio.runtime.array.DeltaContext();
            extRelatedPoi_ = new nds.poi.reference.types.PoiReferenceIndirect.ZserioPackingContext();
            type_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getRelatedPoi()
        {
            return relatedPoi_;
        }

        public nds.poi.reference.types.PoiReferenceIndirect.ZserioPackingContext getExtRelatedPoi()
        {
            return extRelatedPoi_;
        }

        public zserio.runtime.array.DeltaContext getType()
        {
            return type_;
        }

        private zserio.runtime.array.DeltaContext relatedPoi_;
        private nds.poi.reference.types.PoiReferenceIndirect.ZserioPackingContext extRelatedPoi_;
        private zserio.runtime.array.DeltaContext type_;
    };

    public PoiRelation()
    {
    }

    public PoiRelation(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public PoiRelation(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public PoiRelation(
            boolean inSameTile_,
            java.lang.Integer relatedPoi_,
            nds.poi.reference.types.PoiReferenceIndirect extRelatedPoi_,
            nds.poi.types.PoiRelationType type_)
    {
        setInSameTile(inSameTile_);
        setRelatedPoi(relatedPoi_);
        setExtRelatedPoi(extRelatedPoi_);
        setType(type_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        if (isRelatedPoiUsed())
        {
            zserioContext.getRelatedPoi().init(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(relatedPoi_));
        }
        if (isExtRelatedPoiUsed())
        {
            extRelatedPoi_.initPackingContext(zserioContext.getExtRelatedPoi());
        }
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

        endBitPosition += 1;
        if (isRelatedPoiUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(relatedPoi_);
        }
        if (isExtRelatedPoiUsed())
        {
            endBitPosition += extRelatedPoi_.bitSizeOf(endBitPosition);
        }
        endBitPosition += type_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        if (isRelatedPoiUsed())
        {
            endBitPosition += zserioContext.getRelatedPoi().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(relatedPoi_));
        }
        if (isExtRelatedPoiUsed())
        {
            endBitPosition += extRelatedPoi_.bitSizeOf(zserioContext.getExtRelatedPoi(), endBitPosition);
        }
        endBitPosition += type_.bitSizeOf(zserioContext.getType(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public boolean getInSameTile()
    {
        return inSameTile_;
    }

    public void setInSameTile(boolean inSameTile_)
    {
        this.inSameTile_ = inSameTile_;
    }

    public java.lang.Integer getRelatedPoi()
    {
        return relatedPoi_;
    }

    public void setRelatedPoi(java.lang.Integer relatedPoi_)
    {
        this.relatedPoi_ = relatedPoi_;
    }

    public boolean isRelatedPoiUsed()
    {
        return (getInSameTile());
    }

    public boolean isRelatedPoiSet()
    {
        return (relatedPoi_ != null);
    }

    public void resetRelatedPoi()
    {
        this.relatedPoi_ = null;
    }

    public nds.poi.reference.types.PoiReferenceIndirect getExtRelatedPoi()
    {
        return extRelatedPoi_;
    }

    public void setExtRelatedPoi(nds.poi.reference.types.PoiReferenceIndirect extRelatedPoi_)
    {
        this.extRelatedPoi_ = extRelatedPoi_;
    }

    public boolean isExtRelatedPoiUsed()
    {
        return (!getInSameTile());
    }

    public boolean isExtRelatedPoiSet()
    {
        return (extRelatedPoi_ != null);
    }

    public void resetExtRelatedPoi()
    {
        this.extRelatedPoi_ = null;
    }

    public nds.poi.types.PoiRelationType getType()
    {
        return type_;
    }

    public void setType(nds.poi.types.PoiRelationType type_)
    {
        this.type_ = type_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof PoiRelation)
        {
            final PoiRelation that = (PoiRelation)obj;

            return
                    inSameTile_ == that.inSameTile_ &&
                    ((!isRelatedPoiUsed()) ? !that.isRelatedPoiUsed() :
                        ((relatedPoi_ == null) ? that.relatedPoi_ == null : relatedPoi_.equals(that.relatedPoi_))) &&
                    ((!isExtRelatedPoiUsed()) ? !that.isExtRelatedPoiUsed() :
                        ((extRelatedPoi_ == null) ? that.extRelatedPoi_ == null : extRelatedPoi_.equals(that.extRelatedPoi_))) &&
                    ((type_ == null) ? that.type_ == null : type_.getValue() == that.type_.getValue());
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, inSameTile_);
        if (isRelatedPoiUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, relatedPoi_);
        if (isExtRelatedPoiUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, extRelatedPoi_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, type_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        inSameTile_ = in.readBool();

        if (getInSameTile())
        {
            relatedPoi_ = in.readVarUInt32();
        }

        if (!getInSameTile())
        {
            extRelatedPoi_ = new nds.poi.reference.types.PoiReferenceIndirect(in);
        }

        type_ = nds.poi.types.PoiRelationType.readEnum(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        inSameTile_ = in.readBool();

        if (getInSameTile())
        {
            relatedPoi_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                    zserioContext.getRelatedPoi().read(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();
        }

        if (!getInSameTile())
        {
            extRelatedPoi_ = new nds.poi.reference.types.PoiReferenceIndirect(zserioContext.getExtRelatedPoi(), in);
        }

        type_ = nds.poi.types.PoiRelationType.readEnum(zserioContext.getType(), in);
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
        if (isRelatedPoiUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(relatedPoi_);
        }
        if (isExtRelatedPoiUsed())
        {
            endBitPosition = extRelatedPoi_.initializeOffsets(endBitPosition);
        }
        endBitPosition += type_.bitSizeOf(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += 1;
        if (isRelatedPoiUsed())
        {
            endBitPosition += zserioContext.getRelatedPoi().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                    new zserio.runtime.array.ArrayElement.IntArrayElement(relatedPoi_));
        }
        if (isExtRelatedPoiUsed())
        {
            endBitPosition = extRelatedPoi_.initializeOffsets(zserioContext.getExtRelatedPoi(), endBitPosition);
        }
        endBitPosition = type_.initializeOffsets(zserioContext.getType(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeBool(inSameTile_);

        if (isRelatedPoiUsed())
        {
            out.writeVarUInt32(relatedPoi_);
        }

        if (isExtRelatedPoiUsed())
        {
            extRelatedPoi_.write(out);
        }

        type_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        out.writeBool(inSameTile_);

        if (isRelatedPoiUsed())
        {
            zserioContext.getRelatedPoi().write(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.IntArrayElement(relatedPoi_));
        }

        if (isExtRelatedPoiUsed())
        {
            extRelatedPoi_.write(zserioContext.getExtRelatedPoi(), out);
        }

        type_.write(zserioContext.getType(), out);
    }

    private boolean inSameTile_;
    private java.lang.Integer relatedPoi_;
    private nds.poi.reference.types.PoiReferenceIndirect extRelatedPoi_;
    private nds.poi.types.PoiRelationType type_;
}
