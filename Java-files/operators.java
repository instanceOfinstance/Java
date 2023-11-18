public class operators {
    public static void main(String[] args) {
        double n1 = 12;
        double n2 = 6;

        // addition
        System.out.println(n1 + n2); // 18
    
        // subtraction
        System.out.println(n1 - n2); // 6
        
        // multiplication
        System.out.println(n1 * n2); // 72

        // division
        System.out.println(n1 / n2); // 2

        // remainder (modulo/modulus)
        System.out.println(n1 % n2); // 0 

         // number = number + 15;
        int number = 12;
        number += 15;

        System.out.println(number);

        // number2 = number2 - 3;
        int number2 = 4;
        number2 -= 3;

        System.out.println(number2);

        // number3 = number3 * 2;
        int number3 = 4;
        number3 *= 2;

        System.out.println(number3);

        // number4 = number4 / 14;
        double number4 = 7;
        number4 /= 14;

        System.out.println(number4);

        // number5 = number5 % 14;
        double number5 = 10;
        number5 %= 14;

        System.out.println(number5);

        // is equal to 
        System.out.println(number2 == number3);

        // is not equal to 
        System.out.println(number2 != number3);

        // is greater than
        System.out.println(number2 > number2);

        // is less than 
        System.out.println(number2 < number3);

        // is greater than or equal to
        System.out.println(number2 >= number3);

        // is less than or equal to 
        System.out.println(number2 <= number3);

        // (and) returns true if both statements are true 
        System.out.println(number2 >= 19 && number2 <= 3);

        // (or) returns true if one of the statements is true 
        System.out.println(number2 >= 10 || number2 <= 3);

        // (not) reverses the result, returns true if the result is false
        boolean isStudent = false;
        boolean isLibraryMember = false;

        System.out.println(!isStudent || isLibraryMember);

        // increment, add 1
        int score = 0;
        int turns = 10;

        score++;

        // decrement, subtract 1 
        turns--;

        System.out.println(score);
        System.out.println(turns);
    }
}
