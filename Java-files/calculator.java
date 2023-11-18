import java.util.Scanner;

public class calculator {
	private double num1;
	private double num2;
	private double result;

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void add() {
		result = num1 + num2;
	}

	public void subtract() {
		result = num1 - num2;
	}
	
	public void multiply() {
		result = num1 * num2;
	}

	public void divide() {
		result = num1 / num2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		calculator calculator = new calculator();

		System.out.print("Enter Num1: ");
		double inputNum1 = scanner.nextDouble();
		calculator.setNum1(inputNum1);

		System.out.print("Enter Num2: ");
		double inputNum2 = scanner.nextDouble();
		calculator.setNum2(inputNum2);

		calculator.add();
		System.out.println("Addition Result: " + calculator.getResult());

		calculator.subtract();
		System.out.println("Subtraction Result: " + calculator.getResult());
		
		calculator.multiply();
		System.out.println("Multiplication Result: " + calculator.getResult());

		scanner.close();
	}
}


