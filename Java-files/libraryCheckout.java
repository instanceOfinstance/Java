/* In order to checkout a book a person must be either a student or 
a member of the library */

public class libraryCheckout {
    public static void main(String[] args) {
        boolean isStudent = false;
        boolean isLibraryMember = false;

        // is the person a student or library member?
        // System.out.println(isStudent || isLibraryMember);
        
        // reverse the result, returns false if the statement is true 
        System.out.println(!isStudent || isLibraryMember);

    }
}