/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_INSTANTIATIONS_AREA_DISPLAY_GEOMETRY_LAYER_H
#define NDS_DISPLAY_INSTANTIATIONS_AREA_DISPLAY_GEOMETRY_LAYER_H

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

#include <nds/core/geometry/Buffers.h>
#include <nds/core/geometry/CoordShift.h>
#include <nds/core/geometry/GeometryLayerType.h>
#include <nds/display/reference/types/DisplayAreaId.h>
#include <nds/display/types/DisplayAreaType.h>

namespace nds
{
namespace display
{
namespace instantiations
{

class AreaDisplayGeometryLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getCoordShiftXY()
        {
            return m_coordShiftXY_;
        }

        ::zserio::DeltaContext& getCoordShiftZ()
        {
            return m_coordShiftZ_;
        }

        ::zserio::DeltaContext& getNumElements()
        {
            return m_numElements_;
        }

        ::nds::core::geometry::Buffers::ZserioPackingContext& getBuffers()
        {
            return m_buffers_;
        }

    private:
        ::zserio::DeltaContext m_coordShiftXY_;
        ::zserio::DeltaContext m_coordShiftZ_;
        ::zserio::DeltaContext m_numElements_;
        ::nds::core::geometry::Buffers::ZserioPackingContext m_buffers_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    AreaDisplayGeometryLayer() noexcept :
            AreaDisplayGeometryLayer(allocator_type())
    {}

    explicit AreaDisplayGeometryLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_identifier = ::zserio::vector<::nds::display::reference::types::DisplayAreaId>,
            typename ZSERIO_T_types = ::zserio::vector<::nds::display::types::DisplayAreaType>,
            typename ZSERIO_T_buffers = ::nds::core::geometry::Buffers>
    AreaDisplayGeometryLayer(
            ::nds::core::geometry::CoordShift coordShiftXY_,
            ::nds::core::geometry::CoordShift coordShiftZ_,
            uint32_t numElements_,
            ZSERIO_T_identifier&& identifier_,
            ZSERIO_T_types&& types_,
            ZSERIO_T_buffers&& buffers_,
            const allocator_type& allocator = allocator_type()) :
            AreaDisplayGeometryLayer(allocator)
    {
        m_coordShiftXY_ = coordShiftXY_;
        m_coordShiftZ_ = coordShiftZ_;
        m_numElements_ = numElements_;
        m_identifier_ = ::zserio::createOptionalArray<ZserioArrayType_identifier>(::std::forward<ZSERIO_T_identifier>(identifier_));
        m_types_ = ::zserio::createOptionalArray<ZserioArrayType_types>(::std::forward<ZSERIO_T_types>(types_));
        m_buffers_ = ::std::forward<ZSERIO_T_buffers>(buffers_);
    }

    explicit AreaDisplayGeometryLayer(::zserio::BitStreamReader& in,
            ::nds::core::geometry::GeometryLayerType type_,
            bool hasIds_,
            bool hasTypes_, const allocator_type& allocator = allocator_type());
    explicit AreaDisplayGeometryLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::GeometryLayerType type_,
            bool hasIds_,
            bool hasTypes_, const allocator_type& allocator = allocator_type());

    ~AreaDisplayGeometryLayer() = default;

    AreaDisplayGeometryLayer(const AreaDisplayGeometryLayer& other);
    AreaDisplayGeometryLayer& operator=(const AreaDisplayGeometryLayer& other);

    AreaDisplayGeometryLayer(AreaDisplayGeometryLayer&& other);
    AreaDisplayGeometryLayer& operator=(AreaDisplayGeometryLayer&& other);

    AreaDisplayGeometryLayer(::zserio::PropagateAllocatorT,
            const AreaDisplayGeometryLayer& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::GeometryLayerType type_,
            bool hasIds_,
            bool hasTypes_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::GeometryLayerType getType() const;

    bool getHasIds() const;

    bool getHasTypes() const;

    ::nds::core::geometry::CoordShift getCoordShiftXY() const;
    void setCoordShiftXY(::nds::core::geometry::CoordShift coordShiftXY_);

    ::nds::core::geometry::CoordShift getCoordShiftZ() const;
    void setCoordShiftZ(::nds::core::geometry::CoordShift coordShiftZ_);

    uint32_t getNumElements() const;
    void setNumElements(uint32_t numElements_);

    const ::zserio::vector<::nds::display::reference::types::DisplayAreaId>& getIdentifier() const;
    ::zserio::vector<::nds::display::reference::types::DisplayAreaId>& getIdentifier();
    void setIdentifier(const ::zserio::vector<::nds::display::reference::types::DisplayAreaId>& identifier_);
    void setIdentifier(::zserio::vector<::nds::display::reference::types::DisplayAreaId>&& identifier_);
    bool isIdentifierUsed() const;
    bool isIdentifierSet() const;
    void resetIdentifier();

    const ::zserio::vector<::nds::display::types::DisplayAreaType>& getTypes() const;
    ::zserio::vector<::nds::display::types::DisplayAreaType>& getTypes();
    void setTypes(const ::zserio::vector<::nds::display::types::DisplayAreaType>& types_);
    void setTypes(::zserio::vector<::nds::display::types::DisplayAreaType>&& types_);
    bool isTypesUsed() const;
    bool isTypesSet() const;
    void resetTypes();

    const ::nds::core::geometry::Buffers& getBuffers() const;
    ::nds::core::geometry::Buffers& getBuffers();
    void setBuffers(const ::nds::core::geometry::Buffers& buffers_);
    void setBuffers(::nds::core::geometry::Buffers&& buffers_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const AreaDisplayGeometryLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_identifier
    {
    public:
        using OwnerType = AreaDisplayGeometryLayer;

        static void create(AreaDisplayGeometryLayer& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayAreaId>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(AreaDisplayGeometryLayer& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayAreaId>& array,
                ::nds::display::reference::types::DisplayAreaId::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_identifier = ::zserio::Array<::zserio::vector<::nds::display::reference::types::DisplayAreaId>, ::zserio::ObjectArrayTraits<::nds::display::reference::types::DisplayAreaId, ZserioElementFactory_identifier>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_types = ::zserio::Array<::zserio::vector<::nds::display::types::DisplayAreaType>, ::zserio::EnumArrayTraits<::nds::display::types::DisplayAreaType>, ::zserio::ArrayType::NORMAL>;

    ::nds::core::geometry::CoordShift readCoordShiftXY(::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordShift readCoordShiftXY(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordShift readCoordShiftZ(::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordShift readCoordShiftZ(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    uint32_t readNumElements(::zserio::BitStreamReader& in);
    uint32_t readNumElements(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_identifier> readIdentifier(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_identifier> readIdentifier(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_types> readTypes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_types> readTypes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::geometry::Buffers readBuffers(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::geometry::Buffers readBuffers(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::GeometryLayerType m_type_;
    bool m_hasIds_;
    bool m_hasTypes_;
    bool m_isInitialized;
    ::nds::core::geometry::CoordShift m_coordShiftXY_;
    ::nds::core::geometry::CoordShift m_coordShiftZ_;
    uint32_t m_numElements_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_identifier> m_identifier_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_types> m_types_;
    ::nds::core::geometry::Buffers m_buffers_;
};

} // namespace instantiations
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_INSTANTIATIONS_AREA_DISPLAY_GEOMETRY_LAYER_H
