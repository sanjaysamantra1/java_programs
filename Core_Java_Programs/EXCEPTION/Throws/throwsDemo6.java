import java.io.IOException;
// main() doesnt handle the exception rather delegates that to
// caller(JVM)
class A {
  void disp() throws IOException{
        throw new IOException("This is IO Exception");
  }
}
class throwsDemo6{
  public static void main(String args[]) throws IOException{
     A obj=new A();
     obj.disp();
  }
}