/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SEARCH_SERVICES_SUPPORTED_SEARCH_CONFIGURATION_H
#define NDS_SEARCH_SERVICES_SUPPORTED_SEARCH_CONFIGURATION_H

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
#include <nds/search/services/RequestOptions.h>
#include <nds/search/services/SupportedFeature.h>
#include <nds/search/types/ResultOrder.h>
#include <nds/system/types/ExternData.h>
#include <nds/system/types/ModuleDefinition.h>

namespace nds
{
namespace search
{
namespace services
{

class SupportedSearchConfiguration
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getSupportedFeatures()
        {
            return m_supportedFeatures_;
        }

        ::zserio::DeltaContext& getSupportedRequestOptions()
        {
            return m_supportedRequestOptions_;
        }

        ::zserio::DeltaContext& getSupportedResultOrders()
        {
            return m_supportedResultOrders_;
        }

        ::nds::core::language::AvailableLanguages::ZserioPackingContext& getAvailableLanguages()
        {
            return m_availableLanguages_;
        }

    private:
        ::zserio::DeltaContext m_supportedFeatures_;
        ::zserio::DeltaContext m_supportedRequestOptions_;
        ::zserio::DeltaContext m_supportedResultOrders_;
        ::nds::core::language::AvailableLanguages::ZserioPackingContext m_availableLanguages_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    SupportedSearchConfiguration() noexcept :
            SupportedSearchConfiguration(allocator_type())
    {}

