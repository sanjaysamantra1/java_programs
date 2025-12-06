class ObjTest1{  
 int length;  
 int width;  
  
 void insert(int l,int w){  
  length=l;  
  width=w;  
 }  
  
 void calculateArea(){System.out.println(length*width);}  
  
 public static void main(String args[]){  
 // ObjTest1 r1=new ObjTest1();  
  //ObjTest1 r2=new ObjTest1();
  
  ObjTest1 r1=new ObjTest1(),r2=new ObjTest1();//creating two objects  
  
  r1.insert(11,5);  
  r2.insert(3,15);  
  
  r1.calculateArea();  
  r2.calculateArea();  
}  
}  