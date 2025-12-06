import java.io.*;

class MultipleCatch
{
	public static void main(String args[])
	{
		try
		{
		 throw new FileNotFoundException("FileNotFoundException");
		}
		catch (FileNotFoundException | IOException fnfo)
		{
		        fnfo.printStackTrace();
   	 	}
	}
}
