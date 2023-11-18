import java.util.Scanner;

public class calc2 {
    private double operand1;
    private double operand2;
    private double result;

    // Getter and setter methods for operand1
    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    // Getter and setter methods for operand2
    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    // Getter method for result
    public double getResult() {
        return result;
    }

    // Setter method for result (not recommended for a calculator, but included for completeness)
    public void setResult(double result) {
        this.result = result;
    }

    // Method to perform addition
    public void add() {
        result = operand1 + operand2;
    }

    // Method to perform subtraction
    public void subtract() {
        result = operand1 - operand2;
    }

    // Method to perform multiplication
    public void multiply() {
        result = operand1 * operand2;
    }

    // Method to perform division
    public void divide() {
        if (operand2 != 0) {
            result = operand1 / operand2;
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calc2 calculator = new calc2();

        // Get input for operand1
        System.out.print("Enter operand1: ");
        double inputOperand1 = scanner.nextDouble();
        calculator.setOperand1(inputOperand1);

        // Get input for operand2
        System.out.print("Enter operand2: ");
        double inputOperand2 = scanner.nextDouble();
        calculator.setOperand2(inputOperand2);

        // Perform arithmetic operations
        calculator.add();
        System.out.println("Addition Result: " + calculator.getResult());

        calculator.subtract();
        System.out.println("Subtraction Result: " + calculator.getResult());

        calculator.multiply();
        System.out.println("Multiplication Result: " + calculator.getResult());

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

