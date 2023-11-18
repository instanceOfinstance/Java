import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            generateAndWriteRandomNumbers();

                   System.out.print("Do you want to generate more random numbers? (yes/no): ");
            String userChoice = scanner.next().toLowerCase();

            if (!userChoice.equals("yes")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

        } while (true);

               scanner.close();
    }

    private static void generateAndWriteRandomNumbers() {
        String filePath = "random_numbers.csv";

        try {

            FileWriter fileWriter = new FileWriter(filePath);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < 10; i++) {
                int randomNumber = generateRandomNumber(1, 10);
                bufferedWriter.write(Integer.toString(randomNumber));
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

            System.out.println("Random numbers have been written to " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}

