class Literal
{

	public static void main(String[] args)
	{
		int x='\102';
		int y='\u0062';

		System.out.println("helloworld\rcome");
		System.out.println("hello\bworld");
		System.out.println("\'");
		System.out.println("\"");
		System.out.println("\\");
		System.out.println("helloworld\nwelcome");
		System.out.println("helloworld\twelcome");

		System.out.println(x);
		System.out.println(y);

	}
}
