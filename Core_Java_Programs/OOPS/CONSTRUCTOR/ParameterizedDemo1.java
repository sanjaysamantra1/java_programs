class Student{
	int roll;
	String name;

	Student(int rl,String nm){
		roll = rl;
		name = nm;
	}

}
class ParameterizedDemo1{
	public static  void main(String args[])	{
		Student ob1 = new Student(101,"gautam");
		Student ob2 = new Student(102,"pavan");
		Student ob3 = new Student(103,"kajal");

		System.out.println(ob1.roll+"  "+ob1.name);
		System.out.println(ob3.roll+"  "+ob3.name);
		System.out.println(ob2.roll+"  "+ob2.name);
	}
}
