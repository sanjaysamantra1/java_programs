// Wildcard in Java Generics (?)

import java.util.*;

abstract class Shape
{
abstract void draw();
}
class Rectangle extends Shape{
	void draw(){
		System.out.println("drawing rectangle");
		}
}
class Circle extends Shape{
	void draw(){
		System.out.println("drawing circle");
		}
}


class GDemo4{
//creating a method that accepts only child class of Shape
	public static void drawShapes(List<? extends Shape> lists){
		for(Shape s:lists){
		s.draw();//calling method of Shape class by child class instance
		}
	 }
public static void main(String args[])
{
	List<Rectangle> list1=new ArrayList<Rectangle>();
	list1.add(new Rectangle());

	List<Circle> list2=new ArrayList<Circle>();
	list2.add(new Circle());
	list2.add(new Circle());

	//List<Integer> list3=new ArrayList<Integer>();
	//list3.add(10);
	//list3.add(20);

	drawShapes(list1);
	drawShapes(list2);
	//drawShapes(list3);
}

}