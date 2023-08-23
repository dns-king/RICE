#include <llvm/IR/LLVMContext.h>
#include <llvm/IR/Module.h>

int main()
{
    llvm::LLVMContext context;
    llvm::Module module("my_module", context);

    //create LLVM IR for Rice

    module.dump(); // Dump the generated LLVM IR

    return 0;
}
