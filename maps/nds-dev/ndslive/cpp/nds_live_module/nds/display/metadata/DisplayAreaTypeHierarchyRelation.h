/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_METADATA_DISPLAY_AREA_TYPE_HIERARCHY_RELATION_H
#define NDS_DISPLAY_METADATA_DISPLAY_AREA_TYPE_HIERARCHY_RELATION_H

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

#include <nds/display/types/DisplayAreaType.h>

namespace nds
{
namespace display
{
namespace metadata
{

class DisplayAreaTypeHierarchyRelation
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getParent()
        {
            return m_parent_;
        }

    private:
        ::zserio::DeltaContext m_parent_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    DisplayAreaTypeHierarchyRelation() noexcept :
            DisplayAreaTypeHierarchyRelation(allocator_type())
    {}

    explicit DisplayAreaTypeHierarchyRelation(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_children = ::zserio::vector<::nds::display::types::DisplayAreaType>>
    DisplayAreaTypeHierarchyRelation(
            ::nds::display::types::DisplayAreaType parent_,
            ZSERIO_T_children&& children_,
            const allocator_type& allocator = allocator_type()) :
            DisplayAreaTypeHierarchyRelation(allocator)
    {
        m_parent_ = parent_;
        m_children_ = ZserioArrayType_children(::std::forward<ZSERIO_T_children>(children_));
    }

    explicit DisplayAreaTypeHierarchyRelation(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit DisplayAreaTypeHierarchyRelation(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~DisplayAreaTypeHierarchyRelation() = default;

    DisplayAreaTypeHierarchyRelation(const DisplayAreaTypeHierarchyRelation&) = default;
    DisplayAreaTypeHierarchyRelation& operator=(const DisplayAreaTypeHierarchyRelation&) = default;

    DisplayAreaTypeHierarchyRelation(DisplayAreaTypeHierarchyRelation&&) = default;
    DisplayAreaTypeHierarchyRelation& operator=(DisplayAreaTypeHierarchyRelation&&) = default;

    DisplayAreaTypeHierarchyRelation(::zserio::PropagateAllocatorT,
            const DisplayAreaTypeHierarchyRelation& other, const allocator_type& allocator);

    ::nds::display::types::DisplayAreaType getParent() const;
    void setParent(::nds::display::types::DisplayAreaType parent_);

    const ::zserio::vector<::nds::display::types::DisplayAreaType>& getChildren() const;
    ::zserio::vector<::nds::display::types::DisplayAreaType>& getChildren();
    void setChildren(const ::zserio::vector<::nds::display::types::DisplayAreaType>& children_);
    void setChildren(::zserio::vector<::nds::display::types::DisplayAreaType>&& children_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DisplayAreaTypeHierarchyRelation& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    using ZserioArrayType_children = ::zserio::Array<::zserio::vector<::nds::display::types::DisplayAreaType>, ::zserio::EnumArrayTraits<::nds::display::types::DisplayAreaType>, ::zserio::ArrayType::AUTO>;

    ::nds::display::types::DisplayAreaType readParent(::zserio::BitStreamReader& in);
    ::nds::display::types::DisplayAreaType readParent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_children readChildren(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_children readChildren(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::display::types::DisplayAreaType m_parent_;
    ZserioArrayType_children m_children_;
};

} // namespace metadata
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_METADATA_DISPLAY_AREA_TYPE_HIERARCHY_RELATION_H
