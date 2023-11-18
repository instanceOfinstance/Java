import java.util.Scanner;

public class romanNumerals {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double number = scanner.nextDouble();

		if (number > 10) {
			System.out.print("Error, numbers over 10 are not allowed");
		}
		else if (number == 1) {
			System.out.print("Your number in roman numerals is I");
		}
		else if (number == 2) {
			System.out.print("Your number in roman numerals is II");
		}		
		else if (number == 3) {
			System.out.print("Your number in roman numerals is III");
		}
		else if (number == 4) {
			System.out.print("Your number in roman numerals is IV");
		}
		else if (number == 5) {
			System.out.print("Your number in roman numberals is V");
		}
		else if (number == 6) {
			System.out.print("Your number in roman numerals is VI");
		}
		else if (number == 7) {
			System.out.print("Your number in roman numerals is VII");
		}
		else if (number == 8) {
			System.out.print("Your number in roman numerals is VIII");
		}
		else if (number == 9 ) {
			System.out.print("Your number in roman numerals is IX");
		}
		else if (number == 10) {
			System.out.print("Your number in roman numerals is X");
		}
		
		scanner.close();	
	}
}


			
		
	
