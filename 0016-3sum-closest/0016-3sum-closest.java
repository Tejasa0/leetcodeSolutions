class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int max=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int sec=i+1;
            int third=nums.length-1;
            while(sec<third)
            {
                int sum=nums[i]+nums[sec]+nums[third];
                if(Math.abs(sum-target)<Math.abs(max-target))
                max=sum;
                if(sum<target)
                {    
                    sec++;
                }
                else if(sum>target)
                {
                    third--;
                }
                else
                {
                    return sum;
                }
            }
        }
        return max;
    }
}