import java.util.Scanner;

class twentynine {
    private static int marks;

    public static void main(String[] args) { 
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter percentage: ");
            marks = s.nextInt();
            if(marks<100 && marks>0){
                System.out.println((marks>=90 ? "Grade A" : (marks>=80) ? "Grade B" : (marks>=70) ? "Grade C" : (marks>=60) ? "Grade D" : (marks>=50) ? "Grade E" : "Grade F"));
            }
            else{
                System.out.println("Invalid input");
            } 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }    
}
