import java.util.Scanner;
import java.util.Random;

public class numberGuesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;

        System.out.println("Guess a number between 1 and 10.");

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("You guessed the correct number!");
                break; 
            } else {
                System.out.println("Incorrect guess. Try again.");

		if (userGuess > 10) {
			System.out.print("Invalid guess ");
		}

                if (userGuess < randomNumber) {
                    System.out.println("Try a higher number.");
                } else {
                    System.out.println("Try a lower number.");
                }
            }
        }

        scanner.close();
    }
}

