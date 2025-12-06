class MaxTwo2
{
	public static void main(String[] args)
	{
		int[] a={10,70,60,30,65,50,40,45,32};
		int max1=0,max2=0;

		for(int i:a)
		{
		  if(i>max1)
		  {
			  //max2=max1;
			  max1=i;
          }
		  else if(i>max2)
		  {
			  max2=i;
		  }
		}

		System.out.println(max1);
		System.out.println(max2);
	}
}
