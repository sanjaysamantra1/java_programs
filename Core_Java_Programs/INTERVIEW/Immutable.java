//Declare the class as final so it can’t be extended.
//Make all fields private so that direct access is not allowed.
//Don’t provide setter methods for variables
//Make all mutable fields final so that it’s value can be assigned only once.
//Initialize all the fields via a constructor performing deep copy.

final public class Immutable 
{
	private int i;
	Immutable(int i){
		this.i=i;
	}
    public Immutable modify(int i){
		if(this.i==i)
			return this;
		else
			return new Immutable(i);
	}

	public static void main(String arg[]){ 
		Immutable ob1=new Immutable(10);
		Immutable ob2=ob1.modify(100);
		Immutable ob3=ob1.modify(10);
		System.out.println(ob1==ob2);
		System.out.println(ob1==ob3);		

	}
}