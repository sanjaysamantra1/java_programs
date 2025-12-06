

class HashCodeDemo
{
	int i;

	HashCodeDemo(int i)
	{
		this.i=i;
	}
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return i+"";
	}


  public static void main(String args[])
  {
	HashCodeDemo ob=new HashCodeDemo(5);
	HashCodeDemo ob2=new HashCodeDemo(6);

   	System.out.println(ob);
   	System.out.println(ob2);
  }
}
