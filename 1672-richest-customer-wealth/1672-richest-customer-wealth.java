class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

       
        
        for(int i=0;i<accounts.length; i++){
            int sum_small = 0;
            for(int j=0;j<accounts[i].length; j++){
                sum_small += accounts[i][j];
            }
            max = Math.max(max,sum_small);

           
        }
        
        
        return max; 
    }
}