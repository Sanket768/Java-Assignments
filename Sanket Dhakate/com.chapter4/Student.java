/* Create a Student class with attributes like name, age, and roll number. Create objects and display the details. */
public class Student {
    String name;
    int age;
    int rollNumber;

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John Doe";
        student.age = 20;
        student.rollNumber = 101;

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Roll Number: " + student.rollNumber);
    }
}
