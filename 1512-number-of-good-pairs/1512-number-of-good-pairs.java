class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0; 
        int freq[] = new int[101];
        for (int n: nums) {
            ans += freq[n]++;
        }
        return ans;
    }
}