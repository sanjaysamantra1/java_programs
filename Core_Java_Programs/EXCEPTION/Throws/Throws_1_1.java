
class Throws_1_1{
	public static void main(String args[]){
		System.out.println("hello");

		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException ob)
		{
		}
		System.out.println("hi");
	}
}