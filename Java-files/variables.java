// Types of variables
 
int myNum = 5; 
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";

// Display variables

String name = "John";

// Display both text and a varible

System.out.println("Hello " + name);

// Use + to add a variable to another variable

String firstName = "John";
String lastName = "Doe";
String fullName = firstName + lastName;
System.out.println(fullName)

// For numerical values, the + works as a math operator 

int x = 5;
int y = 6;
System.out.println(x + y); // print the value of x + y 

// Declare many variables 

int x = 5, y = 6, z = 50;
System.out.println(x + y + z);

// One value to multiple variables

int x, y, z;
x = y = z = 50;
System.out.println(x + y + z);

// Good 
int minutesPerHour = 60;

// Ok, but not so easy to understand what m actually is
int m = 60;
