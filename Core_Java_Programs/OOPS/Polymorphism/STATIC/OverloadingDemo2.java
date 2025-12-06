public class OverloadingDemo2 {

	public void add(int a,int b){

	}
	public int add(int x,int y){
		return 5;
	}
	public static void main(String[] args) {
		OverloadingDemo2 ob=new OverloadingDemo2();
		ob.add(5, 6);

	}

}
