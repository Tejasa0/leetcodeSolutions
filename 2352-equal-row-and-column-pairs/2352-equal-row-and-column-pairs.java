class Solution {
    public int equalPairs(int[][] grid) {
        int ans = 0;
        Map<List<Integer>, Integer> map = new HashMap<>();
        for (int[] row : grid) {
            List<Integer> rowList = new ArrayList<>();
            for (int num : row) {
                rowList.add(num);
            }
            map.put(rowList, map.getOrDefault(rowList, 0) + 1);
        }
        for (int i = 0; i < grid[0].length; i++) {
            List<Integer> colList = new ArrayList<>();
            for (int[] row : grid) {
                colList.add(row[i]);
            }
            ans += map.getOrDefault(colList, 0);
        }
        return ans;
    }
}