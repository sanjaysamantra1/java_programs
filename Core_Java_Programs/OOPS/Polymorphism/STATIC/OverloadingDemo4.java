public class OverloadingDemo4 {

	public void add(int a,int b){
		System.out.println(a+b);
	}
	public void add(float a,float b){
		System.out.println(a+b);
	}
	public void add(int a,int b,int c){
		System.out.println(a+b+c);
	}
	public void add(int a,float b){
		System.out.println(a+b);
	}
	public void add(float a,int b){
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		OverloadingDemo4 ob=new OverloadingDemo4();
		ob.add(4,2,7);
		//ob.add(4.3, 2.5); //C.E required-float found-double
		ob.add(4.3f, 2.5f);
		ob.add(8,3);
		ob.add(2,3.4f);
		ob.add(2.5f,6);
	}
}
