class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2 * n; i++) {
            sb.append(' ');
        }
        backtrack(sb, 0, 0, 0, n, result);
        return result;
    }

    private void backtrack(StringBuilder sb, int index, int open, int close, int n,
            List<String> result) {

        if (index == 2 * n) {
            result.add(sb.toString());
            return;
        }

        if (open < n) {
            sb.setCharAt(index, '(');
            backtrack(sb, index + 1, open + 1, close, n, result);
        }

        if (close < open) {
            sb.setCharAt(index, ')');
            backtrack(sb, index + 1, open, close + 1, n, result);
        }
    }
}