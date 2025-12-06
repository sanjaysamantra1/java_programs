class Add{

	 public static void sum1(int x, int y)
	 {
		 System.out.println(x+y);
	 }
	 public static int sum2(int x, int y)
	 {
		 return x+y;
	 }

}

class Void_Demo
{
	public static void main(String args[])
	{
		Add.sum1(2,3);
		int result = Add.sum2(3,4);
		System.out.println(result);
	}
}




















