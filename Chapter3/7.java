import java.util.Scanner;

class seven {
    private static int marks;

    public static void main(String[] args) { 
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter percentage: ");
            marks = s.nextInt();
            if(marks<100 && marks>0){
                if(marks>=90){
                    System.out.println("Grade A");
                }
                else if(marks>=80){
                    System.out.println("Grade B");
                }
                else if(marks>=70){
                    System.out.println("Grade C");
                }
                else if(marks>=60){
                    System.out.println("Grade D");
                }
                else if(marks>=50){
                    System.out.println("Grade E");
                }
                else if(marks<50){
                    System.out.println("Grade F");
                }
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
