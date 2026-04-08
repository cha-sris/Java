public class CarForToString {
	
	String make;
	String model;
	int year;
	String color;

	CarForToString (String make, String model, int year, String color){
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	@Override
	public String toString(){
	return this.make + "\t" + this.model + "\t" + this.year + "\t" + this.color; 
	}	
}
