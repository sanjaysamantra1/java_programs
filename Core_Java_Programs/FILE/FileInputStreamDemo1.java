import java.io.*;

class FileInputStreamDemo1{
 public static void main(String args[]){
  try{
    FileInputStream fin=new FileInputStream("abc.txt");
    int i=1;

    while((i=fin.read())!=-1){
     System.out.print((char)i);
	 //System.out.print(i);	839799...
    }
    fin.close();
  }
  catch(Exception e)
  {
	  System.out.println(e);
  }
 }
}