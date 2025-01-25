/*
 * Write a program to demonstrate downcasting of objects from a parent class to a child class.
 */
class P {
    String name = "GFG";

    public void display() {
        System.out.println("Method from Parent");
    }
}

class C extends P {
    int id = 1;

    public void display() {
        System.out.println("Method from Child");
    }
}

public class twenty {
    public static void main(String[] args) {
        P p = new C();
        p.display();

        if (p instanceof C) {
            C c = (C) p;
            System.out.println(c.id);
            System.out.println(c.name);
        } else {
            System.out.println("p is not an instance of C");
        }
    }
}
