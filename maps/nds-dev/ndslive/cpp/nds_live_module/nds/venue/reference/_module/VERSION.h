/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VENUE_REFERENCE__MODULE_VERSION_H
#define NDS_VENUE_REFERENCE__MODULE_VERSION_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <zserio/StringView.h>

namespace nds
{
namespace venue
{
namespace reference
{
namespace _module
{

const ::zserio::StringView VERSION = ::zserio::makeStringView("2023.11");

} // namespace _module
} // namespace reference
} // namespace venue
} // namespace nds

#endif // NDS_VENUE_REFERENCE__MODULE_VERSION_H
