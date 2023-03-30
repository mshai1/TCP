import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        String serverAddress = "localhost";
        int port = 5000;

        Socket socket = new Socket(serverAddress, port);
        System.out.println("Connected to server.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

        String userInput;
        while ((userInput = stdIn.readLine()) != null) {
            out.println(userInput);
            String response = in.readLine();
            System.out.println("Server response: " + response);
            if (userInput.equals("exit")) {
                break;
            }
        }
        in.close();
        out.close();
        stdIn.close();
        socket.close();
    }
}
