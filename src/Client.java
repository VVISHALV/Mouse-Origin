import java.net.*;
import java.io.*;

public class Client {

    private Socket socket = null;
    private DataInputStream input = null;
    private static DataOutputStream out = null;

    public  Client(String address, int port) {

        try {
            socket = new Socket(address, port);
            System.out.println("Connected");

            input = new DataInputStream(System.in);

            out = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException u) {
            System.out.println(u);
        } catch (IOException i) {
            System.out.println(i);
        }

       
    }
    public static  void mouseMotionSend (int x,int y){
        try {
            out.writeInt(x);
            out.writeInt(y);
        } catch (IOException e) {
           
            e.printStackTrace();
        }
    }
   
}