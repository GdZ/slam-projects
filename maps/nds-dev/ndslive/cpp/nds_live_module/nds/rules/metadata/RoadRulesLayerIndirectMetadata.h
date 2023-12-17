/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_METADATA_ROAD_RULES_LAYER_INDIRECT_METADATA_H
#define NDS_RULES_METADATA_ROAD_RULES_LAYER_INDIRECT_METADATA_H

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
#include <zserio/Vector.h>

#include <nds/core/language/AvailableLanguages.h>
#include <nds/core/types/RoadType.h>
#include <nds/rules/instantiations/RulesRoadPositionAttributeMetadata.h>
#include <nds/rules/instantiations/RulesRoadRangeAttributeMetadata.h>
#include <nds/rules/instantiations/RulesTransitionAttributeMetadata.h>
#include <nds/rules/metadata/RoadRulesLayerContent.h>

namespace nds
{
namespace rules
{
namespace metadata
{

class RoadRulesLayerIndirectMetadata
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::nds::rules::instantiations::RulesRoadRangeAttributeMetadata::ZserioPackingContext& getRoadRangeAttributeMetadata()
        {
            return m_roadRangeAttributeMetadata_;
        }

        ::nds::rules::instantiations::RulesRoadPositionAttributeMetadata::ZserioPackingContext& getRoadPositionAttributeMetadata()
        {
            return m_roadPositionAttributeMetadata_;
        }

        ::nds::rules::instantiations::RulesTransitionAttributeMetadata::ZserioPackingContext& getTransitionAttributeMetadata()
        {
            return m_transitionAttributeMetadata_;
        }

