import java.util.*;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int n, int k, List<Integer> path, List<List<Integer>> result) {
        // If the current path has k numbers, add to result
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        // Loop through possible choices
        for (int i = start; i <= n; i++) {
            path.add(i);                   // choose
            backtrack(i + 1, n, k, path, result); // explore
            path.remove(path.size() - 1);  // un-choose
        }
    }
}