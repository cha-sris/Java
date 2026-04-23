class MuRunnable implements Runnable {
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }
        }
    }
}

public class MultiThreading {
    // MultiThreading = Enables a program to run multiple threads concurrently 
    //                  (Thread = A set of instructions that run independenlty)
    //                  useful for background or time-consuming operations
    
    public static void main(String[] args) {
        MuRunnable myRunnable = new MuRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        
        System.out.println("\nProgram Starts\n");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("\nEnd of program\n");
    }
}
