class AllPossibleStrings
{
   public static void main(String args[])
   {
      String str="sanjay";
      int c,i;
      int length=str.length();

      System.out.println("Substrings of \""+str+"\" are :-");

      for( c = 0 ; c < length ; c++ )
      {
         for( i = 1 ; i <= length - c ; i++ )
         {
            String sub = str.substring(c, c+i);
            System.out.println(sub);
         }
      }
   }
}