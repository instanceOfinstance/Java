import java.util.Scanner;

public class F2C2 {
    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double convertToCelsius() {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        F2C2 converter = new F2C2();

        System.out.print("Enter temperature in Fahrenheit: ");

        double inputFahrenheit = scanner.nextDouble();
        converter.setFahrenheit(inputFahrenheit);

        System.out.printf("Temperature in Fahrenheit: %.2f%n", converter.getFahrenheit());

        double celsiusTemperature = converter.convertToCelsius();

        System.out.printf("Temperature in Celsius: %.2f%n", celsiusTemperature);

        scanner.close();
    }
}

