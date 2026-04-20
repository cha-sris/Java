



public class GettersSetters {
    public static void main(String[] args) {
        // They help protect data and and rules for accessing or modifying
        //  GETTERS = Methods that make a field READABLE.
        //  SETTERS = Methods that make a field WRITABLE.

        GetCar car = new GetCar("Charger", "Yellow", 10000);

        // car.color = "Blue";
        // car.price = 12460;

        // System.out.println(car.model);
        // System.out.println(car.color);
        // System.out.println(car.price);

        car.setColor("Blue"); 
        car.setPrice(12460);
        
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getPrice());
    }
}
