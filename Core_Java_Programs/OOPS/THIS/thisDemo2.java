class Student
{
	int roll;
	String name;
	String add;

	Student(int roll,String name,String ad)	{
		roll = roll;
		name = name;
		add = ad;
		//System.out.println(roll+" "+name+"  "+add);
	}
	void display(){
	   	System.out.println(roll+" "+name+"  "+add);
   	}
}
class thisDemo2
{
    public static void main(String args[])
    {
    Student s1 = new Student(111,"Karan","bangalore");
    Student s2 = new Student(321,"Aryan","chennai");
    s1.display();
    s2.display();
    }
}
