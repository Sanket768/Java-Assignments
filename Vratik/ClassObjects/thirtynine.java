/*
 * Create a School class to manage a list of students using ArrayList.
 */
import java.util.ArrayList;
    class Student{
        private String name;
        private int age;

        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }
    }
public class thirtynine {
    private ArrayList<Student> students;

    public thirtynine(){
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void displayStudents(){
        for(Student student : students){
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }

    public static void main(String[] args) {
        thirtynine school = new thirtynine();
        school.addStudent(new Student("Alice", 20));
        school.addStudent(new Student("Bob", 22));
        school.displayStudents();
    }

}
