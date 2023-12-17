/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_REFERENCE_TYPES_LANE_GROUP_LOCATION_SEGMENT_H
#define NDS_LANE_REFERENCE_TYPES_LANE_GROUP_LOCATION_SEGMENT_H

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
#include <zserio/Vector.h>

#include <nds/core/location/LocationGeometry.h>
#include <nds/core/location/LocationSegment.h>
#include <nds/core/types/LaneType.h>
#include <nds/lane/reference/types/LanesInMask.h>

namespace nds
{
namespace lane
{
namespace reference
{
namespace types
{

class LaneGroupLocationSegment
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::location::LocationSegment::ZserioPackingContext& getLocationSegment()
        {
            return m_locationSegment_;
        }

        ::zserio::DeltaContext& getNumLanes()
        {
            return m_numLanes_;
        }

    private:
        ::nds::core::location::LocationSegment::ZserioPackingContext m_locationSegment_;
        ::zserio::DeltaContext m_numLanes_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LaneGroupLocationSegment() noexcept :
            LaneGroupLocationSegment(allocator_type())
    {}

    explicit LaneGroupLocationSegment(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_locationSegment = ::nds::core::location::LocationSegment,
            typename ZSERIO_T_laneTypes = ::zserio::vector<::nds::core::types::LaneType>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_locationSegment, LaneGroupLocationSegment, allocator_type> = 0>
    LaneGroupLocationSegment(
            ZSERIO_T_locationSegment&& locationSegment_,
            ::nds::lane::reference::types::LanesInMask numLanes_,
            ZSERIO_T_laneTypes&& laneTypes_,
            const allocator_type& allocator = allocator_type()) :
            LaneGroupLocationSegment(allocator)
    {
        m_locationSegment_ = ::std::forward<ZSERIO_T_locationSegment>(locationSegment_);
        m_numLanes_ = numLanes_;
        m_laneTypes_ = ::zserio::createOptionalArray<ZserioArrayType_laneTypes>(::std::forward<ZSERIO_T_laneTypes>(laneTypes_));
    }

    explicit LaneGroupLocationSegment(::zserio::BitStreamReader& in,
            ::nds::core::location::LocationGeometry& pathGeometry_, const allocator_type& allocator = allocator_type());
    explicit LaneGroupLocationSegment(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::location::LocationGeometry& pathGeometry_, const allocator_type& allocator = allocator_type());

    ~LaneGroupLocationSegment() = default;

    LaneGroupLocationSegment(const LaneGroupLocationSegment& other);
    LaneGroupLocationSegment& operator=(const LaneGroupLocationSegment& other);

    LaneGroupLocationSegment(LaneGroupLocationSegment&& other);
    LaneGroupLocationSegment& operator=(LaneGroupLocationSegment&& other);

    LaneGroupLocationSegment(::zserio::PropagateAllocatorT,
            const LaneGroupLocationSegment& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::location::LocationGeometry& pathGeometry_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::location::LocationGeometry& getPathGeometry();
    const ::nds::core::location::LocationGeometry& getPathGeometry() const;

    const ::nds::core::location::LocationSegment& getLocationSegment() const;
    ::nds::core::location::LocationSegment& getLocationSegment();
    void setLocationSegment(const ::nds::core::location::LocationSegment& locationSegment_);
    void setLocationSegment(::nds::core::location::LocationSegment&& locationSegment_);

    ::nds::lane::reference::types::LanesInMask getNumLanes() const;
    void setNumLanes(::nds::lane::reference::types::LanesInMask numLanes_);

    const ::zserio::vector<::nds::core::types::LaneType>& getLaneTypes() const;
    ::zserio::vector<::nds::core::types::LaneType>& getLaneTypes();
    void setLaneTypes(const ::zserio::vector<::nds::core::types::LaneType>& laneTypes_);
    void setLaneTypes(::zserio::vector<::nds::core::types::LaneType>&& laneTypes_);
    bool isLaneTypesUsed() const;
    bool isLaneTypesSet() const;
    void resetLaneTypes();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LaneGroupLocationSegment& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_laneTypes
    {
    public:
        using OwnerType = LaneGroupLocationSegment;

        static void create(LaneGroupLocationSegment& owner,
                ::zserio::vector<::nds::core::types::LaneType>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(LaneGroupLocationSegment& owner,
                ::zserio::vector<::nds::core::types::LaneType>& array,
                ::nds::core::types::LaneType::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_laneTypes = ::zserio::Array<::zserio::vector<::nds::core::types::LaneType>, ::zserio::ObjectArrayTraits<::nds::core::types::LaneType, ZserioElementFactory_laneTypes>, ::zserio::ArrayType::NORMAL>;

    ::nds::core::location::LocationSegment readLocationSegment(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::location::LocationSegment readLocationSegment(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::lane::reference::types::LanesInMask readNumLanes(::zserio::BitStreamReader& in);
    ::nds::lane::reference::types::LanesInMask readNumLanes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_laneTypes> readLaneTypes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_laneTypes> readLaneTypes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::location::LocationGeometry* m_pathGeometry_;
    bool m_isInitialized;
    ::nds::core::location::LocationSegment m_locationSegment_;
    ::nds::lane::reference::types::LanesInMask m_numLanes_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_laneTypes> m_laneTypes_;
};

} // namespace types
} // namespace reference
} // namespace lane
} // namespace nds

#endif // NDS_LANE_REFERENCE_TYPES_LANE_GROUP_LOCATION_SEGMENT_H