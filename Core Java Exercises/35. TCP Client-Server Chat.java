Server:
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1234);
        Socket socket = server.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        out.println("Welcome Client!");
        System.out.println("Client says: " + in.readLine());

        socket.close();
        server.close();
    }
}
Client:

java
Copy code
import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        System.out.println(in.readLine());
        out.println("Hello Server!");

        socket.close();
    }
}

## Output
  
Server:
Waiting for client...
Client says: Hello Server!

Client:
Connected to server...
Server says: Welcome Client!
