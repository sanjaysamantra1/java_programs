class Employee{
	int eId;
	String name;
	int sal;

	public  Employee(int a,String b,int c){
		eId = a;
		name = b;
		sal = c;
	}

	public static void main(String[] args){
		Employee ob1 = new Employee(111,"sarath",5000);
		//ob1.setData(111,"sarath",5000);

		Employee ob2 = new Employee(222,"srinivas",6000);
		//ob2.setData(222,"srinivas",6000);

		System.out.println(ob1.eId+"  "+ob1.name+" "+ob1.sal);
		System.out.println(ob2.eId+"  "+ob2.name+" "+ob2.sal);
	}
}
