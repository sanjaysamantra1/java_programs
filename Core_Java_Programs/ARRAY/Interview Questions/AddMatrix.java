class AddMatrix
{
public static void main(String args[])
{
  int arr1[][]={{1,2},{3,4}};
  int arr2[][]={{5,6},{7,8}};
  int arr3[][]=new int[2][2];


  System.out.println("Matrix 1");
    for(int i=0;i<2;i++)
    {
      for(int j=0;j<2;j++)
       System.out.print(arr1[i][j]+"   ");

     System.out.println();
     }

     System.out.println("Matrix 2 ");
	     for(int i=0;i<2;i++)
	     {
	       for(int j=0;j<2;j++)
	        System.out.print(arr2[i][j]+"   ");

	      System.out.println();
       }

       System.out.println("After addition Matrix 3 ");
	       for(int i=0;i<2;i++)
	       {
	         for(int j=0;j<2;j++)
	          System.out.print(arr1[i][j]+arr2[i][j]+"   ");

	        System.out.println();
         }

 }
}