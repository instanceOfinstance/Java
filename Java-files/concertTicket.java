import java.util.Scanner;

public class concertTicket {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the number of attendees: ");
	double attendees = scanner.nextDouble();

	double subtotal = (attendees * 85.47);

	double taxes = (subtotal * 0.0825);

	double discount = (subtotal * 0.14);

	double total = (subtotal - discount) + taxes;

	System.out.printf(String.format("Subtotal: $%.2f Tax: $%.2f Discount: $%.2f Total: $%.2f ", subtotal, taxes, discount, total));
	}
}


