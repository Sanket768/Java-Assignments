import java.util.Scanner;

class three {
    private int year;

    public void leap(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the year: ");
            year = s.nextInt();

            if((year%100==0 && year%400==0) || (year%100!=0 && year%4==0)){
                System.out.println("Year is leap year");
            }
            else{
                System.out.println("It is not a leap year");
            }
        }
        finally{
            s.close();
        }
    }
}

class twelve {
    public static void main(String[] args) {
        three l = new three();
        l.leap();
    }    
}