

public class Student {
	private String name;
	private int age;
	private int rollNo;
	public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    
    public void displayDetails() {
        System.out.println("Details of "+name);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNo);
    }

    
    public static void main(String[] args) {
        
        Student stud1 = new Student("Anagha", 22, 2);
        Student stud2 = new Student("Avanti", 23, 4);

        
        stud1.displayDetails();
        System.out.println();
        stud2.displayDetails();
    }
}
	


