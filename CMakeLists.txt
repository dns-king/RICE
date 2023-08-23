cmake_minimum_required(VERSION 3.22)  # Use the latest version of CMake

project(RiceCompiler)

# Find LLVM package
find_package(LLVM REQUIRED CONFIG)
message(STATUS "Found LLVM ${LLVM_PACKAGE_VERSION}")
message(STATUS "Using LLVMConfig.cmake in: ${LLVM_DIR}")

# Set additional CMake variables
set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

#include directories and definitions from LLVM
include_directories(${LLVM_INCLUDE_DIRS})
add_definitions(${LLVM_DEFINITIONS})

# executable for the Rice compiler
add_executable(rice-compiler main.cpp)

# Link against LLVM libraries
target_link_libraries(rice-compiler PRIVATE LLVM)
