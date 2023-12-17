/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VEHICLE_TYPES_HORIZON_PATH_H
#define NDS_VEHICLE_TYPES_HORIZON_PATH_H

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
#include <zserio/ArrayTraits.h>
#include <zserio/Types.h>

#include <nds/core/location/RoadLocationPath.h>
#include <nds/vehicle/reference/types/HorizonPathId.h>

namespace nds
{
namespace vehicle
{
namespace types
{

class HorizonPath
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getPathId()
        {
            return m_pathId_;
        }

        ::zserio::DeltaContext& getParentPathId()
        {
            return m_parentPathId_;
        }

        ::zserio::DeltaContext& getParentSegmentIndex()
        {
            return m_parentSegmentIndex_;
        }

        ::nds::core::location::RoadLocationPath::ZserioPackingContext& getPath()
        {
            return m_path_;
        }

    private:
        ::zserio::DeltaContext m_pathId_;
        ::zserio::DeltaContext m_parentPathId_;
        ::zserio::DeltaContext m_parentSegmentIndex_;
        ::nds::core::location::RoadLocationPath::ZserioPackingContext m_path_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    HorizonPath() noexcept :
            HorizonPath(allocator_type())
    {}

    explicit HorizonPath(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_path = ::nds::core::location::RoadLocationPath>
    HorizonPath(
            ::nds::vehicle::reference::types::HorizonPathId pathId_,
            ::nds::vehicle::reference::types::HorizonPathId parentPathId_,
            uint32_t parentSegmentIndex_,
            ZSERIO_T_path&& path_,
            const allocator_type& allocator = allocator_type()) :
            HorizonPath(allocator)
    {
        m_pathId_ = pathId_;
        m_parentPathId_ = parentPathId_;
        m_parentSegmentIndex_ = parentSegmentIndex_;
        m_path_ = ::std::forward<ZSERIO_T_path>(path_);
    }

    explicit HorizonPath(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit HorizonPath(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~HorizonPath() = default;

    HorizonPath(const HorizonPath&) = default;
    HorizonPath& operator=(const HorizonPath&) = default;

    HorizonPath(HorizonPath&&) = default;
    HorizonPath& operator=(HorizonPath&&) = default;

    HorizonPath(::zserio::PropagateAllocatorT,
            const HorizonPath& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::vehicle::reference::types::HorizonPathId getPathId() const;
    void setPathId(::nds::vehicle::reference::types::HorizonPathId pathId_);

    ::nds::vehicle::reference::types::HorizonPathId getParentPathId() const;
    void setParentPathId(::nds::vehicle::reference::types::HorizonPathId parentPathId_);

    uint32_t getParentSegmentIndex() const;
    void setParentSegmentIndex(uint32_t parentSegmentIndex_);

    const ::nds::core::location::RoadLocationPath& getPath() const;
    ::nds::core::location::RoadLocationPath& getPath();
    void setPath(const ::nds::core::location::RoadLocationPath& path_);
    void setPath(::nds::core::location::RoadLocationPath&& path_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const HorizonPath& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::vehicle::reference::types::HorizonPathId readPathId(::zserio::BitStreamReader& in);
    ::nds::vehicle::reference::types::HorizonPathId readPathId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::vehicle::reference::types::HorizonPathId readParentPathId(::zserio::BitStreamReader& in);
    ::nds::vehicle::reference::types::HorizonPathId readParentPathId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    uint32_t readParentSegmentIndex(::zserio::BitStreamReader& in);
    uint32_t readParentSegmentIndex(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::location::RoadLocationPath readPath(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::location::RoadLocationPath readPath(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::vehicle::reference::types::HorizonPathId m_pathId_;
    ::nds::vehicle::reference::types::HorizonPathId m_parentPathId_;
    uint32_t m_parentSegmentIndex_;
    ::nds::core::location::RoadLocationPath m_path_;
};

} // namespace types
} // namespace vehicle
} // namespace nds

#endif // NDS_VEHICLE_TYPES_HORIZON_PATH_H
