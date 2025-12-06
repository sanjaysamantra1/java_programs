class CmdDemo_2
{
  public static void main(String[] args)
  {
	System.out.println(args);  //args is obj of array  of strings

    System.out.println("Length of args is: "+args.length);

	for(int i=0;i<args.length;i++)
	{
      System.out.println(args[i]);
	}
	System.out.println("End of main()");
  }
}

/*
javac CmdDemo1.java
java CmdDemo1 101 john 5000 manager   */