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

#include <nds/road/instantiations/RoadShapesLayer.h>

namespace nds
{
namespace road
{
namespace instantiations
{

RoadShapesLayer::RoadShapesLayer(const allocator_type& allocator) noexcept :
        m_isInitialized(false),
        m_coordShiftXY_(::nds::core::geometry::CoordShift()),
        m_coordShiftZ_(::nds::core::geometry::CoordShift()),
        m_numElements_(uint32_t()),
        m_identifier_(::zserio::NullOpt),
        m_types_(::zserio::NullOpt),
        m_buffers_(allocator)
{
}

RoadShapesLayer::RoadShapesLayer(::zserio::BitStreamReader& in,
        ::nds::core::geometry::GeometryLayerType type_,
        bool hasIds_,
        bool hasTypes_, const allocator_type& allocator) :
        m_type_(type_),
        m_hasIds_(hasIds_),
        m_hasTypes_(hasTypes_),
        m_isInitialized(true),
        m_coordShiftXY_(readCoordShiftXY(in)),
        m_coordShiftZ_(readCoordShiftZ(in)),
        m_numElements_(readNumElements(in)),
        m_identifier_(readIdentifier(in, allocator)),
        m_types_(readTypes(in, allocator)),
        m_buffers_(readBuffers(in, allocator))
{
}

RoadShapesLayer::RoadShapesLayer(RoadShapesLayer::ZserioPackingContext& context, ::zserio::BitStreamReader& in,
        ::nds::core::geometry::GeometryLayerType type_,
        bool hasIds_,
        bool hasTypes_, const allocator_type& allocator) :
        m_type_(type_),
        m_hasIds_(hasIds_),
        m_hasTypes_(hasTypes_),
        m_isInitialized(true),
        m_coordShiftXY_(readCoordShiftXY(context, in)),
        m_coordShiftZ_(readCoordShiftZ(context, in)),
        m_numElements_(readNumElements(context, in)),
        m_identifier_(readIdentifier(context, in, allocator)),
        m_types_(readTypes(in, allocator)),
        m_buffers_(readBuffers(context, in, allocator))
{
}

RoadShapesLayer::RoadShapesLayer(const RoadShapesLayer& other) :
        m_coordShiftXY_(other.m_coordShiftXY_),
        m_coordShiftZ_(other.m_coordShiftZ_),
        m_numElements_(other.m_numElements_),
        m_identifier_(other.m_identifier_),
        m_types_(other.m_types_),
        m_buffers_(other.m_buffers_)
{
    if (other.m_isInitialized)
        initialize(other.m_type_, other.m_hasIds_, other.m_hasTypes_);
    else
        m_isInitialized = false;
}

RoadShapesLayer& RoadShapesLayer::operator=(const RoadShapesLayer& other)
{
    m_coordShiftXY_ = other.m_coordShiftXY_;
    m_coordShiftZ_ = other.m_coordShiftZ_;
    m_numElements_ = other.m_numElements_;
    m_identifier_ = other.m_identifier_;
    m_types_ = other.m_types_;
    m_buffers_ = other.m_buffers_;
    if (other.m_isInitialized)
        initialize(other.m_type_, other.m_hasIds_, other.m_hasTypes_);
    else
        m_isInitialized = false;

    return *this;
}

RoadShapesLayer::RoadShapesLayer(RoadShapesLayer&& other) :
        m_coordShiftXY_(::std::move(other.m_coordShiftXY_)),
        m_coordShiftZ_(::std::move(other.m_coordShiftZ_)),
        m_numElements_(::std::move(other.m_numElements_)),
        m_identifier_(::std::move(other.m_identifier_)),
        m_types_(::std::move(other.m_types_)),
        m_buffers_(::std::move(other.m_buffers_))
{
    if (other.m_isInitialized)
        initialize(other.m_type_, other.m_hasIds_, other.m_hasTypes_);
    else
        m_isInitialized = false;
}

RoadShapesLayer& RoadShapesLayer::operator=(RoadShapesLayer&& other)
{
    m_coordShiftXY_ = ::std::move(other.m_coordShiftXY_);
    m_coordShiftZ_ = ::std::move(other.m_coordShiftZ_);
    m_numElements_ = ::std::move(other.m_numElements_);
    m_identifier_ = ::std::move(other.m_identifier_);
    m_types_ = ::std::move(other.m_types_);
    m_buffers_ = ::std::move(other.m_buffers_);
    if (other.m_isInitialized)
        initialize(other.m_type_, other.m_hasIds_, other.m_hasTypes_);
    else
        m_isInitialized = false;

    return *this;
}

RoadShapesLayer::RoadShapesLayer(::zserio::PropagateAllocatorT,
        const RoadShapesLayer& other, const allocator_type& allocator) :
        m_coordShiftXY_(::zserio::allocatorPropagatingCopy(other.m_coordShiftXY_, allocator)),
        m_coordShiftZ_(::zserio::allocatorPropagatingCopy(other.m_coordShiftZ_, allocator)),
        m_numElements_(::zserio::allocatorPropagatingCopy(other.m_numElements_, allocator)),
        m_identifier_(::zserio::allocatorPropagatingCopy(other.m_identifier_, allocator)),
        m_types_(::zserio::allocatorPropagatingCopy(other.m_types_, allocator)),
        m_buffers_(::zserio::allocatorPropagatingCopy(other.m_buffers_, allocator))
{
    if (other.m_isInitialized)
        initialize(other.m_type_, other.m_hasIds_, other.m_hasTypes_);
    else
        m_isInitialized = false;
}

void RoadShapesLayer::initialize(
        ::nds::core::geometry::GeometryLayerType type_,
        bool hasIds_,
        bool hasTypes_)
{
    m_type_ = type_;
    m_hasIds_ = hasIds_;
    m_hasTypes_ = hasTypes_;
    m_isInitialized = true;

    initializeChildren();
}

bool RoadShapesLayer::isInitialized() const
{
    return m_isInitialized;
}

void RoadShapesLayer::initializeChildren()
{
    m_buffers_.initialize(static_cast<::nds::core::geometry::GeometryLayerType>(getType()), static_cast<::nds::core::geometry::CoordShift>(getCoordShiftXY()), static_cast<::nds::core::geometry::CoordShift>(getCoordShiftZ()), static_cast<uint32_t>(getNumElements()));
}

::nds::core::geometry::GeometryLayerType RoadShapesLayer::getType() const
{
    if (!m_isInitialized)
        throw ::zserio::CppRuntimeException("Parameter 'type' of compound 'RoadShapesLayer' is not initialized!");

    return m_type_;
}

bool RoadShapesLayer::getHasIds() const
{
    if (!m_isInitialized)
        throw ::zserio::CppRuntimeException("Parameter 'hasIds' of compound 'RoadShapesLayer' is not initialized!");

    return m_hasIds_;
}

bool RoadShapesLayer::getHasTypes() const
{
    if (!m_isInitialized)
        throw ::zserio::CppRuntimeException("Parameter 'hasTypes' of compound 'RoadShapesLayer' is not initialized!");

    return m_hasTypes_;
}

::nds::core::geometry::CoordShift RoadShapesLayer::getCoordShiftXY() const
{
    return m_coordShiftXY_;
}

void RoadShapesLayer::setCoordShiftXY(::nds::core::geometry::CoordShift coordShiftXY_)
{
    m_coordShiftXY_ = coordShiftXY_;
}

::nds::core::geometry::CoordShift RoadShapesLayer::getCoordShiftZ() const
{
    return m_coordShiftZ_;
}

void RoadShapesLayer::setCoordShiftZ(::nds::core::geometry::CoordShift coordShiftZ_)
{
    m_coordShiftZ_ = coordShiftZ_;
}

uint32_t RoadShapesLayer::getNumElements() const
{
    return m_numElements_;
}

void RoadShapesLayer::setNumElements(uint32_t numElements_)
{
    m_numElements_ = numElements_;
}

::zserio::vector<::nds::road::reference::types::RoadId>& RoadShapesLayer::getIdentifier()
{
    return m_identifier_.value().getRawArray();
}

const ::zserio::vector<::nds::road::reference::types::RoadId>& RoadShapesLayer::getIdentifier() const
{
    return m_identifier_.value().getRawArray();
}

void RoadShapesLayer::setIdentifier(const ::zserio::vector<::nds::road::reference::types::RoadId>& identifier_)
{
    m_identifier_ = ZserioArrayType_identifier(identifier_);
}

void RoadShapesLayer::setIdentifier(::zserio::vector<::nds::road::reference::types::RoadId>&& identifier_)
{
    m_identifier_ = ZserioArrayType_identifier(std::move(identifier_));
}

bool RoadShapesLayer::isIdentifierUsed() const
{
    return (getHasIds());
}

bool RoadShapesLayer::isIdentifierSet() const
{
    return m_identifier_.hasValue();
}

void RoadShapesLayer::resetIdentifier()
{
    m_identifier_.reset();
}

::zserio::vector<::nds::core::geometry::GeometryType>& RoadShapesLayer::getTypes()
{
    return m_types_.value().getRawArray();
}

const ::zserio::vector<::nds::core::geometry::GeometryType>& RoadShapesLayer::getTypes() const
{
    return m_types_.value().getRawArray();
}

void RoadShapesLayer::setTypes(const ::zserio::vector<::nds::core::geometry::GeometryType>& types_)
{
    m_types_ = ZserioArrayType_types(types_);
}

void RoadShapesLayer::setTypes(::zserio::vector<::nds::core::geometry::GeometryType>&& types_)
{
    m_types_ = ZserioArrayType_types(std::move(types_));
}

bool RoadShapesLayer::isTypesUsed() const
{
    return (getHasTypes());
}

bool RoadShapesLayer::isTypesSet() const
{
    return m_types_.hasValue();
}

void RoadShapesLayer::resetTypes()
{
    m_types_.reset();
}

::nds::core::geometry::Buffers& RoadShapesLayer::getBuffers()
{
    return m_buffers_;
}

const ::nds::core::geometry::Buffers& RoadShapesLayer::getBuffers() const
{
    return m_buffers_;
}

void RoadShapesLayer::setBuffers(const ::nds::core::geometry::Buffers& buffers_)
{
    m_buffers_ = buffers_;
}

void RoadShapesLayer::setBuffers(::nds::core::geometry::Buffers&& buffers_)
{
    m_buffers_ = ::std::move(buffers_);
}

void RoadShapesLayer::initPackingContext(RoadShapesLayer::ZserioPackingContext& context) const
{
    context.getCoordShiftXY().init<::zserio::BitFieldArrayTraits<::nds::core::geometry::CoordShift, UINT8_C(5)>>(m_coordShiftXY_);
    context.getCoordShiftZ().init<::zserio::BitFieldArrayTraits<::nds::core::geometry::CoordShift, UINT8_C(5)>>(m_coordShiftZ_);
    context.getNumElements().init<::zserio::VarSizeArrayTraits>(m_numElements_);
    m_buffers_.initPackingContext(context.getBuffers());
}

size_t RoadShapesLayer::bitSizeOf(size_t bitPosition) const
{
    size_t endBitPosition = bitPosition;

    endBitPosition += UINT8_C(5);
    endBitPosition += UINT8_C(5);
    endBitPosition = ::zserio::alignTo(8, endBitPosition);
    endBitPosition += ::zserio::bitSizeOfVarSize(m_numElements_);
    if (getHasIds())
    {
        endBitPosition += m_identifier_.value().bitSizeOfPacked(*this, endBitPosition);
    }
    if (getHasTypes())
    {
        endBitPosition = ::zserio::alignTo(8, endBitPosition);
        endBitPosition += m_types_.value().bitSizeOf(*this, endBitPosition);
    }
    endBitPosition = ::zserio::alignTo(8, endBitPosition);
    endBitPosition += m_buffers_.bitSizeOf(endBitPosition);

    return endBitPosition - bitPosition;
}

size_t RoadShapesLayer::bitSizeOf(RoadShapesLayer::ZserioPackingContext& context, size_t bitPosition) const
{
    size_t endBitPosition = bitPosition;

    endBitPosition += context.getCoordShiftXY().bitSizeOf<::zserio::BitFieldArrayTraits<::nds::core::geometry::CoordShift, UINT8_C(5)>>(m_coordShiftXY_);
    endBitPosition += context.getCoordShiftZ().bitSizeOf<::zserio::BitFieldArrayTraits<::nds::core::geometry::CoordShift, UINT8_C(5)>>(m_coordShiftZ_);
    endBitPosition = ::zserio::alignTo(8, endBitPosition);
    endBitPosition += context.getNumElements().bitSizeOf<::zserio::VarSizeArrayTraits>(m_numElements_);
    if (getHasIds())
    {
        endBitPosition += m_identifier_.value().bitSizeOfPacked(*this, endBitPosition);
    }
    if (getHasTypes())
    {
        endBitPosition = ::zserio::alignTo(8, endBitPosition);
        endBitPosition += m_types_.value().bitSizeOf(*this, endBitPosition);
    }
    endBitPosition = ::zserio::alignTo(8, endBitPosition);
    endBitPosition += m_buffers_.bitSizeOf(context.getBuffers(), endBitPosition);

    return endBitPosition - bitPosition;
}

size_t RoadShapesLayer::initializeOffsets(size_t bitPosition)
{
    size_t endBitPosition = bitPosition;

    endBitPosition += UINT8_C(5);
    endBitPosition += UINT8_C(5);
    endBitPosition = ::zserio::alignTo(8, endBitPosition);
    endBitPosition += ::zserio::bitSizeOfVarSize(m_numElements_);
    if (getHasIds())
    {
        endBitPosition = m_identifier_.value().initializeOffsetsPacked(*this, endBitPosition);
    }
    if (getHasTypes())
    {
        endBitPosition = ::zserio::alignTo(8, endBitPosition);
        endBitPosition = m_types_.value().initializeOffsets(*this, endBitPosition);
    }
    endBitPosition = ::zserio::alignTo(8, endBitPosition);
    endBitPosition = m_buffers_.initializeOffsets(endBitPosition);

    return endBitPosition;
}

size_t RoadShapesLayer::initializeOffsets(RoadShapesLayer::ZserioPackingContext& context, size_t bitPosition)
{
    size_t endBitPosition = bitPosition;

    endBitPosition += context.getCoordShiftXY().bitSizeOf<::zserio::BitFieldArrayTraits<::nds::core::geometry::CoordShift, UINT8_C(5)>>(m_coordShiftXY_);
    endBitPosition += context.getCoordShiftZ().bitSizeOf<::zserio::BitFieldArrayTraits<::nds::core::geometry::CoordShift, UINT8_C(5)>>(m_coordShiftZ_);
    endBitPosition = ::zserio::alignTo(8, endBitPosition);
    endBitPosition += context.getNumElements().bitSizeOf<::zserio::VarSizeArrayTraits>(m_numElements_);
    if (getHasIds())
    {
        endBitPosition = m_identifier_.value().initializeOffsetsPacked(*this, endBitPosition);
    }
    if (getHasTypes())
    {
        endBitPosition = ::zserio::alignTo(8, endBitPosition);
        endBitPosition = m_types_.value().initializeOffsets(*this, endBitPosition);
    }
    endBitPosition = ::zserio::alignTo(8, endBitPosition);
    endBitPosition = m_buffers_.initializeOffsets(context.getBuffers(), endBitPosition);

    return endBitPosition;
}

bool RoadShapesLayer::operator==(const RoadShapesLayer& other) const
{
    if (this != &other)
    {
        return
                (getType() == other.getType()) &&
                (getHasIds() == other.getHasIds()) &&
                (getHasTypes() == other.getHasTypes()) &&
                (m_coordShiftXY_ == other.m_coordShiftXY_) &&
                (m_coordShiftZ_ == other.m_coordShiftZ_) &&
                (m_numElements_ == other.m_numElements_) &&
                (!isIdentifierUsed() ? !other.isIdentifierUsed() : (m_identifier_ == other.m_identifier_)) &&
                (!isTypesUsed() ? !other.isTypesUsed() : (m_types_ == other.m_types_)) &&
                (m_buffers_ == other.m_buffers_);
    }

    return true;
}

uint32_t RoadShapesLayer::hashCode() const
{
    uint32_t result = ::zserio::HASH_SEED;

    result = ::zserio::calcHashCode(result, getType());
    result = ::zserio::calcHashCode(result, getHasIds());
    result = ::zserio::calcHashCode(result, getHasTypes());
    result = ::zserio::calcHashCode(result, m_coordShiftXY_);
    result = ::zserio::calcHashCode(result, m_coordShiftZ_);
    result = ::zserio::calcHashCode(result, m_numElements_);
    if (isIdentifierUsed())
        result = ::zserio::calcHashCode(result, m_identifier_);
    if (isTypesUsed())
        result = ::zserio::calcHashCode(result, m_types_);
    result = ::zserio::calcHashCode(result, m_buffers_);

    return result;
}

void RoadShapesLayer::write(::zserio::BitStreamWriter& out) const
{
    out.writeBits(m_coordShiftXY_, UINT8_C(5));

    out.writeBits(m_coordShiftZ_, UINT8_C(5));

    out.alignTo(8);
    out.writeVarSize(m_numElements_);

    if (getHasIds())
    {
        // check array length
        if (m_identifier_.value().getRawArray().size() != static_cast<size_t>(getNumElements()))
        {
            throw ::zserio::CppRuntimeException("Write: Wrong array length for field RoadShapesLayer.identifier: ") <<
                    m_identifier_.value().getRawArray().size() << " != " <<
                    static_cast<size_t>(getNumElements()) << "!";
        }
        m_identifier_.value().writePacked(*this, out);
    }

    if (getHasTypes())
    {
        out.alignTo(8);
        // check array length
        if (m_types_.value().getRawArray().size() != static_cast<size_t>(getNumElements()))
        {
            throw ::zserio::CppRuntimeException("Write: Wrong array length for field RoadShapesLayer.types: ") <<
                    m_types_.value().getRawArray().size() << " != " <<
                    static_cast<size_t>(getNumElements()) << "!";
        }
        m_types_.value().write(*this, out);
    }

    out.alignTo(8);
    // check parameters
    if (m_buffers_.getType() != static_cast<::nds::core::geometry::GeometryLayerType>(getType()))
    {
        throw ::zserio::CppRuntimeException("Write: Wrong parameter type for field RoadShapesLayer.buffers: ") <<
                m_buffers_.getType() << " != " << static_cast<::nds::core::geometry::GeometryLayerType>(getType()) << "!";
    }
    if (m_buffers_.getShiftXY() != static_cast<::nds::core::geometry::CoordShift>(getCoordShiftXY()))
    {
        throw ::zserio::CppRuntimeException("Write: Wrong parameter shiftXY for field RoadShapesLayer.buffers: ") <<
                m_buffers_.getShiftXY() << " != " << static_cast<::nds::core::geometry::CoordShift>(getCoordShiftXY()) << "!";
    }
    if (m_buffers_.getShiftZ() != static_cast<::nds::core::geometry::CoordShift>(getCoordShiftZ()))
    {
        throw ::zserio::CppRuntimeException("Write: Wrong parameter shiftZ for field RoadShapesLayer.buffers: ") <<
                m_buffers_.getShiftZ() << " != " << static_cast<::nds::core::geometry::CoordShift>(getCoordShiftZ()) << "!";
    }
    if (m_buffers_.getNumElements() != static_cast<uint32_t>(getNumElements()))
    {
        throw ::zserio::CppRuntimeException("Write: Wrong parameter numElements for field RoadShapesLayer.buffers: ") <<
                m_buffers_.getNumElements() << " != " << static_cast<uint32_t>(getNumElements()) << "!";
    }
    m_buffers_.write(out);
}

void RoadShapesLayer::write(RoadShapesLayer::ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const
{
    context.getCoordShiftXY().write<::zserio::BitFieldArrayTraits<::nds::core::geometry::CoordShift, UINT8_C(5)>>(out, m_coordShiftXY_);

    context.getCoordShiftZ().write<::zserio::BitFieldArrayTraits<::nds::core::geometry::CoordShift, UINT8_C(5)>>(out, m_coordShiftZ_);

    out.alignTo(8);
    context.getNumElements().write<::zserio::VarSizeArrayTraits>(out, m_numElements_);

    if (getHasIds())
    {
        // check array length
        if (m_identifier_.value().getRawArray().size() != static_cast<size_t>(getNumElements()))
        {
            throw ::zserio::CppRuntimeException("Write: Wrong array length for field RoadShapesLayer.identifier: ") <<
                    m_identifier_.value().getRawArray().size() << " != " <<
                    static_cast<size_t>(getNumElements()) << "!";
        }
        m_identifier_.value().writePacked(*this, out);
    }

    if (getHasTypes())
    {
        out.alignTo(8);
        // check array length
        if (m_types_.value().getRawArray().size() != static_cast<size_t>(getNumElements()))
        {
            throw ::zserio::CppRuntimeException("Write: Wrong array length for field RoadShapesLayer.types: ") <<
                    m_types_.value().getRawArray().size() << " != " <<
                    static_cast<size_t>(getNumElements()) << "!";
        }
        m_types_.value().write(*this, out);
    }

    out.alignTo(8);
    // check parameters
    if (m_buffers_.getType() != static_cast<::nds::core::geometry::GeometryLayerType>(getType()))
    {
        throw ::zserio::CppRuntimeException("Write: Wrong parameter type for field RoadShapesLayer.buffers: ") <<
                m_buffers_.getType() << " != " << static_cast<::nds::core::geometry::GeometryLayerType>(getType()) << "!";
    }
    if (m_buffers_.getShiftXY() != static_cast<::nds::core::geometry::CoordShift>(getCoordShiftXY()))
    {
        throw ::zserio::CppRuntimeException("Write: Wrong parameter shiftXY for field RoadShapesLayer.buffers: ") <<
                m_buffers_.getShiftXY() << " != " << static_cast<::nds::core::geometry::CoordShift>(getCoordShiftXY()) << "!";
    }
    if (m_buffers_.getShiftZ() != static_cast<::nds::core::geometry::CoordShift>(getCoordShiftZ()))
    {
        throw ::zserio::CppRuntimeException("Write: Wrong parameter shiftZ for field RoadShapesLayer.buffers: ") <<
                m_buffers_.getShiftZ() << " != " << static_cast<::nds::core::geometry::CoordShift>(getCoordShiftZ()) << "!";
    }
    if (m_buffers_.getNumElements() != static_cast<uint32_t>(getNumElements()))
    {
        throw ::zserio::CppRuntimeException("Write: Wrong parameter numElements for field RoadShapesLayer.buffers: ") <<
                m_buffers_.getNumElements() << " != " << static_cast<uint32_t>(getNumElements()) << "!";
    }
    m_buffers_.write(context.getBuffers(), out);
}

void RoadShapesLayer::ZserioElementFactory_identifier::create(RoadShapesLayer&        ,
        ::zserio::vector<::nds::road::reference::types::RoadId>& array,
        ::zserio::BitStreamReader& in, size_t)
{
    array.emplace_back(in, array.get_allocator());
}

void RoadShapesLayer::ZserioElementFactory_identifier::create(RoadShapesLayer&        ,
        ::zserio::vector<::nds::road::reference::types::RoadId>& array,
        ::nds::road::reference::types::RoadId::ZserioPackingContext& context, ::zserio::BitStreamReader& in,
        size_t)
{
    array.emplace_back(context, in, array.get_allocator());
}

void RoadShapesLayer::ZserioElementFactory_types::create(RoadShapesLayer&        ,
        ::zserio::vector<::nds::core::geometry::GeometryType>& array,
        ::zserio::BitStreamReader& in, size_t)
{
    array.emplace_back(in, array.get_allocator());
}

::nds::core::geometry::CoordShift RoadShapesLayer::readCoordShiftXY(::zserio::BitStreamReader& in)
{
    return static_cast<::nds::core::geometry::CoordShift>(in.readBits(UINT8_C(5)));
}

::nds::core::geometry::CoordShift RoadShapesLayer::readCoordShiftXY(RoadShapesLayer::ZserioPackingContext& context, ::zserio::BitStreamReader& in)
{
    return context.getCoordShiftXY().read<::zserio::BitFieldArrayTraits<::nds::core::geometry::CoordShift, UINT8_C(5)>>(in);
}
::nds::core::geometry::CoordShift RoadShapesLayer::readCoordShiftZ(::zserio::BitStreamReader& in)
{
    return static_cast<::nds::core::geometry::CoordShift>(in.readBits(UINT8_C(5)));
}

::nds::core::geometry::CoordShift RoadShapesLayer::readCoordShiftZ(RoadShapesLayer::ZserioPackingContext& context, ::zserio::BitStreamReader& in)
{
    return context.getCoordShiftZ().read<::zserio::BitFieldArrayTraits<::nds::core::geometry::CoordShift, UINT8_C(5)>>(in);
}
uint32_t RoadShapesLayer::readNumElements(::zserio::BitStreamReader& in)
{
    in.alignTo(8);
    return static_cast<uint32_t>(in.readVarSize());
}

uint32_t RoadShapesLayer::readNumElements(RoadShapesLayer::ZserioPackingContext& context, ::zserio::BitStreamReader& in)
{
    in.alignTo(8);
    return context.getNumElements().read<::zserio::VarSizeArrayTraits>(in);
}
::zserio::InplaceOptionalHolder<RoadShapesLayer::ZserioArrayType_identifier> RoadShapesLayer::readIdentifier(::zserio::BitStreamReader& in,
        const allocator_type& allocator)
{
    if (getHasIds())
    {
        ZserioArrayType_identifier readField(allocator);
        readField.readPacked(*this, in, static_cast<size_t>(getNumElements()));

        return ::zserio::InplaceOptionalHolder<ZserioArrayType_identifier>(::std::move(readField));
    }

    return ::zserio::InplaceOptionalHolder<ZserioArrayType_identifier>(::zserio::NullOpt);
}

::zserio::InplaceOptionalHolder<RoadShapesLayer::ZserioArrayType_identifier> RoadShapesLayer::readIdentifier(RoadShapesLayer::ZserioPackingContext&, ::zserio::BitStreamReader& in, const allocator_type& allocator)
{
    if (getHasIds())
    {
        ZserioArrayType_identifier readField(allocator);
        readField.readPacked(*this, in, static_cast<size_t>(getNumElements()));

        return ::zserio::InplaceOptionalHolder<ZserioArrayType_identifier>(::std::move(readField));
    }

    return ::zserio::InplaceOptionalHolder<ZserioArrayType_identifier>(::zserio::NullOpt);
}
::zserio::InplaceOptionalHolder<RoadShapesLayer::ZserioArrayType_types> RoadShapesLayer::readTypes(::zserio::BitStreamReader& in,
        const allocator_type& allocator)
{
    if (getHasTypes())
    {
        in.alignTo(8);
        ZserioArrayType_types readField(allocator);
        readField.read(*this, in, static_cast<size_t>(getNumElements()));

        return ::zserio::InplaceOptionalHolder<ZserioArrayType_types>(::std::move(readField));
    }

    return ::zserio::InplaceOptionalHolder<ZserioArrayType_types>(::zserio::NullOpt);
}
::nds::core::geometry::Buffers RoadShapesLayer::readBuffers(::zserio::BitStreamReader& in,
        const allocator_type& allocator)
{
    in.alignTo(8);
    return ::nds::core::geometry::Buffers(in, static_cast<::nds::core::geometry::GeometryLayerType>(getType()), static_cast<::nds::core::geometry::CoordShift>(getCoordShiftXY()), static_cast<::nds::core::geometry::CoordShift>(getCoordShiftZ()), static_cast<uint32_t>(getNumElements()), allocator);
}

::nds::core::geometry::Buffers RoadShapesLayer::readBuffers(RoadShapesLayer::ZserioPackingContext& context, ::zserio::BitStreamReader& in, const allocator_type& allocator)
{
    in.alignTo(8);
    return ::nds::core::geometry::Buffers(context.getBuffers(), in, static_cast<::nds::core::geometry::GeometryLayerType>(getType()), static_cast<::nds::core::geometry::CoordShift>(getCoordShiftXY()), static_cast<::nds::core::geometry::CoordShift>(getCoordShiftZ()), static_cast<uint32_t>(getNumElements()), allocator);
}

} // namespace instantiations
} // namespace road
} // namespace nds
