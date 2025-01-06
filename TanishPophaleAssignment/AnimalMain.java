// Create a base class Animal with a method eat(). Create a derived class Dog that adds a bark() method.


class Animal{

    public void eat(){
        System.out.println("Eat Method");
    }
}

class Dog extends Animal{

    public void bark(){
        System.out.println("Bark Method");
    }
}


public class AnimalMain {
    
    public static void main(String[] args) {
        
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
