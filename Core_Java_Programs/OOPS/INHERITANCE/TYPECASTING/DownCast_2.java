
class Parent{
    int x = 10;
    void show(){
        System.out.println("parent-show");
    }
   
    void OnlyParentShow(){
        System.out.println("OnlyParentShow");
    }
}
 
class Child extends Parent{
    int x = 20;
    void show(){
        System.out.println("child-show");
    }
    void OnlyChildShow(){
        System.out.println("OnlyChildShow");
    }
}

public class DownCast_1 {

	public static void main(String[] args) {
		
		Parent p = new Child();
		System.out.println(p.x);
		p.show();
		p.OnlyParentShow();
		//p.OnlyChildShow();
		
		System.out.println();
		
		Child c =(Child) p;
		System.out.println(c.x);
		c.show();
		c.OnlyChildShow();
		c.OnlyParentShow();
		
	}

}
