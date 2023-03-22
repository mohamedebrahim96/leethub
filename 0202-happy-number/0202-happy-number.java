class Solution {
    public boolean isHappy(int n) {
        List<Integer> arr = new ArrayList<Integer>();
        while(n>0){
            int sum = 0;
            while(n>0){
                int k = n%10;
                sum+= k*k;
                n/=10;
            }
            if(arr.contains(sum)){
                return false;
            }else{
                arr.add(sum);
            }
            if(sum==1){
                return true;
            }
            n = sum;
        }
        return false;
    }
}