
import java.util.Scanner;

public class Count_Vowels
{
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

        String str;
        System.out.print("Enter a string or word: ");

        str = input.nextLine();
        countVowels(str);
	}
	public static int countVowels(String str)
	{
        int vowels = 0;
        for (int i = 0; i < str.length(); i++)
        {
                char ch = str.charAt(i);
                if (ch == 'A' || ch == 'E'|| ch == 'I'|| ch == 'O'||
                ch == 'U'|| ch == 'a'|| ch == 'e' || ch == 'i' ||  ch == 'o' || ch == 'u')
                {
                        vowels++;
                }
        }

        System.out.print("The number of vowels in your string is: "+vowels);
        return vowels;
	}
}
