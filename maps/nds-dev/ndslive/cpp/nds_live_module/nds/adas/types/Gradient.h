/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ADAS_TYPES_GRADIENT_H
#define NDS_ADAS_TYPES_GRADIENT_H

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

#include <nds/adas/types/GradientData.h>

namespace nds
{
namespace adas
{
namespace types
{

class Gradient
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumOfValues()
        {
            return m_numOfValues_;
        }

    private:
        ::zserio::DeltaContext m_numOfValues_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    Gradient() noexcept :
            Gradient(allocator_type())
    {}

    explicit Gradient(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_gradientData = ::zserio::vector<::nds::adas::types::GradientData>>
    Gradient(
            uint16_t numOfValues_,
            ZSERIO_T_gradientData&& gradientData_,
            const allocator_type& allocator = allocator_type()) :
            Gradient(allocator)
    {
        m_numOfValues_ = numOfValues_;
        m_gradientData_ = ZserioArrayType_gradientData(::std::forward<ZSERIO_T_gradientData>(gradientData_));
    }

    explicit Gradient(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit Gradient(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~Gradient() = default;

    Gradient(const Gradient&) = default;
    Gradient& operator=(const Gradient&) = default;

    Gradient(Gradient&&) = default;
    Gradient& operator=(Gradient&&) = default;

    Gradient(::zserio::PropagateAllocatorT,
            const Gradient& other, const allocator_type& allocator);

    uint16_t getNumOfValues() const;
    void setNumOfValues(uint16_t numOfValues_);

    const ::zserio::vector<::nds::adas::types::GradientData>& getGradientData() const;
    ::zserio::vector<::nds::adas::types::GradientData>& getGradientData();
    void setGradientData(const ::zserio::vector<::nds::adas::types::GradientData>& gradientData_);
    void setGradientData(::zserio::vector<::nds::adas::types::GradientData>&& gradientData_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const Gradient& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_gradientData
    {
    public:
        using OwnerType = Gradient;

        static void create(Gradient& owner,
                ::zserio::vector<::nds::adas::types::GradientData>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(Gradient& owner,
                ::zserio::vector<::nds::adas::types::GradientData>& array,
                ::nds::adas::types::GradientData::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_gradientData = ::zserio::Array<::zserio::vector<::nds::adas::types::GradientData>, ::zserio::ObjectArrayTraits<::nds::adas::types::GradientData, ZserioElementFactory_gradientData>, ::zserio::ArrayType::NORMAL>;

    uint16_t readNumOfValues(::zserio::BitStreamReader& in);
    uint16_t readNumOfValues(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_gradientData readGradientData(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_gradientData readGradientData(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint16_t m_numOfValues_;
    ZserioArrayType_gradientData m_gradientData_;
};

} // namespace types
} // namespace adas
} // namespace nds

#endif // NDS_ADAS_TYPES_GRADIENT_H