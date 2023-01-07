import java.lang.Integer;
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int r = x;
        int finalVal = 0;
        while (r != 0) {
            int remainder = r % 10;
            finalVal = finalVal * 10;
            finalVal = finalVal + remainder;
            r = r / 10;
      }
        if (x == finalVal) {
          return true;
        }
    return false;
    }
}