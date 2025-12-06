class Test2 
{
  public static void main(String args[]) 
  {
    String s1[]={"abc","xyz","ijk"};
	Ademo2.fun1(s1);
	System.out.println();
	Ademo2.main(s1);
	Ademo2.main(null);
    System.out.println("*** end of Test2 ***");
  }
}

/* we are calling main() of Ademo2 class by passing 
   object of array of strings as a static function */