/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_METADATA_ROUTE_SERVICE_CAPABILITIES_H
#define NDS_ROUTING_METADATA_ROUTE_SERVICE_CAPABILITIES_H

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
#include <zserio/BitBuffer.h>
#include <zserio/Vector.h>

#include <nds/core/types/LanguageCode.h>
#include <nds/routing/metadata/RouteServiceMethods.h>
#include <nds/routing/metadata/SupportedDriverProfileDetails.h>
#include <nds/routing/metadata/SupportedVehicleDetails.h>
#include <nds/routing/route/RouteOptions.h>
#include <nds/routing/types/RouteType.h>

namespace nds
{
namespace routing
{
namespace metadata
{

class RouteServiceCapabilities
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getImplementedMethods()
        {
            return m_implementedMethods_;
        }

        ::zserio::DeltaContext& getSupportedVehicleDetails()
        {
            return m_supportedVehicleDetails_;
        }

        ::zserio::DeltaContext& getSupportedDriverProfileDetails()
        {
            return m_supportedDriverProfileDetails_;
        }

    private:
        ::zserio::DeltaContext m_implementedMethods_;
        ::zserio::DeltaContext m_supportedVehicleDetails_;
        ::zserio::DeltaContext m_supportedDriverProfileDetails_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RouteServiceCapabilities() noexcept :
            RouteServiceCapabilities(allocator_type())
    {}

