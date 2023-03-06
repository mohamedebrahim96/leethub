class Solution {
    public int titleToNumber(String columnTitle) {
        int res  = 0;
        if(columnTitle.length() == 1){
            return (int)columnTitle.charAt(0) - 64;
        }
        else{
            int j = 0;
            for(int i = columnTitle.length() - 1; i >= 0; i--){
                res += Math.pow(26, j)*((int)columnTitle.charAt(i) - 64);
                j++;
            } 
        }
        return res;
    }
}