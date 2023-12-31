/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_ICONS_ICON_SET_H
#define NDS_CORE_ICONS_ICON_SET_H

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
#include <zserio/OptionalHolder.h>
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Types.h>
#include <zserio/Vector.h>

#include <nds/core/icons/IconDisplayArrangements.h>
#include <nds/core/icons/IconDrawingPriority.h>
#include <nds/core/icons/IconId.h>
#include <nds/core/icons/IconSetId.h>
#include <nds/core/icons/IconTemplateSetId.h>
#include <nds/core/icons/IconUsageType.h>
#include <nds/core/types/ScaleRangeId.h>

namespace nds
{
namespace core
{
namespace icons
{

class IconSet
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getIconSetId()
        {
            return m_iconSetId_;
        }

        ::zserio::DeltaContext& getScaleRangeId()
        {
            return m_scaleRangeId_;
        }

        ::zserio::DeltaContext& getNumIcons()
        {
            return m_numIcons_;
        }

        ::zserio::DeltaContext& getIconDrawingPriority()
        {
            return m_iconDrawingPriority_;
        }

        ::zserio::DeltaContext& getIconTemplateSetId()
        {
            return m_iconTemplateSetId_;
        }

    private:
        ::zserio::DeltaContext m_iconSetId_;
        ::zserio::DeltaContext m_scaleRangeId_;
        ::zserio::DeltaContext m_numIcons_;
        ::zserio::DeltaContext m_iconDrawingPriority_;
        ::zserio::DeltaContext m_iconTemplateSetId_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    IconSet() noexcept :
            IconSet(allocator_type())
    {}

