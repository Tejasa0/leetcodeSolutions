class Solution {
    public int waysToSplitArray(int[] nums) {
        long preSum=0;
        for(int i=0;i<nums.length;i++)
        {
            preSum+=nums[i];
        }
        int count=0;
        long sum=0;
        for(int i=0;i<nums.length-1;i++)
        {
            sum+=nums[i];
            preSum-=nums[i];
            if(sum>=preSum)
            count++;
        }
        return count;
    }
}