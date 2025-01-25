/*
 * Create a LibraryItem class with subclasses Book and Magazine. Implement 
polymorphic methods for checkout().
 */
abstract class LibraryItem{
    abstract void checkout();
}
class Book extends LibraryItem{
    @Override
    void checkout(){
        System.out.println("Checking out a book...");
    }
}
class Magazine extends LibraryItem{
    @Override
    void checkout(){
        System.out.println("Checking out a magazine...");
    }
}

public class twentyfour {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[2];
        items[0] = new Book();
        items[1] = new Magazine();
        for(LibraryItem i: items){
            i.checkout();
        }
    }
}
