import java.io.IOException;

class throwsDemo1
{
  public static void main(String args[])throws IOException,InterruptedException
  {
	A obj = new A();
	obj.disp(4);

	Thread.sleep(500);

  }
}