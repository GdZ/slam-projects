/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.details.attributes;

public class Display3dMeshAttributeValue implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            additional3dFeatureClass_ = new zserio.runtime.array.DeltaContext();
            originalPointHeights_ = new nds.display.details.types.OriginalPointHeights.ZserioPackingContext();
        }

        public zserio.runtime.array.DeltaContext getAdditional3dFeatureClass()
        {
            return additional3dFeatureClass_;
        }

        public nds.display.details.types.OriginalPointHeights.ZserioPackingContext getOriginalPointHeights()
        {
            return originalPointHeights_;
        }

        private zserio.runtime.array.DeltaContext additional3dFeatureClass_;
        private nds.display.details.types.OriginalPointHeights.ZserioPackingContext originalPointHeights_;
    };

    public Display3dMeshAttributeValue(
            nds.display.details.attributes.Display3dMeshAttributeType type_)
    {
        this.type_ = type_;
    }

    public Display3dMeshAttributeValue(zserio.runtime.io.BitStreamReader in,
            nds.display.details.attributes.Display3dMeshAttributeType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(in);
    }

    public Display3dMeshAttributeValue(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in,
            nds.display.details.attributes.Display3dMeshAttributeType type_)
            throws java.io.IOException
    {
        this.type_ = type_;

        read(context, in);
    }

    public int choiceTag()
    {
        switch (getType())
        {
        case ADDITIONAL_3D_FEATURE_CLASS:
            return CHOICE_additional3dFeatureClass;
        case ORIGINAL_POINT_HEIGHTS:
            return CHOICE_originalPointHeights;
        default:
            return UNDEFINED_CHOICE;
        }
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case ADDITIONAL_3D_FEATURE_CLASS:
            getAdditional3dFeatureClass().initPackingContext(zserioContext.getAdditional3dFeatureClass());
            break;
        case ORIGINAL_POINT_HEIGHTS:
            getOriginalPointHeights().initPackingContext(zserioContext.getOriginalPointHeights());
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice Display3dMeshAttributeValue: " + getType() + "!");
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

        switch (getType())
        {
        case ADDITIONAL_3D_FEATURE_CLASS:
            endBitPosition += getAdditional3dFeatureClass().bitSizeOf(endBitPosition);
            break;
        case ORIGINAL_POINT_HEIGHTS:
            endBitPosition += getOriginalPointHeights().bitSizeOf(endBitPosition);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice Display3dMeshAttributeValue: " + getType() + "!");
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        switch (getType())
        {
        case ADDITIONAL_3D_FEATURE_CLASS:
            endBitPosition += getAdditional3dFeatureClass().bitSizeOf(zserioContext.getAdditional3dFeatureClass(), endBitPosition);
            break;
        case ORIGINAL_POINT_HEIGHTS:
            endBitPosition += getOriginalPointHeights().bitSizeOf(zserioContext.getOriginalPointHeights(), endBitPosition);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice Display3dMeshAttributeValue: " + getType() + "!");
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.display.details.attributes.Display3dMeshAttributeType getType()
    {
        return this.type_;
    }

    public nds.display.details.types.Additional3dFeatureClass getAdditional3dFeatureClass()
    {
        return (nds.display.details.types.Additional3dFeatureClass)objectChoice;
    }

    public void setAdditional3dFeatureClass(nds.display.details.types.Additional3dFeatureClass additional3dFeatureClass_)
    {
        objectChoice = additional3dFeatureClass_;
    }

    public nds.display.details.types.OriginalPointHeights getOriginalPointHeights()
    {
        return (nds.display.details.types.OriginalPointHeights)objectChoice;
    }

    public void setOriginalPointHeights(nds.display.details.types.OriginalPointHeights originalPointHeights_)
    {
        objectChoice = originalPointHeights_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof Display3dMeshAttributeValue)
        {
            final Display3dMeshAttributeValue that = (Display3dMeshAttributeValue)obj;

            return
                    ((this.type_ == null) ? that.type_ == null : this.type_.getValue() == that.type_.getValue()) &&
                    (
                        (objectChoice == null && that.objectChoice == null) ||
                        (objectChoice != null && objectChoice.equals(that.objectChoice))
                    );
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, getType());
        if (objectChoice != null)
        {
            switch (getType())
            {
            case ADDITIONAL_3D_FEATURE_CLASS:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.display.details.types.Additional3dFeatureClass)objectChoice);
                break;
            case ORIGINAL_POINT_HEIGHTS:
                result = zserio.runtime.HashCodeUtil.calcHashCode(result, (nds.display.details.types.OriginalPointHeights)objectChoice);
                break;
            default:
                break;
            }
        }

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in) throws java.io.IOException
    {
        switch (getType())
        {
        case ADDITIONAL_3D_FEATURE_CLASS:
            objectChoice = nds.display.details.types.Additional3dFeatureClass.readEnum(in);
            break;
        case ORIGINAL_POINT_HEIGHTS:
            objectChoice = new nds.display.details.types.OriginalPointHeights(in);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice Display3dMeshAttributeValue: " + getType() + "!");
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case ADDITIONAL_3D_FEATURE_CLASS:
            objectChoice = nds.display.details.types.Additional3dFeatureClass.readEnum(zserioContext.getAdditional3dFeatureClass(), in);
            break;
        case ORIGINAL_POINT_HEIGHTS:
            objectChoice = new nds.display.details.types.OriginalPointHeights(zserioContext.getOriginalPointHeights(), in);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice Display3dMeshAttributeValue: " + getType() + "!");
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

        switch (getType())
        {
        case ADDITIONAL_3D_FEATURE_CLASS:
            {
                endBitPosition += getAdditional3dFeatureClass().bitSizeOf(endBitPosition);
            }
            break;
        case ORIGINAL_POINT_HEIGHTS:
            {
                endBitPosition = getOriginalPointHeights().initializeOffsets(endBitPosition);
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice Display3dMeshAttributeValue: " + getType() + "!");
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        switch (getType())
        {
        case ADDITIONAL_3D_FEATURE_CLASS:
            {
                endBitPosition = getAdditional3dFeatureClass().initializeOffsets(zserioContext.getAdditional3dFeatureClass(), endBitPosition);
            }
            break;
        case ORIGINAL_POINT_HEIGHTS:
            {
                endBitPosition = getOriginalPointHeights().initializeOffsets(zserioContext.getOriginalPointHeights(), endBitPosition);
            }
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice Display3dMeshAttributeValue: " + getType() + "!");
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        switch (getType())
        {
        case ADDITIONAL_3D_FEATURE_CLASS:
            getAdditional3dFeatureClass().write(out);
            break;
        case ORIGINAL_POINT_HEIGHTS:
            getOriginalPointHeights().write(out);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice Display3dMeshAttributeValue: " + getType() + "!");
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        switch (getType())
        {
        case ADDITIONAL_3D_FEATURE_CLASS:
            getAdditional3dFeatureClass().write(zserioContext.getAdditional3dFeatureClass(), out);
            break;
        case ORIGINAL_POINT_HEIGHTS:
            getOriginalPointHeights().write(zserioContext.getOriginalPointHeights(), out);
            break;
        default:
            throw new zserio.runtime.ZserioError("No match in choice Display3dMeshAttributeValue: " + getType() + "!");
        }
    }

    public static final int CHOICE_additional3dFeatureClass = 0;
    public static final int CHOICE_originalPointHeights = 1;
    public static final int UNDEFINED_CHOICE = -1;

    private final nds.display.details.attributes.Display3dMeshAttributeType type_;
    private java.lang.Object objectChoice;
}