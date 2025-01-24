/* Create a parent class Person with a method display(). Use super to call it in the child class Student. */
class Persons {
    public void display() {
        System.out.println("Person display method.");
    }
}

class Student extends Persons {
    @Override
    public void display() {
        super.display();
        System.out.println("Student display method.");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.display();
    }
}
