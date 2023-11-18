import java.util.Scanner;

public class pcc {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the initial and final values
        System.out.print("Enter the initial value: ");
        double initialValue = scanner.nextDouble();

        System.out.print("Enter the final value: ");
        double finalValue = scanner.nextDouble();

        // Calculate the percent change
        double percentChange = calculatePercentChange(initialValue, finalValue);

        // Display the result
        System.out.println("The percent change is: " + percentChange + "%");

        // Close the Scanner
        scanner.close();
    }

    // Method to calculate percent change
    private static double calculatePercentChange(double initialValue, double finalValue) {
        // Formula: ((finalValue - initialValue) / |initialValue|) * 100
        return ((finalValue - initialValue) / Math.abs(initialValue)) * 100;
    }
}

