/*
*   Create a base class Person with attributes like name and age. Extend it to create a Student class with attributes like roll number and marks.
 */
class Person{
    @SuppressWarnings("unused")
    private String name;
    @SuppressWarnings("unused")
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

}

class Student extends Person{
    @SuppressWarnings("unused")
    private int rollNo;
    @SuppressWarnings("unused")
    private int marks;

    public Student(String name, int age, int rollNo, int marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;

        System.out.println("Mr. " + name + " having age " + age + " having roll no. "+ rollNo + " have got " + marks + " marks");
    }


    
}
public class second {
    public static void main(String[] args) {
        new Student("Vratik", 23, 67, 99);
    }

}
