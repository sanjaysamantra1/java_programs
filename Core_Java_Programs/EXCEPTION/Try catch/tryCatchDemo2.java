class tryCatchDemo2{
  public static void main(String args[]){
	  int a[]={10,20,30,40};
	  try
	  {
	  System.out.println(a[1]);
	  System.out.println(a[5]);
	  }
	  catch(ArrayIndexOutOfBoundsException ob)//OR catch(Exception ob)
	  {
		  System.out.println(ob);
		 // ob.printStackTrace(); (OR)
	  }
	  System.out.println("rest of the code");
  }
}