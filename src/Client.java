import java.net.*;
import java.io.*;
import java.awt.AWTException;
import java.awt.Robot;
public class Client {
static int mouseXaxis=0;
    private Socket socket = null;
    private DataInputStream input = null;
    private static DataOutputStream out = null;
    static Robot robot=null;
    public  Client(String address, int port) {
        try {
            robot=new Robot();
        } catch (AWTException e) {
           
            e.printStackTrace();
        }
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
            if(x>0){
                out.writeInt(x);
                out.writeInt(y);
                mouseXaxis+=(x-1500);
               // setMouse(1500, y);
               // System.out.print(" "+mouseXaxis+" ");
            }else
            if(mouseXaxis>0){
              //  setMouse(1500, y);
                mouseXaxis-=(1500-x);
                out.writeInt(x);
                out.writeInt(y);
            }
           
            
        } catch (IOException e) {
           
            e.printStackTrace();
        }
    }
    public static void setMouse(int x, int y) {
        robot.mouseMove(x, y);
    }
   
}