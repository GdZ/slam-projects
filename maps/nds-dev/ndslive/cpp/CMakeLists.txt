cmake_minimum_required (VERSION 3.5.0 FATAL_ERROR)
project (cpp_module_check)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

add_subdirectory (zserio_runtime)
add_subdirectory (nds_live_module)
