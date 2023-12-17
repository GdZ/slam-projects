cmake_minimum_required (VERSION 3.5.0 FATAL_ERROR)
project (nds_live_module)

file(GLOB_RECURSE sources CONFIGURE_DEPENDS "${PROJECT_SOURCE_DIR}/*.cpp")
file(GLOB_RECURSE headers CONFIGURE_DEPENDS "${PROJECT_SOURCE_DIR}/*.h")

add_library (${PROJECT_NAME} STATIC 
    ${sources}
    ${headers}
  )

set_target_properties (${PROJECT_NAME} PROPERTIES
    CXX_STANDARD 11
    CXX_STANDARD_REQUIRED ON
    CXX_EXTENSIONS NO
    )

target_include_directories (${PROJECT_NAME} PRIVATE ./)
target_link_libraries (${PROJECT_NAME} ZserioCppRuntime)
