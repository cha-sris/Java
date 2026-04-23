import java.util.Scanner;

enum Day {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THRUSDAY(5), FRIDAY(6), SATURDAY(7);

     final int dayNumber;

    Day(int dayNumber){
        this.dayNumber = dayNumber;
    }

    int getDayNumber(){
        return this.dayNumber;
    }
}

public class EnumsExample {
        // Enums = (Enumeration) A special kind of class that 
        //          represents a fixed set of constants
        //          They improve code readability and are easy to maintain.
        //          More efficient with switches when compairing Strings.

        public static void main(String[] args) {
            
            // Day day = Day.SUNDAY;
            
            try (// System.out.println(day);
            Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter the day of the week: ");

                try {
                    String response = sc.nextLine().toUpperCase();

                Day day = Day.valueOf(response);

                switch(day){
                    case MONDAY,
                        TUESDAY,
                        WEDNESDAY,
                        THRUSDAY,
                        FRIDAY -> System.out.println("This is a weekday.");
                    case SATURDAY, SUNDAY -> System.out.println("This is a weekend.");   
                }
                } catch (Exception e) {
                    System.out.println("Please enter a valid day.");
                }
            }
        }
}
