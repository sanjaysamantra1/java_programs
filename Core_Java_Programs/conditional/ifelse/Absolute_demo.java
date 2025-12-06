class Absolute_demo
{
  public static void main(String args[])
  {
	int a = -5;	int b = 5;
	if(a<0 || b<0)
	{
		a = Math.abs(a);
		b = Math.abs(b);
	}
	System.out.println(a);
	System.out.println(b);
  }
}

