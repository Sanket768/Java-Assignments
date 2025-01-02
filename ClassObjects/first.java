/*
 * 1. Hello World Class
 * Create a class HelloWorld with a method that prints "Hello, World!" when
 * called.
 */

class HelloWorld {
    public void helloWorld() {
        System.out.println("Hello World!");
    }
}

public class first {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.helloWorld();
    }
}