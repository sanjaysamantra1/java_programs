import java.io.*;

class ListAllFiles
{
	public static void main(String[] args) throws Exception
	{
		 File ob = new File("f:/programs/java_progs/file/file");

		 String[] allFiles = ob.list();

		 for(String ele : allFiles)
		 {
		 	System.out.println(ele);
		 	//File ob2 = new File(ele);
		 	//System.out.println(ob2.isDirectory());
		}

	}
}
