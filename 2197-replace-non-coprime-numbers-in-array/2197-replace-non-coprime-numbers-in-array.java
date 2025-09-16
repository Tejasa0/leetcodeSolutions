class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            while (!ans.isEmpty()) {
                int top = ans.get(ans.size() - 1);
                int g = gcd(top, num);
                if (g == 1) {
                    break;
                }
                ans.remove(ans.size() - 1);
                num = (top / g) * num;
            }
            ans.add(num);
        }

        return ans;
    }
    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}