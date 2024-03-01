import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        // Connect to the server on localhost and port 6666
        Socket socket = new Socket("localhost", 6666);

        // Set up input and output streams
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        // Send a number to the server
        int numberToSend = 5;
        out.writeUTF("" + numberToSend);

        // Receive the result from the server
        String result = in.readUTF();
        System.out.println("Square of " + numberToSend + " is: " + result);

        // Close the connections
        in.close();
        out.close();
        socket.close();
    }
}
