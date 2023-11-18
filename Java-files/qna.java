import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String csvFile = "quiz_log.csv";

        try (FileWriter fileWriter = new FileWriter(csvFile);
             CSVWriter csvWriter = new CSVWriter(fileWriter)) {
            String[] headerRecord = {"Question", "User Answer", "Correct Answer"};
            csvWriter.writeNext(headerRecord);

            // Define an array of questions and corresponding correct answers
            String[] questions = {
                "What is the capital of Australia?",
                "Who wrote the famous play 'Romeo and Juliet'?",
                "In which year did the first human set foot on the moon?"
            };

            String[] correctAnswers = {
                "Canberra",
                "William Shakespeare",
                "1969"
            };

            Random random = new Random();

            for (int i = 0; i < 3; i++) {
                // Generate a random index to select a question
                int randomIndex = random.nextInt(questions.length);

                // Get the random question and its correct answer
                String question = questions[randomIndex];
                String correctAnswer = correctAnswers[randomIndex];

                // Display the question to the user
                System.out.println("Question " + (i + 1) + ": " + question);

                // Get the user's answer
                String userAnswer = scanner.nextLine();

                // Check if the user's answer is correct
                boolean isCorrect = userAnswer.equalsIgnoreCase(correctAnswer);

                // Log the question, user answer, and correctness to CSV
                String[] logRecord = {question, userAnswer, isCorrect ? "Correct" : "Incorrect"};
                csvWriter.writeNext(logRecord);
            }

            System.out.println("Quiz completed. Check '" + csvFile + "' for results.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
