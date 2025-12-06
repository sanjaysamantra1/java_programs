class StudentTest{
	public static void main(String args[]){
		Student std1 = new Student();
		std1.roll = 1;
		std1.name = "sarath";
		std1.add = "marathalli";


		Student std2 = new Student();
		std2.roll = 2;
		std2.name = "ramana";
		std2.add = "Hebbal";

		std1.displayInfo();
		std2.displayInfo();

	}
}