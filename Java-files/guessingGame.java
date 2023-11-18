import java.util.Scanner;
import java.util.Random;

public class guessingGame {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	int number = random.nextInt(10) + 1;
		
	while (true) {
        	System.out.print("Guess a number 1-10: ");
        	int guess = scanner.nextInt();

        	if (guess  == number) {
            		System.out.print("Correct!");
                break;
       		} else {
            		System.out.print("Incorrect, better luck next time.");

		if (guess < number) {
			System.out.print("Too low, try again");
		} else {
			System.out.print("Too high, try again");

		if (guess > 10) {
			System.out.print("Invalid guess");
		}

		else if (guess < 1) {
			System.out.print("Invalid guess");
		}
            }
       	 }

       		 scanner.close();
   		 }
	}
}	
