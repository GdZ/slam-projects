/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.display.layer;

public class IconLayer implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            content_ = new zserio.runtime.array.DeltaContext();
        }

        public zserio.runtime.array.DeltaContext getContent()
        {
            return content_;
        }

        private zserio.runtime.array.DeltaContext content_;
    };

    public IconLayer()
    {
    }

    public IconLayer(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public IconLayer(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public IconLayer(
            nds.display.metadata.IconLayerContent content_,
            nds.core.icons.IconImage[] icons_,
            nds.core.icons.IconSet[] genericIconSets_,
            nds.display.types.GenericIconSetMap[] genericIconSetMap_,
            nds.core.icons.IconSet[] referencedIconSets_,
            nds.core.icons.IconTemplateSet[] iconTemplateSets_)
    {
        setContent(content_);
        setIcons(icons_);
        setGenericIconSets(genericIconSets_);
        setGenericIconSetMap(genericIconSetMap_);
        setReferencedIconSets(referencedIconSets_);
        setIconTemplateSets(iconTemplateSets_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.initPackingContext(zserioContext.getContent());
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

        endBitPosition += content_.bitSizeOf(endBitPosition);
        endBitPosition += icons_.bitSizeOfPacked(endBitPosition);
        if (isGenericIconSetsUsed())
        {
            endBitPosition += genericIconSets_.bitSizeOfPacked(endBitPosition);
        }
        if (isGenericIconSetMapUsed())
        {
            endBitPosition += genericIconSetMap_.bitSizeOf(endBitPosition);
        }
        if (isReferencedIconSetsUsed())
        {
            endBitPosition += referencedIconSets_.bitSizeOfPacked(endBitPosition);
        }
        if (isIconTemplateSetsUsed())
        {
            endBitPosition += iconTemplateSets_.bitSizeOfPacked(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += content_.bitSizeOf(zserioContext.getContent(), endBitPosition);
        endBitPosition += icons_.bitSizeOfPacked(endBitPosition);
        if (isGenericIconSetsUsed())
        {
            endBitPosition += genericIconSets_.bitSizeOfPacked(endBitPosition);
        }
        if (isGenericIconSetMapUsed())
        {
            endBitPosition += genericIconSetMap_.bitSizeOfPacked(endBitPosition);
        }
        if (isReferencedIconSetsUsed())
        {
            endBitPosition += referencedIconSets_.bitSizeOfPacked(endBitPosition);
        }
        if (isIconTemplateSetsUsed())
        {
            endBitPosition += iconTemplateSets_.bitSizeOfPacked(endBitPosition);
        }

        return (int)(endBitPosition - bitPosition);
    }

    public nds.display.metadata.IconLayerContent getContent()
    {
        return content_;
    }

    public void setContent(nds.display.metadata.IconLayerContent content_)
    {
        this.content_ = content_;
    }

    public nds.core.icons.IconImage[] getIcons()
    {
        return (icons_ == null) ? null : icons_.getRawArray();
    }

    public void setIcons(nds.core.icons.IconImage[] icons_)
    {
        this.icons_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.icons.IconImage.class, icons_),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconImage>(new ZserioElementFactory_icons()),
                zserio.runtime.array.ArrayType.AUTO);
    }

    public nds.core.icons.IconSet[] getGenericIconSets()
    {
        return (genericIconSets_ == null) ? null : genericIconSets_.getRawArray();
    }

    public void setGenericIconSets(nds.core.icons.IconSet[] genericIconSets_)
    {
        if (genericIconSets_ == null)
        {
            this.genericIconSets_ = null;
        }
        else
        {
            this.genericIconSets_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.icons.IconSet.class, genericIconSets_),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconSet>(new ZserioElementFactory_genericIconSets()),
                    zserio.runtime.array.ArrayType.AUTO);
        }
    }

    public boolean isGenericIconSetsUsed()
    {
        return ((getContent().and(nds.display.metadata.IconLayerContent.Values.GENERIC_ICON_SETS)).equals(nds.display.metadata.IconLayerContent.Values.GENERIC_ICON_SETS));
    }

    public boolean isGenericIconSetsSet()
    {
        return (genericIconSets_ != null);
    }

    public void resetGenericIconSets()
    {
        this.genericIconSets_ = null;
    }

    public nds.display.types.GenericIconSetMap[] getGenericIconSetMap()
    {
        return (genericIconSetMap_ == null) ? null : genericIconSetMap_.getRawArray();
    }

    public void setGenericIconSetMap(nds.display.types.GenericIconSetMap[] genericIconSetMap_)
    {
        if (genericIconSetMap_ == null)
        {
            this.genericIconSetMap_ = null;
        }
        else
        {
            this.genericIconSetMap_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.types.GenericIconSetMap.class, genericIconSetMap_),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.GenericIconSetMap>(new ZserioElementFactory_genericIconSetMap()),
                    zserio.runtime.array.ArrayType.AUTO);
        }
    }

    public boolean isGenericIconSetMapUsed()
    {
        return ((getContent().and(nds.display.metadata.IconLayerContent.Values.GENERIC_ICON_SETS)).equals(nds.display.metadata.IconLayerContent.Values.GENERIC_ICON_SETS));
    }

    public boolean isGenericIconSetMapSet()
    {
        return (genericIconSetMap_ != null);
    }

    public void resetGenericIconSetMap()
    {
        this.genericIconSetMap_ = null;
    }

    public nds.core.icons.IconSet[] getReferencedIconSets()
    {
        return (referencedIconSets_ == null) ? null : referencedIconSets_.getRawArray();
    }

    public void setReferencedIconSets(nds.core.icons.IconSet[] referencedIconSets_)
    {
        if (referencedIconSets_ == null)
        {
            this.referencedIconSets_ = null;
        }
        else
        {
            this.referencedIconSets_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.icons.IconSet.class, referencedIconSets_),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconSet>(new ZserioElementFactory_referencedIconSets()),
                    zserio.runtime.array.ArrayType.AUTO);
        }
    }

    public boolean isReferencedIconSetsUsed()
    {
        return ((getContent().and(nds.display.metadata.IconLayerContent.Values.REFERENCED_ICON_SETS)).equals(nds.display.metadata.IconLayerContent.Values.REFERENCED_ICON_SETS));
    }

    public boolean isReferencedIconSetsSet()
    {
        return (referencedIconSets_ != null);
    }

    public void resetReferencedIconSets()
    {
        this.referencedIconSets_ = null;
    }

    public nds.core.icons.IconTemplateSet[] getIconTemplateSets()
    {
        return (iconTemplateSets_ == null) ? null : iconTemplateSets_.getRawArray();
    }

    public void setIconTemplateSets(nds.core.icons.IconTemplateSet[] iconTemplateSets_)
    {
        if (iconTemplateSets_ == null)
        {
            this.iconTemplateSets_ = null;
        }
        else
        {
            this.iconTemplateSets_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.icons.IconTemplateSet.class, iconTemplateSets_),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconTemplateSet>(new ZserioElementFactory_iconTemplateSets()),
                    zserio.runtime.array.ArrayType.AUTO);
        }
    }

    public boolean isIconTemplateSetsUsed()
    {
        return ((getContent().and(nds.display.metadata.IconLayerContent.Values.TEMPLATE_ICON_SETS)).equals(nds.display.metadata.IconLayerContent.Values.TEMPLATE_ICON_SETS));
    }

    public boolean isIconTemplateSetsSet()
    {
        return (iconTemplateSets_ != null);
    }

    public void resetIconTemplateSets()
    {
        this.iconTemplateSets_ = null;
    }

    public nds.system.types.LayerType funcGetLayerType()
    {
        return (nds.system.types.LayerType)(nds.system.types.LayerType.GEOMETRY);
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof IconLayer)
        {
            final IconLayer that = (IconLayer)obj;

            return
                    ((content_ == null) ? that.content_ == null : content_.equals(that.content_)) &&
                    ((icons_ == null) ? that.icons_ == null : icons_.equals(that.icons_)) &&
                    ((!isGenericIconSetsUsed()) ? !that.isGenericIconSetsUsed() :
                        ((genericIconSets_ == null) ? that.genericIconSets_ == null : genericIconSets_.equals(that.genericIconSets_))) &&
                    ((!isGenericIconSetMapUsed()) ? !that.isGenericIconSetMapUsed() :
                        ((genericIconSetMap_ == null) ? that.genericIconSetMap_ == null : genericIconSetMap_.equals(that.genericIconSetMap_))) &&
                    ((!isReferencedIconSetsUsed()) ? !that.isReferencedIconSetsUsed() :
                        ((referencedIconSets_ == null) ? that.referencedIconSets_ == null : referencedIconSets_.equals(that.referencedIconSets_))) &&
                    ((!isIconTemplateSetsUsed()) ? !that.isIconTemplateSetsUsed() :
                        ((iconTemplateSets_ == null) ? that.iconTemplateSets_ == null : iconTemplateSets_.equals(that.iconTemplateSets_)));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, content_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, icons_);
        if (isGenericIconSetsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, genericIconSets_);
        if (isGenericIconSetMapUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, genericIconSetMap_);
        if (isReferencedIconSetsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, referencedIconSets_);
        if (isIconTemplateSetsUsed())
            result = zserio.runtime.HashCodeUtil.calcHashCode(result, iconTemplateSets_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        content_ = new nds.display.metadata.IconLayerContent(in);

        icons_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.icons.IconImage.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconImage>(new ZserioElementFactory_icons()),
                zserio.runtime.array.ArrayType.AUTO);
        icons_.readPacked(in);

        if ((getContent().and(nds.display.metadata.IconLayerContent.Values.GENERIC_ICON_SETS)).equals(nds.display.metadata.IconLayerContent.Values.GENERIC_ICON_SETS))
        {
            genericIconSets_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.icons.IconSet.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconSet>(new ZserioElementFactory_genericIconSets()),
                    zserio.runtime.array.ArrayType.AUTO);
            genericIconSets_.readPacked(in);
        }

        if ((getContent().and(nds.display.metadata.IconLayerContent.Values.GENERIC_ICON_SETS)).equals(nds.display.metadata.IconLayerContent.Values.GENERIC_ICON_SETS))
        {
            genericIconSetMap_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.types.GenericIconSetMap.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.GenericIconSetMap>(new ZserioElementFactory_genericIconSetMap()),
                    zserio.runtime.array.ArrayType.AUTO);
            genericIconSetMap_.read(in);
        }

        if ((getContent().and(nds.display.metadata.IconLayerContent.Values.REFERENCED_ICON_SETS)).equals(nds.display.metadata.IconLayerContent.Values.REFERENCED_ICON_SETS))
        {
            referencedIconSets_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.icons.IconSet.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconSet>(new ZserioElementFactory_referencedIconSets()),
                    zserio.runtime.array.ArrayType.AUTO);
            referencedIconSets_.readPacked(in);
        }

        if ((getContent().and(nds.display.metadata.IconLayerContent.Values.TEMPLATE_ICON_SETS)).equals(nds.display.metadata.IconLayerContent.Values.TEMPLATE_ICON_SETS))
        {
            iconTemplateSets_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.icons.IconTemplateSet.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconTemplateSet>(new ZserioElementFactory_iconTemplateSets()),
                    zserio.runtime.array.ArrayType.AUTO);
            iconTemplateSets_.readPacked(in);
        }
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_ = new nds.display.metadata.IconLayerContent(zserioContext.getContent(), in);

        icons_ = new zserio.runtime.array.Array(
                new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.icons.IconImage.class),
                new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconImage>(new ZserioElementFactory_icons()),
                zserio.runtime.array.ArrayType.AUTO);
        icons_.readPacked(in);

        if ((getContent().and(nds.display.metadata.IconLayerContent.Values.GENERIC_ICON_SETS)).equals(nds.display.metadata.IconLayerContent.Values.GENERIC_ICON_SETS))
        {
            genericIconSets_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.icons.IconSet.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconSet>(new ZserioElementFactory_genericIconSets()),
                    zserio.runtime.array.ArrayType.AUTO);
            genericIconSets_.readPacked(in);
        }

        if ((getContent().and(nds.display.metadata.IconLayerContent.Values.GENERIC_ICON_SETS)).equals(nds.display.metadata.IconLayerContent.Values.GENERIC_ICON_SETS))
        {
            genericIconSetMap_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.display.types.GenericIconSetMap.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.display.types.GenericIconSetMap>(new ZserioElementFactory_genericIconSetMap()),
                    zserio.runtime.array.ArrayType.AUTO);
            genericIconSetMap_.readPacked(in);
        }

        if ((getContent().and(nds.display.metadata.IconLayerContent.Values.REFERENCED_ICON_SETS)).equals(nds.display.metadata.IconLayerContent.Values.REFERENCED_ICON_SETS))
        {
            referencedIconSets_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.icons.IconSet.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconSet>(new ZserioElementFactory_referencedIconSets()),
                    zserio.runtime.array.ArrayType.AUTO);
            referencedIconSets_.readPacked(in);
        }

        if ((getContent().and(nds.display.metadata.IconLayerContent.Values.TEMPLATE_ICON_SETS)).equals(nds.display.metadata.IconLayerContent.Values.TEMPLATE_ICON_SETS))
        {
            iconTemplateSets_ = new zserio.runtime.array.Array(
                    new zserio.runtime.array.RawArray.ObjectRawArray<>(nds.core.icons.IconTemplateSet.class),
                    new zserio.runtime.array.ArrayTraits.WritePackableObjectArrayTraits<nds.core.icons.IconTemplateSet>(new ZserioElementFactory_iconTemplateSets()),
                    zserio.runtime.array.ArrayType.AUTO);
            iconTemplateSets_.readPacked(in);
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

        endBitPosition += content_.bitSizeOf(endBitPosition);
        endBitPosition = icons_.initializeOffsetsPacked(endBitPosition);
        if (isGenericIconSetsUsed())
        {
            endBitPosition = genericIconSets_.initializeOffsetsPacked(endBitPosition);
        }
        if (isGenericIconSetMapUsed())
        {
            endBitPosition = genericIconSetMap_.initializeOffsets(endBitPosition);
        }
        if (isReferencedIconSetsUsed())
        {
            endBitPosition = referencedIconSets_.initializeOffsetsPacked(endBitPosition);
        }
        if (isIconTemplateSetsUsed())
        {
            endBitPosition = iconTemplateSets_.initializeOffsetsPacked(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = content_.initializeOffsets(zserioContext.getContent(), endBitPosition);
        endBitPosition = icons_.initializeOffsetsPacked(endBitPosition);
        if (isGenericIconSetsUsed())
        {
            endBitPosition = genericIconSets_.initializeOffsetsPacked(endBitPosition);
        }
        if (isGenericIconSetMapUsed())
        {
            endBitPosition = genericIconSetMap_.initializeOffsetsPacked(endBitPosition);
        }
        if (isReferencedIconSetsUsed())
        {
            endBitPosition = referencedIconSets_.initializeOffsetsPacked(endBitPosition);
        }
        if (isIconTemplateSetsUsed())
        {
            endBitPosition = iconTemplateSets_.initializeOffsetsPacked(endBitPosition);
        }

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        content_.write(out);

        icons_.writePacked(out);

        if (isGenericIconSetsUsed())
        {
            genericIconSets_.writePacked(out);
        }

        if (isGenericIconSetMapUsed())
        {
            genericIconSetMap_.write(out);
        }

        if (isReferencedIconSetsUsed())
        {
            referencedIconSets_.writePacked(out);
        }

        if (isIconTemplateSetsUsed())
        {
            iconTemplateSets_.writePacked(out);
        }
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        content_.write(zserioContext.getContent(), out);

        icons_.writePacked(out);

        if (isGenericIconSetsUsed())
        {
            genericIconSets_.writePacked(out);
        }

        if (isGenericIconSetMapUsed())
        {
            genericIconSetMap_.writePacked(out);
        }

        if (isReferencedIconSetsUsed())
        {
            referencedIconSets_.writePacked(out);
        }

        if (isIconTemplateSetsUsed())
        {
            iconTemplateSets_.writePacked(out);
        }
    }

    private static final class ZserioElementFactory_icons implements zserio.runtime.array.PackableElementFactory<nds.core.icons.IconImage>
    {
        @Override
        public nds.core.icons.IconImage create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.icons.IconImage(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.icons.IconImage.ZserioPackingContext();
        }

        @Override
        public nds.core.icons.IconImage create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.icons.IconImage(context, in);
        }
    }

    private static final class ZserioElementFactory_genericIconSets implements zserio.runtime.array.PackableElementFactory<nds.core.icons.IconSet>
    {
        @Override
        public nds.core.icons.IconSet create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.icons.IconSet(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.icons.IconSet.ZserioPackingContext();
        }

        @Override
        public nds.core.icons.IconSet create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.icons.IconSet(context, in);
        }
    }

    private static final class ZserioElementFactory_genericIconSetMap implements zserio.runtime.array.PackableElementFactory<nds.display.types.GenericIconSetMap>
    {
        @Override
        public nds.display.types.GenericIconSetMap create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.display.types.GenericIconSetMap(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.display.types.GenericIconSetMap.ZserioPackingContext();
        }

        @Override
        public nds.display.types.GenericIconSetMap create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.display.types.GenericIconSetMap(context, in);
        }
    }

    private static final class ZserioElementFactory_referencedIconSets implements zserio.runtime.array.PackableElementFactory<nds.core.icons.IconSet>
    {
        @Override
        public nds.core.icons.IconSet create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.icons.IconSet(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.icons.IconSet.ZserioPackingContext();
        }

        @Override
        public nds.core.icons.IconSet create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.icons.IconSet(context, in);
        }
    }

    private static final class ZserioElementFactory_iconTemplateSets implements zserio.runtime.array.PackableElementFactory<nds.core.icons.IconTemplateSet>
    {
        @Override
        public nds.core.icons.IconTemplateSet create(zserio.runtime.io.BitStreamReader in, int index)
                throws java.io.IOException
        {
            return new nds.core.icons.IconTemplateSet(in);
        }

        @Override
        public zserio.runtime.array.PackingContext createPackingContext()
        {
            return new nds.core.icons.IconTemplateSet.ZserioPackingContext();
        }

        @Override
        public nds.core.icons.IconTemplateSet create(zserio.runtime.array.PackingContext context,
                zserio.runtime.io.BitStreamReader in, int index) throws java.io.IOException
        {
            return new nds.core.icons.IconTemplateSet(context, in);
        }
    }

    private nds.display.metadata.IconLayerContent content_;
    private zserio.runtime.array.Array icons_;
    private zserio.runtime.array.Array genericIconSets_;
    private zserio.runtime.array.Array genericIconSetMap_;
    private zserio.runtime.array.Array referencedIconSets_;
    private zserio.runtime.array.Array iconTemplateSets_;
}