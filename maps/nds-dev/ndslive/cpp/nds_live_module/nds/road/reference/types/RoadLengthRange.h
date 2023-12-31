/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROAD_REFERENCE_TYPES_ROAD_LENGTH_RANGE_H
#define NDS_ROAD_REFERENCE_TYPES_ROAD_LENGTH_RANGE_H

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

#include <nds/core/types/Range.h>
#include <nds/road/reference/types/RoadLength.h>

namespace nds
{
namespace road
{
namespace reference
{
namespace types
{

class RoadLengthRange
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getLength()
        {
            return m_length_;
        }

        ::nds::core::types::Range::ZserioPackingContext& getRange()
        {
            return m_range_;
        }

    private:
        ::zserio::DeltaContext m_length_;
        ::nds::core::types::Range::ZserioPackingContext m_range_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoadLengthRange() noexcept :
            RoadLengthRange(allocator_type())
    {}

    explicit RoadLengthRange(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_range = ::nds::core::types::Range>
    RoadLengthRange(
            ::nds::road::reference::types::RoadLength length_,
            ZSERIO_T_range&& range_,
            const allocator_type& allocator = allocator_type()) :
            RoadLengthRange(allocator)
    {
        m_length_ = length_;
        m_range_ = ::std::forward<ZSERIO_T_range>(range_);
    }

    explicit RoadLengthRange(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RoadLengthRange(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RoadLengthRange() = default;

    RoadLengthRange(const RoadLengthRange& other);
    RoadLengthRange& operator=(const RoadLengthRange& other);

    RoadLengthRange(RoadLengthRange&& other);
    RoadLengthRange& operator=(RoadLengthRange&& other);

    RoadLengthRange(::zserio::PropagateAllocatorT,
            const RoadLengthRange& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::road::reference::types::RoadLength getLength() const;
    void setLength(::nds::road::reference::types::RoadLength length_);

    const ::nds::core::types::Range& getRange() const;
    ::nds::core::types::Range& getRange();
    void setRange(const ::nds::core::types::Range& range_);
    void setRange(::nds::core::types::Range&& range_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoadLengthRange& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::road::reference::types::RoadLength readLength(::zserio::BitStreamReader& in);
    ::nds::road::reference::types::RoadLength readLength(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::types::Range readRange(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::types::Range readRange(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::road::reference::types::RoadLength m_length_;
    ::nds::core::types::Range m_range_;
};

} // namespace types
} // namespace reference
} // namespace road
} // namespace nds

#endif // NDS_ROAD_REFERENCE_TYPES_ROAD_LENGTH_RANGE_H
