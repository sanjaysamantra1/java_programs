class IndexOutOfBoundsDemo_2
{
	public static void main(String[] args)
	{
		int[] arr = {10,20,30,40,50};
		try{
			System.out.println(arr[1]);
			System.out.println(arr[8]);
		}
		catch(ArrayIndexOutOfBoundsException ob)
		{
			//System.out.println("wrong index");
			System.out.println(ob.getMessage());
			System.out.println(ob);
			ob.printStackTrace();
		}
		System.out.println("Rest statements");
    }
}