        ::nds::core::language::AvailableLanguages::ZserioPackingContext& getAvailableLanguages()
        {
            return m_availableLanguages_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::nds::rules::instantiations::RulesRoadRangeAttributeMetadata::ZserioPackingContext m_roadRangeAttributeMetadata_;
        ::nds::rules::instantiations::RulesRoadPositionAttributeMetadata::ZserioPackingContext m_roadPositionAttributeMetadata_;
        ::nds::rules::instantiations::RulesTransitionAttributeMetadata::ZserioPackingContext m_transitionAttributeMetadata_;
        ::nds::core::language::AvailableLanguages::ZserioPackingContext m_availableLanguages_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoadRulesLayerIndirectMetadata() noexcept :
            RoadRulesLayerIndirectMetadata(allocator_type())
    {}

    explicit RoadRulesLayerIndirectMetadata(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_roadRangeAttributeMetadata = ::nds::rules::instantiations::RulesRoadRangeAttributeMetadata,
            typename ZSERIO_T_roadPositionAttributeMetadata = ::nds::rules::instantiations::RulesRoadPositionAttributeMetadata,
            typename ZSERIO_T_transitionAttributeMetadata = ::nds::rules::instantiations::RulesTransitionAttributeMetadata,
            typename ZSERIO_T_coveredRoadTypes = ::zserio::vector<::nds::core::types::RoadType>,
            typename ZSERIO_T_availableLanguages = ::nds::core::language::AvailableLanguages>
    RoadRulesLayerIndirectMetadata(
            ::nds::rules::metadata::RoadRulesLayerContent content_,
            ZSERIO_T_roadRangeAttributeMetadata&& roadRangeAttributeMetadata_,
            ZSERIO_T_roadPositionAttributeMetadata&& roadPositionAttributeMetadata_,
            ZSERIO_T_transitionAttributeMetadata&& transitionAttributeMetadata_,
            ZSERIO_T_coveredRoadTypes&& coveredRoadTypes_,
            ZSERIO_T_availableLanguages&& availableLanguages_,
            const allocator_type& allocator = allocator_type()) :
            RoadRulesLayerIndirectMetadata(allocator)
    {
        m_content_ = content_;
        m_roadRangeAttributeMetadata_ = ::std::forward<ZSERIO_T_roadRangeAttributeMetadata>(roadRangeAttributeMetadata_);
        m_roadPositionAttributeMetadata_ = ::std::forward<ZSERIO_T_roadPositionAttributeMetadata>(roadPositionAttributeMetadata_);
        m_transitionAttributeMetadata_ = ::std::forward<ZSERIO_T_transitionAttributeMetadata>(transitionAttributeMetadata_);
        m_coveredRoadTypes_ = ZserioArrayType_coveredRoadTypes(::std::forward<ZSERIO_T_coveredRoadTypes>(coveredRoadTypes_));
        m_availableLanguages_ = ::std::forward<ZSERIO_T_availableLanguages>(availableLanguages_);
    }

    explicit RoadRulesLayerIndirectMetadata(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RoadRulesLayerIndirectMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RoadRulesLayerIndirectMetadata() = default;

    RoadRulesLayerIndirectMetadata(const RoadRulesLayerIndirectMetadata&) = default;
    RoadRulesLayerIndirectMetadata& operator=(const RoadRulesLayerIndirectMetadata&) = default;

    RoadRulesLayerIndirectMetadata(RoadRulesLayerIndirectMetadata&&) = default;
    RoadRulesLayerIndirectMetadata& operator=(RoadRulesLayerIndirectMetadata&&) = default;

    RoadRulesLayerIndirectMetadata(::zserio::PropagateAllocatorT,
            const RoadRulesLayerIndirectMetadata& other, const allocator_type& allocator);

    ::nds::rules::metadata::RoadRulesLayerContent getContent() const;
    void setContent(::nds::rules::metadata::RoadRulesLayerContent content_);

    const ::nds::rules::instantiations::RulesRoadRangeAttributeMetadata& getRoadRangeAttributeMetadata() const;
    ::nds::rules::instantiations::RulesRoadRangeAttributeMetadata& getRoadRangeAttributeMetadata();
    void setRoadRangeAttributeMetadata(const ::nds::rules::instantiations::RulesRoadRangeAttributeMetadata& roadRangeAttributeMetadata_);
    void setRoadRangeAttributeMetadata(::nds::rules::instantiations::RulesRoadRangeAttributeMetadata&& roadRangeAttributeMetadata_);
    bool isRoadRangeAttributeMetadataUsed() const;
    bool isRoadRangeAttributeMetadataSet() const;
    void resetRoadRangeAttributeMetadata();

    const ::nds::rules::instantiations::RulesRoadPositionAttributeMetadata& getRoadPositionAttributeMetadata() const;
    ::nds::rules::instantiations::RulesRoadPositionAttributeMetadata& getRoadPositionAttributeMetadata();
    void setRoadPositionAttributeMetadata(const ::nds::rules::instantiations::RulesRoadPositionAttributeMetadata& roadPositionAttributeMetadata_);
    void setRoadPositionAttributeMetadata(::nds::rules::instantiations::RulesRoadPositionAttributeMetadata&& roadPositionAttributeMetadata_);
    bool isRoadPositionAttributeMetadataUsed() const;
    bool isRoadPositionAttributeMetadataSet() const;
    void resetRoadPositionAttributeMetadata();

    const ::nds::rules::instantiations::RulesTransitionAttributeMetadata& getTransitionAttributeMetadata() const;
    ::nds::rules::instantiations::RulesTransitionAttributeMetadata& getTransitionAttributeMetadata();
    void setTransitionAttributeMetadata(const ::nds::rules::instantiations::RulesTransitionAttributeMetadata& transitionAttributeMetadata_);
    void setTransitionAttributeMetadata(::nds::rules::instantiations::RulesTransitionAttributeMetadata&& transitionAttributeMetadata_);
    bool isTransitionAttributeMetadataUsed() const;
    bool isTransitionAttributeMetadataSet() const;
    void resetTransitionAttributeMetadata();

    const ::zserio::vector<::nds::core::types::RoadType>& getCoveredRoadTypes() const;
    ::zserio::vector<::nds::core::types::RoadType>& getCoveredRoadTypes();
    void setCoveredRoadTypes(const ::zserio::vector<::nds::core::types::RoadType>& coveredRoadTypes_);
    void setCoveredRoadTypes(::zserio::vector<::nds::core::types::RoadType>&& coveredRoadTypes_);

    const ::nds::core::language::AvailableLanguages& getAvailableLanguages() const;
    ::nds::core::language::AvailableLanguages& getAvailableLanguages();
    void setAvailableLanguages(const ::nds::core::language::AvailableLanguages& availableLanguages_);
    void setAvailableLanguages(::nds::core::language::AvailableLanguages&& availableLanguages_);
    bool isAvailableLanguagesUsed() const;
    bool isAvailableLanguagesSet() const;
    void resetAvailableLanguages();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoadRulesLayerIndirectMetadata& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_coveredRoadTypes
    {
    public:
        using OwnerType = RoadRulesLayerIndirectMetadata;

        static void create(RoadRulesLayerIndirectMetadata& owner,
                ::zserio::vector<::nds::core::types::RoadType>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RoadRulesLayerIndirectMetadata& owner,
                ::zserio::vector<::nds::core::types::RoadType>& array,
                ::nds::core::types::RoadType::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_coveredRoadTypes = ::zserio::Array<::zserio::vector<::nds::core::types::RoadType>, ::zserio::ObjectArrayTraits<::nds::core::types::RoadType, ZserioElementFactory_coveredRoadTypes>, ::zserio::ArrayType::AUTO>;

    ::nds::rules::metadata::RoadRulesLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::rules::metadata::RoadRulesLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesRoadRangeAttributeMetadata> readRoadRangeAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesRoadRangeAttributeMetadata> readRoadRangeAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesRoadPositionAttributeMetadata> readRoadPositionAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesRoadPositionAttributeMetadata> readRoadPositionAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesTransitionAttributeMetadata> readTransitionAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesTransitionAttributeMetadata> readTransitionAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_coveredRoadTypes readCoveredRoadTypes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_coveredRoadTypes readCoveredRoadTypes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::language::AvailableLanguages> readAvailableLanguages(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::language::AvailableLanguages> readAvailableLanguages(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::rules::metadata::RoadRulesLayerContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesRoadRangeAttributeMetadata> m_roadRangeAttributeMetadata_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesRoadPositionAttributeMetadata> m_roadPositionAttributeMetadata_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesTransitionAttributeMetadata> m_transitionAttributeMetadata_;
    ZserioArrayType_coveredRoadTypes m_coveredRoadTypes_;
    ::zserio::InplaceOptionalHolder<::nds::core::language::AvailableLanguages> m_availableLanguages_;
};

} // namespace metadata
} // namespace rules
} // namespace nds

#endif // NDS_RULES_METADATA_ROAD_RULES_LAYER_INDIRECT_METADATA_H
