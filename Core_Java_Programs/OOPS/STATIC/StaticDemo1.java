// static property is shared to all objects. it saves memory
// college refers to the common property of all objects

class StaticDemo1{
   int rollno;
   String name;
   static String college ="DVS";

   StaticDemo1(int r,String n){
	   rollno = r;
	   name = n;
   }
 void display (){
	 System.out.println(rollno+" "+name+" "+college);}

 public static void main(String args[]){
 StaticDemo1 s1 = new StaticDemo1(111,"Karan");
 StaticDemo1 s2 = new StaticDemo1(222,"Aryan");

 s1.display();
 s2.display();
 }
}
