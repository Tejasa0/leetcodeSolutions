class Solution {
    public String triangleType(int[] nums) {
        int c = Math.max(nums[0], Math.max(nums[1], nums[2]));
        int a = Math.min(nums[0], Math.min(nums[1], nums[2]));
        int b;
        if (nums[0] != a && nums[0] != c)
            b = nums[0];
        else if (nums[1] != c && nums[1] != a)
            b = nums[1];
        else
            b = nums[2];
        if (a + b <= c)
            return "none";
        if (a == b && b == c)
            return "equilateral";
        else if (a == b || a == c || b == c)
            return "isosceles";
        return "scalene";
    }
}