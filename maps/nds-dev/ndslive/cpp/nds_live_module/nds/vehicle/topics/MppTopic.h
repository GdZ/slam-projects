/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VEHICLE_TOPICS_MPP_TOPIC_H
#define NDS_VEHICLE_TOPICS_MPP_TOPIC_H

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

#include <nds/core/types/TimeStamp.h>
#include <nds/vehicle/reference/types/HorizonPathId.h>

namespace nds
{
namespace vehicle
{
namespace topics
{

class MppTopic
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::types::TimeStamp::ZserioPackingContext& getTime()
        {
            return m_time_;
        }

    private:
        ::nds::core::types::TimeStamp::ZserioPackingContext m_time_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    MppTopic() noexcept :
            MppTopic(allocator_type())
    {}

    explicit MppTopic(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_time = ::nds::core::types::TimeStamp,
            typename ZSERIO_T_mpp = ::zserio::vector<::nds::vehicle::reference::types::HorizonPathId>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_time, MppTopic, allocator_type> = 0>
    MppTopic(
            ZSERIO_T_time&& time_,
            ZSERIO_T_mpp&& mpp_,
            const allocator_type& allocator = allocator_type()) :
            MppTopic(allocator)
    {
        m_time_ = ::std::forward<ZSERIO_T_time>(time_);
        m_mpp_ = ZserioArrayType_mpp(::std::forward<ZSERIO_T_mpp>(mpp_));
    }

    explicit MppTopic(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit MppTopic(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~MppTopic() = default;

    MppTopic(const MppTopic&) = default;
    MppTopic& operator=(const MppTopic&) = default;

    MppTopic(MppTopic&&) = default;
    MppTopic& operator=(MppTopic&&) = default;

    MppTopic(::zserio::PropagateAllocatorT,
            const MppTopic& other, const allocator_type& allocator);

    const ::nds::core::types::TimeStamp& getTime() const;
    ::nds::core::types::TimeStamp& getTime();
    void setTime(const ::nds::core::types::TimeStamp& time_);
    void setTime(::nds::core::types::TimeStamp&& time_);

    const ::zserio::vector<::nds::vehicle::reference::types::HorizonPathId>& getMpp() const;
    ::zserio::vector<::nds::vehicle::reference::types::HorizonPathId>& getMpp();
    void setMpp(const ::zserio::vector<::nds::vehicle::reference::types::HorizonPathId>& mpp_);
    void setMpp(::zserio::vector<::nds::vehicle::reference::types::HorizonPathId>&& mpp_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const MppTopic& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    using ZserioArrayType_mpp = ::zserio::Array<::zserio::vector<::nds::vehicle::reference::types::HorizonPathId>, ::zserio::VarIntNNArrayTraits<::nds::vehicle::reference::types::HorizonPathId>, ::zserio::ArrayType::AUTO>;

    ::nds::core::types::TimeStamp readTime(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::types::TimeStamp readTime(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_mpp readMpp(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_mpp readMpp(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::types::TimeStamp m_time_;
    ZserioArrayType_mpp m_mpp_;
};

} // namespace topics
} // namespace vehicle
} // namespace nds

#endif // NDS_VEHICLE_TOPICS_MPP_TOPIC_H
