class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length>2)
        {
            for(int i=0;i<nums.length-2;i++)
            {
                if(nums[i+1]>nums[i] && nums[i+1]>nums[i+2])
                return i+1;
            }
            if(nums[nums.length-1]>nums[nums.length-2])
                return nums.length-1;
        }
        if(nums.length==2 && nums[1]>nums[0])
         return 1;
        
        // 
        return 0;
    }
}