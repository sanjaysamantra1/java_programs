class thisDemo3{
    int id;
    String name;

     thisDemo3() {
		System.out.println("this is 0-arg constructor");
	}
	thisDemo3(int x) {
		this();
		System.out.println("this is 1-arg constructor");
	}

    thisDemo3(int id,String name){
		this(5);
		System.out.println("this is 2-arg constructor");
	    this.id = id;
	    this.name = name;
    }
    void display(){
    	System.out.println(id+" "+name);
    	}

    public static void main(String args[]){
    thisDemo3 s1 = new thisDemo3(111,"Karan");
    thisDemo3 s2 = new thisDemo3(321,"Aryan");
    s1.display();
    s2.display();
    }
}
