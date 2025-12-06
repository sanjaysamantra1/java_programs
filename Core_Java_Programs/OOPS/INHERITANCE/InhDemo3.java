class Person{
	int a=5;
	//int d=5;
	void disp(){
		System.out.println("disp from parent");
	}
	void disp3(){
			System.out.println("disp-3 from parent");
	}

}
class Employee extends Person{
	int a=6;
	int c=8;
	void disp(){
		System.out.println("disp from child");
	}
	void disp2()
	{
		System.out.println("disp-2 from child");
	}
}
class ITEmp extends Employee
{

}
class InhDemo3
{
	public static void main(String[] args){
		Person p1=new Person();/*
		System.out.println(p1.a);
		p1.disp();

		Employee e1=new Employee();
		System.out.println(e1.a);
		e1.disp();*/

		//Employee e2=new Person();
		Person p2=new Employee();
		System.out.println(p2.a);
		//System.out.println(p2.c);
		p2.disp();
		p2.disp3();
		//System.out.println(p2.d);
		//p2.disp3();

		Person sjk=new ITEmp();
		sjk.disp();

		Employee e2=(Employee)p2;
		System.out.println(e2);
		System.out.println(p2);
		//System.out.println(e2.d);
		System.out.println(e2.c);
		e2.disp2();
		e2.disp3();
	}

}