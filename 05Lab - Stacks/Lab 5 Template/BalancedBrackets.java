
import java.util.Stack;

/**
 * Part B — Balanced brackets using only Stack.
 * Runtime: O(N) for N = s.length()
 */
public class BalancedBrackets {

    /**
     * Returns true if s has balanced (), ignoring other chars.
     * Examples:
     *   "5+(9*4)" -> true
     *   "{[(]))}"     -> false
     */
    public static boolean isBalanced(String s) {
        // TODO: Create a Stack<Character>
        Stack<Character> st = new Stack<>();

        // TODO: Scan chars; on opening, push; on closing, check stack non-empty and matching pair
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '(' || c == '[' ||c == '{'){
                st.push(c);
            }

            if(c == ')' || c == ']' ||c == '}'){
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();

                if(c == ')' && top != '('){
                    return false;
                }
                if(c == ']' && top != '['){
                    return false;
                }
                if(c == '}' && top != '{'){
                    return false;
                }
            }
        }

        // TODO: After scan, return true only if stack is empty
        return st.isEmpty();
    }

    // Optional self-test
    public static void main(String[] args) {
        System.out.println("BalancedBrackets self-test (optional).");
        // TODO: Try some sample strings
    }
}
