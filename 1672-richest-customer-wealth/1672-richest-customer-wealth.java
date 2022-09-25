class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        int sum_small = 0;
        
        for(int i=0;i<accounts.length; i++){
            for(int j=0;j<accounts[i].length; j++){
                sum_small += accounts[i][j];
            }
            if(max<=sum_small){
                max = sum_small;
                sum_small = 0;
            }else{
                sum_small = 0;
            }
           
        }
        
        
        return max; 
    }
}