import javax.swing.*;
import java.awt.*;
class paragraph
{
public static void main(String s[])
{
	JFrame jf=new JFrame("paragraph test");
	jf.setSize(500,400);
	jf.setVisible(true);
	jf.setLayout(null);

   String s1= "<html><p>This program........"
   +"contains a paragraph"
   +"hello welcome"
   +"good morning <br><i><u>bye<br></p></html>";
     JLabel l1= new JLabel(s1);
  jf.add(l1);
  l1.setBounds(100,100,200,100);

}

}