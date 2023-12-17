/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#include <zserio/StringConvertUtil.h>
#include <zserio/CppRuntimeException.h>

#include <nds/venue/details/types/ParkingSectionType.h>

namespace zserio
{

// This is full specialization of enumeration traits and methods for ParkingSectionType enumeration.
constexpr ::std::array<const char*, 10> EnumTraits<::nds::venue::details::types::ParkingSectionType>::names;
constexpr ::std::array<::nds::venue::details::types::ParkingSectionType, 10> EnumTraits<::nds::venue::details::types::ParkingSectionType>::values;
constexpr const char* EnumTraits<::nds::venue::details::types::ParkingSectionType>::enumName;

template <>
size_t enumToOrdinal(::nds::venue::details::types::ParkingSectionType value)
{
    switch (value)
    {
    case ::nds::venue::details::types::ParkingSectionType::SELF:
        return 0;
    case ::nds::venue::details::types::ParkingSectionType::CUSTOMER:
        return 1;
    case ::nds::venue::details::types::ParkingSectionType::RENTAL:
        return 2;
    case ::nds::venue::details::types::ParkingSectionType::HOTEL:
        return 3;
    case ::nds::venue::details::types::ParkingSectionType::PRIVATE:
        return 4;
    case ::nds::venue::details::types::ParkingSectionType::VALET:
        return 5;
    case ::nds::venue::details::types::ParkingSectionType::AUTOMATED_VALET:
        return 6;
    case ::nds::venue::details::types::ParkingSectionType::AVP_DROP_OFF:
        return 7;
    case ::nds::venue::details::types::ParkingSectionType::AVP_PICK_UP:
        return 8;
    case ::nds::venue::details::types::ParkingSectionType::AVP_DROP_OFF_PICK_UP:
        return 9;
    default:
        throw ::zserio::CppRuntimeException("Unknown value for enumeration ParkingSectionType: ") <<
                static_cast<typename ::std::underlying_type<::nds::venue::details::types::ParkingSectionType>::type>(value) << "!";
    }
}

template <>
::nds::venue::details::types::ParkingSectionType valueToEnum(
        typename ::std::underlying_type<::nds::venue::details::types::ParkingSectionType>::type rawValue)
{
    switch (rawValue)
    {
    case UINT8_C(0):
    case UINT8_C(1):
    case UINT8_C(2):
    case UINT8_C(3):
    case UINT8_C(4):
    case UINT8_C(5):
    case UINT8_C(6):
    case UINT8_C(7):
    case UINT8_C(8):
    case UINT8_C(9):
        return static_cast<::nds::venue::details::types::ParkingSectionType>(rawValue);
    default:
        throw ::zserio::CppRuntimeException("Unknown value for enumeration ParkingSectionType: ") << rawValue << "!";
    }
}

template <>
uint32_t enumHashCode<::nds::venue::details::types::ParkingSectionType>(::nds::venue::details::types::ParkingSectionType value)
{
    uint32_t result = ::zserio::HASH_SEED;
    result = ::zserio::calcHashCode(result, enumToValue(value));
    return result;
}

template <>
void initPackingContext(::zserio::DeltaContext& context, ::nds::venue::details::types::ParkingSectionType value)
{
    context.init<::zserio::StdIntArrayTraits<typename ::std::underlying_type<::nds::venue::details::types::ParkingSectionType>::type>>(
            ::zserio::enumToValue(value));
}

template <>
size_t bitSizeOf(::nds::venue::details::types::ParkingSectionType)
{
    return UINT8_C(8);
}

template <>
size_t bitSizeOf(::zserio::DeltaContext& context, ::nds::venue::details::types::ParkingSectionType value)
{
    return context.bitSizeOf<::zserio::StdIntArrayTraits<typename ::std::underlying_type<::nds::venue::details::types::ParkingSectionType>::type>>(
            ::zserio::enumToValue(value));
}

template <>
size_t initializeOffsets(size_t bitPosition, ::nds::venue::details::types::ParkingSectionType value)
{
    return bitPosition + bitSizeOf(value);
}

template <>
size_t initializeOffsets(::zserio::DeltaContext& context, size_t bitPosition, ::nds::venue::details::types::ParkingSectionType value)
{
    return bitPosition + bitSizeOf(context, value);
}

template <>
::nds::venue::details::types::ParkingSectionType read(::zserio::BitStreamReader& in)
{
    return valueToEnum<::nds::venue::details::types::ParkingSectionType>(
            static_cast<typename ::std::underlying_type<::nds::venue::details::types::ParkingSectionType>::type>(
                    in.readBits(UINT8_C(8))));
}

template <>
::nds::venue::details::types::ParkingSectionType read(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in)
{
    return valueToEnum<::nds::venue::details::types::ParkingSectionType>(context.read<::zserio::StdIntArrayTraits<typename ::std::underlying_type<::nds::venue::details::types::ParkingSectionType>::type>>(
            in));
}

template <>
void write(::zserio::BitStreamWriter& out, ::nds::venue::details::types::ParkingSectionType value)
{
    out.writeBits(::zserio::enumToValue(value), UINT8_C(8));
}

template <>
void write(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out, ::nds::venue::details::types::ParkingSectionType value)
{
    context.write<::zserio::StdIntArrayTraits<typename ::std::underlying_type<::nds::venue::details::types::ParkingSectionType>::type>>(
            out, ::zserio::enumToValue(value));
}

} // namespace zserio

