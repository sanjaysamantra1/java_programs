
class Test_5
{
	public static void main(String[] args)
	{
		int a[]=new int[3];
		a[0]=10;
		a[1]=20;

		System.out.println(a[0]+"  "+a[1]+"  "+a[2]);

		System.out.println(a[10]);  // R.E
		System.out.println(a[-2]);  // R.E
		System.out.println(a[1.5]);   // C.E
	}
}
