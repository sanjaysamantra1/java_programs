//File Class Constructors
import java.io.*;
class Demo_3
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("abc");
		f.mkdir();

		File f1 = new File("dvs");
		f1.mkdir();

		File f2 = new File("abc","f1.doc");//abc folder should be there
		f2.createNewFile();

		File f3 = new File(f1,"f2.txt");
		f3.createNewFile();

	}
}



