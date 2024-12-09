class Solution {
    public int longestSubarray(int[] nums) {
        int sum=0;
        int count=0;
        int i=0;
        int j=0;
        int used=0;
        if(nums.length==0)
        return 0;
        while(j<nums.length)
        {
            if(nums[j]==1)
            {
                count++;
            }
            else if(used!=1)
            {
                used=1;
                i=j;
                //count++;            
            }
            else
            {
                count-=i;
                i=count;
                //i--;
                //count++;
            }
            if(count>sum)
            {
                sum=count;
            }
            j++;
        }
        if(used==0)
        return sum-1;
        return sum;
    }
}