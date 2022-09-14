class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        
        HashMap<Character,Integer> m1=new HashMap<Character,Integer>();//Creating HashMap  
        HashMap<Character,Integer> m2=new HashMap<Character,Integer>();//Creating HashMap  

        String new_word = t;
         for(Integer i = 0; i < s.length(); i++) {
            //if(!map.containsKey(s.charAt(i))){
            //  map.put(s.charAt(i),t.charAt(i));
          // new_word = t.replaceAll(String.valueOf(t.charAt(i)),String.valueOf(s.charAt(i)));
            if(m1.put(s.charAt(i), i) != m2.put(t.charAt(i), i)) {
                return false;
            }

        }
        
        
        return true ;
        
    }
}