import java.util.*;

/**
 * ============================================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ============================================================================
 * * Use Case 13: Performance Comparison
 * * Description:
 * This class compares the execution time of different palindrome
 * detection algorithms: Iterative (Array), Deque, and Recursive.
 * * Key Concepts:
 * - System.nanoTime(): Captures high-resolution time for benchmarking.
 * - Algorithm Comparison: Analyzes efficiency across different approaches.
 * * @author Developer
 * @version 13.0
 */
public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "topspot"; // Sample palindrome for testing

        System.out.println("--- Palindrome Performance Comparison ---");
        System.out.println("Input: " + input + "\n");

        // 1. Measure Iterative Approach (Array/Two-Pointer)
        long startIterative = System.nanoTime();
        boolean res1 = isPalindromeIterative(input);
        long endIterative = System.nanoTime();
        displayResult("Iterative (Array)", res1, endIterative - startIterative);

        // 2. Measure Deque Approach
        long startDeque = System.nanoTime();
        boolean res2 = isPalindromeDeque(input);
        long endDeque = System.nanoTime();
        displayResult("Deque (ArrayDeque)", res2, endDeque - startDeque);

        // 3. Measure Recursive Approach
        long startRecursive = System.nanoTime();
        boolean res3 = isPalindromeRecursive(input);
        long endRecursive = System.nanoTime();
        displayResult("Recursive (Stack)", res3, endRecursive - startRecursive);
    }

    private static void displayResult(String method, boolean result, long time) {
        System.out.printf("%-20s | Result: %-5b | Time: %d ns\n", method, result, time);
    }

    // Iterative Logic
    public static boolean isPalindromeIterative(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }

    // Deque Logic
    public static boolean isPalindromeDeque(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    // Recursive Logic
    public static boolean isPalindromeRecursive(String str) {
        if (str.length() <= 1) return true;
        if (str.charAt(0) != str.charAt(str.length() - 1)) return false;
        return isPalindromeRecursive(str.substring(1, str.length() - 1));
    }
}
