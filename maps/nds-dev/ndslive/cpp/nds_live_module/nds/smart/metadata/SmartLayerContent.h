/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_METADATA_SMART_LAYER_CONTENT_H
#define NDS_SMART_METADATA_SMART_LAYER_CONTENT_H

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

#include <nds/core/types/RoadType.h>
#include <nds/core/vehicle/VehicleClassSpecification.h>
#include <nds/core/vehicle/VehicleTypeInformation.h>

namespace nds
{
namespace smart
{
namespace metadata
{

class SmartLayerContent
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::vehicle::VehicleTypeInformation::ZserioPackingContext& getVehicleTypes()
        {
            return m_vehicleTypes_;
        }

        ::nds::core::vehicle::VehicleClassSpecification::ZserioPackingContext& getVehicleClass()
        {
            return m_vehicleClass_;
        }

    private:
        ::nds::core::vehicle::VehicleTypeInformation::ZserioPackingContext m_vehicleTypes_;
        ::nds::core::vehicle::VehicleClassSpecification::ZserioPackingContext m_vehicleClass_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    SmartLayerContent() noexcept :
            SmartLayerContent(allocator_type())
    {}

    explicit SmartLayerContent(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_coveredRoadTypes = ::zserio::vector<::nds::core::types::RoadType>,
            typename ZSERIO_T_vehicleTypes = ::nds::core::vehicle::VehicleTypeInformation,
            typename ZSERIO_T_vehicleClass = ::nds::core::vehicle::VehicleClassSpecification,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_coveredRoadTypes, SmartLayerContent, allocator_type> = 0>
    SmartLayerContent(
            ZSERIO_T_coveredRoadTypes&& coveredRoadTypes_,
            ZSERIO_T_vehicleTypes&& vehicleTypes_,
            ZSERIO_T_vehicleClass&& vehicleClass_,
            const allocator_type& allocator = allocator_type()) :
            SmartLayerContent(allocator)
    {
        m_coveredRoadTypes_ = ZserioArrayType_coveredRoadTypes(::std::forward<ZSERIO_T_coveredRoadTypes>(coveredRoadTypes_));
        m_vehicleTypes_ = ::std::forward<ZSERIO_T_vehicleTypes>(vehicleTypes_);
        m_vehicleClass_ = ::std::forward<ZSERIO_T_vehicleClass>(vehicleClass_);
    }

    explicit SmartLayerContent(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit SmartLayerContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~SmartLayerContent() = default;

    SmartLayerContent(const SmartLayerContent&) = default;
    SmartLayerContent& operator=(const SmartLayerContent&) = default;

    SmartLayerContent(SmartLayerContent&&) = default;
    SmartLayerContent& operator=(SmartLayerContent&&) = default;

    SmartLayerContent(::zserio::PropagateAllocatorT,
            const SmartLayerContent& other, const allocator_type& allocator);

    const ::zserio::vector<::nds::core::types::RoadType>& getCoveredRoadTypes() const;
    ::zserio::vector<::nds::core::types::RoadType>& getCoveredRoadTypes();
    void setCoveredRoadTypes(const ::zserio::vector<::nds::core::types::RoadType>& coveredRoadTypes_);
    void setCoveredRoadTypes(::zserio::vector<::nds::core::types::RoadType>&& coveredRoadTypes_);

    const ::nds::core::vehicle::VehicleTypeInformation& getVehicleTypes() const;
    ::nds::core::vehicle::VehicleTypeInformation& getVehicleTypes();
    void setVehicleTypes(const ::nds::core::vehicle::VehicleTypeInformation& vehicleTypes_);
    void setVehicleTypes(::nds::core::vehicle::VehicleTypeInformation&& vehicleTypes_);

    const ::nds::core::vehicle::VehicleClassSpecification& getVehicleClass() const;
    ::nds::core::vehicle::VehicleClassSpecification& getVehicleClass();
    void setVehicleClass(const ::nds::core::vehicle::VehicleClassSpecification& vehicleClass_);
    void setVehicleClass(::nds::core::vehicle::VehicleClassSpecification&& vehicleClass_);
    bool isVehicleClassUsed() const;
    bool isVehicleClassSet() const;
    void resetVehicleClass();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const SmartLayerContent& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_coveredRoadTypes
    {
    public:
        using OwnerType = SmartLayerContent;

        static void create(SmartLayerContent& owner,
                ::zserio::vector<::nds::core::types::RoadType>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(SmartLayerContent& owner,
                ::zserio::vector<::nds::core::types::RoadType>& array,
                ::nds::core::types::RoadType::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_coveredRoadTypes = ::zserio::Array<::zserio::vector<::nds::core::types::RoadType>, ::zserio::ObjectArrayTraits<::nds::core::types::RoadType, ZserioElementFactory_coveredRoadTypes>, ::zserio::ArrayType::AUTO>;

    ZserioArrayType_coveredRoadTypes readCoveredRoadTypes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_coveredRoadTypes readCoveredRoadTypes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::vehicle::VehicleTypeInformation readVehicleTypes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::vehicle::VehicleTypeInformation readVehicleTypes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::VehicleClassSpecification> readVehicleClass(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::VehicleClassSpecification> readVehicleClass(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ZserioArrayType_coveredRoadTypes m_coveredRoadTypes_;
    ::nds::core::vehicle::VehicleTypeInformation m_vehicleTypes_;
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::VehicleClassSpecification> m_vehicleClass_;
};

} // namespace metadata
} // namespace smart
} // namespace nds

#endif // NDS_SMART_METADATA_SMART_LAYER_CONTENT_H