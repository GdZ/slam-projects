/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_CONDITIONS_TIME_RANGE_OF_YEAR_H
#define NDS_CORE_CONDITIONS_TIME_RANGE_OF_YEAR_H

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

#include <nds/core/conditions/DayOfYear.h>
#include <nds/core/conditions/TimeOfDay.h>

namespace nds
{
namespace core
{
namespace conditions
{

class TimeRangeOfYear
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::conditions::DayOfYear::ZserioPackingContext& getStartDay()
        {
            return m_startDay_;
        }

        ::nds::core::conditions::TimeOfDay::ZserioPackingContext& getStartTime()
        {
            return m_startTime_;
        }

        ::nds::core::conditions::DayOfYear::ZserioPackingContext& getEndDay()
        {
            return m_endDay_;
        }

        ::nds::core::conditions::TimeOfDay::ZserioPackingContext& getEndTime()
        {
            return m_endTime_;
        }

    private:
        ::nds::core::conditions::DayOfYear::ZserioPackingContext m_startDay_;
        ::nds::core::conditions::TimeOfDay::ZserioPackingContext m_startTime_;
        ::nds::core::conditions::DayOfYear::ZserioPackingContext m_endDay_;
        ::nds::core::conditions::TimeOfDay::ZserioPackingContext m_endTime_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    TimeRangeOfYear() noexcept :
            TimeRangeOfYear(allocator_type())
    {}

    explicit TimeRangeOfYear(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_startDay = ::nds::core::conditions::DayOfYear,
            typename ZSERIO_T_startTime = ::nds::core::conditions::TimeOfDay,
            typename ZSERIO_T_endDay = ::nds::core::conditions::DayOfYear,
            typename ZSERIO_T_endTime = ::nds::core::conditions::TimeOfDay,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_startDay, TimeRangeOfYear, allocator_type> = 0>
    TimeRangeOfYear(
            ZSERIO_T_startDay&& startDay_,
            ZSERIO_T_startTime&& startTime_,
            ZSERIO_T_endDay&& endDay_,
            ZSERIO_T_endTime&& endTime_,
            bool isInclusive_,
            const allocator_type& allocator = allocator_type()) :
            TimeRangeOfYear(allocator)
    {
        m_startDay_ = ::std::forward<ZSERIO_T_startDay>(startDay_);
        m_startTime_ = ::std::forward<ZSERIO_T_startTime>(startTime_);
        m_endDay_ = ::std::forward<ZSERIO_T_endDay>(endDay_);
        m_endTime_ = ::std::forward<ZSERIO_T_endTime>(endTime_);
        m_isInclusive_ = isInclusive_;
    }

    explicit TimeRangeOfYear(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit TimeRangeOfYear(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~TimeRangeOfYear() = default;

    TimeRangeOfYear(const TimeRangeOfYear&) = default;
    TimeRangeOfYear& operator=(const TimeRangeOfYear&) = default;

    TimeRangeOfYear(TimeRangeOfYear&&) = default;
    TimeRangeOfYear& operator=(TimeRangeOfYear&&) = default;

    TimeRangeOfYear(::zserio::PropagateAllocatorT,
            const TimeRangeOfYear& other, const allocator_type& allocator);

    const ::nds::core::conditions::DayOfYear& getStartDay() const;
    ::nds::core::conditions::DayOfYear& getStartDay();
    void setStartDay(const ::nds::core::conditions::DayOfYear& startDay_);
    void setStartDay(::nds::core::conditions::DayOfYear&& startDay_);

    const ::nds::core::conditions::TimeOfDay& getStartTime() const;
    ::nds::core::conditions::TimeOfDay& getStartTime();
    void setStartTime(const ::nds::core::conditions::TimeOfDay& startTime_);
    void setStartTime(::nds::core::conditions::TimeOfDay&& startTime_);

    const ::nds::core::conditions::DayOfYear& getEndDay() const;
    ::nds::core::conditions::DayOfYear& getEndDay();
    void setEndDay(const ::nds::core::conditions::DayOfYear& endDay_);
    void setEndDay(::nds::core::conditions::DayOfYear&& endDay_);

    const ::nds::core::conditions::TimeOfDay& getEndTime() const;
    ::nds::core::conditions::TimeOfDay& getEndTime();
    void setEndTime(const ::nds::core::conditions::TimeOfDay& endTime_);
    void setEndTime(::nds::core::conditions::TimeOfDay&& endTime_);

    bool getIsInclusive() const;
    void setIsInclusive(bool isInclusive_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const TimeRangeOfYear& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::conditions::DayOfYear readStartDay(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::conditions::DayOfYear readStartDay(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::conditions::TimeOfDay readStartTime(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::conditions::TimeOfDay readStartTime(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::conditions::DayOfYear readEndDay(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::conditions::DayOfYear readEndDay(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::conditions::TimeOfDay readEndTime(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::conditions::TimeOfDay readEndTime(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    bool readIsInclusive(::zserio::BitStreamReader& in);

    ::nds::core::conditions::DayOfYear m_startDay_;
    ::nds::core::conditions::TimeOfDay m_startTime_;
    ::nds::core::conditions::DayOfYear m_endDay_;
    ::nds::core::conditions::TimeOfDay m_endTime_;
    bool m_isInclusive_;
};

} // namespace conditions
} // namespace core
} // namespace nds

#endif // NDS_CORE_CONDITIONS_TIME_RANGE_OF_YEAR_H
