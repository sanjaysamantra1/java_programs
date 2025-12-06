import java.awt.*;
import javax.swing.*;

 public class scroll{
    private JFrame f; //Main frame
    private JTextArea ta; // Text area
    private JScrollPane sbrText; // Scroll pane for text area
    private JButton btnQuit; // Quit Program

    public scroll(){ //Constructor
        // Create Frame
        f = new JFrame("Swing Demo");
        f.getContentPane().setLayout(new FlowLayout());

       // Create Scrolling Text Area in Swing
       ta = new JTextArea("", 5, 50);
       ta.setLineWrap(true);
        sbrText = new JScrollPane(ta);
      sbrText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

//EDITED to show frame adding components

 // Add text area and button to frame
        f.getContentPane().add(sbrText);
      f.getContentPane().add(btnQuit);

        // Close when the close button is clicked
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       //Display Frame
      f.pack(); // Adjusts frame to size of components
         f.setVisible(true);
    }
}
