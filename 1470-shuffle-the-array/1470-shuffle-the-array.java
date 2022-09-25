class Solution {
    public int[] shuffle(int[] nums, int n) {
        
         int[] shuffeld = new int[n*2];

        for(int i=0;i<n;i++){
            shuffeld[i*2] = nums[i];
            shuffeld[i*2+1] = nums[n+i];

        }
        return shuffeld;
    }
}