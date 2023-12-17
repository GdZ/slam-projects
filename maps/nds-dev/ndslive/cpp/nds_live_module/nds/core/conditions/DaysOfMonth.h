/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_CONDITIONS_DAYS_OF_MONTH_H
#define NDS_CORE_CONDITIONS_DAYS_OF_MONTH_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <zserio/Traits.h>
#include <zserio/BitStreamReader.h>
#include <zserio/BitStreamWriter.h>
#include <zserio/AllocatorPropagatingCopy.h>
#include <memory>
#include <zserio/ArrayTraits.h>

namespace nds
{
namespace core
{
namespace conditions
{

class DaysOfMonth
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    DaysOfMonth() noexcept :
            DaysOfMonth(allocator_type())
    {}

    explicit DaysOfMonth(const allocator_type& allocator) noexcept;

    DaysOfMonth(
            bool isDay1_,
            bool isDay2_,
            bool isDay3_,
            bool isDay4_,
            bool isDay5_,
            bool isDay6_,
            bool isDay7_,
            bool isDay8_,
            bool isDay9_,
            bool isDay10_,
            bool isDay11_,
            bool isDay12_,
            bool isDay13_,
            bool isDay14_,
            bool isDay15_,
            bool isDay16_,
            bool isDay17_,
            bool isDay18_,
            bool isDay19_,
            bool isDay20_,
            bool isDay21_,
            bool isDay22_,
            bool isDay23_,
            bool isDay24_,
            bool isDay25_,
            bool isDay26_,
            bool isDay27_,
            bool isDay28_,
            bool isDay29_,
            bool isDay30_,
            bool isDay31_,
            bool isInclusive_,
            const allocator_type& allocator = allocator_type()) :
            DaysOfMonth(allocator)
    {
        m_isDay1_ = isDay1_;
        m_isDay2_ = isDay2_;
        m_isDay3_ = isDay3_;
        m_isDay4_ = isDay4_;
        m_isDay5_ = isDay5_;
        m_isDay6_ = isDay6_;
        m_isDay7_ = isDay7_;
        m_isDay8_ = isDay8_;
        m_isDay9_ = isDay9_;
        m_isDay10_ = isDay10_;
        m_isDay11_ = isDay11_;
        m_isDay12_ = isDay12_;
        m_isDay13_ = isDay13_;
        m_isDay14_ = isDay14_;
        m_isDay15_ = isDay15_;
        m_isDay16_ = isDay16_;
        m_isDay17_ = isDay17_;
        m_isDay18_ = isDay18_;
        m_isDay19_ = isDay19_;
        m_isDay20_ = isDay20_;
        m_isDay21_ = isDay21_;
        m_isDay22_ = isDay22_;
        m_isDay23_ = isDay23_;
        m_isDay24_ = isDay24_;
        m_isDay25_ = isDay25_;
        m_isDay26_ = isDay26_;
        m_isDay27_ = isDay27_;
        m_isDay28_ = isDay28_;
        m_isDay29_ = isDay29_;
        m_isDay30_ = isDay30_;
        m_isDay31_ = isDay31_;
        m_isInclusive_ = isInclusive_;
    }

