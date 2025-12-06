class Ternary2
{
	int getValue()
	{
		return(true?null:0);
	}
	public final static void main(String args[])
	{
		Ternary2 ob=new Ternary2();
		int x=ob.getValue();
		System.out.println(x);
	}
}