/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_BOUNDARIES_PHYSICAL_MARKING_BOUNDARY_ELEMENT_H
#define NDS_LANE_BOUNDARIES_PHYSICAL_MARKING_BOUNDARY_ELEMENT_H

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

#include <nds/lane/boundaries/BoundaryWidth.h>
#include <nds/lane/types/PhysicalBoundaryMaterial.h>
#include <nds/lane/types/PhysicalMarkingBoundaryType.h>

namespace nds
{
namespace lane
{
namespace boundaries
{

class PhysicalMarkingBoundaryElement
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getType()
        {
            return m_type_;
        }

        ::zserio::DeltaContext& getMaterial()
        {
            return m_material_;
        }

        ::zserio::DeltaContext& getWidth()
        {
            return m_width_;
        }

    private:
        ::zserio::DeltaContext m_type_;
        ::zserio::DeltaContext m_material_;
        ::zserio::DeltaContext m_width_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    PhysicalMarkingBoundaryElement() noexcept :
            PhysicalMarkingBoundaryElement(allocator_type())
    {}

    explicit PhysicalMarkingBoundaryElement(const allocator_type& allocator) noexcept;

    PhysicalMarkingBoundaryElement(
            ::nds::lane::types::PhysicalMarkingBoundaryType type_,
            ::nds::lane::types::PhysicalBoundaryMaterial material_,
            ::nds::lane::boundaries::BoundaryWidth width_,
            const allocator_type& allocator = allocator_type()) :
            PhysicalMarkingBoundaryElement(allocator)
    {
        m_type_ = type_;
        m_material_ = material_;
        m_width_ = width_;
    }

    explicit PhysicalMarkingBoundaryElement(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit PhysicalMarkingBoundaryElement(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~PhysicalMarkingBoundaryElement() = default;

    PhysicalMarkingBoundaryElement(const PhysicalMarkingBoundaryElement&) = default;
    PhysicalMarkingBoundaryElement& operator=(const PhysicalMarkingBoundaryElement&) = default;

    PhysicalMarkingBoundaryElement(PhysicalMarkingBoundaryElement&&) = default;
    PhysicalMarkingBoundaryElement& operator=(PhysicalMarkingBoundaryElement&&) = default;

    PhysicalMarkingBoundaryElement(::zserio::PropagateAllocatorT,
            const PhysicalMarkingBoundaryElement& other, const allocator_type& allocator);

    ::nds::lane::types::PhysicalMarkingBoundaryType getType() const;
    void setType(::nds::lane::types::PhysicalMarkingBoundaryType type_);

    ::nds::lane::types::PhysicalBoundaryMaterial getMaterial() const;
    void setMaterial(::nds::lane::types::PhysicalBoundaryMaterial material_);

    ::nds::lane::boundaries::BoundaryWidth getWidth() const;
    void setWidth(::nds::lane::boundaries::BoundaryWidth width_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const PhysicalMarkingBoundaryElement& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::lane::types::PhysicalMarkingBoundaryType readType(::zserio::BitStreamReader& in);
    ::nds::lane::types::PhysicalMarkingBoundaryType readType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::lane::types::PhysicalBoundaryMaterial readMaterial(::zserio::BitStreamReader& in);
    ::nds::lane::types::PhysicalBoundaryMaterial readMaterial(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::lane::boundaries::BoundaryWidth readWidth(::zserio::BitStreamReader& in);
    ::nds::lane::boundaries::BoundaryWidth readWidth(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::lane::types::PhysicalMarkingBoundaryType m_type_;
    ::nds::lane::types::PhysicalBoundaryMaterial m_material_;
    ::nds::lane::boundaries::BoundaryWidth m_width_;
};

} // namespace boundaries
} // namespace lane
} // namespace nds

#endif // NDS_LANE_BOUNDARIES_PHYSICAL_MARKING_BOUNDARY_ELEMENT_H
