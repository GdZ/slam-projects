/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_TYPES_RASTER_IMAGE_H
#define NDS_SMART_TYPES_RASTER_IMAGE_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <zserio/ArrayTraits.h>
#include <zserio/Vector.h>

namespace nds
{
namespace smart
{
namespace types
{

using RasterImage = ::zserio::vector<uint8_t>;

} // namespace types
} // namespace smart
} // namespace nds

#endif // NDS_SMART_TYPES_RASTER_IMAGE_H
