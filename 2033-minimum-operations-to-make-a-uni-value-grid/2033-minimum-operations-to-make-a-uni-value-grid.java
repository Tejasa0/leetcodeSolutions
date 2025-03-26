class Solution {

    public int minOperations(int[][] grid, int x) {
        
        ArrayList<Integer> nums = new ArrayList<>();
        int minOps = Integer.MAX_VALUE;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] % x != grid[0][0] % x) return -1;
                nums.add(grid[r][c]);
            }
        }

        Collections.sort(nums);

        int n = nums.size();
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums.get(i - 1);
        }

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums.get(i + 1);
        }

        for (int i = 0; i < n; i++) {
            int left = (nums.get(i) * i - prefix[i]) / x;
            int right = (suffix[i] - nums.get(i) * (n - i - 1)) / x;
            minOps = Math.min(minOps, left + right);
        }

        return minOps;
    }
}
