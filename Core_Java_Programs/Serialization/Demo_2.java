import java.io.*;

class Demo_2
{
 public static void main(String args[])throws Exception
 {
	  FileInputStream fis = new FileInputStream("f.txt");
	  ObjectInputStream ois = new ObjectInputStream(fis);

	  Student s = (Student)ois.readObject();
	  System.out.println(s.id+" "+s.name);

	  ois.close();
 }
}