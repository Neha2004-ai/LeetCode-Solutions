import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // base index for valid substring calculation
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i); // push index of '('
            } else {
                stack.pop(); // pop last '(' index
                if (stack.isEmpty()) {
                    stack.push(i); // reset base index
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }

    // Optional main method for quick testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.longestValidParentheses("(()"));     // Output: 2
        System.out.println(sol.longestValidParentheses(")()())"));  // Output: 4
        System.out.println(sol.longestValidParentheses(""));        // Output: 0
    }
}
