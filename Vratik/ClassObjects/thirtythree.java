/*Use an anonymous inner class to implement an interface or extend a class. */
interface Greeting{
    void greet();
}
public class thirtythree {
    public static void main(String[] args) {
        Greeting gt = new Greeting(){
            @Override
            public void greet(){
                System.out.println("Hello, World!");
            }
        };
        gt.greet();
    }
}
