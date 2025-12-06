import java.awt.*;
import javax.swing.*;

public class Internalframe
{
   public static void main(String[] a)
   {
      JFrame jf= new JFrame("Internal Frames");
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jf.setSize(300,300);
      jf.setVisible(true);

      JInternalFrame f =new JInternalFrame("Frame 1");
      f.setLocation(10,10);
      jf.add(f);

   }
}