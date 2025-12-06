//File object can represent Directory as well

import java.io.*;

class Demo_2
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("abc2");
		System.out.println(f.exists());

		f.mkdir();
		System.out.println(f.exists());
	}
}
