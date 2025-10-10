
import java.util.Stack;

public class Driver {
    public static void main(String[] args) {
        System.out.println("=== Stacks Lab Demo ===");

        // Demo warmup
        int demo = 12340;
        System.out.println("reverseDigits(" + demo + ") -> " + StackWarmup.reverseDigits(demo));

        // Demo BalancedBrackets
        String s1 = "{[()]}()[]";
        String s2 = "{[(])}";
        System.out.println("isBalanced(" + s1 + ") -> " + BalancedBrackets.isBalanced(s1));
        System.out.println("isBalanced(" + s2 + ") -> " + BalancedBrackets.isBalanced(s2));

        // Demo maxPreserving
        Stack<Integer> stack = new Stack<>();
        stack.push(42); stack.push(-3); stack.push(17); stack.push(99); stack.push(5);
        System.out.println("Original stack before maxPreserving: " + stack);
        System.out.println("maxPreserving(" + stack + ") -> " + StackAlgorithms.maxPreserving(stack));
        System.out.println("Stack after maxPreserving (should match original): " + stack);
    }
}
