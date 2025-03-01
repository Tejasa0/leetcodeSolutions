class Solution {
    public int[] applyOperations(int[] nums) {
        int len=nums.length;
        int curr=0;
        int zero=0;
        for(int i=0;i<len-1;i++)
        {
            if(nums[i]!=nums[i+1])
            continue;
            nums[i]*=2;
            nums[i+1]=0;
        
        }
        for(int i=0;i<len;i++)
        {
            while(zero<len && nums[zero]!=0)
                zero++;
            if(zero<i && nums[i]!=0)
            {
                
                nums[zero]=nums[i];
                nums[i]=0;
                
            }
        }

        // 1 2 2 1 1 0
        return nums;
        // 1 4 0 2 0 0
    }
}