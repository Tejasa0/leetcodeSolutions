class Solution {
    public boolean check(int[] nums) {
        int startI=0;
        int l=nums.length;
        for(int i=0;i<l-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                startI=i+1;
                break;
            }
        }
        if(startI==0)
        return true;
        if(nums[0]<nums[l-1])
        return false;
        for(int i=0;i<startI-1;i++)
        {
            if(nums[i]>nums[i+1])
            return false;
        }
        for(int i=startI;i<l-1;i++)
        {
            if(nums[i]>nums[i+1])
            return false;
        }
        return true;
    }
}