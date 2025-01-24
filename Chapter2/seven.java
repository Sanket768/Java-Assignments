import java.util.Scanner;

class validatenum{
    private double a;


    public void check(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter num: ");
            a = s.nextDouble();

            if(a>=10 && a<=50){
                System.out.println("The number is in range from 10 to 50");
            }
            else{
                System.out.println("The number is not in range from 10 to 50");
            }
        }
        finally{
            s.close();
        }
    }
}

class seven {
    public static void main(String[] args) {
        validatenum v = new validatenum();
        v.check();
    }    
}
