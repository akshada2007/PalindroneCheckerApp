/**
 * =========================================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * =========================================================================
 * * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 * * Description:
 * This class validates a palindrome by first normalizing the
 * input string to ignore casing and non-alphanumeric characters
 * (like spaces).
 * * Key Concepts:
 * - String Preprocessing: Cleaning the input for uniform comparison.
 * - Regular Expressions: Using regex to strip unwanted characters.
 * - Logic Application: Reusing fundamental palindrome checks on
 * normalized data.
 * * @author Developer
 * @version 10.0
 */
public class UseCase10PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string with spaces and mixed case
        String input = "Race Car";

        // Step 1: Normalize the string (Normalization Flow)
        // Remove all non-alphanumeric characters using Regex and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Apply palindrome logic
        boolean isPalindrome = checkPalindrome(normalized);

        // Output the results
        System.out.println("Input : " + input);
        System.out.println("Normalized : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Helper method to check palindrome status.
     * @param str The cleaned string
     * @return true if palindrome, false otherwise
     */
    private static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}