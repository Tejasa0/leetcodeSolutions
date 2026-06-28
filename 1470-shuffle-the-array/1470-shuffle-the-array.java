class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[n * 2];
        int j = n;
        int k = 0;
        for (int i = 0; i < n * 2; i++) {
            ans[i++] = nums[k++];
            ans[i] = nums[j++];
        }
        return ans;
    }
}