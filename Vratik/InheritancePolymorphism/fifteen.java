/*
 * Create a base class Animal with a method makeSound(). Override it in subclasses 
like Dog, Cat, and Bird.
 */
class Animal{
    public void makeSound(){
    }
}
class Dog1 extends Animal{
    public void makeSound(){
        System.out.println("Woof woof!!");
    }
}
class Cat1 extends Animal{
    public void makeSound(){
        System.out.println("Meow meow!!");
    }
}
class Bird extends Animal{
    public void makeSound(){
        System.out.println("Chirp chirp!!");
    }
}
public class fifteen {
    public static void main(String[] args) {
        Dog1 dg = new Dog1();
        Cat1 ct = new Cat1();
        Bird bd = new Bird();

        dg.makeSound();
        ct.makeSound();
        bd.makeSound();
    }
}