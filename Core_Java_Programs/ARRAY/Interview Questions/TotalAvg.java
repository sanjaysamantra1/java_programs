class TotalAvg 
{
	public static void main(String[] args) 
	{
		int arr[]={22,43,35,41,36,38,25,39,28,27};
		int total=0;
		float  avg;
		for (int i=0;i<arr.length;i++)
		{
			total=arr[i]+total;
		}
		avg=(float)total/arr.length;
		System.out.println("sum is= "+total);
		System.out.println("Average is= "+avg);
	}
}
