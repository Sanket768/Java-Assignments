/* Use an anonymous inner class to implement an interface or extend a class. */
interface Greeting {
    void sayHello();
}

public class Test {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from anonymous class!");
            }
        };
        greeting.sayHello();
    }
}