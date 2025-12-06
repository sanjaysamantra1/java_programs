class A
{
	int i,j;

	void funA()
	{
		i=i+1;
		j=j+1;
	  System.out.println("funA() of class A");
    }
}
class Odemo2
{
	public static void main(String[] args)
	{
		A a1=new A();
		a1.i=5;
		a1=new A();
		System.out.println(a1.i);
	}
}
