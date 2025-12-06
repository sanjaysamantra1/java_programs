import java.util.*;

class  Demo_3_1
{
  public static void main(String s1[])
  {
	String cars[] = {"Tata","Maruti","Honda","Toyota","Hundai"};

	for(String car:cars)
	 System.out.print(car+"  ");

	Arrays.sort(cars);

	System.out.println();

	for(String car:cars)
	 System.out.print(car+"  ");
  }
}
