import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class B implements ActionListener
{
	JButton b1;
	B()
	{
		JFrame jf=new JFrame("B frame");
		jf.setSize(800,600);
		jf.setVisible(true);
		jf.getContentPane().setBackground(Color.pink);
		jf.setLayout(null);

		b1=new JButton("click");
		jf.add(b1);
		b1.setBounds(100,100,100,20);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			A a1=new A();
		}

	}

public static void main(String arg[])
{
    B b1=new B();
}

}