
---

### **3. WIN32 Driver Programming**

**README.md**:
```markdown
# WIN32 Driver Programming

This project demonstrates a simple Windows kernel driver that:
- Prints "Hello Kernel!" when loaded.
- Prints "Goodbye Kernel!" when unloaded.

## Requirements
- Visual Studio with Windows Driver Kit (WDK) installed.
- Windows in Test Mode to allow unsigned drivers.

## Setup
1. Open Visual Studio and create a new **Kernel Mode Driver** project.
2. Replace the auto-generated code with the provided driver code.

## Compilation
1. Build the solution in Visual Studio to generate a `.sys` file.

## Running
1. Enable Test Mode:
   ```bash
   bcdedit /set testsigning on
2. Restart your PC. 2. Load the driver:
bash
Copy code
sc create MyDriver binPath= C:\Path\to\driver.sys type= kernel
sc start MyDriver
3. View debug output:
Download and run DebugView from Sysinternals.
Enable Capture Kernel under the Capture menu.
4. Stop the driver:
bash
Copy code
sc stop MyDriver
sc delete MyDriver
5. Disable Test Mode (optional):
bash
Copy code
bcdedit /set testsigning off