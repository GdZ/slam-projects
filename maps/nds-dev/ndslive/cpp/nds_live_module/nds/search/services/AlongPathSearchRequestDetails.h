/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SEARCH_SERVICES_ALONG_PATH_SEARCH_REQUEST_DETAILS_H
#define NDS_SEARCH_SERVICES_ALONG_PATH_SEARCH_REQUEST_DETAILS_H

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

#include <nds/core/location/RoadLocationPath.h>
#include <nds/core/types/DistanceMeters.h>

namespace nds
{
namespace search
{
namespace services
{

class AlongPathSearchRequestDetails
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::location::RoadLocationPath::ZserioPackingContext& getPath()
        {
            return m_path_;
        }

        ::zserio::DeltaContext& getMaxTravelDistance()
        {
            return m_maxTravelDistance_;
        }

    private:
        ::nds::core::location::RoadLocationPath::ZserioPackingContext m_path_;
        ::zserio::DeltaContext m_maxTravelDistance_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    AlongPathSearchRequestDetails() noexcept :
            AlongPathSearchRequestDetails(allocator_type())
    {}

    explicit AlongPathSearchRequestDetails(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_path = ::nds::core::location::RoadLocationPath,
            typename ZSERIO_T_maxTravelDistance = ::nds::core::types::DistanceMeters,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_path, AlongPathSearchRequestDetails, allocator_type> = 0>
    AlongPathSearchRequestDetails(
            ZSERIO_T_path&& path_,
            ZSERIO_T_maxTravelDistance&& maxTravelDistance_,
            const allocator_type& allocator = allocator_type()) :
            AlongPathSearchRequestDetails(allocator)
    {
        m_path_ = ::std::forward<ZSERIO_T_path>(path_);
        m_maxTravelDistance_ = ::std::forward<ZSERIO_T_maxTravelDistance>(maxTravelDistance_);
    }

    explicit AlongPathSearchRequestDetails(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit AlongPathSearchRequestDetails(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~AlongPathSearchRequestDetails() = default;

    AlongPathSearchRequestDetails(const AlongPathSearchRequestDetails&) = default;
    AlongPathSearchRequestDetails& operator=(const AlongPathSearchRequestDetails&) = default;

    AlongPathSearchRequestDetails(AlongPathSearchRequestDetails&&) = default;
    AlongPathSearchRequestDetails& operator=(AlongPathSearchRequestDetails&&) = default;

    AlongPathSearchRequestDetails(::zserio::PropagateAllocatorT,
            const AlongPathSearchRequestDetails& other, const allocator_type& allocator);

    void initializeChildren();

    const ::nds::core::location::RoadLocationPath& getPath() const;
    ::nds::core::location::RoadLocationPath& getPath();
    void setPath(const ::nds::core::location::RoadLocationPath& path_);
    void setPath(::nds::core::location::RoadLocationPath&& path_);

    ::nds::core::types::DistanceMeters getMaxTravelDistance() const;
    void setMaxTravelDistance(::nds::core::types::DistanceMeters maxTravelDistance_);
    bool isMaxTravelDistanceUsed() const;
    bool isMaxTravelDistanceSet() const;
    void resetMaxTravelDistance();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const AlongPathSearchRequestDetails& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::location::RoadLocationPath readPath(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::location::RoadLocationPath readPath(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::types::DistanceMeters> readMaxTravelDistance(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::types::DistanceMeters> readMaxTravelDistance(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::core::location::RoadLocationPath m_path_;
    ::zserio::InplaceOptionalHolder<::nds::core::types::DistanceMeters> m_maxTravelDistance_;
};

} // namespace services
} // namespace search
} // namespace nds

#endif // NDS_SEARCH_SERVICES_ALONG_PATH_SEARCH_REQUEST_DETAILS_H
