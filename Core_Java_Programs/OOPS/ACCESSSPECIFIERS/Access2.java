class Access2 
{
	public static void main(String[] args) 
	{
		Access1 a1=new Access1();
		a1.x=5;
	//	a1.y=3;      (y is private in Access1)   
	//  a1.fun2();   (fun2() is private in Access1) 
		a1.fun1(); 

		Access2 a2=new Access2();
		System.out.println();
		System.out.println(a2.x);
	}
}
