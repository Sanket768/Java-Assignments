/* Create an array of Book objects to manage a library. */
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class Librarys {
    public static void main(String[] args) {
        Book[] books = {
            new Book("1984", "George Orwell"),
            new Book("The Catcher in the Rye", "J.D. Salinger"),
            new Book("To Kill a Mockingbird", "Harper Lee")
        };

        for (Book book : books) {
            book.display();
        }
    }
}