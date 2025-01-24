/* Create a Library class and a Book class. Link them via an association. */
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    String name;
    Book[] books;

    public Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public void displayBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            System.out.println("Book: " + book.title + ", Author: " + book.author);
        }
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book("1984", "George Orwell"),
            new Book("To Kill a Mockingbird", "Harper Lee")
        };
        Library library = new Library("City Library", books);
        library.displayBooks();
    }
}
