/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.localization.types;

public class LandmarkPolygon implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            type_ = new zserio.runtime.array.DeltaContext();
            signType_ = new zserio.runtime.array.DeltaContext();
            signDetails_ = new nds.localization.types.LandmarkSignDetails.ZserioPackingContext();
            markerDetails_ = new nds.localization.types.FiducialMarkerDetails.ZserioPackingContext();
            color_ = new nds.localization.types.LandmarkColor.ZserioPackingContext();
            confidence_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getType()
        {
            return type_;
        }

        public zserio.runtime.array.DeltaContext getSignType()
        {
            return signType_;
        }

        public nds.localization.types.LandmarkSignDetails.ZserioPackingContext getSignDetails()
        {
            return signDetails_;
        }

        public nds.localization.types.FiducialMarkerDetails.ZserioPackingContext getMarkerDetails()
        {
            return markerDetails_;
        }

        public nds.localization.types.LandmarkColor.ZserioPackingContext getColor()
        {
            return color_;
        }

        public zserio.runtime.array.DeltaContext getConfidence()
        {
            return confidence_;
        }

        private zserio.runtime.array.DeltaContext type_;
        private zserio.runtime.array.DeltaContext signType_;
        private nds.localization.types.LandmarkSignDetails.ZserioPackingContext signDetails_;
        private nds.localization.types.FiducialMarkerDetails.ZserioPackingContext markerDetails_;
        private nds.localization.types.LandmarkColor.ZserioPackingContext color_;
        private zserio.runtime.array.DeltaContext confidence_;
    };

    public LandmarkPolygon()
    {
    }

    public LandmarkPolygon(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public LandmarkPolygon(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public LandmarkPolygon(
            nds.localization.types.LandmarkPolygonType type_,
            nds.localization.types.LandmarkSignType signType_,
            java.lang.Boolean hasSignDetails_,
            nds.localization.types.LandmarkSignDetails signDetails_,
            nds.localization.types.FiducialMarkerDetails markerDetails_,
            nds.localization.types.LandmarkColor color_,
            java.lang.Short confidence_)
    {
        setType(type_);
        setSignType(signType_);
        setHasSignDetails(hasSignDetails_);
        setSignDetails(signDetails_);
        setMarkerDetails(markerDetails_);
        setColor(color_);
        setConfidence(confidence_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_.initPackingContext(zserioContext.getType());
        if (isSignTypeUsed())
        {
            signType_.initPackingContext(zserioContext.getSignType());
        }
        if (isSignDetailsUsed())
        {
            signDetails_.initPackingContext(zserioContext.getSignDetails());
        }
        if (isMarkerDetailsUsed())
        {
            markerDetails_.initPackingContext(zserioContext.getMarkerDetails());
        }
        if (isColorUsed())
        {
            color_.initPackingContext(zserioContext.getColor());
        }
        if (isConfidenceUsed())
        {
            zserioContext.getConfidence().init(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(confidence_));
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

        endBitPosition += type_.bitSizeOf(endBitPosition);
        if (isSignTypeUsed())
        {
            endBitPosition += signType_.bitSizeOf(endBitPosition);
        }
        if (isHasSignDetailsUsed())
        {
            endBitPosition += 1;
        }
        if (isSignDetailsUsed())
        {
            endBitPosition += signDetails_.bitSizeOf(endBitPosition);
        }
        if (isMarkerDetailsUsed())
        {
            endBitPosition += markerDetails_.bitSizeOf(endBitPosition);
        }
        endBitPosition += 1;
        if (isColorUsed())
        {
            endBitPosition += color_.bitSizeOf(endBitPosition);
        }
        endBitPosition += 1;
        if (isConfidenceUsed())
        {
            endBitPosition += 8;
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += type_.bitSizeOf(zserioContext.getType(), endBitPosition);
        if (isSignTypeUsed())
        {
            endBitPosition += signType_.bitSizeOf(zserioContext.getSignType(), endBitPosition);
        }
        if (isHasSignDetailsUsed())
        {
            endBitPosition += 1;
        }
        if (isSignDetailsUsed())
        {
            endBitPosition += signDetails_.bitSizeOf(zserioContext.getSignDetails(), endBitPosition);
        }
        if (isMarkerDetailsUsed())
        {
            endBitPosition += markerDetails_.bitSizeOf(zserioContext.getMarkerDetails(), endBitPosition);
        }
        endBitPosition += 1;
        if (isColorUsed())
        {
            endBitPosition += color_.bitSizeOf(zserioContext.getColor(), endBitPosition);
        }
        endBitPosition += 1;
        if (isConfidenceUsed())
        {
            endBitPosition += zserioContext.getConfidence().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(confidence_));
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.localization.types.LandmarkPolygonType getType()
    {
        return type_;
    }

    public void setType(nds.localization.types.LandmarkPolygonType type_)
    {
        this.type_ = type_;
    }

    public nds.localization.types.LandmarkSignType getSignType()
    {
        return signType_;
    }

    public void setSignType(nds.localization.types.LandmarkSignType signType_)
    {
        this.signType_ = signType_;
    }

    public boolean isSignTypeUsed()
    {
        return (getType() == nds.localization.types.LandmarkPolygonType.SIGN || getType() == nds.localization.types.LandmarkPolygonType.SIGN_BOUNDING_BOX);
    }

    public boolean isSignTypeSet()
    {
        return (signType_ != null);
    }

    public void resetSignType()
    {
        this.signType_ = null;
    }

    public java.lang.Boolean getHasSignDetails()
    {
        return hasSignDetails_;
    }

    public void setHasSignDetails(java.lang.Boolean hasSignDetails_)
    {
        this.hasSignDetails_ = hasSignDetails_;
    }

    public boolean isHasSignDetailsUsed()
    {
        return (getType() == nds.localization.types.LandmarkPolygonType.SIGN || getType() == nds.localization.types.LandmarkPolygonType.SIGN_BOUNDING_BOX);
    }

    public boolean isHasSignDetailsSet()
    {
        return (hasSignDetails_ != null);
    }

    public void resetHasSignDetails()
    {
        this.hasSignDetails_ = null;
    }

    public nds.localization.types.LandmarkSignDetails getSignDetails()
    {
        return signDetails_;
    }

    public void setSignDetails(nds.localization.types.LandmarkSignDetails signDetails_)
    {
        this.signDetails_ = signDetails_;
    }

    public boolean isSignDetailsUsed()
    {
        return ((getType() == nds.localization.types.LandmarkPolygonType.SIGN || getType() == nds.localization.types.LandmarkPolygonType.SIGN_BOUNDING_BOX) && getHasSignDetails());
    }

    public boolean isSignDetailsSet()
    {
        return (signDetails_ != null);
    }

    public void resetSignDetails()
    {
        this.signDetails_ = null;
    }

    public nds.localization.types.FiducialMarkerDetails getMarkerDetails()
    {
        return markerDetails_;
    }

    public void setMarkerDetails(nds.localization.types.FiducialMarkerDetails markerDetails_)
    {
        this.markerDetails_ = markerDetails_;
    }

    public boolean isMarkerDetailsUsed()
    {
        return (getType() == nds.localization.types.LandmarkPolygonType.FIDUCIAL_MARKER);
    }

    public boolean isMarkerDetailsSet()
    {
        return (markerDetails_ != null);
    }

    public void resetMarkerDetails()
    {
        this.markerDetails_ = null;
    }

    public nds.localization.types.LandmarkColor getColor()
    {
        return color_;
    }

    public void setColor(nds.localization.types.LandmarkColor color_)
    {
        this.color_ = color_;
    }

    public boolean isColorUsed()
    {
        return isColorSet();
    }

    public boolean isColorSet()
    {
        return (color_ != null);
    }

    public void resetColor()
    {
        this.color_ = null;
    }

    public java.lang.Short getConfidence()
    {
        return confidence_;
    }

    public void setConfidence(java.lang.Short confidence_)
    {
        this.confidence_ = confidence_;
    }

    public boolean isConfidenceUsed()
    {
        return isConfidenceSet();
    }

    public boolean isConfidenceSet()
    {
        return (confidence_ != null);
    }

    public void resetConfidence()
    {
        this.confidence_ = null;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof LandmarkPolygon)
        {
            final LandmarkPolygon that = (LandmarkPolygon)obj;

            return
                    ((type_ == null) ? that.type_ == null : type_.getValue() == that.type_.getValue()) &&
                    ((!isSignTypeUsed()) ? !that.isSignTypeUsed() :
                        ((signType_ == null) ? that.signType_ == null : signType_.getValue() == that.signType_.getValue())) &&
                    ((!isHasSignDetailsUsed()) ? !that.isHasSignDetailsUsed() :
                        ((hasSignDetails_ == null) ? that.hasSignDetails_ == null : hasSignDetails_.equals(that.hasSignDetails_))) &&
                    ((!isSignDetailsUsed()) ? !that.isSignDetailsUsed() :
                        ((signDetails_ == null) ? that.signDetails_ == null : signDetails_.equals(that.signDetails_))) &&
                    ((!isMarkerDetailsUsed()) ? !that.isMarkerDetailsUsed() :
                        ((markerDetails_ == null) ? that.markerDetails_ == null : markerDetails_.equals(that.markerDetails_))) &&
                    ((!isColorUsed()) ? !that.isColorUsed() :
                        ((color_ == null) ? that.color_ == null : color_.equals(that.color_))) &&
                    ((!isConfidenceUsed()) ? !that.isConfidenceUsed() :
                        ((confidence_ == null) ? that.confidence_ == null : confidence_.equals(that.confidence_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, type_);
        if (isSignTypeUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, signType_);
        if (isHasSignDetailsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, hasSignDetails_);
        if (isSignDetailsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, signDetails_);
        if (isMarkerDetailsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, markerDetails_);
        if (isColorUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, color_);
        if (isConfidenceUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, confidence_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        type_ = nds.localization.types.LandmarkPolygonType.readEnum(in);

        if (getType() == nds.localization.types.LandmarkPolygonType.SIGN || getType() == nds.localization.types.LandmarkPolygonType.SIGN_BOUNDING_BOX)
        {
            signType_ = nds.localization.types.LandmarkSignType.readEnum(in);
        }

        if (getType() == nds.localization.types.LandmarkPolygonType.SIGN || getType() == nds.localization.types.LandmarkPolygonType.SIGN_BOUNDING_BOX)
        {
            hasSignDetails_ = in.readBool();
        }

        if ((getType() == nds.localization.types.LandmarkPolygonType.SIGN || getType() == nds.localization.types.LandmarkPolygonType.SIGN_BOUNDING_BOX) && getHasSignDetails())
        {
            signDetails_ = new nds.localization.types.LandmarkSignDetails(in);
        }

        if (getType() == nds.localization.types.LandmarkPolygonType.FIDUCIAL_MARKER)
        {
            markerDetails_ = new nds.localization.types.FiducialMarkerDetails(in);
        }

        if (in.readBool())
        {
            color_ = new nds.localization.types.LandmarkColor(in);
        }

        if (in.readBool())
        {
            confidence_ = in.readUnsignedByte();
        }

        checkConstraints();
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        type_ = nds.localization.types.LandmarkPolygonType.readEnum(zserioContext.getType(), in);

        if (getType() == nds.localization.types.LandmarkPolygonType.SIGN || getType() == nds.localization.types.LandmarkPolygonType.SIGN_BOUNDING_BOX)
        {
            signType_ = nds.localization.types.LandmarkSignType.readEnum(zserioContext.getSignType(), in);
        }

        if (getType() == nds.localization.types.LandmarkPolygonType.SIGN || getType() == nds.localization.types.LandmarkPolygonType.SIGN_BOUNDING_BOX)
        {
            hasSignDetails_ = in.readBool();
        }

        if ((getType() == nds.localization.types.LandmarkPolygonType.SIGN || getType() == nds.localization.types.LandmarkPolygonType.SIGN_BOUNDING_BOX) && getHasSignDetails())
        {
            signDetails_ = new nds.localization.types.LandmarkSignDetails(zserioContext.getSignDetails(), in);
        }

        if (getType() == nds.localization.types.LandmarkPolygonType.FIDUCIAL_MARKER)
        {
            markerDetails_ = new nds.localization.types.FiducialMarkerDetails(zserioContext.getMarkerDetails(), in);
        }

        if (in.readBool())
        {
            color_ = new nds.localization.types.LandmarkColor(zserioContext.getColor(), in);
        }

        if (in.readBool())
        {
            confidence_ = ((zserio.runtime.array.ArrayElement.ShortArrayElement)
                    zserioContext.getConfidence().read(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), in)).get();
        }

        checkConstraints();
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
        if (isSignTypeUsed())
        {
            endBitPosition += signType_.bitSizeOf(endBitPosition);
        }
        if (isHasSignDetailsUsed())
        {
            endBitPosition += 1;
        }
        if (isSignDetailsUsed())
        {
            endBitPosition = signDetails_.initializeOffsets(endBitPosition);
        }
        if (isMarkerDetailsUsed())
        {
            endBitPosition = markerDetails_.initializeOffsets(endBitPosition);
        }
        endBitPosition += 1;
        if (isColorUsed())
        {
            endBitPosition = color_.initializeOffsets(endBitPosition);
        }
        endBitPosition += 1;
        if (isConfidenceUsed())
        {
            endBitPosition += 8;
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = type_.initializeOffsets(zserioContext.getType(), endBitPosition);
        if (isSignTypeUsed())
        {
            endBitPosition = signType_.initializeOffsets(zserioContext.getSignType(), endBitPosition);
        }
        if (isHasSignDetailsUsed())
        {
            endBitPosition += 1;
        }
        if (isSignDetailsUsed())
        {
            endBitPosition = signDetails_.initializeOffsets(zserioContext.getSignDetails(), endBitPosition);
        }
        if (isMarkerDetailsUsed())
        {
            endBitPosition = markerDetails_.initializeOffsets(zserioContext.getMarkerDetails(), endBitPosition);
        }
        endBitPosition += 1;
        if (isColorUsed())
        {
            endBitPosition = color_.initializeOffsets(zserioContext.getColor(), endBitPosition);
        }
        endBitPosition += 1;
        if (isConfidenceUsed())
        {
            endBitPosition += zserioContext.getConfidence().bitSizeOf(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)),
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(confidence_));
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        checkConstraints();

        type_.write(out);

        if (isSignTypeUsed())
        {
            signType_.write(out);
        }

        if (isHasSignDetailsUsed())
        {
            out.writeBool(hasSignDetails_);
        }

        if (isSignDetailsUsed())
        {
            signDetails_.write(out);
        }

        if (isMarkerDetailsUsed())
        {
            markerDetails_.write(out);
        }

        if (isColorUsed())
        {
            out.writeBool(true);
            color_.write(out);
        }
        else
        {
            out.writeBool(false);
        }

        if (isConfidenceUsed())
        {
            out.writeBool(true);
            out.writeUnsignedByte(confidence_);
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
        checkConstraints();

        type_.write(zserioContext.getType(), out);

        if (isSignTypeUsed())
        {
            signType_.write(zserioContext.getSignType(), out);
        }

        if (isHasSignDetailsUsed())
        {
            out.writeBool(hasSignDetails_);
        }

        if (isSignDetailsUsed())
        {
            signDetails_.write(zserioContext.getSignDetails(), out);
        }

        if (isMarkerDetailsUsed())
        {
            markerDetails_.write(zserioContext.getMarkerDetails(), out);
        }

        if (isColorUsed())
        {
            out.writeBool(true);
            color_.write(zserioContext.getColor(), out);
        }
        else
        {
            out.writeBool(false);
        }

        if (isConfidenceUsed())
        {
            out.writeBool(true);
            zserioContext.getConfidence().write(new zserio.runtime.array.ArrayTraits.BitFieldShortArrayTraits((int)(8)), out,
                    new zserio.runtime.array.ArrayElement.ShortArrayElement(confidence_));
        }
        else
        {
            out.writeBool(false);
        }
    }

    private void checkConstraints()
    {
        if (isConfidenceUsed() && !(getConfidence() <= 100))
            throw new zserio.runtime.ConstraintError("Constraint violated at LandmarkPolygon.confidence!");
    }

    private nds.localization.types.LandmarkPolygonType type_;
    private nds.localization.types.LandmarkSignType signType_;
    private java.lang.Boolean hasSignDetails_;
    private nds.localization.types.LandmarkSignDetails signDetails_;
    private nds.localization.types.FiducialMarkerDetails markerDetails_;
    private nds.localization.types.LandmarkColor color_;
    private java.lang.Short confidence_;
}
