/*
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