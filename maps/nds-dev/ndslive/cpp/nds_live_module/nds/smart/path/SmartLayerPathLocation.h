/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_PATH_SMART_LAYER_PATH_LOCATION_H
#define NDS_SMART_PATH_SMART_LAYER_PATH_LOCATION_H

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

#include <nds/core/geometry/Line2D.h>
#include <nds/core/location/LocationGeometry.h>
#include <nds/core/location/LocationPathRange.h>

namespace nds
{
namespace smart
{
namespace path
{

class SmartLayerPathLocation
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::location::LocationGeometry::ZserioPackingContext& getPath()
        {
            return m_path_;
        }

    private:
        ::nds::core::location::LocationGeometry::ZserioPackingContext m_path_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    SmartLayerPathLocation() noexcept :
            SmartLayerPathLocation(allocator_type())
    {}

    explicit SmartLayerPathLocation(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_path = ::nds::core::location::LocationGeometry,
            typename ZSERIO_T_ranges = ::zserio::vector<::nds::core::location::LocationPathRange>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_path, SmartLayerPathLocation, allocator_type> = 0>
    SmartLayerPathLocation(
            ZSERIO_T_path&& path_,
            ZSERIO_T_ranges&& ranges_,
            const allocator_type& allocator = allocator_type()) :
            SmartLayerPathLocation(allocator)
    {
        m_path_ = ::std::forward<ZSERIO_T_path>(path_);
        m_ranges_ = ::zserio::createOptionalArray<ZserioArrayType_ranges>(::std::forward<ZSERIO_T_ranges>(ranges_));
    }

    explicit SmartLayerPathLocation(::zserio::BitStreamReader& in,
            uint32_t numSegments_, const allocator_type& allocator = allocator_type());
    explicit SmartLayerPathLocation(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            uint32_t numSegments_, const allocator_type& allocator = allocator_type());

    ~SmartLayerPathLocation() = default;

    SmartLayerPathLocation(const SmartLayerPathLocation& other);
    SmartLayerPathLocation& operator=(const SmartLayerPathLocation& other);

    SmartLayerPathLocation(SmartLayerPathLocation&& other);
    SmartLayerPathLocation& operator=(SmartLayerPathLocation&& other);

    SmartLayerPathLocation(::zserio::PropagateAllocatorT,
            const SmartLayerPathLocation& other, const allocator_type& allocator);

    void initialize(
            uint32_t numSegments_);
    bool isInitialized() const;
    void initializeChildren();

    uint32_t getNumSegments() const;

    const ::nds::core::location::LocationGeometry& getPath() const;
    ::nds::core::location::LocationGeometry& getPath();
    void setPath(const ::nds::core::location::LocationGeometry& path_);
    void setPath(::nds::core::location::LocationGeometry&& path_);

    const ::zserio::vector<::nds::core::location::LocationPathRange>& getRanges() const;
    ::zserio::vector<::nds::core::location::LocationPathRange>& getRanges();
    void setRanges(const ::zserio::vector<::nds::core::location::LocationPathRange>& ranges_);
    void setRanges(::zserio::vector<::nds::core::location::LocationPathRange>&& ranges_);
    bool isRangesUsed() const;
    bool isRangesSet() const;
    void resetRanges();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const SmartLayerPathLocation& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_ranges
    {
    public:
        using OwnerType = SmartLayerPathLocation;

        static void initializeElement(SmartLayerPathLocation& owner,
                ::nds::core::location::LocationPathRange& element, size_t index);
    };

    class ZserioElementFactory_ranges
    {
    public:
        using OwnerType = SmartLayerPathLocation;

        static void create(SmartLayerPathLocation& owner,
                ::zserio::vector<::nds::core::location::LocationPathRange>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(SmartLayerPathLocation& owner,
                ::zserio::vector<::nds::core::location::LocationPathRange>& array,
                ::nds::core::location::LocationPathRange::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_ranges = ::zserio::Array<::zserio::vector<::nds::core::location::LocationPathRange>, ::zserio::ObjectArrayTraits<::nds::core::location::LocationPathRange, ZserioElementFactory_ranges>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_ranges>;

    ::nds::core::location::LocationGeometry readPath(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::location::LocationGeometry readPath(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_ranges> readRanges(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_ranges> readRanges(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint32_t m_numSegments_;
    bool m_isInitialized;
    ::nds::core::location::LocationGeometry m_path_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_ranges> m_ranges_;
};

} // namespace path
} // namespace smart
} // namespace nds

#endif // NDS_SMART_PATH_SMART_LAYER_PATH_LOCATION_H