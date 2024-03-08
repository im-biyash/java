import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        // Step 1: First, the server should instantiate a ServerSocket object.
        ServerSocket ss = new ServerSocket(6666);

        // Step 2: Then, the Server object invokes accept() method of ServerSocket class.
        // This waits for the client until the client creates a Socket object.
        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());

        // Type casting the UTF message into a string.
        String message = (String) dis.readUTF();
        

        int num = Integer.valueOf(message);

        int snum = num * num;

        // This sends the result back to the client.
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF("" + snum);
        dout.flush();

        // Close the connections
        dout.close();
        dis.close();
        s.close();
        ss.close(); 
        // to send to server
    }
}
