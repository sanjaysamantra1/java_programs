import java.util.*;
import java.io.*;

public class MostOcuurance
{ 
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      PrintStream output = System.out;
      
      output.println("Enter a string:");
      String s = input.nextLine();
      int highestFreq = 0;
      char mostFreqChar = ' ';
      for (int i = 0; i < s.length(); i++)
      {
	      //Get a char and go through entire string to determine how many times that char occurs
	      char x = s.charAt(i);
	      int c = 0;
	      for (int j = s.indexOf(x); j != -1; j = s.indexOf(x, j + 1))
	      {
		      c++;
	      }
	      if (c > highestFreq)
	      {
		      highestFreq = c;
		      mostFreqChar = x;
	      }
      }
      output.println(mostFreqChar+" "+highestFreq);

  }
}