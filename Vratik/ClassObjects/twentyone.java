/*
<<<<<<< HEAD
 * Create a Library class and a Book class. Link them via an association.
*/
class Library {
    protected String name;
    private Book[] books;
    private int bookCount;

    public Library(String name) {
        this.name = name;
        this.books = new Book[10];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < 10) {
            books[bookCount] = book;
            bookCount++;
        }
    }

    public void display() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println(bookCount);
        }
    }
}

class Book {
    private String title;
    private String author;
    private Library library;

    public Book(String title, String author, Library library) {
        this.title = title;
        this.author = author;
        this.library = library;
    }

    public void display() {
        System.out.println("Library: " + library.name + " Title: " + title + " Author: " + author);
    }

}

public class twentyone {
    public static void main(String[] args) {
        Library library = new Library("My Library");
        Book book = new Book("Harry Potter", "JK Rowling", library);
        library.addBook(book);
        book.display();
    }
}
=======
 * This is normal association where neither own the other.
 */
class Library{
    private String name;
    
    public Library(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

class Book{
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getBook(){
        return this.title + " by " + this.author;
    }
}

public class twentyone{
    public static void main(String[] args) {
        Library lib = new Library("City Library");
        Book book = new Book("Harry Potter", "J.K. Rowling");
        System.out.println(lib.getName() + " has " + book.getBook());
    }
}
>>>>>>> main
