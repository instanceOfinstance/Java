import java.util.Random;

public class randomNum {
	public static void main(String[] args) {
		Random random = new Random();
		int randomNumber = random.nextInt(8) + 2;
		System.out.println("Your number is: " + randomNumber);
	
		}
	}
