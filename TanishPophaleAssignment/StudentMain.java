// Create a Student class with attributes like name, age, and roll number. Create objects 

class Student {
    
    private String name;
    private int age;
    private int rollNo;

    Student(String name, int age, int rollNo){
            this.name = name;
            this.age = age;
            this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(short age) {
        this.age = age;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(short rollNo) {
        this.rollNo = rollNo;
    }

    
}


public class StudentMain{
    
    public static void main(String[] args) {
        
        Student s1 = new Student("Ramesh", 43, 1);
        Student s2 = new Student("Suresh", 46, 2);
        Student s3 = new Student("Yogesh", 36, 3);

    }
}