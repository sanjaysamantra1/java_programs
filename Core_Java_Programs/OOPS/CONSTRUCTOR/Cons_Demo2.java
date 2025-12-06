class Student{
	int roll;
	String name;

	public void setData(int x,String y)	{
		roll = x;
		name = y;
	}
}
class Cons_Demo2{
	public static  void main(String args[]){
		Student ob1=new Student();
		ob1.setData(101,"sachin");

		Student ob2=new Student();
		ob2.setData(102,"Rahul");

		System.out.println(ob1.roll+"  "+ob1.name);
		System.out.println(ob2.roll+"  "+ob2.name);

	}
}
