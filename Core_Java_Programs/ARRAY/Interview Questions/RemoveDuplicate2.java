class RemoveDuplicate2 
{
	public static void main(String[] args) 
	{
		int a[]={30,10,30,60,20,40,70,40};

		int size=a.length;
		
		System.out.println("before removing duplicates");
		for(int i:a)
   		  System.out.println(i);

	  for (int i = 0; i < size; i++)
      {
        for (int j = i + 1; j < size; j++)
         {

          if (a[i] == a[j])
           {
               while (j < (size) - 1)
               {
                a[j] = a[j + 1];// shifting the values
                j++;
               }
            size--;
            }
         }
      }

		System.out.println("After removing duplicates");
		for(int i=0;i<size;i++)
   		  System.out.println(a[i]);


	}
}
