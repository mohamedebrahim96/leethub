class Solution {
    public int lengthOfLastWord(String s) {
          int count=0;
          String z=s.trim();
for(int i=z.length()-1;i>=0;i--)
{
    if(z.charAt(i)==' ')
    {
        break;
    }        
        else{
        count++;
    }
   }
  return count; 
}}