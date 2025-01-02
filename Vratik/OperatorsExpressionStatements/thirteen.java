/* Determine if a person is eligible for voting and driving based on their age. */
class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public boolean isEligibleToVote() {
        return age >= 18;
    }

    public boolean isEligibleToDrive() {
        return age >= 18;
    }
}

public class thirteen {
    public static void main(String[] args) {
        Person person = new Person(25);
        Person person1 = new Person(10);
        System.out.println(person.isEligibleToVote()); // prints: true
        System.out.println(person.isEligibleToDrive()); // prints: true
        System.out.println(person1.isEligibleToVote()); // prints: false
        System.out.println(person1.isEligibleToDrive()); // prints: false
    }
}
