public class javaArrays {

	// Initialize a variable "cars", an array of car brands

	static void arrayOfStrings {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	}
	
	// Initialize a variable "myNum", an array of numbers

	static void arrayOfNumbers {
		int[] myNum = {10, 20, 30, 40};
	}

	// Access an array element by referring to the index number

	System.out.println(cars[0]); // Ouputs Volvo
	
	// Change the value of an element by referring to the index number 

	cars[0] = "Opel";
	System.out.println(cars[0]); // Now outputs Opel instead of Volvo
	
	// Find out how many elements an array has with the "length" property

	System.out.println(cars.length); // Outputs 4
	
	
