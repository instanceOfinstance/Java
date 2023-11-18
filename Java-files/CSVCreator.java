import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVCreator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for value 1
        System.out.print("Enter value 1: ");
        String value1 = scanner.nextLine();

        // Get user input for value 2
        System.out.print("Enter value 2: ");
        String value2 = scanner.nextLine();

        // Create CSV file with the provided values
        createCSVFile("output.csv", value1, value2);

        System.out.println("CSV file created successfully.");
    }

    private static void createCSVFile(String filename, String value1, String value2) {
        try (FileWriter writer = new FileWriter(filename)) {
            // Write the CSV header
            writer.append("Value1,Value2\n");

            // Write the user input values
            writer.append(value1)
                  .append(",")
                  .append(value2)
                  .append("\n");
        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
    }
}

