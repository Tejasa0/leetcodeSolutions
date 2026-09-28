class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int openBracets = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                openBracets++;
            } else if (ch == ')') {
                max = Math.max(max, openBracets);
                openBracets--;
            }
        }
        return max;
    }
}