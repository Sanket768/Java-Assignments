/*Student Grade System */
class Std{
    private int marks;

    public Std(int m){
        this.marks = m;
    }

    public void calGrade(){
        if((marks >= 90) && (marks < 100)){
            System.out.println("Student has A Grade");
        }
        else if((marks <= 90) && (marks > 80)){
            System.out.println("Student has B Grade");
        }
        else if((marks <= 80) && (marks > 70)){
            System.out.println("Student has C Grade");
        }
        else if((marks <= 70) && (marks > 60)){
            System.out.println("Student has D Grade");
        }
        else if((marks <= 60) && (marks > 50)){
            System.out.println("Student has E Grade");
        }
        else{
            System.out.println("Student is Failed!!");
        }
    }
}
public class twentyfour {
    public static void main(String[] args){
        Std student = new Std(720);
        student.calGrade();
    }
}
