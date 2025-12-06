import java.io.*;
import java.io.Serializable;

class Demo_1
{
 public static void main(String args[])throws Exception{
	  Student s1 = new Student(111,"ravi");

	  FileOutputStream fout = new FileOutputStream("f.txt");
	  ObjectOutputStream out = new ObjectOutputStream(fout);

	  out.writeObject(s1);
	  out.flush();
	  System.out.println("success");
  }
}
