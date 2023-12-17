/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LOCALIZATION_INSTANTIATIONS_OCCUPANCY_PROBABILITY_GRID_LAYER_H
#define NDS_LOCALIZATION_INSTANTIATIONS_OCCUPANCY_PROBABILITY_GRID_LAYER_H

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

#include <nds/core/geometry/CoordShift.h>
#include <nds/core/grid/GridCellSize.h>
#include <nds/core/grid/GridType.h>
#include <nds/core/grid/Grid_OccupancyProbability.h>
#include <nds/localization/types/OccupancyGridId.h>

namespace nds
{
namespace localization
{
namespace instantiations
{

class OccupancyProbabilityGridLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getCoordShiftXY()
        {
            return m_coordShiftXY_;
        }

        ::zserio::DeltaContext& getCellSize()
        {
            return m_cellSize_;
        }

        ::zserio::DeltaContext& getNumElements()
        {
            return m_numElements_;
        }

    private:
        ::zserio::DeltaContext m_coordShiftXY_;
        ::zserio::DeltaContext m_cellSize_;
        ::zserio::DeltaContext m_numElements_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    OccupancyProbabilityGridLayer() noexcept :
            OccupancyProbabilityGridLayer(allocator_type())
    {}

    explicit OccupancyProbabilityGridLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_identifier = ::zserio::vector<::nds::localization::types::OccupancyGridId>,
            typename ZSERIO_T_types = ::zserio::vector<::nds::core::grid::GridType>,
            typename ZSERIO_T_grids = ::zserio::vector<::nds::core::grid::Grid_OccupancyProbability>>
    OccupancyProbabilityGridLayer(
            ::nds::core::geometry::CoordShift coordShiftXY_,
            ::nds::core::grid::GridCellSize cellSize_,
            uint32_t numElements_,
            ZSERIO_T_identifier&& identifier_,
            ZSERIO_T_types&& types_,
            ZSERIO_T_grids&& grids_,
            const allocator_type& allocator = allocator_type()) :
            OccupancyProbabilityGridLayer(allocator)
    {
        m_coordShiftXY_ = coordShiftXY_;
        m_cellSize_ = cellSize_;
        m_numElements_ = numElements_;
        m_identifier_ = ::zserio::createOptionalArray<ZserioArrayType_identifier>(::std::forward<ZSERIO_T_identifier>(identifier_));
        m_types_ = ::zserio::createOptionalArray<ZserioArrayType_types>(::std::forward<ZSERIO_T_types>(types_));
        m_grids_ = ZserioArrayType_grids(::std::forward<ZSERIO_T_grids>(grids_));
    }

    explicit OccupancyProbabilityGridLayer(::zserio::BitStreamReader& in,
            bool hasIds_,
            bool hasTypes_, const allocator_type& allocator = allocator_type());
    explicit OccupancyProbabilityGridLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            bool hasIds_,
            bool hasTypes_, const allocator_type& allocator = allocator_type());

    ~OccupancyProbabilityGridLayer() = default;

    OccupancyProbabilityGridLayer(const OccupancyProbabilityGridLayer& other);
    OccupancyProbabilityGridLayer& operator=(const OccupancyProbabilityGridLayer& other);

    OccupancyProbabilityGridLayer(OccupancyProbabilityGridLayer&& other);
    OccupancyProbabilityGridLayer& operator=(OccupancyProbabilityGridLayer&& other);

    OccupancyProbabilityGridLayer(::zserio::PropagateAllocatorT,
            const OccupancyProbabilityGridLayer& other, const allocator_type& allocator);

    void initialize(
            bool hasIds_,
            bool hasTypes_);
    bool isInitialized() const;
    void initializeChildren();

    bool getHasIds() const;

    bool getHasTypes() const;

    ::nds::core::geometry::CoordShift getCoordShiftXY() const;
    void setCoordShiftXY(::nds::core::geometry::CoordShift coordShiftXY_);

    ::nds::core::grid::GridCellSize getCellSize() const;
    void setCellSize(::nds::core::grid::GridCellSize cellSize_);

