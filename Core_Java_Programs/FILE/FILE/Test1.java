import java.io.*;

class Test1
{
	public static void main(String[] args) throws Exception
	{
		File dir=new File("dir");
		dir.mkdir();

		File f1=new File(dir,"f1.txt");
		f1.createNewFile();

		File newDir=new File("newDir");
		dir.renameTo(newDir);
	}
}
