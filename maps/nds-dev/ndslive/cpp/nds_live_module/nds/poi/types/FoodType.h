/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_TYPES_FOOD_TYPE_H
#define NDS_POI_TYPES_FOOD_TYPE_H

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

#include <nds/poi/types/Cuisine.h>
#include <nds/poi/types/DietAvailability.h>

namespace nds
{
namespace poi
{
namespace types
{

class FoodType
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getCuisine()
        {
            return m_cuisine_;
        }

        ::zserio::DeltaContext& getDietAvailability()
        {
            return m_dietAvailability_;
        }

    private:
        ::zserio::DeltaContext m_cuisine_;
        ::zserio::DeltaContext m_dietAvailability_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    FoodType() noexcept :
            FoodType(allocator_type())
    {}

    explicit FoodType(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_customCuisine = ::zserio::string<>>
    FoodType(
            ::nds::poi::types::Cuisine cuisine_,
            ZSERIO_T_customCuisine&& customCuisine_,
            bool hasDietAvailability_,
            ::nds::poi::types::DietAvailability dietAvailability_,
            const allocator_type& allocator = allocator_type()) :
            FoodType(allocator)
    {
        m_cuisine_ = cuisine_;
        m_customCuisine_ = ::std::forward<ZSERIO_T_customCuisine>(customCuisine_);
        m_hasDietAvailability_ = hasDietAvailability_;
        m_dietAvailability_ = dietAvailability_;
    }

    explicit FoodType(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit FoodType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~FoodType() = default;

    FoodType(const FoodType&) = default;
    FoodType& operator=(const FoodType&) = default;

    FoodType(FoodType&&) = default;
    FoodType& operator=(FoodType&&) = default;

    FoodType(::zserio::PropagateAllocatorT,
            const FoodType& other, const allocator_type& allocator);

    ::nds::poi::types::Cuisine getCuisine() const;
    void setCuisine(::nds::poi::types::Cuisine cuisine_);

    const ::zserio::string<>& getCustomCuisine() const;
    ::zserio::string<>& getCustomCuisine();
    void setCustomCuisine(const ::zserio::string<>& customCuisine_);
    void setCustomCuisine(::zserio::string<>&& customCuisine_);
    bool isCustomCuisineUsed() const;
    bool isCustomCuisineSet() const;
    void resetCustomCuisine();

    bool getHasDietAvailability() const;
    void setHasDietAvailability(bool hasDietAvailability_);

    ::nds::poi::types::DietAvailability getDietAvailability() const;
    void setDietAvailability(::nds::poi::types::DietAvailability dietAvailability_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const FoodType& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::poi::types::Cuisine readCuisine(::zserio::BitStreamReader& in);
    ::nds::poi::types::Cuisine readCuisine(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::zserio::string<>> readCustomCuisine(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    bool readHasDietAvailability(::zserio::BitStreamReader& in);
    ::nds::poi::types::DietAvailability readDietAvailability(::zserio::BitStreamReader& in);
    ::nds::poi::types::DietAvailability readDietAvailability(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::poi::types::Cuisine m_cuisine_;
    ::zserio::InplaceOptionalHolder<::zserio::string<>> m_customCuisine_;
    bool m_hasDietAvailability_;
    ::nds::poi::types::DietAvailability m_dietAvailability_;
};

} // namespace types
} // namespace poi
} // namespace nds

#endif // NDS_POI_TYPES_FOOD_TYPE_H
