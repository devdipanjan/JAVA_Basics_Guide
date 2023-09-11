public class Oops {

	public static void main(String[] args) {
		
		Car myCar1 = new Car();
		Car myCar2 = new Car();

		System.out.println(myCar1.make);
		System.out.println(myCar1.model);

		myCar1.drive();
		myCar1.brake();
	}
}
//this is a main method and class car is where we store out data and execute in main class(here oops class).