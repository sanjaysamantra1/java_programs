class cmdDemo_1
{

/*
  public static void f1(String a, String b)
  {
	  System.out.println(a+"  "+b);
  }
  public static void f2(String a, String b,String c)
    {
  	  System.out.println(a+"  "+b+" "+c);
  }
  */
  public static void f1(String a[])
  {
	  System.out.println(a.length);
  }
  public static void main(String[] args)
  {
		String arr1[] = {"c","c++"};
		String arr2[] = {"c","c++","java"};

		f1(arr1);
		f1(arr2);
  }
}

