/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_METADATA_DRAWING_ORDER_MAPPING_H
#define NDS_DISPLAY_METADATA_DRAWING_ORDER_MAPPING_H

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

#include <nds/display/types/DefaultDrawingOrder.h>
#include <nds/display/types/DisplayAreaType.h>
#include <nds/display/types/DisplayLineType.h>
#include <nds/display/types/DisplayPointType.h>

namespace nds
{
namespace display
{
namespace metadata
{

class DrawingOrderMapping
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumDisplayPointTypes()
        {
            return m_numDisplayPointTypes_;
        }

        ::zserio::DeltaContext& getNumDisplayLineTypes()
        {
            return m_numDisplayLineTypes_;
        }

        ::zserio::DeltaContext& getNumDisplayAreaTypes()
        {
            return m_numDisplayAreaTypes_;
        }

    private:
        ::zserio::DeltaContext m_numDisplayPointTypes_;
        ::zserio::DeltaContext m_numDisplayLineTypes_;
        ::zserio::DeltaContext m_numDisplayAreaTypes_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    DrawingOrderMapping() noexcept :
            DrawingOrderMapping(allocator_type())
    {}

    explicit DrawingOrderMapping(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_displayPointType = ::zserio::vector<::nds::display::types::DisplayPointType>,
            typename ZSERIO_T_displayPointDrawingOrder = ::zserio::vector<::nds::display::types::DefaultDrawingOrder>,
            typename ZSERIO_T_displayLineType = ::zserio::vector<::nds::display::types::DisplayLineType>,
            typename ZSERIO_T_displayLineDrawingOrder = ::zserio::vector<::nds::display::types::DefaultDrawingOrder>,
            typename ZSERIO_T_displayAreaType = ::zserio::vector<::nds::display::types::DisplayAreaType>,
            typename ZSERIO_T_displayAreaDrawingOrder = ::zserio::vector<::nds::display::types::DefaultDrawingOrder>>
    DrawingOrderMapping(
            uint32_t numDisplayPointTypes_,
            uint32_t numDisplayLineTypes_,
            uint32_t numDisplayAreaTypes_,
            ZSERIO_T_displayPointType&& displayPointType_,
            ZSERIO_T_displayPointDrawingOrder&& displayPointDrawingOrder_,
            ZSERIO_T_displayLineType&& displayLineType_,
            ZSERIO_T_displayLineDrawingOrder&& displayLineDrawingOrder_,
            ZSERIO_T_displayAreaType&& displayAreaType_,
            ZSERIO_T_displayAreaDrawingOrder&& displayAreaDrawingOrder_,
            const allocator_type& allocator = allocator_type()) :
            DrawingOrderMapping(allocator)
    {
        m_numDisplayPointTypes_ = numDisplayPointTypes_;
        m_numDisplayLineTypes_ = numDisplayLineTypes_;
        m_numDisplayAreaTypes_ = numDisplayAreaTypes_;
        m_displayPointType_ = ZserioArrayType_displayPointType(::std::forward<ZSERIO_T_displayPointType>(displayPointType_));
        m_displayPointDrawingOrder_ = ZserioArrayType_displayPointDrawingOrder(::std::forward<ZSERIO_T_displayPointDrawingOrder>(displayPointDrawingOrder_));
        m_displayLineType_ = ZserioArrayType_displayLineType(::std::forward<ZSERIO_T_displayLineType>(displayLineType_));
        m_displayLineDrawingOrder_ = ZserioArrayType_displayLineDrawingOrder(::std::forward<ZSERIO_T_displayLineDrawingOrder>(displayLineDrawingOrder_));
        m_displayAreaType_ = ZserioArrayType_displayAreaType(::std::forward<ZSERIO_T_displayAreaType>(displayAreaType_));
        m_displayAreaDrawingOrder_ = ZserioArrayType_displayAreaDrawingOrder(::std::forward<ZSERIO_T_displayAreaDrawingOrder>(displayAreaDrawingOrder_));
    }

    explicit DrawingOrderMapping(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit DrawingOrderMapping(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~DrawingOrderMapping() = default;

    DrawingOrderMapping(const DrawingOrderMapping&) = default;
    DrawingOrderMapping& operator=(const DrawingOrderMapping&) = default;

    DrawingOrderMapping(DrawingOrderMapping&&) = default;
    DrawingOrderMapping& operator=(DrawingOrderMapping&&) = default;

    DrawingOrderMapping(::zserio::PropagateAllocatorT,
            const DrawingOrderMapping& other, const allocator_type& allocator);

    uint32_t getNumDisplayPointTypes() const;
    void setNumDisplayPointTypes(uint32_t numDisplayPointTypes_);

    uint32_t getNumDisplayLineTypes() const;
    void setNumDisplayLineTypes(uint32_t numDisplayLineTypes_);

    uint32_t getNumDisplayAreaTypes() const;
    void setNumDisplayAreaTypes(uint32_t numDisplayAreaTypes_);

    const ::zserio::vector<::nds::display::types::DisplayPointType>& getDisplayPointType() const;
    ::zserio::vector<::nds::display::types::DisplayPointType>& getDisplayPointType();
    void setDisplayPointType(const ::zserio::vector<::nds::display::types::DisplayPointType>& displayPointType_);
    void setDisplayPointType(::zserio::vector<::nds::display::types::DisplayPointType>&& displayPointType_);

    const ::zserio::vector<::nds::display::types::DefaultDrawingOrder>& getDisplayPointDrawingOrder() const;
    ::zserio::vector<::nds::display::types::DefaultDrawingOrder>& getDisplayPointDrawingOrder();
    void setDisplayPointDrawingOrder(const ::zserio::vector<::nds::display::types::DefaultDrawingOrder>& displayPointDrawingOrder_);
    void setDisplayPointDrawingOrder(::zserio::vector<::nds::display::types::DefaultDrawingOrder>&& displayPointDrawingOrder_);

    const ::zserio::vector<::nds::display::types::DisplayLineType>& getDisplayLineType() const;
    ::zserio::vector<::nds::display::types::DisplayLineType>& getDisplayLineType();
    void setDisplayLineType(const ::zserio::vector<::nds::display::types::DisplayLineType>& displayLineType_);
    void setDisplayLineType(::zserio::vector<::nds::display::types::DisplayLineType>&& displayLineType_);

    const ::zserio::vector<::nds::display::types::DefaultDrawingOrder>& getDisplayLineDrawingOrder() const;
    ::zserio::vector<::nds::display::types::DefaultDrawingOrder>& getDisplayLineDrawingOrder();
    void setDisplayLineDrawingOrder(const ::zserio::vector<::nds::display::types::DefaultDrawingOrder>& displayLineDrawingOrder_);
    void setDisplayLineDrawingOrder(::zserio::vector<::nds::display::types::DefaultDrawingOrder>&& displayLineDrawingOrder_);

    const ::zserio::vector<::nds::display::types::DisplayAreaType>& getDisplayAreaType() const;
    ::zserio::vector<::nds::display::types::DisplayAreaType>& getDisplayAreaType();
    void setDisplayAreaType(const ::zserio::vector<::nds::display::types::DisplayAreaType>& displayAreaType_);
    void setDisplayAreaType(::zserio::vector<::nds::display::types::DisplayAreaType>&& displayAreaType_);

    const ::zserio::vector<::nds::display::types::DefaultDrawingOrder>& getDisplayAreaDrawingOrder() const;
    ::zserio::vector<::nds::display::types::DefaultDrawingOrder>& getDisplayAreaDrawingOrder();
    void setDisplayAreaDrawingOrder(const ::zserio::vector<::nds::display::types::DefaultDrawingOrder>& displayAreaDrawingOrder_);
    void setDisplayAreaDrawingOrder(::zserio::vector<::nds::display::types::DefaultDrawingOrder>&& displayAreaDrawingOrder_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DrawingOrderMapping& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    using ZserioArrayType_displayPointType = ::zserio::Array<::zserio::vector<::nds::display::types::DisplayPointType>, ::zserio::EnumArrayTraits<::nds::display::types::DisplayPointType>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_displayPointDrawingOrder = ::zserio::Array<::zserio::vector<::nds::display::types::DefaultDrawingOrder>, ::zserio::VarIntNNArrayTraits<::nds::display::types::DefaultDrawingOrder>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_displayLineType = ::zserio::Array<::zserio::vector<::nds::display::types::DisplayLineType>, ::zserio::EnumArrayTraits<::nds::display::types::DisplayLineType>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_displayLineDrawingOrder = ::zserio::Array<::zserio::vector<::nds::display::types::DefaultDrawingOrder>, ::zserio::VarIntNNArrayTraits<::nds::display::types::DefaultDrawingOrder>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_displayAreaType = ::zserio::Array<::zserio::vector<::nds::display::types::DisplayAreaType>, ::zserio::EnumArrayTraits<::nds::display::types::DisplayAreaType>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_displayAreaDrawingOrder = ::zserio::Array<::zserio::vector<::nds::display::types::DefaultDrawingOrder>, ::zserio::VarIntNNArrayTraits<::nds::display::types::DefaultDrawingOrder>, ::zserio::ArrayType::NORMAL>;

    uint32_t readNumDisplayPointTypes(::zserio::BitStreamReader& in);
    uint32_t readNumDisplayPointTypes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    uint32_t readNumDisplayLineTypes(::zserio::BitStreamReader& in);
    uint32_t readNumDisplayLineTypes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    uint32_t readNumDisplayAreaTypes(::zserio::BitStreamReader& in);
    uint32_t readNumDisplayAreaTypes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_displayPointType readDisplayPointType(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_displayPointType readDisplayPointType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_displayPointDrawingOrder readDisplayPointDrawingOrder(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_displayPointDrawingOrder readDisplayPointDrawingOrder(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_displayLineType readDisplayLineType(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_displayLineType readDisplayLineType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_displayLineDrawingOrder readDisplayLineDrawingOrder(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_displayLineDrawingOrder readDisplayLineDrawingOrder(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_displayAreaType readDisplayAreaType(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_displayAreaType readDisplayAreaType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_displayAreaDrawingOrder readDisplayAreaDrawingOrder(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_displayAreaDrawingOrder readDisplayAreaDrawingOrder(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint32_t m_numDisplayPointTypes_;
    uint32_t m_numDisplayLineTypes_;
    uint32_t m_numDisplayAreaTypes_;
    ZserioArrayType_displayPointType m_displayPointType_;
    ZserioArrayType_displayPointDrawingOrder m_displayPointDrawingOrder_;
    ZserioArrayType_displayLineType m_displayLineType_;
    ZserioArrayType_displayLineDrawingOrder m_displayLineDrawingOrder_;
    ZserioArrayType_displayAreaType m_displayAreaType_;
    ZserioArrayType_displayAreaDrawingOrder m_displayAreaDrawingOrder_;
};

} // namespace metadata
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_METADATA_DRAWING_ORDER_MAPPING_H