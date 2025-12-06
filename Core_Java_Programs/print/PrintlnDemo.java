class PrintlnDemo
{
	public static void main(String[] args)
	{
		System.out.println("hello println");
		System.out.println(Test.s.length());
	}
}
class Test
{
	static String s="java";
}

// 'System' is a class in java.lang
// 'out' is a static variable of type 'PrintStream' present in 'System' class
// println() is a method 

// Test is a class 
// 's' is a static variable of type String present in 'Test' class
// length() is a method in 'String' class

/*
class System
{
	static PrintStream out;
}
*/

