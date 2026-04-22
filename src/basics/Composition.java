class ComEngine {
    String type;

    ComEngine (String type) {   
        this.type = type;
    }

    void start(){
        System.out.println("You start the " + this.type + " engine.");
    }
}

class ComCar {
    String model;
    int year;
    ComEngine engine;

     ComCar (String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new ComEngine(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " is running.");
    }
}

public class Composition {
    // Composition = Represents a "part-of" relationship between objects.
    //              For example, an engine is "part-of" a Car.
    //              Allows complex objects to be constructed from smaller objects.

    public static void main(String[] args) {
    ComCar car = new ComCar("Corvette", 2025, "V8");

        System.out.println(car.model + " " + car.year + " " + car.engine.type);

        car.start();
    }
}
