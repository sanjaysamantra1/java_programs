//1. all the method names should be same
//2. either no of arg or type of arg should differ

public class OverloadingDemo1
{
	public void add(int a,int b){
		System.out.println("first");
	}
	public void add(int a,int b,int c){
		System.out.println("second");
	}
	public void add(float a, float b){
		System.out.println("third");
	}
	public static void main(String[] args) {
		OverloadingDemo1 ob = new OverloadingDemo1();
		ob.add(2,3);
		ob.add(2.4f,4.5f);
		ob.add(2,5,3);
	}

}