    uint32_t getNumElements() const;
    void setNumElements(uint32_t numElements_);

    const ::zserio::vector<::nds::localization::types::OccupancyGridId>& getIdentifier() const;
    ::zserio::vector<::nds::localization::types::OccupancyGridId>& getIdentifier();
    void setIdentifier(const ::zserio::vector<::nds::localization::types::OccupancyGridId>& identifier_);
    void setIdentifier(::zserio::vector<::nds::localization::types::OccupancyGridId>&& identifier_);
    bool isIdentifierUsed() const;
    bool isIdentifierSet() const;
    void resetIdentifier();

    const ::zserio::vector<::nds::core::grid::GridType>& getTypes() const;
    ::zserio::vector<::nds::core::grid::GridType>& getTypes();
    void setTypes(const ::zserio::vector<::nds::core::grid::GridType>& types_);
    void setTypes(::zserio::vector<::nds::core::grid::GridType>&& types_);
    bool isTypesUsed() const;
    bool isTypesSet() const;
    void resetTypes();

    const ::zserio::vector<::nds::core::grid::Grid_OccupancyProbability>& getGrids() const;
    ::zserio::vector<::nds::core::grid::Grid_OccupancyProbability>& getGrids();
    void setGrids(const ::zserio::vector<::nds::core::grid::Grid_OccupancyProbability>& grids_);
    void setGrids(::zserio::vector<::nds::core::grid::Grid_OccupancyProbability>&& grids_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const OccupancyProbabilityGridLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_types
    {
    public:
        using OwnerType = OccupancyProbabilityGridLayer;

        static void create(OccupancyProbabilityGridLayer& owner,
                ::zserio::vector<::nds::core::grid::GridType>& array,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_grids
    {
    public:
        using OwnerType = OccupancyProbabilityGridLayer;

        static void initializeElement(OccupancyProbabilityGridLayer& owner,
                ::nds::core::grid::Grid_OccupancyProbability& element, size_t index);
    };

    class ZserioElementFactory_grids
    {
    public:
        using OwnerType = OccupancyProbabilityGridLayer;

        static void create(OccupancyProbabilityGridLayer& owner,
                ::zserio::vector<::nds::core::grid::Grid_OccupancyProbability>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(OccupancyProbabilityGridLayer& owner,
                ::zserio::vector<::nds::core::grid::Grid_OccupancyProbability>& array,
                ::nds::core::grid::Grid_OccupancyProbability::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_identifier = ::zserio::Array<::zserio::vector<::nds::localization::types::OccupancyGridId>, ::zserio::VarIntNNArrayTraits<::nds::localization::types::OccupancyGridId>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_types = ::zserio::Array<::zserio::vector<::nds::core::grid::GridType>, ::zserio::ObjectArrayTraits<::nds::core::grid::GridType, ZserioElementFactory_types>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_grids = ::zserio::Array<::zserio::vector<::nds::core::grid::Grid_OccupancyProbability>, ::zserio::ObjectArrayTraits<::nds::core::grid::Grid_OccupancyProbability, ZserioElementFactory_grids>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_grids>;

    ::nds::core::geometry::CoordShift readCoordShiftXY(::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordShift readCoordShiftXY(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::grid::GridCellSize readCellSize(::zserio::BitStreamReader& in);
    ::nds::core::grid::GridCellSize readCellSize(ZserioPackingContext& context,
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
    ZserioArrayType_grids readGrids(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_grids readGrids(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_hasIds_;
    bool m_hasTypes_;
    bool m_isInitialized;
    ::nds::core::geometry::CoordShift m_coordShiftXY_;
    ::nds::core::grid::GridCellSize m_cellSize_;
    uint32_t m_numElements_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_identifier> m_identifier_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_types> m_types_;
    ZserioArrayType_grids m_grids_;
};

} // namespace instantiations
} // namespace localization
} // namespace nds

#endif // NDS_LOCALIZATION_INSTANTIATIONS_OCCUPANCY_PROBABILITY_GRID_LAYER_H