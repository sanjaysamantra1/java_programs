class splitDemo1{
  public static void main(String args[]) {

	String str = "this is java class";
	String arr[] = str.split(" ");
	//arr=["this","is","java","class"]

	System.out.println(arr.length);

	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
  }
}