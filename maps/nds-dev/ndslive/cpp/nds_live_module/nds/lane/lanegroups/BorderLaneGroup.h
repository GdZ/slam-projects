/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_LANEGROUPS_BORDER_LANE_GROUP_H
#define NDS_LANE_LANEGROUPS_BORDER_LANE_GROUP_H

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

#include <nds/lane/lanegroups/LaneGroupConnector.h>
#include <nds/lane/lanes/ZeroLengthLane.h>

namespace nds
{
namespace lane
{
namespace lanegroups
{

class BorderLaneGroup
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::lane::lanegroups::LaneGroupConnector::ZserioPackingContext& getEndConnectorBorder()
        {
            return m_endConnectorBorder_;
        }

    private:
        ::nds::lane::lanegroups::LaneGroupConnector::ZserioPackingContext m_endConnectorBorder_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    BorderLaneGroup() noexcept :
            BorderLaneGroup(allocator_type())
    {}

    explicit BorderLaneGroup(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_startConnector = ::zserio::vector<::nds::lane::lanegroups::LaneGroupConnector>,
            typename ZSERIO_T_endConnectorBorder = ::nds::lane::lanegroups::LaneGroupConnector,
            typename ZSERIO_T_lanes = ::zserio::vector<::nds::lane::lanes::ZeroLengthLane>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_startConnector, BorderLaneGroup, allocator_type> = 0>
    BorderLaneGroup(
            ZSERIO_T_startConnector&& startConnector_,
            ZSERIO_T_endConnectorBorder&& endConnectorBorder_,
            ZSERIO_T_lanes&& lanes_,
            const allocator_type& allocator = allocator_type()) :
            BorderLaneGroup(allocator)
    {
        m_startConnector_ = ZserioArrayType_startConnector(::std::forward<ZSERIO_T_startConnector>(startConnector_));
        m_endConnectorBorder_ = ::std::forward<ZSERIO_T_endConnectorBorder>(endConnectorBorder_);
        m_lanes_ = ZserioArrayType_lanes(::std::forward<ZSERIO_T_lanes>(lanes_));
    }

    explicit BorderLaneGroup(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit BorderLaneGroup(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~BorderLaneGroup() = default;

    BorderLaneGroup(const BorderLaneGroup& other);
    BorderLaneGroup& operator=(const BorderLaneGroup& other);

    BorderLaneGroup(BorderLaneGroup&& other);
    BorderLaneGroup& operator=(BorderLaneGroup&& other);

    BorderLaneGroup(::zserio::PropagateAllocatorT,
            const BorderLaneGroup& other, const allocator_type& allocator);

    void initializeChildren();

    const ::zserio::vector<::nds::lane::lanegroups::LaneGroupConnector>& getStartConnector() const;
    ::zserio::vector<::nds::lane::lanegroups::LaneGroupConnector>& getStartConnector();
    void setStartConnector(const ::zserio::vector<::nds::lane::lanegroups::LaneGroupConnector>& startConnector_);
    void setStartConnector(::zserio::vector<::nds::lane::lanegroups::LaneGroupConnector>&& startConnector_);

    const ::nds::lane::lanegroups::LaneGroupConnector& getEndConnectorBorder() const;
    ::nds::lane::lanegroups::LaneGroupConnector& getEndConnectorBorder();
    void setEndConnectorBorder(const ::nds::lane::lanegroups::LaneGroupConnector& endConnectorBorder_);
    void setEndConnectorBorder(::nds::lane::lanegroups::LaneGroupConnector&& endConnectorBorder_);

    const ::zserio::vector<::nds::lane::lanes::ZeroLengthLane>& getLanes() const;
    ::zserio::vector<::nds::lane::lanes::ZeroLengthLane>& getLanes();
    void setLanes(const ::zserio::vector<::nds::lane::lanes::ZeroLengthLane>& lanes_);
    void setLanes(::zserio::vector<::nds::lane::lanes::ZeroLengthLane>&& lanes_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const BorderLaneGroup& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_startConnector
    {
    public:
        using OwnerType = BorderLaneGroup;

        static void initializeElement(BorderLaneGroup& owner,
                ::nds::lane::lanegroups::LaneGroupConnector& element, size_t index);
    };

    class ZserioElementFactory_startConnector
    {
    public:
        using OwnerType = BorderLaneGroup;

        static void create(BorderLaneGroup& owner,
                ::zserio::vector<::nds::lane::lanegroups::LaneGroupConnector>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(BorderLaneGroup& owner,
                ::zserio::vector<::nds::lane::lanegroups::LaneGroupConnector>& array,
                ::nds::lane::lanegroups::LaneGroupConnector::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_lanes
    {
    public:
        using OwnerType = BorderLaneGroup;

        static void initializeElement(BorderLaneGroup& owner,
                ::nds::lane::lanes::ZeroLengthLane& element, size_t index);
    };

    class ZserioElementFactory_lanes
    {
    public:
        using OwnerType = BorderLaneGroup;

        static void create(BorderLaneGroup& owner,
                ::zserio::vector<::nds::lane::lanes::ZeroLengthLane>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(BorderLaneGroup& owner,
                ::zserio::vector<::nds::lane::lanes::ZeroLengthLane>& array,
                ::nds::lane::lanes::ZeroLengthLane::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_startConnector = ::zserio::Array<::zserio::vector<::nds::lane::lanegroups::LaneGroupConnector>, ::zserio::ObjectArrayTraits<::nds::lane::lanegroups::LaneGroupConnector, ZserioElementFactory_startConnector>, ::zserio::ArrayType::AUTO, ZserioArrayExpressions_startConnector>;
    using ZserioArrayType_lanes = ::zserio::Array<::zserio::vector<::nds::lane::lanes::ZeroLengthLane>, ::zserio::ObjectArrayTraits<::nds::lane::lanes::ZeroLengthLane, ZserioElementFactory_lanes>, ::zserio::ArrayType::AUTO, ZserioArrayExpressions_lanes>;

    ZserioArrayType_startConnector readStartConnector(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_startConnector readStartConnector(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::lane::lanegroups::LaneGroupConnector readEndConnectorBorder(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::lane::lanegroups::LaneGroupConnector readEndConnectorBorder(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_lanes readLanes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_lanes readLanes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ZserioArrayType_startConnector m_startConnector_;
    ::nds::lane::lanegroups::LaneGroupConnector m_endConnectorBorder_;
    ZserioArrayType_lanes m_lanes_;
};

} // namespace lanegroups
} // namespace lane
} // namespace nds

#endif // NDS_LANE_LANEGROUPS_BORDER_LANE_GROUP_H