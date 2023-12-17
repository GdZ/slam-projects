/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROAD_REFERENCE_TYPES_TRANSITION_PATH_REFERENCE_H
#define NDS_ROAD_REFERENCE_TYPES_TRANSITION_PATH_REFERENCE_H

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

#include <nds/road/reference/types/DirectedRoadReference.h>

namespace nds
{
namespace road
{
namespace reference
{
namespace types
{

class TransitionPathReference
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumRoads()
        {
            return m_numRoads_;
        }

    private:
        ::zserio::DeltaContext m_numRoads_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    TransitionPathReference() noexcept :
            TransitionPathReference(allocator_type())
    {}

    explicit TransitionPathReference(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_roads = ::zserio::vector<::nds::road::reference::types::DirectedRoadReference>>
    TransitionPathReference(
            uint8_t numRoads_,
            ZSERIO_T_roads&& roads_,
            const allocator_type& allocator = allocator_type()) :
            TransitionPathReference(allocator)
    {
        m_numRoads_ = numRoads_;
        m_roads_ = ZserioArrayType_roads(::std::forward<ZSERIO_T_roads>(roads_));
    }

    explicit TransitionPathReference(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit TransitionPathReference(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~TransitionPathReference() = default;

    TransitionPathReference(const TransitionPathReference&) = default;
    TransitionPathReference& operator=(const TransitionPathReference&) = default;

    TransitionPathReference(TransitionPathReference&&) = default;
    TransitionPathReference& operator=(TransitionPathReference&&) = default;

    TransitionPathReference(::zserio::PropagateAllocatorT,
            const TransitionPathReference& other, const allocator_type& allocator);

    uint8_t getNumRoads() const;
    void setNumRoads(uint8_t numRoads_);

    const ::zserio::vector<::nds::road::reference::types::DirectedRoadReference>& getRoads() const;
    ::zserio::vector<::nds::road::reference::types::DirectedRoadReference>& getRoads();
    void setRoads(const ::zserio::vector<::nds::road::reference::types::DirectedRoadReference>& roads_);
    void setRoads(::zserio::vector<::nds::road::reference::types::DirectedRoadReference>&& roads_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const TransitionPathReference& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_roads
    {
    public:
        using OwnerType = TransitionPathReference;

        static void create(TransitionPathReference& owner,
                ::zserio::vector<::nds::road::reference::types::DirectedRoadReference>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(TransitionPathReference& owner,
                ::zserio::vector<::nds::road::reference::types::DirectedRoadReference>& array,
                ::nds::road::reference::types::DirectedRoadReference::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_roads = ::zserio::Array<::zserio::vector<::nds::road::reference::types::DirectedRoadReference>, ::zserio::ObjectArrayTraits<::nds::road::reference::types::DirectedRoadReference, ZserioElementFactory_roads>, ::zserio::ArrayType::NORMAL>;

    uint8_t readNumRoads(::zserio::BitStreamReader& in);
    uint8_t readNumRoads(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_roads readRoads(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_roads readRoads(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint8_t m_numRoads_;
    ZserioArrayType_roads m_roads_;
};

} // namespace types
} // namespace reference
} // namespace road
} // namespace nds

#endif // NDS_ROAD_REFERENCE_TYPES_TRANSITION_PATH_REFERENCE_H