class Student{
	int roll;
	String name;

	Student(int x,String y){
		roll=x;
		name=y;
	}
}


class Cons_Demo3{

	public static  void main(String args[])
	{
		Student ob1=new Student(101,"Sachin");
		Student ob2=new Student(102,"Rahul");

		System.out.println(ob1.roll+"  "+ob1.name);
		System.out.println(ob2.roll+"  "+ob2.name);

	}
}
