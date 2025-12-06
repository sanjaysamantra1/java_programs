class A{
	public static int x = 10;
	private static int y = 20;

	public static void f1(){
		System.out.println("this is f1");
	}
	private static void f2(){
			System.out.println("this is f2");
	}
}
class Public_Demo{
	private static int z = 30;

	public static void main(String args[]){

		System.out.println(A.x);
		//System.out.println(A.y);
		System.out.println(Public_Demo.z);

		A.f1();
		//A.f2();
	}
}




