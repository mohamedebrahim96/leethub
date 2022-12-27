import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
     // sorting the array.
        Arrays.sort(strs);
    // storing the smallest.
        String smallest=strs[0];
    // storing the largest.
         String largest=strs[strs.length-1];
         String ans="";
    // comparing the both.
      for(int i=0;i<smallest.length();i++){
        if(smallest.charAt(i)==largest.charAt(i)){
            ans=ans+smallest.charAt(i);
        }
        else{
            break;
        }
      }
      return ans;
    }
}