class Student{
	int roll;
	String name;

	public Student(int roll,String name)
	{
		this.roll = roll;
		this.name = name;
	}
}
class Cons_Demo_0{

	public static  void main(String args[])
	{
		Student ob1 = new Student(1,"aaa");
		//ob1.setData(1,"aaa");
        Student ob2 = new Student(2,"bbb");
        //ob2.setData(2,"bbb");

        System.out.println(ob1.roll+" "+ob1.name);
        System.out.println(ob2.roll+" "+ob2.name);
	}
}
