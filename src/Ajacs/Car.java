package company.Ajacs;

class Vehicle {
	int make, model = 19, year = 2020;

	public void start() {
		System.out.println("vehicle class start()");
	}

	public void stop() {
		System.out.println("Vehicle class Stop()");
	}
}

public class Car extends Vehicle {
	int numDoors = 4;

	void drive() {
		System.out.println("Car class drive()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		v.start();
		v.stop();
		Car c = new Car();
		c.start();
		c.stop();
		c.drive();
		System.out.println(
				"make" + " " + c.make + "\n" + "model of a vehicle" + c.model + "\n" + "Year of a vehicle" + c.year);
		System.out.println(c.numDoors);
	}

}
