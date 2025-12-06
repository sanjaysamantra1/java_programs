class Employee{
	Employee(){
		System.out.println("This is Constructor");
	}
	int Employee(){
		System.out.println("This is Method");
		return 0;
	}
}
class DefaultConsDemo2{
	public static  void main(String args[])	{
		Employee ob1 = new Employee();
		ob1.Employee();
	}
}
