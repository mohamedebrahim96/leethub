import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty()) {
            return "";
        }

        // Frequency map for characters in t
        Map<Character, Integer> tFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }

        // Initialize window variables
        int required = tFreq.size(); // Number of unique chars in t
        int formed = 0; // Number of chars with required frequency in window
        Map<Character, Integer> windowFreq = new HashMap<>(); // Frequency map for current window

        // Pointers and result tracking
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        String minWindowSubstr = "";

        while (right < s.length()) {
            // Add character at right pointer to window
            char c = s.charAt(right);
            windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);

            // Check if this character contributes to forming a valid window
            if (tFreq.containsKey(c) && windowFreq.get(c).intValue() == tFreq.get(c).intValue()) {
                formed++;
            }

            // Try to shrink the window from the left
            while (left <= right && formed == required) {
                c = s.charAt(left);

                // Update minimum window if current window is smaller
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minWindowSubstr = s.substring(left, right + 1);
                }

                // Remove character at left pointer from window
                windowFreq.put(c, windowFreq.get(c) - 1);
                if (tFreq.containsKey(c) && windowFreq.get(c).intValue() < tFreq.get(c).intValue()) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : minWindowSubstr;
    }
}