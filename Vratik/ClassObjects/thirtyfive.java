public class thirtyfive {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", 20),
            new Student("Bob", 22),
            new Student("Charlie", 21)
        };

        for(Student student: students){
            System.out.println("Name: " + student.getName()+ " " + "Age: " + student.getAge());
        }
    }
}