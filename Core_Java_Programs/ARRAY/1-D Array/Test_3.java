class Test_3
{
	public static void main(String[] args)
	{
		int a[]=new int[10];
		int b[]=new int[0];

		int c[]=new int[];  // C.E Array Dimension Missing

		int d[]=new int[-1]; // R.E negativearraysizeException

		int e[]=new int[4.5]; //C.E incompatible types

		int f[]=new int[true]; //C.E incompatible types
	}
}
