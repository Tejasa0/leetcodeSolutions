class Solution {
    public boolean search(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
            int k=i+ (j-i)/2;
            if(nums[k]==target)
            return true;
            if(nums[i]==nums[k] && nums[k]==nums[j])
            {
                i=i+1;
                j=j-1;
                continue;
            }
            else if(nums[k]>=nums[i])
            {
                if(nums[i]<=target && target<=nums[k])
                j=k-1;
                else
                i=k+1;
            }
            else
            {
                if(nums[k]<=target && target<=nums[j])
                i=k+1;
                else
                j=k-1;
            }
        }
        return false;
    }
}