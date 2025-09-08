class Solution {
    public int[] sumZero(int n) {
        int curr = 0;
        int ans[] = new int[n];
        for (int i = 1; i <= n / 2; i++) {
            ans[curr++] = i;
            ans[n-curr] = -i;
        }
        if (n % 2 == 1)
            ans[curr] = 0;
        return ans;
    }
}