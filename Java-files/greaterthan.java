import java.util.Scanner;

public class greaterthan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for a number
        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();

        // Check if the number is greater than 1, 4, and 9
        if (userNumber > 9) {
            System.out.println(userNumber + " is greater than 9.");
        } else if (userNumber > 4) {
            System.out.println(userNumber + " is greater than 4 but not greater than 9.");
        } else if (userNumber > 1) {
            System.out.println(userNumber + " is greater than 1 but not greater than 4.");
        } else {
            System.out.println(userNumber + " is not greater than 1.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

