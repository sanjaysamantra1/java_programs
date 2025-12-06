class Emp{
	int eId;
	String name;
	int sal;

	public Emp(int a,String b,int c) //constructor
	{
		eId = a;
		name = b;
		sal = c;
	}

	public static void main(String args[])
	{
		//class obj = new Constructor();
		Emp e1 = new Emp(111,"Sarath",5000);
		//e1.Emp1(111,"Sarath",5000);
		Emp e2 = new Emp(222,"ramana",6000);
		//e2.Emp1(222,"ramana",6000);
		Emp e3 = new Emp(333,"Sharan",7000);
		//e3.Emp1(333,"Sharan",7000);

		System.out.println(e1.eId+" "+e1.name+" "+e1.sal);
		System.out.println(e2.eId+" "+e2.name+" "+e2.sal);
		System.out.println(e3.eId+" "+e3.name+" "+e3.sal);
	}
 }

//1. should we initialize inside the class itself while declaring?
//2. create a method to initialize them.
    //for every object we need to call setData()
  //3. constructor