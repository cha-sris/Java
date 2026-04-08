public class ToString {
	public static void main(String [] args){
	CarForToString car = new CarForToString("Ford", "Mustang", 1998, "Black");

	System.out.println(car);

	// Method overriding
	// System.out.println(car.make + "\t" + car.model + "\t" + car.year + "\t" + car.color);
	}
}
