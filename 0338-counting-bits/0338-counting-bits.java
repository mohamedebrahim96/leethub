import java.util.Arrays; 
class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        Arrays.fill(result, 0);

        for(int i = 1; i <= num; i++) {            
            int val = i;
            int count = 0;
            while(val > 0) {
                int isOne = val & 1;
                count += isOne;
                val = val >>> 1;
            }
            result[i] = count;
        }
        
        return result;
    }
}