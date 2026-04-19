// package src.basics;

abstract class PolyVehicle {
  abstract void go();
}

class PolyCar extends PolyVehicle{
  @Override
  void go() {
    System.out.println("You drive the car");
  }
}

class PolyBoat extends PolyVehicle {
  @Override 
  void go(){
    System.out.println("You sail the boat");
  }
}

class PolyBike extends PolyVehicle {
  @Override 
  void go(){
    System.out.println("You ride the bike");
  }
}

public class Polymorphism {
  public static void main(String[] args) {
    // Polymorphism: "Poly" = many + "morph" = shape
    // Objects can identify as other Objects
    // Objects can be treated as objects of a common superclass

    PolyCar car = new PolyCar();
    PolyBoat boat = new PolyBoat();
    PolyBike bike = new PolyBike();

    PolyVehicle[] vehicles = {car, bike, boat};

    for(PolyVehicle vehicle: vehicles){
      vehicle.go();
    }

  }
}
