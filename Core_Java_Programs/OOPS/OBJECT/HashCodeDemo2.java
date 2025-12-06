

class HashCodeDemo2
{
  public static void main(String args[])
  {
	HashCodeDemo2 ob=new HashCodeDemo2();

   	System.out.println(ob);
   	System.out.println(ob.hashCode());
  }
}

// getClass.getName() + '@' + Integer.toHexString(HashCode);