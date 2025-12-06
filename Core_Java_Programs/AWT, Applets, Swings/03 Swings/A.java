import javax.swing.*;
import java.awt.*;


class A
{
	A()
	{
		JFrame jf=new JFrame("A frame");
		jf.setSize(800,600);
		jf.setVisible(true);
       jf.getContentPane().setBackground(Color.green);
       jf.setLayout(null);

       String s1="<html><a href=\"img1.jpg\" >samteksystems</a></html";
       JLabel l1=new JLabel(s1);
       jf.add(l1);
       l1.setBounds(100,100,100,50);
	}
public static void main(String arg[])
{
	A a1=new A();

}
}