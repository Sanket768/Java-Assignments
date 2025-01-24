/*
 * Create a base class Animal with a method eat(). Derive a class Dog with an 
additional method bark().
 */
class Animal{
    public void eat(){
        System.out.println("Eating.....");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking...");
    }
}
public class first{
    public static void main(String[] args) {
        Dog Tommy = new Dog();
        Tommy.bark();
        Tommy.eat();
        }
}