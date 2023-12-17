/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#include <zserio/StringConvertUtil.h>
#include <zserio/CppRuntimeException.h>

#include <nds/vehicle/metadata/VehicleServiceType.h>

namespace zserio
{

// This is full specialization of enumeration traits and methods for VehicleServiceType enumeration.
constexpr ::std::array<const char*, 1> EnumTraits<::nds::vehicle::metadata::VehicleServiceType>::names;
constexpr ::std::array<::nds::vehicle::metadata::VehicleServiceType, 1> EnumTraits<::nds::vehicle::metadata::VehicleServiceType>::values;
constexpr const char* EnumTraits<::nds::vehicle::metadata::VehicleServiceType>::enumName;

template <>
size_t enumToOrdinal(::nds::vehicle::metadata::VehicleServiceType value)
{
    switch (value)
    {
    case ::nds::vehicle::metadata::VehicleServiceType::HORIZON_SERVICE:
        return 0;
    default:
        throw ::zserio::CppRuntimeException("Unknown value for enumeration VehicleServiceType: ") <<
                static_cast<typename ::std::underlying_type<::nds::vehicle::metadata::VehicleServiceType>::type>(value) << "!";
    }
}

template <>
::nds::vehicle::metadata::VehicleServiceType valueToEnum(
        typename ::std::underlying_type<::nds::vehicle::metadata::VehicleServiceType>::type rawValue)
{
    switch (rawValue)
    {
    case UINT8_C(0):
        return static_cast<::nds::vehicle::metadata::VehicleServiceType>(rawValue);
    default:
        throw ::zserio::CppRuntimeException("Unknown value for enumeration VehicleServiceType: ") << rawValue << "!";
    }
}

template <>
uint32_t enumHashCode<::nds::vehicle::metadata::VehicleServiceType>(::nds::vehicle::metadata::VehicleServiceType value)
{
    uint32_t result = ::zserio::HASH_SEED;
    result = ::zserio::calcHashCode(result, enumToValue(value));
    return result;
}

template <>
void initPackingContext(::zserio::DeltaContext& context, ::nds::vehicle::metadata::VehicleServiceType value)
{
    context.init<::zserio::StdIntArrayTraits<typename ::std::underlying_type<::nds::vehicle::metadata::VehicleServiceType>::type>>(
            ::zserio::enumToValue(value));
}

template <>
size_t bitSizeOf(::nds::vehicle::metadata::VehicleServiceType)
{
    return UINT8_C(8);
}

template <>
size_t bitSizeOf(::zserio::DeltaContext& context, ::nds::vehicle::metadata::VehicleServiceType value)
{
    return context.bitSizeOf<::zserio::StdIntArrayTraits<typename ::std::underlying_type<::nds::vehicle::metadata::VehicleServiceType>::type>>(
            ::zserio::enumToValue(value));
}

template <>
size_t initializeOffsets(size_t bitPosition, ::nds::vehicle::metadata::VehicleServiceType value)
{
    return bitPosition + bitSizeOf(value);
}

template <>
size_t initializeOffsets(::zserio::DeltaContext& context, size_t bitPosition, ::nds::vehicle::metadata::VehicleServiceType value)
{
    return bitPosition + bitSizeOf(context, value);
}

template <>
::nds::vehicle::metadata::VehicleServiceType read(::zserio::BitStreamReader& in)
{
    return valueToEnum<::nds::vehicle::metadata::VehicleServiceType>(
            static_cast<typename ::std::underlying_type<::nds::vehicle::metadata::VehicleServiceType>::type>(
                    in.readBits(UINT8_C(8))));
}

template <>
::nds::vehicle::metadata::VehicleServiceType read(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in)
{
    return valueToEnum<::nds::vehicle::metadata::VehicleServiceType>(context.read<::zserio::StdIntArrayTraits<typename ::std::underlying_type<::nds::vehicle::metadata::VehicleServiceType>::type>>(
            in));
}

template <>
void write(::zserio::BitStreamWriter& out, ::nds::vehicle::metadata::VehicleServiceType value)
{
    out.writeBits(::zserio::enumToValue(value), UINT8_C(8));
}

template <>
void write(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out, ::nds::vehicle::metadata::VehicleServiceType value)
{
    context.write<::zserio::StdIntArrayTraits<typename ::std::underlying_type<::nds::vehicle::metadata::VehicleServiceType>::type>>(
            out, ::zserio::enumToValue(value));
}

} // namespace zserio

