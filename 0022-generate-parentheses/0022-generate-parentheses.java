class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder current, int openCount, int closeCount, int n) {
        if (openCount == n && closeCount == n) {
            result.add(current.toString());
            return;
        }
        if (openCount < n) {
            backtrack(result, current.append("("), openCount + 1, closeCount, n);
            current.deleteCharAt(current.length() - 1);
        }
        if (closeCount < openCount) {
            backtrack(result, current.append(")"), openCount, closeCount + 1, n);
            current.deleteCharAt(current.length() - 1);
        }
    }
}