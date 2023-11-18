// Widening casting (automatic) converts a smaller type to a larger type size

// Narrrowing casting (manual) converts a larger type to a smaller size type 

public class javaTypeCasting {
	static void wideningCasting() {
		int myInt = 9;
		double  myDouble = myInt; // Automatic casting: int to double 
		
		System.out.println(myInt); // Outputs 9
		System.out.println(myDouble); // Outputs 9.0
	}
	static void narrowingCasting() {
		double aDouble = 9.78d;
		int anInt = (int) aDouble; // Manual casting: double to int				
		System.out.println(aDouble); // Outputs 9.78
		System.out.println(anInt); // Outputs 9
	}
		public static void main(String[] args) {
			wideningCasting();
			narrowingCasting();
	}
}
			


