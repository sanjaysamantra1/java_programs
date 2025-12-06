interface A
{
	int x=5;
	public static void disp(){
		System.out.println("This is Disp");
	}
}
class B implements A 
{		
	public static void main(String args[])
	{		
		A.disp();
	}
}