/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_TYPES_ROAD_NUMBER_COMPONENT_H
#define NDS_NAME_TYPES_ROAD_NUMBER_COMPONENT_H

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
#include <zserio/String.h>
#include <zserio/Types.h>

namespace nds
{
namespace name
{
namespace types
{

class RoadNumberComponent
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getLocalPriority()
        {
            return m_localPriority_;
        }

    private:
        ::zserio::DeltaContext m_localPriority_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoadNumberComponent() noexcept :
            RoadNumberComponent(allocator_type())
    {}

    explicit RoadNumberComponent(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_componentString = ::zserio::string<>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_componentString, RoadNumberComponent, allocator_type> = 0>
    RoadNumberComponent(
            ZSERIO_T_componentString&& componentString_,
            bool onIcon_,
            bool acousticOutput_,
            bool textOutput_,
            uint8_t localPriority_,
            const allocator_type& allocator = allocator_type()) :
            RoadNumberComponent(allocator)
    {
        m_componentString_ = ::std::forward<ZSERIO_T_componentString>(componentString_);
        m_onIcon_ = onIcon_;
        m_acousticOutput_ = acousticOutput_;
        m_textOutput_ = textOutput_;
        m_localPriority_ = localPriority_;
    }

    explicit RoadNumberComponent(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RoadNumberComponent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RoadNumberComponent() = default;

    RoadNumberComponent(const RoadNumberComponent&) = default;
    RoadNumberComponent& operator=(const RoadNumberComponent&) = default;

    RoadNumberComponent(RoadNumberComponent&&) = default;
    RoadNumberComponent& operator=(RoadNumberComponent&&) = default;

    RoadNumberComponent(::zserio::PropagateAllocatorT,
            const RoadNumberComponent& other, const allocator_type& allocator);

    const ::zserio::string<>& getComponentString() const;
    ::zserio::string<>& getComponentString();
    void setComponentString(const ::zserio::string<>& componentString_);
    void setComponentString(::zserio::string<>&& componentString_);

    bool getOnIcon() const;
    void setOnIcon(bool onIcon_);

    bool getAcousticOutput() const;
    void setAcousticOutput(bool acousticOutput_);

    bool getTextOutput() const;
    void setTextOutput(bool textOutput_);

    uint8_t getLocalPriority() const;
    void setLocalPriority(uint8_t localPriority_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoadNumberComponent& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::string<> readComponentString(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    bool readOnIcon(::zserio::BitStreamReader& in);
    bool readAcousticOutput(::zserio::BitStreamReader& in);
    bool readTextOutput(::zserio::BitStreamReader& in);
    uint8_t readLocalPriority(::zserio::BitStreamReader& in);
    uint8_t readLocalPriority(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::zserio::string<> m_componentString_;
    bool m_onIcon_;
    bool m_acousticOutput_;
    bool m_textOutput_;
    uint8_t m_localPriority_;
};

} // namespace types
} // namespace name
} // namespace nds

#endif // NDS_NAME_TYPES_ROAD_NUMBER_COMPONENT_H
