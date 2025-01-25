/*
 * Create a class hierarchy and use instanceof to determine the actual object type at runtime.
 */
class A{
    public void display(){
        System.out.println("Method from A");
    }
}
class B extends A{
    public void display(){
        System.out.println("Method from B");
    }
}
public class twentyone {
    public static void main(String[] args) {
        A a = new B();
        a.display();
        if(a instanceof B){
            B b = (B) a;
            b.display();
        }
        else{
            System.out.println("a is not an instance of B");
        }
    }
}
