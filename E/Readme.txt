# Linux Kernel Module Programming

This project demonstrates a simple Linux kernel module that prints:
- The value of `GOLDEN_RATIO_PRIME` when the module is loaded.
- The GCD (Greatest Common Divisor) of 3700 and 24 when the module is unloaded.

## Requirements
- Linux distribution (e.g., Ubuntu)
- GCC compiler
- Kernel headers

## Setup
Install development tools:
   ```bash
   sudo apt update
   sudo apt install build-essential linux-headers-$(uname -r)

## Load the module:
bash
Copy code
sudo insmod simple.ko
## Check the kernel logs to see the output:
bash
Copy code
dmesg
## Unload the module:
bash
Copy code
sudo rmmod simple
## Clean up:
bash
Copy code
make clean