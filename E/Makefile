obj-m += simple.o

# The kernel build directory
KDIR := /lib/modules/$(shell uname -r)/build

# Path to the current directory
PWD := $(shell pwd)

# All target
all:
	make -C $(KDIR) M=$(PWD) modules

# Clean target
clean:
	make -C $(KDIR) M=$(PWD) clean
