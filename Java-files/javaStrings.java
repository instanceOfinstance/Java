public class javaStrings {
	static void stringVariable() {
		String greeting = "Hello";
		System.out.println(greeting);
	}
	
	static void stringLength() {
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
	}

	static void moreStringMethods() {
		String hello = "Hello World";
		System.out.println(hello.toUpperCase()); // Outputs "HELLO WORLD"
		System.out.println(hello.toLowerCase()); // Outputs "hello world"
	}

	static void findACharacter() {
		String locate = "Please locate where 'xylophone' occurs!";
		System.out.println(locate.indexOf("xylophone")); // Outputs 21
	}

	static void stringConcatenation() {
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName); // Outputs "John Doe"
	}

	// you can also use the concat method 
	
	static void concatMethod() {
		String first = "Lewis";
		String last = "Hamilton";
		System.out.println(first.concat(last)); // Outputs LewisHamilton
	}

	// java uses the + operator for both addition and concatenation
	
	static void addNum() {
		int x = 10;
		int y = 20;
		int z = x + y; // z will be 30 (an integer) 
		System.out.println(z);
	}

	// If you add two strings, the result will be a string concatenation
	
	static void addString() {
		String a = "10";
		String b = "20";
		String c = a + b; // c will be 1020 (a String)
		System.out.println(c);
	}

	// If you add a number and a string, the result will be a string concatenation

	static void numAndString() {
		String d = "10";
		int e = 20;
		String f = d + e; // f will be 1020 (a String)
		System.out.println(f);
	}

	// an escape sequence must be added to include a double quote

	static void quoteEscape() {
		String doubleQuote = "We are the so-called \"Bantu peoples\" from the west.";
		System.out.println(doubleQuote);
	}

	// escape sequence for a single quote 

	static void singleQuoteEscape() {
		String ok = "It\'s alright.";
		System.out.println(ok);	
	}

	// escape sequence for a singlebacklash

	static void singleBackslash() {
		String backs = "The character \\ is called backslash.";
		System.out.println(backs);
	}	 

	// add the method to demonstrate 

	public static void main(String[] args) {
		stringVariable();
		stringLength();
		moreStringMethods();
		findACharacter();
		stringConcatenation();
		concatMethod();
		addNum();
		addString();
		numAndString();
		quoteEscape();	
		singleQuoteEscape();
		singleBackslash();
	}
}
	
