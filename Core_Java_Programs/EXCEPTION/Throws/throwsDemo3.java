import java.io.IOException;

class A { 
  void disp() throws Exception{// no need of individual exception 
     if(5==6)  
        throw new IOException("THis is IO Exception");
	 else
		throw new ClassNotFoundException("THis is Class not found Exception");
  } 
} 

class Test{ 
  public static void main(String args[]){ 
   try{ 
     A obj=new A(); 
     obj.disp(); 
   }catch(Exception ex){
     System.out.println(ex);
    } 
  }
}