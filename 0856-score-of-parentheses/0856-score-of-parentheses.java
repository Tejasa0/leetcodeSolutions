class Solution {
    public int scoreOfParentheses(String s) {
        int openCount = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                openCount++;
            else {
                openCount--;
                if (s.charAt(i - 1) == '(')
                    ans += 1 << openCount;
            }
        }
        return ans;
    }
}