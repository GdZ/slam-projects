/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_METADATA_LANE_NAME_LAYER_METADATA_H
#define NDS_NAME_METADATA_LANE_NAME_LAYER_METADATA_H

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
#include <zserio/ArrayTraits.h>

#include <nds/core/language/AvailableLanguages.h>
#include <nds/name/instantiations/NameLanePositionAttributeMetadata.h>
#include <nds/name/instantiations/NameLaneRangeAttributeMetadata.h>
#include <nds/name/metadata/LaneNameLayerContent.h>

namespace nds
{
namespace name
{
namespace metadata
{

class LaneNameLayerMetadata
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::nds::name::instantiations::NameLaneRangeAttributeMetadata::ZserioPackingContext& getLaneRangeAttributeMetadata()
        {
            return m_laneRangeAttributeMetadata_;
        }

        ::nds::name::instantiations::NameLanePositionAttributeMetadata::ZserioPackingContext& getLanePositionAttributeMetadata()
        {
            return m_lanePositionAttributeMetadata_;
        }

        ::nds::core::language::AvailableLanguages::ZserioPackingContext& getAvailableLanguages()
        {
            return m_availableLanguages_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::nds::name::instantiations::NameLaneRangeAttributeMetadata::ZserioPackingContext m_laneRangeAttributeMetadata_;
        ::nds::name::instantiations::NameLanePositionAttributeMetadata::ZserioPackingContext m_lanePositionAttributeMetadata_;
        ::nds::core::language::AvailableLanguages::ZserioPackingContext m_availableLanguages_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LaneNameLayerMetadata() noexcept :
            LaneNameLayerMetadata(allocator_type())
    {}

    explicit LaneNameLayerMetadata(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_laneRangeAttributeMetadata = ::nds::name::instantiations::NameLaneRangeAttributeMetadata,
            typename ZSERIO_T_lanePositionAttributeMetadata = ::nds::name::instantiations::NameLanePositionAttributeMetadata,
            typename ZSERIO_T_availableLanguages = ::nds::core::language::AvailableLanguages>
    LaneNameLayerMetadata(
            ::nds::name::metadata::LaneNameLayerContent content_,
            ZSERIO_T_laneRangeAttributeMetadata&& laneRangeAttributeMetadata_,
            ZSERIO_T_lanePositionAttributeMetadata&& lanePositionAttributeMetadata_,
            ZSERIO_T_availableLanguages&& availableLanguages_,
            const allocator_type& allocator = allocator_type()) :
            LaneNameLayerMetadata(allocator)
    {
        m_content_ = content_;
        m_laneRangeAttributeMetadata_ = ::std::forward<ZSERIO_T_laneRangeAttributeMetadata>(laneRangeAttributeMetadata_);
        m_lanePositionAttributeMetadata_ = ::std::forward<ZSERIO_T_lanePositionAttributeMetadata>(lanePositionAttributeMetadata_);
        m_availableLanguages_ = ::std::forward<ZSERIO_T_availableLanguages>(availableLanguages_);
    }

    explicit LaneNameLayerMetadata(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit LaneNameLayerMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~LaneNameLayerMetadata() = default;

    LaneNameLayerMetadata(const LaneNameLayerMetadata&) = default;
    LaneNameLayerMetadata& operator=(const LaneNameLayerMetadata&) = default;

    LaneNameLayerMetadata(LaneNameLayerMetadata&&) = default;
    LaneNameLayerMetadata& operator=(LaneNameLayerMetadata&&) = default;

    LaneNameLayerMetadata(::zserio::PropagateAllocatorT,
            const LaneNameLayerMetadata& other, const allocator_type& allocator);

    ::nds::name::metadata::LaneNameLayerContent getContent() const;
    void setContent(::nds::name::metadata::LaneNameLayerContent content_);

    const ::nds::name::instantiations::NameLaneRangeAttributeMetadata& getLaneRangeAttributeMetadata() const;
    ::nds::name::instantiations::NameLaneRangeAttributeMetadata& getLaneRangeAttributeMetadata();
    void setLaneRangeAttributeMetadata(const ::nds::name::instantiations::NameLaneRangeAttributeMetadata& laneRangeAttributeMetadata_);
    void setLaneRangeAttributeMetadata(::nds::name::instantiations::NameLaneRangeAttributeMetadata&& laneRangeAttributeMetadata_);
    bool isLaneRangeAttributeMetadataUsed() const;
    bool isLaneRangeAttributeMetadataSet() const;
    void resetLaneRangeAttributeMetadata();

    const ::nds::name::instantiations::NameLanePositionAttributeMetadata& getLanePositionAttributeMetadata() const;
    ::nds::name::instantiations::NameLanePositionAttributeMetadata& getLanePositionAttributeMetadata();
    void setLanePositionAttributeMetadata(const ::nds::name::instantiations::NameLanePositionAttributeMetadata& lanePositionAttributeMetadata_);
    void setLanePositionAttributeMetadata(::nds::name::instantiations::NameLanePositionAttributeMetadata&& lanePositionAttributeMetadata_);
    bool isLanePositionAttributeMetadataUsed() const;
    bool isLanePositionAttributeMetadataSet() const;
    void resetLanePositionAttributeMetadata();

    const ::nds::core::language::AvailableLanguages& getAvailableLanguages() const;
    ::nds::core::language::AvailableLanguages& getAvailableLanguages();
    void setAvailableLanguages(const ::nds::core::language::AvailableLanguages& availableLanguages_);
    void setAvailableLanguages(::nds::core::language::AvailableLanguages&& availableLanguages_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LaneNameLayerMetadata& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::name::metadata::LaneNameLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::name::metadata::LaneNameLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameLaneRangeAttributeMetadata> readLaneRangeAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameLaneRangeAttributeMetadata> readLaneRangeAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameLanePositionAttributeMetadata> readLanePositionAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameLanePositionAttributeMetadata> readLanePositionAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::language::AvailableLanguages readAvailableLanguages(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::language::AvailableLanguages readAvailableLanguages(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::name::metadata::LaneNameLayerContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameLaneRangeAttributeMetadata> m_laneRangeAttributeMetadata_;
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameLanePositionAttributeMetadata> m_lanePositionAttributeMetadata_;
    ::nds::core::language::AvailableLanguages m_availableLanguages_;
};

} // namespace metadata
} // namespace name
} // namespace nds

#endif // NDS_NAME_METADATA_LANE_NAME_LAYER_METADATA_H
