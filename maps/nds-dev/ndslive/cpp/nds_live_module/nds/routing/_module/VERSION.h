/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING__MODULE_VERSION_H
#define NDS_ROUTING__MODULE_VERSION_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <zserio/StringView.h>

namespace nds
{
namespace routing
{
namespace _module
{

const ::zserio::StringView VERSION = ::zserio::makeStringView("2023.09");

} // namespace _module
} // namespace routing
} // namespace nds

#endif // NDS_ROUTING__MODULE_VERSION_H
