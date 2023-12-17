/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_TYPES_TRAFFIC_LIGHT_LENS_DETAILS_H
#define NDS_RULES_TYPES_TRAFFIC_LIGHT_LENS_DETAILS_H

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

#include <nds/rules/types/TrafficLightInlayType.h>
#include <nds/rules/types/TrafficLightLensColor.h>

namespace nds
{
namespace rules
{
namespace types
{

class TrafficLightLensDetails
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getColor()
        {
            return m_color_;
        }

        ::zserio::DeltaContext& getInlayType()
        {
            return m_inlayType_;
        }

    private:
        ::zserio::DeltaContext m_color_;
        ::zserio::DeltaContext m_inlayType_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    TrafficLightLensDetails() noexcept :
            TrafficLightLensDetails(allocator_type())
    {}

    explicit TrafficLightLensDetails(const allocator_type& allocator) noexcept;

    TrafficLightLensDetails(
            ::nds::rules::types::TrafficLightLensColor color_,
            bool isInverted_,
            ::nds::rules::types::TrafficLightInlayType inlayType_,
            const allocator_type& allocator = allocator_type()) :
            TrafficLightLensDetails(allocator)
    {
        m_color_ = color_;
        m_isInverted_ = isInverted_;
        m_inlayType_ = inlayType_;
    }

    explicit TrafficLightLensDetails(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit TrafficLightLensDetails(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~TrafficLightLensDetails() = default;

    TrafficLightLensDetails(const TrafficLightLensDetails&) = default;
    TrafficLightLensDetails& operator=(const TrafficLightLensDetails&) = default;

    TrafficLightLensDetails(TrafficLightLensDetails&&) = default;
    TrafficLightLensDetails& operator=(TrafficLightLensDetails&&) = default;

    TrafficLightLensDetails(::zserio::PropagateAllocatorT,
            const TrafficLightLensDetails& other, const allocator_type& allocator);

    ::nds::rules::types::TrafficLightLensColor getColor() const;
    void setColor(::nds::rules::types::TrafficLightLensColor color_);

    bool getIsInverted() const;
    void setIsInverted(bool isInverted_);

    ::nds::rules::types::TrafficLightInlayType getInlayType() const;
    void setInlayType(::nds::rules::types::TrafficLightInlayType inlayType_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const TrafficLightLensDetails& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::rules::types::TrafficLightLensColor readColor(::zserio::BitStreamReader& in);
    ::nds::rules::types::TrafficLightLensColor readColor(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    bool readIsInverted(::zserio::BitStreamReader& in);
    ::nds::rules::types::TrafficLightInlayType readInlayType(::zserio::BitStreamReader& in);
    ::nds::rules::types::TrafficLightInlayType readInlayType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::rules::types::TrafficLightLensColor m_color_;
    bool m_isInverted_;
    ::nds::rules::types::TrafficLightInlayType m_inlayType_;
};

} // namespace types
} // namespace rules
} // namespace nds

#endif // NDS_RULES_TYPES_TRAFFIC_LIGHT_LENS_DETAILS_H