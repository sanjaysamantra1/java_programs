class SumNearestZero
{
	public static void main(String[] args) {
		int[] a={-100,-90,77,88,25};
		int res=1000;
		int n1=0;
		int n2=0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length;j++) {
				if(a[i]!=a[j]){
					Integer value=a[i]+a[j];
					int modValue=Integer.parseInt(value.toString().replace("-",""));
				 if(res>modValue){
					 res=modValue;
					 n1=a[i];
					 n2=a[j];
				 }
				}
			
			}
		}
		System.out.println(res+"  "+n1+"  "+n2);
	}
}