import java.io.IOException;
class A {
  void disp() throws ArithmeticException{

        throw new ArithmeticException("THis is Arithmatic Exception");
  }
}

class throwsDemo1_2{
  public static void main(String args[]){
     A obj=new A();
     obj.disp();

  }
}