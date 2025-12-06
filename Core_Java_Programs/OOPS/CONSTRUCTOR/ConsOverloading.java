class Student{
    int id;
    String name;
    int age;
    Student(int i,String n,int a){
	    id = i;
	    name = n;
	    age = a;
	}
	Student(int i,String n){
		    id = i;
		    name = n;
	}
    void display(){System.out.println(id+" "+name+" "+age);}
}
class ConsOverloading{
    public static void main(String args[]){
    Student s1 = new Student(111,"Karan",25);
    Student s2 = new Student(222,"Aryan");
    s1.display();
    s2.display();
   }
}






