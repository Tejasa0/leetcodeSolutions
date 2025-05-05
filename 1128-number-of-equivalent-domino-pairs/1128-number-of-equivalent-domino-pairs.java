class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int ans = 0;
        int arr[] = new int[100];
        for (int curr[] : dominoes) {
            int target = curr[0] < curr[1] ? curr[0] * 10 + curr[1] : curr[1] * 10 + curr[0];
            ans += arr[target];
            arr[target]++;
        }
        return ans;
    }
}