    explicit IconSet(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_iconUsage = ::zserio::vector<::nds::core::icons::IconUsageType>,
            typename ZSERIO_T_iconId = ::zserio::vector<::nds::core::icons::IconId>,
            typename ZSERIO_T_iconDisplayArrangement = ::zserio::vector<::nds::core::icons::IconDisplayArrangements>,
            typename ZSERIO_T_iconTemplateSetId = ::nds::core::icons::IconTemplateSetId>
    IconSet(
            ::nds::core::icons::IconSetId iconSetId_,
            ::nds::core::types::ScaleRangeId scaleRangeId_,
            uint32_t numIcons_,
            ZSERIO_T_iconUsage&& iconUsage_,
            ZSERIO_T_iconId&& iconId_,
            ZSERIO_T_iconDisplayArrangement&& iconDisplayArrangement_,
            ::nds::core::icons::IconDrawingPriority iconDrawingPriority_,
            ZSERIO_T_iconTemplateSetId&& iconTemplateSetId_,
            const allocator_type& allocator = allocator_type()) :
            IconSet(allocator)
    {
        m_iconSetId_ = iconSetId_;
        m_scaleRangeId_ = scaleRangeId_;
        m_numIcons_ = numIcons_;
        m_iconUsage_ = ZserioArrayType_iconUsage(::std::forward<ZSERIO_T_iconUsage>(iconUsage_));
        m_iconId_ = ZserioArrayType_iconId(::std::forward<ZSERIO_T_iconId>(iconId_));
        m_iconDisplayArrangement_ = ZserioArrayType_iconDisplayArrangement(::std::forward<ZSERIO_T_iconDisplayArrangement>(iconDisplayArrangement_));
        m_iconDrawingPriority_ = iconDrawingPriority_;
        m_iconTemplateSetId_ = ::std::forward<ZSERIO_T_iconTemplateSetId>(iconTemplateSetId_);
    }

    explicit IconSet(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit IconSet(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~IconSet() = default;

    IconSet(const IconSet&) = default;
    IconSet& operator=(const IconSet&) = default;

    IconSet(IconSet&&) = default;
    IconSet& operator=(IconSet&&) = default;

    IconSet(::zserio::PropagateAllocatorT,
            const IconSet& other, const allocator_type& allocator);

    ::nds::core::icons::IconSetId getIconSetId() const;
    void setIconSetId(::nds::core::icons::IconSetId iconSetId_);

    ::nds::core::types::ScaleRangeId getScaleRangeId() const;
    void setScaleRangeId(::nds::core::types::ScaleRangeId scaleRangeId_);

    uint32_t getNumIcons() const;
    void setNumIcons(uint32_t numIcons_);

    const ::zserio::vector<::nds::core::icons::IconUsageType>& getIconUsage() const;
    ::zserio::vector<::nds::core::icons::IconUsageType>& getIconUsage();
    void setIconUsage(const ::zserio::vector<::nds::core::icons::IconUsageType>& iconUsage_);
    void setIconUsage(::zserio::vector<::nds::core::icons::IconUsageType>&& iconUsage_);

    const ::zserio::vector<::nds::core::icons::IconId>& getIconId() const;
    ::zserio::vector<::nds::core::icons::IconId>& getIconId();
    void setIconId(const ::zserio::vector<::nds::core::icons::IconId>& iconId_);
    void setIconId(::zserio::vector<::nds::core::icons::IconId>&& iconId_);

    const ::zserio::vector<::nds::core::icons::IconDisplayArrangements>& getIconDisplayArrangement() const;
    ::zserio::vector<::nds::core::icons::IconDisplayArrangements>& getIconDisplayArrangement();
    void setIconDisplayArrangement(const ::zserio::vector<::nds::core::icons::IconDisplayArrangements>& iconDisplayArrangement_);
    void setIconDisplayArrangement(::zserio::vector<::nds::core::icons::IconDisplayArrangements>&& iconDisplayArrangement_);

    ::nds::core::icons::IconDrawingPriority getIconDrawingPriority() const;
    void setIconDrawingPriority(::nds::core::icons::IconDrawingPriority iconDrawingPriority_);

    ::nds::core::icons::IconTemplateSetId getIconTemplateSetId() const;
    void setIconTemplateSetId(::nds::core::icons::IconTemplateSetId iconTemplateSetId_);
    bool isIconTemplateSetIdUsed() const;
    bool isIconTemplateSetIdSet() const;
    void resetIconTemplateSetId();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const IconSet& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    using ZserioArrayType_iconUsage = ::zserio::Array<::zserio::vector<::nds::core::icons::IconUsageType>, ::zserio::BitmaskArrayTraits<::nds::core::icons::IconUsageType>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_iconId = ::zserio::Array<::zserio::vector<::nds::core::icons::IconId>, ::zserio::VarIntNNArrayTraits<::nds::core::icons::IconId>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_iconDisplayArrangement = ::zserio::Array<::zserio::vector<::nds::core::icons::IconDisplayArrangements>, ::zserio::EnumArrayTraits<::nds::core::icons::IconDisplayArrangements>, ::zserio::ArrayType::NORMAL>;

    ::nds::core::icons::IconSetId readIconSetId(::zserio::BitStreamReader& in);
    ::nds::core::icons::IconSetId readIconSetId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::types::ScaleRangeId readScaleRangeId(::zserio::BitStreamReader& in);
    ::nds::core::types::ScaleRangeId readScaleRangeId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    uint32_t readNumIcons(::zserio::BitStreamReader& in);
    uint32_t readNumIcons(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_iconUsage readIconUsage(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_iconUsage readIconUsage(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_iconId readIconId(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_iconId readIconId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_iconDisplayArrangement readIconDisplayArrangement(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_iconDisplayArrangement readIconDisplayArrangement(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::icons::IconDrawingPriority readIconDrawingPriority(::zserio::BitStreamReader& in);
    ::nds::core::icons::IconDrawingPriority readIconDrawingPriority(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::icons::IconTemplateSetId> readIconTemplateSetId(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::icons::IconTemplateSetId> readIconTemplateSetId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::core::icons::IconSetId m_iconSetId_;
    ::nds::core::types::ScaleRangeId m_scaleRangeId_;
    uint32_t m_numIcons_;
    ZserioArrayType_iconUsage m_iconUsage_;
    ZserioArrayType_iconId m_iconId_;
    ZserioArrayType_iconDisplayArrangement m_iconDisplayArrangement_;
    ::nds::core::icons::IconDrawingPriority m_iconDrawingPriority_;
    ::zserio::InplaceOptionalHolder<::nds::core::icons::IconTemplateSetId> m_iconTemplateSetId_;
};

} // namespace icons
} // namespace core
} // namespace nds

#endif // NDS_CORE_ICONS_ICON_SET_H
