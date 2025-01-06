/* Write a program to demonstrate method overriding in a parent and child class. */
// Explain the below code?
class Parent{
    void display() // Parent class method
    {
        System.out.println("Parent class method"); // Displaying parent class method
        }
}
class Child extends Parent{
    void display(){
        System.out.println("Child class method"); // Displaying child class method
        }
        }

public class thirteen {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
        Child c = new Child();
        c.display();
    }
}
