/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VEHICLE_TYPES_HORIZON_H
#define NDS_VEHICLE_TYPES_HORIZON_H

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

#include <nds/vehicle/reference/types/HorizonPathId.h>
#include <nds/vehicle/types/HorizonPath.h>

namespace nds
{
namespace vehicle
{
namespace types
{

class Horizon
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumPaths()
        {
            return m_numPaths_;
        }

    private:
        ::zserio::DeltaContext m_numPaths_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    Horizon() noexcept :
            Horizon(allocator_type())
    {}

    explicit Horizon(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_horizon = ::zserio::vector<::nds::vehicle::types::HorizonPath>,
            typename ZSERIO_T_mostProbablePath = ::zserio::vector<::nds::vehicle::reference::types::HorizonPathId>>
    Horizon(
            uint32_t numPaths_,
            ZSERIO_T_horizon&& horizon_,
            ZSERIO_T_mostProbablePath&& mostProbablePath_,
            const allocator_type& allocator = allocator_type()) :
            Horizon(allocator)
    {
        m_numPaths_ = numPaths_;
        m_horizon_ = ZserioArrayType_horizon(::std::forward<ZSERIO_T_horizon>(horizon_));
        m_mostProbablePath_ = ZserioArrayType_mostProbablePath(::std::forward<ZSERIO_T_mostProbablePath>(mostProbablePath_));
    }

    explicit Horizon(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit Horizon(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~Horizon() = default;

    Horizon(const Horizon&) = default;
    Horizon& operator=(const Horizon&) = default;

    Horizon(Horizon&&) = default;
    Horizon& operator=(Horizon&&) = default;

    Horizon(::zserio::PropagateAllocatorT,
            const Horizon& other, const allocator_type& allocator);

    void initializeChildren();

    uint32_t getNumPaths() const;
    void setNumPaths(uint32_t numPaths_);

    const ::zserio::vector<::nds::vehicle::types::HorizonPath>& getHorizon() const;
    ::zserio::vector<::nds::vehicle::types::HorizonPath>& getHorizon();
    void setHorizon(const ::zserio::vector<::nds::vehicle::types::HorizonPath>& horizon_);
    void setHorizon(::zserio::vector<::nds::vehicle::types::HorizonPath>&& horizon_);

    const ::zserio::vector<::nds::vehicle::reference::types::HorizonPathId>& getMostProbablePath() const;
    ::zserio::vector<::nds::vehicle::reference::types::HorizonPathId>& getMostProbablePath();
    void setMostProbablePath(const ::zserio::vector<::nds::vehicle::reference::types::HorizonPathId>& mostProbablePath_);
    void setMostProbablePath(::zserio::vector<::nds::vehicle::reference::types::HorizonPathId>&& mostProbablePath_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const Horizon& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_horizon
    {
    public:
        using OwnerType = Horizon;

        static void initializeElement(Horizon& owner,
                ::nds::vehicle::types::HorizonPath& element, size_t index);
    };

    class ZserioElementFactory_horizon
    {
    public:
        using OwnerType = Horizon;

        static void create(Horizon& owner,
                ::zserio::vector<::nds::vehicle::types::HorizonPath>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(Horizon& owner,
                ::zserio::vector<::nds::vehicle::types::HorizonPath>& array,
                ::nds::vehicle::types::HorizonPath::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_horizon = ::zserio::Array<::zserio::vector<::nds::vehicle::types::HorizonPath>, ::zserio::ObjectArrayTraits<::nds::vehicle::types::HorizonPath, ZserioElementFactory_horizon>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_horizon>;
    using ZserioArrayType_mostProbablePath = ::zserio::Array<::zserio::vector<::nds::vehicle::reference::types::HorizonPathId>, ::zserio::VarIntNNArrayTraits<::nds::vehicle::reference::types::HorizonPathId>, ::zserio::ArrayType::AUTO>;

    uint32_t readNumPaths(::zserio::BitStreamReader& in);
    uint32_t readNumPaths(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_horizon readHorizon(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_horizon readHorizon(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_mostProbablePath readMostProbablePath(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_mostProbablePath readMostProbablePath(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint32_t m_numPaths_;
    ZserioArrayType_horizon m_horizon_;
    ZserioArrayType_mostProbablePath m_mostProbablePath_;
};

} // namespace types
} // namespace vehicle
} // namespace nds

#endif // NDS_VEHICLE_TYPES_HORIZON_H
