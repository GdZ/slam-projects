/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_LOCATION_LOCATION_SEGMENT_H
#define NDS_CORE_LOCATION_LOCATION_SEGMENT_H

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
#include <zserio/ArrayTraits.h>
#include <zserio/String.h>

#include <nds/core/geometry/Line2D.h>
#include <nds/core/location/AbsoluteBearing.h>
#include <nds/core/location/LocationGeometry.h>
#include <nds/core/location/LocationPathRange.h>
#include <nds/core/types/FunctionalRoadClass.h>
#include <nds/core/types/LengthMeters.h>
#include <nds/core/types/RoadType.h>

namespace nds
{
namespace core
{
namespace location
{

class LocationSegment
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::location::LocationPathRange::ZserioPackingContext& getRange()
        {
            return m_range_;
        }

        ::zserio::DeltaContext& getAbsoluteBearingStart()
        {
            return m_absoluteBearingStart_;
        }

        ::zserio::DeltaContext& getAbsoluteBearingEnd()
        {
            return m_absoluteBearingEnd_;
        }

        ::zserio::DeltaContext& getLength()
        {
            return m_length_;
        }

        ::zserio::DeltaContext& getFrc()
        {
            return m_frc_;
        }

        ::nds::core::types::RoadType::ZserioPackingContext& getRoadtypes()
        {
            return m_roadtypes_;
        }

    private:
        ::nds::core::location::LocationPathRange::ZserioPackingContext m_range_;
        ::zserio::DeltaContext m_absoluteBearingStart_;
        ::zserio::DeltaContext m_absoluteBearingEnd_;
        ::zserio::DeltaContext m_length_;
        ::zserio::DeltaContext m_frc_;
        ::nds::core::types::RoadType::ZserioPackingContext m_roadtypes_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LocationSegment() noexcept :
            LocationSegment(allocator_type())
    {}

