import java.util.Scanner;

class fortyeight {
    private static int num;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            num = s.nextInt();

            int sume=0;
            int sumo=0;
            for(int i=1;i<=num;i++){
                if(i%2==0){
                    sume = sume+i;
                }
                else{
                    sumo = sumo+i;
                }
            }
            System.out.println("Sum of all even numbers: " + sume);
            System.out.println("Sum of all odd numbers: " + sumo);
        }
        finally{
            s.close();
        }
    }
}
