//bitwise operator

class BitwiseOperator
{
  public static void main(String args[])
  {
    byte x=10; // 0000 1010
    byte y=12; // 0000 1100

    System.out.println("~x= "+(~x)); //Complement
    System.out.println("x&y= "+(x&y)); //AND
    System.out.println("x|y= "+(x|y)); //OR
    System.out.println("x^y= "+(x^y));  //XOR

  }
}