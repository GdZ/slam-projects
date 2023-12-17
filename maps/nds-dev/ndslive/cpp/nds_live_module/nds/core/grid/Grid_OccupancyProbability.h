/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_GRID_GRID_OCCUPANCY_PROBABILITY_H
#define NDS_CORE_GRID_GRID_OCCUPANCY_PROBABILITY_H

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
#include <nds/core/geometry/Position2D.h>
#include <nds/core/grid/GridCellSize.h>
#include <nds/core/grid/NumGridCells.h>
#include <nds/localization/types/OccupancyProbability.h>

namespace nds
{
namespace core
{
namespace grid
{

class Grid_OccupancyProbability
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::geometry::Position2D::ZserioPackingContext& getSouthWestCorner()
        {
            return m_southWestCorner_;
        }

        ::zserio::DeltaContext& getNumRows()
        {
            return m_numRows_;
        }

        ::zserio::DeltaContext& getNumColumns()
        {
            return m_numColumns_;
        }

    private:
        ::nds::core::geometry::Position2D::ZserioPackingContext m_southWestCorner_;
        ::zserio::DeltaContext m_numRows_;
        ::zserio::DeltaContext m_numColumns_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    Grid_OccupancyProbability() noexcept :
            Grid_OccupancyProbability(allocator_type())
    {}

    explicit Grid_OccupancyProbability(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_southWestCorner = ::nds::core::geometry::Position2D,
            typename ZSERIO_T_grid = ::zserio::vector<::nds::localization::types::OccupancyProbability>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_southWestCorner, Grid_OccupancyProbability, allocator_type> = 0>
    Grid_OccupancyProbability(
            ZSERIO_T_southWestCorner&& southWestCorner_,
            ::nds::core::grid::NumGridCells numRows_,
            ::nds::core::grid::NumGridCells numColumns_,
            ZSERIO_T_grid&& grid_,
            const allocator_type& allocator = allocator_type()) :
            Grid_OccupancyProbability(allocator)
    {
        m_southWestCorner_ = ::std::forward<ZSERIO_T_southWestCorner>(southWestCorner_);
        m_numRows_ = numRows_;
        m_numColumns_ = numColumns_;
        m_grid_ = ZserioArrayType_grid(::std::forward<ZSERIO_T_grid>(grid_));
    }

    explicit Grid_OccupancyProbability(::zserio::BitStreamReader& in,
            ::nds::core::grid::GridCellSize size_,
            ::nds::core::geometry::CoordShift shift_, const allocator_type& allocator = allocator_type());
    explicit Grid_OccupancyProbability(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::grid::GridCellSize size_,
            ::nds::core::geometry::CoordShift shift_, const allocator_type& allocator = allocator_type());

    ~Grid_OccupancyProbability() = default;

    Grid_OccupancyProbability(const Grid_OccupancyProbability& other);
    Grid_OccupancyProbability& operator=(const Grid_OccupancyProbability& other);

    Grid_OccupancyProbability(Grid_OccupancyProbability&& other);
    Grid_OccupancyProbability& operator=(Grid_OccupancyProbability&& other);

    Grid_OccupancyProbability(::zserio::PropagateAllocatorT,
            const Grid_OccupancyProbability& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::grid::GridCellSize size_,
            ::nds::core::geometry::CoordShift shift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::grid::GridCellSize getSize() const;

    ::nds::core::geometry::CoordShift getShift() const;

    const ::nds::core::geometry::Position2D& getSouthWestCorner() const;
    ::nds::core::geometry::Position2D& getSouthWestCorner();
    void setSouthWestCorner(const ::nds::core::geometry::Position2D& southWestCorner_);
    void setSouthWestCorner(::nds::core::geometry::Position2D&& southWestCorner_);

    ::nds::core::grid::NumGridCells getNumRows() const;
    void setNumRows(::nds::core::grid::NumGridCells numRows_);

    ::nds::core::grid::NumGridCells getNumColumns() const;
    void setNumColumns(::nds::core::grid::NumGridCells numColumns_);

    const ::zserio::vector<::nds::localization::types::OccupancyProbability>& getGrid() const;
    ::zserio::vector<::nds::localization::types::OccupancyProbability>& getGrid();
    void setGrid(const ::zserio::vector<::nds::localization::types::OccupancyProbability>& grid_);
    void setGrid(::zserio::vector<::nds::localization::types::OccupancyProbability>&& grid_);

    ::nds::core::grid::GridCellSize funcCellSize() const;

    uint64_t funcWidth() const;

    uint64_t funcHeight() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const Grid_OccupancyProbability& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_grid
    {
    public:
        using OwnerType = Grid_OccupancyProbability;

        static void create(Grid_OccupancyProbability& owner,
                ::zserio::vector<::nds::localization::types::OccupancyProbability>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(Grid_OccupancyProbability& owner,
                ::zserio::vector<::nds::localization::types::OccupancyProbability>& array,
                ::nds::localization::types::OccupancyProbability::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_grid = ::zserio::Array<::zserio::vector<::nds::localization::types::OccupancyProbability>, ::zserio::ObjectArrayTraits<::nds::localization::types::OccupancyProbability, ZserioElementFactory_grid>, ::zserio::ArrayType::NORMAL>;

    ::nds::core::geometry::Position2D readSouthWestCorner(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::geometry::Position2D readSouthWestCorner(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::grid::NumGridCells readNumRows(::zserio::BitStreamReader& in);
    ::nds::core::grid::NumGridCells readNumRows(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::grid::NumGridCells readNumColumns(::zserio::BitStreamReader& in);
    ::nds::core::grid::NumGridCells readNumColumns(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_grid readGrid(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_grid readGrid(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::grid::GridCellSize m_size_;
    ::nds::core::geometry::CoordShift m_shift_;
    bool m_isInitialized;
    ::nds::core::geometry::Position2D m_southWestCorner_;
    ::nds::core::grid::NumGridCells m_numRows_;
    ::nds::core::grid::NumGridCells m_numColumns_;
    ZserioArrayType_grid m_grid_;
};

} // namespace grid
} // namespace core
} // namespace nds

#endif // NDS_CORE_GRID_GRID_OCCUPANCY_PROBABILITY_H
