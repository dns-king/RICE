#include <llvm/IR/LLVMContext.h>
#include <llvm/IR/Module.h>

int main() {
    llvm::LLVMContext context;
    llvm::Module module("my_module", context);

    // Generate LLVM IR for Rice language

    module.dump();  // Dump the generated LLVM IR

    return 0;
}
