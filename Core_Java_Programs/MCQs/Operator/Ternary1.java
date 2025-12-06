class Ternary1
{
	int getValue()
	{
		return(true?1:0);
	}
	public final static void main(String args[])
	{
		Ternary1 ob=new Ternary1();
		int x=ob.getValue();
		System.out.println(x);
	}
}