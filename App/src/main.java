import java.util.*;

/**
 * ============================================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ============================================================================
 * * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * * Description:
 * This class implements the Strategy Design Pattern, allowing the
 * selection of different palindrome algorithms dynamically.
 * * Key Concepts:
 * - Interface: Defines a common contract for all strategies.
 * - Polymorphism: Allows different implementations to be used interchangeably.
 * - Strategy Pattern: Encapsulates algorithms and makes them swappable.
 * * @author Developer
 * @version 12.0
 */

// 1. Define the Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// 2. Implement Stack-Based Strategy
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return input.equalsIgnoreCase(reversed.toString());
    }
}

// 3. Implement Deque-Based Strategy
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toLowerCase().toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// 4. Context Class to use the Strategy
class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.check(input);
    }
}

public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "radar";
        PalindromeContext context = new PalindromeContext();

        // Dynamically inject Stack Strategy
        context.setStrategy(new StackStrategy());
        System.out.println("Using Stack Strategy: " + context.executeStrategy(text));

        // Dynamically inject Deque Strategy
        context.setStrategy(new DequeStrategy());
        System.out.println("Using Deque Strategy: " + context.executeStrategy(text));
    }
}
