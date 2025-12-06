class Employee{
	int eId;
	String name;
	int sal;
	Employee(int eId,String name,int sal){
		this.eId = eId;
		this.name = name;
		this.sal = sal;
	}
	public void disp()	{
		System.out.println(eId+"  "+name+" "+sal);
	}
}

class thisDemo1{
	public static void main(String args[]){
		Employee ob1 = new Employee(111,"Sarath",5000);
		Employee ob2 = new Employee(222,"srinivas",6000);

		ob1.disp();
		ob2.disp();
	}
}