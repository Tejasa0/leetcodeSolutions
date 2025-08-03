class Solution {
    public int count(int fruits[][], int startPos, int right, int left) {

        return (Math.min(Math.abs(startPos - fruits[right][0]), Math.abs(startPos - fruits[left][0])) + fruits[right][0]
                - fruits[left][0]);
    }

    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int max = 0;
        int left = 0;
        int n = fruits.length;
        int total = 0;
        for (int right = 0; right < n; right++) {
            total += fruits[right][1];
            while (left <= right && count(fruits, startPos, right, left) > k)
                total -= fruits[left++][1];
            max = Math.max(max, total);
        }
        return max;
    }
}