class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int index  = 0;
        if(s.length() == 0){
            return true;
        }
        
        for(int i=0;i<t.length();i++){
            if (s.charAt(index) == t.charAt(i)){
                index++;
                if(index == s.length()){
                     return true;
                }
            }
        }
        
        
       return false;
    }
}