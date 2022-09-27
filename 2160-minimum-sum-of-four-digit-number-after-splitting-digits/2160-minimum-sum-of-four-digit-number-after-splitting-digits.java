class Solution {
    public int minimumSum(int num) {
        char[] chars;

        chars = (""+num).toCharArray();
        Arrays.sort(chars);

        int num1 = Integer.parseInt("" + chars[0] + chars[2]);
        int num2 = Integer.parseInt("" +chars[1] + chars[3]);

        return num1+num2;
    }
}