    explicit RouteServiceCapabilities(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_supportedRouteTypes = ::zserio::vector<::nds::routing::types::RouteType>,
            typename ZSERIO_T_supportedRouteOptions = ::zserio::vector<::nds::routing::route::RouteOptions>,
            typename ZSERIO_T_supportedLanguages = ::zserio::vector<::nds::core::types::LanguageCode>,
            typename ZSERIO_T_customDataMetadata = ::zserio::BitBuffer>
    RouteServiceCapabilities(
            ::nds::routing::metadata::RouteServiceMethods implementedMethods_,
            ZSERIO_T_supportedRouteTypes&& supportedRouteTypes_,
            ZSERIO_T_supportedRouteOptions&& supportedRouteOptions_,
            ZSERIO_T_supportedLanguages&& supportedLanguages_,
            ::nds::routing::metadata::SupportedVehicleDetails supportedVehicleDetails_,
            ::nds::routing::metadata::SupportedDriverProfileDetails supportedDriverProfileDetails_,
            bool providesAlternativeRoutes_,
            bool considersTimes_,
            bool usesCustomData_,
            ZSERIO_T_customDataMetadata&& customDataMetadata_,
            const allocator_type& allocator = allocator_type()) :
            RouteServiceCapabilities(allocator)
    {
        m_implementedMethods_ = implementedMethods_;
        m_supportedRouteTypes_ = ZserioArrayType_supportedRouteTypes(::std::forward<ZSERIO_T_supportedRouteTypes>(supportedRouteTypes_));
        m_supportedRouteOptions_ = ZserioArrayType_supportedRouteOptions(::std::forward<ZSERIO_T_supportedRouteOptions>(supportedRouteOptions_));
        m_supportedLanguages_ = ZserioArrayType_supportedLanguages(::std::forward<ZSERIO_T_supportedLanguages>(supportedLanguages_));
        m_supportedVehicleDetails_ = supportedVehicleDetails_;
        m_supportedDriverProfileDetails_ = supportedDriverProfileDetails_;
        m_providesAlternativeRoutes_ = providesAlternativeRoutes_;
        m_considersTimes_ = considersTimes_;
        m_usesCustomData_ = usesCustomData_;
        m_customDataMetadata_ = ::std::forward<ZSERIO_T_customDataMetadata>(customDataMetadata_);
    }

    explicit RouteServiceCapabilities(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RouteServiceCapabilities(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RouteServiceCapabilities() = default;

    RouteServiceCapabilities(const RouteServiceCapabilities&) = default;
    RouteServiceCapabilities& operator=(const RouteServiceCapabilities&) = default;

    RouteServiceCapabilities(RouteServiceCapabilities&&) = default;
    RouteServiceCapabilities& operator=(RouteServiceCapabilities&&) = default;

    RouteServiceCapabilities(::zserio::PropagateAllocatorT,
            const RouteServiceCapabilities& other, const allocator_type& allocator);

    ::nds::routing::metadata::RouteServiceMethods getImplementedMethods() const;
    void setImplementedMethods(::nds::routing::metadata::RouteServiceMethods implementedMethods_);

    const ::zserio::vector<::nds::routing::types::RouteType>& getSupportedRouteTypes() const;
    ::zserio::vector<::nds::routing::types::RouteType>& getSupportedRouteTypes();
    void setSupportedRouteTypes(const ::zserio::vector<::nds::routing::types::RouteType>& supportedRouteTypes_);
    void setSupportedRouteTypes(::zserio::vector<::nds::routing::types::RouteType>&& supportedRouteTypes_);

    const ::zserio::vector<::nds::routing::route::RouteOptions>& getSupportedRouteOptions() const;
    ::zserio::vector<::nds::routing::route::RouteOptions>& getSupportedRouteOptions();
    void setSupportedRouteOptions(const ::zserio::vector<::nds::routing::route::RouteOptions>& supportedRouteOptions_);
    void setSupportedRouteOptions(::zserio::vector<::nds::routing::route::RouteOptions>&& supportedRouteOptions_);

    const ::zserio::vector<::nds::core::types::LanguageCode>& getSupportedLanguages() const;
    ::zserio::vector<::nds::core::types::LanguageCode>& getSupportedLanguages();
    void setSupportedLanguages(const ::zserio::vector<::nds::core::types::LanguageCode>& supportedLanguages_);
    void setSupportedLanguages(::zserio::vector<::nds::core::types::LanguageCode>&& supportedLanguages_);

    ::nds::routing::metadata::SupportedVehicleDetails getSupportedVehicleDetails() const;
    void setSupportedVehicleDetails(::nds::routing::metadata::SupportedVehicleDetails supportedVehicleDetails_);

    ::nds::routing::metadata::SupportedDriverProfileDetails getSupportedDriverProfileDetails() const;
    void setSupportedDriverProfileDetails(::nds::routing::metadata::SupportedDriverProfileDetails supportedDriverProfileDetails_);

    bool getProvidesAlternativeRoutes() const;
    void setProvidesAlternativeRoutes(bool providesAlternativeRoutes_);

    bool getConsidersTimes() const;
    void setConsidersTimes(bool considersTimes_);

    bool getUsesCustomData() const;
    void setUsesCustomData(bool usesCustomData_);

    const ::zserio::BitBuffer& getCustomDataMetadata() const;
    ::zserio::BitBuffer& getCustomDataMetadata();
    void setCustomDataMetadata(const ::zserio::BitBuffer& customDataMetadata_);
    void setCustomDataMetadata(::zserio::BitBuffer&& customDataMetadata_);
    bool isCustomDataMetadataUsed() const;
    bool isCustomDataMetadataSet() const;
    void resetCustomDataMetadata();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RouteServiceCapabilities& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_supportedRouteOptions
    {
    public:
        using OwnerType = RouteServiceCapabilities;

        static void create(RouteServiceCapabilities& owner,
                ::zserio::vector<::nds::routing::route::RouteOptions>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RouteServiceCapabilities& owner,
                ::zserio::vector<::nds::routing::route::RouteOptions>& array,
                ::nds::routing::route::RouteOptions::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_supportedRouteTypes = ::zserio::Array<::zserio::vector<::nds::routing::types::RouteType>, ::zserio::EnumArrayTraits<::nds::routing::types::RouteType>, ::zserio::ArrayType::AUTO>;
    using ZserioArrayType_supportedRouteOptions = ::zserio::Array<::zserio::vector<::nds::routing::route::RouteOptions>, ::zserio::ObjectArrayTraits<::nds::routing::route::RouteOptions, ZserioElementFactory_supportedRouteOptions>, ::zserio::ArrayType::AUTO>;
    using ZserioArrayType_supportedLanguages = ::zserio::Array<::zserio::vector<::nds::core::types::LanguageCode>, ::zserio::VarIntNNArrayTraits<::nds::core::types::LanguageCode>, ::zserio::ArrayType::AUTO>;

    ::nds::routing::metadata::RouteServiceMethods readImplementedMethods(::zserio::BitStreamReader& in);
    ::nds::routing::metadata::RouteServiceMethods readImplementedMethods(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_supportedRouteTypes readSupportedRouteTypes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_supportedRouteTypes readSupportedRouteTypes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_supportedRouteOptions readSupportedRouteOptions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_supportedRouteOptions readSupportedRouteOptions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_supportedLanguages readSupportedLanguages(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_supportedLanguages readSupportedLanguages(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::routing::metadata::SupportedVehicleDetails readSupportedVehicleDetails(::zserio::BitStreamReader& in);
    ::nds::routing::metadata::SupportedVehicleDetails readSupportedVehicleDetails(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::routing::metadata::SupportedDriverProfileDetails readSupportedDriverProfileDetails(::zserio::BitStreamReader& in);
    ::nds::routing::metadata::SupportedDriverProfileDetails readSupportedDriverProfileDetails(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    bool readProvidesAlternativeRoutes(::zserio::BitStreamReader& in);
    bool readConsidersTimes(::zserio::BitStreamReader& in);
    bool readUsesCustomData(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::zserio::BitBuffer> readCustomDataMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);

    ::nds::routing::metadata::RouteServiceMethods m_implementedMethods_;
    ZserioArrayType_supportedRouteTypes m_supportedRouteTypes_;
    ZserioArrayType_supportedRouteOptions m_supportedRouteOptions_;
    ZserioArrayType_supportedLanguages m_supportedLanguages_;
    ::nds::routing::metadata::SupportedVehicleDetails m_supportedVehicleDetails_;
    ::nds::routing::metadata::SupportedDriverProfileDetails m_supportedDriverProfileDetails_;
    bool m_providesAlternativeRoutes_;
    bool m_considersTimes_;
    bool m_usesCustomData_;
    ::zserio::InplaceOptionalHolder<::zserio::BitBuffer> m_customDataMetadata_;
};

} // namespace metadata
} // namespace routing
} // namespace nds

#endif // NDS_ROUTING_METADATA_ROUTE_SERVICE_CAPABILITIES_H
