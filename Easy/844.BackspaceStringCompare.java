class Solution {
    public boolean backspaceCompare(String s, String t) {
        return newString(s).equals(newString(t));
    }

    private String newString(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }
}