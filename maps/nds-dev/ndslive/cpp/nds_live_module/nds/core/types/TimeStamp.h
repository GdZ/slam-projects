/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_TYPES_TIME_STAMP_H
#define NDS_CORE_TYPES_TIME_STAMP_H

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

namespace nds
{
namespace core
{
namespace types
{

class TimeStamp
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getSeconds()
        {
            return m_seconds_;
        }

        ::zserio::DeltaContext& getNanoseconds()
        {
            return m_nanoseconds_;
        }

    private:
        ::zserio::DeltaContext m_seconds_;
        ::zserio::DeltaContext m_nanoseconds_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    TimeStamp() noexcept :
            TimeStamp(allocator_type())
    {}

    explicit TimeStamp(const allocator_type& allocator) noexcept;

    TimeStamp(
            uint64_t seconds_,
            uint64_t nanoseconds_,
            const allocator_type& allocator = allocator_type()) :
            TimeStamp(allocator)
    {
        m_seconds_ = seconds_;
        m_nanoseconds_ = nanoseconds_;
    }

    explicit TimeStamp(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit TimeStamp(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~TimeStamp() = default;

    TimeStamp(const TimeStamp&) = default;
    TimeStamp& operator=(const TimeStamp&) = default;

    TimeStamp(TimeStamp&&) = default;
    TimeStamp& operator=(TimeStamp&&) = default;

    TimeStamp(::zserio::PropagateAllocatorT,
            const TimeStamp& other, const allocator_type& allocator);

    uint64_t getSeconds() const;
    void setSeconds(uint64_t seconds_);

    uint64_t getNanoseconds() const;
    void setNanoseconds(uint64_t nanoseconds_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const TimeStamp& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    uint64_t readSeconds(::zserio::BitStreamReader& in);
    uint64_t readSeconds(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    uint64_t readNanoseconds(::zserio::BitStreamReader& in);
    uint64_t readNanoseconds(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    uint64_t m_seconds_;
    uint64_t m_nanoseconds_;
};

} // namespace types
} // namespace core
} // namespace nds

#endif // NDS_CORE_TYPES_TIME_STAMP_H