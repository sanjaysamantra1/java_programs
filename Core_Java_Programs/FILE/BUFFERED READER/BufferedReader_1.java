// for character-oriented data with buffer
//Reades a line of code at once
//uses a Reader to Read

import java.io.*;
public class BufferedReader_1
{
   public static void main(String args[]) throws IOException
   {
		FileReader fr = new FileReader("f1.txt");
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();
		int counter=0;
		while(line != null)
		{
        	System.out.println(line);
        	line = br.readLine();
        	counter++;
        }
        System.out.println(counter);
       // System.out.println(br.readLine());

		br.close();
        fr.close();//fr.close() will close br also

   }
}