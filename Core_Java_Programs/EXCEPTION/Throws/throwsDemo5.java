import java.io.IOException;
// main() handles the exception
class A { 
  void disp() throws IOException{    
        throw new IOException("THis is IO Exception");
  } 
} 
class Test{ 
  public static void main(String args[]){ 
   try{ 
     A obj=new A(); 
     obj.disp(); 
   }catch(IOException ob){
     System.out.println(ob);
    } 
  }
