/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.poi.poi;

public class Poi implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            poiId_ = new zserio.runtime.array.DeltaContext();
            position_ = new nds.core.geometry.Position2D.ZserioPackingContext();
            poiIconSetReference_ = new zserio.runtime.array.DeltaContext();
            brandIconSetReference_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getPoiId()
        {
            return poiId_;
        }

        public nds.core.geometry.Position2D.ZserioPackingContext getPosition()
        {
            return position_;
        }

        public zserio.runtime.array.DeltaContext getPoiIconSetReference()
        {
            return poiIconSetReference_;
        }

        public zserio.runtime.array.DeltaContext getBrandIconSetReference()
        {
            return brandIconSetReference_;
        }

        private zserio.runtime.array.DeltaContext poiId_;
        private nds.core.geometry.Position2D.ZserioPackingContext position_;
        private zserio.runtime.array.DeltaContext poiIconSetReference_;
        private zserio.runtime.array.DeltaContext brandIconSetReference_;
    };

    public Poi()
    {
    }

    public Poi(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public Poi(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public Poi(
            int poiId_,
            nds.core.geometry.Position2D position_,
            int[] categoryIdList_,
            java.math.BigInteger poiIconSetReference_,
            java.math.BigInteger brandIconSetReference_,
            nds.poi.types.PoiRelation[] relatedChildren_,
            nds.poi.types.PoiRelation[] relatedParents_)
    {
        setPoiId(poiId_);
        setPosition(position_);
        setCategoryIdList(categoryIdList_);
        setPoiIconSetReference(poiIconSetReference_);
        setBrandIconSetReference(brandIconSetReference_);
        setRelatedChildren(relatedChildren_);
        setRelatedParents(relatedParents_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        zserioContext.getPoiId().init(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(poiId_));
        position_.initPackingContext(zserioContext.getPosition());
        if (isPoiIconSetReferenceUsed())
        {
            zserioContext.getPoiIconSetReference().init(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(poiIconSetReference_));
        }
        if (isBrandIconSetReferenceUsed())
        {
            zserioContext.getBrandIconSetReference().init(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(brandIconSetReference_));
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(poiId_);
        endBitPosition += position_.bitSizeOf(endBitPosition);
        endBitPosition += categoryIdList_.bitSizeOf(endBitPosition);
        endBitPosition += 1;
        if (isPoiIconSetReferenceUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(poiIconSetReference_);
        }
        endBitPosition += 1;
        if (isBrandIconSetReferenceUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(brandIconSetReference_);
        }
        endBitPosition += 1;
        if (isRelatedChildrenUsed())
        {
            endBitPosition += relatedChildren_.bitSizeOf(endBitPosition);
        }
        endBitPosition += 1;
        if (isRelatedParentsUsed())
        {
            endBitPosition += relatedParents_.bitSizeOf(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getPoiId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(poiId_));
        endBitPosition += position_.bitSizeOf(zserioContext.getPosition(), endBitPosition);
        endBitPosition += categoryIdList_.bitSizeOfPacked(endBitPosition);
        endBitPosition += 1;
        if (isPoiIconSetReferenceUsed())
        {
            endBitPosition += zserioContext.getPoiIconSetReference().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(poiIconSetReference_));
        }
        endBitPosition += 1;
        if (isBrandIconSetReferenceUsed())
        {
            endBitPosition += zserioContext.getBrandIconSetReference().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(brandIconSetReference_));
        }
        endBitPosition += 1;
        if (isRelatedChildrenUsed())
        {
            endBitPosition += relatedChildren_.bitSizeOfPacked(endBitPosition);
        }
        endBitPosition += 1;
        if (isRelatedParentsUsed())
        {
            endBitPosition += relatedParents_.bitSizeOfPacked(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public int getPoiId()
    {
        return poiId_;
    }

    public void setPoiId(int poiId_)
    {
        this.poiId_ = poiId_;
    }

    public nds.core.geometry.Position2D getPosition()
    {
        return position_;
    }

    public void setPosition(nds.core.geometry.Position2D position_)
    {
        this.position_ = position_;
    }

    public int[] getCategoryIdList()
    {
        return (categoryIdList_ == null) ? null : categoryIdList_.getRawArray();
    }

    public void setCategoryIdList(int[] categoryIdList_)
    {
        this.categoryIdList_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.IntRawArray(categoryIdList_),
                new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public java.math.BigInteger getPoiIconSetReference()
    {
        return poiIconSetReference_;
    }

    public void setPoiIconSetReference(java.math.BigInteger poiIconSetReference_)
    {
        this.poiIconSetReference_ = poiIconSetReference_;
    }

    public boolean isPoiIconSetReferenceUsed()
    {
        return isPoiIconSetReferenceSet();
    }

    public boolean isPoiIconSetReferenceSet()
    {
        return (poiIconSetReference_ != null);
    }

    public void resetPoiIconSetReference()
    {
        this.poiIconSetReference_ = null;
    }

    public java.math.BigInteger getBrandIconSetReference()
    {
        return brandIconSetReference_;
    }

    public void setBrandIconSetReference(java.math.BigInteger brandIconSetReference_)
    {
        this.brandIconSetReference_ = brandIconSetReference_;
    }

    public boolean isBrandIconSetReferenceUsed()
    {
        return isBrandIconSetReferenceSet();
    }

    public boolean isBrandIconSetReferenceSet()
    {
        return (brandIconSetReference_ != null);
    }

    public void resetBrandIconSetReference()
    {
        this.brandIconSetReference_ = null;
    }

    public nds.poi.types.PoiRelation[] getRelatedChildren()
    {
        return (relatedChildren_ == null) ? null : relatedChildren_.getRawArray();
    }

    public void setRelatedChildren(nds.poi.types.PoiRelation[] relatedChildren_)
    {
        if (relatedChildren_ == null)
        {
            this.relatedChildren_ = null;
        }
        else
        {
            this.relatedChildren_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.poi.types.PoiRelation.class, relatedChildren_),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.poi.types.PoiRelation>(new ZserioElementFactory_relatedChildren()),
                    zserio.runtime.array.ArrayType.AUTO);
        }
    }

    public boolean isRelatedChildrenUsed()
    {
        return isRelatedChildrenSet();
    }

    public boolean isRelatedChildrenSet()
    {
        return (relatedChildren_ != null);
    }

    public void resetRelatedChildren()
    {
        this.relatedChildren_ = null;
    }

    public nds.poi.types.PoiRelation[] getRelatedParents()
    {
        return (relatedParents_ == null) ? null : relatedParents_.getRawArray();
    }

    public void setRelatedParents(nds.poi.types.PoiRelation[] relatedParents_)
    {
        if (relatedParents_ == null)
        {
            this.relatedParents_ = null;
        }
        else
        {
            this.relatedParents_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.poi.types.PoiRelation.class, relatedParents_),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.poi.types.PoiRelation>(new ZserioElementFactory_relatedParents()),
                    zserio.runtime.array.ArrayType.AUTO);
        }
    }

    public boolean isRelatedParentsUsed()
    {
        return isRelatedParentsSet();
    }

    public boolean isRelatedParentsSet()
    {
        return (relatedParents_ != null);
    }

    public void resetRelatedParents()
    {
        this.relatedParents_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof Poi)
        {
            final Poi that = (Poi)obj;

            return
                    poiId_ == that.poiId_ &&
                    ((position_ == null) ? that.position_ == null : position_.equals(that.position_)) &&
                    ((categoryIdList_ == null) ? that.categoryIdList_ == null : categoryIdList_.equals(that.categoryIdList_)) &&
                    ((!isPoiIconSetReferenceUsed()) ? !that.isPoiIconSetReferenceUsed() :
                        ((poiIconSetReference_ == null) ? that.poiIconSetReference_ == null : poiIconSetReference_.equals(that.poiIconSetReference_))) &&
                    ((!isBrandIconSetReferenceUsed()) ? !that.isBrandIconSetReferenceUsed() :
                        ((brandIconSetReference_ == null) ? that.brandIconSetReference_ == null : brandIconSetReference_.equals(that.brandIconSetReference_))) &&
                    ((!isRelatedChildrenUsed()) ? !that.isRelatedChildrenUsed() :
                        ((relatedChildren_ == null) ? that.relatedChildren_ == null : relatedChildren_.equals(that.relatedChildren_))) &&
                    ((!isRelatedParentsUsed()) ? !that.isRelatedParentsUsed() :
                        ((relatedParents_ == null) ? that.relatedParents_ == null : relatedParents_.equals(that.relatedParents_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, poiId_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, position_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, categoryIdList_);
        if (isPoiIconSetReferenceUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, poiIconSetReference_);
        if (isBrandIconSetReferenceUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, brandIconSetReference_);
        if (isRelatedChildrenUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, relatedChildren_);
        if (isRelatedParentsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, relatedParents_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        poiId_ = in.readVarUInt32();

        position_ = new nds.core.geometry.Position2D(in, (byte)(0));

        categoryIdList_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.IntRawArray(),
                new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                zserio.runtime.array.ArrayType.AUTO);
        categoryIdList_.read(in);

        if (in.readBool())
        {
            poiIconSetReference_ = in.readVarUInt();
        }

        if (in.readBool())
        {
            brandIconSetReference_ = in.readVarUInt();
        }

        if (in.readBool())
        {
            relatedChildren_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.poi.types.PoiRelation.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.poi.types.PoiRelation>(new ZserioElementFactory_relatedChildren()),
                    zserio.runtime.array.ArrayType.AUTO);
            relatedChildren_.read(in);
        }

        if (in.readBool())
        {
            relatedParents_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.poi.types.PoiRelation.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.poi.types.PoiRelation>(new ZserioElementFactory_relatedParents()),
                    zserio.runtime.array.ArrayType.AUTO);
            relatedParents_.read(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        poiId_ = ((zserio.runtime.array.ArrayElement.IntArrayElement)
                zserioContext.getPoiId().read(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), in)).get();

        position_ = new nds.core.geometry.Position2D(zserioContext.getPosition(), in, (byte)(0));

        categoryIdList_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.IntRawArray(),
                new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                zserio.runtime.array.ArrayType.AUTO);
        categoryIdList_.readPacked(in);

        if (in.readBool())
        {
            poiIconSetReference_ = ((zserio.runtime.array.ArrayElement.BigIntegerArrayElement)
                    zserioContext.getPoiIconSetReference().read(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), in)).get();
        }

        if (in.readBool())
        {
            brandIconSetReference_ = ((zserio.runtime.array.ArrayElement.BigIntegerArrayElement)
                    zserioContext.getBrandIconSetReference().read(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), in)).get();
        }

        if (in.readBool())
        {
            relatedChildren_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.poi.types.PoiRelation.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.poi.types.PoiRelation>(new ZserioElementFactory_relatedChildren()),
                    zserio.runtime.array.ArrayType.AUTO);
            relatedChildren_.readPacked(in);
        }

        if (in.readBool())
        {
            relatedParents_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.poi.types.PoiRelation.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.poi.types.PoiRelation>(new ZserioElementFactory_relatedParents()),
                    zserio.runtime.array.ArrayType.AUTO);
            relatedParents_.readPacked(in);
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

        endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt32(poiId_);
        endBitPosition = position_.initializeOffsets(endBitPosition);
        endBitPosition = categoryIdList_.initializeOffsets(endBitPosition);
        endBitPosition += 1;
        if (isPoiIconSetReferenceUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(poiIconSetReference_);
        }
        endBitPosition += 1;
        if (isBrandIconSetReferenceUsed())
        {
            endBitPosition += zserio.runtime.BitSizeOfCalculator.getBitSizeOfVarUInt(brandIconSetReference_);
        }
        endBitPosition += 1;
        if (isRelatedChildrenUsed())
        {
            endBitPosition = relatedChildren_.initializeOffsets(endBitPosition);
        }
        endBitPosition += 1;
        if (isRelatedParentsUsed())
        {
            endBitPosition = relatedParents_.initializeOffsets(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += zserioContext.getPoiId().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(),
                new zserio.runtime.array.ArrayElement.IntArrayElement(poiId_));
        endBitPosition = position_.initializeOffsets(zserioContext.getPosition(), endBitPosition);
        endBitPosition = categoryIdList_.initializeOffsetsPacked(endBitPosition);
        endBitPosition += 1;
        if (isPoiIconSetReferenceUsed())
        {
            endBitPosition += zserioContext.getPoiIconSetReference().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(poiIconSetReference_));
        }
        endBitPosition += 1;
        if (isBrandIconSetReferenceUsed())
        {
            endBitPosition += zserioContext.getBrandIconSetReference().bitSizeOf(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(),
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(brandIconSetReference_));
        }
        endBitPosition += 1;
        if (isRelatedChildrenUsed())
        {
            endBitPosition = relatedChildren_.initializeOffsetsPacked(endBitPosition);
        }
        endBitPosition += 1;
        if (isRelatedParentsUsed())
        {
            endBitPosition = relatedParents_.initializeOffsetsPacked(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        out.writeVarUInt32(poiId_);

        // check parameters
        if (position_.getShift() != (byte)(0))
        {
            throw new zserio.runtime.ZserioError("Write: Wrong parameter shift for field Poi.position: " +
                    position_.getShift() + " != " + (byte)(0) + "!");
        }
        position_.write(out);

        categoryIdList_.write(out);

        if (isPoiIconSetReferenceUsed())
        {
            out.writeBool(true);
            out.writeVarUInt(poiIconSetReference_);
        }
        else
        {
            out.writeBool(false);
        }

        if (isBrandIconSetReferenceUsed())
        {
            out.writeBool(true);
            out.writeVarUInt(brandIconSetReference_);
        }
        else
        {
            out.writeBool(false);
        }

        if (isRelatedChildrenUsed())
        {
            out.writeBool(true);
            relatedChildren_.write(out);
        }
        else
        {
            out.writeBool(false);
        }

        if (isRelatedParentsUsed())
        {
            out.writeBool(true);
            relatedParents_.write(out);
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
        zserioContext.getPoiId().write(new zserio.runtime.array.ArrayTraits.VarUInt32ArrayTraits(), out,
                new zserio.runtime.array.ArrayElement.IntArrayElement(poiId_));

        position_.write(zserioContext.getPosition(), out);

        categoryIdList_.writePacked(out);

        if (isPoiIconSetReferenceUsed())
        {
            out.writeBool(true);
            zserioContext.getPoiIconSetReference().write(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(poiIconSetReference_));
        }
        else
        {
            out.writeBool(false);
        }

        if (isBrandIconSetReferenceUsed())
        {
            out.writeBool(true);
            zserioContext.getBrandIconSetReference().write(new zserio.runtime.array.ArrayTraits.VarUIntArrayTraits(), out,
                    new zserio.runtime.array.ArrayElement.BigIntegerArrayElement(brandIconSetReference_));
        }
        else
        {
            out.writeBool(false);
        }

        if (isRelatedChildrenUsed())
        {
            out.writeBool(true);
            relatedChildren_.writePacked(out);
        }
        else
        {
            out.writeBool(false);
        }

        if (isRelatedParentsUsed())
        {
            out.writeBool(true);
            relatedParents_.writePacked(out);
        }
        else
        {
            out.writeBool(false);
        }
    }

    private static final class ZserioElementFactory_relatedChildren implements zserio.runtime.array.PackableElementFactory<nds.poi.types.PoiRelation>
    {
        @Override
        public nds.poi.types.PoiRelation create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.poi.types.PoiRelation(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.poi.types.PoiRelation.ZserioPackingContext();
        }

        @Override
        public nds.poi.types.PoiRelation create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.poi.types.PoiRelation(context, in);
        }
    }

    private static final class ZserioElementFactory_relatedParents implements zserio.runtime.array.PackableElementFactory<nds.poi.types.PoiRelation>
    {
        @Override
        public nds.poi.types.PoiRelation create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.poi.types.PoiRelation(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.poi.types.PoiRelation.ZserioPackingContext();
        }

        @Override
        public nds.poi.types.PoiRelation create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.poi.types.PoiRelation(context, in);
        }
    }

    private int poiId_;
    private nds.core.geometry.Position2D position_;
    private zserio.runtime.array.Array categoryIdList_;
    private java.math.BigInteger poiIconSetReference_;
    private java.math.BigInteger brandIconSetReference_;
    private zserio.runtime.array.Array relatedChildren_;
    private zserio.runtime.array.Array relatedParents_;
}