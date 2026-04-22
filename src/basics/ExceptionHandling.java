import java.util.InputMismatchException;

public class ExceptionHandling {
    // Exception = An event that interrupts the normal flow of a program 
    //             (Dividing by zero, file not found, mismatch input type)
    //              Surround any dangerous code with a try{} block
    //              try{}, catch{}, finally{}

    public static void main(String[] args) {
        try{
        System.out.println(1/0);
        }
        catch (ArithmeticException e){
            System.out.println("You can't divide by zero!!");
        }
        catch (InputMismatchException e){
            System.out.println("Input mismatch");
        }
        // catch all types of exception
        catch (Exception e){
            System.out.println("Something went wrong.");
        }
        //  this block always executes
        finally {
            System.out.println("I will always execute.");
        }

    }
}
