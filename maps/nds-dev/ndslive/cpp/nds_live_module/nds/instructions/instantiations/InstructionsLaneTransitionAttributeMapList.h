/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_INSTRUCTIONS_INSTANTIATIONS_INSTRUCTIONS_LANE_TRANSITION_ATTRIBUTE_MAP_LIST_H
#define NDS_INSTRUCTIONS_INSTANTIATIONS_INSTRUCTIONS_LANE_TRANSITION_ATTRIBUTE_MAP_LIST_H

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
#include <zserio/Types.h>
#include <zserio/Vector.h>

#include <nds/core/geometry/CoordShift.h>
#include <nds/instructions/instantiations/InstructionsLaneTransitionAttributeMap.h>
#include <nds/instructions/instantiations/InstructionsLaneTransitionAttributeMapListHeader.h>

namespace nds
{
namespace instructions
{
namespace instantiations
{

class InstructionsLaneTransitionAttributeMapList
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumMaps()
        {
            return m_numMaps_;
        }

        ::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMapListHeader::ZserioPackingContext& getHeader()
        {
            return m_header_;
        }

    private:
        ::zserio::DeltaContext m_numMaps_;
        ::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMapListHeader::ZserioPackingContext m_header_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    InstructionsLaneTransitionAttributeMapList() noexcept :
            InstructionsLaneTransitionAttributeMapList(allocator_type())
    {}

    explicit InstructionsLaneTransitionAttributeMapList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_header = ::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMapListHeader,
            typename ZSERIO_T_maps = ::zserio::vector<::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMap>>
    InstructionsLaneTransitionAttributeMapList(
            uint32_t numMaps_,
            ZSERIO_T_header&& header_,
            ZSERIO_T_maps&& maps_,
            const allocator_type& allocator = allocator_type()) :
            InstructionsLaneTransitionAttributeMapList(allocator)
    {
        m_numMaps_ = numMaps_;
        m_header_ = ::std::forward<ZSERIO_T_header>(header_);
        m_maps_ = ZserioArrayType_maps(::std::forward<ZSERIO_T_maps>(maps_));
    }

    explicit InstructionsLaneTransitionAttributeMapList(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit InstructionsLaneTransitionAttributeMapList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~InstructionsLaneTransitionAttributeMapList() = default;

    InstructionsLaneTransitionAttributeMapList(const InstructionsLaneTransitionAttributeMapList& other);
    InstructionsLaneTransitionAttributeMapList& operator=(const InstructionsLaneTransitionAttributeMapList& other);

    InstructionsLaneTransitionAttributeMapList(InstructionsLaneTransitionAttributeMapList&& other);
    InstructionsLaneTransitionAttributeMapList& operator=(InstructionsLaneTransitionAttributeMapList&& other);

    InstructionsLaneTransitionAttributeMapList(::zserio::PropagateAllocatorT,
            const InstructionsLaneTransitionAttributeMapList& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    uint32_t getNumMaps() const;
    void setNumMaps(uint32_t numMaps_);

    const ::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMapListHeader& getHeader() const;
    ::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMapListHeader& getHeader();
    void setHeader(const ::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMapListHeader& header_);
    void setHeader(::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMapListHeader&& header_);

    const ::zserio::vector<::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMap>& getMaps() const;
    ::zserio::vector<::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMap>& getMaps();
    void setMaps(const ::zserio::vector<::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMap>& maps_);
    void setMaps(::zserio::vector<::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMap>&& maps_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const InstructionsLaneTransitionAttributeMapList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_maps
    {
    public:
        using OwnerType = InstructionsLaneTransitionAttributeMapList;

        static void initializeElement(InstructionsLaneTransitionAttributeMapList& owner,
                ::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMap& element, size_t index);
    };

    class ZserioElementFactory_maps
    {
    public:
        using OwnerType = InstructionsLaneTransitionAttributeMapList;

        static void create(InstructionsLaneTransitionAttributeMapList& owner,
                ::zserio::vector<::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMap>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(InstructionsLaneTransitionAttributeMapList& owner,
                ::zserio::vector<::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMap>& array,
                ::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMap::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_maps = ::zserio::Array<::zserio::vector<::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMap>, ::zserio::ObjectArrayTraits<::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMap, ZserioElementFactory_maps>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_maps>;

    uint32_t readNumMaps(::zserio::BitStreamReader& in);
    uint32_t readNumMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMapListHeader readHeader(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMapListHeader readHeader(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_maps readMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_maps readMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_coordShift_;
    bool m_isInitialized;
    uint32_t m_numMaps_;
    ::nds::instructions::instantiations::InstructionsLaneTransitionAttributeMapListHeader m_header_;
    ZserioArrayType_maps m_maps_;
};

} // namespace instantiations
} // namespace instructions
} // namespace nds

#endif // NDS_INSTRUCTIONS_INSTANTIATIONS_INSTRUCTIONS_LANE_TRANSITION_ATTRIBUTE_MAP_LIST_H
