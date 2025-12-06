class Student
{
	int roll;
	String name;
	String add;

	Student(int roll,String name,String add)	{
		this.roll = roll;
		this.name = name;
		this.add = add;
	}
	void display(){
	   	System.out.println(roll+" "+name+"  "+add);
   	}
}
class thisDemo2_1
{
    public static void main(String args[])
    {
    Student s1 = new Student(111,"Karan","bangalore");
    Student s2 = new Student(321,"Aryan","chennai");
    s1.display();
    s2.display();
    }
}
