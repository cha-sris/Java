package src.basics;

class Species{
    boolean isAlive;

    Species(){
        isAlive = true;
    }
}

class Plants extends Species{
    void Photosynthesize(){
        System.out.println("The plant is absorbing sunlight.");
    }
}

class Animals extends Species{
    boolean isAlive;

    Animals(){
        isAlive = true;
    }

    void eat(){
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animals{
    int lives = 1;

    void speak(){
        System.out.println("The dog goes *woof.");
    }
}

class Cat extends Animals{
    int lives = 9;

    void speak(){
        System.out.println("The cat goes *meow.");
    }
}

// there can only be one public class per file.
public class InheritanceExample {
    public static void main(String[] args) {
        // Inheritance = One class inherits the attributes and methods
        //              from another class.
        //              Child <- Parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plants plant = new Plants();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        dog.eat();
        cat.eat();
        plant.Photosynthesize();

        System.out.println(dog.lives);
        System.out.println(cat.lives);
    }
}