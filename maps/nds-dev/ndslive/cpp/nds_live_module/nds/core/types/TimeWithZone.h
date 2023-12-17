/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_TYPES_TIME_WITH_ZONE_H
#define NDS_CORE_TYPES_TIME_WITH_ZONE_H

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
#include <zserio/Types.h>

#include <nds/core/types/QuarterHourTimeOffset.h>

namespace nds
{
namespace core
{
namespace types
{

class TimeWithZone
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getSeconds()
        {
            return m_seconds_;
        }

        ::zserio::DeltaContext& getUtcOffset()
        {
            return m_utcOffset_;
        }

    private:
        ::zserio::DeltaContext m_seconds_;
        ::zserio::DeltaContext m_utcOffset_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    TimeWithZone() noexcept :
            TimeWithZone(allocator_type())
    {}

    explicit TimeWithZone(const allocator_type& allocator) noexcept;

    TimeWithZone(
            uint64_t seconds_,
            ::nds::core::types::QuarterHourTimeOffset utcOffset_,
            const allocator_type& allocator = allocator_type()) :
            TimeWithZone(allocator)
    {
        m_seconds_ = seconds_;
        m_utcOffset_ = utcOffset_;
    }

    explicit TimeWithZone(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit TimeWithZone(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~TimeWithZone() = default;

    TimeWithZone(const TimeWithZone&) = default;
    TimeWithZone& operator=(const TimeWithZone&) = default;

    TimeWithZone(TimeWithZone&&) = default;
    TimeWithZone& operator=(TimeWithZone&&) = default;

    TimeWithZone(::zserio::PropagateAllocatorT,
            const TimeWithZone& other, const allocator_type& allocator);

    uint64_t getSeconds() const;
    void setSeconds(uint64_t seconds_);

    ::nds::core::types::QuarterHourTimeOffset getUtcOffset() const;
    void setUtcOffset(::nds::core::types::QuarterHourTimeOffset utcOffset_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const TimeWithZone& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    uint64_t readSeconds(::zserio::BitStreamReader& in);
    uint64_t readSeconds(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::types::QuarterHourTimeOffset readUtcOffset(::zserio::BitStreamReader& in);
    ::nds::core::types::QuarterHourTimeOffset readUtcOffset(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    uint64_t m_seconds_;
    ::nds::core::types::QuarterHourTimeOffset m_utcOffset_;
};

} // namespace types
} // namespace core
} // namespace nds

#endif // NDS_CORE_TYPES_TIME_WITH_ZONE_H
