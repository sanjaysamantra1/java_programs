class Student{
   int rollno;
   String name;
   static String college ="DVS";
 void display (){
	 System.out.println(rollno+" "+name+" "+college);
	 }
}
class StaticDataMember
{
 public static void main(String args[])
 {
 Student s1 = new Student();
 Student s2 = new Student();
 s1.rollno=111;
 s1.name="PQR";

 s2.rollno=222;
 s2.name="XYZ";

 Student.college="Dvs Tech";

 s1.display();
 s2.display();
 }
}