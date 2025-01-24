/*Create a Parent class with a method display(). Extend it in a Child class and use 
the super keyword to call the parent’s display() method. */
class Parent{
    public void display(){
        System.out.println("This is parent class");
    }
}
class Child extends Parent{
    
    @Override
    public void display() {
        super.display();
    }
}
public class ten {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.display();
    }
}
