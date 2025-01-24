/* Check the grade of a student based on marks (A, B, C, etc.). */
public class Question7 {
    public static void main(String[] args) {
        int m1 = 89;
        int m2 = 75;
        int m3 = 92;

        int percentage = ((m1 + m2 + m3) / 300) * 100;

        if(percentage >= 90 ) 
        {
           System.out.println("Grade: A"); 
        }
        else if(percentage >= 80 && percentage < 90)
        {
            System.out.println("Grade: B");
        }
        else{
            System.out.println("Grade: C");
        }
        

    }
}
