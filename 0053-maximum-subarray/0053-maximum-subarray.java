class Solution {
    public int maxSubArray(int[] nums) {
        int sum;
        int i=0;
        int j=i+1;
        int max=nums[i];
        sum=nums[i];
        while(j<nums.length)
        {
            if(i!=j && nums[i]<0)
            {
                sum-=nums[i];
                i++;
            }
            if(sum+nums[j]<0)
            {
                sum=0;
                i=j;
            }
            sum+=nums[j];
            if(sum>max)
            max=sum;
            j++;
        }
        return max;
    }
}