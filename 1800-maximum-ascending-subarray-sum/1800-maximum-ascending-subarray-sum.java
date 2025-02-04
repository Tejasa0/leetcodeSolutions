class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0];
        int curr=nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]>nums[i])
            {
                curr+=nums[i+1];
            }
            else
            {
                if(curr>sum)
                sum=curr;
                curr=nums[i+1];
            }
        }
        if(curr>sum)
        sum=curr;
        return sum;

    }
}