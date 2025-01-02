
/*
 * 28. Determine if a person is eligible for senior citizen benefits based on age using the
ternary operator.
 */
import java.util.*;

class SeniorCitizen {
    private int age;

    public SeniorCitizen(int age) {
        this.age = age;
    }

    public String isEligible() {
        return age >= 60 ? "Senior Citizen" : "Not a Senior Citizen";
    }
}

public class twentyeight {
    public static void main(String[] args) {
        int age;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your age:");
            age = sc.nextInt();
            SeniorCitizen sct = new SeniorCitizen(age);
            System.out.println(sct.isEligible());
        }
    }
}
