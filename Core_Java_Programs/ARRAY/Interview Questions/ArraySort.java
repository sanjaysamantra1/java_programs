class ArraySort
{
	public static void main(String[] args)
	{
		int a[]={30,10,50,60,20,80,70,40};

		System.out.println("before sort");
		for(int i:a)
   		  System.out.println(i);

		for(int i=0;i<a.length;i++)
		{
		  for(int j=i+1;j<a.length;j++)
		  {
			if(a[i]>a[j])
			{
			  int temp=a[i];
			  a[i]=a[j];
			  a[j]=temp;
			}
		  }
		}

		System.out.println("After sort");
		for(int i:a)
   		  System.out.println(i);


	}
}
