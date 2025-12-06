class  For_Each_Demo_1
{
  public static void main(String s1[])
  {
     int marks[] = {10,20,30,40,50};

     System.out.println("using For loop \n");

     for(int i=0;i<marks.length;i++)
      System.out.print(marks[i]+"   ");

     System.out.println("\n using For each loop \n");

     for(int x : marks)
      System.out.print(x+"  ");

  }
}
