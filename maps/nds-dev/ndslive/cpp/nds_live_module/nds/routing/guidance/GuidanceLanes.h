/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_GUIDANCE_GUIDANCE_LANES_H
#define NDS_ROUTING_GUIDANCE_GUIDANCE_LANES_H

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
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Types.h>
#include <zserio/Vector.h>

#include <nds/routing/guidance/GuidanceLaneMarking.h>

namespace nds
{
namespace routing
{
namespace guidance
{

class GuidanceLanes
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumLanes()
        {
            return m_numLanes_;
        }

    private:
        ::zserio::DeltaContext m_numLanes_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    GuidanceLanes() noexcept :
            GuidanceLanes(allocator_type())
    {}

    explicit GuidanceLanes(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_active = ::zserio::vector<bool>,
            typename ZSERIO_T_markings = ::zserio::vector<::nds::routing::guidance::GuidanceLaneMarking>>
    GuidanceLanes(
            uint8_t numLanes_,
            ZSERIO_T_active&& active_,
            ZSERIO_T_markings&& markings_,
            const allocator_type& allocator = allocator_type()) :
            GuidanceLanes(allocator)
    {
        m_numLanes_ = numLanes_;
        m_active_ = ZserioArrayType_active(::std::forward<ZSERIO_T_active>(active_));
        m_markings_ = ::zserio::createOptionalArray<ZserioArrayType_markings>(::std::forward<ZSERIO_T_markings>(markings_));
    }

    explicit GuidanceLanes(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit GuidanceLanes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~GuidanceLanes() = default;

    GuidanceLanes(const GuidanceLanes&) = default;
    GuidanceLanes& operator=(const GuidanceLanes&) = default;

    GuidanceLanes(GuidanceLanes&&) = default;
    GuidanceLanes& operator=(GuidanceLanes&&) = default;

    GuidanceLanes(::zserio::PropagateAllocatorT,
            const GuidanceLanes& other, const allocator_type& allocator);

    uint8_t getNumLanes() const;
    void setNumLanes(uint8_t numLanes_);

    const ::zserio::vector<bool>& getActive() const;
    ::zserio::vector<bool>& getActive();
    void setActive(const ::zserio::vector<bool>& active_);
    void setActive(::zserio::vector<bool>&& active_);

    const ::zserio::vector<::nds::routing::guidance::GuidanceLaneMarking>& getMarkings() const;
    ::zserio::vector<::nds::routing::guidance::GuidanceLaneMarking>& getMarkings();
    void setMarkings(const ::zserio::vector<::nds::routing::guidance::GuidanceLaneMarking>& markings_);
    void setMarkings(::zserio::vector<::nds::routing::guidance::GuidanceLaneMarking>&& markings_);
    bool isMarkingsUsed() const;
    bool isMarkingsSet() const;
    void resetMarkings();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const GuidanceLanes& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    using ZserioArrayType_active = ::zserio::Array<::zserio::vector<bool>, ::zserio::BoolArrayTraits, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_markings = ::zserio::Array<::zserio::vector<::nds::routing::guidance::GuidanceLaneMarking>, ::zserio::BitmaskArrayTraits<::nds::routing::guidance::GuidanceLaneMarking>, ::zserio::ArrayType::NORMAL>;

    uint8_t readNumLanes(::zserio::BitStreamReader& in);
    uint8_t readNumLanes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_active readActive(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_markings> readMarkings(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_markings> readMarkings(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint8_t m_numLanes_;
    ZserioArrayType_active m_active_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_markings> m_markings_;
};

} // namespace guidance
} // namespace routing
} // namespace nds

#endif // NDS_ROUTING_GUIDANCE_GUIDANCE_LANES_H