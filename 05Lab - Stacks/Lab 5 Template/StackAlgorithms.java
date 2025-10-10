
import java.util.Stack;

/**
 * Part D — Algorithms that must PRESERVE the original stack.
 * Runtime: O(N) for N = stack size
 */

public class StackAlgorithms {

    /**
     * Returns the maximum value in s and restores s to its original state.
     * Precondition: s != null and s.size() > 0
     */
    public static int maxPreserving(Stack<Integer> s) {
        if (s.isEmpty()) {
            throw new IllegalArgumentException("Stack must be non-empty");
        }
        // TODO: Use a helper stack 'backup'
        Stack<Integer> backup = new Stack<>();

        int max = Integer.MIN_VALUE;
        // TODO: Pop all items, track max, push to backup
        while(!s.isEmpty()){
            int x = s.pop();
            max = Math.max(max,x);
            backup.push(x);
        }

        // TODO: Restore items from backup back to s to preserve original order
        while(!backup.isEmpty()){
            s.push(backup.pop());
        }
        // TODO: return max
        return max; // TODO
    }

    // Optional self-test
    public static void main(String[] args) {
        System.out.println("StackAlgorithms self-test (optional).");
        // TODO: Build a stack and verify it is unchanged after maxPreserving
    }
}
