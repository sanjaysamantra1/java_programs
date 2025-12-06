import java.util.Scanner;

class LinearSearch 
{
  int a[]={4,12,5,8,11,9,10,14,13,15};
  Scanner s=new Scanner(System.in);
  int count=0,n,i;

  public void search()
  {
   System.out.println("enter element to search");
   n=s.nextInt();

	for(i=0;i<10;i++)
	{
     if(a[i]==n)
	 {
       count=1;
	   break;
	 }
    }
	if(count==1)
	  System.out.println(n+" is present at position: "+(i+1));
     else
      System.out.println(n+"element not found");
    }
  
   public static void main(String[] args) 
	{
	   LinearSearch ls=new LinearSearch();
	   ls.search();
	}
}
