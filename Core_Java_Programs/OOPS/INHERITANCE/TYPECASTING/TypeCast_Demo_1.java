class Person{
	int a=5;
	int b=6;
	void disp(){
		System.out.println("disp from parent");
	}
	void disp2(){
			System.out.println("disp-2 from parent");
	}

}
class Employee extends Person{
	int a=7;
	int c=8;
	void disp(){
		System.out.println("disp from child");
	}
	void disp3()
	{
		System.out.println("disp-3 from child");
	}
}
class TypeCast_Demo_1{
	public static void main(String[] args){
		//Person p1 = new Person();

		Person p2 = new Employee();
		System.out.println(p2.a);
		System.out.println(p2.b);
		//System.out.println(p2.c);
		p2.disp();
		p2.disp2();
		//p2.disp3();
		System.out.println();

		//Employee e1 = new Person();
		Employee e2=(Employee)p2;
		System.out.println(e2);
		System.out.println(p2);

		System.out.println(e2.a);
		System.out.println(e2.b);
		System.out.println(e2.c);
		e2.disp();
		e2.disp2();
		e2.disp3();
	}

}