    explicit DaysOfMonth(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~DaysOfMonth() = default;

    DaysOfMonth(const DaysOfMonth&) = default;
    DaysOfMonth& operator=(const DaysOfMonth&) = default;

    DaysOfMonth(DaysOfMonth&&) = default;
    DaysOfMonth& operator=(DaysOfMonth&&) = default;

    DaysOfMonth(::zserio::PropagateAllocatorT,
            const DaysOfMonth& other, const allocator_type& allocator);

    bool getIsDay1() const;
    void setIsDay1(bool isDay1_);

    bool getIsDay2() const;
    void setIsDay2(bool isDay2_);

    bool getIsDay3() const;
    void setIsDay3(bool isDay3_);

    bool getIsDay4() const;
    void setIsDay4(bool isDay4_);

    bool getIsDay5() const;
    void setIsDay5(bool isDay5_);

    bool getIsDay6() const;
    void setIsDay6(bool isDay6_);

    bool getIsDay7() const;
    void setIsDay7(bool isDay7_);

    bool getIsDay8() const;
    void setIsDay8(bool isDay8_);

    bool getIsDay9() const;
    void setIsDay9(bool isDay9_);

    bool getIsDay10() const;
    void setIsDay10(bool isDay10_);

    bool getIsDay11() const;
    void setIsDay11(bool isDay11_);

    bool getIsDay12() const;
    void setIsDay12(bool isDay12_);

    bool getIsDay13() const;
    void setIsDay13(bool isDay13_);

    bool getIsDay14() const;
    void setIsDay14(bool isDay14_);

    bool getIsDay15() const;
    void setIsDay15(bool isDay15_);

    bool getIsDay16() const;
    void setIsDay16(bool isDay16_);

    bool getIsDay17() const;
    void setIsDay17(bool isDay17_);

    bool getIsDay18() const;
    void setIsDay18(bool isDay18_);

    bool getIsDay19() const;
    void setIsDay19(bool isDay19_);

    bool getIsDay20() const;
    void setIsDay20(bool isDay20_);

    bool getIsDay21() const;
    void setIsDay21(bool isDay21_);

    bool getIsDay22() const;
    void setIsDay22(bool isDay22_);

    bool getIsDay23() const;
    void setIsDay23(bool isDay23_);

    bool getIsDay24() const;
    void setIsDay24(bool isDay24_);

    bool getIsDay25() const;
    void setIsDay25(bool isDay25_);

    bool getIsDay26() const;
    void setIsDay26(bool isDay26_);

    bool getIsDay27() const;
    void setIsDay27(bool isDay27_);

    bool getIsDay28() const;
    void setIsDay28(bool isDay28_);

    bool getIsDay29() const;
    void setIsDay29(bool isDay29_);

    bool getIsDay30() const;
    void setIsDay30(bool isDay30_);

    bool getIsDay31() const;
    void setIsDay31(bool isDay31_);

    bool getIsInclusive() const;
    void setIsInclusive(bool isInclusive_);

    size_t bitSizeOf(size_t bitPosition = 0) const;

    size_t initializeOffsets(size_t bitPosition = 0);

    bool operator==(const DaysOfMonth& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;

private:
    bool readIsDay1(::zserio::BitStreamReader& in);
    bool readIsDay2(::zserio::BitStreamReader& in);
    bool readIsDay3(::zserio::BitStreamReader& in);
    bool readIsDay4(::zserio::BitStreamReader& in);
    bool readIsDay5(::zserio::BitStreamReader& in);
    bool readIsDay6(::zserio::BitStreamReader& in);
    bool readIsDay7(::zserio::BitStreamReader& in);
    bool readIsDay8(::zserio::BitStreamReader& in);
    bool readIsDay9(::zserio::BitStreamReader& in);
    bool readIsDay10(::zserio::BitStreamReader& in);
    bool readIsDay11(::zserio::BitStreamReader& in);
    bool readIsDay12(::zserio::BitStreamReader& in);
    bool readIsDay13(::zserio::BitStreamReader& in);
    bool readIsDay14(::zserio::BitStreamReader& in);
    bool readIsDay15(::zserio::BitStreamReader& in);
    bool readIsDay16(::zserio::BitStreamReader& in);
    bool readIsDay17(::zserio::BitStreamReader& in);
    bool readIsDay18(::zserio::BitStreamReader& in);
    bool readIsDay19(::zserio::BitStreamReader& in);
    bool readIsDay20(::zserio::BitStreamReader& in);
    bool readIsDay21(::zserio::BitStreamReader& in);
    bool readIsDay22(::zserio::BitStreamReader& in);
    bool readIsDay23(::zserio::BitStreamReader& in);
    bool readIsDay24(::zserio::BitStreamReader& in);
    bool readIsDay25(::zserio::BitStreamReader& in);
    bool readIsDay26(::zserio::BitStreamReader& in);
    bool readIsDay27(::zserio::BitStreamReader& in);
    bool readIsDay28(::zserio::BitStreamReader& in);
    bool readIsDay29(::zserio::BitStreamReader& in);
    bool readIsDay30(::zserio::BitStreamReader& in);
    bool readIsDay31(::zserio::BitStreamReader& in);
    bool readIsInclusive(::zserio::BitStreamReader& in);

    bool m_isDay1_;
    bool m_isDay2_;
    bool m_isDay3_;
    bool m_isDay4_;
    bool m_isDay5_;
    bool m_isDay6_;
    bool m_isDay7_;
    bool m_isDay8_;
    bool m_isDay9_;
    bool m_isDay10_;
    bool m_isDay11_;
    bool m_isDay12_;
    bool m_isDay13_;
    bool m_isDay14_;
    bool m_isDay15_;
    bool m_isDay16_;
    bool m_isDay17_;
    bool m_isDay18_;
    bool m_isDay19_;
    bool m_isDay20_;
    bool m_isDay21_;
    bool m_isDay22_;
    bool m_isDay23_;
    bool m_isDay24_;
    bool m_isDay25_;
    bool m_isDay26_;
    bool m_isDay27_;
    bool m_isDay28_;
    bool m_isDay29_;
    bool m_isDay30_;
    bool m_isDay31_;
    bool m_isInclusive_;
};

} // namespace conditions
} // namespace core
} // namespace nds

#endif // NDS_CORE_CONDITIONS_DAYS_OF_MONTH_H