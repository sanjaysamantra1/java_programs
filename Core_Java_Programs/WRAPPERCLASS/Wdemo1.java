class Wdemo1
{
	public static void main(String[] args)
	{
      int x=5;
	  Integer i1=x;    // auto boxing
      System.out.println(i1);

	  int i=i1;          //unboxing
	  i1=i1+1;

	  System.out.println("i= "+i1);
	}
}
