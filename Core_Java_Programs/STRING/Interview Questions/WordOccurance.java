public class WordOccurance
{
  public static void main(String[] args)
  {
    String input="hjh hhjh hjhkjhj ishjh is";
    int index = input.indexOf("is");
	int count = 0;
    System.out.println(index);

	while (index != -1) //if not exists then -1
	{
    	count++;
    	input = input.substring(index + 1);
    	index = input.indexOf("is");
    }
	System.out.println("No of 'is' in the input is : " + count);
  }
}