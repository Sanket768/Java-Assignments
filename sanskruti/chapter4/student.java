
    
public class student {
    
    
    String name;
    int age;
    int rollNumber;
    
    
    public student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }

    
    public static void main(String[] args) {
        
        student student1 = new student("Alice", 20, 101);
        student student2 = new student("Bob", 22, 102);

        
        student1.displayDetails();
        System.out.println();  
        student2.displayDetails();
    }
}


