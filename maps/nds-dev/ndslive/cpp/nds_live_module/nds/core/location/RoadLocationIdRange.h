/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_LOCATION_ROAD_LOCATION_ID_RANGE_H
#define NDS_CORE_LOCATION_ROAD_LOCATION_ID_RANGE_H

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

#include <nds/core/types/LengthCentimeters.h>

namespace nds
{
namespace core
{
namespace location
{

class RoadLocationIdRange
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getStartPosition()
        {
            return m_startPosition_;
        }

        ::zserio::DeltaContext& getEndPosition()
        {
            return m_endPosition_;
        }

    private:
        ::zserio::DeltaContext m_startPosition_;
        ::zserio::DeltaContext m_endPosition_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoadLocationIdRange() noexcept :
            RoadLocationIdRange(allocator_type())
    {}

    explicit RoadLocationIdRange(const allocator_type& allocator) noexcept;

    RoadLocationIdRange(
            ::nds::core::types::LengthCentimeters startPosition_,
            ::nds::core::types::LengthCentimeters endPosition_,
            const allocator_type& allocator = allocator_type()) :
            RoadLocationIdRange(allocator)
    {
        m_startPosition_ = startPosition_;
        m_endPosition_ = endPosition_;
    }

    explicit RoadLocationIdRange(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RoadLocationIdRange(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RoadLocationIdRange() = default;

    RoadLocationIdRange(const RoadLocationIdRange&) = default;
    RoadLocationIdRange& operator=(const RoadLocationIdRange&) = default;

    RoadLocationIdRange(RoadLocationIdRange&&) = default;
    RoadLocationIdRange& operator=(RoadLocationIdRange&&) = default;

    RoadLocationIdRange(::zserio::PropagateAllocatorT,
            const RoadLocationIdRange& other, const allocator_type& allocator);

    ::nds::core::types::LengthCentimeters getStartPosition() const;
    void setStartPosition(::nds::core::types::LengthCentimeters startPosition_);

    ::nds::core::types::LengthCentimeters getEndPosition() const;
    void setEndPosition(::nds::core::types::LengthCentimeters endPosition_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoadLocationIdRange& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::types::LengthCentimeters readStartPosition(::zserio::BitStreamReader& in);
    ::nds::core::types::LengthCentimeters readStartPosition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::types::LengthCentimeters readEndPosition(::zserio::BitStreamReader& in);
    ::nds::core::types::LengthCentimeters readEndPosition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::core::types::LengthCentimeters m_startPosition_;
    ::nds::core::types::LengthCentimeters m_endPosition_;
};

} // namespace location
} // namespace core
} // namespace nds

#endif // NDS_CORE_LOCATION_ROAD_LOCATION_ID_RANGE_H