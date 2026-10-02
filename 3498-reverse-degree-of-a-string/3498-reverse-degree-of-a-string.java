class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int cnt = 1;
        for (char c : s.toCharArray()) {
            ans += (cnt++) * (('z' - c) + 1);
        }
        return ans;
    }
}