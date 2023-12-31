/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_INSTRUCTIONS_INSTANTIATIONS_INSTRUCTIONS_TRANSITION_ATTRIBUTE_MAP_LIST_H
#define NDS_INSTRUCTIONS_INSTANTIATIONS_INSTRUCTIONS_TRANSITION_ATTRIBUTE_MAP_LIST_H

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
#include <nds/instructions/instantiations/InstructionsTransitionAttributeMap.h>
#include <nds/instructions/instantiations/InstructionsTransitionAttributeMapListHeader.h>

namespace nds
{
namespace instructions
{
namespace instantiations
{

class InstructionsTransitionAttributeMapList
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumMaps()
        {
            return m_numMaps_;
        }

        ::nds::instructions::instantiations::InstructionsTransitionAttributeMapListHeader::ZserioPackingContext& getHeader()
        {
            return m_header_;
        }

    private:
        ::zserio::DeltaContext m_numMaps_;
        ::nds::instructions::instantiations::InstructionsTransitionAttributeMapListHeader::ZserioPackingContext m_header_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    InstructionsTransitionAttributeMapList() noexcept :
            InstructionsTransitionAttributeMapList(allocator_type())
    {}

    explicit InstructionsTransitionAttributeMapList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_header = ::nds::instructions::instantiations::InstructionsTransitionAttributeMapListHeader,
            typename ZSERIO_T_maps = ::zserio::vector<::nds::instructions::instantiations::InstructionsTransitionAttributeMap>>
    InstructionsTransitionAttributeMapList(
            uint32_t numMaps_,
            ZSERIO_T_header&& header_,
            ZSERIO_T_maps&& maps_,
            const allocator_type& allocator = allocator_type()) :
            InstructionsTransitionAttributeMapList(allocator)
    {
        m_numMaps_ = numMaps_;
        m_header_ = ::std::forward<ZSERIO_T_header>(header_);
        m_maps_ = ZserioArrayType_maps(::std::forward<ZSERIO_T_maps>(maps_));
    }

    explicit InstructionsTransitionAttributeMapList(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit InstructionsTransitionAttributeMapList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~InstructionsTransitionAttributeMapList() = default;

    InstructionsTransitionAttributeMapList(const InstructionsTransitionAttributeMapList& other);
    InstructionsTransitionAttributeMapList& operator=(const InstructionsTransitionAttributeMapList& other);

    InstructionsTransitionAttributeMapList(InstructionsTransitionAttributeMapList&& other);
    InstructionsTransitionAttributeMapList& operator=(InstructionsTransitionAttributeMapList&& other);

    InstructionsTransitionAttributeMapList(::zserio::PropagateAllocatorT,
            const InstructionsTransitionAttributeMapList& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    uint32_t getNumMaps() const;
    void setNumMaps(uint32_t numMaps_);

    const ::nds::instructions::instantiations::InstructionsTransitionAttributeMapListHeader& getHeader() const;
    ::nds::instructions::instantiations::InstructionsTransitionAttributeMapListHeader& getHeader();
    void setHeader(const ::nds::instructions::instantiations::InstructionsTransitionAttributeMapListHeader& header_);
    void setHeader(::nds::instructions::instantiations::InstructionsTransitionAttributeMapListHeader&& header_);

    const ::zserio::vector<::nds::instructions::instantiations::InstructionsTransitionAttributeMap>& getMaps() const;
    ::zserio::vector<::nds::instructions::instantiations::InstructionsTransitionAttributeMap>& getMaps();
    void setMaps(const ::zserio::vector<::nds::instructions::instantiations::InstructionsTransitionAttributeMap>& maps_);
    void setMaps(::zserio::vector<::nds::instructions::instantiations::InstructionsTransitionAttributeMap>&& maps_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const InstructionsTransitionAttributeMapList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_maps
    {
    public:
        using OwnerType = InstructionsTransitionAttributeMapList;

        static void initializeElement(InstructionsTransitionAttributeMapList& owner,
                ::nds::instructions::instantiations::InstructionsTransitionAttributeMap& element, size_t index);
    };

    class ZserioElementFactory_maps
    {
    public:
        using OwnerType = InstructionsTransitionAttributeMapList;

        static void create(InstructionsTransitionAttributeMapList& owner,
                ::zserio::vector<::nds::instructions::instantiations::InstructionsTransitionAttributeMap>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(InstructionsTransitionAttributeMapList& owner,
                ::zserio::vector<::nds::instructions::instantiations::InstructionsTransitionAttributeMap>& array,
                ::nds::instructions::instantiations::InstructionsTransitionAttributeMap::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_maps = ::zserio::Array<::zserio::vector<::nds::instructions::instantiations::InstructionsTransitionAttributeMap>, ::zserio::ObjectArrayTraits<::nds::instructions::instantiations::InstructionsTransitionAttributeMap, ZserioElementFactory_maps>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_maps>;

    uint32_t readNumMaps(::zserio::BitStreamReader& in);
    uint32_t readNumMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::instructions::instantiations::InstructionsTransitionAttributeMapListHeader readHeader(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::instructions::instantiations::InstructionsTransitionAttributeMapListHeader readHeader(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_maps readMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_maps readMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_coordShift_;
    bool m_isInitialized;
    uint32_t m_numMaps_;
    ::nds::instructions::instantiations::InstructionsTransitionAttributeMapListHeader m_header_;
    ZserioArrayType_maps m_maps_;
};

} // namespace instantiations
} // namespace instructions
} // namespace nds

#endif // NDS_INSTRUCTIONS_INSTANTIATIONS_INSTRUCTIONS_TRANSITION_ATTRIBUTE_MAP_LIST_H
