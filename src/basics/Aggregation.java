class Book {
    String title;
    int pages;

    Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    String displayInfo(){
        return this.title + " (" + this.pages + " pages)";
    }
}

class Library {
    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The "+ this.year + " " + this.name);
        System.out.println("Books Available: ");

        for(Book book: books){
            System.out.println(book.displayInfo()
);
        }
    }
}

public class Aggregation {
    public static void main(String[] args) {
        // Aggregation = Represents a "has-a" relationship between objects.
        //      One object contains another object as part of its structure, but the contained object/s can exist independently

        Book book1 = new Book("Jujutsu Kaisen", 281);
        Book book2 = new Book("Solo Leveling", 114);
        Book book3 = new Book("Demon Slayer", 263);

        Book[] books = {book1, book2, book3};

        Library library = new Library("Manga Public Library", 1998, books);

        library.displayInfo();
    }
}
