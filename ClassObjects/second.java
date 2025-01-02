
/*
 * 2. Student Details
 * Create a Student class with attributes like name, age, and roll number. Create objects and display the details.
 */
import java.util.*;

class Student {
    private String name;
    private int age;
    private int rollNumber;

    public void setData() {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.println("Enter name:");
            name = sc.nextLine();
            System.out.println("Enter age:");
            age = sc.nextInt();
            System.out.println("Enter roll number:");
            rollNumber = sc.nextInt();
        }
    }

    public void getData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }

}

public class second {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData();
        s1.getData();
    }
}
