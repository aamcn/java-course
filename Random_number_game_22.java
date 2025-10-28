import java.util.Scanner;
import java.util.Random;

public class Random_number_game_22 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1, 11);

        System.out.println("Number Guessing Game!");
        System.out.print("Guess a number between 1 and 10.");

        do {
            System.out.print(" Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You've guessed the number.");
                System.out.println("It took you " + attempts + " attempts.");
            }

        } while (guess != randomNumber);

        // Closing the scanner
        scanner.close();
    }
}
