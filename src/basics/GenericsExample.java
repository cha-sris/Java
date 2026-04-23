
class Box<T> {
    T item;

    void setItem(T item){
        this.item = item;
    }

    T getItem(){
        return this.item;
    }
}

    // By naming convention U comes after T
class Product<T, U> {
    T item;
    U price;

    Product(T item, U price){
        this.item = item;
        this.price = price;
    }

    T getItem(){
        return this.item;
    }

    U getPrice(){
        return this.price;
    }
}

public class GenericsExample {
    
    //  Generics = A concept where you can write a class, interface, or method
    //              that is compatible with different data types.
    //              <T> type parameter (placeholder that gets replaced with a real type)
    //              <String> type argument (specifies the type)

    public static void main(String[] args) {
        // var box = new Box<String>();

        // box.setItem("banana");

        // System.out.println(box.getItem());

        var product = new Product<String, Double>("apple", 0.50);

        System.out.println(product.getItem());
        System.out.println(product.getPrice());
        System.out.println(product);

    }
}
