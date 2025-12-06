class Parent{
    int a = 10;
    int b = 20;
    
    void show(){
        System.out.println("parent-show");
    }
   
    void OnlyParentShow(){
        System.out.println("OnlyParentShow");
    }
}
 
class Child extends Parent{
    int b = 30;
    int c = 40;
    
    void show(){
        System.out.println("child-show");
    }
    
    void OnlyChildShow(){
        System.out.println("OnlyChildShow");
    }
}

public class DownCast_2 {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		System.out.println(p.a);
		System.out.println(p.b);
		p.show();
		p.OnlyParentShow();
		
		System.out.println();
		
		Child c = new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		c.show();
		c.OnlyChildShow();
		c.OnlyParentShow();
		
		System.out.println();
		
		Parent p2 = new Child();
		System.out.println(p2.a);
		System.out.println(p2.b);
		//System.out.println(p2.c);
		p2.show();
		p2.OnlyParentShow();
		//p2.OnlyChildShow();
		
		Child c2 = new Child();			
		System.out.println(p2.a);
		System.out.println(p2.b);
		//System.out.println(p2.c);
		p2.show();
		p2.OnlyParentShow();
		//p2.OnlyChildShow();
		
	}

}
