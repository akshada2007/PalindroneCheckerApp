import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("Welcome to palindrome checker app management");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        // Declare and initialize the input string
        String input = scanner.nextLine();

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        // Stack naturally reverses the order
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;


        // Iterate again through original string and compare with popped values
        for (char c : input.toCharArray()) {
            // Pop operation removes characters in reverse order
            if (c != stack.pop()) {
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