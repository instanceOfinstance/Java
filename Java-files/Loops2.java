public class Loops2 {
	public static void main(String[] args) {
		int n = 0;
		
		while (n<=100) {
			if (n%3==0) {
				output = output + "Fizz";
			}

			if (n%5==0) {
				output = output + "Buzz";
			}
			
			if (output.equals("")) {
				System.out.println(n);
			
