import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVLogger {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get the first input
        System.out.print("Enter the first value: ");
        String value1 = scanner.nextLine();

        // Get the second input
        System.out.print("Enter the second value: ");
        String value2 = scanner.nextLine();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Specify the CSV file path
        String filePath = "log.csv";

        try {
            // Create a FileWriter object with append mode set to true
            FileWriter fileWriter = new FileWriter(filePath, true);

            // Create a BufferedWriter object to write to the file
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write the values to the CSV file separated by a comma
            bufferedWriter.write(value1 + "," + value2);
            // Add a new line for the next entry
            bufferedWriter.newLine();

            // Close the BufferedWriter to flush and close the file
            bufferedWriter.close();

            System.out.println("Values logged to " + filePath);

        } catch (IOException e) {
            // Handle IO exceptions
            e.printStackTrace();
        }
    }
}

