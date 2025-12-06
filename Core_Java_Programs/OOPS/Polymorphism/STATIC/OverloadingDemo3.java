class OverloadingDemo3 {
	public void add(int a,int b){

	}
	public int add(int x,int y){
		return 5;
	}
	public static void main(String[] args) {
		OverloadingDemo3 ob = new OverloadingDemo3();
		ob.add(5, 6);

	}
}
