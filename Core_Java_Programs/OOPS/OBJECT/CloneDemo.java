
class CloneDemo implements Cloneable
{
	int i=10;
	int j=20;

	public static void main(String args[]) throws Exception
	{
		CloneDemo ob1=new CloneDemo();
		CloneDemo ob2=(CloneDemo)ob1.clone();

		System.out.println(ob1.i+"  "+ob1.j);
		System.out.println(ob2.i+"  "+ob2.j);

		ob1.i=100;
		ob1.j=200;

		System.out.println();
		System.out.println(ob1.i+"  "+ob1.j);
		System.out.println(ob2.i+"  "+ob2.j);


	}
}

