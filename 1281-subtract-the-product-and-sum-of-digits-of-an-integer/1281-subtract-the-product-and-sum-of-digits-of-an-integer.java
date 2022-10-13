class Solution {
    public int subtractProductAndSum(int n) {
        int sumOfDigits = 0;
        int productOfDigits = 1;

        String number = Integer.toString(n);

        for (char s: number.toCharArray()){
            sumOfDigits += Character.getNumericValue(s);
            productOfDigits *= Character.getNumericValue(s);
        }


        return productOfDigits - sumOfDigits;
    }
}