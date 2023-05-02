class Solution {
    public int missingNumber(int[] nums) {
        int res;
        int n = nums.length;
        res = n*(n+1)/2;
        int temp =0;
        for(int a:nums){
            temp+=a;
        }
        return res-temp;
    }
}