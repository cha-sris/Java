// package src.basics;

interface Prey {
  void flee();
}

interface Predator {
  void hunt();
}

class Rabbit implements Prey {
  @Override
  public void flee() {
    System.out.println("The rabbit is running away.");
  }

}

class iFish implements Prey, Predator {
  @Override
  public void flee() {
    System.out.println("The fish is swimming away.");
  }

  @Override
  public void hunt() {
    System.out.println("The fish is hunting.");
  }
}

class Hawk implements Predator {
  @Override
  public void hunt() {
    System.out.println("The hawk is hunting.");
  }
}

public class InterfacesExample {
  public static void main(String[] args) {
    Rabbit rabbit = new Rabbit();
    iFish fish = new iFish();
    Hawk hawk = new Hawk();

    rabbit.flee();
    fish.flee();

    fish.hunt();
    hawk.hunt();
  }
}
