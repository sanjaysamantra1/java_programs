class  2D_Demo_1
{
  public static void main(String s1[])
  {
	  int x[][]=new int[3][2];

	  System.out.println(x);
	  System.out.println(x.length);

	  System.out.println(x[0]);
	  System.out.println(x[1]);
	  System.out.println(x[2]);

	 System.out.println(x[0].length);
	 System.out.println(x[1].length);
	 System.out.println(x[2].length);

	 x[1][1]=25;
	 x[2][0]=35;

	 System.out.println("display the values");
	 System.out.println(x[0][0]);
	 System.out.println(x[0][1]);

	 System.out.println(x[1][0]);
	 System.out.println(x[1][1]);

	 System.out.println(x[2][0]);
	 System.out.println(x[2][1]);

  }
}
