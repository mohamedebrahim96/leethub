import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        // If the current string is valid and complete
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // Add "(" if we still have some left
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        // Add ")" if it won’t break validity
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}