import javax.swing.*;
import java.awt.*;
class Swing1
{
public static void main(String s[])
{
JFrame ha=new JFrame("kanha");
ha.getContentPane().setBackground(Color.orange);
ha.setSize(1000,1000);
ha.setVisible(true);
ha.setLayout(null);

//String str = "<html><a href=\"www.samteksystems.com\" >samteksystems</a></html>";
String str = "<html><a href=register>Register</a></html>";
JLabel h1=new JLabel(str);
ha.add(h1);
h1.setForeground(Color.black);
h1.setBounds(300,30,200,60);
JLabel h2=new JLabel("First name");
ha.add(h2);
h2.setBounds(30,100,130,40);
JLabel h3=new JLabel("Last name");
ha.add(h3);
h3.setBounds(30,150,130,40);
JLabel h4=new JLabel("DOB");
ha.add(h4);
h4.setBounds(30,200,130,40);
JLabel h5=new JLabel("Gender");
ha.add(h5);
h5.setBounds(30,250,130,40);
JLabel h6=new JLabel("Address");
ha.add(h6);
h6.setBounds(30,300,130,40);
JTextArea as=new JTextArea();
ha.add(as);
as.setBounds(150,310,170,90);
JLabel h7=new JLabel("Mobile");
ha.add(h7);
h7.setBounds(30,410,130,40);
JLabel h8=new JLabel("User name");
ha.add(h8);
h8.setBounds(30,460,130,40);
JLabel h9=new JLabel("password");
ha.add(h9);
h9.setBounds(30,510,130,40);
JLabel h10=new JLabel("Confirmpassword");
ha.add(h10);
h10.setBounds(30,560,130,40);
JLabel h11=new JLabel("E-mail");
ha.add(h11);
h11.setBounds(30,610,130,40);
JTextField l=new JTextField();
ha.add(l);
l.setBounds(150,110,170,20);
JTextField l1=new JTextField();
ha.add(l1);
l1.setBounds(150,160,170,20);
JTextField l2=new JTextField();
ha.add(l2);
l2.setBounds(150,420,170,20);
JTextField l3=new JTextField();
ha.add(l3);
l3.setBounds(150,470,170,20);
JPasswordField l4=new JPasswordField();
ha.add(l4);
l4.setBounds(150,520,170,20);
JPasswordField l5=new JPasswordField();
ha.add(l5);
l5.setBounds(150,570,170,20);
JTextField l6=new JTextField();
ha.add(l6);
l6.setBounds(150,620,170,20);
JComboBox a=new JComboBox();
a.addItem("DD");
for(int i=1;i<=31;i++)
{
String x=String.valueOf(i);
a.addItem(x);
}
JComboBox a1=new JComboBox();
a1.addItem("MM");
for(int i=1;i<=12;i++)
{
String x=String.valueOf(i);
a1.addItem(x);
}
JComboBox a2=new JComboBox();
a2.addItem("YY");
for(int i=1990;i<=2014;i++)
{
String x2=String.valueOf(i);
a2.addItem(x2);
}
ha.add(a);
ha.add(a1);
ha.add(a2);
a.setBounds(150,210,60,30);
a1.setBounds(220,210,60,30);
a2.setBounds(290,210,60,30);
JButton m=new JButton("SUBMIT");
ha.add(m);
m.setBounds(300,650,80,40);

JRadioButton r=new JRadioButton("male");
JRadioButton r1=new JRadioButton("female");
ha.add(r);
ha.add(r1);
r.setBounds(150,260,60,30);
r1.setBounds(230,260,80,30);
ButtonGroup v=new ButtonGroup();
v.add(r);
v.add(r1);

}

}