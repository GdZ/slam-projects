/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_REFERENCE_TYPES_DISPLAY_LINE_POSITION_VALIDITY_H
#define NDS_DISPLAY_REFERENCE_TYPES_DISPLAY_LINE_POSITION_VALIDITY_H

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
#include <nds/display/reference/types/DisplayLinePositionChoice.h>
#include <nds/display/reference/types/DisplayLineValidityType.h>

namespace nds
{
namespace display
{
namespace reference
{
namespace types
{

class DisplayLinePositionValidity
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getType()
        {
            return m_type_;
        }

        ::zserio::DeltaContext& getNumPositions()
        {
            return m_numPositions_;
        }

    private:
        ::zserio::DeltaContext m_type_;
        ::zserio::DeltaContext m_numPositions_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    DisplayLinePositionValidity() noexcept :
            DisplayLinePositionValidity(allocator_type())
    {}

    explicit DisplayLinePositionValidity(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_numPositions = uint32_t,
            typename ZSERIO_T_positions = ::zserio::vector<::nds::display::reference::types::DisplayLinePositionChoice>>
    DisplayLinePositionValidity(
            ::nds::display::reference::types::DisplayLineValidityType type_,
            ZSERIO_T_numPositions&& numPositions_,
            ZSERIO_T_positions&& positions_,
            const allocator_type& allocator = allocator_type()) :
            DisplayLinePositionValidity(allocator)
    {
        m_type_ = type_;
        m_numPositions_ = ::std::forward<ZSERIO_T_numPositions>(numPositions_);
        m_positions_ = ::zserio::createOptionalArray<ZserioArrayType_positions>(::std::forward<ZSERIO_T_positions>(positions_));
    }

    explicit DisplayLinePositionValidity(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift shift_, const allocator_type& allocator = allocator_type());
    explicit DisplayLinePositionValidity(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift shift_, const allocator_type& allocator = allocator_type());

    ~DisplayLinePositionValidity() = default;

    DisplayLinePositionValidity(const DisplayLinePositionValidity& other);
    DisplayLinePositionValidity& operator=(const DisplayLinePositionValidity& other);

    DisplayLinePositionValidity(DisplayLinePositionValidity&& other);
    DisplayLinePositionValidity& operator=(DisplayLinePositionValidity&& other);

    DisplayLinePositionValidity(::zserio::PropagateAllocatorT,
            const DisplayLinePositionValidity& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift shift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getShift() const;

    ::nds::display::reference::types::DisplayLineValidityType getType() const;
    void setType(::nds::display::reference::types::DisplayLineValidityType type_);

    uint32_t getNumPositions() const;
    void setNumPositions(uint32_t numPositions_);
    bool isNumPositionsUsed() const;
    bool isNumPositionsSet() const;
    void resetNumPositions();

    const ::zserio::vector<::nds::display::reference::types::DisplayLinePositionChoice>& getPositions() const;
    ::zserio::vector<::nds::display::reference::types::DisplayLinePositionChoice>& getPositions();
    void setPositions(const ::zserio::vector<::nds::display::reference::types::DisplayLinePositionChoice>& positions_);
    void setPositions(::zserio::vector<::nds::display::reference::types::DisplayLinePositionChoice>&& positions_);
    bool isPositionsUsed() const;
    bool isPositionsSet() const;
    void resetPositions();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DisplayLinePositionValidity& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_positions
    {
    public:
        using OwnerType = DisplayLinePositionValidity;

        static void initializeElement(DisplayLinePositionValidity& owner,
                ::nds::display::reference::types::DisplayLinePositionChoice& element, size_t index);
    };

    class ZserioElementFactory_positions
    {
    public:
        using OwnerType = DisplayLinePositionValidity;

        static void create(DisplayLinePositionValidity& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayLinePositionChoice>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(DisplayLinePositionValidity& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayLinePositionChoice>& array,
                ::nds::display::reference::types::DisplayLinePositionChoice::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_positions = ::zserio::Array<::zserio::vector<::nds::display::reference::types::DisplayLinePositionChoice>, ::zserio::ObjectArrayTraits<::nds::display::reference::types::DisplayLinePositionChoice, ZserioElementFactory_positions>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_positions>;

    ::nds::display::reference::types::DisplayLineValidityType readType(::zserio::BitStreamReader& in);
    ::nds::display::reference::types::DisplayLineValidityType readType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<uint32_t> readNumPositions(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<uint32_t> readNumPositions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_positions> readPositions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_positions> readPositions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_shift_;
    bool m_isInitialized;
    ::nds::display::reference::types::DisplayLineValidityType m_type_;
    ::zserio::InplaceOptionalHolder<uint32_t> m_numPositions_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_positions> m_positions_;
};

} // namespace types
} // namespace reference
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_REFERENCE_TYPES_DISPLAY_LINE_POSITION_VALIDITY_H