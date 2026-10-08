import java.io.*;

class Student implements Serializable{
	 int id;
	 String name;

	 public Student(int id, String name) {
		  this.id = id;
		  this.name = name;
	 }

     public Student(String string) {
        //TODO Auto-generated constructor stub
     }
}