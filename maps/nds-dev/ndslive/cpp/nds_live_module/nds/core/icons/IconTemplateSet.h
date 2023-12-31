/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_ICONS_ICON_TEMPLATE_SET_H
#define NDS_CORE_ICONS_ICON_TEMPLATE_SET_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <zserio/Traits.h>
#include <zserio/BitStreamReader.h>
#include <zserio/BitStreamWriter.h>
#include <zserio/AllocatorPropagatingCopy.h>
#include <zserio/DeltaContext.h>
#include <memory>
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Types.h>
#include <zserio/Vector.h>

#include <nds/core/icons/IconId.h>
#include <nds/core/icons/IconTemplateSetId.h>
#include <nds/core/icons/IconUsageType.h>
#include <nds/core/icons/ImageAnchorPos.h>

namespace nds
{
namespace core
{
namespace icons
{

class IconTemplateSet
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getTemplateSetId()
        {
            return m_templateSetId_;
        }

        ::zserio::DeltaContext& getNumIcons()
        {
            return m_numIcons_;
        }

    private:
        ::zserio::DeltaContext m_templateSetId_;
        ::zserio::DeltaContext m_numIcons_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    IconTemplateSet() noexcept :
            IconTemplateSet(allocator_type())
    {}

    explicit IconTemplateSet(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_usageType = ::zserio::vector<::nds::core::icons::IconUsageType>,
            typename ZSERIO_T_drawingLayer = ::zserio::vector<int8_t>,
            typename ZSERIO_T_templateConnectionPoint = ::zserio::vector<::nds::core::icons::ImageAnchorPos>,
            typename ZSERIO_T_iconId = ::zserio::vector<::nds::core::icons::IconId>>
    IconTemplateSet(
            ::nds::core::icons::IconTemplateSetId templateSetId_,
            uint32_t numIcons_,
            ZSERIO_T_usageType&& usageType_,
            ZSERIO_T_drawingLayer&& drawingLayer_,
            ZSERIO_T_templateConnectionPoint&& templateConnectionPoint_,
            ZSERIO_T_iconId&& iconId_,
            const allocator_type& allocator = allocator_type()) :
            IconTemplateSet(allocator)
    {
        m_templateSetId_ = templateSetId_;
        m_numIcons_ = numIcons_;
        m_usageType_ = ZserioArrayType_usageType(::std::forward<ZSERIO_T_usageType>(usageType_));
        m_drawingLayer_ = ZserioArrayType_drawingLayer(::std::forward<ZSERIO_T_drawingLayer>(drawingLayer_));
        m_templateConnectionPoint_ = ZserioArrayType_templateConnectionPoint(::std::forward<ZSERIO_T_templateConnectionPoint>(templateConnectionPoint_));
        m_iconId_ = ZserioArrayType_iconId(::std::forward<ZSERIO_T_iconId>(iconId_));
    }

    explicit IconTemplateSet(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit IconTemplateSet(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~IconTemplateSet() = default;

    IconTemplateSet(const IconTemplateSet&) = default;
    IconTemplateSet& operator=(const IconTemplateSet&) = default;

    IconTemplateSet(IconTemplateSet&&) = default;
    IconTemplateSet& operator=(IconTemplateSet&&) = default;

    IconTemplateSet(::zserio::PropagateAllocatorT,
            const IconTemplateSet& other, const allocator_type& allocator);

    ::nds::core::icons::IconTemplateSetId getTemplateSetId() const;
    void setTemplateSetId(::nds::core::icons::IconTemplateSetId templateSetId_);

    uint32_t getNumIcons() const;
    void setNumIcons(uint32_t numIcons_);

    const ::zserio::vector<::nds::core::icons::IconUsageType>& getUsageType() const;
    ::zserio::vector<::nds::core::icons::IconUsageType>& getUsageType();
    void setUsageType(const ::zserio::vector<::nds::core::icons::IconUsageType>& usageType_);
    void setUsageType(::zserio::vector<::nds::core::icons::IconUsageType>&& usageType_);

    const ::zserio::vector<int8_t>& getDrawingLayer() const;
    ::zserio::vector<int8_t>& getDrawingLayer();
    void setDrawingLayer(const ::zserio::vector<int8_t>& drawingLayer_);
    void setDrawingLayer(::zserio::vector<int8_t>&& drawingLayer_);

    const ::zserio::vector<::nds::core::icons::ImageAnchorPos>& getTemplateConnectionPoint() const;
    ::zserio::vector<::nds::core::icons::ImageAnchorPos>& getTemplateConnectionPoint();
    void setTemplateConnectionPoint(const ::zserio::vector<::nds::core::icons::ImageAnchorPos>& templateConnectionPoint_);
    void setTemplateConnectionPoint(::zserio::vector<::nds::core::icons::ImageAnchorPos>&& templateConnectionPoint_);

    const ::zserio::vector<::nds::core::icons::IconId>& getIconId() const;
    ::zserio::vector<::nds::core::icons::IconId>& getIconId();
    void setIconId(const ::zserio::vector<::nds::core::icons::IconId>& iconId_);
    void setIconId(::zserio::vector<::nds::core::icons::IconId>&& iconId_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const IconTemplateSet& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_templateConnectionPoint
    {
    public:
        using OwnerType = IconTemplateSet;

        static void create(IconTemplateSet& owner,
                ::zserio::vector<::nds::core::icons::ImageAnchorPos>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(IconTemplateSet& owner,
                ::zserio::vector<::nds::core::icons::ImageAnchorPos>& array,
                ::nds::core::icons::ImageAnchorPos::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_usageType = ::zserio::Array<::zserio::vector<::nds::core::icons::IconUsageType>, ::zserio::BitmaskArrayTraits<::nds::core::icons::IconUsageType>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_drawingLayer = ::zserio::Array<::zserio::vector<int8_t>, ::zserio::StdIntArrayTraits<int8_t>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_templateConnectionPoint = ::zserio::Array<::zserio::vector<::nds::core::icons::ImageAnchorPos>, ::zserio::ObjectArrayTraits<::nds::core::icons::ImageAnchorPos, ZserioElementFactory_templateConnectionPoint>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_iconId = ::zserio::Array<::zserio::vector<::nds::core::icons::IconId>, ::zserio::VarIntNNArrayTraits<::nds::core::icons::IconId>, ::zserio::ArrayType::NORMAL>;

    ::nds::core::icons::IconTemplateSetId readTemplateSetId(::zserio::BitStreamReader& in);
    ::nds::core::icons::IconTemplateSetId readTemplateSetId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    uint32_t readNumIcons(::zserio::BitStreamReader& in);
    uint32_t readNumIcons(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_usageType readUsageType(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_usageType readUsageType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_drawingLayer readDrawingLayer(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_drawingLayer readDrawingLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_templateConnectionPoint readTemplateConnectionPoint(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_templateConnectionPoint readTemplateConnectionPoint(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_iconId readIconId(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_iconId readIconId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::icons::IconTemplateSetId m_templateSetId_;
    uint32_t m_numIcons_;
    ZserioArrayType_usageType m_usageType_;
    ZserioArrayType_drawingLayer m_drawingLayer_;
    ZserioArrayType_templateConnectionPoint m_templateConnectionPoint_;
    ZserioArrayType_iconId m_iconId_;
};

} // namespace icons
} // namespace core
} // namespace nds

#endif // NDS_CORE_ICONS_ICON_TEMPLATE_SET_H
