import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char newChar = chars[i];
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                stack.push(chars[i]);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }
                Character popped = stack.pop();
                if (popped == '(') {
                    if (newChar != ')') {
                        return false;
                    }
                } else if (popped == '{') {
                    if (newChar != '}') {
                        return false;
                    }
                } else if (popped == '[') {
                    if (newChar != ']') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();

    }
}