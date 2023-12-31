/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_TYPES_NORMAL_SPHERE_H
#define NDS_DISPLAY_TYPES_NORMAL_SPHERE_H

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

namespace nds
{
namespace display
{
namespace types
{

class NormalSphere
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getTheta()
        {
            return m_theta_;
        }

        ::zserio::DeltaContext& getPhi()
        {
            return m_phi_;
        }

    private:
        ::zserio::DeltaContext m_theta_;
        ::zserio::DeltaContext m_phi_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    NormalSphere() noexcept :
            NormalSphere(allocator_type())
    {}

    explicit NormalSphere(const allocator_type& allocator) noexcept;

    NormalSphere(
            uint8_t theta_,
            uint8_t phi_,
            const allocator_type& allocator = allocator_type()) :
            NormalSphere(allocator)
    {
        m_theta_ = theta_;
        m_phi_ = phi_;
    }

    explicit NormalSphere(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit NormalSphere(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~NormalSphere() = default;

    NormalSphere(const NormalSphere&) = default;
    NormalSphere& operator=(const NormalSphere&) = default;

    NormalSphere(NormalSphere&&) = default;
    NormalSphere& operator=(NormalSphere&&) = default;

    NormalSphere(::zserio::PropagateAllocatorT,
            const NormalSphere& other, const allocator_type& allocator);

    uint8_t getTheta() const;
    void setTheta(uint8_t theta_);

    uint8_t getPhi() const;
    void setPhi(uint8_t phi_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const NormalSphere& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    uint8_t readTheta(::zserio::BitStreamReader& in);
    uint8_t readTheta(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    uint8_t readPhi(::zserio::BitStreamReader& in);
    uint8_t readPhi(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    uint8_t m_theta_;
    uint8_t m_phi_;
};

} // namespace types
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_TYPES_NORMAL_SPHERE_H
