class Solution {
    public boolean isAnagram(String s, String t) {
       int length1= s.length();
       int length2= t.length();

       if(length1 != length2)   return false;

       HashMap<Character, Integer> hmS = new HashMap<Character, Integer>();
       HashMap<Character, Integer> hmT = new HashMap<Character, Integer>();

       char[] sArray= s.toCharArray();
       char[] tArray = t.toCharArray();

       for (char c : sArray){
           if(hmS.containsKey(c)){
               hmS.put(c,hmS.get(c)+1);
           }
           else{
               hmS.put(c,1);
           }
       }
        for (char c : tArray){
           if(hmT.containsKey(c)){
               hmT.put(c,hmT.get(c)+1);
           }
           else{
               hmT.put(c,1);
           }
       }

       if(hmS.equals(hmT)){
           return true;
       }
       return false;
    }
}

//there are two methods:
/* 
the brute force method for this is:
sort the two strings and check if they are the same strings...



the other more optimized method is using hashmap

the key here is the character and the value here is the count of times the character comes in the string

here we will have to create two hashmaps and then compare the values in each map

(we did not create a single map and stored the key values because there may be a possibility like
abcdabcc  and abcdabrr)
*/