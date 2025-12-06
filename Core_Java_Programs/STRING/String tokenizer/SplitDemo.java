
class SplitDemo{
	 public static void main(String args[]) {

		 String s1 = "This is Java Class";

         String words[] = s1.split(" ");

         for(int i=0 ; i<words.length; i++)
          System.out.println(words[i]);

	}
}