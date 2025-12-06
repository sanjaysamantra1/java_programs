// for character-oriented data
import java.io.*;
public class FileReaderDemo1
{
   public static void main(String args[]) throws IOException
   {
     FileReader ob = new FileReader("input.txt");

     int i;
     while((i=ob.read())!=-1)
     {
		 System.out.print((char)i);
	 }

   }
}