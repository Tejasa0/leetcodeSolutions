class Solution {
    public String reverseParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Integer> lengthIndex = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                lengthIndex.push(ans.length());
            } else if (c != ')') {
                ans.append(c);
            } else {
                reverseString(ans, lengthIndex.pop(), ans.length() - 1);
            }
        }
        return ans.toString();
    }

    public void reverseString(StringBuilder ans, int start, int end) {
        while (start < end) {
            char tempChar = ans.charAt(start);
            ans.setCharAt(start++, ans.charAt(end));
            ans.setCharAt(end--, tempChar);
        }
    }
}