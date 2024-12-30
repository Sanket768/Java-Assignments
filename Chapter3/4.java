import java.util.Scanner;

class driving {
    private int age;

    public void voteEligibility(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the age: ");
            age = s.nextInt();

            if(age>=18){
                System.out.println("Person is Eligible for driving");
            }
            else{
                System.out.println("Person in Ineligible for driving");
            }
        }
        finally{
            s.close();
        }
    }
}

class thirteen {
    public static void main(String[] args) {
        driving v = new driving();
        v.voteEligibility();
    }
}