/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_BOUNDARIES_BOUNDARY_ELEMENT_DEFINITIONS_H
#define NDS_LANE_BOUNDARIES_BOUNDARY_ELEMENT_DEFINITIONS_H

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

#include <nds/lane/boundaries/BoundaryElement.h>

namespace nds
{
namespace lane
{
namespace boundaries
{

class BoundaryElementDefinitions
{
public:
    class ZserioPackingContext
    {
    };

    using allocator_type = ::std::allocator<uint8_t>;

    BoundaryElementDefinitions() noexcept :
            BoundaryElementDefinitions(allocator_type())
    {}

    explicit BoundaryElementDefinitions(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_boundaryElementList = ::zserio::vector<::nds::lane::boundaries::BoundaryElement>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_boundaryElementList, BoundaryElementDefinitions, allocator_type> = 0>
    explicit BoundaryElementDefinitions(
            ZSERIO_T_boundaryElementList&& boundaryElementList_,
            const allocator_type& allocator = allocator_type()) :
            BoundaryElementDefinitions(allocator)
    {
        m_boundaryElementList_ = ZserioArrayType_boundaryElementList(::std::forward<ZSERIO_T_boundaryElementList>(boundaryElementList_));
    }

    explicit BoundaryElementDefinitions(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit BoundaryElementDefinitions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~BoundaryElementDefinitions() = default;

    BoundaryElementDefinitions(const BoundaryElementDefinitions&) = default;
    BoundaryElementDefinitions& operator=(const BoundaryElementDefinitions&) = default;

    BoundaryElementDefinitions(BoundaryElementDefinitions&&) = default;
    BoundaryElementDefinitions& operator=(BoundaryElementDefinitions&&) = default;

    BoundaryElementDefinitions(::zserio::PropagateAllocatorT,
            const BoundaryElementDefinitions& other, const allocator_type& allocator);

    void initializeChildren();

    const ::zserio::vector<::nds::lane::boundaries::BoundaryElement>& getBoundaryElementList() const;
    ::zserio::vector<::nds::lane::boundaries::BoundaryElement>& getBoundaryElementList();
    void setBoundaryElementList(const ::zserio::vector<::nds::lane::boundaries::BoundaryElement>& boundaryElementList_);
    void setBoundaryElementList(::zserio::vector<::nds::lane::boundaries::BoundaryElement>&& boundaryElementList_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const BoundaryElementDefinitions& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_boundaryElementList
    {
    public:
        using OwnerType = BoundaryElementDefinitions;

        static void initializeElement(BoundaryElementDefinitions& owner,
                ::nds::lane::boundaries::BoundaryElement& element, size_t index);
    };

    class ZserioElementFactory_boundaryElementList
    {
    public:
        using OwnerType = BoundaryElementDefinitions;

        static void create(BoundaryElementDefinitions& owner,
                ::zserio::vector<::nds::lane::boundaries::BoundaryElement>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(BoundaryElementDefinitions& owner,
                ::zserio::vector<::nds::lane::boundaries::BoundaryElement>& array,
                ::nds::lane::boundaries::BoundaryElement::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_boundaryElementList = ::zserio::Array<::zserio::vector<::nds::lane::boundaries::BoundaryElement>, ::zserio::ObjectArrayTraits<::nds::lane::boundaries::BoundaryElement, ZserioElementFactory_boundaryElementList>, ::zserio::ArrayType::AUTO, ZserioArrayExpressions_boundaryElementList>;

    ZserioArrayType_boundaryElementList readBoundaryElementList(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_boundaryElementList readBoundaryElementList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ZserioArrayType_boundaryElementList m_boundaryElementList_;
};

} // namespace boundaries
} // namespace lane
} // namespace nds

#endif // NDS_LANE_BOUNDARIES_BOUNDARY_ELEMENT_DEFINITIONS_H