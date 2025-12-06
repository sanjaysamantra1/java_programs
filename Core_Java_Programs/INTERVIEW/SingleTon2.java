class SingleTon2
{
	private static SingleTon2 obj;

	private SingleTon2()
	{
	}

	public static SingleTon2 getInstance()
	{
		if(obj==null)
			obj=new SingleTon2();
		return obj;
	}
	public void display(){
		System.out.println("i am display method");
	}

	public static void main(String[] args)
	{
		SingleTon2 st1=SingleTon2.getInstance();
		st1.display();
		SingleTon2 st2=SingleTon2.getInstance();
		SingleTon2 st3=SingleTon2.getInstance();

		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
	}
}
