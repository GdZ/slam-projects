/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VEHICLE_METADATA_HORIZON_SERVICE_CAPABILITIES_RESPONSE_H
#define NDS_VEHICLE_METADATA_HORIZON_SERVICE_CAPABILITIES_RESPONSE_H

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
#include <zserio/ArrayTraits.h>

#include <nds/vehicle/metadata/HorizonServiceCapabilities.h>

namespace nds
{
namespace vehicle
{
namespace metadata
{

class HorizonServiceCapabilitiesResponse
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getCapabilities()
        {
            return m_capabilities_;
        }

    private:
        ::zserio::DeltaContext m_capabilities_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    HorizonServiceCapabilitiesResponse() noexcept :
            HorizonServiceCapabilitiesResponse(allocator_type())
    {}

    explicit HorizonServiceCapabilitiesResponse(const allocator_type& allocator) noexcept;

    explicit HorizonServiceCapabilitiesResponse(
            ::nds::vehicle::metadata::HorizonServiceCapabilities capabilities_,
            const allocator_type& allocator = allocator_type()) :
            HorizonServiceCapabilitiesResponse(allocator)
    {
        m_capabilities_ = capabilities_;
    }

    explicit HorizonServiceCapabilitiesResponse(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit HorizonServiceCapabilitiesResponse(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~HorizonServiceCapabilitiesResponse() = default;

    HorizonServiceCapabilitiesResponse(const HorizonServiceCapabilitiesResponse&) = default;
    HorizonServiceCapabilitiesResponse& operator=(const HorizonServiceCapabilitiesResponse&) = default;

    HorizonServiceCapabilitiesResponse(HorizonServiceCapabilitiesResponse&&) = default;
    HorizonServiceCapabilitiesResponse& operator=(HorizonServiceCapabilitiesResponse&&) = default;

    HorizonServiceCapabilitiesResponse(::zserio::PropagateAllocatorT,
            const HorizonServiceCapabilitiesResponse& other, const allocator_type& allocator);

    ::nds::vehicle::metadata::HorizonServiceCapabilities getCapabilities() const;
    void setCapabilities(::nds::vehicle::metadata::HorizonServiceCapabilities capabilities_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const HorizonServiceCapabilitiesResponse& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::vehicle::metadata::HorizonServiceCapabilities readCapabilities(::zserio::BitStreamReader& in);
    ::nds::vehicle::metadata::HorizonServiceCapabilities readCapabilities(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::vehicle::metadata::HorizonServiceCapabilities m_capabilities_;
};

} // namespace metadata
} // namespace vehicle
} // namespace nds

#endif // NDS_VEHICLE_METADATA_HORIZON_SERVICE_CAPABILITIES_RESPONSE_H
