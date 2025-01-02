/* Create a Student class to store marks. Add methods to calculate and display the grade. */
class Students {
    String name;
    int marks;

    public Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }

    public void displayDetails() {
        System.out.println("Student: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Students student = new Students("John", 85);
        student.displayDetails();
    }
}