/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#include <zserio/StringConvertUtil.h>
#include <zserio/CppRuntimeException.h>

#include <nds/venue/details/types/ParkingOrientation.h>

namespace zserio
{

// This is full specialization of enumeration traits and methods for ParkingOrientation enumeration.
constexpr ::std::array<const char*, 5> EnumTraits<::nds::venue::details::types::ParkingOrientation>::names;
constexpr ::std::array<::nds::venue::details::types::ParkingOrientation, 5> EnumTraits<::nds::venue::details::types::ParkingOrientation>::values;
constexpr const char* EnumTraits<::nds::venue::details::types::ParkingOrientation>::enumName;

template <>
size_t enumToOrdinal(::nds::venue::details::types::ParkingOrientation value)
{
    switch (value)
    {
    case ::nds::venue::details::types::ParkingOrientation::PARALLEL:
        return 0;
    case ::nds::venue::details::types::ParkingOrientation::DEGREE_45:
        return 1;
    case ::nds::venue::details::types::ParkingOrientation::DEGREE_60:
        return 2;
    case ::nds::venue::details::types::ParkingOrientation::DEGREE_75:
        return 3;
    case ::nds::venue::details::types::ParkingOrientation::DEGREE_90:
        return 4;
    default:
        throw ::zserio::CppRuntimeException("Unknown value for enumeration ParkingOrientation: ") <<
                static_cast<typename ::std::underlying_type<::nds::venue::details::types::ParkingOrientation>::type>(value) << "!";
    }
}

template <>
::nds::venue::details::types::ParkingOrientation valueToEnum(
        typename ::std::underlying_type<::nds::venue::details::types::ParkingOrientation>::type rawValue)
{
    switch (rawValue)
    {
    case UINT8_C(0):
    case UINT8_C(1):
    case UINT8_C(2):
    case UINT8_C(3):
    case UINT8_C(4):
        return static_cast<::nds::venue::details::types::ParkingOrientation>(rawValue);
    default:
        throw ::zserio::CppRuntimeException("Unknown value for enumeration ParkingOrientation: ") << rawValue << "!";
    }
}

template <>
uint32_t enumHashCode<::nds::venue::details::types::ParkingOrientation>(::nds::venue::details::types::ParkingOrientation value)
{
    uint32_t result = ::zserio::HASH_SEED;
    result = ::zserio::calcHashCode(result, enumToValue(value));
    return result;
}

template <>
void initPackingContext(::zserio::DeltaContext& context, ::nds::venue::details::types::ParkingOrientation value)
{
    context.init<::zserio::StdIntArrayTraits<typename ::std::underlying_type<::nds::venue::details::types::ParkingOrientation>::type>>(
            ::zserio::enumToValue(value));
}

template <>
size_t bitSizeOf(::nds::venue::details::types::ParkingOrientation)
{
    return UINT8_C(8);
}

template <>
size_t bitSizeOf(::zserio::DeltaContext& context, ::nds::venue::details::types::ParkingOrientation value)
{
    return context.bitSizeOf<::zserio::StdIntArrayTraits<typename ::std::underlying_type<::nds::venue::details::types::ParkingOrientation>::type>>(
            ::zserio::enumToValue(value));
}

template <>
size_t initializeOffsets(size_t bitPosition, ::nds::venue::details::types::ParkingOrientation value)
{
    return bitPosition + bitSizeOf(value);
}

template <>
size_t initializeOffsets(::zserio::DeltaContext& context, size_t bitPosition, ::nds::venue::details::types::ParkingOrientation value)
{
    return bitPosition + bitSizeOf(context, value);
}

template <>
::nds::venue::details::types::ParkingOrientation read(::zserio::BitStreamReader& in)
{
    return valueToEnum<::nds::venue::details::types::ParkingOrientation>(
            static_cast<typename ::std::underlying_type<::nds::venue::details::types::ParkingOrientation>::type>(
                    in.readBits(UINT8_C(8))));
}

template <>
::nds::venue::details::types::ParkingOrientation read(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in)
{
    return valueToEnum<::nds::venue::details::types::ParkingOrientation>(context.read<::zserio::StdIntArrayTraits<typename ::std::underlying_type<::nds::venue::details::types::ParkingOrientation>::type>>(
            in));
}

template <>
void write(::zserio::BitStreamWriter& out, ::nds::venue::details::types::ParkingOrientation value)
{
    out.writeBits(::zserio::enumToValue(value), UINT8_C(8));
}

template <>
void write(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out, ::nds::venue::details::types::ParkingOrientation value)
{
    context.write<::zserio::StdIntArrayTraits<typename ::std::underlying_type<::nds::venue::details::types::ParkingOrientation>::type>>(
            out, ::zserio::enumToValue(value));
}

} // namespace zserio

