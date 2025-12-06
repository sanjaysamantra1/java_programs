class Emp
{
   int eId;
   String name;
   int sal;

   public static void main(String args[])
   {
	   Emp ob1 = new Emp();
	   ob1.eId = 101;
	   ob1.name = "sanjay";
	   ob1.sal = 5000;

	   Emp ob2 = new Emp();
	   ob2.eId = 102;
	   ob2.name = "sarath";
	   ob2.sal = 6000;

	   Emp ob3 = new Emp();
	   ob3.eId = 103;
	   ob3.name = "srinivas";
	   ob3.sal = 7000;

	   System.out.println(ob1.eId+" "+ob1.name+" "+ob1.sal);
   }
}
