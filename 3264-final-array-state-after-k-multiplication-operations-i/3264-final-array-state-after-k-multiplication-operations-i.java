class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k>0)
        {
            int idx=-1;
            int small=Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]<small)
                {
                    small=nums[i];
                    idx=i;
                }
            }
            nums[idx]=nums[idx]*multiplier;
            k--;
        }
        return nums;
    }
}