import java.awt.*;
import javax.swing.*;

public class JInternalFrameTest
{
   public static void main(String[] a)
   {
      JFrame myFrame = new JFrame("Internal Frames");
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.setSize(300,300);
      myFrame.setVisible(true);

      JDesktopPane myDesktop = new JDesktopPane();
      myFrame.setContentPane(myDesktop);

      JInternalFrame f = createFrame("Frame 1");
      f.setLocation(10,10);
      myDesktop.add(f);

      f = createFrame("Frame 2");
      f.setLocation(60,60);
      myDesktop.add(f);


   }
   private static JInternalFrame createFrame(String t) {
      JInternalFrame f = new JInternalFrame(t);
      f.setResizable(true);
      f.setClosable(true);
      f.setMaximizable(true);
      f.setIconifiable(true);
      f.setSize(200,200);
      f.setVisible(true);
      return f;
   }
}