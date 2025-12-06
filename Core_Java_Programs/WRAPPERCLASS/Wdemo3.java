/* recieving value from command line arguement
   as string & converting them to corresponding
   primitive data value */

class Wdemo3 
{
  void fun1(double p,float r,int t)
  {
	double si=(p*t*r)/100;
    double amt=p+si;
	System.out.println("Simple interest= "+si);
	System.out.println("Total Amount= "+amt);
  }
  public static void main(String[] args) 
  {
    Wdemo3 d3=new Wdemo3();
	double p=Double.parseDouble(args[0].trim());
  	float r=Float.parseFloat(args[1].trim());
	int t=Integer.parseInt(args[2].trim());
	d3.fun1(p,r,t);
  }
}



/* javac Wdemo3.java
   java Wdemo3 10000 4.5 2  */
