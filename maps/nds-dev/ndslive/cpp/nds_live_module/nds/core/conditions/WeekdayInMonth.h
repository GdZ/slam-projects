/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_CONDITIONS_WEEKDAY_IN_MONTH_H
#define NDS_CORE_CONDITIONS_WEEKDAY_IN_MONTH_H

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

class WeekdayInMonth
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getDayOfWeek()
        {
            return m_dayOfWeek_;
        }

        ::zserio::DeltaContext& getNThWeekdayInMonth()
        {
            return m_nThWeekdayInMonth_;
        }

    private:
        ::zserio::DeltaContext m_dayOfWeek_;
        ::zserio::DeltaContext m_nThWeekdayInMonth_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    WeekdayInMonth() noexcept :
            WeekdayInMonth(allocator_type())
    {}

    explicit WeekdayInMonth(const allocator_type& allocator) noexcept;

    WeekdayInMonth(
            uint8_t dayOfWeek_,
            bool countBackwardWeekdayInMonth_,
            uint8_t nThWeekdayInMonth_,
            const allocator_type& allocator = allocator_type()) :
            WeekdayInMonth(allocator)
    {
        m_dayOfWeek_ = dayOfWeek_;
        m_countBackwardWeekdayInMonth_ = countBackwardWeekdayInMonth_;
        m_nThWeekdayInMonth_ = nThWeekdayInMonth_;
    }

    explicit WeekdayInMonth(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit WeekdayInMonth(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~WeekdayInMonth() = default;

    WeekdayInMonth(const WeekdayInMonth&) = default;
    WeekdayInMonth& operator=(const WeekdayInMonth&) = default;

    WeekdayInMonth(WeekdayInMonth&&) = default;
    WeekdayInMonth& operator=(WeekdayInMonth&&) = default;

    WeekdayInMonth(::zserio::PropagateAllocatorT,
            const WeekdayInMonth& other, const allocator_type& allocator);

    uint8_t getDayOfWeek() const;
    void setDayOfWeek(uint8_t dayOfWeek_);

    bool getCountBackwardWeekdayInMonth() const;
    void setCountBackwardWeekdayInMonth(bool countBackwardWeekdayInMonth_);

    uint8_t getNThWeekdayInMonth() const;
    void setNThWeekdayInMonth(uint8_t nThWeekdayInMonth_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const WeekdayInMonth& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    uint8_t readDayOfWeek(::zserio::BitStreamReader& in);
    uint8_t readDayOfWeek(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    bool readCountBackwardWeekdayInMonth(::zserio::BitStreamReader& in);
    uint8_t readNThWeekdayInMonth(::zserio::BitStreamReader& in);
    uint8_t readNThWeekdayInMonth(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    uint8_t m_dayOfWeek_;
    bool m_countBackwardWeekdayInMonth_;
    uint8_t m_nThWeekdayInMonth_;
};

} // namespace conditions
} // namespace core
} // namespace nds

#endif // NDS_CORE_CONDITIONS_WEEKDAY_IN_MONTH_H
