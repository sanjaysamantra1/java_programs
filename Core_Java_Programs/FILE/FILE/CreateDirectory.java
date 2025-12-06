import java.io.*;

class CreateDirectory
{
	public static void main(String[] args)
	{
		File f=new File("sanjay");
		System.out.println(f.exists());

		f.mkdir();
		System.out.println(f.exists());
	}
}
