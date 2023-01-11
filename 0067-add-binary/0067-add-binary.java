class Solution {
    public String rev(String s){
       String res="";
       for(int i=s.length()-1;i>=0;i--)res+=s.charAt(i);
       return res; 
    }
    public String addBinary(String a, String b) {
        String res="";
        int i=a.length()-1;
        int j=b.length()-1;
        int rem=0;
        while(i>=0 || j>=0){
           int sum=rem;
           if(i>=0){
               sum+=a.charAt(i--)-'0';
           }
           if(j>=0){
               sum+=b.charAt(j--)-'0';
           }
           rem=sum>1?1:0;
           res+=Integer.toString(sum%2);
        }
        if(rem!=0)
         res+=Integer.toString(rem);
       return rev(res);
             
    }
}