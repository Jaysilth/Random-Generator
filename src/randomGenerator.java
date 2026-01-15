import java.util.Random; // Import Random class to generate random numbers

public class randomGenerator {
    public static void main(String[] args) {

        Random random = new Random(); // Create Random object

        /*
         This program contains two functionalities:

         1. Generate 3 random numbers between 1 and 10
         2. Simulate a coin flip (heads or tails)
        */

        // -----------------------------
        // Part 1: Random numbers
        // -----------------------------
        /*
        int number1;
        int number2;
        int number3;

        // Generate random numbers
        // nextInt(1,10) generates numbers from 1 (inclusive) to 10 (exclusive)
        number1 = random.nextInt(1, 10);
        number2 = random.nextInt(1, 10);
        number3 = random.nextInt(1, 10);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        */

        // -----------------------------
        // Part 2: Coin flip simulation
        // -----------------------------
        boolean isHeads;

        isHeads = random.nextBoolean(); // Randomly returns true or false

        if (isHeads) {
            System.out.println("You got heads");
        } else {
            System.out.println("You got tails");
        }
    }
}
