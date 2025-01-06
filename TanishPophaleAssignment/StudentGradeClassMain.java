// Create a Student class to store marks. Add methods to calculate and display the grade.

class Student{
    public String name;
    public int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    private String calculateGrade(){
        
        if(this.marks>90 && this.marks<=100){
            return "A Grade";
        }
        else if(this.marks>80 && this.marks<=90){
            return "B Grade";
        }
        else if(this.marks>70 && this.marks<=80){
            return "C Grade";
        }
        else if(this.marks>60 && this.marks<=70){
            return "D Grade";
        }
        else{
            return "E Grade";
        }
    }

    public void display(){
        System.out.println("The student details are: ");
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
        System.out.println("Grade: " + this.calculateGrade());
        System.out.println();
    }
}

public class StudentGradeClassMain {
    
    public static void main(String[] args) {
        Student s = new Student("Tanu", 98);
        s.display();
        Student s1 = new Student("Lalu", 78);
        s1.display();
        Student s2 = new Student("Hui", 88);
        s2.display();
        Student s3 = new Student("IOR", 66);
        s3.display();
    }
}
