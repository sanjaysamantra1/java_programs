class Abc{
	int roll;
	String name;

	Abc(){
		roll=101;
		name="dvs";
	}
}
class NoArgConsDemo2
{
	public static  void main(String args[])
	{
		Abc ob1=new Abc();
		Abc ob2=new Abc();
		Abc ob3=new Abc();
		System.out.println(ob1.roll+"  "+ob1.name);
		System.out.println(ob2.roll+"  "+ob2.name);
		System.out.println(ob3.roll+"  "+ob3.name);
	}
}
