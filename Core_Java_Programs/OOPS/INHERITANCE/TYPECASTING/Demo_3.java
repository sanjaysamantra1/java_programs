class Vehicle {
	String type = "vehicle";
	public void drive(Vehicle ob){
		System.out.println("driving"+ob.type);

}
}
class Bike extends Vehicle {
	String type = "bike";
		public void drive(Bike ob){
			System.out.println("driving"+ob.type);
	}

}
class Car extends Vehicle {
String type = "Car";
	public void drive(Car ob){
		System.out.println("driving"+ob.type);
	}
}
class Bus extends Vehicle {
String type = "Bus";
	public void drive(Bus ob){
		System.out.println("driving"+ob.type);
	}

}
class Demo_3 {
 public static void main(String[] args) {
	Car carObj = new Car();
	Vehicle vObj = new Vehicle();
	vObj.drive(carObj);
 }

}