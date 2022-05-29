
  
import java.awt.event.*;  
import javax.swing.*;


public class MouseOrigin  {
  
   public static void frame()
  { JFrame f=new JFrame("Mouse");
    f.setBounds(0, 0, 100, 100);
    f.setVisible(true);
    f.setLayout(null);
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
   f.addMouseMotionListener(new MouseMotionListener(){
    public void mouseMoved(MouseEvent e) {
      Client.mouseMotionSend(e.getX(),e.getY());
     // System.out.println(e.getPoint());
    }

    public void mouseDragged(MouseEvent e) {
        //System.out.println("mouse dragged: " + e.getPoint());
    }
   });
}
   
   
 
  
}
