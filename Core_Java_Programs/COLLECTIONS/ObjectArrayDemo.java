
public class ObjectArrayDemo {

	public static void main(String args[])
	{
		Object [] ob = new Object [600];
		ob[0] = new Student();
		ob[1] = new Integer(10);
		ob[2] = "raju";
		System.out.println(ob[0]);
		System.out.println(ob[1]);
		System.out.println(ob[2]);
	}
}
