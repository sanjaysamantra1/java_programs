import java.io.*;

class FileReaderDemo
{
	 public static void main(String args[])throws Exception
	 {
        FileReader f = new FileReader("f.txt");

        int i;

        while( (i=f.read()) != -1)
        {
			System.out.print((char)i);
		}
	 }
}