    explicit LocationSegment(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_range = ::nds::core::location::LocationPathRange,
            typename ZSERIO_T_frc = ::nds::core::types::FunctionalRoadClass,
            typename ZSERIO_T_roadtypes = ::nds::core::types::RoadType,
            typename ZSERIO_T_roadName = ::zserio::string<>,
            typename ZSERIO_T_roadNumber = ::zserio::string<>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_range, LocationSegment, allocator_type> = 0>
    LocationSegment(
            ZSERIO_T_range&& range_,
            ::nds::core::location::AbsoluteBearing absoluteBearingStart_,
            ::nds::core::location::AbsoluteBearing absoluteBearingEnd_,
            ::nds::core::types::LengthMeters length_,
            ZSERIO_T_frc&& frc_,
            ZSERIO_T_roadtypes&& roadtypes_,
            ZSERIO_T_roadName&& roadName_,
            ZSERIO_T_roadNumber&& roadNumber_,
            const allocator_type& allocator = allocator_type()) :
            LocationSegment(allocator)
    {
        m_range_ = ::std::forward<ZSERIO_T_range>(range_);
        m_absoluteBearingStart_ = absoluteBearingStart_;
        m_absoluteBearingEnd_ = absoluteBearingEnd_;
        m_length_ = length_;
        m_frc_ = ::std::forward<ZSERIO_T_frc>(frc_);
        m_roadtypes_ = ::std::forward<ZSERIO_T_roadtypes>(roadtypes_);
        m_roadName_ = ::std::forward<ZSERIO_T_roadName>(roadName_);
        m_roadNumber_ = ::std::forward<ZSERIO_T_roadNumber>(roadNumber_);
    }

    explicit LocationSegment(::zserio::BitStreamReader& in,
            ::nds::core::location::LocationGeometry& pathGeometry_, const allocator_type& allocator = allocator_type());
    explicit LocationSegment(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::location::LocationGeometry& pathGeometry_, const allocator_type& allocator = allocator_type());

    ~LocationSegment() = default;

    LocationSegment(const LocationSegment& other);
    LocationSegment& operator=(const LocationSegment& other);

    LocationSegment(LocationSegment&& other);
    LocationSegment& operator=(LocationSegment&& other);

    LocationSegment(::zserio::PropagateAllocatorT,
            const LocationSegment& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::location::LocationGeometry& pathGeometry_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::location::LocationGeometry& getPathGeometry();
    const ::nds::core::location::LocationGeometry& getPathGeometry() const;

    const ::nds::core::location::LocationPathRange& getRange() const;
    ::nds::core::location::LocationPathRange& getRange();
    void setRange(const ::nds::core::location::LocationPathRange& range_);
    void setRange(::nds::core::location::LocationPathRange&& range_);

    ::nds::core::location::AbsoluteBearing getAbsoluteBearingStart() const;
    void setAbsoluteBearingStart(::nds::core::location::AbsoluteBearing absoluteBearingStart_);

    ::nds::core::location::AbsoluteBearing getAbsoluteBearingEnd() const;
    void setAbsoluteBearingEnd(::nds::core::location::AbsoluteBearing absoluteBearingEnd_);

    ::nds::core::types::LengthMeters getLength() const;
    void setLength(::nds::core::types::LengthMeters length_);

    ::nds::core::types::FunctionalRoadClass getFrc() const;
    void setFrc(::nds::core::types::FunctionalRoadClass frc_);
    bool isFrcUsed() const;
    bool isFrcSet() const;
    void resetFrc();

    const ::nds::core::types::RoadType& getRoadtypes() const;
    ::nds::core::types::RoadType& getRoadtypes();
    void setRoadtypes(const ::nds::core::types::RoadType& roadtypes_);
    void setRoadtypes(::nds::core::types::RoadType&& roadtypes_);
    bool isRoadtypesUsed() const;
    bool isRoadtypesSet() const;
    void resetRoadtypes();

    const ::zserio::string<>& getRoadName() const;
    ::zserio::string<>& getRoadName();
    void setRoadName(const ::zserio::string<>& roadName_);
    void setRoadName(::zserio::string<>&& roadName_);
    bool isRoadNameUsed() const;
    bool isRoadNameSet() const;
    void resetRoadName();

    const ::zserio::string<>& getRoadNumber() const;
    ::zserio::string<>& getRoadNumber();
    void setRoadNumber(const ::zserio::string<>& roadNumber_);
    void setRoadNumber(::zserio::string<>&& roadNumber_);
    bool isRoadNumberUsed() const;
    bool isRoadNumberSet() const;
    void resetRoadNumber();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LocationSegment& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::location::LocationPathRange readRange(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::location::LocationPathRange readRange(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::location::AbsoluteBearing readAbsoluteBearingStart(::zserio::BitStreamReader& in);
    ::nds::core::location::AbsoluteBearing readAbsoluteBearingStart(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::location::AbsoluteBearing readAbsoluteBearingEnd(::zserio::BitStreamReader& in);
    ::nds::core::location::AbsoluteBearing readAbsoluteBearingEnd(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::types::LengthMeters readLength(::zserio::BitStreamReader& in);
    ::nds::core::types::LengthMeters readLength(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::types::FunctionalRoadClass> readFrc(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::types::FunctionalRoadClass> readFrc(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::types::RoadType> readRoadtypes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::types::RoadType> readRoadtypes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::zserio::string<>> readRoadName(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::zserio::string<>> readRoadNumber(::zserio::BitStreamReader& in,
            const allocator_type& allocator);

    ::nds::core::location::LocationGeometry* m_pathGeometry_;
    bool m_isInitialized;
    ::nds::core::location::LocationPathRange m_range_;
    ::nds::core::location::AbsoluteBearing m_absoluteBearingStart_;
    ::nds::core::location::AbsoluteBearing m_absoluteBearingEnd_;
    ::nds::core::types::LengthMeters m_length_;
    ::zserio::InplaceOptionalHolder<::nds::core::types::FunctionalRoadClass> m_frc_;
    ::zserio::InplaceOptionalHolder<::nds::core::types::RoadType> m_roadtypes_;
    ::zserio::InplaceOptionalHolder<::zserio::string<>> m_roadName_;
    ::zserio::InplaceOptionalHolder<::zserio::string<>> m_roadNumber_;
};

} // namespace location
} // namespace core
} // namespace nds

#endif // NDS_CORE_LOCATION_LOCATION_SEGMENT_H
