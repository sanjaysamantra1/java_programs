class Abc{
	int x = 5;
	int y = 6;
	public String toString()
	{
		return "x: "+x+" y: "+y;
	}
}
public class Overriding_2 {
	public static void main(String[] args) {
		Abc ob = new Abc();
		System.out.println(ob);
		System.out.println(ob.toString());

		String ob2 = new String("sachin");
		System.out.println(ob2);
	}

}
