/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#include <zserio/StringConvertUtil.h>
#include <zserio/CppRuntimeException.h>

#include <nds/localization/properties/PropertyType.h>

namespace zserio
{

// This is full specialization of enumeration traits and methods for PropertyType enumeration.
constexpr ::std::array<const char*, 1> EnumTraits<::nds::localization::properties::PropertyType>::names;
constexpr ::std::array<::nds::localization::properties::PropertyType, 1> EnumTraits<::nds::localization::properties::PropertyType>::values;
constexpr const char* EnumTraits<::nds::localization::properties::PropertyType>::enumName;

template <>
size_t enumToOrdinal(::nds::localization::properties::PropertyType value)
{
    switch (value)
    {
    case ::nds::localization::properties::PropertyType::CORE:
        return 0;
    default:
        throw ::zserio::CppRuntimeException("Unknown value for enumeration PropertyType: ") <<
                static_cast<typename ::std::underlying_type<::nds::localization::properties::PropertyType>::type>(value) << "!";
    }
}

template <>
::nds::localization::properties::PropertyType valueToEnum(
        typename ::std::underlying_type<::nds::localization::properties::PropertyType>::type rawValue)
{
    switch (rawValue)
    {
    case UINT16_C(0):
        return static_cast<::nds::localization::properties::PropertyType>(rawValue);
    default:
        throw ::zserio::CppRuntimeException("Unknown value for enumeration PropertyType: ") << rawValue << "!";
    }
}

template <>
uint32_t enumHashCode<::nds::localization::properties::PropertyType>(::nds::localization::properties::PropertyType value)
{
    uint32_t result = ::zserio::HASH_SEED;
    result = ::zserio::calcHashCode(result, enumToValue(value));
    return result;
}

template <>
void initPackingContext(::zserio::DeltaContext& context, ::nds::localization::properties::PropertyType value)
{
    context.init<::zserio::VarIntNNArrayTraits<typename ::std::underlying_type<::nds::localization::properties::PropertyType>::type>>(
            ::zserio::enumToValue(value));
}

template <>
size_t bitSizeOf(::nds::localization::properties::PropertyType value)
{
    return ::zserio::bitSizeOfVarUInt16(::zserio::enumToValue(value));
}

template <>
size_t bitSizeOf(::zserio::DeltaContext& context, ::nds::localization::properties::PropertyType value)
{
    return context.bitSizeOf<::zserio::VarIntNNArrayTraits<typename ::std::underlying_type<::nds::localization::properties::PropertyType>::type>>(
            ::zserio::enumToValue(value));
}

template <>
size_t initializeOffsets(size_t bitPosition, ::nds::localization::properties::PropertyType value)
{
    return bitPosition + bitSizeOf(value);
}

template <>
size_t initializeOffsets(::zserio::DeltaContext& context, size_t bitPosition, ::nds::localization::properties::PropertyType value)
{
    return bitPosition + bitSizeOf(context, value);
}

template <>
::nds::localization::properties::PropertyType read(::zserio::BitStreamReader& in)
{
    return valueToEnum<::nds::localization::properties::PropertyType>(
            static_cast<typename ::std::underlying_type<::nds::localization::properties::PropertyType>::type>(
                    in.readVarUInt16()));
}

template <>
::nds::localization::properties::PropertyType read(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in)
{
    return valueToEnum<::nds::localization::properties::PropertyType>(context.read<::zserio::VarIntNNArrayTraits<typename ::std::underlying_type<::nds::localization::properties::PropertyType>::type>>(
            in));
}

template <>
void write(::zserio::BitStreamWriter& out, ::nds::localization::properties::PropertyType value)
{
    out.writeVarUInt16(::zserio::enumToValue(value));
}

template <>
void write(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out, ::nds::localization::properties::PropertyType value)
{
    context.write<::zserio::VarIntNNArrayTraits<typename ::std::underlying_type<::nds::localization::properties::PropertyType>::type>>(
            out, ::zserio::enumToValue(value));
}

} // namespace zserio

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
#include <zserio/ArrayTraits.h>

#include <nds/localization/properties/LocalizationPropertyType.h>
#include <nds/localization/properties/PropertyType.h>

