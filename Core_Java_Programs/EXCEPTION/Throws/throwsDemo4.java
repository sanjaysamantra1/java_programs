import java.io.IOException;

class A { 
  void disp() throws IOException{    
        throw new IOException("THis is IO Exception");
  } 
} 
class Test{ 
  public static void main(String args[]){   
     A ob=new A(); 
     ob.disp();
  }
}
D:\java progs>javac Abc.java
Abc.java:11: error: unreported exception IOException; must be caught or declared
 to be thrown
     ob.disp();