/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#include <zserio/HashCodeUtil.h>
#include <zserio/StringConvertUtil.h>

#include <nds/vehicle/metadata/HorizonServiceCapabilities.h>

namespace nds
{
namespace vehicle
{
namespace metadata
{

HorizonServiceCapabilities::HorizonServiceCapabilities(::zserio::BitStreamReader& in) :
        m_value(readValue(in))
{}

HorizonServiceCapabilities::HorizonServiceCapabilities(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in) :
        m_value(readValue(context, in))
{}

void HorizonServiceCapabilities::initPackingContext(::zserio::DeltaContext& context) const
{
    context.init<::zserio::StdIntArrayTraits<::nds::vehicle::metadata::HorizonServiceCapabilities::underlying_type>>(m_value);
}

size_t HorizonServiceCapabilities::bitSizeOf(size_t) const
{
    return UINT8_C(32);
}

size_t HorizonServiceCapabilities::bitSizeOf(::zserio::DeltaContext& context, size_t) const
{
    return context.bitSizeOf<::zserio::StdIntArrayTraits<::nds::vehicle::metadata::HorizonServiceCapabilities::underlying_type>>(m_value);
}

size_t HorizonServiceCapabilities::initializeOffsets(size_t bitPosition) const
{
    return bitPosition + bitSizeOf(bitPosition);
}

size_t HorizonServiceCapabilities::initializeOffsets(::zserio::DeltaContext& context, size_t bitPosition) const
{
    return bitPosition + bitSizeOf(context, bitPosition);
}

uint32_t HorizonServiceCapabilities::hashCode() const
{
    uint32_t result = ::zserio::HASH_SEED;
    result = ::zserio::calcHashCode(result, m_value);
    return result;
}

void HorizonServiceCapabilities::write(::zserio::BitStreamWriter& out) const
{
    out.writeBits(m_value, UINT8_C(32));
}

void HorizonServiceCapabilities::write(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out) const
{
    context.write<::zserio::StdIntArrayTraits<::nds::vehicle::metadata::HorizonServiceCapabilities::underlying_type>>(out, m_value);
}

::zserio::string<> HorizonServiceCapabilities::toString(const ::zserio::string<>::allocator_type& allocator) const
{
    ::zserio::string<> result(allocator);
    if ((*this & HorizonServiceCapabilities::Values::CALCULATE_HORIZON) == HorizonServiceCapabilities::Values::CALCULATE_HORIZON)
        result += result.empty() ? "CALCULATE_HORIZON" : " | CALCULATE_HORIZON";

    return ::zserio::toString<::zserio::string<>::allocator_type>(m_value, allocator) + "[" + result + "]";
}

HorizonServiceCapabilities::underlying_type HorizonServiceCapabilities::readValue(::zserio::BitStreamReader& in)
{
    return static_cast<underlying_type>(in.readBits(UINT8_C(32)));
}

HorizonServiceCapabilities::underlying_type HorizonServiceCapabilities::readValue(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in)
{
    return context.read<::zserio::StdIntArrayTraits<::nds::vehicle::metadata::HorizonServiceCapabilities::underlying_type>>(
            in);
}

} // namespace metadata
} // namespace vehicle
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

#include <nds/vehicle/metadata/VehicleRegistryMetadata.h>

namespace nds
{
namespace vehicle
{
namespace metadata
{

VehicleRegistryMetadata::VehicleRegistryMetadata(const allocator_type& allocator) noexcept :
        m_areChildrenInitialized(false),
        m_vehicleServiceType_(::nds::vehicle::metadata::VehicleServiceType()),
        m_capabilities_(allocator)
{
}

VehicleRegistryMetadata::VehicleRegistryMetadata(::zserio::BitStreamReader& in, const allocator_type& allocator) :
        m_areChildrenInitialized(true),
        m_vehicleServiceType_(readVehicleServiceType(in)),
        m_capabilities_(readCapabilities(in, allocator))
{
}

VehicleRegistryMetadata::VehicleRegistryMetadata(VehicleRegistryMetadata::ZserioPackingContext& context, ::zserio::BitStreamReader& in, const allocator_type& allocator) :
        m_areChildrenInitialized(true),
        m_vehicleServiceType_(readVehicleServiceType(context, in)),
        m_capabilities_(readCapabilities(context, in, allocator))
{
}

VehicleRegistryMetadata::VehicleRegistryMetadata(const VehicleRegistryMetadata& other) :
        m_vehicleServiceType_(other.m_vehicleServiceType_),
        m_capabilities_(other.m_capabilities_)
{
    if (other.m_areChildrenInitialized)
        initializeChildren();
    else
        m_areChildrenInitialized = false;
}

VehicleRegistryMetadata& VehicleRegistryMetadata::operator=(const VehicleRegistryMetadata& other)
{
    m_vehicleServiceType_ = other.m_vehicleServiceType_;
    m_capabilities_ = other.m_capabilities_;
    if (other.m_areChildrenInitialized)
        initializeChildren();
    else
        m_areChildrenInitialized = false;

    return *this;
}

VehicleRegistryMetadata::VehicleRegistryMetadata(VehicleRegistryMetadata&& other) :
        m_vehicleServiceType_(::std::move(other.m_vehicleServiceType_)),
        m_capabilities_(::std::move(other.m_capabilities_))
{
    if (other.m_areChildrenInitialized)
        initializeChildren();
    else
        m_areChildrenInitialized = false;
}

VehicleRegistryMetadata& VehicleRegistryMetadata::operator=(VehicleRegistryMetadata&& other)
{
    m_vehicleServiceType_ = ::std::move(other.m_vehicleServiceType_);
    m_capabilities_ = ::std::move(other.m_capabilities_);
    if (other.m_areChildrenInitialized)
        initializeChildren();
    else
        m_areChildrenInitialized = false;

    return *this;
}

VehicleRegistryMetadata::VehicleRegistryMetadata(::zserio::PropagateAllocatorT,
        const VehicleRegistryMetadata& other, const allocator_type& allocator) :
        m_vehicleServiceType_(::zserio::allocatorPropagatingCopy(other.m_vehicleServiceType_, allocator)),
        m_capabilities_(::zserio::allocatorPropagatingCopy(other.m_capabilities_, allocator))
{
    if (other.m_areChildrenInitialized)
        initializeChildren();
    else
        m_areChildrenInitialized = false;
}

void VehicleRegistryMetadata::initializeChildren()
{
    m_capabilities_.initialize(static_cast<::nds::vehicle::metadata::VehicleServiceType>(getVehicleServiceType()));

    m_areChildrenInitialized = true;
}

::nds::vehicle::metadata::VehicleServiceType VehicleRegistryMetadata::getVehicleServiceType() const
{
    return m_vehicleServiceType_;
}

void VehicleRegistryMetadata::setVehicleServiceType(::nds::vehicle::metadata::VehicleServiceType vehicleServiceType_)
{
    m_vehicleServiceType_ = vehicleServiceType_;
}

::nds::vehicle::metadata::VehicleServiceCapabilities& VehicleRegistryMetadata::getCapabilities()
{
    return m_capabilities_;
}

const ::nds::vehicle::metadata::VehicleServiceCapabilities& VehicleRegistryMetadata::getCapabilities() const
{
    return m_capabilities_;
}

void VehicleRegistryMetadata::setCapabilities(const ::nds::vehicle::metadata::VehicleServiceCapabilities& capabilities_)
{
    m_capabilities_ = capabilities_;
}

void VehicleRegistryMetadata::setCapabilities(::nds::vehicle::metadata::VehicleServiceCapabilities&& capabilities_)
{
    m_capabilities_ = ::std::move(capabilities_);
}

void VehicleRegistryMetadata::initPackingContext(VehicleRegistryMetadata::ZserioPackingContext& context) const
{
    ::zserio::initPackingContext(context.getVehicleServiceType(), m_vehicleServiceType_);
    m_capabilities_.initPackingContext(context.getCapabilities());
}

size_t VehicleRegistryMetadata::bitSizeOf(size_t bitPosition) const
{
    size_t endBitPosition = bitPosition;

    endBitPosition += ::zserio::bitSizeOf(m_vehicleServiceType_);
    endBitPosition += m_capabilities_.bitSizeOf(endBitPosition);

    return endBitPosition - bitPosition;
}

size_t VehicleRegistryMetadata::bitSizeOf(VehicleRegistryMetadata::ZserioPackingContext& context, size_t bitPosition) const
{
    size_t endBitPosition = bitPosition;

    endBitPosition += ::zserio::bitSizeOf(context.getVehicleServiceType(), m_vehicleServiceType_);
    endBitPosition += m_capabilities_.bitSizeOf(context.getCapabilities(), endBitPosition);

    return endBitPosition - bitPosition;
}

size_t VehicleRegistryMetadata::initializeOffsets(size_t bitPosition)
{
    size_t endBitPosition = bitPosition;

    endBitPosition = ::zserio::initializeOffsets(endBitPosition, m_vehicleServiceType_);
    endBitPosition = m_capabilities_.initializeOffsets(endBitPosition);

    return endBitPosition;
}

size_t VehicleRegistryMetadata::initializeOffsets(VehicleRegistryMetadata::ZserioPackingContext& context, size_t bitPosition)
{
    size_t endBitPosition = bitPosition;

    endBitPosition = ::zserio::initializeOffsets(context.getVehicleServiceType(), endBitPosition,
        m_vehicleServiceType_);
    endBitPosition = m_capabilities_.initializeOffsets(context.getCapabilities(), endBitPosition);

    return endBitPosition;
}

bool VehicleRegistryMetadata::operator==(const VehicleRegistryMetadata& other) const
{
    if (this != &other)
    {
        return
                (m_vehicleServiceType_ == other.m_vehicleServiceType_) &&
                (m_capabilities_ == other.m_capabilities_);
    }

    return true;
}

uint32_t VehicleRegistryMetadata::hashCode() const
{
    uint32_t result = ::zserio::HASH_SEED;

    result = ::zserio::calcHashCode(result, m_vehicleServiceType_);
    result = ::zserio::calcHashCode(result, m_capabilities_);

    return result;
}

void VehicleRegistryMetadata::write(::zserio::BitStreamWriter& out) const
{
    ::zserio::write(out, m_vehicleServiceType_);

    // check parameters
    if (m_capabilities_.getType() != static_cast<::nds::vehicle::metadata::VehicleServiceType>(getVehicleServiceType()))
    {
        throw ::zserio::CppRuntimeException("Write: Wrong parameter type for field VehicleRegistryMetadata.capabilities: ") <<
                m_capabilities_.getType() << " != " << static_cast<::nds::vehicle::metadata::VehicleServiceType>(getVehicleServiceType()) << "!";
    }
    m_capabilities_.write(out);
}

void VehicleRegistryMetadata::write(VehicleRegistryMetadata::ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const
{
    ::zserio::write(context.getVehicleServiceType(), out, m_vehicleServiceType_);

    // check parameters
    if (m_capabilities_.getType() != static_cast<::nds::vehicle::metadata::VehicleServiceType>(getVehicleServiceType()))
    {
        throw ::zserio::CppRuntimeException("Write: Wrong parameter type for field VehicleRegistryMetadata.capabilities: ") <<
                m_capabilities_.getType() << " != " << static_cast<::nds::vehicle::metadata::VehicleServiceType>(getVehicleServiceType()) << "!";
    }
    m_capabilities_.write(context.getCapabilities(), out);
}

::nds::vehicle::metadata::VehicleServiceType VehicleRegistryMetadata::readVehicleServiceType(::zserio::BitStreamReader& in)
{
    return ::zserio::read<::nds::vehicle::metadata::VehicleServiceType>(in);
}

::nds::vehicle::metadata::VehicleServiceType VehicleRegistryMetadata::readVehicleServiceType(VehicleRegistryMetadata::ZserioPackingContext& context, ::zserio::BitStreamReader& in)
{
    return ::zserio::read<::nds::vehicle::metadata::VehicleServiceType>(context.getVehicleServiceType(), in);
}
::nds::vehicle::metadata::VehicleServiceCapabilities VehicleRegistryMetadata::readCapabilities(::zserio::BitStreamReader& in,
        const allocator_type& allocator)
{
    return ::nds::vehicle::metadata::VehicleServiceCapabilities(in, static_cast<::nds::vehicle::metadata::VehicleServiceType>(getVehicleServiceType()), allocator);
}

::nds::vehicle::metadata::VehicleServiceCapabilities VehicleRegistryMetadata::readCapabilities(VehicleRegistryMetadata::ZserioPackingContext& context, ::zserio::BitStreamReader& in, const allocator_type& allocator)
{
    return ::nds::vehicle::metadata::VehicleServiceCapabilities(context.getCapabilities(), in, static_cast<::nds::vehicle::metadata::VehicleServiceType>(getVehicleServiceType()), allocator);
}

} // namespace metadata
} // namespace vehicle
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

#include <nds/vehicle/metadata/HorizonServiceCapabilitiesResponse.h>

namespace nds
{
namespace vehicle
{
namespace metadata
{

HorizonServiceCapabilitiesResponse::HorizonServiceCapabilitiesResponse(const allocator_type&) noexcept :
        m_capabilities_(::nds::vehicle::metadata::HorizonServiceCapabilities())
{
}

HorizonServiceCapabilitiesResponse::HorizonServiceCapabilitiesResponse(::zserio::BitStreamReader& in, const allocator_type&) :
        m_capabilities_(readCapabilities(in))
{
}

HorizonServiceCapabilitiesResponse::HorizonServiceCapabilitiesResponse(HorizonServiceCapabilitiesResponse::ZserioPackingContext& context, ::zserio::BitStreamReader& in, const allocator_type&) :
        m_capabilities_(readCapabilities(context, in))
{
}

HorizonServiceCapabilitiesResponse::HorizonServiceCapabilitiesResponse(::zserio::PropagateAllocatorT,
        const HorizonServiceCapabilitiesResponse& other, const allocator_type& allocator) :
        m_capabilities_(::zserio::allocatorPropagatingCopy(other.m_capabilities_, allocator))
{
}

::nds::vehicle::metadata::HorizonServiceCapabilities HorizonServiceCapabilitiesResponse::getCapabilities() const
{
    return m_capabilities_;
}

void HorizonServiceCapabilitiesResponse::setCapabilities(::nds::vehicle::metadata::HorizonServiceCapabilities capabilities_)
{
    m_capabilities_ = capabilities_;
}

void HorizonServiceCapabilitiesResponse::initPackingContext(HorizonServiceCapabilitiesResponse::ZserioPackingContext& context) const
{
    m_capabilities_.initPackingContext(context.getCapabilities());
}

size_t HorizonServiceCapabilitiesResponse::bitSizeOf(size_t bitPosition) const
{
    size_t endBitPosition = bitPosition;

    endBitPosition += m_capabilities_.bitSizeOf(endBitPosition);

    return endBitPosition - bitPosition;
}

size_t HorizonServiceCapabilitiesResponse::bitSizeOf(HorizonServiceCapabilitiesResponse::ZserioPackingContext& context, size_t bitPosition) const
{
    size_t endBitPosition = bitPosition;

    endBitPosition += m_capabilities_.bitSizeOf(context.getCapabilities(), endBitPosition);

    return endBitPosition - bitPosition;
}

size_t HorizonServiceCapabilitiesResponse::initializeOffsets(size_t bitPosition)
{
    size_t endBitPosition = bitPosition;

    endBitPosition = m_capabilities_.initializeOffsets(endBitPosition);

    return endBitPosition;
}

size_t HorizonServiceCapabilitiesResponse::initializeOffsets(HorizonServiceCapabilitiesResponse::ZserioPackingContext& context, size_t bitPosition)
{
    size_t endBitPosition = bitPosition;

    endBitPosition = m_capabilities_.initializeOffsets(context.getCapabilities(), endBitPosition);

    return endBitPosition;
}

bool HorizonServiceCapabilitiesResponse::operator==(const HorizonServiceCapabilitiesResponse& other) const
{
    if (this != &other)
    {
        return
                (m_capabilities_ == other.m_capabilities_);
    }

    return true;
}

uint32_t HorizonServiceCapabilitiesResponse::hashCode() const
{
    uint32_t result = ::zserio::HASH_SEED;

    result = ::zserio::calcHashCode(result, m_capabilities_);

    return result;
}

void HorizonServiceCapabilitiesResponse::write(::zserio::BitStreamWriter& out) const
{
    m_capabilities_.write(out);
}

void HorizonServiceCapabilitiesResponse::write(HorizonServiceCapabilitiesResponse::ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const
{
    m_capabilities_.write(context.getCapabilities(), out);
}

::nds::vehicle::metadata::HorizonServiceCapabilities HorizonServiceCapabilitiesResponse::readCapabilities(::zserio::BitStreamReader& in)
{
    return ::nds::vehicle::metadata::HorizonServiceCapabilities(in);
}

::nds::vehicle::metadata::HorizonServiceCapabilities HorizonServiceCapabilitiesResponse::readCapabilities(HorizonServiceCapabilitiesResponse::ZserioPackingContext& context, ::zserio::BitStreamReader& in)
{
    return ::nds::vehicle::metadata::HorizonServiceCapabilities(context.getCapabilities(), in);
}

} // namespace metadata
} // namespace vehicle
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

#include <nds/vehicle/metadata/VehicleServiceCapabilities.h>

namespace nds
{
namespace vehicle
{
namespace metadata
{

VehicleServiceCapabilities::VehicleServiceCapabilities(const allocator_type& allocator) noexcept :
        m_isInitialized(false),
        m_objectChoice(allocator)
{
}

VehicleServiceCapabilities::VehicleServiceCapabilities(::zserio::BitStreamReader& in,
        ::nds::vehicle::metadata::VehicleServiceType type_, const allocator_type& allocator) :
        m_type_(type_),
        m_isInitialized(true),
        m_objectChoice(readObject(in, allocator), allocator)
{
}

VehicleServiceCapabilities::VehicleServiceCapabilities(VehicleServiceCapabilities::ZserioPackingContext& context, ::zserio::BitStreamReader& in,
        ::nds::vehicle::metadata::VehicleServiceType type_, const allocator_type& allocator) :
        m_type_(type_),
        m_isInitialized(true),
        m_objectChoice(readObject(context, in, allocator), allocator)
{
}

VehicleServiceCapabilities::VehicleServiceCapabilities(const VehicleServiceCapabilities& other) :
        m_objectChoice(other.m_objectChoice)
{
    if (other.m_isInitialized)
        initialize(other.m_type_);
    else
        m_isInitialized = false;
}

VehicleServiceCapabilities& VehicleServiceCapabilities::operator=(const VehicleServiceCapabilities& other)
{
    m_objectChoice = other.m_objectChoice;
    if (other.m_isInitialized)
        initialize(other.m_type_);
    else
        m_isInitialized = false;

    return *this;
}

VehicleServiceCapabilities::VehicleServiceCapabilities(VehicleServiceCapabilities&& other) :
        m_objectChoice(::std::move(other.m_objectChoice))
{
    if (other.m_isInitialized)
        initialize(other.m_type_);
    else
        m_isInitialized = false;
}

VehicleServiceCapabilities& VehicleServiceCapabilities::operator=(VehicleServiceCapabilities&& other)
{
    m_objectChoice = ::std::move(other.m_objectChoice);
    if (other.m_isInitialized)
        initialize(other.m_type_);
    else
        m_isInitialized = false;

    return *this;
}

VehicleServiceCapabilities::VehicleServiceCapabilities(::zserio::PropagateAllocatorT,
        const VehicleServiceCapabilities& other, const allocator_type& allocator) :
        m_objectChoice(other.copyObject(allocator))
{
    if (other.m_isInitialized)
        initialize(other.m_type_);
    else
        m_isInitialized = false;
}

void VehicleServiceCapabilities::initialize(
        ::nds::vehicle::metadata::VehicleServiceType type_)
{
    m_type_ = type_;
    m_isInitialized = true;
}

bool VehicleServiceCapabilities::isInitialized() const
{
    return m_isInitialized;
}

::nds::vehicle::metadata::VehicleServiceType VehicleServiceCapabilities::getType() const
{
    if (!m_isInitialized)
        throw ::zserio::CppRuntimeException("Parameter 'type' of compound 'VehicleServiceCapabilities' is not initialized!");

    return m_type_;
}

::nds::vehicle::metadata::HorizonServiceCapabilities VehicleServiceCapabilities::getHorizonServiceCapabilities() const
{
    return m_objectChoice.get<::nds::vehicle::metadata::HorizonServiceCapabilities>();
}

void VehicleServiceCapabilities::setHorizonServiceCapabilities(::nds::vehicle::metadata::HorizonServiceCapabilities horizonServiceCapabilities_)
{
    m_objectChoice = horizonServiceCapabilities_;
}

VehicleServiceCapabilities::ChoiceTag VehicleServiceCapabilities::choiceTag() const
{
    switch (getType())
    {
    case ::nds::vehicle::metadata::VehicleServiceType::HORIZON_SERVICE:
        return CHOICE_horizonServiceCapabilities;
    default:
        return UNDEFINED_CHOICE;
    }
}

void VehicleServiceCapabilities::initPackingContext(VehicleServiceCapabilities::ZserioPackingContext& context) const
{
    switch (getType())
    {
    case ::nds::vehicle::metadata::VehicleServiceType::HORIZON_SERVICE:
        m_objectChoice.get<::nds::vehicle::metadata::HorizonServiceCapabilities>().initPackingContext(context.getHorizonServiceCapabilities());
        break;
    default:
        throw ::zserio::CppRuntimeException("No match in choice VehicleServiceCapabilities!");
    }
}

size_t VehicleServiceCapabilities::bitSizeOf(size_t bitPosition) const
{
    size_t endBitPosition = bitPosition;

    switch (getType())
    {
    case ::nds::vehicle::metadata::VehicleServiceType::HORIZON_SERVICE:
        endBitPosition += m_objectChoice.get<::nds::vehicle::metadata::HorizonServiceCapabilities>().bitSizeOf(endBitPosition);
        break;
    default:
        throw ::zserio::CppRuntimeException("No match in choice VehicleServiceCapabilities!");
    }

    return endBitPosition - bitPosition;
}

size_t VehicleServiceCapabilities::bitSizeOf(VehicleServiceCapabilities::ZserioPackingContext& context, size_t bitPosition) const
{
    size_t endBitPosition = bitPosition;

    switch (getType())
    {
    case ::nds::vehicle::metadata::VehicleServiceType::HORIZON_SERVICE:
        endBitPosition += m_objectChoice.get<::nds::vehicle::metadata::HorizonServiceCapabilities>().bitSizeOf(context.getHorizonServiceCapabilities(), endBitPosition);
        break;
    default:
        throw ::zserio::CppRuntimeException("No match in choice VehicleServiceCapabilities!");
    }

    return endBitPosition - bitPosition;
}

size_t VehicleServiceCapabilities::initializeOffsets(size_t bitPosition)
{
    size_t endBitPosition = bitPosition;

    switch (getType())
    {
    case ::nds::vehicle::metadata::VehicleServiceType::HORIZON_SERVICE:
        endBitPosition = m_objectChoice.get<::nds::vehicle::metadata::HorizonServiceCapabilities>().initializeOffsets(endBitPosition);
        break;
    default:
        throw ::zserio::CppRuntimeException("No match in choice VehicleServiceCapabilities!");
    }

    return endBitPosition;
}

size_t VehicleServiceCapabilities::initializeOffsets(VehicleServiceCapabilities::ZserioPackingContext& context, size_t bitPosition)
{
    size_t endBitPosition = bitPosition;

    switch (getType())
    {
    case ::nds::vehicle::metadata::VehicleServiceType::HORIZON_SERVICE:
        endBitPosition = m_objectChoice.get<::nds::vehicle::metadata::HorizonServiceCapabilities>().initializeOffsets(context.getHorizonServiceCapabilities(), endBitPosition);
        break;
    default:
        throw ::zserio::CppRuntimeException("No match in choice VehicleServiceCapabilities!");
    }

    return endBitPosition;
}

bool VehicleServiceCapabilities::operator==(const VehicleServiceCapabilities& other) const
{
    if (this == &other)
        return true;

    if (!(getType() == other.getType()))
        return false;

    switch (getType())
    {
    case ::nds::vehicle::metadata::VehicleServiceType::HORIZON_SERVICE:
        return (!m_objectChoice.hasValue() && !other.m_objectChoice.hasValue()) ||
                (m_objectChoice.hasValue() && other.m_objectChoice.hasValue() &&
                m_objectChoice.get<::nds::vehicle::metadata::HorizonServiceCapabilities>() == other.m_objectChoice.get<::nds::vehicle::metadata::HorizonServiceCapabilities>());
    default:
        throw ::zserio::CppRuntimeException("No match in choice VehicleServiceCapabilities!");
    }
}

uint32_t VehicleServiceCapabilities::hashCode() const
{
    uint32_t result = ::zserio::HASH_SEED;

    result = ::zserio::calcHashCode(result, getType());
    if (m_objectChoice.hasValue())
    {
        switch (getType())
        {
        case ::nds::vehicle::metadata::VehicleServiceType::HORIZON_SERVICE:
            result = ::zserio::calcHashCode(result, m_objectChoice.get<::nds::vehicle::metadata::HorizonServiceCapabilities>());
            break;
        default:
            break;
        }
    }

    return result;
}

void VehicleServiceCapabilities::write(::zserio::BitStreamWriter& out) const
{
    switch (getType())
    {
    case ::nds::vehicle::metadata::VehicleServiceType::HORIZON_SERVICE:
        m_objectChoice.get<::nds::vehicle::metadata::HorizonServiceCapabilities>().write(out);
        break;
    default:
        throw ::zserio::CppRuntimeException("No match in choice VehicleServiceCapabilities!");
    }
}

void VehicleServiceCapabilities::write(VehicleServiceCapabilities::ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const
{
    switch (getType())
    {
    case ::nds::vehicle::metadata::VehicleServiceType::HORIZON_SERVICE:
        m_objectChoice.get<::nds::vehicle::metadata::HorizonServiceCapabilities>().write(context.getHorizonServiceCapabilities(), out);
        break;
    default:
        throw ::zserio::CppRuntimeException("No match in choice VehicleServiceCapabilities!");
    }
}

::zserio::AnyHolder<> VehicleServiceCapabilities::readObject(::zserio::BitStreamReader& in, const allocator_type& allocator)
{
    switch (getType())
    {
    case ::nds::vehicle::metadata::VehicleServiceType::HORIZON_SERVICE:
        return ::zserio::AnyHolder<>(::nds::vehicle::metadata::HorizonServiceCapabilities(in), allocator);
    default:
        throw ::zserio::CppRuntimeException("No match in choice VehicleServiceCapabilities!");
    }
}

::zserio::AnyHolder<> VehicleServiceCapabilities::readObject(VehicleServiceCapabilities::ZserioPackingContext& context,
        ::zserio::BitStreamReader& in, const allocator_type& allocator)
{
    switch (getType())
    {
    case ::nds::vehicle::metadata::VehicleServiceType::HORIZON_SERVICE:
        return ::zserio::AnyHolder<>(::nds::vehicle::metadata::HorizonServiceCapabilities(context.getHorizonServiceCapabilities(), in), allocator);
    default:
        throw ::zserio::CppRuntimeException("No match in choice VehicleServiceCapabilities!");
    }
}

::zserio::AnyHolder<> VehicleServiceCapabilities::copyObject(const allocator_type& allocator) const
{
    switch (getType())
    {
    case ::nds::vehicle::metadata::VehicleServiceType::HORIZON_SERVICE:
        return ::zserio::allocatorPropagatingCopy<::nds::vehicle::metadata::HorizonServiceCapabilities>(m_objectChoice, allocator);
    default:
        throw ::zserio::CppRuntimeException("No match in choice VehicleServiceCapabilities!");
    }
}

} // namespace metadata
} // namespace vehicle
} // namespace nds