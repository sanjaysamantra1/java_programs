class thisDemo1{  
    int id;  
    String name;	
    
     thisDemo1(int x) {
		System.out.println("x value: "+x);
	}
      
    thisDemo1(int id,String name){    	
    this.id = id;  
    this.name = name;  
	this(5);
    }  
    void display(){
    	System.out.println(id+" "+name);
    	}  
  
    public static void main(String args[]){  
    thisDemo1 s1 = new thisDemo1(111,"Karan");  
    thisDemo1 s2 = new thisDemo1(321,"Aryan");  
    s1.display();  
    s2.display();  
    }  
}
