class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 1; i < 10; i++) {
            backTrack(i, 0, k, set, 0, new ArrayList<>(), n);
        }
        return new ArrayList<>(set);
    }

    public void backTrack(int index, int sum, int k, Set<List<Integer>> set, int count, List<Integer> li, int n) {
        if (count == k) {
            if (sum == n) {
                set.add(new ArrayList<>(li));
            }
            return;
        }

        if (sum > n || index > 9) return;

        li.add(index);
        backTrack(index + 1, sum + index, k, set, count + 1, li, n);
        li.remove(li.size() - 1); 
        backTrack(index + 1, sum, k, set, count, li, n);
    }
}
