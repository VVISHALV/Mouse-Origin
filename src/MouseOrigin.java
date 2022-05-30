
  
import java.awt.event.*;  
import javax.swing.*;
import java.awt.*;


public class MouseOrigin  {
  
  
   public static void frame()
  { /*Point p = MouseInfo.getPointerInfo().getLocation();
    while(true)
    {p = MouseInfo.getPointerInfo().getLocation();
      if(p.y==0)return;
      Client.mouseMotionSend(p.x,p.y);
    System.out.println(p.x+" "+p.y);}*/
   JFrame f=new JFrame("Mouse");
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
