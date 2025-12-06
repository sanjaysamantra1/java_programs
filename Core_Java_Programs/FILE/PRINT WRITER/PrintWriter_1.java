// for character-oriented data
//writes any thing to the file(char,string,int,float)
//uses a writer to write

import java.io.*;

public class PrintWriter_1
{
   public static void main(String args[]) throws IOException
   {
		FileWriter fw = new FileWriter("f2.txt");
		PrintWriter pw = new PrintWriter(fw);

		pw.write("Hi!... Good Morning");
		pw.println(" Hello Java");
		int a = 10;
		double b = 4.5;
		pw.println(a);
		pw.println(b);
		pw.println(true);

		pw.close();

   }
}