    explicit SupportedSearchConfiguration(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_supportedResultOrders = ::nds::search::types::ResultOrder,
            typename ZSERIO_T_availableLanguages = ::nds::core::language::AvailableLanguages,
            typename ZSERIO_T_poiModuleDefinition = ::nds::system::types::ModuleDefinition,
            typename ZSERIO_T_poiSearchMetadata = ::nds::system::types::ExternData,
            typename ZSERIO_T_nameModuleDefinition = ::nds::system::types::ModuleDefinition,
            typename ZSERIO_T_addressSearchMetadata = ::nds::system::types::ExternData>
    SupportedSearchConfiguration(
            ::nds::search::services::SupportedFeature supportedFeatures_,
            ::nds::search::services::RequestOptions supportedRequestOptions_,
            ZSERIO_T_supportedResultOrders&& supportedResultOrders_,
            ZSERIO_T_availableLanguages&& availableLanguages_,
            ZSERIO_T_poiModuleDefinition&& poiModuleDefinition_,
            ZSERIO_T_poiSearchMetadata&& poiSearchMetadata_,
            ZSERIO_T_nameModuleDefinition&& nameModuleDefinition_,
            ZSERIO_T_addressSearchMetadata&& addressSearchMetadata_,
            const allocator_type& allocator = allocator_type()) :
            SupportedSearchConfiguration(allocator)
    {
        m_supportedFeatures_ = supportedFeatures_;
        m_supportedRequestOptions_ = supportedRequestOptions_;
        m_supportedResultOrders_ = ::std::forward<ZSERIO_T_supportedResultOrders>(supportedResultOrders_);
        m_availableLanguages_ = ::std::forward<ZSERIO_T_availableLanguages>(availableLanguages_);
        m_poiModuleDefinition_ = ::std::forward<ZSERIO_T_poiModuleDefinition>(poiModuleDefinition_);
        m_poiSearchMetadata_ = ::std::forward<ZSERIO_T_poiSearchMetadata>(poiSearchMetadata_);
        m_nameModuleDefinition_ = ::std::forward<ZSERIO_T_nameModuleDefinition>(nameModuleDefinition_);
        m_addressSearchMetadata_ = ::std::forward<ZSERIO_T_addressSearchMetadata>(addressSearchMetadata_);
    }

    explicit SupportedSearchConfiguration(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit SupportedSearchConfiguration(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~SupportedSearchConfiguration() = default;

    SupportedSearchConfiguration(const SupportedSearchConfiguration&) = default;
    SupportedSearchConfiguration& operator=(const SupportedSearchConfiguration&) = default;

    SupportedSearchConfiguration(SupportedSearchConfiguration&&) = default;
    SupportedSearchConfiguration& operator=(SupportedSearchConfiguration&&) = default;

    SupportedSearchConfiguration(::zserio::PropagateAllocatorT,
            const SupportedSearchConfiguration& other, const allocator_type& allocator);

    ::nds::search::services::SupportedFeature getSupportedFeatures() const;
    void setSupportedFeatures(::nds::search::services::SupportedFeature supportedFeatures_);

    ::nds::search::services::RequestOptions getSupportedRequestOptions() const;
    void setSupportedRequestOptions(::nds::search::services::RequestOptions supportedRequestOptions_);

    ::nds::search::types::ResultOrder getSupportedResultOrders() const;
    void setSupportedResultOrders(::nds::search::types::ResultOrder supportedResultOrders_);
    bool isSupportedResultOrdersUsed() const;
    bool isSupportedResultOrdersSet() const;
    void resetSupportedResultOrders();

    const ::nds::core::language::AvailableLanguages& getAvailableLanguages() const;
    ::nds::core::language::AvailableLanguages& getAvailableLanguages();
    void setAvailableLanguages(const ::nds::core::language::AvailableLanguages& availableLanguages_);
    void setAvailableLanguages(::nds::core::language::AvailableLanguages&& availableLanguages_);

    const ::nds::system::types::ModuleDefinition& getPoiModuleDefinition() const;
    ::nds::system::types::ModuleDefinition& getPoiModuleDefinition();
    void setPoiModuleDefinition(const ::nds::system::types::ModuleDefinition& poiModuleDefinition_);
    void setPoiModuleDefinition(::nds::system::types::ModuleDefinition&& poiModuleDefinition_);
    bool isPoiModuleDefinitionUsed() const;
    bool isPoiModuleDefinitionSet() const;
    void resetPoiModuleDefinition();

    const ::nds::system::types::ExternData& getPoiSearchMetadata() const;
    ::nds::system::types::ExternData& getPoiSearchMetadata();
    void setPoiSearchMetadata(const ::nds::system::types::ExternData& poiSearchMetadata_);
    void setPoiSearchMetadata(::nds::system::types::ExternData&& poiSearchMetadata_);
    bool isPoiSearchMetadataUsed() const;
    bool isPoiSearchMetadataSet() const;
    void resetPoiSearchMetadata();

    const ::nds::system::types::ModuleDefinition& getNameModuleDefinition() const;
    ::nds::system::types::ModuleDefinition& getNameModuleDefinition();
    void setNameModuleDefinition(const ::nds::system::types::ModuleDefinition& nameModuleDefinition_);
    void setNameModuleDefinition(::nds::system::types::ModuleDefinition&& nameModuleDefinition_);
    bool isNameModuleDefinitionUsed() const;
    bool isNameModuleDefinitionSet() const;
    void resetNameModuleDefinition();

    const ::nds::system::types::ExternData& getAddressSearchMetadata() const;
    ::nds::system::types::ExternData& getAddressSearchMetadata();
    void setAddressSearchMetadata(const ::nds::system::types::ExternData& addressSearchMetadata_);
    void setAddressSearchMetadata(::nds::system::types::ExternData&& addressSearchMetadata_);
    bool isAddressSearchMetadataUsed() const;
    bool isAddressSearchMetadataSet() const;
    void resetAddressSearchMetadata();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const SupportedSearchConfiguration& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::search::services::SupportedFeature readSupportedFeatures(::zserio::BitStreamReader& in);
    ::nds::search::services::SupportedFeature readSupportedFeatures(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::search::services::RequestOptions readSupportedRequestOptions(::zserio::BitStreamReader& in);
    ::nds::search::services::RequestOptions readSupportedRequestOptions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::search::types::ResultOrder> readSupportedResultOrders(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::search::types::ResultOrder> readSupportedResultOrders(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::language::AvailableLanguages readAvailableLanguages(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::language::AvailableLanguages readAvailableLanguages(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::system::types::ModuleDefinition> readPoiModuleDefinition(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::system::types::ExternData> readPoiSearchMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::system::types::ModuleDefinition> readNameModuleDefinition(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::system::types::ExternData> readAddressSearchMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);

    ::nds::search::services::SupportedFeature m_supportedFeatures_;
    ::nds::search::services::RequestOptions m_supportedRequestOptions_;
    ::zserio::InplaceOptionalHolder<::nds::search::types::ResultOrder> m_supportedResultOrders_;
    ::nds::core::language::AvailableLanguages m_availableLanguages_;
    ::zserio::InplaceOptionalHolder<::nds::system::types::ModuleDefinition> m_poiModuleDefinition_;
    ::zserio::InplaceOptionalHolder<::nds::system::types::ExternData> m_poiSearchMetadata_;
    ::zserio::InplaceOptionalHolder<::nds::system::types::ModuleDefinition> m_nameModuleDefinition_;
    ::zserio::InplaceOptionalHolder<::nds::system::types::ExternData> m_addressSearchMetadata_;
};

} // namespace services
} // namespace search
} // namespace nds

#endif // NDS_SEARCH_SERVICES_SUPPORTED_SEARCH_CONFIGURATION_H
