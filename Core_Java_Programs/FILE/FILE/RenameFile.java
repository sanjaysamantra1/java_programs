import java.io.*;

class RenameFile
{
	public static void main(String[] args) throws Exception
	{
		File ob=new File("hari.txt");
		ob.createNewFile();
		System.out.println(ob.getName()); // hari.txt

		File ob2=new File("Shiva.txt");
		ob.renameTo(ob2);
		System.out.println(ob2.getName()); //shiva.txt
		System.out.println(ob.getName());
		ob2.createNewFile();
	}
}
