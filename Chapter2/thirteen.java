import java.util.Scanner;

class voting {
    private int age;

    public void voteEligibility(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the age: ");
            age = s.nextInt();

            if(age>=18){
                System.out.println("Person is Eligible for voting");
            }
            else{
                System.out.println("Person in Ineligible for voting");
            }
        }
        finally{
            s.close();
        }
    }
}

class thirteen {
    public static void main(String[] args) {
        voting v = new voting();
        v.voteEligibility();
    }
}
