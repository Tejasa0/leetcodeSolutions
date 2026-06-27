class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>li=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            continue;
            int firstIndex=i+1;
            int secondIndex=nums.length-1;
            while(firstIndex<secondIndex)
            {
                int sum=nums[firstIndex]+nums[secondIndex]+nums[i];
                if(sum==0)
                {
                    li.add(Arrays.asList(nums[i],nums[firstIndex],nums[secondIndex]));
                    while(firstIndex<secondIndex && nums[firstIndex]==nums[firstIndex+1])
                        firstIndex++;
                    firstIndex++;
                }
                else if(sum<0)
                firstIndex++;
                else
                secondIndex--;
            }
        }
        return li;
    }
}