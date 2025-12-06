import java.io.*;

class LongestWord
{
  public static void main(String args[])throws Exception
  {
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String s,s1;
    System.out.print("Enter a string: ");
	s=br.readLine();

    s1=s.trim();
    int x=s1.length();
    s1=s1+"";
    int m=0,p=0;
    String t,max="";
    for(int i=0;i<=x;i++)
    {
		if(s1.charAt(i)==32)
		{
			t=s1.substring(p,i);
			if(t.length()>m)
			{
				max=t;
				m=t.length();
		   }
		   p=i+1;
     }
 }
 System.out.println("longest word="+max);
 System.out.println("longest word length="+m);
}
}



