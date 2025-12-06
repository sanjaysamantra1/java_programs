// for character-oriented data
import java.io.*;
public class FileReaderDemo1
{
   public static void main(String args[]) throws IOException
   {
     FileReader ob = new FileReader("f1.txt");

     int i;
     int counter = 0;
     while((i=ob.read())!=-1)
     {
		 System.out.print((char)i);
		 counter++;
	 }
	 System.out.println(counter);

   }
}