import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (ch == ')' && stack.peek() != '(') {
                    return false;
                }
                if (ch == '}' && stack.peek() != '{') {
                    return false;
                }
                if (ch == ']' && stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] testCases = {
            "()[]{}",   
            "(]",       
            "([)]",     
            "{[]}",     
            "",         
            "[({})]"    
        };

        for (String s : testCases) {
            boolean result = solution.isValid(s);
            System.out.println("Input: \"" + s + "\" -> Is valid? " + result);
        }
    }
}
