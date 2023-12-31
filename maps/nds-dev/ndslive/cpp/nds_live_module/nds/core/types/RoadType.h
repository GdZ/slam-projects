/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_TYPES_ROAD_TYPE_H
#define NDS_CORE_TYPES_ROAD_TYPE_H

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
#include <zserio/Vector.h>

#include <nds/core/types/RoadCharacter.h>
#include <nds/core/types/RoadForm.h>

namespace nds
{
namespace core
{
namespace types
{

class RoadType
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getForm()
        {
            return m_form_;
        }

    private:
        ::zserio::DeltaContext m_form_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoadType() noexcept :
            RoadType(allocator_type())
    {}

    explicit RoadType(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_characteristics = ::zserio::vector<::nds::core::types::RoadCharacter>>
    RoadType(
            ::nds::core::types::RoadForm form_,
            ZSERIO_T_characteristics&& characteristics_,
            const allocator_type& allocator = allocator_type()) :
            RoadType(allocator)
    {
        m_form_ = form_;
        m_characteristics_ = ::zserio::createOptionalArray<ZserioArrayType_characteristics>(::std::forward<ZSERIO_T_characteristics>(characteristics_));
    }

    explicit RoadType(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RoadType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RoadType() = default;

    RoadType(const RoadType&) = default;
    RoadType& operator=(const RoadType&) = default;

    RoadType(RoadType&&) = default;
    RoadType& operator=(RoadType&&) = default;

    RoadType(::zserio::PropagateAllocatorT,
            const RoadType& other, const allocator_type& allocator);

    ::nds::core::types::RoadForm getForm() const;
    void setForm(::nds::core::types::RoadForm form_);

    const ::zserio::vector<::nds::core::types::RoadCharacter>& getCharacteristics() const;
    ::zserio::vector<::nds::core::types::RoadCharacter>& getCharacteristics();
    void setCharacteristics(const ::zserio::vector<::nds::core::types::RoadCharacter>& characteristics_);
    void setCharacteristics(::zserio::vector<::nds::core::types::RoadCharacter>&& characteristics_);
    bool isCharacteristicsUsed() const;
    bool isCharacteristicsSet() const;
    void resetCharacteristics();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoadType& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    using ZserioArrayType_characteristics = ::zserio::Array<::zserio::vector<::nds::core::types::RoadCharacter>, ::zserio::EnumArrayTraits<::nds::core::types::RoadCharacter>, ::zserio::ArrayType::AUTO>;

    ::nds::core::types::RoadForm readForm(::zserio::BitStreamReader& in);
    ::nds::core::types::RoadForm readForm(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_characteristics> readCharacteristics(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_characteristics> readCharacteristics(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::types::RoadForm m_form_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_characteristics> m_characteristics_;
};

} // namespace types
} // namespace core
} // namespace nds

#endif // NDS_CORE_TYPES_ROAD_TYPE_H
