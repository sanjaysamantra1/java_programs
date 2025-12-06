import java.io.*;

class DeleteFile
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("abc.txt");
		System.out.println(f.exists());

		f.delete();
		System.out.println(f.exists());
	}
}
