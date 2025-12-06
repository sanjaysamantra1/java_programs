class A{
	int x=5,y=6;
	public String toString(){
			String s1="x= "+x+" y= "+y;
			return s1;
		}
}
class Tostring{
  public static void main(String args[])  {
	String str1=new String("java");
	A a1=new A();

	System.out.println(str1);
	System.out.println(a1);
  }
}