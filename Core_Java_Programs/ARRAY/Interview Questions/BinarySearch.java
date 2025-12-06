import java.util.Scanner;

class BinarySearch 
{
  public void search()
  {
  int a[]={4,12,5,8,11,9,10,14,13,15};
  Scanner s=new Scanner(System.in);
  int count=0,n,l,u,m=0;

   System.out.println("enter element to search");
   n=s.nextInt();
   
    l=0;
	u=a.length;
	while(l<=u)
	{
	 m=(l+u)/2;
     if(n>a[m])
	  l=m+1;
	 else if(n<a[m])
	   u=m-1;
	  else
	  {
       count=1;
	   break;
	  }
    }
    
	if(count==1)
	  System.out.println(n+" is present at position: "+(m+1));
     else
      System.out.println(n+"element not found");
    }
  
   public static void main(String[] args) 
	{
	   BinarySearch bs=new BinarySearch();
	   bs.search();
	}
}
