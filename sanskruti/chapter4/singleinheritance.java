public class singleinheritance {
    

    
    
    public void eat() {
        System.out.println("This animal eats food.");
    }
}


class Dog extends singleinheritance {

    
    public void bark() {
        System.out.println("The dog barks.");
    }

    
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        
        
        dog.eat(); 
        dog.bark(); 
    }
}


