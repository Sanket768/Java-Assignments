/* Determine if a person is eligible to vote based on age. */
class Voter {
    private int age;

    public Voter(int age) {
        this.age = age;
    }

    public boolean isEligible() {
        return age >= 18;
    }
}

public class forth {
    public static void main(String[] args) {
        Voter voter = new Voter(25);
        System.out.println(voter.isEligible()); // Output: true
    }
}