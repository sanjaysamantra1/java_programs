class Merge2Arrays {
	public static int[] mergeArrays(int[] a, int[] b) {

	    int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;

	    while (i < a.length && j < b.length)
	       answer[k++] = a[i] < b[j] ? a[i++] :  b[j++];

	    while (i < a.length)
	        answer[k++] = a[i++];


	    while (j < b.length)
	        answer[k++] = b[j++];

	    return answer;
}

	public static void main(String args[])
	{
		int arr1[] = { 1, 3, 4, 6, 7, 9 };
		int arr2[] = { 2, 4, 5, 7, 8 };

		int result[]=new int[20];
		result=mergeArrays(arr1, arr2);

		for(int i:result){
			System.out.println(i);
		}

	}
}