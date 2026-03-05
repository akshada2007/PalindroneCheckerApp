/**
 * =========================================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * =========================================================================
 * * Use Case 9: Recursive Palindrome Checker
 * * Description:
 * This class validates a palindrome using recursion.
 * The method calls itself with a substring, comparing
 * the first and last characters at each step.
 * * Key Concepts:
 * - Recursion: Method calls itself.
 * - Base Condition: Stops recursion when string length is 0 or 1.
 * - Call Stack: Manages the sequence of recursive calls.
 * * @author Developer
 * @version 9.0
 */
public class UseCase9PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string
        String input = "level";

        // Perform recursive check
        boolean isPalindrome = isPalindromeRecursive(input);

        // Output the results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursive method to check if a string is a palindrome.
     * @param str The string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindromeRecursive(String str) {
        // Base Condition: If length is 0 or 1, it is a palindrome
        if (str.length() <= 1) {
            return true;
        }

        // Compare start and end characters
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // Recursive call with the inner substring
            return isPalindromeRecursive(str.substring(1, str.length() - 1));
        }

        // Characters do not match
        return false;
    }
}