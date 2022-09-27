class Solution {
    public int minimumSum(int num) {
        char[] ch = (num+"").toCharArray();
        Arrays.sort(ch);
        return Integer.parseInt(""+ch[0] +ch[2]) + Integer.parseInt(""+ch[1] +ch[3]);
    }
}