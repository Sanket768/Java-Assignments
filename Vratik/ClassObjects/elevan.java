/*
 * Create a base class Animal with a method eat(). Create a derived class Dog that adds a bark() method.
 */

class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Woof!");
    }
}

public class elevan {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}