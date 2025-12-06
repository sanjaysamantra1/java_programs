class Void_Demo
{
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public int sum(int a,int b)
	{
			int c=a+b;
			return c;
	}
   static public void main(String args[])
	{
		Void_Demo ob=new Void_Demo();
		ob.add(3,4);
		int res=ob.sum(4,5);
		System.out.println(res);

		int max=Math.max(12,15);
		System.out.println(max);
	}
}