package ValidParentheses;

import java.util.Stack;

public class Solution {
  public boolean isValid(String s) {
    if (s.length() % 2 != 0) {
      return false;
    }

    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ) {
        stack.push(s.charAt(i));
      } else if (stack.empty()) {
        return false;
      } else if (s.charAt(i) == ')' && stack.pop() != '(') {
        return false;
      } else if (s.charAt(i) == '}' && stack.pop() != '{') {
        return false;
      } else if (s.charAt(i) == ']' && stack.pop() != '[') {
        return false;
      }
    }
    
    if (!stack.empty()) {
      return false;
    }
    
    return true;
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    // boolean res = sol.isValid("()");
    // boolean res = sol.isValid("()[]{}");
    // boolean res = sol.isValid("({})[{[(]}]");
    boolean res = sol.isValid("(]");
    System.out.println(res);
  }
  
}
