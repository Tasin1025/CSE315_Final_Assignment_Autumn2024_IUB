# RMI Java Project - Remote Method Invocation (RMI)

## Overview
This project demonstrates the implementation of Remote Method Invocation (RMI) in Java. It consists of:
- A **server** program that offers a remote method (`add`) for clients to invoke.
- A **client** program that connects to the server and invokes the remote method.

The server and client communicate using RMI, and the server exposes a simple method to add two integers.

## Prerequisites
1. **Java Development Kit (JDK)** installed on your system.
   - You can download it from: [Oracle JDK Download](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html)
   - Ensure you have at least JDK 8 or later.

2. **RMI Registry** should be available, which is included with the JDK.

## Setup Instructions

### 1. Download the Project
Download and extract the project folder to your local machine.

### 2. Compile the Java Files
Navigate to the folder where the `*.java` files are located (using your terminal or command prompt).

Run the following command to compile the Java source files:
```bash
javac *.java


### 3. Start the RMI Registry
The RMI registry needs to be running before starting the server and client.

Open a terminal (or command prompt), and execute:
	rmiregistry
Leave this terminal open as it runs the registry for communication between the client and server.

### 4. Run the Server
Now, open a new terminal (or command prompt) and run the server using the following command:
	java Server
### 5. Run the Client
In another terminal (or command prompt), run the client program using:
	java Client


