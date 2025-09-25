import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort to group duplicates
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) {
        res.add(new ArrayList<>(temp)); // Add current subset
        
        for (int i = start; i < nums.length; i++) {
            // Step 2: Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) continue;
            
            temp.add(nums[i]);                 // Choose
            backtrack(res, temp, nums, i + 1); // Explore
            temp.remove(temp.size() - 1);      // Un-choose
        }
    }
}