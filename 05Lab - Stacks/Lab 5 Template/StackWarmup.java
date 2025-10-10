
import java.util.Stack;

/**
 * Part A — small stack warmups.
 * Runtime notes:
 *  - reverseDigits: O(D) where D is # of digits
 *  - fromArray: O(N) where N is array length
 */
public class StackWarmup {

    /**
     * Uses a stack to reverse the digits of n.
     * Examples: 12340 -> 4321, 0 -> 0, -123 -> -321
     */
    public static int reverseDigits(int n) {
        // TODO: Handle sign; work with abs value
        boolean isNeg = n < 0;
        int abs = Math.abs(n);

        if(abs <= 9){
            return n;
        }
        // TODO: Push each digit (n % 10) onto a Stack<Integer>
        Stack<Integer> st = new Stack<>();

        while(abs > 0){
            st.push(abs%10);
            abs = abs / 10;
        }
        // TODO: Pop digits to reconstruct reversed number
        int rev = 0;

        int ogSize = st.size();
        Stack<Integer> revSt = new Stack<>();
        for(int i  = ogSize; i > 0; i--) {
            revSt.push(st.pop());
        }

        while(!revSt.isEmpty()){
            rev = rev * 10 + revSt.pop();
        }
        // TODO: Restore sign and return
        if(isNeg){
            rev = -rev;
        }
        return rev; // TODO: replace with result
    }

    /**
     * Pushes items of a[] into a stack so that a[a.length-1] becomes the top.
     * If a is null, throw IllegalArgumentException.
     */
    public static Stack<Integer> fromArray(int[] a) {
        // TODO: Validate input
        if(a == null){
            throw new IllegalArgumentException("Array is empty.");
        }
        // TODO: Create a new Stack<Integer>
        Stack<Integer> st = new Stack<>();

        // TODO: Push each element of a in order so last element ends up on top
        for(int i = 0; i < a.length-1; i++){
            st.push(a[i]);
        }
        return st; // TODO: return the constructed stack
    }

    // Optional self-test
    public static void main(String[] args) {
        System.out.println("StackWarmup self-test (optional).");
        // TODO: Add quick checks if you want
    }
}