/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#include <zserio/HashCodeUtil.h>
#include <zserio/StringConvertUtil.h>
#include <zserio/CppRuntimeException.h>

#include <nds/venue/details/types/ParkingRestrictions.h>

namespace nds
{
namespace venue
{
namespace details
{
namespace types
{

ParkingRestrictions::ParkingRestrictions(::zserio::BitStreamReader& in) :
        m_value(readValue(in))
{}

ParkingRestrictions::ParkingRestrictions(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in) :
        m_value(readValue(context, in))
{}

ParkingRestrictions::ParkingRestrictions(underlying_type value) :
        m_value(value)
{
    if (m_value > UINT16_C(32767))
        throw ::zserio::CppRuntimeException("Value for bitmask 'ParkingRestrictions' out of bounds: ") << value << "!";
}

void ParkingRestrictions::initPackingContext(::zserio::DeltaContext& context) const
{
    context.init<::zserio::VarIntNNArrayTraits<::nds::venue::details::types::ParkingRestrictions::underlying_type>>(m_value);
}

size_t ParkingRestrictions::bitSizeOf(size_t) const
{
    return ::zserio::bitSizeOfVarUInt16(m_value);
}

size_t ParkingRestrictions::bitSizeOf(::zserio::DeltaContext& context, size_t) const
{
    return context.bitSizeOf<::zserio::VarIntNNArrayTraits<::nds::venue::details::types::ParkingRestrictions::underlying_type>>(m_value);
}

size_t ParkingRestrictions::initializeOffsets(size_t bitPosition) const
{
    return bitPosition + bitSizeOf(bitPosition);
}

size_t ParkingRestrictions::initializeOffsets(::zserio::DeltaContext& context, size_t bitPosition) const
{
    return bitPosition + bitSizeOf(context, bitPosition);
}

uint32_t ParkingRestrictions::hashCode() const
{
    uint32_t result = ::zserio::HASH_SEED;
    result = ::zserio::calcHashCode(result, m_value);
    return result;
}

void ParkingRestrictions::write(::zserio::BitStreamWriter& out) const
{
    out.writeVarUInt16(m_value);
}

void ParkingRestrictions::write(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out) const
{
    context.write<::zserio::VarIntNNArrayTraits<::nds::venue::details::types::ParkingRestrictions::underlying_type>>(out, m_value);
}

::zserio::string<> ParkingRestrictions::toString(const ::zserio::string<>::allocator_type& allocator) const
{
    ::zserio::string<> result(allocator);
    if ((*this & ParkingRestrictions::Values::ACCESSIBLE) == ParkingRestrictions::Values::ACCESSIBLE)
        result += result.empty() ? "ACCESSIBLE" : " | ACCESSIBLE";
    if ((*this & ParkingRestrictions::Values::ELECTRIC_VEHICLE) == ParkingRestrictions::Values::ELECTRIC_VEHICLE)
        result += result.empty() ? "ELECTRIC_VEHICLE" : " | ELECTRIC_VEHICLE";
    if ((*this & ParkingRestrictions::Values::FAMILY) == ParkingRestrictions::Values::FAMILY)
        result += result.empty() ? "FAMILY" : " | FAMILY";
    if ((*this & ParkingRestrictions::Values::WOMEN) == ParkingRestrictions::Values::WOMEN)
        result += result.empty() ? "WOMEN" : " | WOMEN";
    if ((*this & ParkingRestrictions::Values::PRIVATE) == ParkingRestrictions::Values::PRIVATE)
        result += result.empty() ? "PRIVATE" : " | PRIVATE";
    if ((*this & ParkingRestrictions::Values::VISITOR) == ParkingRestrictions::Values::VISITOR)
        result += result.empty() ? "VISITOR" : " | VISITOR";
    if (result.empty() && m_value == 0)
        result += "CONDITIONAL_ONLY";

    return ::zserio::toString<::zserio::string<>::allocator_type>(m_value, allocator) + "[" + result + "]";
}

ParkingRestrictions::underlying_type ParkingRestrictions::readValue(::zserio::BitStreamReader& in)
{
    return static_cast<underlying_type>(in.readVarUInt16());
}

ParkingRestrictions::underlying_type ParkingRestrictions::readValue(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in)
{
    return context.read<::zserio::VarIntNNArrayTraits<::nds::venue::details::types::ParkingRestrictions::underlying_type>>(
            in);
}

} // namespace types
} // namespace details
} // namespace venue
} // namespace nds

