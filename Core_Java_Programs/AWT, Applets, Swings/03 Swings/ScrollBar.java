import java.awt.*;
import javax.swing.*;

public class ScrollBar
{
    public static void main(String [] a)
    {
         JFrame frame = new JFrame("frame with scrollbar");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        //JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


        frame.setContentPane(pane);

       frame.setVisible(true);

}
}