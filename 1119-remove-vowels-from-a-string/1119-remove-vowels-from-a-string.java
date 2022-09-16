class Solution {
    public String removeVowels(String s) {
        
        
        s = s.replaceAll("a", "");
        s = s.replaceAll("e", "");
        s = s.replaceAll("i", "");
        s = s.replaceAll("o", "");
        s = s.replaceAll("u", "");

        
        

        
        return s;         
    }
}