namespace nds
{
namespace localization
{
namespace properties
{

LocalizationPropertyType::LocalizationPropertyType(const allocator_type&) noexcept :
        m_type_(::nds::localization::properties::PropertyType()),
        m_coreType_(::zserio::NullOpt)
{
}

LocalizationPropertyType::LocalizationPropertyType(::zserio::BitStreamReader& in, const allocator_type&) :
        m_type_(readType(in)),
        m_coreType_(readCoreType(in))
{
}

LocalizationPropertyType::LocalizationPropertyType(LocalizationPropertyType::ZserioPackingContext& context, ::zserio::BitStreamReader& in, const allocator_type&) :
        m_type_(readType(context, in)),
        m_coreType_(readCoreType(context, in))
{
}

LocalizationPropertyType::LocalizationPropertyType(::zserio::PropagateAllocatorT,
        const LocalizationPropertyType& other, const allocator_type& allocator) :
        m_type_(::zserio::allocatorPropagatingCopy(other.m_type_, allocator)),
        m_coreType_(::zserio::allocatorPropagatingCopy(other.m_coreType_, allocator))
{
}

::nds::localization::properties::PropertyType LocalizationPropertyType::getType() const
{
    return m_type_;
}

void LocalizationPropertyType::setType(::nds::localization::properties::PropertyType type_)
{
    m_type_ = type_;
}

::nds::core::properties::CorePropertyType LocalizationPropertyType::getCoreType() const
{
    return m_coreType_.value();
}

void LocalizationPropertyType::setCoreType(::nds::core::properties::CorePropertyType coreType_)
{
    m_coreType_ = coreType_;
}

bool LocalizationPropertyType::isCoreTypeUsed() const
{
    return (getType() == ::nds::localization::properties::PropertyType::CORE);
}

bool LocalizationPropertyType::isCoreTypeSet() const
{
    return m_coreType_.hasValue();
}

void LocalizationPropertyType::resetCoreType()
{
    m_coreType_.reset();
}

void LocalizationPropertyType::initPackingContext(LocalizationPropertyType::ZserioPackingContext& context) const
{
    ::zserio::initPackingContext(context.getType(), m_type_);
    if (getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        ::zserio::initPackingContext(context.getCoreType(), m_coreType_.value());
    }
}

size_t LocalizationPropertyType::bitSizeOf(size_t bitPosition) const
{
    size_t endBitPosition = bitPosition;

    endBitPosition += ::zserio::bitSizeOf(m_type_);
    if (getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        endBitPosition += ::zserio::bitSizeOf(m_coreType_.value());
    }

    return endBitPosition - bitPosition;
}

size_t LocalizationPropertyType::bitSizeOf(LocalizationPropertyType::ZserioPackingContext& context, size_t bitPosition) const
{
    size_t endBitPosition = bitPosition;

    endBitPosition += ::zserio::bitSizeOf(context.getType(), m_type_);
    if (getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        endBitPosition += ::zserio::bitSizeOf(context.getCoreType(), m_coreType_.value());
    }

    return endBitPosition - bitPosition;
}

size_t LocalizationPropertyType::initializeOffsets(size_t bitPosition)
{
    size_t endBitPosition = bitPosition;

    endBitPosition = ::zserio::initializeOffsets(endBitPosition, m_type_);
    if (getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        endBitPosition = ::zserio::initializeOffsets(endBitPosition, m_coreType_.value());
    }

    return endBitPosition;
}

size_t LocalizationPropertyType::initializeOffsets(LocalizationPropertyType::ZserioPackingContext& context, size_t bitPosition)
{
    size_t endBitPosition = bitPosition;

    endBitPosition = ::zserio::initializeOffsets(context.getType(), endBitPosition,
        m_type_);
    if (getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        endBitPosition = ::zserio::initializeOffsets(context.getCoreType(), endBitPosition,
        m_coreType_.value());
    }

    return endBitPosition;
}

bool LocalizationPropertyType::operator==(const LocalizationPropertyType& other) const
{
    if (this != &other)
    {
        return
                (m_type_ == other.m_type_) &&
                (!isCoreTypeUsed() ? !other.isCoreTypeUsed() : (m_coreType_ == other.m_coreType_));
    }

    return true;
}

uint32_t LocalizationPropertyType::hashCode() const
{
    uint32_t result = ::zserio::HASH_SEED;

    result = ::zserio::calcHashCode(result, m_type_);
    if (isCoreTypeUsed())
        result = ::zserio::calcHashCode(result, m_coreType_);

    return result;
}

void LocalizationPropertyType::write(::zserio::BitStreamWriter& out) const
{
    ::zserio::write(out, m_type_);
    if (getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        ::zserio::write(out, m_coreType_.value());
    }
}

void LocalizationPropertyType::write(LocalizationPropertyType::ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const
{
    ::zserio::write(context.getType(), out, m_type_);
    if (getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        ::zserio::write(context.getCoreType(), out, m_coreType_.value());
    }
}

::nds::localization::properties::PropertyType LocalizationPropertyType::readType(::zserio::BitStreamReader& in)
{
    return ::zserio::read<::nds::localization::properties::PropertyType>(in);
}

::nds::localization::properties::PropertyType LocalizationPropertyType::readType(LocalizationPropertyType::ZserioPackingContext& context, ::zserio::BitStreamReader& in)
{
    return ::zserio::read<::nds::localization::properties::PropertyType>(context.getType(), in);
}
::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyType> LocalizationPropertyType::readCoreType(::zserio::BitStreamReader& in)
{
    if (getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        return ::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyType>(::zserio::read<::nds::core::properties::CorePropertyType>(in));
    }

    return ::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyType>(::zserio::NullOpt);
}

::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyType> LocalizationPropertyType::readCoreType(LocalizationPropertyType::ZserioPackingContext& context, ::zserio::BitStreamReader& in)
{
    if (getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        return ::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyType>(::zserio::read<::nds::core::properties::CorePropertyType>(context.getCoreType(), in));
    }

    return ::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyType>(::zserio::NullOpt);
}

} // namespace properties
} // namespace localization
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
#include <zserio/ArrayTraits.h>

#include <nds/localization/properties/LocalizationPropertyValue.h>
#include <nds/localization/properties/PropertyType.h>

namespace nds
{
namespace localization
{
namespace properties
{

LocalizationPropertyValue::LocalizationPropertyValue(const allocator_type&) noexcept :
        m_isInitialized(false),
        m_value_(::zserio::NullOpt),
        m_coreValue_(::zserio::NullOpt)
{
}

LocalizationPropertyValue::LocalizationPropertyValue(::zserio::BitStreamReader& in,
        ::nds::localization::properties::LocalizationPropertyType& type_, const allocator_type& allocator) :
        m_type_(&type_),
        m_isInitialized(true),
        m_value_(readValue(in, allocator)),
        m_coreValue_(readCoreValue(in, allocator))
{
}

LocalizationPropertyValue::LocalizationPropertyValue(LocalizationPropertyValue::ZserioPackingContext& context, ::zserio::BitStreamReader& in,
        ::nds::localization::properties::LocalizationPropertyType& type_, const allocator_type& allocator) :
        m_type_(&type_),
        m_isInitialized(true),
        m_value_(readValue(in, allocator)),
        m_coreValue_(readCoreValue(context, in, allocator))
{
}

LocalizationPropertyValue::LocalizationPropertyValue(const LocalizationPropertyValue& other) :
        m_value_(other.m_value_),
        m_coreValue_(other.m_coreValue_)
{
    if (other.m_isInitialized)
        initialize(*(other.m_type_));
    else
        m_isInitialized = false;
}

LocalizationPropertyValue& LocalizationPropertyValue::operator=(const LocalizationPropertyValue& other)
{
    m_value_ = other.m_value_;
    m_coreValue_ = other.m_coreValue_;
    if (other.m_isInitialized)
        initialize(*(other.m_type_));
    else
        m_isInitialized = false;

    return *this;
}

LocalizationPropertyValue::LocalizationPropertyValue(LocalizationPropertyValue&& other) :
        m_value_(::std::move(other.m_value_)),
        m_coreValue_(::std::move(other.m_coreValue_))
{
    if (other.m_isInitialized)
        initialize(*(other.m_type_));
    else
        m_isInitialized = false;
}

LocalizationPropertyValue& LocalizationPropertyValue::operator=(LocalizationPropertyValue&& other)
{
    m_value_ = ::std::move(other.m_value_);
    m_coreValue_ = ::std::move(other.m_coreValue_);
    if (other.m_isInitialized)
        initialize(*(other.m_type_));
    else
        m_isInitialized = false;

    return *this;
}

LocalizationPropertyValue::LocalizationPropertyValue(::zserio::PropagateAllocatorT,
        const LocalizationPropertyValue& other, const allocator_type& allocator) :
        m_value_(::zserio::allocatorPropagatingCopy(other.m_value_, allocator)),
        m_coreValue_(::zserio::allocatorPropagatingCopy(other.m_coreValue_, allocator))
{
    if (other.m_isInitialized)
        initialize(*(other.m_type_));
    else
        m_isInitialized = false;
}

void LocalizationPropertyValue::initialize(
        ::nds::localization::properties::LocalizationPropertyType& type_)
{
    m_type_ = &type_;
    m_isInitialized = true;

    initializeChildren();
}

bool LocalizationPropertyValue::isInitialized() const
{
    return m_isInitialized;
}

void LocalizationPropertyValue::initializeChildren()
{
    if (getType().getType() != ::nds::localization::properties::PropertyType::CORE)
        m_value_.value().initialize(static_cast<::nds::localization::properties::PropertyType>(getType().getType()));
    if (getType().getType() == ::nds::localization::properties::PropertyType::CORE)
        m_coreValue_.value().initialize(static_cast<::nds::core::properties::CorePropertyType>(getType().getCoreType()));
}

::nds::localization::properties::LocalizationPropertyType& LocalizationPropertyValue::getType()
{
    if (!m_isInitialized)
        throw ::zserio::CppRuntimeException("Parameter 'type' of compound 'LocalizationPropertyValue' is not initialized!");

    return *m_type_;
}

const ::nds::localization::properties::LocalizationPropertyType& LocalizationPropertyValue::getType() const
{
    if (!m_isInitialized)
        throw ::zserio::CppRuntimeException("Parameter 'type' of compound 'LocalizationPropertyValue' is not initialized!");

    return *m_type_;
}

::nds::localization::properties::PropertyValue& LocalizationPropertyValue::getValue()
{
    return m_value_.value();
}

const ::nds::localization::properties::PropertyValue& LocalizationPropertyValue::getValue() const
{
    return m_value_.value();
}

void LocalizationPropertyValue::setValue(const ::nds::localization::properties::PropertyValue& value_)
{
    m_value_ = value_;
}

void LocalizationPropertyValue::setValue(::nds::localization::properties::PropertyValue&& value_)
{
    m_value_ = ::std::move(value_);
}

bool LocalizationPropertyValue::isValueUsed() const
{
    return (getType().getType() != ::nds::localization::properties::PropertyType::CORE);
}

bool LocalizationPropertyValue::isValueSet() const
{
    return m_value_.hasValue();
}

void LocalizationPropertyValue::resetValue()
{
    m_value_.reset();
}

::nds::core::properties::CorePropertyValue& LocalizationPropertyValue::getCoreValue()
{
    return m_coreValue_.value();
}

const ::nds::core::properties::CorePropertyValue& LocalizationPropertyValue::getCoreValue() const
{
    return m_coreValue_.value();
}

void LocalizationPropertyValue::setCoreValue(const ::nds::core::properties::CorePropertyValue& coreValue_)
{
    m_coreValue_ = coreValue_;
}

void LocalizationPropertyValue::setCoreValue(::nds::core::properties::CorePropertyValue&& coreValue_)
{
    m_coreValue_ = ::std::move(coreValue_);
}

bool LocalizationPropertyValue::isCoreValueUsed() const
{
    return (getType().getType() == ::nds::localization::properties::PropertyType::CORE);
}

bool LocalizationPropertyValue::isCoreValueSet() const
{
    return m_coreValue_.hasValue();
}

void LocalizationPropertyValue::resetCoreValue()
{
    m_coreValue_.reset();
}

void LocalizationPropertyValue::initPackingContext(LocalizationPropertyValue::ZserioPackingContext& context) const
{
    if (getType().getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        m_coreValue_.value().initPackingContext(context.getCoreValue());
    }
}

size_t LocalizationPropertyValue::bitSizeOf(size_t bitPosition) const
{
    size_t endBitPosition = bitPosition;

    if (getType().getType() != ::nds::localization::properties::PropertyType::CORE)
    {
        endBitPosition += m_value_.value().bitSizeOf(endBitPosition);
    }
    if (getType().getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        endBitPosition += m_coreValue_.value().bitSizeOf(endBitPosition);
    }

    return endBitPosition - bitPosition;
}

size_t LocalizationPropertyValue::bitSizeOf(LocalizationPropertyValue::ZserioPackingContext& context, size_t bitPosition) const
{
    size_t endBitPosition = bitPosition;

    if (getType().getType() != ::nds::localization::properties::PropertyType::CORE)
    {
        endBitPosition += m_value_.value().bitSizeOf(endBitPosition);
    }
    if (getType().getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        endBitPosition += m_coreValue_.value().bitSizeOf(context.getCoreValue(), endBitPosition);
    }

    return endBitPosition - bitPosition;
}

size_t LocalizationPropertyValue::initializeOffsets(size_t bitPosition)
{
    size_t endBitPosition = bitPosition;

    if (getType().getType() != ::nds::localization::properties::PropertyType::CORE)
    {
        endBitPosition = m_value_.value().initializeOffsets(endBitPosition);
    }
    if (getType().getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        endBitPosition = m_coreValue_.value().initializeOffsets(endBitPosition);
    }

    return endBitPosition;
}

size_t LocalizationPropertyValue::initializeOffsets(LocalizationPropertyValue::ZserioPackingContext& context, size_t bitPosition)
{
    size_t endBitPosition = bitPosition;

    if (getType().getType() != ::nds::localization::properties::PropertyType::CORE)
    {
        endBitPosition = m_value_.value().initializeOffsets(endBitPosition);
    }
    if (getType().getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        endBitPosition = m_coreValue_.value().initializeOffsets(context.getCoreValue(), endBitPosition);
    }

    return endBitPosition;
}

bool LocalizationPropertyValue::operator==(const LocalizationPropertyValue& other) const
{
    if (this != &other)
    {
        return
                (getType() == other.getType()) &&
                (!isValueUsed() ? !other.isValueUsed() : (m_value_ == other.m_value_)) &&
                (!isCoreValueUsed() ? !other.isCoreValueUsed() : (m_coreValue_ == other.m_coreValue_));
    }

    return true;
}

uint32_t LocalizationPropertyValue::hashCode() const
{
    uint32_t result = ::zserio::HASH_SEED;

    result = ::zserio::calcHashCode(result, getType());
    if (isValueUsed())
        result = ::zserio::calcHashCode(result, m_value_);
    if (isCoreValueUsed())
        result = ::zserio::calcHashCode(result, m_coreValue_);

    return result;
}

void LocalizationPropertyValue::write(::zserio::BitStreamWriter& out) const
{
    if (getType().getType() != ::nds::localization::properties::PropertyType::CORE)
    {
        // check parameters
        if (m_value_.value().getType() != static_cast<::nds::localization::properties::PropertyType>(getType().getType()))
        {
            throw ::zserio::CppRuntimeException("Write: Wrong parameter type for field LocalizationPropertyValue.value: ") <<
                    m_value_.value().getType() << " != " << static_cast<::nds::localization::properties::PropertyType>(getType().getType()) << "!";
        }
        m_value_.value().write(out);
    }

    if (getType().getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        // check parameters
        if (m_coreValue_.value().getType() != static_cast<::nds::core::properties::CorePropertyType>(getType().getCoreType()))
        {
            throw ::zserio::CppRuntimeException("Write: Wrong parameter type for field LocalizationPropertyValue.coreValue: ") <<
                    m_coreValue_.value().getType() << " != " << static_cast<::nds::core::properties::CorePropertyType>(getType().getCoreType()) << "!";
        }
        m_coreValue_.value().write(out);
    }
}

void LocalizationPropertyValue::write(LocalizationPropertyValue::ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const
{
    if (getType().getType() != ::nds::localization::properties::PropertyType::CORE)
    {
        // check parameters
        if (m_value_.value().getType() != static_cast<::nds::localization::properties::PropertyType>(getType().getType()))
        {
            throw ::zserio::CppRuntimeException("Write: Wrong parameter type for field LocalizationPropertyValue.value: ") <<
                    m_value_.value().getType() << " != " << static_cast<::nds::localization::properties::PropertyType>(getType().getType()) << "!";
        }
        m_value_.value().write(out);
    }

    if (getType().getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        // check parameters
        if (m_coreValue_.value().getType() != static_cast<::nds::core::properties::CorePropertyType>(getType().getCoreType()))
        {
            throw ::zserio::CppRuntimeException("Write: Wrong parameter type for field LocalizationPropertyValue.coreValue: ") <<
                    m_coreValue_.value().getType() << " != " << static_cast<::nds::core::properties::CorePropertyType>(getType().getCoreType()) << "!";
        }
        m_coreValue_.value().write(context.getCoreValue(), out);
    }
}

::zserio::InplaceOptionalHolder<::nds::localization::properties::PropertyValue> LocalizationPropertyValue::readValue(::zserio::BitStreamReader& in,
        const allocator_type& allocator)
{
    if (getType().getType() != ::nds::localization::properties::PropertyType::CORE)
    {
        return ::zserio::InplaceOptionalHolder<::nds::localization::properties::PropertyValue>(::nds::localization::properties::PropertyValue(in, static_cast<::nds::localization::properties::PropertyType>(getType().getType()), allocator));
    }

    return ::zserio::InplaceOptionalHolder<::nds::localization::properties::PropertyValue>(::zserio::NullOpt);
}
::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyValue> LocalizationPropertyValue::readCoreValue(::zserio::BitStreamReader& in,
        const allocator_type& allocator)
{
    if (getType().getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        return ::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyValue>(::nds::core::properties::CorePropertyValue(in, static_cast<::nds::core::properties::CorePropertyType>(getType().getCoreType()), allocator));
    }

    return ::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyValue>(::zserio::NullOpt);
}

::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyValue> LocalizationPropertyValue::readCoreValue(LocalizationPropertyValue::ZserioPackingContext& context, ::zserio::BitStreamReader& in, const allocator_type& allocator)
{
    if (getType().getType() == ::nds::localization::properties::PropertyType::CORE)
    {
        return ::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyValue>(::nds::core::properties::CorePropertyValue(context.getCoreValue(), in, static_cast<::nds::core::properties::CorePropertyType>(getType().getCoreType()), allocator));
    }

    return ::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyValue>(::zserio::NullOpt);
}

} // namespace properties
} // namespace localization
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

#include <nds/localization/properties/PropertyValue.h>

namespace nds
{
namespace localization
{
namespace properties
{

PropertyValue::PropertyValue(const allocator_type&) noexcept :
        m_isInitialized(false)
{
}

PropertyValue::PropertyValue(::zserio::BitStreamReader&,
        ::nds::localization::properties::PropertyType type_, const allocator_type&) :
        m_type_(type_),
        m_isInitialized(true)
{
}

PropertyValue::PropertyValue(const PropertyValue& other)
{
    if (other.m_isInitialized)
        initialize(other.m_type_);
    else
        m_isInitialized = false;
}

PropertyValue& PropertyValue::operator=(const PropertyValue& other)
{
    if (other.m_isInitialized)
        initialize(other.m_type_);
    else
        m_isInitialized = false;

    return *this;
}

PropertyValue::PropertyValue(PropertyValue&& other)
{
    if (other.m_isInitialized)
        initialize(other.m_type_);
    else
        m_isInitialized = false;
}

PropertyValue& PropertyValue::operator=(PropertyValue&& other)
{
    if (other.m_isInitialized)
        initialize(other.m_type_);
    else
        m_isInitialized = false;

    return *this;
}

PropertyValue::PropertyValue(::zserio::PropagateAllocatorT,
        const PropertyValue& other, const allocator_type&)
{
    if (other.m_isInitialized)
        initialize(other.m_type_);
    else
        m_isInitialized = false;
}

void PropertyValue::initialize(
        ::nds::localization::properties::PropertyType type_)
{
    m_type_ = type_;
    m_isInitialized = true;
}

bool PropertyValue::isInitialized() const
{
    return m_isInitialized;
}

::nds::localization::properties::PropertyType PropertyValue::getType() const
{
    if (!m_isInitialized)
        throw ::zserio::CppRuntimeException("Parameter 'type' of compound 'PropertyValue' is not initialized!");

    return m_type_;
}

PropertyValue::ChoiceTag PropertyValue::choiceTag() const
{
    return UNDEFINED_CHOICE;
}

size_t PropertyValue::bitSizeOf(size_t) const
{
    return 0;
}

size_t PropertyValue::initializeOffsets(size_t bitPosition)
{
    return bitPosition;
}

bool PropertyValue::operator==(const PropertyValue& other) const
{
    if (this == &other)
        return true;

    if (!(getType() == other.getType()))
        return false;

    return true;
}

uint32_t PropertyValue::hashCode() const
{
    uint32_t result = ::zserio::HASH_SEED;

    result = ::zserio::calcHashCode(result, getType());

    return result;
}

void PropertyValue::write(::zserio::BitStreamWriter&) const
{
}

} // namespace properties
} // namespace localization
} // namespace nds
