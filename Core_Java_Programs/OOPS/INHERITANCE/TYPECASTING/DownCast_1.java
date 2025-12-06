
class Parent{

}
class Child extends Parent{

}

public class DownCast_1 {

	public static void main(String[] args) {

		//Child c1 = new parent();
		Parent p1 = new Child();

		Child c2 = (Child)p1;


	}

}
