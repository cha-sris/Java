import java.util.HashMap;

public class HashmapsExample {
    //  HashMap = A data structure that stores key-value pairs
    //              Keys are unique, but Values can be duplicated
    //              Does not maintain any orderr, but is memory efficient
    //              HashMap<Key, Value>

    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        map.put("Apple", 0.50);
        map.put("Orange", 0.75);
        map.put("Banana", 0.25);

        System.out.println("\n" + map);

        System.out.println(map.get("Apple"));

        System.out.println(map.containsKey("Banana"));

        System.out.println(map.containsValue(0.25));

        System.out.println(map.size());


        if (map.containsKey("Orange")){
            System.out.println("Orange is available at $" + map.get("Orange"));
        }
        else{
            System.out.println("Key not found.\n");
        }


        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key) + "\n");
        }
    }
}
