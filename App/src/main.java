/**
 * ============================================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ============================================================================
 * * Use Case 11: Object-Oriented Palindrome Service
 * * Description:
 * This class demonstrates OOPS principles by delegating the
 * validation logic to a dedicated PalindromeService class.
 * * Key Concepts:
 * - Encapsulation: Hiding the implementation details within a class.
 * - Single Responsibility Principle (SRP): The service class only
 * handles validation, while the App class handles execution.
 * * @author Developer
 * @version 11.0
 */

// Service Class to encapsulate palindrome logic
class PalindromeService {

    /**
     * Checks if a string is a palindrome using an internal array-based logic.
     * @param input The string to validate
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        if (input == null) return false;

        // Internal data handling: String to char array
        char[] characters = input.toLowerCase().toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            if (characters[left] != characters[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string
        String text = "Deified";

        // Create an instance of the PalindromeService (Encapsulation)
        PalindromeService service = new PalindromeService();

        // Use the exposed method
        boolean result = service.checkPalindrome(text);

        // Output the results
        System.out.println("Input : " + text);
        System.out.println("Is Palindrome? : " + result);
    }
}