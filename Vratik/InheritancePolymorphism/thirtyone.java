/*
 * Create a Person class with subclasses Student and Teacher. Implement polymorphic methods for displayRole().
 */
abstract class Person{
    abstract void displayRole();
}
class Student extends Person{
    @Override
    void displayRole(){
        System.out.println("I am a student.");
    }
}
class Teacher extends Person{
    @Override
    void displayRole(){
        System.out.println("I am a teacher.");
    }
}

public class thirtyone {
    public static void main(String[] args) {
        Person[] persons = new Person[2];
        persons[0] = new Student();
        persons[1] = new Teacher();
        for(Person p: persons){
            p.displayRole();
        }
    }
}
