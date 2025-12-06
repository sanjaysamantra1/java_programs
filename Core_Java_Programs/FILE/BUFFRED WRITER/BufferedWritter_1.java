// for character-oriented data with buffer
//writes a line of code at once
//uses a writer to write

import java.io.*;
public class BufferedWritter_1
{
   public static void main(String args[]) throws IOException
   {
		FileWriter writer = new FileWriter("f1.txt");

		BufferedWriter buffer = new BufferedWriter(writer);

		buffer.write("Hi!...Good Morning");
		buffer.newLine();
		buffer.write("Thank\tyou!... 5 ");

		double x = 5.4;
		//buffer.write(x);
		//buffer.write(false);

    	buffer.close();

   }
}