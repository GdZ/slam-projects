/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_CONDITIONS_TIME_DURATION_HOURS_H
#define NDS_CORE_CONDITIONS_TIME_DURATION_HOURS_H

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
namespace conditions
{

class TimeDurationHours
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getHours()
        {
            return m_hours_;
        }

        ::zserio::DeltaContext& getMinutes()
        {
            return m_minutes_;
        }

    private:
        ::zserio::DeltaContext m_hours_;
        ::zserio::DeltaContext m_minutes_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    TimeDurationHours() noexcept :
            TimeDurationHours(allocator_type())
    {}

    explicit TimeDurationHours(const allocator_type& allocator) noexcept;

    TimeDurationHours(
            uint8_t hours_,
            uint8_t minutes_,
            const allocator_type& allocator = allocator_type()) :
            TimeDurationHours(allocator)
    {
        m_hours_ = hours_;
        m_minutes_ = minutes_;
    }

    explicit TimeDurationHours(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit TimeDurationHours(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~TimeDurationHours() = default;

    TimeDurationHours(const TimeDurationHours&) = default;
    TimeDurationHours& operator=(const TimeDurationHours&) = default;

    TimeDurationHours(TimeDurationHours&&) = default;
    TimeDurationHours& operator=(TimeDurationHours&&) = default;

    TimeDurationHours(::zserio::PropagateAllocatorT,
            const TimeDurationHours& other, const allocator_type& allocator);

    uint8_t getHours() const;
    void setHours(uint8_t hours_);

    uint8_t getMinutes() const;
    void setMinutes(uint8_t minutes_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const TimeDurationHours& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    uint8_t readHours(::zserio::BitStreamReader& in);
    uint8_t readHours(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    uint8_t readMinutes(::zserio::BitStreamReader& in);
    uint8_t readMinutes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    uint8_t m_hours_;
    uint8_t m_minutes_;
};

} // namespace conditions
} // namespace core
} // namespace nds

#endif // NDS_CORE_CONDITIONS_TIME_DURATION_HOURS_H
