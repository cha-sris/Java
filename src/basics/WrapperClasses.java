
public class WrapperClasses {
    //  Wrapper classes = Allow primitive values (int, char, double, boolean)
    //                      to be used as objects. "Wrap them in an object"
    //                      Generally, don't wrap primitive unless you need an object.
    //                      Allows use of Collections Framework and static Utility Methods

    public static void main(String[] args) {
        //  Autoboxing
        // Integer a = 123;
        // Double b = 3.14;
        // Character c = '$';
        // Boolean d = true;

        //  Unboxing
        // int x = a;

        // String a = Integer.toString(123);
        // String b = Double.toString(3.14);
        // String c = Character.toString('@');
        // String d = Boolean.toString(false);

        // String x = a + b + c + d;

        // System.out.println(x);

        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");

        //  Error
        // String x = a + b + c + d;

        // Adding "" at the start ensures Java treats everything as a String
        String x = "" + a + " " + b + " " + c + " " + d;
        System.out.println(x);

        //  OR
        System.out.printf("%d, %f, %c, %b%n", a, b, c, d);

    }
}
