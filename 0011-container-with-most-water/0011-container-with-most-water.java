class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int area = Integer.MIN_VALUE;
        while (i < j) {
            if (height[i] < height[j])
                area = Math.max(area, (j - i) * (height[i++]));
            else
                area = Math.max(area, (j - i) * (height[j--]));
        }
        return area;
    }
}