class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=1;
        int j=0;
        int sum=1;
        int sum1=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                sum++;
                //sum1=1;
            }
            else if(nums[i]<nums[i+1])
            {
                sum1++;
            }
            if(ans<sum1 && sum<sum1)
            {
                ans=sum1;
                sum=1;
            }
            else if(ans<sum && sum1<sum)
            {
                ans=sum;
                sum1=1;
            }
            else
            {
                sum=1;
                sum1=1;
            }
    
        }
        return ans;
    }
}