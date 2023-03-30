import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started. Listening to port 5000...");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String inputLine, outputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println("Received from client: " + inputLine);
            if (inputLine.equals("exit")) {
                break;
            }
            outputLine = "Server response: " + inputLine;
            out.println(outputLine);
        }
        in.close();
        out.close();
        socket.close();
        serverSocket.close();
    }
}
