class typeCastingDemo1
{
	public static void main(String[] args)
	{
		double a = 5;
		System.out.println(a); // Implicit typecasting

		char b = 65; 		//ASCII value for 65 is 'A'
		System.out.println(b);  // Implicit typecasting

		int c = (int)4.5;
		System.out.println(c); // Explicit typecasting
	}
}
/*typecasting = converting value of one datatype to another datatype

1. implicit (Automatic/widening) (storing a lower value in higher datatype variable)
2. Explicit (Manual/narrowing);  (storing a higher value in a lower datatype variable)

*/
