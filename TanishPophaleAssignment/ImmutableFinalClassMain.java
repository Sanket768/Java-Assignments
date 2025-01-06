// Create an immutable Student class with final attributes and no setters.

final class ImmutuableFinalClass{

    private final int a = 10;
    private final String b = "Hello!";

    public void geta(){
        System.out.println("The value of a is: " + a);
    }

    public void getb(){
        System.out.println("The value of b is: " +  b);
    }
}


public class ImmutableFinalClassMain {

    public static void main(String[] args) {
        
        ImmutuableFinalClass i = new ImmutuableFinalClass();
        i.geta();
        i.getb();
    }
}