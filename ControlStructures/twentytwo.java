import java.util.Random;

class RandomNumberGenerator {
    private int randomNumber;
    private final int targetNumber;
    private final int range;
    private final Random random;

    public RandomNumberGenerator(int range, int targetNumber) {
        this.range = range;
        this.targetNumber = targetNumber;
        this.random = new Random();
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public boolean isDivisibleByTargetNumber() {
        return randomNumber % targetNumber == 0;
    }

    public void generateRandomNumberUntilConditionMet() {
        do {
            randomNumber = random.nextInt(range) + 1; // Generate number between 1 and range
            System.out.println("Generated: " + randomNumber); // Optional: to observe the process
        } while (!isDivisibleByTargetNumber());
    }
}

public class twentytwo {
    public static void main(String[] args) {
        int range = 100; // Specify range
        int target = 7; // Specify target divisibility condition
        RandomNumberGenerator generator = new RandomNumberGenerator(range, target);

        generator.generateRandomNumberUntilConditionMet();
        System.out.println("Random Number Divisible by " + target + ": " + generator.getRandomNumber());
    }
}
