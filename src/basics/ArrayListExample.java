import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    //  ArrayList = A resizable array that store objects (autoboxing).
    //              Arrays are fixed in size, but ArrayLists can change.

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        var vList = new ArrayList<Integer>(); 

        var vDList = new ArrayList<Double>(); 

        var fruits = new ArrayList<String>(); 

        list.add(3);
        list.add(1);
        list.add(2);

        vList.add(5);
        vList.add(7);

        vDList.add(3.09);
        vDList.add(6.37);

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Dragon Fruit");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Cococnut");

        System.out.println(list);
        System.out.println(vList);
        System.out.println(vDList);
        System.out.println(fruits);

        fruits.remove("Orange");
        fruits.remove(0);
        fruits.set(3, "Star Fruit");

        System.out.println(fruits);

        Collections.sort(fruits);
        System.out.println(fruits);

    }
}
