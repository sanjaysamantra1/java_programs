// for character-oriented data
import java.io.*;
public class FileNotFoundExceptionDemo
{
   public static void main(String args[])
   {
     try{
     FileReader ob = new FileReader("f1.txt");

     int i;
     while((i=ob.read())!=-1)
     {
		 System.out.print((char)i);
	 }}
	 catch(FileNotFoundException ob)
	 {
	 }
	 catch(IOException ob)
	 	 {
	 }

   }
}