class Solution {
    public int fib(int n) {
        List<Integer> li = new ArrayList<>();
        if (n < 2)
            return n;
        li.add(0);
        li.add(1);
        for (int i = 2; i <= n; i++) {
            li.add(li.get(i - 1) + li.get(i - 2));
        }
        return li.get(li.size() - 1);
    }
}