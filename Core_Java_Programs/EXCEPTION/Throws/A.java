import java.io.IOException;
class A
{
	public void disp(int age)throws IOException
	{
		if(age<0)
			throw new IOException();
		else
			System.out.println("okkkk");
	}
}