/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#include <zserio/StringConvertUtil.h>
#include <zserio/CppRuntimeException.h>
#include <zserio/HashCodeUtil.h>
#include <zserio/BitPositionUtil.h>
#include <zserio/BitSizeOfCalculator.h>
#include <zserio/BitFieldUtil.h>

#include <nds/venue/details/types/ParkingRowLayout.h>

namespace nds
{
namespace venue
{
namespace details
{
namespace types
{

ParkingRowLayout::ParkingRowLayout(const allocator_type&) noexcept :
        m_structuredParking_(bool()),
        m_interlockedSpots_(bool()),
        m_orientation_(::nds::venue::details::types::ParkingOrientation())
{
}

ParkingRowLayout::ParkingRowLayout(::zserio::BitStreamReader& in, const allocator_type&) :
        m_structuredParking_(readStructuredParking(in)),
        m_interlockedSpots_(readInterlockedSpots(in)),
        m_orientation_(readOrientation(in))
{
}

ParkingRowLayout::ParkingRowLayout(ParkingRowLayout::ZserioPackingContext& context, ::zserio::BitStreamReader& in, const allocator_type&) :
        m_structuredParking_(readStructuredParking(in)),
        m_interlockedSpots_(readInterlockedSpots(in)),
        m_orientation_(readOrientation(context, in))
{
}

ParkingRowLayout::ParkingRowLayout(::zserio::PropagateAllocatorT,
        const ParkingRowLayout& other, const allocator_type& allocator) :
        m_structuredParking_(::zserio::allocatorPropagatingCopy(other.m_structuredParking_, allocator)),
        m_interlockedSpots_(::zserio::allocatorPropagatingCopy(other.m_interlockedSpots_, allocator)),
        m_orientation_(::zserio::allocatorPropagatingCopy(other.m_orientation_, allocator))
{
}

bool ParkingRowLayout::getStructuredParking() const
{
    return m_structuredParking_;
}

void ParkingRowLayout::setStructuredParking(bool structuredParking_)
{
    m_structuredParking_ = structuredParking_;
}

bool ParkingRowLayout::getInterlockedSpots() const
{
    return m_interlockedSpots_;
}

void ParkingRowLayout::setInterlockedSpots(bool interlockedSpots_)
{
    m_interlockedSpots_ = interlockedSpots_;
}

::nds::venue::details::types::ParkingOrientation ParkingRowLayout::getOrientation() const
{
    return m_orientation_;
}

void ParkingRowLayout::setOrientation(::nds::venue::details::types::ParkingOrientation orientation_)
{
    m_orientation_ = orientation_;
}

void ParkingRowLayout::initPackingContext(ParkingRowLayout::ZserioPackingContext& context) const
{
    ::zserio::initPackingContext(context.getOrientation(), m_orientation_);
}

size_t ParkingRowLayout::bitSizeOf(size_t bitPosition) const
{
    size_t endBitPosition = bitPosition;

    endBitPosition += UINT8_C(1);
    endBitPosition += UINT8_C(1);
    endBitPosition += ::zserio::bitSizeOf(m_orientation_);

    return endBitPosition - bitPosition;
}

size_t ParkingRowLayout::bitSizeOf(ParkingRowLayout::ZserioPackingContext& context, size_t bitPosition) const
{
    size_t endBitPosition = bitPosition;

    endBitPosition += UINT8_C(1);
    endBitPosition += UINT8_C(1);
    endBitPosition += ::zserio::bitSizeOf(context.getOrientation(), m_orientation_);

    return endBitPosition - bitPosition;
}

size_t ParkingRowLayout::initializeOffsets(size_t bitPosition)
{
    size_t endBitPosition = bitPosition;

    endBitPosition += UINT8_C(1);
    endBitPosition += UINT8_C(1);
    endBitPosition = ::zserio::initializeOffsets(endBitPosition, m_orientation_);

    return endBitPosition;
}

size_t ParkingRowLayout::initializeOffsets(ParkingRowLayout::ZserioPackingContext& context, size_t bitPosition)
{
    size_t endBitPosition = bitPosition;

    endBitPosition += UINT8_C(1);
    endBitPosition += UINT8_C(1);
    endBitPosition = ::zserio::initializeOffsets(context.getOrientation(), endBitPosition,
        m_orientation_);

    return endBitPosition;
}

bool ParkingRowLayout::operator==(const ParkingRowLayout& other) const
{
    if (this != &other)
    {
        return
                (m_structuredParking_ == other.m_structuredParking_) &&
                (m_interlockedSpots_ == other.m_interlockedSpots_) &&
                (m_orientation_ == other.m_orientation_);
    }

    return true;
}

uint32_t ParkingRowLayout::hashCode() const
{
    uint32_t result = ::zserio::HASH_SEED;

    result = ::zserio::calcHashCode(result, m_structuredParking_);
    result = ::zserio::calcHashCode(result, m_interlockedSpots_);
    result = ::zserio::calcHashCode(result, m_orientation_);

    return result;
}

void ParkingRowLayout::write(::zserio::BitStreamWriter& out) const
{
    out.writeBool(m_structuredParking_);
    out.writeBool(m_interlockedSpots_);
    ::zserio::write(out, m_orientation_);
}

void ParkingRowLayout::write(ParkingRowLayout::ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const
{
    out.writeBool(m_structuredParking_);
    out.writeBool(m_interlockedSpots_);
    ::zserio::write(context.getOrientation(), out, m_orientation_);
}

bool ParkingRowLayout::readStructuredParking(::zserio::BitStreamReader& in)
{
    return static_cast<bool>(in.readBool());
}
bool ParkingRowLayout::readInterlockedSpots(::zserio::BitStreamReader& in)
{
    return static_cast<bool>(in.readBool());
}
::nds::venue::details::types::ParkingOrientation ParkingRowLayout::readOrientation(::zserio::BitStreamReader& in)
{
    return ::zserio::read<::nds::venue::details::types::ParkingOrientation>(in);
}

::nds::venue::details::types::ParkingOrientation ParkingRowLayout::readOrientation(ParkingRowLayout::ZserioPackingContext& context, ::zserio::BitStreamReader& in)
{
    return ::zserio::read<::nds::venue::details::types::ParkingOrientation>(context.getOrientation(), in);
}

} // namespace types
} // namespace details
} // namespace venue
} // namespace nds

/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#include <zserio/StringConvertUtil.h>
#include <zserio/CppRuntimeException.h>
#include <zserio/HashCodeUtil.h>
#include <zserio/BitPositionUtil.h>
#include <zserio/BitSizeOfCalculator.h>
#include <zserio/BitFieldUtil.h>

#include <nds/venue/details/types/PrivateParkingDetails.h>

namespace nds
{
namespace venue
{
namespace details
{
namespace types
{

PrivateParkingDetails::PrivateParkingDetails(const allocator_type& allocator) noexcept :
        m_hint_(allocator)
{
}

PrivateParkingDetails::PrivateParkingDetails(::zserio::BitStreamReader& in, const allocator_type& allocator) :
        m_hint_(readHint(in, allocator))
{
}

PrivateParkingDetails::PrivateParkingDetails(::zserio::PropagateAllocatorT,
        const PrivateParkingDetails& other, const allocator_type& allocator) :
        m_hint_(::zserio::allocatorPropagatingCopy(other.m_hint_, allocator))
{
}

::zserio::string<>& PrivateParkingDetails::getHint()
{
    return m_hint_;
}

const ::zserio::string<>& PrivateParkingDetails::getHint() const
{
    return m_hint_;
}

void PrivateParkingDetails::setHint(const ::zserio::string<>& hint_)
{
    m_hint_ = hint_;
}

void PrivateParkingDetails::setHint(::zserio::string<>&& hint_)
{
    m_hint_ = ::std::move(hint_);
}

size_t PrivateParkingDetails::bitSizeOf(size_t bitPosition) const
{
    size_t endBitPosition = bitPosition;

    endBitPosition += ::zserio::bitSizeOfString(m_hint_);

    return endBitPosition - bitPosition;
}

size_t PrivateParkingDetails::initializeOffsets(size_t bitPosition)
{
    size_t endBitPosition = bitPosition;

    endBitPosition += ::zserio::bitSizeOfString(m_hint_);

    return endBitPosition;
}

bool PrivateParkingDetails::operator==(const PrivateParkingDetails& other) const
{
    if (this != &other)
    {
        return
                (m_hint_ == other.m_hint_);
    }

    return true;
}

uint32_t PrivateParkingDetails::hashCode() const
{
    uint32_t result = ::zserio::HASH_SEED;

    result = ::zserio::calcHashCode(result, m_hint_);

    return result;
}

void PrivateParkingDetails::write(::zserio::BitStreamWriter& out) const
{
    out.writeString(m_hint_);
}

::zserio::string<> PrivateParkingDetails::readHint(::zserio::BitStreamReader& in,
        const allocator_type& allocator)
{
    return static_cast<::zserio::string<>>(in.readString(allocator));
}

} // namespace types
} // namespace details
} // namespace venue
} // namespace nds