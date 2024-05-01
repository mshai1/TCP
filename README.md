# TCP Client-Server Communication

This is a simple Java implementation of a TCP client-server communication system. The system consists of two Java classes: `TCPClient` and `TCPServer`.

## TCPClient

The `TCPClient` class represents the client side of the communication. It establishes a connection to a server, sends messages to the server, and receives responses from it.

### Usage

To use the `TCPClient` class, follow these steps:

1. Compile the Java file:
    ```bash
    javac TCPClient.java
    ```

2. Run the compiled class, specifying the server address and port:
    ```bash
    java TCPClient
    ```

3. Input messages into the console. Type "exit" to terminate the connection.

## TCPServer

The `TCPServer` class represents the server side of the communication. It listens for incoming connections from clients, receives messages from clients, and sends responses back.

### Usage

To use the `TCPServer` class, follow these steps:

1. Compile the Java file:
    ```bash
    javac TCPServer.java
    ```

2. Run the compiled class:
    ```bash
    java TCPServer
    ```

3. The server will start listening on port 5000 for incoming connections.

### Notes

- Ensure that the server is running before starting the client.
- Both the client and server classes use port 5000 by default. You can modify the port number if needed.
- This implementation uses basic input/output streams for communication.
- To terminate the connection, type "exit" in the client's console.

Contributed by: Mohammad Shaikh
