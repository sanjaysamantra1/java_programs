// Generics are not compatible with primitives in declarationsc

lass GTest3{
	public static void main(String[] args)
	{
		final List<int> ids = new ArrayList<>();    //Not allowed
		final List<Integer> ids = new ArrayList<>(); //Allowed
	}
}