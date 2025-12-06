import java.io.*;

class Demo_1
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("abc.doc");

		System.out.println(f.exists());

		f.createNewFile();

		System.out.println(f.exists());

	}
}
