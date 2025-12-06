// ++ cann't be nested

class Demo2
{
 public static void main(String args[])
 {
	int x=4;
	int y=++(++x);
    System.out.println(y);

 }
}