import java.io.IOException;

class A {
  void disp() throws IOException,ClassNotFoundException{
     if(5==6)
        throw new IOException("THis is IO Exception");
	 else
		throw new ClassNotFoundException("THis is Class not found Exception");
  }
}

class throwsDemo2{
  public static void main(String args[])throws IOException,ClassNotFoundException{

     A obj=new A();
     obj.disp();

  }
}