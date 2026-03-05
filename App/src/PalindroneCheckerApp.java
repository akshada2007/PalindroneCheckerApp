import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * ============================================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ============================================================================
 * * Use Case 7: Deque-Based Optimized Palindrome Checker
 * * Description:
 * This class validates a palindrome using a Deque
 * (Double-Ended Queue), which allows insertion and
 * deletion from both the front and rear ends.
 * * At this stage, the application:
 * - Inserts characters into the deque
 * - Removes the first and last characters simultaneously
 * - Compares them until the deque is empty or has one element
 * * This approach provides optimized data handling without
 * extra reversal structures.
 * * @author Developer
 * @version 7.0
 */
public class UseCase7PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome checker app management");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        // Declare and initialize the input string
        String input = scanner.nextLine();

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Insert each character into the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;



        // Compare characters from both ends until the deque becomes empty or 1 remains
        while (deque.size() > 1) {
            // Remove from front and rear
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            // Compare front and rear elements
            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}