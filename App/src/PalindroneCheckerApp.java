/**
 * ============================================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ============================================================================
 * * Use Case 4: Character Array Based Validation
 * * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 * * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 * * This reduces extra memory usage.
 * * @author Developer
 * @version 4.0
 */
import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome checker app management");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        // Declare and initialize the input string
        String input = scanner.nextLine();

        // Convert the string into a character array
        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning
        int start = 0;

        // Initialize pointer at the end
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;


        // Continue comparison until pointers cross
        while (start < end) {
            // Compare characters at the current pointers
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Exit loop early if mismatch found
            }

            // Move pointers towards the center
            start++;
            end--;
        }

        // Display the result
        if (isPalindrome) {
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : true");
        } else {
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : false");
        }

        scanner.close();
    }
}