class Demo2
{
public static void main(String arg[])
{
  int a = '#';  int x = 20,y=10;

  switch(a)
  {
    case '+':
        System.out.println(x+y);
        break;
    case '-':
	    System.out.println(x-y);
        break;
    case '*':
	    System.out.println(x*y);
        break;
    default: //otherwise
       System.out.println("Not a valid operator");
       break;
     }
  }
}






