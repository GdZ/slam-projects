/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_BOUNDARIES_BOUNDARY_SET_H
#define NDS_LANE_BOUNDARIES_BOUNDARY_SET_H

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

#include <nds/lane/boundaries/BoundaryElementId.h>
#include <nds/lane/boundaries/BoundaryReferenceWithPosition.h>
#include <nds/lane/reference/types/LaneGeometryPosition.h>

namespace nds
{
namespace lane
{
namespace boundaries
{

class BoundarySet
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getStartPosition()
        {
            return m_startPosition_;
        }

    private:
        ::zserio::DeltaContext m_startPosition_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    BoundarySet() noexcept :
            BoundarySet(allocator_type())
    {}

    explicit BoundarySet(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_boundariesWithStartPosition = ::zserio::vector<::nds::lane::boundaries::BoundaryReferenceWithPosition>,
            typename ZSERIO_T_boundaryTypes = ::zserio::vector<::nds::lane::boundaries::BoundaryElementId>>
    BoundarySet(
            ::nds::lane::reference::types::LaneGeometryPosition startPosition_,
            ZSERIO_T_boundariesWithStartPosition&& boundariesWithStartPosition_,
            ZSERIO_T_boundaryTypes&& boundaryTypes_,
            const allocator_type& allocator = allocator_type()) :
            BoundarySet(allocator)
    {
        m_startPosition_ = startPosition_;
        m_boundariesWithStartPosition_ = ::zserio::createOptionalArray<ZserioArrayType_boundariesWithStartPosition>(::std::forward<ZSERIO_T_boundariesWithStartPosition>(boundariesWithStartPosition_));
        m_boundaryTypes_ = ::zserio::createOptionalArray<ZserioArrayType_boundaryTypes>(::std::forward<ZSERIO_T_boundaryTypes>(boundaryTypes_));
    }

    explicit BoundarySet(::zserio::BitStreamReader& in,
            bool hasGeometry_, const allocator_type& allocator = allocator_type());
    explicit BoundarySet(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            bool hasGeometry_, const allocator_type& allocator = allocator_type());

    ~BoundarySet() = default;

    BoundarySet(const BoundarySet& other);
    BoundarySet& operator=(const BoundarySet& other);

    BoundarySet(BoundarySet&& other);
    BoundarySet& operator=(BoundarySet&& other);

    BoundarySet(::zserio::PropagateAllocatorT,
            const BoundarySet& other, const allocator_type& allocator);

    void initialize(
            bool hasGeometry_);
    bool isInitialized() const;

    bool getHasGeometry() const;

    ::nds::lane::reference::types::LaneGeometryPosition getStartPosition() const;
    void setStartPosition(::nds::lane::reference::types::LaneGeometryPosition startPosition_);

    const ::zserio::vector<::nds::lane::boundaries::BoundaryReferenceWithPosition>& getBoundariesWithStartPosition() const;
    ::zserio::vector<::nds::lane::boundaries::BoundaryReferenceWithPosition>& getBoundariesWithStartPosition();
    void setBoundariesWithStartPosition(const ::zserio::vector<::nds::lane::boundaries::BoundaryReferenceWithPosition>& boundariesWithStartPosition_);
    void setBoundariesWithStartPosition(::zserio::vector<::nds::lane::boundaries::BoundaryReferenceWithPosition>&& boundariesWithStartPosition_);
    bool isBoundariesWithStartPositionUsed() const;
    bool isBoundariesWithStartPositionSet() const;
    void resetBoundariesWithStartPosition();

    const ::zserio::vector<::nds::lane::boundaries::BoundaryElementId>& getBoundaryTypes() const;
    ::zserio::vector<::nds::lane::boundaries::BoundaryElementId>& getBoundaryTypes();
    void setBoundaryTypes(const ::zserio::vector<::nds::lane::boundaries::BoundaryElementId>& boundaryTypes_);
    void setBoundaryTypes(::zserio::vector<::nds::lane::boundaries::BoundaryElementId>&& boundaryTypes_);
    bool isBoundaryTypesUsed() const;
    bool isBoundaryTypesSet() const;
    void resetBoundaryTypes();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const BoundarySet& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_boundariesWithStartPosition
    {
    public:
        using OwnerType = BoundarySet;

        static void create(BoundarySet& owner,
                ::zserio::vector<::nds::lane::boundaries::BoundaryReferenceWithPosition>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(BoundarySet& owner,
                ::zserio::vector<::nds::lane::boundaries::BoundaryReferenceWithPosition>& array,
                ::nds::lane::boundaries::BoundaryReferenceWithPosition::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_boundariesWithStartPosition = ::zserio::Array<::zserio::vector<::nds::lane::boundaries::BoundaryReferenceWithPosition>, ::zserio::ObjectArrayTraits<::nds::lane::boundaries::BoundaryReferenceWithPosition, ZserioElementFactory_boundariesWithStartPosition>, ::zserio::ArrayType::AUTO>;
    using ZserioArrayType_boundaryTypes = ::zserio::Array<::zserio::vector<::nds::lane::boundaries::BoundaryElementId>, ::zserio::VarIntNNArrayTraits<::nds::lane::boundaries::BoundaryElementId>, ::zserio::ArrayType::AUTO>;

    ::nds::lane::reference::types::LaneGeometryPosition readStartPosition(::zserio::BitStreamReader& in);
    ::nds::lane::reference::types::LaneGeometryPosition readStartPosition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_boundariesWithStartPosition> readBoundariesWithStartPosition(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_boundariesWithStartPosition> readBoundariesWithStartPosition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_boundaryTypes> readBoundaryTypes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_boundaryTypes> readBoundaryTypes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_hasGeometry_;
    bool m_isInitialized;
    ::nds::lane::reference::types::LaneGeometryPosition m_startPosition_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_boundariesWithStartPosition> m_boundariesWithStartPosition_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_boundaryTypes> m_boundaryTypes_;
};

} // namespace boundaries
} // namespace lane
} // namespace nds

#endif // NDS_LANE_BOUNDARIES_BOUNDARY_SET_H
