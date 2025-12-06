class ArrayCommonElements {
	public static void printCommonElements(int arr1[], int arr2[])
	{

		int i=0,j=0;

		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				i++;

			}
			else if(arr2[j]<arr1[i])
			{

				j++;
			}
			else
			{
				System.out.println(arr1[i]);
				i++;

			}

		}

	}

	public static void main(String args[])
	{
		int arr1[] = { 1, 3, 4, 6, 7, 9 };
		int arr2[] = { 2, 4, 5, 7, 8 };

		printCommonElements(arr1, arr2);

	}
}