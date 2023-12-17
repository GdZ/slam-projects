/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VENUE_LAYER_PARKING_FACILITY_LAYER_H
#define NDS_VENUE_LAYER_PARKING_FACILITY_LAYER_H

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
#include <zserio/Vector.h>

#include <nds/system/types/LayerType.h>
#include <nds/venue/parking/ParkingFacility.h>

namespace nds
{
namespace venue
{
namespace layer
{

class ParkingFacilityLayer
{
public:
    class ZserioPackingContext
    {
    };

    using allocator_type = ::std::allocator<uint8_t>;

    ParkingFacilityLayer() noexcept :
            ParkingFacilityLayer(allocator_type())
    {}

    explicit ParkingFacilityLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_parkingFacilities = ::zserio::vector<::nds::venue::parking::ParkingFacility>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_parkingFacilities, ParkingFacilityLayer, allocator_type> = 0>
    explicit ParkingFacilityLayer(
            ZSERIO_T_parkingFacilities&& parkingFacilities_,
            const allocator_type& allocator = allocator_type()) :
            ParkingFacilityLayer(allocator)
    {
        m_parkingFacilities_ = ZserioArrayType_parkingFacilities(::std::forward<ZSERIO_T_parkingFacilities>(parkingFacilities_));
    }

    explicit ParkingFacilityLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit ParkingFacilityLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~ParkingFacilityLayer() = default;

    ParkingFacilityLayer(const ParkingFacilityLayer&) = default;
    ParkingFacilityLayer& operator=(const ParkingFacilityLayer&) = default;

    ParkingFacilityLayer(ParkingFacilityLayer&&) = default;
    ParkingFacilityLayer& operator=(ParkingFacilityLayer&&) = default;

    ParkingFacilityLayer(::zserio::PropagateAllocatorT,
            const ParkingFacilityLayer& other, const allocator_type& allocator);

    void initializeChildren();

    const ::zserio::vector<::nds::venue::parking::ParkingFacility>& getParkingFacilities() const;
    ::zserio::vector<::nds::venue::parking::ParkingFacility>& getParkingFacilities();
    void setParkingFacilities(const ::zserio::vector<::nds::venue::parking::ParkingFacility>& parkingFacilities_);
    void setParkingFacilities(::zserio::vector<::nds::venue::parking::ParkingFacility>&& parkingFacilities_);

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const ParkingFacilityLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_parkingFacilities
    {
    public:
        using OwnerType = ParkingFacilityLayer;

        static void initializeElement(ParkingFacilityLayer& owner,
                ::nds::venue::parking::ParkingFacility& element, size_t index);
    };

    class ZserioElementFactory_parkingFacilities
    {
    public:
        using OwnerType = ParkingFacilityLayer;

        static void create(ParkingFacilityLayer& owner,
                ::zserio::vector<::nds::venue::parking::ParkingFacility>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(ParkingFacilityLayer& owner,
                ::zserio::vector<::nds::venue::parking::ParkingFacility>& array,
                ::nds::venue::parking::ParkingFacility::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_parkingFacilities = ::zserio::Array<::zserio::vector<::nds::venue::parking::ParkingFacility>, ::zserio::ObjectArrayTraits<::nds::venue::parking::ParkingFacility, ZserioElementFactory_parkingFacilities>, ::zserio::ArrayType::AUTO, ZserioArrayExpressions_parkingFacilities>;

    ZserioArrayType_parkingFacilities readParkingFacilities(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_parkingFacilities readParkingFacilities(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ZserioArrayType_parkingFacilities m_parkingFacilities_;
};

} // namespace layer
} // namespace venue
} // namespace nds

#endif // NDS_VENUE_LAYER_PARKING_FACILITY_LAYER_H
