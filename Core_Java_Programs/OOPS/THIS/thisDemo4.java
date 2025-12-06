class Student{
	int roll;
	String name;
	int mark;
	String add;

	Student(int roll,String name,int mark){
		this.roll = roll;
		this.name = name;
		this.mark = mark;
	}
	Student(int roll,String name,int mark,String add){
		//this.roll = roll;
		//this.name = name;
		//this.mark = mark;
		this(roll,name,mark);
		this.add = add;
	}
	void display(){
	   	System.out.println(roll+" "+name+"  "+mark+"  "+add);
   	}
}
class thisDemo4
{
    public static void main(String args[])
    {
    Student s1 = new Student(111,"sachin",45);
    Student s2 = new Student(222,"Karan",92,"bangalore");
    s1.display();
    s2.display();
    }
}
