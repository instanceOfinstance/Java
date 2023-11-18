import java.util.Scanner;

public class restaurantBill {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter bill amount: ");
	double bill = scanner.nextDouble();

	double taxes = (bill * 0.0825);
	
	double tip = (bill * 0.20);

	double total = (bill + taxes + tip);

	System.out.println("Subtotal: " + bill);
	System.out.println("Tip: " + tip);
	System.out.println("Taxes: " + taxes);
	System.out.println("Total: " + total);
	}
}
