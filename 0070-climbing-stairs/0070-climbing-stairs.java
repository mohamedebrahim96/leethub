class Solution {
    public int climbStairs(int n) {
     int f=1;
     int s=0;
     int res=0;
     for(int i=0;i<n;i++)
     {
         res=f+s;
         s=f;
         f=res;
     } 
     return res; 
    }
}