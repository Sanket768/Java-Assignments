/* Create a class HelloWorld with a method that prints "Hello, World!" when called. */
public class HelloWorld {
    public void printMessage() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.printMessage();
    }
}
