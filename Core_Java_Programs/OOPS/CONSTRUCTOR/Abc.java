class Abc{
	int x ;
	int y ;

	public  Abc(int a,int b){
		x = a;
		y = b;
	}

	public static void main(String[] args){
		Abc ob1 = new Abc(5,6);
		//ob1.setData(5,6);

		Abc ob2 = new Abc(15,16);
		//ob2.setData(15,16);

		System.out.println(ob1.x+" "+ob1.y);
		System.out.println(ob2.x+" "+ob2.y);
	}
}
