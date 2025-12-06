import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Hyperlink
{
	JLabel l1;

	Hyperlink()
	{
		JFrame jf=new JFrame("Hyperlink frame");
		jf.setSize(800,600);
		jf.setVisible(true);
       jf.getContentPane().setBackground(Color.green);
       jf.setLayout(null);


		String s1="<html><u>Forgot Password</u></html>";
        l1=new JLabel(s1);
       jf.add(l1);
       l1.setBounds(100,100,100,50);

       l1.addMouseListener(new MouseAdapter()
	   {
	       public void mouseClicked(MouseEvent e)
	       {
	          // you can open a new frame here as
	          // i have assumed you have declared "frame" as instance variable
	          //JFrame f= new JFrame("new frame");
	          new B();
	          //f.setVisible(true);

	       }
});
	}

public static void main(String arg[])
{
	Hyperlink h=new Hyperlink();

}
}