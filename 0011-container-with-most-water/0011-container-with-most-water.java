class Solution {
    public int maxArea(int[] height) {
        int max=0;
        for(int i=0;i<height.length-1;i++)
        {
            for(int j=i+1;j<height.length;j++)
            {
                int h=height[i]>height[j]?height[j]:height[i];
                int temp=h*(j-i);
                if(temp>max)
                max=temp;
            }
        }
        return max;
    }
}