/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ADAS_TYPES_COMFORTABLE_SPEED_PATH_H
#define NDS_ADAS_TYPES_COMFORTABLE_SPEED_PATH_H

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

#include <nds/adas/types/ComfortableSpeedPointList.h>
#include <nds/adas/types/ComfortableSpeedRoad.h>

namespace nds
{
namespace adas
{
namespace types
{

class ComfortableSpeedPath
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumOfRoads()
        {
            return m_numOfRoads_;
        }

        ::nds::adas::types::ComfortableSpeedPointList::ZserioPackingContext& getSpeedPoints()
        {
            return m_speedPoints_;
        }

    private:
        ::zserio::DeltaContext m_numOfRoads_;
        ::nds::adas::types::ComfortableSpeedPointList::ZserioPackingContext m_speedPoints_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    ComfortableSpeedPath() noexcept :
            ComfortableSpeedPath(allocator_type())
    {}

    explicit ComfortableSpeedPath(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_speedPoints = ::nds::adas::types::ComfortableSpeedPointList,
            typename ZSERIO_T_road = ::zserio::vector<::nds::adas::types::ComfortableSpeedRoad>>
    ComfortableSpeedPath(
            uint8_t numOfRoads_,
            ZSERIO_T_speedPoints&& speedPoints_,
            ZSERIO_T_road&& road_,
            const allocator_type& allocator = allocator_type()) :
            ComfortableSpeedPath(allocator)
    {
        m_numOfRoads_ = numOfRoads_;
        m_speedPoints_ = ::std::forward<ZSERIO_T_speedPoints>(speedPoints_);
        m_road_ = ZserioArrayType_road(::std::forward<ZSERIO_T_road>(road_));
    }

    explicit ComfortableSpeedPath(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit ComfortableSpeedPath(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~ComfortableSpeedPath() = default;

    ComfortableSpeedPath(const ComfortableSpeedPath&) = default;
    ComfortableSpeedPath& operator=(const ComfortableSpeedPath&) = default;

    ComfortableSpeedPath(ComfortableSpeedPath&&) = default;
    ComfortableSpeedPath& operator=(ComfortableSpeedPath&&) = default;

    ComfortableSpeedPath(::zserio::PropagateAllocatorT,
            const ComfortableSpeedPath& other, const allocator_type& allocator);

    uint8_t getNumOfRoads() const;
    void setNumOfRoads(uint8_t numOfRoads_);

    const ::nds::adas::types::ComfortableSpeedPointList& getSpeedPoints() const;
    ::nds::adas::types::ComfortableSpeedPointList& getSpeedPoints();
    void setSpeedPoints(const ::nds::adas::types::ComfortableSpeedPointList& speedPoints_);
    void setSpeedPoints(::nds::adas::types::ComfortableSpeedPointList&& speedPoints_);

    const ::zserio::vector<::nds::adas::types::ComfortableSpeedRoad>& getRoad() const;
    ::zserio::vector<::nds::adas::types::ComfortableSpeedRoad>& getRoad();
    void setRoad(const ::zserio::vector<::nds::adas::types::ComfortableSpeedRoad>& road_);
    void setRoad(::zserio::vector<::nds::adas::types::ComfortableSpeedRoad>&& road_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const ComfortableSpeedPath& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_road
    {
    public:
        using OwnerType = ComfortableSpeedPath;

        static void create(ComfortableSpeedPath& owner,
                ::zserio::vector<::nds::adas::types::ComfortableSpeedRoad>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(ComfortableSpeedPath& owner,
                ::zserio::vector<::nds::adas::types::ComfortableSpeedRoad>& array,
                ::nds::adas::types::ComfortableSpeedRoad::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_road = ::zserio::Array<::zserio::vector<::nds::adas::types::ComfortableSpeedRoad>, ::zserio::ObjectArrayTraits<::nds::adas::types::ComfortableSpeedRoad, ZserioElementFactory_road>, ::zserio::ArrayType::NORMAL>;

    uint8_t readNumOfRoads(::zserio::BitStreamReader& in);
    uint8_t readNumOfRoads(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::adas::types::ComfortableSpeedPointList readSpeedPoints(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::adas::types::ComfortableSpeedPointList readSpeedPoints(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_road readRoad(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_road readRoad(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint8_t m_numOfRoads_;
    ::nds::adas::types::ComfortableSpeedPointList m_speedPoints_;
    ZserioArrayType_road m_road_;
};

} // namespace types
} // namespace adas
} // namespace nds

#endif // NDS_ADAS_TYPES_COMFORTABLE_SPEED_PATH_H
