import java.util.*;

public class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;

        int maxArea = 0;
        int cols = matrix[0].length;
        int[] heights = new int[cols];

        for (char[] row : matrix) {
            // Build histogram heights
            for (int i = 0; i < cols; i++) {
                if (row[i] == '1') {
                    heights[i] += 1;
                } else {
                    heights[i] = 0;
                }
            }

            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }

    private int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        int[] extendedHeights = Arrays.copyOf(heights, heights.length + 1); // add sentinel 0
        for (int i = 0; i < extendedHeights.length; i++) {
            while (!stack.isEmpty() && extendedHeights[i] < extendedHeights[stack.peek()]) {
                int height = extendedHeights[stack.pop()];
                int width = stack.isEmpty() ? i : i - 1 - stack.peek();
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }
}