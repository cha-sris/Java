import java.util.Scanner;

abstract class RunAnimal {
    abstract void speak();
}

class RunDog extends RunAnimal {
    @Override
    void speak(){
        System.out.println("The dog goes *woof");
    }
}

class RunCat extends RunAnimal {
    @Override
    void speak(){
        System.out.println("The cat goes *meow");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            RunAnimal animal;

            System.out.print("Enter your choice 1 = Dog | 2 = Cat : ");
            int choice = sc.nextInt();

            if(choice == 1){
                animal = new RunDog();
                animal.speak();
            }
            else {
                animal = new RunCat();
                animal.speak();
            }
        }
    }
}
