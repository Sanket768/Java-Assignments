/* 10. Write a program to check if a student has passed based on marks using comparison
operators. */
class Student {
    private int marks;

    public Student(int marks) {
        this.marks = marks;
    }

    public boolean isPassed() {
        if (marks >= 40) {
            return true;
        } else {
            return false;
        }
    }

}

public class ten {
    public static void main(String[] args) {
        Student s = new Student(35);
        Student s1 = new Student(75);
        System.out.println(s.isPassed());
        System.out.println(s1.isPassed());
    }
}
