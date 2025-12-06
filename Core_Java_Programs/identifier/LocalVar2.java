// except final no other modifier can be used with local var

class LocalVar2
{
	public static void main(String[] args) 
	{
		final int x=10;
		//public int x=10; C.E
		//static int x=10; C.E
	}
}
