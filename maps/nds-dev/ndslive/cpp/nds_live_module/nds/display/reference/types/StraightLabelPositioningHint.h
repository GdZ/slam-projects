/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_REFERENCE_TYPES_STRAIGHT_LABEL_POSITIONING_HINT_H
#define NDS_DISPLAY_REFERENCE_TYPES_STRAIGHT_LABEL_POSITIONING_HINT_H

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
#include <nds/core/geometry/CoordWidth.h>
#include <nds/display/reference/types/StraightLabelingPosition.h>

namespace nds
{
namespace display
{
namespace reference
{
namespace types
{

class StraightLabelPositioningHint
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumPositions()
        {
            return m_numPositions_;
        }

        ::zserio::DeltaContext& getCoordWidth()
        {
            return m_coordWidth_;
        }

    private:
        ::zserio::DeltaContext m_numPositions_;
        ::zserio::DeltaContext m_coordWidth_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    StraightLabelPositioningHint() noexcept :
            StraightLabelPositioningHint(allocator_type())
    {}

    explicit StraightLabelPositioningHint(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_positions = ::zserio::vector<::nds::display::reference::types::StraightLabelingPosition>>
    StraightLabelPositioningHint(
            uint32_t numPositions_,
            ::nds::core::geometry::CoordWidth coordWidth_,
            ZSERIO_T_positions&& positions_,
            const allocator_type& allocator = allocator_type()) :
            StraightLabelPositioningHint(allocator)
    {
        m_numPositions_ = numPositions_;
        m_coordWidth_ = coordWidth_;
        m_positions_ = ZserioArrayType_positions(::std::forward<ZSERIO_T_positions>(positions_));
    }

    explicit StraightLabelPositioningHint(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift shift_, const allocator_type& allocator = allocator_type());
    explicit StraightLabelPositioningHint(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift shift_, const allocator_type& allocator = allocator_type());

    ~StraightLabelPositioningHint() = default;

    StraightLabelPositioningHint(const StraightLabelPositioningHint& other);
    StraightLabelPositioningHint& operator=(const StraightLabelPositioningHint& other);

    StraightLabelPositioningHint(StraightLabelPositioningHint&& other);
    StraightLabelPositioningHint& operator=(StraightLabelPositioningHint&& other);

    StraightLabelPositioningHint(::zserio::PropagateAllocatorT,
            const StraightLabelPositioningHint& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift shift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getShift() const;

    uint32_t getNumPositions() const;
    void setNumPositions(uint32_t numPositions_);

    ::nds::core::geometry::CoordWidth getCoordWidth() const;
    void setCoordWidth(::nds::core::geometry::CoordWidth coordWidth_);

    const ::zserio::vector<::nds::display::reference::types::StraightLabelingPosition>& getPositions() const;
    ::zserio::vector<::nds::display::reference::types::StraightLabelingPosition>& getPositions();
    void setPositions(const ::zserio::vector<::nds::display::reference::types::StraightLabelingPosition>& positions_);
    void setPositions(::zserio::vector<::nds::display::reference::types::StraightLabelingPosition>&& positions_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const StraightLabelPositioningHint& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_positions
    {
    public:
        using OwnerType = StraightLabelPositioningHint;

        static void initializeElement(StraightLabelPositioningHint& owner,
                ::nds::display::reference::types::StraightLabelingPosition& element, size_t index);
    };

    class ZserioElementFactory_positions
    {
    public:
        using OwnerType = StraightLabelPositioningHint;

        static void create(StraightLabelPositioningHint& owner,
                ::zserio::vector<::nds::display::reference::types::StraightLabelingPosition>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(StraightLabelPositioningHint& owner,
                ::zserio::vector<::nds::display::reference::types::StraightLabelingPosition>& array,
                ::nds::display::reference::types::StraightLabelingPosition::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_positions = ::zserio::Array<::zserio::vector<::nds::display::reference::types::StraightLabelingPosition>, ::zserio::ObjectArrayTraits<::nds::display::reference::types::StraightLabelingPosition, ZserioElementFactory_positions>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_positions>;

    uint32_t readNumPositions(::zserio::BitStreamReader& in);
    uint32_t readNumPositions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordWidth readCoordWidth(::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordWidth readCoordWidth(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_positions readPositions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_positions readPositions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_shift_;
    bool m_isInitialized;
    uint32_t m_numPositions_;
    ::nds::core::geometry::CoordWidth m_coordWidth_;
    ZserioArrayType_positions m_positions_;
};

} // namespace types
} // namespace reference
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_REFERENCE_TYPES_STRAIGHT_LABEL_POSITIONING_HINT_H
