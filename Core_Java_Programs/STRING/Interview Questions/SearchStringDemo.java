public class SearchStringDemo
	{

   public static void main(String[] args) {
      String str = "i am a student";
      int intIndex = str.indexOf("am");
      if(intIndex == - 1){
         System.out.println("am not found");
      }else{
         System.out.println("Found am at index "
         + intIndex);
      }
   }
}