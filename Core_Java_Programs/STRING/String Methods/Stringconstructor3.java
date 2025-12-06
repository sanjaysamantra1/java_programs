class Stringconstructor3
{
  public static void main(String args[])
  {
    byte arr[]={65,66,67,68,69,70,71,72};
    String str=new String(arr,0,5);
    System.out.println(str);
  }
}