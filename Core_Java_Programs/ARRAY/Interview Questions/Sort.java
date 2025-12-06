class Sort
{
public static void main(String args[])
{
  int arr[]={20,100,80,40,30,50,70,60,10,90};
  int temp=0;

  System.out.println("Before sort");
  for(int x=0;x<10;x++)
    System.out.println(arr[x]+"  ");

    for(int i=0;i<10;i++)
    {
      for(int j=0;j<9;j++) //for(int j=0;j<9-i;j++)
      {
         if(arr[j] > arr[j+1])
         {
           temp=arr[j];
           arr[j]=arr[j+1];
           arr[j+1]=temp;
          }
        }
     }
   System.out.println("After sort");
  for(int x=0;x<10;x++)
    System.out.println(arr[x]+"  ");
 }
}