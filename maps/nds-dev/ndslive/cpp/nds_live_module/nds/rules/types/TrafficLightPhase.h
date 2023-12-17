/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_TYPES_TRAFFIC_LIGHT_PHASE_H
#define NDS_RULES_TYPES_TRAFFIC_LIGHT_PHASE_H

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

#include <nds/rules/types/TrafficLightPhaseMeaning.h>

namespace nds
{
namespace rules
{
namespace types
{

class TrafficLightPhase
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getMeaning()
        {
            return m_meaning_;
        }

    private:
        ::zserio::DeltaContext m_meaning_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    TrafficLightPhase() noexcept :
            TrafficLightPhase(allocator_type())
    {}

    explicit TrafficLightPhase(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_activeLense = ::zserio::vector<bool>,
            typename ZSERIO_T_blinkingLense = ::zserio::vector<bool>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_activeLense, TrafficLightPhase, allocator_type> = 0>
    TrafficLightPhase(
            ZSERIO_T_activeLense&& activeLense_,
            ZSERIO_T_blinkingLense&& blinkingLense_,
            ::nds::rules::types::TrafficLightPhaseMeaning meaning_,
            const allocator_type& allocator = allocator_type()) :
            TrafficLightPhase(allocator)
    {
        m_activeLense_ = ZserioArrayType_activeLense(::std::forward<ZSERIO_T_activeLense>(activeLense_));
        m_blinkingLense_ = ZserioArrayType_blinkingLense(::std::forward<ZSERIO_T_blinkingLense>(blinkingLense_));
        m_meaning_ = meaning_;
    }

    explicit TrafficLightPhase(::zserio::BitStreamReader& in,
            uint8_t numLenses_, const allocator_type& allocator = allocator_type());
    explicit TrafficLightPhase(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            uint8_t numLenses_, const allocator_type& allocator = allocator_type());

    ~TrafficLightPhase() = default;

    TrafficLightPhase(const TrafficLightPhase& other);
    TrafficLightPhase& operator=(const TrafficLightPhase& other);

    TrafficLightPhase(TrafficLightPhase&& other);
    TrafficLightPhase& operator=(TrafficLightPhase&& other);

    TrafficLightPhase(::zserio::PropagateAllocatorT,
            const TrafficLightPhase& other, const allocator_type& allocator);

    void initialize(
            uint8_t numLenses_);
    bool isInitialized() const;

    uint8_t getNumLenses() const;

    const ::zserio::vector<bool>& getActiveLense() const;
    ::zserio::vector<bool>& getActiveLense();
    void setActiveLense(const ::zserio::vector<bool>& activeLense_);
    void setActiveLense(::zserio::vector<bool>&& activeLense_);

    const ::zserio::vector<bool>& getBlinkingLense() const;
    ::zserio::vector<bool>& getBlinkingLense();
    void setBlinkingLense(const ::zserio::vector<bool>& blinkingLense_);
    void setBlinkingLense(::zserio::vector<bool>&& blinkingLense_);

    ::nds::rules::types::TrafficLightPhaseMeaning getMeaning() const;
    void setMeaning(::nds::rules::types::TrafficLightPhaseMeaning meaning_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const TrafficLightPhase& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    using ZserioArrayType_activeLense = ::zserio::Array<::zserio::vector<bool>, ::zserio::BoolArrayTraits, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_blinkingLense = ::zserio::Array<::zserio::vector<bool>, ::zserio::BoolArrayTraits, ::zserio::ArrayType::NORMAL>;

    ZserioArrayType_activeLense readActiveLense(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_blinkingLense readBlinkingLense(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::rules::types::TrafficLightPhaseMeaning readMeaning(::zserio::BitStreamReader& in);
    ::nds::rules::types::TrafficLightPhaseMeaning readMeaning(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    uint8_t m_numLenses_;
    bool m_isInitialized;
    ZserioArrayType_activeLense m_activeLense_;
    ZserioArrayType_blinkingLense m_blinkingLense_;
    ::nds::rules::types::TrafficLightPhaseMeaning m_meaning_;
};

} // namespace types
} // namespace rules
} // namespace nds

#endif // NDS_RULES_TYPES_TRAFFIC_LIGHT_PHASE_H
