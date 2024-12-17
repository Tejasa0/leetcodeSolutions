class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>li=new ArrayList<>();
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
                if(sum<0)
                {    
                    sec++;
                }
                else if(sum>0)
                {
                    third--;
                }
                else
                {
                    li.add(Arrays.asList(nums[i],nums[sec],nums[third]));
                    sec++;
                    while(sec<third && nums[sec]==nums[sec-1])
                    {
                        sec++;
                    }
                }
            }
        }
        return li;
    }
}