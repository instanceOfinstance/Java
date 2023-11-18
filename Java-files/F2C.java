import java.util.Scanner;

public class F2C {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double tempf = scanner.nextDouble();

        double tempc = (tempf - 32) * 5 / 9;

        System.out.println("Temperature in Celsius: " + tempc);
    }
}
