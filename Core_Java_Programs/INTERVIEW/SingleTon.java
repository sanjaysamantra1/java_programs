class SingleTon
{
	private static SingleTon obj=new SingleTon();

	private SingleTon()
	{
	}

	public static SingleTon getInstance()
	{
		return obj;
	}
	public void display(){
		System.out.println("i am display method");
	}

	public static void main(String[] args)
	{
		SingleTon st1=SingleTon.getInstance();
		st1.display();
		SingleTon st2=SingleTon.getInstance();
		SingleTon st3=SingleTon.getInstance();

		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
	}
}
