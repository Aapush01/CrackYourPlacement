class Solution {
    public int largestRectangleArea(int[] heights) {
          if (heights == null || heights.length < 1) return 0;
        int res = 0;
        int len = heights.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < len; i++) {
            while (stack.peek() != -1 && heights[i] <= heights[stack.peek()]) {
                res = Math.max(res, heights[stack.pop()] * (i - stack.peek() - 1));
            }
            stack.push(i);
        }
        while (stack.peek() != -1) {
            res = Math.max(res, heights[stack.pop()] * (len - stack.peek() - 1));
        }
        return res;
    }
}
