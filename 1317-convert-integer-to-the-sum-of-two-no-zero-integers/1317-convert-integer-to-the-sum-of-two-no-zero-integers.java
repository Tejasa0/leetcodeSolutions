class Solution {
    public int[] getNoZeroIntegers(int n) {
        int ans[] = new int[2];
        for (int i = 1; i < n; i++) {
            int a = i;
            int b = n - i;
            if (validNonZero(a) && validNonZero(b)) {
                ans[0] = a;
                ans[1] = b;
                return ans;
            }
        }
        return ans;
    }

    public boolean validNonZero(int n) {
        while (n > 0) {
            if (n % 10 == 0)
                return false;
            n = n / 10;
        }
        return true;
    }
}