// for character-oriented data
import java.io.*;

public class FileWriterDemo1
{
   public static void main(String args[]) throws IOException
   {
	 //FileWriter ob = new FileWriter("f1.txt");//overwrite

	 FileWriter ob = new FileWriter("f2.txt",true);//append
	 ob.write("Helloooooooooooooooo");
	 ob.close();

	 //ob.write("After close");
   }
}