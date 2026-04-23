import java.util.Scanner;

class MyRunnable implements Runnable {
    @Override
   public void run(){
            for (int i = 0; i <= 10; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Threa was interrrupted");
                }

                if (i == 10){
                    System.out.println("Time's up!");
                    System.exit(0);
                }
            }
    }
}

public class Threading {
    //  Threading = Allows a program to run multiple tasks simultaneously
    //              Helps improve performance with time-consuming operations
    //              (File I/O network communications, or any background tasks)
    
    //  How to create a Thread
    //  Option 1. Extend the Thread class (simpler)
    //  Option 2. Implement the Runnable interface (bettter)

    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
           
           MyRunnable myRunnable = new MyRunnable();
           Thread thread = new Thread(myRunnable);
           thread.setDaemon(true);
           thread.start();
           
            System.out.println("You have 10 sec to enter your name.");

            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.println("Hello " + name);
        }

    }
}
