import java.util.*;

class GDemo1
{
	public static void main(String[] args)
	{
		ArrayList ob = new ArrayList();
		ob.add("hdfs");
		ob.add("hive");
		ob.add("pig");
		//ob.add(10);
		String val = ob.get(1);
		System.out.println(val);
	}
}


