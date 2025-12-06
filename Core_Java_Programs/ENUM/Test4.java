enum Day
{
 sunday,monday,tuesday,wednesday,thursday,friday,saturday;
}
class Test4 
{
	
	public static void main(String[] args) 
	{
		Day[] d=Day.values();

		for(Day i:d)
		System.out.println(i+"-"+i.ordinal());
	}
}
