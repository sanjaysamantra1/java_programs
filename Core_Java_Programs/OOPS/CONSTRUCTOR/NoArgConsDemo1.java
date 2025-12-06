class Abc{

	Abc(){
		System.out.println("i am constructor");
	}

	public static  void main(String args[])
	{
		Abc ob1 = new Abc();
		System.out.println("this is main");
		Abc ob2 = new Abc();
	}
}
