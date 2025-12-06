import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends Frame
{
	Label l1, l2, l3;
	TextField tf1, tf2, tf3;
	Button b1, b2;

	MyFrame2()
	{
		//setting frame default properties
		setTitle("MyFrame");
		setSize(500, 500);
		//setLayout(new GridLayout(1,2));


		//component objects creation
		l1 = new Label("Enter first int number");
		l2 = new Label("Enter second int number");
		l3 = new Label("Result");

		tf1 = new TextField(20);
		tf2 = new TextField(20);
		tf3 = new TextField(20);

		b1 = new Button("Add");
		b2 = new Button("Clear");

		//adding componets to container
		add(l1);
		add(tf1);

		add(l2);
		add(tf2);

		add(l3);
		add(tf3);

		add(b2);
		add(b1);



		setVisible(true) ;
	}


	public static void main(String[] args)
	{
		MyFrame2 f = new MyFrame2();


		System.out.println("Hello World!");
	}

}

