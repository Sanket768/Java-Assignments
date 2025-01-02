/* Write a program to demonstrate method overriding in a parent and child class. */
class Parent {
    public void display() {
        System.out.println("Parent class display method.");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child class display method.");
    }

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}
